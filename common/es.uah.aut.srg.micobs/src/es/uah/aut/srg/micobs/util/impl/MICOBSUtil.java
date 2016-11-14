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
package es.uah.aut.srg.micobs.util.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamRealLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamStringLiteral;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValue;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators;
import es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral;
import es.uah.aut.srg.micobs.common.MParameterValuePAR;
import es.uah.aut.srg.micobs.common.MParameterValueRealLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueRefObject;
import es.uah.aut.srg.micobs.common.MParameterValueStringLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.MParameterValueTERMOperators;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MRealParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.common.commonFactory;
import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.util.IMICOBSUtil;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;

/**
 * This class contains a set of helper functions to be used by the
 * rest of the code of the framework.
 */
public class MICOBSUtil implements IMICOBSUtil {
	
	
	private static MICOBSUtil DEFAULT;
	
	/**
	 * Returns the default singleton instance of the MICOBS util class.
	 * 
	 * @return the default singleton instance.
	 */
	public static MICOBSUtil getDefault() {
		if (DEFAULT == null)
		{
			DEFAULT = new MICOBSUtil();
		}
		return DEFAULT;
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseEnumExpression(self, new IParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
					getParameterValue(vamap.get(parameter));
			}
		});
	}

	
	/* (non-Javadoc)
	 * @see es.uah.aut.srg.micobs.util.IMICOBSUtil#parseEnumExpression(es.uah.aut.srg.micobs.common.MParameterValueExpression, es.uah.aut.srg.micobs.util.IParameterAssignmentResolver)
	 */
	@Override
	public MEnumParameterLiteral parseEnumExpression(
					MParameterValueExpression expression,
					IParameterAssignmentResolver resolver) throws IllegalArgumentException
	{
		if (expression.getLeft() == null)
		{
			return null;
		}

		if (expression.getOperation() != null &&
			expression.getRight() != null)
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_OperationNotValidInAssignment_Enum", new Object[] { expression.getOperation().getLiteral() }));
		}
		return parseEnumExpression(expression.getLeft(), resolver);
		
	}
	
	@Override
	public MEnumParameterLiteral parseEnumExpression(
					MParameterValueTERM term, 
					IParameterAssignmentResolver resolver) throws IllegalArgumentException 
	{	
		if (term.getLeft() == null)
		{
			return null;
		}

		if (term.getOperation() != null &&
			term.getRight() != null)
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_OperationNotValidInAssignment_Enum", new Object[] { term.getOperation().getLiteral() }));
		}
		return parseEnumExpression(term.getLeft(), resolver);
		
	}
	
	@Override
	public MEnumParameterLiteral parseEnumReferencedObject(
			MCommonReferenceableObj object, 
			IParameterAssignmentResolver resolver)
	{
		if (object instanceof MEnumParameter)
		{
			MEnumParameter eparam = 
					(MEnumParameter) object;
			
			if (resolver != null)
			{
				if (eparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(eparam) != null)
				{
					return parseEnumExpression(resolver.getAssignmentExpression(eparam), resolver);
				}
			}
			return parseEnumExpression(getDefaultValue(eparam), resolver);
		}
		else if (object instanceof MEnumParameterLiteral)
		{
			MEnumParameterLiteral literal = (MEnumParameterLiteral) object;
			if (resolver.getParameter() instanceof MEnumParameter && 
				((MEnumParameter)resolver.getParameter()).getEnumDefinition() != literal.eContainer())
			{
				throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Enum_DifferentDefinition"));
			}
			return (MEnumParameterLiteral) object;
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Enum_ReferenceNotEnum"));
		}
	}
	
	@Override
	public  MEnumParameterLiteral parseEnumExpression(MParameterValue pva, 
			IParameterAssignmentResolver resolver) 
			throws IllegalArgumentException
	{
		if (pva instanceof MParameterValuePAR)
		{
			return parseEnumExpression(((MParameterValuePAR)pva).getValue(), resolver);
		}
		else if (pva instanceof MParameterValueRefObject)
		{
			if (((MParameterValueRefObject)pva).getObject().eIsProxy() == true)
			{
				return null;
			}
			return parseEnumReferencedObject(((MParameterValueRefObject)pva).getObject(), resolver);
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Enum_ReferenceNotLiteral"));
		}
	}
	
	@Override
	public Boolean parseBooleanExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseBooleanExpression(self, new IParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
					getParameterValue(vamap.get(parameter));
			}
		});
	}
	
	@Override
	public Boolean parseBooleanExpression(MParameterValueExpression expression,
			IParameterAssignmentResolver resolver) throws IllegalArgumentException
	{
		if (expression.getLeft() == null)
		{
			return null;
		}

		if (expression.getOperation() != null &&
			expression.getRight() != null)
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_OperationNotValidInAssignment_Boolean", new Object[] { expression.getOperation().getLiteral() }));
		}
		return parseBooleanExpression(expression.getLeft(), resolver);
		
	}
	
	@Override
	public Boolean parseBooleanExpression(MParameterValueTERM term, 
			IParameterAssignmentResolver resolver) 
			throws IllegalArgumentException {
		
		if (term.getLeft() == null)
		{
			return null;
		}

		if (term.getOperation() != null &&
			term.getRight() != null)
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_OperationNotValidInAssignment_Boolean", new Object[] { term.getOperation().getLiteral() }));
		}
		return parseBooleanExpression(term.getLeft(), resolver);
		
	}
	
	@Override
	public Boolean parseBooleanReferencedObject(MCommonReferenceableObj object, IParameterAssignmentResolver resolver)
	{
		if (object instanceof MBooleanParameter)
		{
			MBooleanParameter bparam = 
					(MBooleanParameter) object;
			
			if (resolver != null)
			{
				if (bparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(bparam) != null)
				{
					return parseBooleanExpression(resolver.getAssignmentExpression(bparam), resolver);
				}
			}
			return parseBooleanExpression(getDefaultValue(bparam), resolver);
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Boolean_ReferenceNotBoolean"));
		}
	}
	
	@Override
	public Boolean parseBooleanExpression(MParameterValue pva, 
			IParameterAssignmentResolver resolver) 
			throws IllegalArgumentException
	{
		if (pva instanceof MParameterValuePAR)
		{
			return parseBooleanExpression(((MParameterValuePAR)pva).getValue(), resolver);
		}
		else if (pva instanceof MParameterValueRefObject)
		{
			if (((MParameterValueRefObject)pva).getObject().eIsProxy() == true)
			{
				return null;
			}
			return parseBooleanReferencedObject(((MParameterValueRefObject)pva).getObject(), resolver);
		}
		else if (pva instanceof MParameterValueBooleanLiteral)
		{
			return ((MParameterValueBooleanLiteral)pva).isValue();
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Boolean_LiteralNotBoolean"));
		}
	}
	
	@Override
	public StringValue parseStringExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseStringExpression(self, new IParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
					getParameterValue(vamap.get(parameter));
			}
		});
	}

	@Override
	public StringValue parseStringExpression(MParameterValueExpression expression,
			IParameterAssignmentResolver resolver) throws IllegalArgumentException
	{
		if (expression.getLeft() == null)
		{
			return null;
		}

		if (expression.getOperation() != null &&
			expression.getRight() != null)
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_OperationNotValidInAssignment_String", new Object[] { expression.getOperation().getLiteral() }));
		}
		return parseStringExpression(expression.getLeft(), resolver);
		
	}
	
	@Override
	public StringValue parseStringExpression(MParameterValueTERM term, 
			IParameterAssignmentResolver resolver) 
			throws IllegalArgumentException {
		
		if (term.getLeft() == null)
		{
			return null;
		}

		if (term.getOperation() != null &&
			term.getRight() != null)
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_OperationNotValidInAssignment_String", new Object[] { term.getOperation().getLiteral() }));
		}
		return parseStringExpression(term.getLeft(), resolver);
		
	}
	
	@Override
	public StringValue parseStringReferencedObject(MCommonReferenceableObj object, IParameterAssignmentResolver resolver)
	{
		if (object instanceof MStringParameter)
		{
			MStringParameter sparam = 
					(MStringParameter) object;
			
			if (resolver != null)
			{
				if (sparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(sparam) != null)
				{
					return parseStringExpression(resolver.getAssignmentExpression(sparam), resolver);
				}
			}
			return parseStringExpression(getDefaultValue(sparam), resolver);
		}
		else if (object instanceof MEnumParameter)
		{
			MEnumParameter eparam = 
					(MEnumParameter) object;
			
			if (resolver != null)
			{
				if (eparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(eparam) != null)
				{
					return parseStringExpression(resolver.getAssignmentExpression(eparam), resolver);
				}
			}
			return parseStringExpression(getDefaultValue(eparam), resolver);
		}
		else if (object instanceof MEnumParamStringLiteral)
		{
			MEnumParamStringLiteral literal = 
					(MEnumParamStringLiteral) object;
			
			return new StringValue(literal.getValue(), literal.isIsRaw());
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_String_ReferenceNotString"));
		}
	}
	
	@Override
	public StringValue parseStringExpression(MParameterValue pva, 
			IParameterAssignmentResolver resolver) 
			throws IllegalArgumentException
	{
		if (pva instanceof MParameterValuePAR)
		{
			return parseStringExpression(((MParameterValuePAR)pva).getValue(), resolver);
		}
		else if (pva instanceof MParameterValueRefObject)
		{
			if (((MParameterValueRefObject)pva).getObject().eIsProxy() == true)
			{
				return null;
			}
			return parseStringReferencedObject(((MParameterValueRefObject)pva).getObject(), resolver);
		}
		else if (pva instanceof MParameterValueStringLiteral)
		{
			MParameterValueStringLiteral literal = ((MParameterValueStringLiteral)pva);
			return new StringValue(literal.getValue(), literal.isIsRaw());
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_String_LiteralNotString"));
		}
	}

	@Override
	public Long parseIntegerExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments) throws NumberFormatException, IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseIntegerExpression(self, new IParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
					getParameterValue(vamap.get(parameter));
			}
		});
	}
	
	@Override
	public Long parseIntegerExpression(MParameterValueExpression expression,
			IParameterAssignmentResolver resolver) throws NumberFormatException, IllegalArgumentException
	{
		if (expression.getLeft() == null)
		{
			return new Long(0);
		}
		Long right = new Long(0);
		if (expression.getOperation() != null &&
			expression.getRight() != null)
		{
			right = parseIntegerExpression(expression.getRight(), resolver);
			if (expression.getOperation() == MParameterValueExpressionOperators.MINUS)
			{
				return parseIntegerExpression(expression.getLeft(), resolver) - right;
			}
			else
			{
				return parseIntegerExpression(expression.getLeft(), resolver) + right;
			}
		}
		return parseIntegerExpression(expression.getLeft(), resolver);
		
	}
	
	@Override
	public Long parseIntegerExpression(MParameterValueTERM term, 
			IParameterAssignmentResolver resolver) 
			throws NumberFormatException, IllegalArgumentException {
		
		if (term.getLeft() == null)
		{
			return new Long(0);
		}
		Long right = new Long(0);
		if (term.getOperation() != null &&
			term.getRight() != null)
		{
			right = parseIntegerExpression(term.getRight(), resolver);
			if (term.getOperation() == MParameterValueTERMOperators.MULT)
			{
				return parseIntegerExpression(term.getLeft(), resolver) * right;
			}
			else
			{
				return parseIntegerExpression(term.getLeft(), resolver) / right;
			}
		}
		return parseIntegerExpression(term.getLeft(), resolver);
		
	}
	
	@Override
	public Long parseIntegerReferencedObject(MCommonReferenceableObj object, IParameterAssignmentResolver resolver)
	{
		if (object instanceof MIntegerParameter)
		{
			MIntegerParameter iparam = 
					(MIntegerParameter) object;
			
			if (resolver != null)
			{
				if (iparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(iparam) != null)
				{
					return parseIntegerExpression(resolver.getAssignmentExpression(iparam), resolver);
				}
			}
			return parseIntegerExpression(getDefaultValue(iparam), resolver);
		}
		else if (object instanceof MEnumParameter)
		{
			MEnumParameter eparam = 
					(MEnumParameter) object;
			
			if (resolver != null)
			{
				if (eparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(eparam) != null)
				{
					return parseIntegerExpression(resolver.getAssignmentExpression(eparam), resolver);
				}
			}
			return parseIntegerExpression(getDefaultValue(eparam), resolver);
		}
		else if (object instanceof MEnumParamIntegerLiteral)
		{
			MEnumParamIntegerLiteral literal = 
					(MEnumParamIntegerLiteral) object;
			
			return Long.decode(literal.getValue());
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Integer_ReferenceNotInteger"));
		}
	}

	@Override
	public Long parseIntegerExpression(MParameterValue pva, 
			IParameterAssignmentResolver resolver) 
			throws NumberFormatException, IllegalArgumentException
	{
		if (pva instanceof MParameterValuePAR)
		{
			return parseIntegerExpression(((MParameterValuePAR)pva).getValue(), resolver);
		}
		else if (pva instanceof MParameterValueRefObject)
		{
			if (((MParameterValueRefObject)pva).getObject().eIsProxy() == true)
			{
				return null;
			}
			return parseIntegerReferencedObject(((MParameterValueRefObject)pva).getObject(), resolver);
		}
		else if (pva instanceof MParameterValueIntegerLiteral)
		{
			MParameterValueIntegerLiteral literal = 
					(MParameterValueIntegerLiteral)pva;
			
			return Long.decode(literal.getValue());
		}
		else
		{
			throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Integer_LiteralNotInteger"));
		}
	}
	
	@Override
	public Float parseRealExpression(final MParameterValueExpression self, 
			Collection<MParameterValueAssignment> assignments) throws NumberFormatException, IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();

		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}

		return parseRealExpression(self, new IParameterAssignmentResolver() {

			@Override
			public MParameter getParameter() {
				return null;
			}

			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
					getParameterValue(vamap.get(parameter));
			}
		});
	}

	@Override
	public Float parseRealExpression(MParameterValueExpression expression,
			IParameterAssignmentResolver resolver) throws NumberFormatException, IllegalArgumentException
	{
		if (expression.getLeft() == null)
		{
			return Float.valueOf(0);
		}
		float right = 0;
		if (expression.getOperation() != null &&
			expression.getRight() != null)
		{
			right = parseRealExpression(expression.getRight(), resolver);
			if (expression.getOperation() == MParameterValueExpressionOperators.MINUS)
			{
				return parseRealExpression(expression.getLeft(), resolver) - right;
			}
			else
			{
				return parseRealExpression(expression.getLeft(), resolver) + right;
			}
		}
		return parseRealExpression(expression.getLeft(), resolver);
		
	}
	
	@Override
	public Float parseRealExpression(MParameterValueTERM term, 
			IParameterAssignmentResolver resolver) 
			throws NumberFormatException, IllegalArgumentException {
		
		if (term.getLeft() == null)
		{
			return Float.valueOf(0);
		}
		float right = 0;
		if (term.getOperation() != null &&
			term.getRight() != null)
		{
			right = parseRealExpression(term.getRight(), resolver);
			if (term.getOperation() == MParameterValueTERMOperators.MULT)
			{
				return parseRealExpression(term.getLeft(), resolver) * right;
			}
			else
			{
				return parseRealExpression(term.getLeft(), resolver) / right;
			}
		}
		return parseRealExpression(term.getLeft(), resolver);
		
	}
	
	@Override
	public Float parseRealReferencedObject(MCommonReferenceableObj object, IParameterAssignmentResolver resolver)
	{
		if (object instanceof MRealParameter)
		{
			MRealParameter rparam = 
					(MRealParameter) object;
			
			if (resolver != null)
			{
				if (rparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(rparam) != null)
				{
					return parseRealExpression(resolver.getAssignmentExpression(rparam), resolver);
				}
			}
			return parseRealExpression(getDefaultValue(rparam), resolver);
		}
		else if (object instanceof MEnumParameter)
		{
			MEnumParameter eparam = 
					(MEnumParameter) object;
			
			if (resolver != null)
			{
				if (eparam == resolver.getParameter())
				{
					throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
				}
				if (resolver.getAssignmentExpression(eparam) != null)
				{
					return parseRealExpression(resolver.getAssignmentExpression(eparam), resolver);
				}
			}
			return parseRealExpression(getDefaultValue(eparam), resolver);
		}
		else if (object instanceof MEnumParamRealLiteral)
		{
			MEnumParamRealLiteral literal = 
					(MEnumParamRealLiteral) object;
			
			return Float.valueOf(literal.getValue());
		}
		else
		{
			throw new NumberFormatException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Real_ReferenceNotReal"));
		}
	}

	@Override
	public Float parseRealExpression(MParameterValue pva, 
			IParameterAssignmentResolver resolver) 
			throws NumberFormatException, IllegalArgumentException
	{
		if (pva instanceof MParameterValuePAR)
		{
			return parseRealExpression(((MParameterValuePAR)pva).getValue(), resolver);
		}
		else if (pva instanceof MParameterValueRefObject)
		{
			if (((MParameterValueRefObject)pva).getObject().eIsProxy() == true)
			{
				return null;
			}
			return parseRealReferencedObject(((MParameterValueRefObject)pva).getObject(), resolver);
		}
		else if (pva instanceof MParameterValueRealLiteral)
		{
			MParameterValueRealLiteral literal = 
					(MParameterValueRealLiteral)pva;

			return Float.valueOf(literal.getValue());
		}
		else
		{
			throw new NumberFormatException(MICOBSPlugin.INSTANCE.getString("_ERROR_InvalidParamAssignment_Real_LiteralNotReal"));
		}
	}
	
	@Override
	public MParameterValueExpression createBooleanExpression(Boolean bool)
	{
		MParameterValueExpression exp = commonFactory.eINSTANCE.createMParameterValueExpression();
		exp.setRight(null);
		MParameterValueTERM term = commonFactory.eINSTANCE.createMParameterValueTERM();
		exp.setLeft(term);
		term.setRight(null);
		MParameterValueBooleanLiteral value = commonFactory.eINSTANCE.createMParameterValueBooleanLiteral();
		term.setLeft(value);
		value.setValue(bool);
		return exp;
	}

	@Override
	public MParameterValueExpression createIntegerExpression(Integer integer)
	{
		MParameterValueExpression exp = commonFactory.eINSTANCE.createMParameterValueExpression();
		exp.setRight(null);
		MParameterValueTERM term = commonFactory.eINSTANCE.createMParameterValueTERM();
		exp.setLeft(term);
		term.setRight(null);
		MParameterValueIntegerLiteral value = commonFactory.eINSTANCE.createMParameterValueIntegerLiteral();
		term.setLeft(value);
		value.setValue(integer.toString());
		return exp;
	}
	
	@Override
	public MParameterValueExpression createRealExpression(Float real)
	{
		MParameterValueExpression exp = commonFactory.eINSTANCE.createMParameterValueExpression();
		exp.setRight(null);
		MParameterValueTERM term = commonFactory.eINSTANCE.createMParameterValueTERM();
		exp.setLeft(term);
		term.setRight(null);
		MParameterValueRealLiteral value = commonFactory.eINSTANCE.createMParameterValueRealLiteral();
		term.setLeft(value);
		value.setValue(real.toString());
		return exp;
	}
	
	@Override
	public MParameterValueExpression createStringExpression(String string)
	{
		MParameterValueExpression exp = commonFactory.eINSTANCE.createMParameterValueExpression();
		exp.setRight(null);
		MParameterValueTERM term = commonFactory.eINSTANCE.createMParameterValueTERM();
		exp.setLeft(term);
		term.setRight(null);
		MParameterValueStringLiteral value = commonFactory.eINSTANCE.createMParameterValueStringLiteral();
		term.setLeft(value);
		value.setValue(string);
		return exp;
	}

	@Override
	public MParameterValueExpression createEnumExpression(MEnumParameterLiteral literal)
	{
		MParameterValueExpression exp = commonFactory.eINSTANCE.createMParameterValueExpression();
		exp.setRight(null);
		MParameterValueTERM term = commonFactory.eINSTANCE.createMParameterValueTERM();
		exp.setLeft(term);
		term.setRight(null);
		MParameterValueRefObject value = commonFactory.eINSTANCE.createMParameterValueRefObject();
		term.setLeft(value);
		value.setObject(literal);
		return exp;
	}

	@Override
	public void addXtextNature(IProject project)
	{
		// Cannot modify closed projects. 
		if (!project.isOpen())
			return;
		// Get the description.
		IProjectDescription description;
		
		try {
			description = project.getDescription();
		} catch (CoreException e) {
			e.printStackTrace(); 
			return;
		}
		
		// Determine if the project already has the nature. 
		List<String> newIds = new ArrayList<String>(); 
		newIds.addAll(Arrays.asList(description.getNatureIds())); 
		
		int index = newIds.indexOf(XtextProjectHelper.NATURE_ID);
		
		if (index != -1)
		{
			return;
		}
		
		// Add the nature 
		newIds.add(XtextProjectHelper.NATURE_ID); 
		description.setNatureIds(newIds.toArray(new String[newIds.size()]));
		
		// Save the description. 
		try {
			project.setDescription(description, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public Diagnostic convertToDiagnostic(final EObject model, 
			final AdapterFactory adapterFactory, List<Issue> issues)
	{
		return convertToDiagnostic(null, model, adapterFactory, issues);
	}
	
	@Override
	public Diagnostic convertToDiagnostic(String label, final EObject model, 
			final AdapterFactory adapterFactory, List<Issue> issues)
	{
		String objectLabel = null;
		if (label == null)
		{
			if (model.eIsProxy() == false &&
				adapterFactory != null)
			{
				IItemLabelProvider itemLabelProvider = 
					(IItemLabelProvider)adapterFactory.adapt(model, IItemLabelProvider.class);
				if (itemLabelProvider != null)
				{
					objectLabel = itemLabelProvider.getText(model);
				}
			}
			if (objectLabel == null)
			{
				objectLabel = EcoreUtil.getIdentification(model);
			}
		}
		else
		{
			objectLabel = label;
		}
		
		BasicDiagnostic diagnostic = new BasicDiagnostic
				("org.eclipse.xtext.validation",
                0,
                EcorePlugin.INSTANCE.getString("_UI_DiagnosticRoot_diagnostic", new Object[] { objectLabel }),
                new Object [] { model });
		
		for (Iterator<Issue> i = issues.iterator(); i.hasNext(); )
		{
			Issue issue = i.next();
			if (issue.getSeverity() == Severity.WARNING)
			{
				diagnostic.add(CheckingDiagnostic.createWarning(issue.getMessage(), model));
			}
			else if (issue.getSeverity() == Severity.ERROR)
			{
				diagnostic.add(CheckingDiagnostic.createError(issue.getMessage(), model));
			}
		}
		
		return diagnostic;
		
	}
	
	@Override
	public Diagnostic validateResource(final Resource modelResource, 
			final AdapterFactory adapterFactory)
	{
		
		EObject model = modelResource.getContents().get(0);
		
		if (modelResource instanceof XtextResource)
		{
			IResourceValidator validator = 
				((XtextResource)modelResource).getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = validator.validate(modelResource, CheckMode.ALL, null);
			return convertToDiagnostic(model, adapterFactory, issues);
		}
		else
		{
			Diagnostician diagnostician = new Diagnostician()
			{
				@Override
				public String getObjectLabel(EObject eObject)
				{
					if (!eObject.eIsProxy())
					{
						IItemLabelProvider itemLabelProvider = 
							(IItemLabelProvider)adapterFactory.adapt(eObject, IItemLabelProvider.class);
						if (itemLabelProvider != null)
						{
							return itemLabelProvider.getText(eObject);
						}
					} 
					return super.getObjectLabel(eObject);
				}
			};
	    
			BasicDiagnostic diagnostic;
			diagnostic = diagnostician.createDefaultDiagnostic(model);

			Map<Object, Object> context = diagnostician.createDefaultContext();
			diagnostician.validate(model, diagnostic, context);				
		
	    	return diagnostic;
		}
	}
	
	@Override
	public Set<MLanguage> getAllParentLanguages(MLanguage lang) {
		
		Set<MLanguage> langs = new HashSet<MLanguage>();
		
		for (MLanguage item : lang.getExtends())
		{
			langs.addAll(getAllParentLanguages(item));
			langs.add(item);
		}

		return langs;
	}
	
	@Override
	public MLanguage getLanguage(String uri, String version)
	{
		try
		{
			MCommonPackageElement element =
				SystemLibraryManager.getLibraryManager().getElement(
						systemPackage.eINSTANCE.getMLanguage(),
						uri, version);
			if (element instanceof MLanguage)
			{
				return (MLanguage) element;
			}
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
		return null;
	}
	
	@Override
	public MSystemPackage getSystemPackage(String uri)
	{
		try
		{
			MCommonPackage _package =
				SystemLibraryManager.getLibraryManager().getPackage(uri);
			if (_package instanceof MSystemPackage)
			{
				return (MSystemPackage) _package;
			}
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
		return null;
	}

	@Override
	public MParameterValueExpression getParameterValue(
			MParameterValueAssignment assignment) {
		
		if (assignment instanceof MParameterValueAssignmentSingleExpression)
		{
			return ((MParameterValueAssignmentSingleExpression)assignment).getParameterValue();
		}
		throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_UnknownParameterValueAssignmentType"));
	}

	@Override
	public MParameterValueExpression getDefaultValue(MParameter parameter) {
		
		if (parameter instanceof MParameterDefaultValueSingleExpression)
		{
			return ((MParameterDefaultValueSingleExpression)parameter).getDefaultValue();
		}
		throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_UnknownParameterType"));
	}

	@Override
	public MParameterRange getRange(MParameter parameter) {
		
		if (parameter instanceof MIntegerParameterSingleExpression)
		{
			return ((MIntegerParameterSingleExpression)parameter).getRange();
		}
		else if (parameter instanceof MRealParameterSingleExpression)
		{
			return ((MRealParameterSingleExpression)parameter).getRange();
		}
		throw new IllegalArgumentException(MICOBSPlugin.INSTANCE.getString("_ERROR_ParameterDoesNotHaveRange"));
	}
	
}
