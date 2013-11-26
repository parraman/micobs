/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.xtext;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterCCR;
import es.uah.aut.srg.micobs.common.MParameterCOR;
import es.uah.aut.srg.micobs.common.MParameterOCR;
import es.uah.aut.srg.micobs.common.MParameterOOR;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.encoder.impl.LibraryEncoder;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.IMICOBSUtil;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Generic MICOBS java validator for Xtext models. Includes checking functions
 * for the common model elements.
 *
 */
public abstract class MICOBSAbstractJavaValidator extends AbstractDeclarativeValidator {
	
	public abstract ILibraryManager getFileLibraryManager()
			throws LibraryManagerException;

	public abstract Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException;
	
	public static final String MISSING_PACKAGE_IMPORT = "100";
	
	@Inject
	protected IMICOBSUtil util;
	
	/**
	 * Checks that all the packages of the elements and objects referenced
	 * by a given package are included in the list of imported packages.
	 * 
	 * If a package is missing, it will throw an error and suggest a
	 * quickfix via 
	 * {@link MICOBSQuickFixProvider#missingPackageImport}
	 * 
	 * @param element the element to check.
	 */
	@Check
	void checkImportedPackages(MCommonPackageElement element)
	{
		MCommonPackageFile file = (MCommonPackageFile) element.eContainer();
		Collection<MCommonPackageElement> referencedElements = LibraryEncoder.getReferencedElements(element);
		
		for (MCommonPackageElement ref : referencedElements)
		{
			MCommonPackageFile refFile = (MCommonPackageFile) ref.eContainer();
			if (refFile.getPackage() != file.getPackage() &&
				file.getImports().contains(refFile.getPackage()) == false)
			{
				error("Missing package '" + refFile.getPackage().getUri() + "' that contains the element " +
					  MICOBSStringHelper.getInstance().getElementName(ref), 
					  file, commonPackage.eINSTANCE.getMCommonPackageFile_Imports(), -1,
					  MISSING_PACKAGE_IMPORT,refFile.getPackage().getUri()); 
			}
		}
	}
	
	/**
	 * Checks that there are no duplicated imported packages.
	 * 
	 * @param file the package file to check.
	 */
	@Check 
	void checkDuplicatedNamesOnImportedPackages(MCommonPackageFile file)
	{
		if (file.getImports().isEmpty())
		{
			return;
		}
		
		MCommonPackage pack = file.getPackage();
		
		// First we have to check the file's package with the imported ones
		
		int count = 0;
		for (MCommonPackage imp : file.getImports())
		{
			if (pack.eClass() == imp.eClass())
			{
				// If the classes are equal, then we can start talking
				
				EClass libraryItemClasses[] = null;
				try {
					libraryItemClasses = getFileLibraryManager().getLibraryElementClasses();
				} catch (LibraryManagerException e) {
					MICOBSPlugin.INSTANCE.log(e);
					return;
				}
				for (int i = 0; i < libraryItemClasses.length; i++)
				{
					List<MCommonPackageElement> packElements = null;
					List<MCommonPackageElement> impElements = null;
					try {
						packElements = getFileLibraryManager()
								.getElementsOfClass(pack, libraryItemClasses[i]);
						impElements = getFileLibraryManager()
								.getElementsOfClass(imp, libraryItemClasses[i]);
					} catch (LibraryManagerException e) {
						MICOBSPlugin.INSTANCE.log(e);
						return;
					}
					if (packElements.size() == 0 || impElements.size() == 0)
					{
						continue;
					}
					for (int j = 0; 
						 j < (packElements.size() < impElements.size() ? packElements.size() : impElements.size());
						 j++)
					{
						if (StringHelper.toLowerDefString(MICOBSStringHelper.getInstance().getElementName(packElements.get(j)))
							.compareTo(StringHelper.toLowerDefString(MICOBSStringHelper.getInstance().getElementName(impElements.get(j)))) == 0)
						{
							error("Duplicated element " + packElements.get(j).eClass().getName() + " " +
									MICOBSStringHelper.getInstance().getElementName(packElements.get(j)) +
									" in packages " + pack.getUri() + " and " + imp.getUri(),
								  file, commonPackage.eINSTANCE.getMCommonPackageFile_Imports(), count);
						}
					}
				}
			}
			count++;
		}
		
		// Now we have to compare the imported packages between themselves
		
		count = 0;
		for (int i = 0; i < file.getImports().size() - 1; i++)
		{
			pack = file.getImports().get(i);
			MCommonPackage imp = file.getImports().get(i+1);
			if (pack.eClass() == imp.eClass())
			{
				// If the classes are equal, then we can start talking
				
				EClass libraryItemClasses[] = null;
				try {
					for (ILibraryManager m : getImportLibraryManagers())
					{
						if (m.getLibraryClass() == pack.eContainer().eClass())
						{
							libraryItemClasses = getFileLibraryManager().getLibraryElementClasses();						
						}
					}
				} catch (LibraryManagerException e) {
					MICOBSPlugin.INSTANCE.log(e);
					return;
				}
				if (libraryItemClasses == null)
				{
					return;
				}
				for (int j = 0; j < libraryItemClasses.length; j++)
				{
					List<MCommonPackageElement> packElements = null;
					List<MCommonPackageElement> impElements = null;
					try {
						packElements = getFileLibraryManager()
								.getElementsOfClass(pack, libraryItemClasses[j]);
						impElements = getFileLibraryManager()
								.getElementsOfClass(imp, libraryItemClasses[j]);
					} catch (LibraryManagerException e) {
						MICOBSPlugin.INSTANCE.log(e);
						return;
					}
					if (packElements.size() == 0 || impElements.size() == 0)
					{
						continue;
					}
					for (int k = 0; 
						 k < (packElements.size() < impElements.size() ? packElements.size() : impElements.size());
						 k++)
					{
						if (MICOBSStringHelper.getInstance().getElementName(packElements.get(k))
							.compareTo(MICOBSStringHelper.getInstance().getElementName(impElements.get(k))) == 0)
						{
							error("Duplicated element name " + packElements.get(k).eClass().getName() + " " +
									MICOBSStringHelper.getInstance().getElementName(packElements.get(k)) +
									" in packages " + pack.getUri() + " and " + imp.getUri(),
								  file, commonPackage.eINSTANCE.getMCommonPackageFile_Imports(), count);
						}
					}
				}
			}
			count++;
		}
 
	}
	
