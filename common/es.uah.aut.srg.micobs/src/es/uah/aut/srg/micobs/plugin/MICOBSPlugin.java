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
package es.uah.aut.srg.micobs.plugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import es.uah.aut.srg.micobs.library.ILibraryManagerPlugin;

/**
 * This is the central singleton for the MICOBS plugin.
 * @generated
 */
public final class MICOBSPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * @generated
	 */
	public static final MICOBSPlugin INSTANCE = new MICOBSPlugin();

	/**
	 * Keep track of the singleton.
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * @generated
	 */
	public MICOBSPlugin() {
		super
		  (new ResourceLocator [] {
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
	 * The actual implementation of the Eclipse plugin.
	 * @generated NOT
	 */
	public static class Implementation extends EclipseUIPlugin
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
