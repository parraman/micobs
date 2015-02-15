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

import java.util.HashSet;
import java.util.Set;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.decoder.ILibraryDecoder;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Abstract implementation of a library adapter. The adapters of the libraries
 * installed in the framework must extend this common class.
 * 
 * This class forces the support of the interfaces {@link ILibraryDecoder},
 * {@link ILibraryEncoder} and {@link ILibraryManager}. Furthermore, it
 * implements the interface {@link IDependentLibrariesProvider} by itself.
 *
 */
public abstract class LibraryAdapter {

	public LibraryAdapter()
	{
		super();
	}
	
	/**
	 * Returns the object that implements the library decoding functionality.
	 * 
	 * If there is a problem when accessing the library, the method will
	 * throw a {@link LibraryManagerException}.
	 * 
	 * @return the object that implements the library decoding functionality.
	 */
	protected abstract ILibraryDecoder getLibraryDecoder() throws LibraryManagerException;
	
	/**
	 * Returns the manager associated to the library.
	 * 
	 * If there is a problem when accessing the library, the method will
	 * throw a {@link LibraryManagerException}.
	 * 
	 * @return the manager associated to the library.
	 */
	protected abstract ILibraryManager getLibraryManager() throws LibraryManagerException;
	
	/**
	 * Returns the object that implements the library encoding functionality.
	 * 
	 * If there is a problem when accessing the library, the method will
	 * throw a {@link LibraryManagerException}.
	 * 
	 * @return the object that implements the library encoding functionality.
	 */
	protected abstract ILibraryEncoder getLibraryEncoder() throws LibraryManagerException;
	
	
	/**
	 * Main adapting function. This method will return, if defined, the object
	 * that implements the requested interface. The library adapters of the different
	 * libraries must override this method to support any new interface.
	 * 
	 * By default, the adapter supports the interfaces {@link ILibraryDecoder},
	 * {@link ILibraryEncoder} and {@link ILibraryManager}, whose implementing objects
	 * must be provided by the derived classes, and the interface
	 * {@link IDependentLibrariesProvider}.
	 * 
	 * @param iface the requested interface
	 * @return the object that implements the requested interface or <code>null</code> if
	 * 		   interface is not supported.
	 */
	public Object adapt(Object iface)
	{
		if (iface == ILibraryDecoder.class)
		{
			try {
				return getLibraryDecoder();
			} catch (LibraryManagerException e) {
				MICOBSPlugin.INSTANCE.log(e);
				return null;
			}
		}
		else if (iface == ILibraryEncoder.class)
		{
			try {
				return getLibraryEncoder();
			} catch (LibraryManagerException e) {
				MICOBSPlugin.INSTANCE.log(e);
				return null;
			}
		}
		else if (iface == ILibraryManager.class)
		{
			try {
				return getLibraryManager();
			} catch (LibraryManagerException e) {
				MICOBSPlugin.INSTANCE.log(e);
				return null;
			}
		}
		else if (iface == IDependentLibrariesProvider.class)
		{
			return getDependentLibrariesProvider();
		}
		else if (iface == IDependingLibrariesProvider.class)
		{
			return getDependingLibrariesProvider();
		}
		return null;
	}
	
	/**
	 * Stores the dependent libraries provider.
	 */
	protected DependentLibrariesProvider dependentLibProvider;
	
	/**
	 * Stores the depending libraries provider.
	 */
	protected DependingLibrariesProvider dependingLibProvider;

	
	/**
	 * Returns the dependent libraries provider object. If the object
	 * was not created, it creates it the first time it is recalled.
	 * @return the dependent libraries provider object.
	 */
	protected DependentLibrariesProvider getDependentLibrariesProvider() {
		
		if (dependentLibProvider == null)
		{
			dependentLibProvider = new DependentLibrariesProvider(dependentLibraries);
		}
		return dependentLibProvider;
		
	}
	
	/**
	 * Returns the depending libraries provider object. If the object
	 * was not created, it creates it the first time it is recalled.
	 * @return the dependent libraries provider object.
	 */
	protected DependingLibrariesProvider getDependingLibrariesProvider() {
		
		if (dependingLibProvider == null)
		{
			dependingLibProvider = new DependingLibrariesProvider(dependingLibraries);
		}
		return dependingLibProvider;
		
	}
	
	/**
	 * Class that generically implements the {@link IDependentLibrariesProvider}
	 * interface, providing the managers of the set of on which the parent library
	 * depends.
	 * 
	 * The object is constructed from the set of libraries on which the parent library
	 * depends expressed as a set of string IDs. The library managers are obtained
	 * by requesting the objects to the corresponding adapters.
	 *
	 */
	protected class DependingLibrariesProvider implements IDependingLibrariesProvider {

		@Override
		public Set<ILibraryManager> getDependingLibraries() {
			return managers;
		}
		
		public DependingLibrariesProvider(Set<String> dependingLibraries) {
			
			this.managers = new HashSet<ILibraryManager>();
			
			if (dependingLibraries != null)
			{			
				for (String library : dependingLibraries)
				{
					LibraryAdapter adapter = LibraryAdapterFactory.getAdapterFactory().getAdapter(library);
					if (adapter != null)
					{
						ILibraryManager libraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
						if (libraryManager != null)
						{
							managers.add(libraryManager);
						}
					}
				}
			}
		}

		Set<ILibraryManager> managers;
	}
	
	/**
	 * Class that generically implements the {@link IDependentLibrariesProvider}
	 * interface, providing the managers of the set of  libraries that depend on
	 * the parent library.
	 * 
	 * The object is constructed from the set of libraries that depend on the parent
	 * library expressed as a set of string IDs. The library managers are obtained
	 * by requesting the objects to the corresponding adapters.
	 *
	 */
	protected class DependentLibrariesProvider implements IDependentLibrariesProvider {

		@Override
		public Set<ILibraryManager> getDependentLibraries() {
			return managers;
		}
		
		public DependentLibrariesProvider(Set<String> dependentLibraries) {
			
			this.managers = new HashSet<ILibraryManager>();
			
			if (dependentLibraries != null)
			{			
				for (String library : dependentLibraries)
				{
					LibraryAdapter adapter = LibraryAdapterFactory.getAdapterFactory().getAdapter(library);
					if (adapter != null)
					{
						ILibraryManager libraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
						if (libraryManager != null)
						{
							managers.add(libraryManager);
						}
					}
				}
			}
		}

		Set<ILibraryManager> managers;
	}

	/**
	 * Stores the string IDs of the set of libraries that depend on this
	 * particular library.
	 */
	Set<String> dependentLibraries;
	
	/**
	 * Stores the string IDs of the set of libraries on which this library
	 * depends.
	 */
	Set<String> dependingLibraries;
	
	/**
	 * Returns the string IDs of the set of libraries on which this library
	 * depends.
	 * @return the string IDs of the set of libraries on which this library
	 * depends.
	 */
	public Set<String> getDependingLibraries() {
		return dependingLibraries;
	}

	/**
	 * Sets the string IDs of the set of libraries on which this library
	 * depends.
	 * @param dependingLibraries the new set of string IDs of the set of libraries
	 * 		  on which this library depends.
	 */
	public void setDependingLibraries(Set<String> dependingLibraries) {
		this.dependingLibraries = dependingLibraries;
		
	}
	
	/**
	 * Sets the string IDs of the set of libraries that depend on this library.
	 * @param dependentLibraries the new set of string IDs of the set of 
	 * 		  libraries that depend on this library.
	 */
	public void setDependentLibraries(Set<String> dependentLibraries) {
		this.dependentLibraries = dependentLibraries;
		
	}
	
}
