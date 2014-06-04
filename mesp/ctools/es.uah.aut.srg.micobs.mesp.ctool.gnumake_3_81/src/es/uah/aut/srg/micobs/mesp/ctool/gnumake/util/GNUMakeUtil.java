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

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;

/**
 * GNU Make Construction tool helper functions.
 *
 */
public class GNUMakeUtil {

	public static final String CTOOL_GNUMAKE_URI = "es.uah.aut.srg.micobs.mesp.ctools.GNUMake";
	public static final String CTOOL_GNUMAKE_VERSION = "3.81";

	private MConstructionTool gnumake = null;
	
	private static GNUMakeUtil DEFAULT;
	
	public static GNUMakeUtil getDefault()
	{
		if (DEFAULT == null)
		{
			DEFAULT = new GNUMakeUtil();
		}
		return DEFAULT;
	}
	
	/**
	 * Returns the model object corresponding to the GNU Make
	 * construction tool.
	 * @return the model of the GNU Make construction tool.
	 */
	public MConstructionTool getConstructionToolGNUMake()
	{
		if (gnumake == null)
		{
			try {
				MCommonPackageElement element = 
						MESPLibraryManager.getLibraryManager().getElement(
								mespctoolPackage.eINSTANCE.getMConstructionTool(),
								CTOOL_GNUMAKE_URI, CTOOL_GNUMAKE_VERSION);
				if (element != null &&
					element instanceof MConstructionTool)
				{
					gnumake = (MConstructionTool) element;
				}
			} catch (LibraryManagerException e) {
				GNUMakePlugin.INSTANCE.log(e);
			}
		}
		return gnumake;
	}
	
}
