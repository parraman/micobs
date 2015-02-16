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
package es.uah.aut.srg.micobs.pdl.util.impl;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

/**
 * QVT and Xpand black box unit with PDL functions.
 *
 */
public class PDLBlackBoxUnit {

	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getElementName(MCommonPackageElement element)
	{
		return PDLStringHelper.getInstance().getElementName(element);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElement(MCommonReferenceableObj object)
	{
		return PDLStringHelper.getInstance().getFullObjectNameToElement(object);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getRelativeObjectName(MCommonReferenceableObj object)
	{
		return PDLStringHelper.getInstance().getRelativeObjectName(object);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toDefString(String string)
	{
		return PDLStringHelper.getInstance().toDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toLowerDefString(String string)
	{
		return PDLStringHelper.getInstance().toLowerDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toUpperDefString(String string)
	{
		return PDLStringHelper.getInstance().toUpperDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String toPlainString(Float val)
	{
		return PDLStringHelper.getInstance().toPlainString(val);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElementWithoutVersion(MCommonReferenceableObj object)
	{
		return PDLStringHelper.getInstance().getFullObjectNameToElementWithoutVersion(object);
	}
	
}
