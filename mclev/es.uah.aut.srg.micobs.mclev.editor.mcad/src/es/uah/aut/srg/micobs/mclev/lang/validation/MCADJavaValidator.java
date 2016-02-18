/*******************************************************************************
 * Copyright (c) 2013-2015 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mclev.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapter;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.checkers.IDeploymentChecker;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class MCADJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevmcad"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevcommon"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/pdl"));
		return result;
	}
	
	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MCLEVLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	/**
	 * This function executes the extended restrictions to a deployment model
	 * that are defined by the corresponding domain. Their source object is
	 * obtained through the installed adapter that implements the extended
	 * interface.
	 * 
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMCADeployment_extendedRestrictions(MMCADeployment deployment)
	{
		if (deployment.getDomain() == null ||
			deployment.getDomain().eIsProxy() == true)
		{
			return;
		}
		DomainAdapter adapter = DomainAdapterFactory.getAdapterFactory().getAdapter(deployment.getDomain());
		
		if (adapter != null && 
			adapter.isAdapterForType(IDeploymentChecker.class))
		{
			IDeploymentChecker checker = (IDeploymentChecker) adapter.adapt(IDeploymentChecker.class);
			if (checker == null)
			{
				return;
			}
			
			CheckingDiagnostic diagnostic = checker.instanceChecking(deployment);
			if (diagnostic.isWarning())
			{
				warning(diagnostic.getMessage(), diagnostic.getFeature());
			}
			else if (diagnostic.isError())
			{
				error(diagnostic.getMessage(), diagnostic.getFeature());
			}
				
			diagnostic = checker.connectionChecking(deployment);
			if (diagnostic.isWarning())
			{
				warning(diagnostic.getMessage(), diagnostic.getFeature());
			}
			else if (diagnostic.isError())
			{
				error(diagnostic.getMessage(), diagnostic.getFeature());
			}
			
			diagnostic = checker.validateDeployment(deployment);
			if (diagnostic.isWarning())
			{
				warning(diagnostic.getMessage(), diagnostic.getFeature());
			}
			else if (diagnostic.isError())
			{
				error(diagnostic.getMessage(), diagnostic.getFeature());
			}
		}
	}
	
	/**
	 * Parameterized Restriction 197-198. Checks that the types of the client and
	 * source ports of an common component connection are supported by the
	 * selected connector.
	 * @param ccnx the internal component connection.
	 */
	public void checkMCommonConnection_ConnectorSupport(MCommonConnection ccnx)
	{
		if (ccnx.getClientPort() == null ||
			ccnx.getClientPort().eIsProxy() == true ||
			ccnx.getServerPort() == null ||
			ccnx.getServerPort().eIsProxy() == true ||
			ccnx.getConnector() == null ||
			ccnx.getConnector().eIsProxy() == true)
		{
			return;
		}
		boolean found = false;
		for (MPortType ptype : MCLEVUtil.getDefault().getAllClientPortTypes(ccnx.getConnector()))
		{
			if (ptype == ccnx.getClientPort().getType() ||
				MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(ccnx.getClientPort().getType()))
			{
				found = true;
				break;
			}
		}
		if (found == false)
		{
			error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ccnx.getClientPort().getType()) +
				  " in a client role is not supported by the connector " +
				  MCLEVStringHelper.getDefault().getFullObjectNameToElement(ccnx.getConnector()),
				  mclevmcadPackage.eINSTANCE.getMCommonConnection_Connector());
		}
		
		found = false;
		for (MPortType ptype : MCLEVUtil.getDefault().getAllServerPortTypes(ccnx.getConnector()))
		{
			if (ptype == ccnx.getServerPort().getType() ||
				MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(ccnx.getServerPort().getType()))
			{
				found = true;
				break;
			}
		}
		if (found == false)
		{
			error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ccnx.getServerPort().getType()) +
				  " in a server role is not supported by the connector " +
				  MCLEVStringHelper.getDefault().getFullObjectNameToElement(ccnx.getConnector()),
				  mclevmcadPackage.eINSTANCE.getMCommonConnection_Connector());
		}
		
	}
	
	
	/**
	 * Parameterized Restriction 199-200. Checks that the types of the client and
	 * source ports of an internal component platform switch connection are
	 * supported by the selected connector.
	 * @param csw the internal component connection.
	 */
	public void checkMConnectionSwitch_ConnectorSupport(MConnectionSwitch csw)
	{
		if (csw.getClientPort() != null &&
			csw.getClientPort().eIsProxy() == false)
		{
			for (MConnectionSwitchCase pcase : csw.getCases())
			{
				if (pcase.getServerPort() == null ||
					pcase.getServerPort().eIsProxy() == true ||
					pcase.getConnector() == null ||
					pcase.getConnector().eIsProxy() == true)
				{
					continue;
				}
				
				boolean found = false;
				for (MPortType ptype : MCLEVUtil.getDefault().getAllClientPortTypes(pcase.getConnector()))
				{
					if (ptype == csw.getClientPort().getType() ||
						MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(csw.getClientPort().getType()))
					{
						found = true;
						break;
					}
				}
				if (found == false)
				{
					error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(csw.getClientPort().getType()) +
						  " in a client role is not supported by the connector " +
						  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pcase.getConnector()),
						  pcase,
						  mclevmcadPackage.eINSTANCE.getMConnectionSwitchCase_Connector(), -1);
				}
				
				found = false;
				for (MPortType ptype : MCLEVUtil.getDefault().getAllServerPortTypes(pcase.getConnector()))
				{
					if (ptype == pcase.getServerPort().getType() ||
						MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(pcase.getServerPort().getType()))
					{
						found = true;
						break;
					}
				}
				if (found == false)
				{
					error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(pcase.getServerPort().getType()) +
						  " in a server role is not supported by the connector " +
						  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pcase.getConnector()),
						  pcase,
						  mclevmcadPackage.eINSTANCE.getMConnectionSwitchCase_Connector(), -1);
				}
			}
		}
	}
	
	/**
	 * Parameterized Restriction 201. Checks that the component instances
	 * deployed in an MCAD model are consistent with the restrictions
	 * eventually defined by the domain to which the deployment belongs.
	 */
	@Check
	public void checkMMCADeployment_InstanceComponentType(MMCADeployment deployment)
	{
		if (deployment.getDomain() == null ||
			deployment.getDomain().eIsProxy() == true)
		{
			return;
		}
		
		final Map<MParameter, MParameterValueAssignment> assignments = new HashMap<MParameter, MParameterValueAssignment>();

		for (MParameterValueAssignment va : deployment.getAttributeValueAssignments())
		{
			assignments.put(va.getParameter(), va);
		}
		
		IParameterAssignmentResolver resolver = new IParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (assignments.get(parameter) == null) ? null :
						util.getParameterValue(assignments.get(parameter));
			}
		};
					
		if (deployment.getDeploymentAlternatives().isEmpty() == true)
		{
			Map<MComponentType, Integer> occurrences = new HashMap<MComponentType, Integer>();

			for (MComponentInstance inst : deployment.getComponents())
			{
				if (inst.getComponent() == null ||
					inst.getComponent().eIsProxy() == true)
				{
					continue;
				}
				for (MComponentType ctype : MCLEVUtil.getDefault().getInheritedComponentTypes(inst.getComponent().getType()))
				{
					Integer times = occurrences.get(ctype);
					if (times == null)
					{
						times = new Integer(1);
					}
					else
					{
						times++;
					}
					occurrences.put(ctype, times);
				}
				Integer times = occurrences.get(inst.getComponent().getType());
				if (times == null)
				{
					times = new Integer(1);
				}
				else
				{
					times++;
				}
				occurrences.put(inst.getComponent().getType(), times);
			}

			for (MComponentType ctype : MCLEVUtil.getDefault().getAllComponentTypeInstances(deployment.getDomain()).keySet())
			{
				Integer times;
				Long lowerBound, upperBound;
				
				MComponentTypeInstance cti = MCLEVUtil.getDefault().getAllComponentTypeInstances(deployment.getDomain()).get(ctype);

				try {
					lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getLowerBound(), resolver);
					upperBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getUpperBound(), resolver);
				} catch (NumberFormatException e)
				{
					error(e.getMessage(), deployment,
							mclevmcadPackage.eINSTANCE.getMMCADeployment_Components(), -1);
					return;
				}  catch (IllegalArgumentException e)
				{
					error(e.getMessage(), deployment,
							mclevmcadPackage.eINSTANCE.getMMCADeployment_Components(), -1);
					return;
				}

				
				if ((times = occurrences.get(ctype)) != null)
				{
					if (times < lowerBound)
					{
						error("Number of instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
							  " must be at least " + cti.getLowerBound(), deployment,
								mclevmcadPackage.eINSTANCE.getMMCADeployment_Components(), -1);
					}
					else if (upperBound != -1 && times > upperBound)
					{
						error("Number of instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
							  " exceeded", deployment,
								mclevmcadPackage.eINSTANCE.getMMCADeployment_Components(), -1);
					}
				}
				else
				{
					if (lowerBound > 0)
					{
						error("Number of instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
							  " must be at least " + cti.getLowerBound(), deployment,
								mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), -1);
					}
				}					
			}
		}
		else
		{
			for (MDeploymentAlternative lda : MCLEVUtil.getDefault().getLeafDeploymentAlternatives(deployment))
			{
				Map<MComponentType, Integer> occurrences = new HashMap<MComponentType, Integer>();

				for (MComponentInstance inst : MCLEVUtil.getDefault().getAllComponentInstances(lda))
				{
					if (inst.getComponent() == null ||
						inst.getComponent().eIsProxy() == true)
					{
						continue;
					}
					for (MComponentType ctype : MCLEVUtil.getDefault().getInheritedComponentTypes(inst.getComponent().getType()))
					{
						Integer times = occurrences.get(ctype);
						if (times == null)
						{
							times = new Integer(1);
						}
						else
						{
							times++;
						}
						occurrences.put(ctype, times);
					}
					Integer times = occurrences.get(inst.getComponent().getType());
					if (times == null)
					{
						times = new Integer(1);
					}
					else
					{
						times++;
					}
					occurrences.put(inst.getComponent().getType(), times);
				}
				
				for (MComponentType ctype : MCLEVUtil.getDefault().getAllComponentTypeInstances(deployment.getDomain()).keySet())
				{
					Integer times;
					Long lowerBound, upperBound;
					
					MComponentTypeInstance cti = MCLEVUtil.getDefault().getAllComponentTypeInstances(deployment.getDomain()).get(ctype);

					try {
						lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getLowerBound(), resolver);
						upperBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getUpperBound(), resolver);
					} catch (NumberFormatException e)
					{
						error(e.getMessage(), lda,
								mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), -1);
						return;
					}  catch (IllegalArgumentException e)
					{
						error(e.getMessage(), lda,
								mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), -1);
						return;
					}

					
					if ((times = occurrences.get(ctype)) != null)
					{
						if (times < lowerBound)
						{
							error("Number of instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
								  " must be at least " + cti.getLowerBound(), lda,
									mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), -1);
						}
						else if (upperBound != -1 && times > upperBound)
						{
							error("Number of instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
								  " exceeded", lda,
									mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), -1);
						}
					}
					else
					{
						if (lowerBound > 0)
						{
							error("Number of instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
								  " must be at least " + cti.getLowerBound(), lda,
									mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), -1);
						}
					}					
				}
			}
		}
	}
	
	/**
	 * Checks that there are not service libraries deployed twice in the root
	 * of an MCAD model.
	 * @param mcad the MCAD model to check.
	 */
	@Check
	public void checkMMCADeployment_DuplicatedServiceLibraries(MMCADeployment mcad)
	{
		Set<MServiceLibrary> libraries = new HashSet<MServiceLibrary>();
		
		int i = 0;
		for (MServiceLibraryInstance slinst : mcad.getLibraries())
		{
			if (slinst.getLibrary() == null ||
				slinst.getLibrary().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (libraries.add(slinst.getLibrary()) == false)
			{
				error("Duplicated service library: " +
					  MCLEVStringHelper.getDefault().getElementName(slinst.getLibrary()), mcad,
					  mclevmcadPackage.eINSTANCE.getMMCADeployment_Libraries(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not service libraries deployed twice in a deployment
	 * alternative.
	 * @param dalt the alternative to check.
	 */
	@Check
	public void checkMDeploymentAlternative_DuplicatedServiceLibraries(MDeploymentAlternative dalt)
	{
		Set<MServiceLibrary> libraries = new HashSet<MServiceLibrary>();
		
		int i = 0;
		for (MServiceLibraryInstance slinst : dalt.getLibraries())
		{
			if (slinst.getLibrary() == null ||
				slinst.getLibrary().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (libraries.add(slinst.getLibrary()) == false)
			{
				error("Duplicated service library: " +
					  MCLEVStringHelper.getDefault().getElementName(slinst.getLibrary()), dalt,
					  mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Libraries(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two deployment platforms with the same name.
	 * Implements Restriction 153.
	 * @param deployment the MCAD model to check.
	 */
	@Check
	public void checkMMCADeployment_DuplicatedPlatformName(MMCADeployment deployment)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MDeploymentPlatform dplt : deployment.getDeploymentPlatforms())
		{
			if (names.add(StringHelper.toLowerDefString(dplt.getName())) == false)
			{
				error("Duplicated platform name: " +
					  dplt.getName(), deployment,
					  mclevmcadPackage.eINSTANCE.getMMCADeployment_DeploymentPlatforms(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two deployment alternatives in the root node
	 * with the same name.
	 * Implements Restriction 154.
	 * @param deployment the MCAD model to check.
	 */
	@Check
	public void checkMMCADeployment_DuplicatedAlternativeName(MMCADeployment deployment)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MDeploymentAlternative alt : deployment.getDeploymentAlternatives())
		{
			if (names.add(StringHelper.toLowerDefString(alt.getName())) == false)
			{
				error("Duplicated alternative name: " +
					  alt.getName(), deployment,
					  mclevmcadPackage.eINSTANCE.getMMCADeployment_DeploymentAlternatives(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two deployment alternatives in a deployment
	 * alternative.
	 * Implements Restriction 154.
	 * @param dalt the deployment alternative to check.
	 */
	@Check
	public void checkMDeploymentAlternative_DuplicatedAlternativeName(MDeploymentAlternative dalt)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MDeploymentAlternative alt : dalt.getDeploymentAlternatives())
		{
			if (names.add(StringHelper.toLowerDefString(alt.getName())) == false)
			{
				error("Duplicated alternative name: " +
					  alt.getName(), dalt,
					  mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_DeploymentAlternatives(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that all the extended libraries are deployed.
	 * Implements Restriction TBD.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMCADeployment_ExtendedPackages(MMCADeployment deployment)
	{
		if (deployment.getDeploymentAlternatives().isEmpty() == true)
		{
			checkExtendedLibraries(deployment.getLibraries());
		}
		else
		{
			for (MDeploymentAlternative alternative : MCLEVUtil.getDefault().getLeafDeploymentAlternatives(deployment))
			{
				checkExtendedLibraries(MCLEVUtil.getDefault().getAllServiceLibraryInstances(alternative));
			}
		}
	}
	
	protected void checkExtendedLibraries(Collection<MServiceLibraryInstance> deployedLibraries)
	{
		Set<MServiceLibrary> libs = new HashSet<MServiceLibrary>();
		
		for (MServiceLibraryInstance swpd : deployedLibraries)
		{
			libs.add(swpd.getLibrary());
		}
		for (MServiceLibraryInstance slinst : deployedLibraries)
		{
			for (MServiceLibrary extended : MCLEVUtil.getDefault().getAllExtendedLibraries(slinst.getLibrary()))
			{
				if (libs.contains(extended) == false)
				{
					error("Service library " + MCLEVStringHelper.getDefault().getElementName(extended) +
						  ", extended by libary " + MCLEVStringHelper.getDefault().getElementName(slinst.getLibrary()) + 
						  ", is not being deployed", 
						  slinst, mclevmcadPackage.eINSTANCE.getMServiceLibraryInstance_Library(), -1);
				}
			}
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same attribute
	 * of a common connection.
	 * Implements Restriction TBC.
	 * @param conn the connection to check.
	 */
	@Check
	public void checkMCommonConnection_DuplicatedAttributeAssignment(MCommonConnection conn)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		int i = 0;
		for (MParameterValueAssignment va : conn.getAttributeValueAssignments())
		{
			if (va.getParameter() == null ||
					va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (attributes.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on parameter: " +
					  MCLEVStringHelper.getDefault().getRelativeObjectName(va.getParameter()),
					  mclevmcadPackage.eINSTANCE.getMCommonConnection_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same attribute
	 * of a component instance.
	 * Implements Restriction TBC.
	 * @param inst the connection to check.
	 */
	@Check
	public void checkMComponentInstance_DuplicatedAttributeAssignment(MComponentInstance inst)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		int i = 0;
		for (MParameterValueAssignment va : inst.getAttributeValueAssignments())
		{
			if (va.getParameter() == null ||
					va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (attributes.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on parameter: " +
					  MCLEVStringHelper.getDefault().getRelativeObjectName(va.getParameter()),
					  mclevmcadPackage.eINSTANCE.getMComponentInstance_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same attribute
	 * of a service library instance.
	 * Implements Restriction TBC.
	 * @param slib the connection to check.
	 */
	@Check
	public void checkMServiceLibraryInstance_DuplicatedAttributeAssignment(MServiceLibraryInstance slib)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		int i = 0;
		for (MParameterValueAssignment va : slib.getAttributeValueAssignments())
		{
			if (va.getParameter() == null ||
					va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (attributes.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on parameter: " +
					  MCLEVStringHelper.getDefault().getRelativeObjectName(va.getParameter()),
					  mclevmcadPackage.eINSTANCE.getMServiceLibraryInstance_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same attribute
	 * of a connection switch case.
	 * Implements Restriction TBC.
	 * @param scase the connection switch case to check.
	 */
	@Check
	public void checkMConnectionSwitchCase_DuplicatedAttributeAssignment(MConnectionSwitchCase scase)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		int i = 0;
		for (MParameterValueAssignment va : scase.getAttributeValueAssignments())
		{
			if (va.getParameter() == null ||
					va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (attributes.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on parameter: " +
					  MCLEVStringHelper.getDefault().getRelativeObjectName(va.getParameter()),
					  mclevmcadPackage.eINSTANCE.getMServiceLibraryInstance_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two instances with the same name on a 
	 * deployment model.
	 * Implements Restriction 169m.
	 * @param instList the MCAD model to check.
	 */
	@Check
	public void checkMMCADeployment_DuplicatedInstanceName(MMCADeployment mcad)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MComponentInstance inst : mcad.getComponents())
		{
			if (names.add(StringHelper.toLowerDefString(inst.getName())) == false)
			{
				error("Duplicated instance name: " +
					  inst.getName(),
					  mclevmcadPackage.eINSTANCE.getMMCADeployment_Components(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two instances with the same name on a 
	 * deployment model.
	 * Implements Restriction 169m.
	 * @param instList the MCAD model to check.
	 */
	@Check
	public void checkMDeploymentAlternative_DuplicatedInstanceName(MDeploymentAlternative mcad)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MComponentInstance inst : mcad.getComponents())
		{
			if (names.add(StringHelper.toLowerDefString(inst.getName())) == false)
			{
				error("Duplicated instance name: " +
					  inst.getName(),
					  mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that the types of the deployed components belong to the selected
	 * domain or to one of the domains from which it inherits.
	 * Implements Restriction 170.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMCADeployment_ComponentTypes(MMCADeployment deployment)
	{
		if (deployment.getDomain() == null ||
			deployment.getDomain().eIsProxy() == true)
		{
			return;
		}
		
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			for (MComponentInstance inst : deployment.getComponents())
			{
				if (inst.getComponent() == null ||
					inst.getComponent().eIsProxy() == true)
				{
					continue;
				}
				if (deployment.getDomain() instanceof MIODomain)
				{
					MIODomain iod = (MIODomain)deployment.getDomain();
					if (MCLEVUtil.getDefault().getAllComponentTypes(iod).contains(inst.getComponent().getType()) == false)
					{
						error("The component type " + inst.getComponent().getType().getName() +
							  " is not supported by the domain " +
							  MCLEVStringHelper.getDefault().getElementName(iod), inst,
							  mclevmcadPackage.eINSTANCE.getMComponentInstance_Component(), -1);
					}
				}
				else
				{
					MAODomain aod = (MAODomain)deployment.getDomain();
					if (MCLEVUtil.getDefault().getAllComponentTypes(aod).contains(inst.getComponent().getType()) == false)
					{
						error("The component type " + inst.getComponent().getType().getName() +
							  " is not supported by the domain " +
							  MCLEVStringHelper.getDefault().getElementName(aod), inst,
							  mclevmcadPackage.eINSTANCE.getMComponentInstance_Component(), -1);
					}
				}
			}
		}
		else
		{
			for (MDeploymentAlternative alternative : MCLEVUtil.getDefault().getLeafDeploymentAlternatives(deployment))
			{
				for (MComponentInstance inst : MCLEVUtil.getDefault().getAllComponentInstances(alternative))
				{
					if (inst.getComponent() == null ||
						inst.getComponent().eIsProxy() == true)
					{
						continue;
					}
					if (deployment.getDomain() instanceof MIODomain)
					{
						MIODomain iod = (MIODomain)deployment.getDomain();
						if (MCLEVUtil.getDefault().getAllComponentTypes(iod).contains(inst.getComponent().getType()) == false)
						{
							error("The component type " + inst.getComponent().getType().getName() +
								  " is not supported by the domain " +
								  MCLEVStringHelper.getDefault().getElementName(iod), inst,
								  mclevmcadPackage.eINSTANCE.getMComponentInstance_Component(), -1);
						}
					}
					else
					{
						MAODomain aod = (MAODomain)deployment.getDomain();
						if (MCLEVUtil.getDefault().getAllComponentTypes(aod).contains(inst.getComponent().getType()) == false)
						{
							error("The component type " + inst.getComponent().getType().getName() +
								  " is not supported by the domain " +
								  MCLEVStringHelper.getDefault().getElementName(aod), inst,
								  mclevmcadPackage.eINSTANCE.getMComponentInstance_Component(), -1);
						}
					}
				}
			}
		}
	}
	
	/**
	 * Checks that the components and service libraries instantiated in the
	 * root a deployment model support all the deployment platforms.
	 * Implements Restriction 171 and 202.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMCADeployment_CmpsAndSLsSupportPlatforms(MMCADeployment deployment)
	{
		int i = 0;
		
		for (MComponentInstance inst : deployment.getComponents())
		{
			if (inst.getComponent() == null ||
				inst.getComponent().eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (MDeploymentPlatform dplt : deployment.getDeploymentPlatforms())
			{
				if (dplt.getPlatform() == null ||
					dplt.getPlatform().eIsProxy() == true)
				{
					continue;
				}
				if (MCLEVUtil.getDefault().supportsPlatform(inst.getComponent(), dplt.getPlatform()) == false)
				{
					error("Component instance " + inst.getName() + " does not support one of the platforms",
							mclevmcadPackage.eINSTANCE.getMMCADeployment_Components(), i);			
				}
			}
			i++;
		}

		i = 0;
		for (MServiceLibraryInstance slinst : deployment.getLibraries())
		{
			if (slinst.getLibrary() == null ||
				slinst.getLibrary().eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (MDeploymentPlatform dplt : deployment.getDeploymentPlatforms())
			{
				if (dplt.getPlatform() == null ||
					dplt.getPlatform().eIsProxy() == true)
				{
					continue;
				}
				if (MCLEVUtil.getDefault().supportsPlatform(slinst.getLibrary(), dplt.getPlatform()) == false)
				{
					error("Service library " + MCLEVStringHelper.getDefault().getElementName(slinst.getLibrary()) +
						  " does not support one of the platforms",
						  mclevmcadPackage.eINSTANCE.getMMCADeployment_Libraries(), i);			
				}
			}
			i++;
		}

	}
	
	/**
	 * Checks that the components instantiated in a deployment alternative
	 * support all the selected deployment platforms.
	 * Implements Restriction 172 and 203.
	 * @param alternative the deployment alternative to check.
	 */
	@Check
	public void checkMDeploymentAlternative_ComponentsSupportPlatforms(MDeploymentAlternative alternative)
	{
		int i = 0;
		
		for (MComponentInstance inst : alternative.getComponents())
		{
			if (inst.getComponent() == null ||
				inst.getComponent().eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (MDeploymentPlatform dplt : alternative.getDeploymentPlatforms())
			{
				if (dplt.getPlatform() == null ||
					dplt.getPlatform().eIsProxy() == true)
				{
					continue;
				}
				if (MCLEVUtil.getDefault().supportsPlatform(inst.getComponent(), dplt.getPlatform()) == false)
				{
					error("Component instance " + inst.getName() + " does not support one of the platforms",
							mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Components(), i);			
				}
			}
			i++;
		}


		i = 0;
		for (MServiceLibraryInstance slinst : alternative.getLibraries())
		{
			if (slinst.getLibrary() == null ||
				slinst.getLibrary().eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (MDeploymentPlatform dplt : alternative.getDeploymentPlatforms())
			{
				if (dplt.getPlatform() == null ||
					dplt.getPlatform().eIsProxy() == true)
				{
					continue;
				}
				if (MCLEVUtil.getDefault().supportsPlatform(slinst.getLibrary(), dplt.getPlatform()) == false)
				{
					error("Service library " + MCLEVStringHelper.getDefault().getElementName(slinst.getLibrary()) +
						  " does not support one of the platforms",
						  mclevmcadPackage.eINSTANCE.getMDeploymentAlternative_Libraries(), i);			
				}
			}
			i++;
		}
	}
	
	
	/**
	 * Checks that the connection is always done between different instances.
	 * Implements restriction 181.
	 * @param connection the connection to check.
	 */
	@Check
	public void checkMCommonConnection_differentInstances(MCommonConnection connection)
	{
		if (connection.getClientInstance() != null &&
			connection.getClientInstance().eIsProxy() == false &&
			connection.getServerInstance() != null &&
			connection.getServerInstance().eIsProxy() == false &&
			connection.getClientInstance() ==
			connection.getServerInstance())
		{
			error("Connections between ports of the same instance are not allowed",
					mclevmcadPackage.eINSTANCE.getMCommonConnection_ClientInstance());
		}
	}

	/**
	 * Checks for the consistency of the connection switches.
	 * Implements restrictions 192 and 193.
	 * @param csw
	 */
	public void checkMConnectionSwitch_wellformed(MConnectionSwitch csw)
	{
		int i = 0;
				
		if (csw.eContainer() instanceof MMCADeployment)
		{
			MMCADeployment deployment = ((MMCADeployment)csw.eContainer());
			
			Set<MDeploymentAlternative> alts = new HashSet<MDeploymentAlternative>();
		
			// First we have to check all the cases and check that they all have a connector defined:
			for (MConnectionSwitchCase cswc : csw.getCases())
			{
				if (alts.add(cswc.getAlternative()) == false)
				{
					error("Duplicated alternative",
						  mclevmcadPackage.eINSTANCE.getMConnectionSwitch_Cases(), i);
				}
				i++;
			}
			
			if (alts.size() != deployment.getDeploymentAlternatives().size())
			{
				error("Missing alternatives in the switch cases",
						mclevmcadPackage.eINSTANCE.getMConnectionSwitch_Cases());
			}
		}
		else
		{
			MDeploymentAlternative alternative = ((MDeploymentAlternative)csw.eContainer());
			
			Set<MDeploymentAlternative> alts = new HashSet<MDeploymentAlternative>();
		
			// First we have to check all the cases and check that they all have a connector defined:
			for (MConnectionSwitchCase cswc : csw.getCases())
			{
				if (alts.add(cswc.getAlternative()) == false)
				{
					error("Duplicated alternative",
						  mclevmcadPackage.eINSTANCE.getMConnectionSwitch_Cases(), i);
				}
				i++;
			}
			
			if (alts.size() != alternative.getDeploymentAlternatives().size())
			{	
				error("Missing alternatives in the switch cases",
						mclevmcadPackage.eINSTANCE.getMConnectionSwitch_Cases());
			}
		}
	}
	
	/**
	 * Checks that the client ports of all the components are connected once
	 * and only once.
	 * Implements restrictions 195 and 196.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMCADeployment_checkDuplicatedClients(MMCADeployment deployment)
	{		
		int i = 0;
		
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			Map<MComponentInstance, Set<MClientPort>> connectedPortsMap = new HashMap<MComponentInstance, Set<MClientPort>>();

			for (MConnection conn : deployment.getConnections())
			{
				if (conn instanceof MCommonConnection)
				{
					MCommonConnection ccnx = (MCommonConnection)conn;
					if (connectedPortsMap.get(ccnx.getClientInstance()) == null)
					{
						connectedPortsMap.put(ccnx.getClientInstance(), new HashSet<MClientPort>());
					}
					Set<MClientPort> cports = connectedPortsMap.get(ccnx.getClientInstance());
					if (cports.add(ccnx.getClientPort()) == false)
					{
						// This means that the client port was already connected
						error("Duplicated connection on the same client port",
							  mclevmcadPackage.eINSTANCE.getMMCADeployment_Connections(), i);
					}
				}
				// There should not be any platform switches, since there are
				// alternatives...
				i++;
			}

			i = 0;
			for (MComponentInstance inst : deployment.getComponents())
			{
				if (inst.getComponent() == null)
				{
					i++;
					continue;
				}
				for (Iterator<MClientPort> p = MCLEVUtil.getDefault().getAllExternalClientPorts(inst.getComponent()).iterator(); p.hasNext(); )
				{
					MClientPort port = p.next();
					if (connectedPortsMap.get(inst) == null ||
						connectedPortsMap.get(inst).contains(port) == false)
					{
						error("Unconnected client port " + port.getName(),
								mclevmcadPackage.eINSTANCE.getMMCADeployment_Components(), i);
					}
				}
				i++;
			}
			
		}
		else
		{
			// There are alternatives
			for (MDeploymentAlternative lda : MCLEVUtil.getDefault().getLeafDeploymentAlternatives(deployment))
			{
				Map<MComponentInstance, Set<MClientPort>> connectedPortsMap = new HashMap<MComponentInstance, Set<MClientPort>>();

				for (MConnection conn : MCLEVUtil.getDefault().getAllConnections(lda))
				{
					if (conn instanceof MCommonConnection)
					{
						MCommonConnection ccnx = (MCommonConnection)conn;
						if (connectedPortsMap.get(ccnx.getClientInstance()) == null)
						{
							connectedPortsMap.put(ccnx.getClientInstance(), new HashSet<MClientPort>());
						}
						Set<MClientPort> cports = connectedPortsMap.get(ccnx.getClientInstance());
						if (cports.add(ccnx.getClientPort()) == false)
						{
							// This means that the client port was already connected
							error("Duplicated connection on the same client port",
									ccnx, mclevmcadPackage.eINSTANCE.getMCommonConnection_ClientPort(), -1);
						}
					}
					else
					{
						MConnectionSwitch csw = (MConnectionSwitch)conn;
						if (connectedPortsMap.get(csw.getClientInstance()) == null)
						{
							connectedPortsMap.put(csw.getClientInstance(), new HashSet<MClientPort>());
						}
						Set<MClientPort> cports = connectedPortsMap.get(csw.getClientInstance());
						if (cports.add(csw.getClientPort()) == false)
						{
							// This means that the client port was already connected
							error("Duplicated connection on the same client port",
									csw, mclevmcadPackage.eINSTANCE.getMConnectionSwitch_ClientPort(), -1);
						}
					}
				}
				
				// Now we have to check that every client port is connected
				i = 0;
				for (MComponentInstance inst : MCLEVUtil.getDefault().getAllComponentInstances(lda))
				{
					if (inst.getComponent() == null)
					{
						i++;
						continue;
					}
					for (Iterator<MClientPort> p = MCLEVUtil.getDefault().getAllExternalClientPorts(inst.getComponent()).iterator(); p.hasNext(); )
					{
						MClientPort port = p.next();
						if (connectedPortsMap.get(inst) == null ||
							connectedPortsMap.get(inst).contains(port) == false)
						{
							error("Unconnected client port " + port.getName(),
								  inst,  mclevmcadPackage.eINSTANCE.getMComponentInstance_Component(), -1);
						}
					}
					i++;
				}
			}
		}
	}
	
	/**
	 * Checks that, if the connector reference of a connection is null, then
	 * the mapping reference shall also be null. It also checks that, if the
	 * mapping reference is null, then the interfaces of both connectors
	 * must be the same. If the mapping reference is not null, then the
	 * connected interfaces must be the ones defined by the interface mapping.
	 * Implements Restrictions TBC.
	 * @param ccnx the common component connection to check.
	 */
	@Check
	public void checkMCommonConnection_InterfaceMapping(MCommonConnection ccnx)
	{
		if (ccnx.getClientPort() == null ||
			ccnx.getClientPort().eIsProxy() == true ||
			ccnx.getServerPort() == null ||
			ccnx.getServerPort().eIsProxy() == true ||
			ccnx.getConnector() == null ||
			ccnx.getConnector().eIsProxy() == true ||
			(ccnx.getIfaceMapping() != null && ccnx.getIfaceMapping().eIsProxy() == true))
		{
			return;
		}
		
		
		if (ccnx.getIfaceMapping() == null &&
			ccnx.getClientPort().getInterface() != ccnx.getServerPort().getInterface() &&
			MCLEVUtil.getDefault().getExtendedInterfaces(ccnx.getClientPort().getInterface()).contains(ccnx.getClientPort().getInterface()) == false)
		{
			error("Interface mismatch." +
				  " If an interface mapping is not defined, the pair of interfaces at both sides of the connection must match",
			      mclevmcadPackage.eINSTANCE.getMCommonConnection_IfaceMapping());
		}
		if (ccnx.getIfaceMapping() != null && 
			(ccnx.getIfaceMapping().getInterfaces().contains(ccnx.getClientPort().getInterface()) == false ||
			 ccnx.getIfaceMapping().getInterfaces().contains(ccnx.getServerPort().getInterface()) == false))
		{
			error("The connected interfaces do not match with the ones defined by the selected interface mapping",
				  mclevmcadPackage.eINSTANCE.getMCommonConnection_IfaceMapping());
		}
		
	}
	
	@Check
	public void checkMConnectionSwitch_InterfaceMapping(MConnectionSwitch csw)
	{
		if (csw.getClientPort() == null ||
			csw.getClientPort().eIsProxy() == true)
		{
			return;
		}
		
		for (MConnectionSwitchCase cswc : csw.getCases())
		{
			if (cswc.getServerPort() == null ||
				cswc.getServerPort().eIsProxy() == true ||
				cswc.getConnector() == null ||
				cswc.getConnector().eIsProxy() == true ||
				(cswc.getIfaceMapping() != null && cswc.getIfaceMapping().eIsProxy() == true))
			{
				continue;
			}
			
			if (cswc.getIfaceMapping() == null &&
				csw.getClientPort().getInterface() != cswc.getServerPort().getInterface())
			{
				error("Interface mismatch." +
					  " If an interface mapping is not defined, the pair of interfaces at both sides of the connection must match",
					  cswc, mclevmcadPackage.eINSTANCE.getMConnectionSwitchCase_IfaceMapping(), -1);
			}
			if (cswc.getIfaceMapping() != null && 
				(cswc.getIfaceMapping().getInterfaces().contains(csw.getClientPort().getInterface()) == false ||
				 cswc.getIfaceMapping().getInterfaces().contains(cswc.getServerPort().getInterface()) == false))
			{
				error("The connected interfaces do not match with the ones defined by the selected interface mapping",
					  cswc, mclevmcadPackage.eINSTANCE.getMConnectionSwitchCase_IfaceMapping(), -1);
			}
		}
	}
	
	/**
	 * Checks that every SAI provided by the deployed service libraries is
	 * provided only once and that every required interface is provided by a
	 * service library.
	 * Implements Restrictions 204, 205 and 206.
	 * @param deployment
	 */
	@Check
	public void checkMMCADeployment_checkSwInterfaces(MMCADeployment deployment)
	{ 
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			Set<MSAI> providedInterfaces = checkSAIs(deployment.getLibraries(), deployment.getComponents(), null);
			
			if (deployment.getDomain() != null &&
				deployment.getDomain().eIsProxy() == false &&
				deployment.getDomain() instanceof MIODomain)
			{
				for (MDeploymentPlatform deploymentPlatform : deployment.getDeploymentPlatforms())
				{
					for (MSAI sai : MCLEVUtil.getDefault().getAllRequiredSAIs((MIODomain)deployment.getDomain(), deploymentPlatform.getPlatform()))
					{
						if (providedInterfaces.contains(sai) == false)
						{
							error("Required SAI " + MCLEVStringHelper.getDefault().getElementName(sai) +
									" is not being provided by any service library",
									mclevmcadPackage.eINSTANCE.getMMCADeployment_Domain());
						}	
					}
				}
			}
		}
		else
		{
			for (MDeploymentAlternative alternative : MCLEVUtil.getDefault().getLeafDeploymentAlternatives(deployment))
			{
				Set<MSAI> providedInterfaces = checkSAIs(MCLEVUtil.getDefault().getAllServiceLibraryInstances(alternative), 
						  MCLEVUtil.getDefault().getAllComponentInstances(alternative), alternative);
				
				if (deployment.getDomain() != null &&
					deployment.getDomain().eIsProxy() == false &&
					deployment.getDomain() instanceof MIODomain)
				{
					for (MDeploymentPlatform deploymentPlatform : alternative.getDeploymentPlatforms())
					{
						for (MSAI sai : MCLEVUtil.getDefault().getAllRequiredSAIs((MIODomain)deployment.getDomain(), deploymentPlatform.getPlatform()))
						{
							if (providedInterfaces.contains(sai) == false)
							{
								error("Required SAI " + MCLEVStringHelper.getDefault().getElementName(sai) +
										" is not being provided by any service library",
										mclevmcadPackage.eINSTANCE.getMMCADeployment_Domain());
							}	
						}
					}
				}
			}
		}
	}

	
	/**
	 * Checks that every SAI provided by the deployed service libraries is
	 * provided only once and that every required interface is provided by a
	 * service library.
	 * This function is not part of the checking interface, it is only a
	 * helper function.
	 * @param deployedSLs the set of deployed service libraries to check.
	 * @param instances the set of component instances to check.
	 */
	protected Set<MSAI> checkSAIs(Collection<MServiceLibraryInstance> deployedSLs, 
						Collection<MComponentInstance> instances, 
						MDeploymentAlternative leafDeploymentAlternative)
	{
		Set<MSAI> providedInterfaces = new HashSet<MSAI>();
		
		for (MServiceLibraryInstance slinst : deployedSLs)
		{
			for (MSAI sai : MCLEVUtil.getDefault().getAllEffectivelyProvidedSAIs(slinst.getLibrary()))
			{
				if (providedInterfaces.add(sai) == false)
				{
					error("Provided SAI " + MCLEVStringHelper.getDefault().getElementName(sai) +
						  "conflicts with another service library", slinst,
						  mclevmcadPackage.eINSTANCE.getMServiceLibraryInstance_Library(), -1);
				}
			}
		}

		for (MServiceLibraryInstance slinst : deployedSLs)
		{
			if (slinst.eContainer() instanceof MDeploymentAlternative)
			{
				// We have to check that all the interfaces required by the
				// package for every one of the platforms are provided.
				
				for (MDeploymentPlatform dplt : leafDeploymentAlternative.getDeploymentPlatforms())
				{
					for (MSAI sai : MCLEVUtil.getDefault().getAllRequiredSAIs(slinst.getLibrary(), dplt.getPlatform()))
					{
						if (providedInterfaces.contains(sai) == false)
						{
							error("Required SAI " + MCLEVStringHelper.getDefault().getElementName(sai) +
									" is not being provided by any service library", slinst,
									mclevmcadPackage.eINSTANCE.getMServiceLibraryInstance_Library(), -1);
						}						
					}
				}
			}
			else
			{
				MMCADeployment deployment = (MMCADeployment)slinst.eContainer();
				
				Collection<MDeploymentPlatform> platforms = null;
				
				if (leafDeploymentAlternative == null)
				{
					platforms = deployment.getDeploymentPlatforms();
				}
				else
				{
					platforms = leafDeploymentAlternative.getDeploymentPlatforms();
				}

				for (MDeploymentPlatform dplt : platforms)
				{
					for (MSAI swi : MCLEVUtil.getDefault().getAllRequiredSAIs(slinst.getLibrary(), dplt.getPlatform()))
					{
						if (providedInterfaces.contains(swi) == false)
						{
							error("Required SAI " + MCLEVStringHelper.getDefault().getElementName(swi) +
									" is not being provided by any service libray", slinst,
									mclevmcadPackage.eINSTANCE.getMServiceLibraryInstance_Library(), -1);
						}						
					}
				}	

			}
		}
		for (MComponentInstance inst : instances)
		{
			if (inst.eContainer() instanceof MDeploymentAlternative)
			{
				// We have to check that all the interfaces required by the
				// package for every one of the platforms are provided.

				for (MDeploymentPlatform dplt : leafDeploymentAlternative.getDeploymentPlatforms())
				{
					for (MSAI sai : MCLEVUtil.getDefault().getAllRequiredSAIs(inst.getComponent(), dplt.getPlatform()))
					{
						if (providedInterfaces.contains(sai) == false)
						{
							error("Required SAI " + MCLEVStringHelper.getDefault().getElementName(sai) +
									" is not being provided by any service library", inst,
									mclevmcadPackage.eINSTANCE.getMComponentInstance_Component(), -1);
						}						
					}
				}
			}
			else
			{
				MMCADeployment deployment = (MMCADeployment)inst.eContainer();
				
				Collection<MDeploymentPlatform> platforms = null;
				
				if (leafDeploymentAlternative == null)
				{
					platforms = deployment.getDeploymentPlatforms();
				}
				else
				{
					platforms = leafDeploymentAlternative.getDeploymentPlatforms();
				}
				
				for (MDeploymentPlatform dplt : platforms)
				{
					for (MSAI swi : MCLEVUtil.getDefault().getAllRequiredSAIs(inst.getComponent(), dplt.getPlatform()))
					{
						if (providedInterfaces.contains(swi) == false)
						{
							error("Required SAI " + MCLEVStringHelper.getDefault().getElementName(swi) +
									" is not being provided by any service libray", inst,
									mclevmcadPackage.eINSTANCE.getMComponentInstance_Component(), -1);
						}						
					}
				}	

			}
		}
		return providedInterfaces;
	}
	

}
