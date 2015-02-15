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

import java.util.ArrayList;
import java.util.List;

/**
 * Language adapter class. It is used by the different languages installed in
 * the system to provide interfaces that can be used throughout the framework.
 * 
 * The adapters are included by the different plugins via a specific extension.
 * Since two plugins can provide adapters for the same language, the adapters
 * can be chained hierarchically.
 *
 */
public class LanguageAdapter {
	
	protected final List<LanguageAdapter> childrenAdapters = new ArrayList<LanguageAdapter>();

	/**
	 * Checks if the adapter supports the given type. This method has to be
	 * overridden by the different defined adapters.
	 * @param type the type supported by the adapter.
	 * @return <code>true</code> if the adapter supports the type and 
	 * 		   <code>false</code> otherwise.
	 */
	public boolean isAdapterForType(Object type) {
		
		for (LanguageAdapter adapter : childrenAdapters)
		{
			if (adapter.isAdapterForType(type) == true)
			{
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Returns the adapted object that implements the given interface.
	 * This method has to be overridden by the adapters.
	 * @param type the type supported by the adapter. 
	 * @return the object that implements the interface.
	 */
	public Object adapt(Object type) {
		
		for (LanguageAdapter adapter : childrenAdapters)
		{
			Object adapted = adapter.adapt(type);
			if (adapted != null)
			{
				return adapted;
			}
		}
		return null;
		
	}
	
	
	/**
	 * Includes an adapter on an existing one. This method is used to 
	 * chain the different adapters of the same language.
	 * @param child the adapter to be chained.
	 */
	public void putChildAdapter(LanguageAdapter child) {
		childrenAdapters.add(child);
	}
	
}
