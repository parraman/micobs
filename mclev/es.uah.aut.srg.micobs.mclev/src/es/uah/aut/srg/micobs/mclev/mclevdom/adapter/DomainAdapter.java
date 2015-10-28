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

import java.util.ArrayList;
import java.util.List;

import es.uah.aut.srg.micobs.mclev.mclevdom.checkers.IComponentChecker;
import es.uah.aut.srg.micobs.mclev.mclevdom.checkers.IDeploymentChecker;
import es.uah.aut.srg.micobs.mclev.mclevdom.generator.IEmptyMCLEVDeploymentProjectCreator;

/**
 * Common domain adapter. The different domains installed as plug-ins may
 * subclass this class and create new domain adapters for the different
 * interfaces. These adapters are used as hooks between the domains and
 * the framework.
 * 
 * When the first adapter for a domain is created, a clean instance of the
 * corresponding subclass is instantiated. Then, the instances corresponding
 * to the rest of the interfaces are added to the first one as its
 * children.
 * 
 * Currently, the list of adaptable interfaces are {@link IComponentChecker},
 * {@link IDeploymentChecker} and {@link IEmptyMCLEVDeploymentProjectCreator}.
 *
 */
public class DomainAdapter {
	
	/**
	 * List of installed children adapters.
	 */
	protected final List<DomainAdapter> childrenAdapters = new ArrayList<DomainAdapter>();

	/**
	 * Returns true if an adapter is currently installed for a given class or
	 * interface.
	 * @param type the class or interface that will be checked against the list
	 * of installed adapters.
	 * @return true if there is an installed adapter for the given class or 
	 * interface.
	 */
	public boolean isAdapterForType(Object type) {
		
		for (DomainAdapter adapter : childrenAdapters)
		{
			if (adapter.isAdapterForType(type) == true)
			{
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Method used to adapt the domain to a given class or interface. If the
	 * domain is not adaptable, the method will return <code>null</code>.
	 * @param type the class or interface to which the domain will be adapted.
	 * @return an object of the given type or <code>null</code> if the domain
	 * is not adaptable.
	 */
	public Object adapt(Object type) {
		
		for (DomainAdapter adapter : childrenAdapters)
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
	 * Adds a domain adapter to the list of children adapters.
	 * @param child the adapter to be added.
	 */
	public void putChildAdapter(DomainAdapter child) {
		childrenAdapters.add(child);
	}
	
}
