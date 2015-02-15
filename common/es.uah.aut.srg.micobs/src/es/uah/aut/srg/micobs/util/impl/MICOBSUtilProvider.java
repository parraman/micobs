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

import es.uah.aut.srg.micobs.util.IMICOBSUtil;

/**
 * Class that incorporates and centralizes all the utility classes.
 *
 */
public class MICOBSUtilProvider {

	private static final IMICOBSUtil util = MICOBSUtil.getDefault();
	
	public static IMICOBSUtil getMICOBSUtil()
	{
		return util;
	}

}
