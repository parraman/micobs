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
package es.uah.aut.srg.micobs.library;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.Logger;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.Bundle;

/**
 * Interface used to ensure the provision of the required methods by
 * the plugins that store the different libraries.
 */
public interface ILibraryManagerPlugin extends ResourceLocator, Logger {

	/**
	 * Returns the bundle of the plugin.
	 * @return the bundle of the plugin.
	 */
	public Bundle getBundle();
	
	/**
	 * Returns the location in the local file system of the 
	 * plug-in state area for this plug-in.
	 * @return the location in the local file system of the 
	 * plug-in state area for this plug-in.
	 */
	public IPath getStateLocation() throws IllegalStateException;
}
