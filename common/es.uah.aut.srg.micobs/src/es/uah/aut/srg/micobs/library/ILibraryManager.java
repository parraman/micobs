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
package es.uah.aut.srg.micobs.library;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;

/**
 * Interface of the MICOBS Library Manager. 
 *
 */
public interface ILibraryManager {
	
	
	public static String LIBRARY_FOLDER = "library";
	public static String PACKAGES_FOLDER = "packages";

	/**
	 * This function returns, if exists, the package that has a given URI.
	 * 
	 * @param uri the URI of the package to be returned.
	 * @return the package with the corresponding URI or <code>null</code> if the package
	 * 		   was not found.
	 */
	public MCommonPackage getPackage(String uri);
	
	/**
	 * Returns the element installed in the library from its URI and version.
	 * If the library does not contain an element with the given URI and version,
	 * the method will return <code>null</code>.
	 * 
	 * The method will thrown a {@link LibraryManagerException} if there was a
	 * problem when accessing the library.
	 * 
	 * @param classifier the class of the element that is being searched for.
	 * @param uri the URI of the element that is being searched for.
	 * @param version the version of the element that is being searched for.
	 * @return the element if found or <code>null</code> otherwise.
	 */
	public MCommonPackageElement getElement(EClass classifier, 
				String uri, String version) throws LibraryManagerException;
	
	/**
	 * Returns the element to which a versioned library items corresponds.
	 * 
	 * The method will thrown a {@link LibraryManagerException} if there was a
	 * problem when accessing the library, if the item does not belong to the
	 * library.
	 * 
	 * @param classifier the class of the element that is being searched for.
	 * @param uri the URI of the element that is being searched for.
	 * @param version the version of the element that is being searched for.
	 * @return the element if found or <code>null</code> otherwise.
	 */
	public MCommonPackageElement getElement(
				MCommonPackageVersionedItem versionedItem) throws LibraryManagerException;	
	
	/**
	 * Stores an element in the library. The method receives the local URI of
	 * the file that contains the element to be stored. The method will
	 * return the resulting {@link MCommonPackageVersionedItem} object
	 * corresponding to the new element.
	 * 
	 * The method will throw a {@link LibraryManagerException} in the following
	 * cases:
	 * 
	 * <ul>
	 *     <li>If there was a problem when accessing the library.</li>
	 *     <li>If an element with the same URI and version was already present
	 *     	   in the library.</li>
	 *     <li>If the package to which the element file belongs is not
	 *         present in the library.</li>
	 *     <li>If the class of the element is not supported by the library.</li>
	 * </ul>
	 * 
	 * @param modelURI the local URI of the file that contains the element to
	 * 				   be stored.
	 * @return the resulting {@link MCommonPackageVersionedItem} object
	 * 		   corresponding to the new element.
	 */
	public MCommonPackageVersionedItem putElement(URI modelURI) throws LibraryManagerException;
	
	/**
	 * Saves the associated library in the disk.
	 */
	public void saveLibrary() throws IOException;
	
	/**
	 * Saves the associated library in the disk and flushes the command stack
	 * associated in the corresponding resource set.
	 */
	public void saveLibraryWithCommandFlush() throws IOException;
	
	
	/**
	 * Removes an element from the library given its URI and version.
	 * 
	 * The method will throw a {@link LibraryManagerException} in the following
	 * cases:
	 * 
	 * <ul>
	 *     <li>If there was a problem when accessing the library.</li>
	 *     <li>If the element was not present in the library.</li>
	 *     <li>If there was a problem unloading the resource corresponding
	 *         to the element.</li>
	 * </ul>
	 * 
	 * @param classifier the class of the element that is to be deleted.
	 * @param old the URI of the element that is to be deleted.
	 * @param version the version of the element that is to be deleted.
	 */
	public void removeElement(EClass classifier, 
					String old, String version) throws LibraryManagerException;
	
	/**
	 * Removes all the versions of a given element given its URI.
	 * 
	 * The method will throw a {@link LibraryManagerException} in the following
	 * cases:
	 * 
	 * <ul>
	 *     <li>If there was a problem when accessing the library.</li>
	 *     <li>If the element was not present in the library.</li>
	 *     <li>If there was a problem unloading the resource corresponding
	 *         to the element.</li>
	 * </ul>
	 * 
	 * @param classifier the class of the element that is to be deleted.
	 * @param old the URI of the element that is to be deleted.
	 */
	public void removeElements(EClass classifier, String old) throws LibraryManagerException;

