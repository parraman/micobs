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
package es.uah.aut.srg.micobs.system.adapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * Implementation of the language adapter factory. The singleton object
 * of this class reads all the language extensions and collects all
 * the library adapters. Once they are collected, it provides a map
 * between the language model elements and their corresponding adapters.
 *
 */
public class LanguageAdapterFactory {
	
	protected static final String EXTENSION = "languageAdapter";
	
	protected static final String ATT_URI = "uri";
	protected static final String ATT_VERSION = "version";
	protected static final String ATT_ADAPTER = "adapter";

	private static LanguageAdapterFactory INSTANCE;
	
	/**
	 * Returns the singleton instance of the language adapter factory.
	 * @return the singleton instance of the language adapter factory.
	 */
	public static LanguageAdapterFactory getAdapterFactory()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new LanguageAdapterFactory();
		}
		return INSTANCE;
	}
	
	private Map<MLanguage, LanguageAdapter> languages;
	
	protected Map<MLanguage, LanguageAdapter> getLanguagesAdapterMap() {
		return languages;
	}
	
	protected LanguageAdapterFactory()
	{
		languages = new HashMap<MLanguage, LanguageAdapter>();
		
		IExtension[] extensions = Platform.getExtensionRegistry()
				.getExtensionPoint(MICOBSPlugin.getPlugin().getSymbolicName(), EXTENSION)
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
					
				LanguageAdapter adapter = null;
					
				if (configElements[j].getAttribute(ATT_ADAPTER) != null)
				{
					try {
						adapter = (LanguageAdapter) configElements[j].createExecutableExtension(ATT_ADAPTER);
					} catch (CoreException e) {
						MICOBSPlugin.INSTANCE.log(e);
						continue;
					}
				}
				
				if (adapter == null)
				{
					continue;
				}
				
				MCommonPackageElement element = null;
				
				try {
					element = SystemLibraryManager.getLibraryManager().getElement(
							systemPackage.eINSTANCE.getMLanguage(),
							uri, version);
				} catch (LibraryManagerException e) {
					MICOBSPlugin.INSTANCE.log(e);
					continue;
				}
				
				if (element != null && 
					element instanceof MLanguage)
				{
					if (getLanguagesAdapterMap().get(element) == null)
					{
						getLanguagesAdapterMap().put((MLanguage) element, adapter);
					}
					else
					{
						getLanguagesAdapterMap().get(element).putChildAdapter(adapter);
					}
				}			
			}
		}
	}
	
	/**
	 * Returns the adapter of the given language.
	 * @param language the language.
	 * @return the adapter of the language.
	 */
	public LanguageAdapter getAdapter(MLanguage language) {
		
		return getLanguagesAdapterMap().get(language);
		
	}
	

	
}