	/**
	 * Checks that no assignment can be done to a constant parameter.
	 * @param pva
	 */
	@Check
	void checkMParameterValueAssignment_ParameterNotConstant(MParameterValueAssignment pva)
	{
		if (pva.getParameter().isConstant())
		{
			error("Parameter " + pva.getParameter().getName() + " is constant and cannot be assigned a value",
					pva, commonPackage.eINSTANCE.getMParameterValueAssignment_Parameter(), -1);
		}
	}

	/**
	 * Checks that there are no duplicated literals in an enumerated
	 * configuration parameter definition.
	 * 
	 * @param enumDef The enumerated configuration parameter to check.
	 */
	@Check
	void checkMEnumParameterDefinition_DuplicatedLiterals(MEnumParameterDefinition enumDef)
	{
		if (!enumDef.getLiterals().isEmpty())
		{
			Set<String> names = new HashSet<String>();
			int i = 0;
			for (MEnumParameterLiteral literal : enumDef.getLiterals())
			{
				if (names.add(StringHelper.toLowerDefString(literal.getName())) == false)
				{
					error("Duplicated literal name: " + 
					      literal.getName(),
					      commonPackage.eINSTANCE.getMEnumParameterDefinition_Literals(), i);
				}
				i++;
			}
		}
	}
	