	/**
	 * Returns a list with all the elements of a given class that are part of
	 * a given package.
	 * 
	 * The method will throw a {@link LibraryManagerException} if there was
	 * a problem when accessing the library.
	 * 
	 * @param pack the package from which the elements will be selected.
	 * @param classifier the {@link EClass} object corresponding to the
	 *                   class of the elements that will be selected.
	 * @return the list of all the elements of the given class that
	 * 		   are part of the given package.
	 */
	public List<MCommonPackageElement> getElementsOfClass(MCommonPackage pack, 
														  EClass classifier) throws LibraryManagerException;
	
	/**
	 * Returns a list with all the elements of a given class that are part of
	 * a group of packages.
	 * 
	 * The method will throw a {@link LibraryManagerException} if there was
	 * a problem when accessing the library.
	 *  
	 * @param packs the collection of packages from which the elements will
	 * 		  be selected. 
	 * @param classifier the {@link EClass} object corresponding to the
	 *                   class of the elements that will be selected.
	 * @return the list of all the elements of the given class that are part
	 *         of the given packages.
	 */
	public List<MCommonPackageElement> getElementsOfClass(Collection<MCommonPackage> packs, 
			EClass classifier) throws LibraryManagerException;
	
	/**
	 * Returns a list with all the elements of a given class that are installed in
	 * the library.
	 * 
	 * The method will throw a {@link LibraryManagerException} if there was
	 * a problem when accessing the library.
	 * 
	 * @param classifier the {@link EClass} object corresponding to the
	 *        class of the elements that will be selected.
	 * @return the list of all the elements of the given class that are part of
	 * 		   the library.
	 */
	public List<MCommonPackageElement> getAllElementsOfClass(EClass classifier) throws LibraryManagerException;
	
	/**
	 * Returns the platform URI of the file that stores the library.
	 * @return the platform URI of the file that stores the library.
	 */
	public URI getLibraryPlatformURI();
	
	/**
	 * Returns the resource set that includes the file that stores the library.
	 * @return the resource set that includes the file that stores the library.
	 */
	public ResourceSet getLibraryResourceSet();
	
	/**
	 * Returns the resource set used to open the element model files.
	 * @return the resource set used to open the element model files.
	 */
	public ResourceSet getLibraryElementResourceSet();
		
	/**
	 * Adds a package to the library. If the package was already present,
	 * the function will return normally.
	 * 
	 * @param uri the URI given to the new package.
	 */
	public void addPackage(String uri) throws LibraryManagerException;
	
	/**
	 * Removes a package from the library.
	 * 
	 * The method will throw a {@link LibraryManagerException} if there was
	 * a problem when accessing the library.
	 * 
	 * @param uri the URI of the package to remove.
	 */
	public void removePackage(String uri) throws LibraryManagerException;
	
	/**
	 * Returns a library item from a given URI and a given class.
	 * 
	 * The method will throw a {@link LibraryManagerException} if there was
	 * a problem when accessing the library.
	 * 
	 * @param the class of the item.
	 * @param uri the URI of the requested item.
	 * @return the requested library item or <code>null</code> if no item
	 *         was found.
	 */
	public MCommonPackageItem getItem(EClass classifier, 
			String uri) throws LibraryManagerException;
	
	/**
	 * Returns the library versioned item corresponding to a given element. If
	 * the element does not belong to the library, the method will return
	 * <code>null</code>.
	 * 
	 * The method will throw a {@link LibraryManagerException} if there was
	 * a problem when accessing the library.
	 * 
	 * @param element the element.
	 * @return the library versioned item.
	 */
	public MCommonPackageVersionedItem getVersionedItem(MCommonPackageElement element)
			throws LibraryManagerException;

	/**
	 * Returns all the packages present in the library.
	 * @return the collection of packages present in the library.
	 */
	public Collection<MCommonPackage> getAllPackages();
	
	/**
	 * Returns all the model elements installed in the library.
	 * 
	 * The method will throw a {@link LibraryManagerException} if there was
	 * a problem when accessing the library.
	 * 
	 * @return the collection of model elements installed in the library.
	 */
	public Collection<MCommonPackageElement> getAllElements() throws LibraryManagerException;
	
	/**
	 * Returns an array of {@link EClass} objects corresponding to the
	 * classes of elements that can be installed in the library.
	 * @return the array of {@link EClass} objects.
	 */
	public EClass[] getLibraryElementClasses();

	/**
	 * Returns the {@link EClass} object corresponding to the root class 
	 * of the library model.
	 * @return the {@link EClass} object.
	 */
	public EClass getLibraryClass();
	
	/**
	 * Returns the {@link EClass} object corresponding to the type of
	 * package supported by the library.
	 * @return the {@link EClass} object.
	 */
	public EClass getPackageClass();

	/**
	 * Returns the activator of the plugin that stores the library.
	 * @return the activator of the plugin that stores the library.
	 */
	ILibraryManagerPlugin getPlugin();

}
