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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.ILibraryManagerPlugin;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.modeling.util.file.FileConverter;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Common implementation of a library manager that can be used to manage a
 * given library.
 *
 */
public class LibraryManager implements ILibraryManager {
	
	protected LinkedHashMap<EClass, EClass> elementToItemClassMap = new LinkedHashMap<EClass, EClass>();
	protected LinkedHashMap<EClass, EClass> itemToElementClassMap = new LinkedHashMap<EClass, EClass>();
	protected LinkedHashMap<EClass, EClass> itemToVersionedItemClassMap = new LinkedHashMap<EClass, EClass>();
	protected LinkedHashMap<EClass, EClass> versionedItemToItemClassMap = new LinkedHashMap<EClass, EClass>();
	
	protected EFactory libraryItemFactory;
	
	protected EClass libraryClass;
	protected EClass packageClass;
	
	ILibraryManagerPlugin plugin;
	
	@Override
	public ILibraryManagerPlugin getPlugin() {
		return plugin;
	}
	
	/**
	 * This stores the Library's Platform Plug-in URI. This URI is only to be
	 * used externally, because if you open an EMF file using a Platform
	 * Plug-in URI, it will be opened in read-only mode.
	 */
	protected URI libraryPlatformURI;
	
	protected ResourceSet libraryResourceSet;
	protected static ResourceSet elementResourceSet = new ResourceSetImpl();

	/**
	 * Contains the resource URI of the library.
	 */
	protected URI libraryResourceURI;
	
	protected Resource libraryResource;
	protected MCommonLibrary library;
	
	private HashMap<String, MCommonPackage> packageHash;
	
	/**
	 * Returns the packages hash list.
	 * @return the packages hash list.
	 */ 
	protected HashMap<String, MCommonPackage> getPackageHash()
	{
		if (packageHash == null)
		{
			packageHash = new HashMap<String, MCommonPackage>();
		}
		return packageHash;
	}
	
	/**
	 * Returns the hash key of a package from its URI.
	 * 
	 * @param uri the URI of the package.
	 * @return the hash key of the package.
	 */
	protected String getPackageHashKey(String uri)
	{
		return StringHelper.toLowerDefString(uri);
	}
	
	/**
	 * Returns the hash key of a package.
	 * 
	 * @param _package the package.
	 * @return the hash key of the package.
	 */
	protected String getPackageHashKey(MCommonPackage _package)
	{
		return StringHelper.toLowerDefString(_package.getUri());
	}
	
	private HashMap<MCommonPackage, HashMap<EClass, List<MCommonPackageElement>>> packageElementsClassifiedList;
	
	/**
	 * Returns the hash map of elements classified by package and class.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the hash map of elements classified by package and class.
	 */
	protected HashMap<MCommonPackage, HashMap<EClass, List<MCommonPackageElement>>> getPackageElementsClassifiedList() throws LibraryManagerException
	{
		if (packageElementsClassifiedList == null)
		{
			loadLibraryItems();
		}
		return packageElementsClassifiedList;
	}
	
	/**
	 * Returns the hash map between the elements of the library and
	 * their corresponding versioned items.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the hash map between the elements of the library and
	 * their corresponding versioned items.
	 */
	protected HashMap<MCommonPackageElement, MCommonPackageVersionedItem> getElementToVersionedItemMap() throws LibraryManagerException
	{
		if (elementToVersionedItemMap == null)
		{
			loadLibraryItems();
		}
		return elementToVersionedItemMap;
	}
	
	private HashMap<MCommonPackageElement, MCommonPackageVersionedItem> elementToVersionedItemMap;
	
	/**
	 * Returns the hash map between the versioned items of the library and
	 * their corresponding elements.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the hash map between the versioned items of the library and
	 * their corresponding elements.
	 */
	protected HashMap<MCommonPackageVersionedItem, MCommonPackageElement> getVersionedItemToElementMap() throws LibraryManagerException
	{
		if (versionedItemToElementMap == null)
		{
			loadLibraryItems();
		}
		return versionedItemToElementMap;
	}
	
	private HashMap<MCommonPackageVersionedItem, MCommonPackageElement> versionedItemToElementMap;
	
	private HashMap<String, MCommonPackageElement> elementHash;
	
