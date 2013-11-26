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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.plugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.plugin.MESPLangC_C99Plugin;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * The activator class controls the GNU Makefile plug-in life cycle
 */
public class MESPCToolGNUMake_3_81Plugin extends EMFPlugin {

	/**
	 * Keep track of the singleton.
	 * @generated
	 */
	public static final MESPCToolGNUMake_3_81Plugin INSTANCE = new MESPCToolGNUMake_3_81Plugin();

	// The shared instance
	private static Implementation plugin;
	
	/**
	 * The constructor
	 */
	public MESPCToolGNUMake_3_81Plugin() {
		super
		  (new ResourceLocator [] {
				  MICOBSPlugin.INSTANCE,
				  PDLPlugin.INSTANCE,
				  MESPPlugin.INSTANCE,
				  MESPLangC_C99Plugin.INSTANCE
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * @generated NOT
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}
}
