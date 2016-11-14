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

import java.util.Collection;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.util.StringValue;

/**
 * QVT and Xpand black box unit with common MICOBS functions.
 *
 */
public class MICOBSBlackBoxUnit {
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean parseBooleanExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments)
	{
		return MICOBSUtilProvider.getMICOBSUtil().parseBooleanExpression(self, assignments);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static StringValue parseStringExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments)
	{
		return MICOBSUtilProvider.getMICOBSUtil().parseStringExpression(self, assignments);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Long parseIntegerExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments)
	{
		return MICOBSUtilProvider.getMICOBSUtil().parseIntegerExpression(self, assignments);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Float parseRealExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments)
	{
		return MICOBSUtilProvider.getMICOBSUtil().parseRealExpression(self, assignments);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MEnumParameterLiteral parseEnumExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments)
	{
		return MICOBSUtilProvider.getMICOBSUtil().parseEnumExpression(self, assignments);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getElementName(MCommonPackageElement element)
	{
		return MICOBSStringHelper.getInstance().getElementName(element);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElement(MCommonReferenceableObj object)
	{
		return MICOBSStringHelper.getInstance().getFullObjectNameToElement(object);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElementWithoutVersion(MCommonReferenceableObj object)
	{
		return MICOBSStringHelper.getInstance().getFullObjectNameToElementWithoutVersion(object);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String getRelativeObjectName(MCommonReferenceableObj object)
	{
		return MICOBSStringHelper.getInstance().getRelativeObjectName(object);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toDefString(String string)
	{
		return MICOBSStringHelper.getInstance().toDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toLowerDefString(String string)
	{
		return MICOBSStringHelper.getInstance().toLowerDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toUpperDefString(String string)
	{
		return MICOBSStringHelper.getInstance().toUpperDefString(string);
	}

	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MParameterValueAssignment copy(MParameterValueAssignment src)
	{
		return EcoreUtil.copy(src);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toPlainString(Float val)
	{
		return MICOBSStringHelper.getInstance().toPlainString(val);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MLanguage getLanguage(String uri, String version)
	{
		return MICOBSUtilProvider.getMICOBSUtil().getLanguage(uri, version);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MSystemPackage getSystemPackage(String uri)
	{
		return MICOBSUtilProvider.getMICOBSUtil().getSystemPackage(uri);
	}
}
