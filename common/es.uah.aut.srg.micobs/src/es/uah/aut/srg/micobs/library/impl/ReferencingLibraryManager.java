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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManagerPlugin;
import es.uah.aut.srg.micobs.library.IReferencingLibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Common library-independent implementation of a referencing library manager.
 */
public class ReferencingLibraryManager extends LibraryManager implements
		IReferencingLibraryManager {

	private EClass[] libraryReferencingElementClasses;
	
	private HashMap<EClass, HashMap<MCommonPackageElement, MCommonPackageReferencingElement>> referencedElementsClassifiedList;
	
	/**
	 * Returns the hash map used to obtain the referencing element of an
	 * element. This hash map is indexed by the class of the referencing
	 * element.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the hash map used to obtain the referencing element of an
	 * element.
	 */
	protected HashMap<EClass, HashMap<MCommonPackageElement, MCommonPackageReferencingElement>> getReferencedElementsClassifiedList() throws LibraryManagerException
	{
		if (referencedElementsClassifiedList == null)
		{
			loadLibraryItems();
		}
		return referencedElementsClassifiedList;
	}

	public ReferencingLibraryManager(ILibraryManagerPlugin plugin,
			String libraryURI,
			EClass libraryClass,
			EClass packageClass,
			EFactory libraryItemFactory,
			EClass[] itemClasses,
			EClass[] versionedItemClasses, EClass[] elementClasses)
			throws LibraryManagerException {
		super(plugin, libraryURI, libraryClass, packageClass, libraryItemFactory, itemClasses,
				versionedItemClasses, elementClasses);
		
		Set<EClass> classes = new HashSet<EClass>();
		
		for (int i = 0; i < elementClasses.length; i++)
		{
			if (commonPackage.eINSTANCE.getMCommonPackageReferencingElement().isSuperTypeOf(elementClasses[i]))
			{
				classes.add(elementClasses[i]);
			}
		}
		
		this.libraryReferencingElementClasses = classes.toArray(new EClass[] {});
	}

	@Override
	public MCommonPackageReferencingElement getReferencingElement(
			MCommonPackageElement element, EClass class_) throws LibraryManagerException {

		if (getReferencedElementsClassifiedList().get(class_) == null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_WrongElementClass"));
		}
		return getReferencedElementsClassifiedList().get(class_).get(element);
	}
	
	@Override
	protected void loadLibraryItems() throws LibraryManagerException
	{
		referencedElementsClassifiedList = new HashMap<EClass, HashMap<MCommonPackageElement, MCommonPackageReferencingElement>>();
		for (int i = 0; i < this.libraryReferencingElementClasses.length; i++)
		{
			referencedElementsClassifiedList.put(this.libraryReferencingElementClasses[i],
					new HashMap<MCommonPackageElement, MCommonPackageReferencingElement>());
		}
		
		super.loadLibraryItems();
	}

	@Override
	protected void checkElement(
			MCommonPackageElement element) throws LibraryManagerException {
		
		super.checkElement(element);
		
		if (element instanceof MCommonPackageReferencingElement)
		{
			MCommonPackageReferencingElement referencingElement =
					(MCommonPackageReferencingElement)element;
			MCommonPackageElement referencedElement = referencingElement.getReferencedElement();
			if (getReferencedElementsClassifiedList().get(referencingElement.eClass()) == null)
			{
				throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERR_WrongReferencedElementClass"));
			}
			
			if (getReferencedElementsClassifiedList().get(referencingElement.eClass())
					.get(referencedElement) != null)
			{
				throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERR_DuplicatedReferencedObject"));				
			}
		}
	}
	
	@Override
	protected void registerElement(MCommonPackageItem item,
			MCommonPackageElement element) throws LibraryManagerException {

		super.registerElement(item, element);
		
		if (element instanceof MCommonPackageReferencingElement)
		{
			MCommonPackageReferencingElement referencingElement =
					(MCommonPackageReferencingElement)element;
			MCommonPackageElement referencedElement = referencingElement.getReferencedElement();
			
			getReferencedElementsClassifiedList().get(referencingElement.eClass())
				.put(referencedElement, referencingElement);
		}
	}

	@Override
	protected void deregisterElement(MCommonPackageElement element)
			throws LibraryManagerException {

		super.deregisterElement(element);
		
		if (element instanceof MCommonPackageReferencingElement)
		{
			MCommonPackageReferencingElement referencingElement =
					(MCommonPackageReferencingElement)element;
			MCommonPackageElement referencedElement = referencingElement.getReferencedElement();
			if (getReferencedElementsClassifiedList().get(referencingElement.eClass()) == null)
			{
				throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERR_WrongReferencedElementClass"));
			}
			
			if (getReferencedElementsClassifiedList().get(referencingElement.eClass())
					.get(referencedElement) != null)
			{
				getReferencedElementsClassifiedList().get(referencingElement.eClass())
				.remove(referencedElement);			
			}
		}
	}

}
