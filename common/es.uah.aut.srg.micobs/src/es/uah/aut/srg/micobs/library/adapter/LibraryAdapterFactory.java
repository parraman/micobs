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
package es.uah.aut.srg.micobs.library.adapter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Implements the factory of library adapters and stores its corresponding
 * singleton object. This object loads all the library adapters that have
 * been defined by the plugins using the <code>library</code> extension
 * point.
 *
 */
public class LibraryAdapterFactory {

	public static final String EXTENSION = "library";
	public static final String ATT_ID = "id";
	public static final String ATT_NAME = "name";
	public static final String ATT_ADAPTER = "adapter";
	public static final String CHILD_DEPENDENCY = "depends";
	public static final String ATT_DEPENDENCY_LIBRARY = "library";

	private static LibraryAdapterFactory INSTANCE;
	
	/**
	 * Returns the singleton instance of the class. The object is created
	 * the first time it is recalled.
	 * @return the singleton instance of the class.
	 */
	public static LibraryAdapterFactory getAdapterFactory()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new LibraryAdapterFactory();
		}
		return INSTANCE;
	}
	
	protected HashMap<String, LibraryAdapter> adapterLibraryHash;
	protected HashMap<String, String> libraryNameHash;
	protected HashMap<String, String> libraryIDHash;

	/**
	 * Returns a library adapter from the ID of the library.
	 * @param id the ID of the library that is being requested.
	 * @return the library adapter.
	 */
	public LibraryAdapter getAdapter(String id)
	{
		if (id != null)
		{
			return getAdapterLibraryHash().get(id);
		}
		return null;
	}
	
	/**
	 * Returns the name of a library from its ID.
	 * @param id the ID of the library whose name is being requested.
	 * @return the name of the library.
	 */ 
	public String getLibraryName(String id) {
		
		if (libraryNameHash == null)
		{
			init();
		}
		return libraryNameHash.get(id);
		
	}
	
	/**
	 * Returns the ID of a library from its name.
	 * @param name the name of the library whose name is being requested.
	 * @return the ID of the library.
	 */
	public String getLibraryID(String name) {
		
		if (libraryIDHash == null)
		{
			init();
		}
		return libraryIDHash.get(name);
		
	}
	
	/**
	 * Function that lazily initializes the library adapters.
	 */
	private void init()
	{	
		adapterLibraryHash = new HashMap<String, LibraryAdapter>();
		libraryNameHash = new HashMap<String, String>();
		libraryIDHash = new HashMap<String, String>();
		
		IExtension[] extensions = Platform.getExtensionRegistry()
			.getExtensionPoint(MICOBSPlugin.getPlugin().getSymbolicName(), EXTENSION)
			.getExtensions();
		
		for (int i = 0; i < extensions.length; i++)
		{ 
			IConfigurationElement[] configElements =
				extensions[i].getConfigurationElements(); 
			for (int j = 0; j < configElements.length; j++)
			{
				String name = configElements[j].getAttribute(ATT_NAME);
				String id = configElements[j].getAttribute(ATT_ID);
				if (name == null || id == null)
				{
					continue;
				}
				LibraryAdapter adapter;
				try {
					adapter = (LibraryAdapter) configElements[j].createExecutableExtension(ATT_ADAPTER);
				} catch (CoreException e) {
					e.printStackTrace();
					continue;
				}
				IConfigurationElement[] dependencies = configElements[j].getChildren(CHILD_DEPENDENCY);
				if (dependencies != null && dependencies.length > 0)
				{
					Set<String> dependingLibraries = new HashSet<String>();
					for (int k = 0; k < dependencies.length; k++)
					{
						String libclass = dependencies[k].getAttribute(ATT_DEPENDENCY_LIBRARY);
						if (libclass != null)
						{
							dependingLibraries.add(libclass);
						}
					}
					adapter.setDependingLibraries(dependingLibraries);
				}
				adapterLibraryHash.put(id, adapter);
				libraryNameHash.put(id, name);
				libraryIDHash.put(name, id);
			}
		}
		for (String libclass : adapterLibraryHash.keySet())
		{
			LibraryAdapter adapter = adapterLibraryHash.get(libclass);
			Set<String> dependentLibraries = new HashSet<String>();
			for (String lc : adapterLibraryHash.keySet())
			{
				if (lc.matches(libclass))
				{
					continue;
				}
				if (adapterLibraryHash.get(lc).getDependingLibraries() != null &&
					adapterLibraryHash.get(lc).getDependingLibraries().contains(libclass))
				{
					dependentLibraries.add(lc);
				}
			}
			adapter.setDependentLibraries(dependentLibraries);
		}
		
	}
	
	protected HashMap<String, LibraryAdapter> getAdapterLibraryHash()
	{
		if (adapterLibraryHash == null)
		{
			init();
		}
		return adapterLibraryHash;
	}
	
}
