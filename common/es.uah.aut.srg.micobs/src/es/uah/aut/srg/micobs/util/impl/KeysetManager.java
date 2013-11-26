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
package es.uah.aut.srg.micobs.util.impl;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Implements the Keyword Set Manager. The singleton object of this class
 * loads the set of forbidden keywords installed by the different plug-ins.
 * The set can be later used for name checking purposes.
 *
 */
public class KeysetManager {

	public static final String EXTENSION = "keyset";
	public static final String ATT_KEYWORDS = "keywords";

	private static KeysetManager INSTANCE;
	
	/**
	 * Returns the singleton instance of the class. The object is created
	 * the first time it is recalled.
	 * @return the singleton instance of the class.
	 */
	public static KeysetManager getKeysetManager()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new KeysetManager();
		}
		return INSTANCE;
	}
	
	protected Set<String> keywords;

	/**
	 * Returns the set of keywords registered by the different plugins.
	 * @return the set of keywords.
	 */
	public Set<String> getKeywords()
	{
		if (keywords == null)
		{
			init();
		}
		return keywords;
	}
		
	/**
	 * Function that lazily initializes the library adapters.
	 */
	private void init()
	{	
		keywords = new HashSet<String>();
		
		IExtension[] extensions = Platform.getExtensionRegistry()
			.getExtensionPoint(MICOBSPlugin.getPlugin().getSymbolicName(), EXTENSION)
			.getExtensions();
		
		for (int i = 0; i < extensions.length; i++)
		{ 
			IConfigurationElement[] configElements =
				extensions[i].getConfigurationElements(); 
			for (int j = 0; j < configElements.length; j++)
			{
				String keylist = configElements[j].getAttribute(ATT_KEYWORDS);
				if (keylist == null)
				{
					continue;
				}
				for (String s : keylist.split(","))
				{
					keywords.add(s.trim());
				}
			}
		}
	}
	
}
