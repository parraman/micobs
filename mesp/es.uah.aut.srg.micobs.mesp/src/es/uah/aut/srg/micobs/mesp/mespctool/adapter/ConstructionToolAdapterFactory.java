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
package es.uah.aut.srg.micobs.mesp.mespctool.adapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Implementation of the construction tool adapter factory. The singleton object
 * of this class reads all the construction tool extensions and collects all
 * the library adapters. Once they are collected, it provides a map
 * between the construction tool model elements and their corresponding adapters.
 *
 */
public class ConstructionToolAdapterFactory {
	
	protected static final String EXTENSION = "ctoolAdapter";
	
	protected static final String ATT_URI = "uri";
	protected static final String ATT_VERSION = "version";
	protected static final String ATT_ADAPTER = "adapter";

	public static ConstructionToolAdapterFactory INSTANCE = new ConstructionToolAdapterFactory();
	
	/**
	 * Returns the singleton instance of the construction tool adapter factory.
	 * @return the singleton instance of the construction tool adapter factory.
	 */
	public static ConstructionToolAdapterFactory getAdapterFactory()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new ConstructionToolAdapterFactory();
		}
		return INSTANCE;
	}
	
	private Map<MConstructionTool, ConstructionToolAdapter> ctools;
	
	protected Map<MConstructionTool, ConstructionToolAdapter> getCToolsAdapterMap() {
		return ctools;
	}
	
	
	protected ConstructionToolAdapterFactory() {
		
		ctools = new HashMap<MConstructionTool, ConstructionToolAdapter>();
		
		IExtension[] extensions = Platform.getExtensionRegistry()
				.getExtensionPoint(MESPPlugin.getPlugin().getSymbolicName(), EXTENSION)
				.getExtensions();
		
		for (int i = 0; i < extensions.length; i++)
		{
			IConfigurationElement[] configElements =
					extensions[i].getConfigurationElements(); 
			
			for (int j = 0; j < configElements.length; j++)
			{
				String uri = configElements[j].getAttribute(ATT_URI);
				String version = configElements[j].getAttribute(ATT_VERSION);
				
				if (uri == null || version == null)
				{
					continue;
				}
				
				ConstructionToolAdapter adapter = null;
				
				if (configElements[j].getAttribute(ATT_ADAPTER) != null)
				{
					try {
						adapter = (ConstructionToolAdapter) configElements[j].createExecutableExtension(ATT_ADAPTER);
					} catch (CoreException e) {
						MESPPlugin.INSTANCE.log(e);
						continue;
					}
				}
				
				if (adapter == null)
				{
					continue;
				}
				
				MCommonPackageElement element = null;
				
				try {
					element = MESPLibraryManager.getLibraryManager().getElement(
							mespctoolPackage.eINSTANCE.getMConstructionTool(),
							uri, version);
				} catch (LibraryManagerException e) {
					MICOBSPlugin.INSTANCE.log(e);
					continue;
				}
				
				if (element != null && 
					element instanceof MConstructionTool)
				{
					if (getCToolsAdapterMap().get(element) == null)
					{
						getCToolsAdapterMap().put((MConstructionTool) element, adapter);
					}
					else
					{
						getCToolsAdapterMap().get(element).putChildAdapter(adapter);
					}
				}	
			}
		}		
	}
	
	/**
	 * Returns the adapter of the given construction tool.
	 * @param ctool the construction tool.
	 * @return the adapter of the construction tool.
	 */
	public ConstructionToolAdapter getAdapter(MConstructionTool ctool) {
		
		return getCToolsAdapterMap().get(ctool);
		
	}
	

	
}