	/**
	 * Returns the element hash map that indexes all the elements stored in the
	 * library by their hash key.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the element hash map that indexes all the elements stored in the
	 * 		   library.
	 */
	protected HashMap<String, MCommonPackageElement> getElementHash() throws LibraryManagerException
	{
		if (elementHash == null)
		{
			loadLibraryItems();
		}
		return elementHash;
	}
	
	@Override
	public Collection<MCommonPackageElement> getAllElements() throws LibraryManagerException {
		
		return getElementHash().values();
		
	}
	
	private HashMap<String, MCommonPackageItem> itemHash;
	
	/**
	 * Returns the item hash map that indexes all the items stored in the
	 * library.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the item hash map that indexes all the items stored in the
	 * 		   library.
	 */
	protected HashMap<String, MCommonPackageItem> getItemHash() throws LibraryManagerException
	{
		if (itemHash == null)
		{
			loadLibraryItems();
		}
		return itemHash;
	}
	
	private HashMap<EClass, List<MCommonPackageElement>> elementClassifiedList;
	
	/**
	 * Returns the elements hash map that indexes all the elements stored in the
	 * library by their classes.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the elements hash map that indexes all the elements stored in the
	 * 		   library by their classes. 
	 */
	protected HashMap<EClass, List<MCommonPackageElement>> getElementClassifiedList() throws LibraryManagerException
	{
		if (elementClassifiedList == null)
		{
			loadLibraryItems();
		}
		return elementClassifiedList;
	}
	
	public LibraryManager(ILibraryManagerPlugin plugin,
			String libraryFilename,
			EClass libraryClass, 
			EClass packageClass,
			EFactory libraryItemFactory,
			EClass[] itemClasses,
			EClass[] versionedItemClasses,
			EClass[] elementClasses) throws LibraryManagerException {
		super();
		
		this.plugin = plugin;
		
		this.libraryPlatformURI = URI.createPlatformPluginURI(plugin.getBundle().getSymbolicName() + "/" +
				ILibraryManager.LIBRARY_FOLDER + "/" +
				libraryFilename, true);
		
		// All the arrays must be of the same size
		
		if (elementClasses.length != itemClasses.length ||
			itemClasses.length != versionedItemClasses.length)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_ClassArraysOfDifferentSize"));
		}
		
		for (int i = 0; i < elementClasses.length; i++)
		{
			this.elementToItemClassMap.put(elementClasses[i], itemClasses[i]);
			this.itemToElementClassMap.put(itemClasses[i], elementClasses[i]);
			this.versionedItemToItemClassMap.put(versionedItemClasses[i], itemClasses[i]);
			this.itemToVersionedItemClassMap.put(itemClasses[i], versionedItemClasses[i]);
		}
		
		this.libraryItemFactory = libraryItemFactory;
		this.libraryClass = libraryClass;
		this.packageClass = packageClass;
		
		libraryResourceSet = new ResourceSetImpl();
		
