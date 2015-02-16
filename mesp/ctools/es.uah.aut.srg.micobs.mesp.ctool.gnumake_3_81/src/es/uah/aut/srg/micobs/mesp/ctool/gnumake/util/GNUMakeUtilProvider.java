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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.util;

import es.uah.aut.srg.micobs.mesp.util.IMESPUtil;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPUtil;
import es.uah.aut.srg.micobs.pdl.util.IPDLUtil;
import es.uah.aut.srg.micobs.util.IMICOBSUtil;

/**
 * Class that incorporates and centralizes all the utility classes.
 *
 */
public class GNUMakeUtilProvider {

	private static final IMICOBSUtil util = MESPUtil.getDefault();
	private static final IPDLUtil pdlutil = MESPUtil.getDefault();
	private static final IMESPUtil mesputil = MESPUtil.getDefault();
	
	private static final GNUMakeUtil gnumakeutil = GNUMakeUtil.getDefault();
	
	public static IMICOBSUtil getMICOBSUtil()
	{
		return util;
	}
	
	public static IPDLUtil getPDLUtil()
	{
		return pdlutil;
	}
	
	public static IMESPUtil getMESPUtil()
	{
		return mesputil;
	}
	
	public static GNUMakeUtil getGNUMakeUtil()
	{
		return gnumakeutil;
	}
	
}
