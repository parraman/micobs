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
package es.uah.aut.srg.modeling.util.plugin;

import java.util.ResourceBundle;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ModelingUtilPlugin extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "es.uah.aut.srg.modeling.util"; //$NON-NLS-1$

	private static ModelingUtilPlugin plugin;
	
	private static ResourceBundle resourceBundle;
	
	protected static ResourceBundle getResourceBundle() {
		return resourceBundle;
	}

	public ModelingUtilPlugin() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		resourceBundle = Platform.getResourceBundle(plugin.getBundle());
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ModelingUtilPlugin getDefault() {
		return plugin;
	}
	
	public static String getString(String key)
	{
		return getResourceBundle().getString(key);
	}

}