		init();
	}
	
	private void init() throws LibraryManagerException
	{	
		// First we have to create the library folder:
		IPath libraryFolder = getPlugin().getStateLocation();
		libraryFolder = libraryFolder.append(ILibraryManager.LIBRARY_FOLDER);
		libraryFolder = libraryFolder.append(ILibraryManager.PACKAGES_FOLDER);
		// This will create the folder only if it didn't exist before
		FileHelper.createFolder(libraryFolder.toOSString());
		
		libraryResourceURI = URI.createFileURI(FileConverter.platformPluginURItoFile(getLibraryPlatformURI()).getAbsolutePath());
		if (FileConverter.platformPluginURItoFile(getLibraryPlatformURI()).exists())
		{
			libraryResource = getLibraryResourceSet().getResource(libraryResourceURI, true);
			library = (MCommonLibrary)libraryResource.getContents().get(0);
		}
		else
		{
			libraryResource = getLibraryResourceSet().createResource(libraryResourceURI);
			library = (MCommonLibrary)libraryItemFactory.create(libraryClass);
			libraryResource.getContents().add(library);
			try {
				libraryResource.save(null);
			} catch (IOException e1) {
				MICOBSPlugin.INSTANCE.log(e1);
				throw new LibraryManagerException(e1.getMessage());
			}
		}

		// At the beginning, only the packages are loaded
		for (Iterator<MCommonPackage> p = library.getPackages().iterator(); p.hasNext(); )
		{
			// Since it is the first time, the package is not on the hash:
			MCommonPackage _package = p.next();
			getPackageHash().put(getPackageHashKey(_package), _package);	
		}
		
		sortLibraryPackages();

	}

		
	/**
	 * Sorts the list of packages contained by the library.
	 */
	protected void sortLibraryPackages() {

		ECollections.sort(library.getPackages(), new Comparator<MCommonPackage>(){

			@Override
			public int compare(MCommonPackage package0, 
					MCommonPackage package1) {
				
				if (package0.getUri() == null &&
					package1.getUri() == null)
				{
					return 0;
				}		
				else if (package0.getUri() == null)
				{
					return -1;
				}
				else if (package1.getUri() == null)
				{
					return 1;
				}
				return package0.getUri().compareTo(package1.getUri());
			}
			
		});
		
	}
	
	/**
	 * Method used in the sorting of the items stored in the library.
	 * The items are indexed by their classes and their URIs.
	 * 
	 * @param item0 the first item to be compared.
	 * @param item1 the second item to be compared.
	 * @return 0 if the items are of the same class, -1 if the class
	 * of the first item is indexed before the class of the second
	 * item and 1 otherwise.
	 */
	private int comparePackageItemClass(MCommonPackageItem item0, MCommonPackageItem item1)
	{
		if (item0.eClass() == item1.eClass())
		{
			return 0;
		}
		for (EClass cls : itemToElementClassMap.keySet())
		{
			if (item0.eClass() == cls)
			{
				return -1;
			}
			if (item1.eClass() == cls)
			{
				return 1;
			}
		}
		return 0;
	}
	
	/**
	 * Sorts the items contained by a given package.
	 * @param pack the package whose items will be sorted.
	 */
	protected void sortPackageItems(MCommonPackage pack)
	{
		ECollections.sort(pack.getItems(), new Comparator<MCommonPackageItem>(){

			@Override
			public int compare(MCommonPackageItem item0, 
					MCommonPackageItem item1) {
				
				int tmp = comparePackageItemClass(item0, item1);
				if (tmp != 0)
					return tmp;
				
				String[] tmp0 = item0.getUri().split("[.]");
				String[] tmp1 = item1.getUri().split("[.]");
				
				if (tmp0.length < 1 &&
					tmp1.length < 1)
				{
					return 0;
				}		
				else if (tmp0.length < 1)
				{
					return -1;
				}
				else if (tmp1.length < 1)
				{
					return 1;
				}
				return tmp0[tmp0.length-1].toLowerCase().compareTo(tmp1[tmp1.length-1].toLowerCase());
			}
			
		});

	}
	
	/**
	 * Sorts the versioned items of a given item by their versions.
	 * 
	 * @param item the item whose versioned items will be sorted.
	 */
	protected void sortItemVersionedItems(MCommonPackageItem item) {
		
		ECollections.sort(item.getVersionedItems(), new Comparator<MCommonPackageVersionedItem>(){

			@Override
			public int compare(MCommonPackageVersionedItem item0, 
					MCommonPackageVersionedItem item1) {
				
				if (item0.getVersion() == null &&
						item1.getVersion() == null)
					{
						return 0;
					}		
					else if (item0.getVersion() == null)
					{
						return -1;
					}
					else if (item1.getVersion() == null)
					{
						return 1;
					}
					return item0.getVersion().compareTo(item1.getVersion());
			}
			
		});

		
	}

	@Override
	public MCommonPackage getPackage(String uri) {
		return getPackageHash().get(getPackageHashKey(uri));
	}
	
	/**
	 * Returns the hash key of an item by its URI.
	 * 
	 * @param classifier the class of the item.
	 * @param uri the URI of the item.
	 * @return the hash key of an item.
	 */
	protected String getItemHashKey(EClass classifier, String uri) {
		return StringHelper.toLowerDefString(classifier.getName(), uri);
	}
	
	/**
	 * Returns the hash key of a given item.
	 * 
	 * @param item the item.
	 * @return the hash key of the item.
	 */
	protected String getItemHashKey(MCommonPackageItem item) {
		return StringHelper.toLowerDefString(item.eClass().getName(), item.getUri());
	}
	
	/**
	 * Returns the hash key of an element by its URI and version.
	 * 
	 * @param classifier the class of the element.
	 * @param uri the URI of the element.
	 * @param version the version of the element.
	 * @return the hash key of the element
	 */
	protected String getElementHashKey(EClass classifier, String uri, String version) {
		return StringHelper.toLowerDefString(classifier.getName(), uri, version);
	}
	
	/**
	 * Returns the hash key of a given element.
	 * 
	 * @param element the element.
	 * @return the hash key of the element.
	 */
	protected String getElementHashKey(MCommonPackageElement element) {
		return StringHelper.toLowerDefString(element.eClass().getName(), element.getUri(), element.getVersion());
	}

	@Override
	public MCommonPackageElement getElement(EClass classifier, 
					String uri, String version) throws LibraryManagerException {
		return getElementHash().get(getElementHashKey(classifier, uri, version));
	}

	@Override
	public MCommonPackageVersionedItem putElement(URI modelURI) throws LibraryManagerException
	{
		String absolutePath = FileConverter.platformPluginURItoFile(modelURI).getAbsolutePath();
		Resource resource = elementResourceSet.getResource(
					URI.createFileURI(absolutePath), true);
		
		if (resource == null)
		{
			// Error when opening the model element file
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_OpeningPackageFile", new Object[] { absolutePath }));
		}
		
		MCommonPackageFile packageFile = (MCommonPackageFile) resource.getContents().get(0);
			
		if (!library.getPackages().contains(packageFile.getPackage()))
		{
			// The package of the model element is not present in the library
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_WrongElementPackage",  new Object[] { packageFile.getPackage().getUri() }));
		}
		
		MCommonPackageElement element = packageFile.getElement();		
		MCommonPackage _package = packageFile.getPackage();
		
		MCommonPackageItem item = null;
		MCommonPackageVersionedItem versionedItem = null;
		
		// If there was not a previous item, we have to create it:
		if ((item = getItemHash().get(getItemHashKey(elementToItemClassMap.get(element.eClass()), element.getUri()))) == null)
		{
			// We have to find first if the class of the element belongs
			// to the list of classes introduced when the library was created.
			
			if (elementToItemClassMap.keySet().contains(element.eClass()))
			{
				// We found it! Now we have to create a new item:
				item = (MCommonPackageItem) libraryItemFactory.create(elementToItemClassMap.get(element.eClass()));
				// Then a new versioned item:
				versionedItem = (MCommonPackageVersionedItem) libraryItemFactory.create(itemToVersionedItemClassMap.get(item.eClass()));
				// This is extremely strange that it might happen, but just in case...
				if (item == null || versionedItem == null)
				{
					resource.unload();
					throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_CreatingLibraryItem"));
				}
				
				try
				{
					checkElement(element);
				} catch (LibraryManagerException e)
				{
					resource.unload();
					throw e;
				}
				
				item.setUri(element.getUri());
				item.getVersionedItems().add(versionedItem);
				versionedItem.setVersion(element.getVersion());
				versionedItem.setLocalModelURI(modelURI.toString());
				
				// Adding the item to the library
				_package.getItems().add(item);
				
				// We have to re-sort the items
				sortPackageItems(_package);
				
				getItemHash().put(getItemHashKey(item), item);
				
				registerElement(versionedItem, element);

				return versionedItem;
			}
			
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_UnableToFindElementClass", new Object[] { element.eClass().getName() }));
		}
		else
		{
			// We have to look up for the element's class
			if (elementToItemClassMap.keySet().contains(element.eClass()))
			{
				// We create a new versioned item
				versionedItem = (MCommonPackageVersionedItem) libraryItemFactory.create(
								itemToVersionedItemClassMap.get(
										elementToItemClassMap.get(element.eClass())));
				
				// oops: something weird would happen if..
				if (versionedItem == null)
				{
					resource.unload();
					throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_CreatingLibraryItem"));
				}
				
				try
				{
					checkElement(element);
				} catch (LibraryManagerException e)
				{
					resource.unload();
					throw e;
				}

				// OK. Now we have to add the item
				item.getVersionedItems().add(versionedItem);
				versionedItem.setVersion(element.getVersion());
				versionedItem.setLocalModelURI(modelURI.toString());
				
				// We have to order the versioned items
				sortItemVersionedItems(item);
				registerElement(versionedItem, element);
				return versionedItem;
			}
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_UnableToFindElementClass", new Object[] { element.eClass().getName() }));
		}
	}

	@Override
	public void saveLibrary() throws IOException {

		libraryResource.save(null);
		
	}
	
	@Override
	public void saveLibraryWithCommandFlush() throws IOException {

		saveLibrary();
		for (Iterator<Adapter> a = libraryResource.eAdapters().iterator(); a.hasNext(); )
		{
			Adapter adapter = a.next();
			if (adapter.isAdapterForType(IEditingDomainProvider.class) &&
				adapter instanceof IEditingDomainProvider)
			{
				EditingDomain domain = ((IEditingDomainProvider)adapter).getEditingDomain();
				domain.getCommandStack().flush();
			}
		}

	}

	@Override
	public void removeElement(EClass classifier, String uri, String version) throws LibraryManagerException
	{
		MCommonPackageItem item = getItemHash().get(getItemHashKey(elementToItemClassMap.get(classifier), uri));
		if (item == null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryNoItemFound", new Object[] {uri}));
		}
		
		MCommonPackageVersionedItem versionedItem = null;
		
		for (Iterator<MCommonPackageVersionedItem> i = item.getVersionedItems().iterator(); i.hasNext(); )
		{
			MCommonPackageVersionedItem tmp = i.next();
			if (tmp.getVersion().matches(version))
			{
				versionedItem = tmp;
				break;
			}
		}
		
		if (versionedItem == null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryNoVersionedItemFound", new Object[] {uri, version}));
		}
		
		MCommonPackageElement element = getElementHash().get(getElementHashKey(classifier, uri, version));
		if (element == null)
		{
			EcoreUtil.remove(versionedItem);
			if (item.getVersionedItems().isEmpty())
			{
				unloadPackageItem(item);
				EcoreUtil.remove(item);
			}
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryNoElementFound", new Object[] {uri, version}));
		}
		
		try {
			deregisterElement(versionedItem, element);
		} catch (LibraryManagerException e)
		{
			MICOBSPlugin.INSTANCE.log(e);
		}

		EcoreUtil.remove(versionedItem);
		if (item.getVersionedItems().isEmpty())
		{
			unloadPackageItem(item);
			EcoreUtil.remove(item);
		}

		Resource resource = null;
		try
		{
			URI resourceURI = URI.createURI(versionedItem.getLocalModelURI(), true);
			resource = elementResourceSet.getResource(URI.createFileURI(FileConverter.platformPluginURItoFile(resourceURI).getAbsolutePath()), true);
			resource.unload();
		} 
		catch (Exception e)
		{
			throw new LibraryManagerException(e.getMessage());
		}

	}

	@Override
	public List<MCommonPackageElement> getAllElementsOfClass(EClass classifier) throws LibraryManagerException
	{
		return getElementClassifiedList().get(classifier);
	}

	@Override
	public List<MCommonPackageElement> getElementsOfClass(MCommonPackage pack, EClass classifier) throws LibraryManagerException
	{
		if (!library.getPackages().contains(pack) ||
			getPackageElementsClassifiedList().get(pack).get(classifier) == null)
		{
			return new ArrayList<MCommonPackageElement>();
		}
		return getPackageElementsClassifiedList().get(pack).get(classifier);
	}
	
	@Override
	public List<MCommonPackageElement> getElementsOfClass(Collection<MCommonPackage> packs, EClass classifier) throws LibraryManagerException
	{
		List<MCommonPackageElement> metaList = new ArrayList<MCommonPackageElement>();
		
		for (Iterator<MCommonPackage> p = packs.iterator(); p.hasNext(); )
		{
			MCommonPackage pack = p.next();
			if (library.getPackages().contains(pack))
			{
				if (getPackageElementsClassifiedList().get(pack).get(classifier) != null)
				{
					metaList.addAll(getPackageElementsClassifiedList().get(pack).get(classifier));
				}
			}
		}
		return metaList;
	}
	
	@Override
	public URI getLibraryPlatformURI() {
		return libraryPlatformURI;
	}

	@Override
	public ResourceSet getLibraryResourceSet() {
		
		return libraryResourceSet;
	}
	
	@Override
	public ResourceSet getLibraryElementResourceSet() {
		
		return elementResourceSet;
	}

	@Override
	public void addPackage(String uri) throws LibraryManagerException  {
		
		if (getPackageHash().get(getPackageHashKey(uri)) != null)
		{
			return;
		}
		
		MCommonPackage _package = (MCommonPackage) this.libraryItemFactory.create(packageClass);
		_package.setUri(uri);
		
		library.getPackages().add(_package);
		sortLibraryPackages();
		getPackageHash().put(getPackageHashKey(_package), _package);
		
		// Add the classified element hashmap:
		HashMap<EClass,List<MCommonPackageElement>> elementClassifiedHash = new HashMap<EClass,List<MCommonPackageElement>>();		
		getPackageElementsClassifiedList().put(_package, elementClassifiedHash);		
	}

	@Override
	public void removePackage(String uri) throws LibraryManagerException {
		
		MCommonPackage pack = null;
		
		if ((pack = getPackageHash().get(getPackageHashKey(uri))) == null)
		{
			return;
		}
		unloadPackageItems(pack);

		getPackageHash().remove(getPackageHashKey(uri));
		getPackageElementsClassifiedList().remove(pack);
		EcoreUtil.remove(pack);
	}

	/**
	 * This method loads the library items. 
	 */
	protected void loadLibraryItems() throws LibraryManagerException
	{
		// Now we have to initialize the hashes
		itemHash = new HashMap<String, MCommonPackageItem>();
		elementHash = new HashMap<String, MCommonPackageElement>();
		
		elementClassifiedList = new HashMap<EClass, List<MCommonPackageElement>>();
		packageElementsClassifiedList = new HashMap<MCommonPackage, HashMap<EClass,List<MCommonPackageElement>>>();
		
		versionedItemToElementMap = new HashMap<MCommonPackageVersionedItem, MCommonPackageElement>();
		elementToVersionedItemMap = new HashMap<MCommonPackageElement, MCommonPackageVersionedItem>();
		
		for (EClass cls : elementToItemClassMap.keySet())
		{
			// We will not check for repeated classes
			List<MCommonPackageElement> elementClassifiedHash = new ArrayList<MCommonPackageElement>();
			 
			elementClassifiedList.put(cls, elementClassifiedHash);
		}

		for (MCommonPackage _package : library.getPackages())
		{
			// Since it is the first time, the package is not on the hash:
			getPackageHash().put(getPackageHashKey(_package), _package);
			
			// We order the package items, just in case
			sortPackageItems(_package);

			// We also have to create the package element classified list:
			HashMap<EClass,List<MCommonPackageElement>> elementClassifiedHash = new HashMap<EClass,List<MCommonPackageElement>>();		
			packageElementsClassifiedList.put(_package, elementClassifiedHash);
			
			// For each of the items, we have to load the elements:
			for (Iterator<MCommonPackageItem> i = _package.getItems().iterator(); i.hasNext(); )
			{
				MCommonPackageItem item = i.next();
				
				for (Iterator<MCommonPackageVersionedItem> j = item.getVersionedItems().iterator(); j.hasNext(); )
				{
					MCommonPackageVersionedItem versionedItem = j.next();
					
					// Now we have to load the resource
					Resource resource = null;
					MCommonPackageFile packageFile = null;
					try
					{
						URI resourceURI = URI.createURI(versionedItem.getLocalModelURI(), true);
						resource = elementResourceSet.getResource(
								URI.createFileURI(
										FileConverter.platformPluginURItoFile(resourceURI).getAbsolutePath()), true);
						packageFile = (MCommonPackageFile) resource.getContents().get(0);
					} 
					catch (Exception e)
					{
						// The exception will be logged and the library item will not be loaded
						j.remove();
						MICOBSPlugin.INSTANCE.log(e);
						continue;
					}
					
					// If we reach this point, it means that the element has been
					// successfully loaded			
					
					MCommonPackageElement element = packageFile.getElement();
					
					// If the loaded element's uri mismatches the uri stored in the
					// item, then we won't load it
					if (!item.getUri().matches(element.getUri()))
					{
						j.remove();
						resource.unload();
						MICOBSPlugin.INSTANCE.log(new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_WrongElementURI",
								new Object[] { element.getUri(), item.getUri() })));
						continue;
					}
					
					try {
						checkElement(element);
					} catch (LibraryManagerException e)
					{
						j.remove();
						resource.unload();
						MICOBSPlugin.INSTANCE.log(e);
						continue;
					}
					// Since the checking has passed, we can now assume that the element
					// is going to be successfully registered
					registerElement(versionedItem, element);
				}
				if (item.getVersionedItems().isEmpty() == false)
				{
					// Now we have fully loaded all the versioned items, so we can store
					// item on the hashes
					itemHash.put(getItemHashKey(item), item);
					// We have to order the versioned items
					sortItemVersionedItems(item);
				}
				else
				{
					i.remove();
				}
			}
		}
	}
	
	/**
	 * Checks an element before installing it.
	 * 
	 * If the element fails the checking, the method will throw a
	 * {@link LibraryManagerException} with the cause of the failure.
	 * 
	 * @param element the element to be checked.
	 */
	protected void checkElement(MCommonPackageElement element) throws LibraryManagerException {
		
		List<MCommonPackageElement> elementList =
			getElementClassifiedList().get(element.eClass());
		// If the element list of this class is null, this means that the
		// element is of a wrong class...
		if (elementList == null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_WrongElementClass", new Object[] { element.eClass().getName() }));
		}
		
		if (getElementHash().get(getElementHashKey(element)) != null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString(
					"_ERROR_ElementWithSameURIAndVersionAlreadyExists", 
					new Object[] { element.getUri(), element.getVersion() }));
		}
		
		
	}

	/**
	 * Registers an element in the library. The element will be attached to the
	 * item passed as a parameter.
	 * 
	 * The method will throw a {@link LibraryManagerException} if an error occur
	 * when accessing the library.
	 * 
	 * @param item the item of the element.
	 * @param element the element to be registered.
	 */
	protected void registerElement(MCommonPackageVersionedItem versionedItem, 
			MCommonPackageElement element) throws LibraryManagerException {
		
		MCommonPackage _package = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		List<MCommonPackageElement> elementList =
			getElementClassifiedList().get(element.eClass());
		
		List<MCommonPackageElement> packageElementList = null;
		
		if ((packageElementList = getPackageElementsClassifiedList().get(_package).get(element.eClass())) == null)
		{
			// This means that it is the first element of this class that has been loaded
			// We have to create the new packageElementList:
			packageElementList = new ArrayList<MCommonPackageElement>();
			getPackageElementsClassifiedList().get(_package).put(element.eClass(), packageElementList);
		}
		
		// Everything is OK, so we have to put the versioned element on the
		// corresponding hash list and on the list of elements of its
		// class
		elementList.add(element);	
		Collections.sort(elementList, elementURIComparator);
		packageElementList.add(element);
		Collections.sort(packageElementList, elementURIComparator);
		getElementHash().put(getElementHashKey(element), element);
		getVersionedItemToElementMap().put(versionedItem, element);
		getElementToVersionedItemMap().put(element, versionedItem);

	}
	
	/**
	 * Comparator object used to sort a list of common elements.
	 */
	protected static final Comparator<MCommonPackageElement> elementURIComparator = 
			new Comparator<MCommonPackageElement>(){

		@Override
		public int compare(MCommonPackageElement item0, 
				MCommonPackageElement item1) {
			
			String[] tmp0 = item0.getUri().split("[.]");
			String[] tmp1 = item1.getUri().split("[.]");
			
			if (tmp0.length < 1 &&
				tmp1.length < 1)
			{
				return 0;
			}		
			else if (tmp0.length < 1)
			{
				return -1;
			}
			else if (tmp1.length < 1)
			{
				return 1;
			}
			return tmp0[tmp0.length-1].toLowerCase().compareTo(tmp1[tmp1.length-1].toLowerCase());
		}
		
	};
	
	/**
	 * Deregisters and unloads a package element from the library.
	 * 
	 * The method will throw a {@link LibraryManagerException} if an error occur
	 * when accessing the library or when unloading the element resource.
	 * 
	 * @param element the element to be unloaded from the library.
	 */
	protected void unloadPackageElement(MCommonPackageVersionedItem versionedItem, 
			MCommonPackageElement element) throws LibraryManagerException
	{
		try
		{
			deregisterElement(versionedItem, element);
		} catch (LibraryManagerException e)
		{
			MICOBSPlugin.INSTANCE.log(e);
		}
		
		// And now we unload the resource from the ResourceSet
		Resource resource = element.eResource();
		
		try
		{
			resource.unload();
		} 
		catch (Throwable e)
		{
			throw new LibraryManagerException(e.getMessage());
		}
	}

	/**
	 * Deregisters a model element from the library hash lists and maps.
	 * 
	 * The method will throw a {@link LibraryManagerException} if an error occur
	 * when accessing the library.
	 * 
	 * @param element the element to be deregistered.
	 */
	protected void deregisterElement(MCommonPackageVersionedItem versionedItem, 
			MCommonPackageElement element) throws LibraryManagerException {
		
		Collection<MCommonPackageElement> elementList =
			getElementClassifiedList().get(element.eClass());
		
		// This is a safety check, just in case the element has not been
		// previously stored...
		if (getElementHash().get(getElementHashKey(element)) != null)
		{
			getElementHash().remove(getElementHashKey(element));
		}
		// Another safety check to avoid a NullPointerException
		if (elementList != null)
		{
			elementList.remove(element);
		}
		
		MCommonPackage _package = ((MCommonPackageFile)element.eContainer()).getPackage();
		if (getPackageElementsClassifiedList().get(_package) != null ||
			getPackageElementsClassifiedList().get(_package).get(element.eClass()) != null)
		{
			getPackageElementsClassifiedList().get(_package).get(element.eClass()).remove(element);
		}
		
		if (getVersionedItemToElementMap().get(versionedItem) != element)
		{
			getVersionedItemToElementMap().remove(versionedItem);
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryVersionedItemMismatch"));
		}
		else
		{
			getVersionedItemToElementMap().remove(versionedItem);
		}
		if (getElementToVersionedItemMap().get(element) != versionedItem)
		{
			getElementToVersionedItemMap().remove(element);
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryVersionedItemMismatch"));
		}
		else
		{
			getElementToVersionedItemMap().remove(element);
		}
	}
	
	/**
	 * Unloads a package item and its corresponding element.
	 * 
	 * The method will throw a {@link LibraryManagerException} if an error occur
	 * when accessing the library.
	 * 
	 * @param item the item to be unloaded from the library.
	 */
	protected void unloadPackageItem(MCommonPackageItem item) throws LibraryManagerException
	{
		for (Iterator<MCommonPackageVersionedItem> i = item.getVersionedItems().iterator(); i.hasNext(); )
		{
			MCommonPackageVersionedItem versionedItem = i.next(); 
			try
			{
				MCommonPackageElement element = getElementHash().get(
						getElementHashKey(itemToElementClassMap.get(item.eClass()), 
						item.getUri(), versionedItem.getVersion()));
				if (element != null)
				{
					unloadPackageElement(versionedItem, element);
				}
			} catch (LibraryManagerException e)
			{
				MICOBSPlugin.INSTANCE.log(e);
			}
		}
		getItemHash().remove(getItemHashKey(item));
	}
	
	/**
	 * Unloads the of package items of a given package by calling the 
	 * {@link #unloadPackageItem(MCommonPackageItem)} method for each of them.
	 * @param _package the package whose items will be unloaded.
	 */
	protected void unloadPackageItems(MCommonPackage _package)
	{
		for (Iterator<MCommonPackageItem> i = _package.getItems().iterator(); i.hasNext(); )
		{
			MCommonPackageItem item = i.next();
			try
			{
				unloadPackageItem(item);
			} catch (LibraryManagerException e)
			{
				MICOBSPlugin.INSTANCE.log(e);
			}
		}
	}

	@Override
	public MCommonPackageItem getItem(EClass classifier, String uri) throws LibraryManagerException {
		return getItemHash().get(getItemHashKey(classifier, uri));
	}

	@Override
	public void removeElements(EClass classifier, String uri) throws LibraryManagerException {
		
		MCommonPackageItem item = getItemHash().get(getItemHashKey(classifier, uri));
		
		if (item == null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryNoItemFound", new Object[] { uri }));
		}
		
		unloadPackageItem(item);
		EcoreUtil.remove(item);
	}

	@Override
	public MCommonPackageVersionedItem getVersionedItem(MCommonPackageElement element)
			throws LibraryManagerException {
		
		return getElementToVersionedItemMap().get(element);

	}

	@Override
	public Collection<MCommonPackage> getAllPackages() {
		return getPackageHash().values();
	}

	@Override
	public EClass getLibraryClass() {
		return this.libraryClass;
	}
	
	@Override
	public EClass getPackageClass() {
		return this.packageClass;
	}

	@Override
	public EClass[] getLibraryElementClasses() {
		return elementToItemClassMap.keySet().toArray(new EClass[elementToItemClassMap.keySet().size()]);
	}

	@Override
	public MCommonPackageElement getElement(
			MCommonPackageVersionedItem versionedItem)
			throws LibraryManagerException {
		
		if (getVersionedItemToElementMap().get(versionedItem) == null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryNoVersionedItemFound"));
		}
		return getVersionedItemToElementMap().get(versionedItem);

	}

}
