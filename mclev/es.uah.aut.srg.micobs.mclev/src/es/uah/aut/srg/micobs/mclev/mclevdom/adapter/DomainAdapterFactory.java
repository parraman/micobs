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
package es.uah.aut.srg.micobs.mclev.mclevdom.adapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Implements the factory of domain adapters and stores its corresponding
 * singleton object. This object loads all the domain adapters that have
 * been defined by the plug-ins using the <code>domainAdapter</code> extension
 * point.
 */
public class DomainAdapterFactory {
	
	protected static final String EXTENSION = "domainAdapter";
	
	protected static final String ATT_URI = "uri";
	protected static final String ATT_VERSION = "version";
	protected static final String ATT_ADAPTER = "adapter";

	private static DomainAdapterFactory INSTANCE;
	
	/**
	 * Returns the singleton instance of the class. The object is created
	 * the first time it is recalled.
	 * @return the singleton instance of the class.
	 */
	public static DomainAdapterFactory getAdapterFactory()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new DomainAdapterFactory();
		}
		return INSTANCE;
	}
	
	/**
	 * The main map between the domains and their adapters.
	 */
	private Map<MDomain, DomainAdapter> domains;
	
	protected Map<MDomain, DomainAdapter> getDomainsAdapterMap() {
		return domains;
	}
	
	protected DomainAdapterFactory()
	{
		domains = new HashMap<MDomain, DomainAdapter>();
		
		IExtension[] extensions = Platform.getExtensionRegistry()
				.getExtensionPoint(MCLEVPlugin.getPlugin().getSymbolicName(), EXTENSION)
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
					
				DomainAdapter adapter = null;
					
				if (configElements[j].getAttribute(ATT_ADAPTER) != null)
				{
					try {
						adapter = (DomainAdapter) configElements[j].createExecutableExtension(ATT_ADAPTER);
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
					element = MCLEVLibraryManager.getLibraryManager().getElement(
							mclevdomPackage.eINSTANCE.getMIODomain(),
							uri, version);
				} catch (LibraryManagerException e) {
					MICOBSPlugin.INSTANCE.log(e);
					continue;
				}
				
				if (element != null && 
					element instanceof MDomain)
				{
					if (getDomainsAdapterMap().get(element) == null)
					{
						getDomainsAdapterMap().put((MDomain) element, adapter);
					}
					else
					{
						getDomainsAdapterMap().get(element).putChildAdapter(adapter);
					}
				}			
			}
		}
	}
	
	/**
	 * Returns the main adapter for a given domain.
	 * @param domain the domain from which to obtain its main adapter.
	 * @return the adapter.
	 */
	public DomainAdapter getAdapter(MDomain domain) {
		return getDomainsAdapterMap().get(domain);
	}
}
