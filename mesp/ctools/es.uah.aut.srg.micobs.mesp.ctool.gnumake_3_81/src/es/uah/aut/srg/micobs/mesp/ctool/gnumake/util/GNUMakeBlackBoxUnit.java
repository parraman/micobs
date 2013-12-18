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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.util;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;

/**
 * QVT and Xpand black box unit with GNUMake functions.
 *
 */
public class GNUMakeBlackBoxUnit {

	@Operation(contextual = true, kind = Kind.HELPER)
	public static MConstructionTool getConstructionToolGNUMake()
	{
		return GNUMakeUtilProvider.getGNUMakeUtil().getConstructionToolGNUMake();
	}
	
}
