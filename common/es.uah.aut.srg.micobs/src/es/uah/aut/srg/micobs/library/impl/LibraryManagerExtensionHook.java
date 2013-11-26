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
package es.uah.aut.srg.micobs.library.impl;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * This class is used to load a set of model elements when the associated
 * library is loaded. For example, this is used to automatically include
 * the models corresponding to the different supported programming languages.
 * These models are located in specific plugins and loaded when the system
 * library is first recalled.
 *
 */
public class LibraryManagerExtensionHook {
	
	public static final String ATT_URI = "uri";
	public static final String ATT_VERSION = "version";
	public static final String ATT_MODEL = "model";
	
	private ILibraryManager libraryManager;
	private String extensionPluginName;
	private String extensionName;
	
	/**
	 * Constructor.
	 * 
	 * @param libraryManager the manager of the library into which the elements
	 * 						 will be loaded.
	 * @param extensionPluginName the symbolic name of the plugin that stores the library.
	 * @param extensionName the name of the extension point used to identify the models.
	 */
	public LibraryManagerExtensionHook(ILibraryManager libraryManager, String extensionPluginName, String extensionName)
	{
		this.extensionPluginName = extensionPluginName;
		this.libraryManager = libraryManager;
		this.extensionName = extensionName;
	}
	
	/**
	 * Returns the symbolic name of the plugin that stores the library
	 * on which the elements will be loaded.
	 * @return the extension plugin name.
	 */
	private String getExtensionPluginName()
	{
		return extensionPluginName;
	}
	
	
	/**
	 * Returns the name of the extension point used to identify the models to
	 * to be stored.
	 * @return the name of the extension point used to identify the models to
	 * to be stored.
	 */
	private String getExtensionName()
	{
		return extensionName;
	}

	/**
	 * Loads the models into the library. This method will throw a 
	 * {@link LibraryManagerException} if an error occurs when
	 * accessing the library.
	 */
	public void loadExtensionModels() throws LibraryManagerException
	{
		IExtension[] extensions = Platform.getExtensionRegistry()
				.getExtensionPoint(getExtensionPluginName(), getExtensionName())
				.getExtensions();
		
		for (int i = 0; i < extensions.length; i++)
		{
			IConfigurationElement[] configElements =
					extensions[i].getConfigurationElements(); 
			
			for (int j = 0; j < configElements.length; j++)
			{
				String uri = configElements[j].getAttribute(ATT_URI);
				String version = configElements[j].getAttribute(ATT_VERSION);
				String model = configElements[j].getAttribute(ATT_MODEL);
				
				if (uri == null || 
					version == null || model == null)
				{
					continue;
				}
				
				String[] tmp = uri.split("[.]");
				String packageURI = "";
				if (tmp != null && tmp.length >= 1)
				{
					packageURI = tmp[0];
					for (int k = 1; k < tmp.length - 1; k++)
					{
						packageURI += "." + tmp[k];
					}
				}
				
				if (libraryManager.getPackage(packageURI) == null)
				{
					// We have to create the package!
					IPath newPackageFolder = libraryManager.getPlugin().getStateLocation();
					newPackageFolder = newPackageFolder.append(ILibraryManager.LIBRARY_FOLDER);
					newPackageFolder = newPackageFolder.append(ILibraryManager.PACKAGES_FOLDER);
 					newPackageFolder = newPackageFolder.append(StringHelper.toLowerDefString(packageURI));

		            FileHelper.createFolder(newPackageFolder.toOSString());
		            
		            libraryManager.addPackage(packageURI);
				}
				
				if (libraryManager.getVersionedItem(uri, version) != null)
				{
					libraryManager.removeElement(uri, version);
				}
				
				String sourceString = null;
				
				try {
					sourceString = FileLocator.toFileURL(
						Platform.getBundle(configElements[j].getContributor().getName()).getEntry(model)).getPath();
				} catch (IOException e) {
					MICOBSPlugin.INSTANCE.log(e);
					continue;
				}
				
				tmp = model.split("[.]");
				String resourceExtension = "";
				if (tmp != null && tmp.length >= 1)
					resourceExtension = tmp[tmp.length-1];
				
				IPath destPath = libraryManager.getPlugin().getStateLocation();
				destPath = destPath.append(ILibraryManager.LIBRARY_FOLDER);
				destPath = destPath.append(ILibraryManager.PACKAGES_FOLDER);
				destPath = destPath.append(StringHelper.toLowerDefString(packageURI));
				destPath = destPath.append(StringHelper.toLowerDefString(uri, version) + "." + resourceExtension);
				
				File destFile = new File(destPath.toOSString());
				try {
					if (destFile.isFile())
					{
						destFile.setWritable(true);
						destFile.delete();
					}
					FileHelper.copyBinaryFile(sourceString, destPath.toOSString());
					destFile.setWritable(false);					
				} catch (IOException e) {
					MICOBSPlugin.INSTANCE.log(e);
					continue;
				}
				
				URI modelURI = URI.createPlatformPluginURI(
						libraryManager.getPlugin().getBundle().getSymbolicName() + "/" +
						ILibraryManager.LIBRARY_FOLDER + "/" +
						ILibraryManager.PACKAGES_FOLDER + "/" +
						StringHelper.toLowerDefString(packageURI) + "/" +
						StringHelper.toLowerDefString(uri, version) +
						"." + resourceExtension, true);
				
				libraryManager.putElement(modelURI);
				
			}
		}
		try {
			libraryManager.saveLibrary();
		} catch (IOException e) {
			throw new LibraryManagerException(e.getMessage());
		}
		
	}
	
}