	/**
	 * Checks that a boolean expression is correct.
	 * 
	 * @param expression the expression.
	 * @param resolver the resolver that maps the possible parameters
	 *        referenced by the expression.
	 * @return <code>true</code> if the expression is correct, <code>false</code> otherwise.
	 */
	protected boolean checkBooleanParameterExpression(MParameterValueExpression expression, 
			IParameterAssignmentResolver resolver)
	{
		try {
			util.parseBooleanExpression(expression, resolver);
		} catch (IllegalArgumentException e)
		{
			error(e.getMessage(), expression,
				  commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		}
		return true;
	}
	
	/**
	 * Checks that a string expression is correct.
	 * 
	 * @param expression the expression.
	 * @param resolver the resolver that maps the possible parameters
	 *        referenced by the expression.
	 * @return <code>true</code> if the expression is correct, <code>false</code> otherwise.
	 */
	protected boolean checkStringParameterExpression(MParameterValueExpression expression, 
			IParameterAssignmentResolver resolver)
	{
		try {
			util.parseStringExpression(expression, resolver);
		} catch (IllegalArgumentException e)
		{
			error(e.getMessage(), expression,
			      commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		}
		return true;
	}
	
	/**
	 * Checks that a enumerated expression is correct.
	 * 
	 * @param expression the expression.
	 * @param resolver the resolver that maps the possible parameters
	 *        referenced by the expression.
	 * @return <code>true</code> if the expression is correct, <code>false</code> otherwise.
	 */
	protected boolean checkEnumParameterExpression(MParameterValueExpression expression, 
			IParameterAssignmentResolver resolver)
	{
		try {
			util.parseEnumExpression(expression, resolver);
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),expression,
					commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		} catch (IllegalArgumentException e)
		{
			error(e.getMessage(), expression,
					commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		}
		return true;
	}

	
	/**
	 * Checks an integer expression against the range defined by an integer
	 * parameter.
	 * 
	 * @param integerParam the integer parameter.
	 * @param expression the expression.
	 * @param resolver the resolver that maps the possible parameters
	 *        referenced by the expression.
	 * @return <code>true</code> if the expression is correct, <code>false</code> otherwise.
	 */
	protected boolean checkIntegerParameterLimits(MParameterRange range, 
			MParameterValueExpression expression, 
			IParameterAssignmentResolver resolver)
	{
		Long value;
		
		try {
			value = util.parseIntegerExpression(expression, resolver);
		} catch (NumberFormatException e)
		{
			error(e.getMessage(), expression,
					commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),  expression,
					commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		}
		
		if (range != null)
		{
			Long lowerBound, upperBound;
			
			try {
				lowerBound = util.parseIntegerExpression(range.getLowerValue(), resolver);
				upperBound = util.parseIntegerExpression(range.getUpperValue(), resolver);
			} catch (NumberFormatException e)
			{
				error(e.getMessage(), expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
				return false;
			}  catch (IllegalArgumentException e)
			{
				error(e.getMessage(), expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
				return false;
			}
			
			if (range instanceof MParameterOCR)
			{					
				if (value <= lowerBound)
				{
					error("Value below or equal to lower limit (" + 
							value +
							" <= " + lowerBound + ")", expression, 
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
					return false;
				}
				else if (value > upperBound)
				{
					error("Value above upper limit (" + 
							value +
							" > " + upperBound + ")", expression, 
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);			
					return false;
				}
			}
			else if (range instanceof MParameterCCR)
			{
				if (value < lowerBound)
				{
					error("Value below lower limit (" + 
							value +
						" < " + lowerBound + ")", expression, 
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);	
					return false;

				}
				else if (value > upperBound)
				{
					error("Value above upper limit (" + 
							value +
							" > " + upperBound + ")", expression, 
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);	
					return false;
				}					
			}
			else if (range instanceof MParameterCOR)
			{
				if (value < lowerBound)
				{
					error("Value below lower limit (" + 
							value +
						" < " + lowerBound + ")", expression, 
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
					return false;
				}
				else if (value >= upperBound)
				{
					error("Value above or equal to upper limit (" + 
							value +
							" >= " + upperBound + ")", expression, 
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);					
					return false;
				}					
			}
			else if (range instanceof MParameterOOR)
			{
				if (value <= lowerBound)
				{
					error("Value below or equal to lower limit (" + 
							value +
							" <= " + lowerBound + ")", expression, 
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
					return false;
				}
				else if (value >= upperBound)
				{
					error("Value above or equal upper limit (" + 
							value +
							" >= " + upperBound + ")", expression, 
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);						
					return false;
				}					
			}
		}
		return true;
	}

	/**
	 * Checks a real expression against the range defined by a real parameter.
	 * 
	 * @param realParam the real parameter.
	 * @param expression the expression.
	 * @param resolver the resolver that maps the possible parameters
	 *        referenced by the expression.
	 * @return <code>true</code> if the expression is correct, <code>false</code> otherwise.
	 */
	protected boolean checkRealParameterLimits(MParameterRange range, 
			MParameterValueExpression expression, 
			IParameterAssignmentResolver resolver)
	{
		float value;
		
		try {
			value = util.parseIntegerExpression(expression, resolver);
		} catch (NumberFormatException e)
		{
			error(e.getMessage(), expression,
					commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		} catch (IllegalArgumentException e)
		{
			error(e.getMessage(), expression,
					commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
			return false;
		}
		
		if (range != null)
		{
			float lowerBound, upperBound;
			
			try {
				lowerBound = util.parseRealExpression(range.getLowerValue(), resolver);
				upperBound = util.parseRealExpression(range.getUpperValue(), resolver);
			} catch (NumberFormatException e)
			{
				error(e.getMessage(), expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
				return false;
			} catch (IllegalArgumentException e)
			{
				error(e.getMessage(), expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
				return false;
			}
		
			if (range instanceof MParameterOCR)
			{
				if (value <= lowerBound)
				{
					error("Default value below or equal to lower limit (" + 
							value +
						" <= " + lowerBound + ")", expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
					return false;
				}
				else if (value > upperBound)
				{
					error("Default value above upper limit (" + 
							value +
						" > " + upperBound + ")", expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);		
					return false;
				}
			}
			else if (range instanceof MParameterCCR)
			{
				if (value < lowerBound)
				{
					error("Default value below lower limit (" + 
							value +
							" < " + lowerBound + ")", expression,
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
					return false;
				}
				else if (value > upperBound)
				{	
					error("Default value above upper limit (" + 
							value +
						" > " + upperBound + ")", expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);					
					return false;
				}					
			}
			else if (range instanceof MParameterCOR)
			{
				if (value < lowerBound)
				{
					error("Default value below lower limit (" + 
							value +
							" < " + lowerBound + ")", expression,
							commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
					return false;
				}
				else if (value >= upperBound)
				{
					error("Default value above or equal to upper limit (" + 
							value +
						" >= " + upperBound + ")", expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);				
					return false;
				}					
			}
			else if (range instanceof MParameterOOR)
			{
				if (value <= lowerBound)
				{
					error("Default value below or equal to lower limit (" + 
							value +
						" <= " + lowerBound + ")", expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);
					return false;
				}
				else if (value >= upperBound)
				{
					error("Default value above or equal upper limit (" + 
							value +
						" >= " + upperBound + ")", expression,
						commonPackage.eINSTANCE.getMParameterValueExpression_Left(), -1);						
					return false;
				}					
			}	
		}
		return true;
	}
	
	/**
	 * Helper function that checks a collection of parameter value assignments.
	 * 
	 * This collection is provided as a map between the parameters and their
	 * assignments.
	 * 
	 * @param assignments the map between the parameters and their assignment
	 * expressions.
	 */
	protected void checkParameterValueAssignments(final Map<MParameter, MParameterValueAssignment> assignments)
	{
		// We have to check all the parameters

		for (final MParameter parameter : assignments.keySet())
		{
			IParameterAssignmentResolver resolver = new IParameterAssignmentResolver() {

				@Override
				public MParameter getParameter() {
					return parameter;
				}

				@Override
				public MParameterValueExpression getAssignmentExpression(
						MParameter parameter) {
					return (assignments.get(parameter) == null) ? null : 
						util.getParameterValue(assignments.get(parameter));
				}
			};

			if (parameter instanceof MBooleanParameter)
			{
				if (!checkBooleanParameterExpression(util.getParameterValue(assignments.get(parameter)), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MStringParameter)
			{
				if (!checkStringParameterExpression(util.getParameterValue(assignments.get(parameter)), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MIntegerParameter)
			{
				if (!checkIntegerParameterLimits(util.getRange(parameter), 
						util.getParameterValue(assignments.get(parameter)), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MRealParameter)
			{
				if (!checkRealParameterLimits(util.getRange(parameter), 
						util.getParameterValue(assignments.get(parameter)), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MEnumParameter)
			{
				if (!checkEnumParameterExpression(util.getParameterValue(assignments.get(parameter)), resolver))
				{
					break;
				}
			}
		}

	}
	
	/**
	 * Helper function that checks a collection of parameter default values.
	 * Apart from the set of parameters, the method receives an optional
	 * mapping between parameters that might eventually be referenced in
	 * the definition of the default values and their corresponding assignments.
	 * 
	 * @param parameters the set of parameters to check.
	 * @param assignments the map between the parameters and their assignment
	 * expressions.
	 */
	protected void checkParameterDefaultValues(Set<MParameter> parameters)
	{
		// We have to check all the parameters

		for (final MParameter parameter : parameters)
		{
			IParameterAssignmentResolver resolver = new IParameterAssignmentResolver() {

				@Override
				public MParameter getParameter() {
					return parameter;
				}

				@Override
				public MParameterValueExpression getAssignmentExpression(
						MParameter parameter) {
					return null;
				}
			};

			if (parameter instanceof MBooleanParameter)
			{
				if (!checkBooleanParameterExpression(util.getDefaultValue(parameter), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MStringParameter)
			{
				if (!checkStringParameterExpression(util.getDefaultValue(parameter), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MIntegerParameter)
			{
				if (!checkIntegerParameterLimits(util.getRange(parameter), 
						util.getDefaultValue(parameter), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MRealParameter)
			{
				if (!checkRealParameterLimits(util.getRange(parameter), 
						util.getDefaultValue(parameter), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MEnumParameter)
			{
				if (!checkEnumParameterExpression(util.getDefaultValue(parameter), resolver))
				{
					break;
				}
			}
		}

	}

}
