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
package es.uah.aut.srg.modeling.util.file;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;

public class FileConverter {

	/**
	 * Converts an EMF platform plugin URI to a Java URL.
	 * 
	 * If an error occurs when locating the file, the method
	 * will throw an {@link IOException}
	 * 
	 * @param platformPluginURI the EMF platform plugin URI.
	 * @return the Java URL.
	 */
	public static URL platformPluginURItoURL(URI platformPluginURI) throws IOException
	{	
		if (platformPluginURI.isPlatformPlugin() == false)
		{
			return null;
		}
		
		String filename = platformPluginURI.segment(2);

		for (int j = 3; j < platformPluginURI.segmentCount(); j++)
		{
			filename += "/" + platformPluginURI.segment(j);
		}

		Bundle bundle = Platform.getBundle(platformPluginURI.segment(1));

		return FileLocator.toFileURL(bundle.getEntry(filename));
	}

	/**
	 * Converts an EMF platform plugin URI to a Java File.
	 * 
	 * @param platformPluginURI the EMF platform plugin URI.
	 * @return the Java File.
	 */
	public static File platformPluginURItoFile(URI platformPluginURI) {
			
		if (platformPluginURI.isPlatformPlugin() == false)
		{
			return null;
		}
		
		Bundle bundle = Platform.getBundle(platformPluginURI.segment(1));
		IPath libraryRoot = Platform.getStateLocation(bundle);
		libraryRoot = libraryRoot.append(platformPluginURI.segment(2));
		
		for (int j = 3; j < platformPluginURI.segmentCount(); j++)
		{
			libraryRoot = libraryRoot.append(platformPluginURI.segment(j));
		}
		return new File(libraryRoot.toOSString());
	}

	/**
	 * Checks that a given platform URI exists.
	 * 
	 * @param platformPluginURI the EMF platform plugin URI.
	 * @return <code>true</code> if the file exits and <code>false</code>
	 * otherwise.
	 */
	public static boolean existsPlatformPluginURI(URI platformPluginURI) {
		
		if (platformPluginURI.isPlatformPlugin() == false)
		{
			return false;
		}
		
		String filename = platformPluginURI.segment(2);

		for (int j = 3; j < platformPluginURI.segmentCount(); j++)
		{
			filename += "/" + platformPluginURI.segment(j);
		}

		Bundle bundle = Platform.getBundle(platformPluginURI.segment(1));

		return (bundle.getEntry(filename) != null);

	}
	
}
