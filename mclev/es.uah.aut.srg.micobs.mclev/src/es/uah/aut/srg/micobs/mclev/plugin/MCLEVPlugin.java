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
package es.uah.aut.srg.micobs.mclev.plugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import es.uah.aut.srg.micobs.library.ILibraryManagerPlugin;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;


/**
 * This is the central singleton for the MCLEV plugin.
 * @generated NOT
 */
public final class MCLEVPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * @generated
	 */
	public static final MCLEVPlugin INSTANCE = new MCLEVPlugin();

	/**
	 * Keep track of the singleton.
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * @generated
	 */
	public MCLEVPlugin() {
		super
		  (new ResourceLocator [] {
				  MICOBSPlugin.INSTANCE,
				  PDLPlugin.INSTANCE
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
	public static class Implementation extends EclipsePlugin
		implements ILibraryManagerPlugin {
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
