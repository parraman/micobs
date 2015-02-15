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
package es.uah.aut.srg.micobs.library.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManagerPlugin;
import es.uah.aut.srg.micobs.library.IParametricReferencingLibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Common library-independent implementation of a parametric 
 * referencing library manager.
 */
public class ParametricReferencingLibraryManager extends ReferencingLibraryManager implements
		IParametricReferencingLibraryManager {

	private EClass[] libraryParametricReferencingElementClasses;

	private HashMap<EClass, HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>>> parametricReferencedElementsClassifiedList;
	
	/**
	 * Returns the hash map used to obtain the parametric referencing element
	 * of an element. This hash map is indexed by the class of the referencing
	 * element and by the parameter element.
	 * 
	 * This function lazily loads the library items the first time it is
	 * called. If an error happens when loading the library items,
	 * the method will throw a {@link LibraryManagerException}.
	 * 
	 * @return the hash map used to obtain the parametric referencing
	 * element of an element.
	 */
	protected HashMap<EClass, HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>>> getParametricReferencedElementsClassifiedList() throws LibraryManagerException
	{
		if (parametricReferencedElementsClassifiedList == null)
		{
			loadLibraryItems();
		}
		return parametricReferencedElementsClassifiedList;
	}

	public ParametricReferencingLibraryManager(ILibraryManagerPlugin plugin,
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
			if (commonPackage.eINSTANCE.getMCommonPackageParametricReferencingElement().isSuperTypeOf(elementClasses[i]))
			{
				classes.add(elementClasses[i]);
			}
		}
		
		this.libraryParametricReferencingElementClasses = classes.toArray(new EClass[] {});
	}

	@Override
	public MCommonPackageParametricReferencingElement getParametricReferencingElement(
			MCommonPackageElement element, MCommonPackageElement parameterElement, EClass class_) throws LibraryManagerException {

		if (getParametricReferencedElementsClassifiedList().get(class_) == null)
		{
			throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERROR_WrongElementClass"));
		}
		
		HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>> parametricElementHash = getParametricReferencedElementsClassifiedList().get(class_);
		if (parametricElementHash.get(element) == null)
		{
			return null;
		}
		HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement> parametricHash = parametricElementHash.get(element);
		
		return parametricHash.get(parameterElement);
	}
	
	@Override
	protected void loadLibraryItems() throws LibraryManagerException
	{
		parametricReferencedElementsClassifiedList = new HashMap<EClass, HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>>>();
		for (int i = 0; i < this.libraryParametricReferencingElementClasses.length; i++)
		{
			parametricReferencedElementsClassifiedList.put(this.libraryParametricReferencingElementClasses[i],
					new HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>>());
		}
		
		super.loadLibraryItems();
	}
	
	@Override
	protected void checkElement(
			MCommonPackageElement element) throws LibraryManagerException {
		
		super.checkElement(element);
		
		if (element instanceof MCommonPackageParametricReferencingElement)
		{
			MCommonPackageParametricReferencingElement referencingElement =
					(MCommonPackageParametricReferencingElement)element;
			MCommonPackageElement referencedElement = referencingElement.getReferencedElement();
			MCommonPackageElement parameterElement = referencingElement.getParameterElement();
			
			if (getParametricReferencedElementsClassifiedList().get(referencingElement.eClass()) == null)
			{
				throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERR_WrongReferencedElementClass"));
			}
			HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>> parametricElementHash = 
					getParametricReferencedElementsClassifiedList().get(referencingElement.eClass());
			
			if (parametricElementHash.get(referencedElement) != null)
			{
				HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement> parametricHash =
						parametricElementHash.get(referencedElement);
				if (parametricHash.get(parameterElement) != null)
				{
					throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERR_DuplicatedReferencedObject"));				
				}
			}
		}
	}

	@Override
	protected void registerElement(MCommonPackageVersionedItem versionedItem,
			MCommonPackageElement element) throws LibraryManagerException {

		super.registerElement(versionedItem, element);
		
		if (element instanceof MCommonPackageParametricReferencingElement)
		{
			MCommonPackageParametricReferencingElement referencingElement =
					(MCommonPackageParametricReferencingElement)element;
			MCommonPackageElement referencedElement = referencingElement.getReferencedElement();
			MCommonPackageElement parameterElement = referencingElement.getParameterElement();

			HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>> parametricElementHash = 
					getParametricReferencedElementsClassifiedList().get(referencingElement.eClass());
			
			if (parametricElementHash.get(referencedElement) == null)
			{
				// It is the first element we map, so we have to create the
				// second level hash table
				HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement> parametricHash = 
						new HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>();
				parametricHash.put(parameterElement, referencingElement);
				parametricElementHash.put(referencedElement, parametricHash);
			}
			else
			{
				HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement> parametricHash =
						parametricElementHash.get(referencedElement);
				parametricHash.put(parameterElement, referencingElement);
			}
		}
	}

	@Override
	protected void deregisterElement(MCommonPackageVersionedItem versionedItem,
			MCommonPackageElement element)
			throws LibraryManagerException {

		super.deregisterElement(versionedItem, element);
		
		if (element instanceof MCommonPackageParametricReferencingElement)
		{
			MCommonPackageParametricReferencingElement referencingElement =
					(MCommonPackageParametricReferencingElement)element;
			MCommonPackageElement referencedElement = referencingElement.getReferencedElement();
			MCommonPackageElement parameterElement = referencingElement.getParameterElement();
			
			if (getParametricReferencedElementsClassifiedList().get(referencingElement.eClass()) == null)
			{
				throw new LibraryManagerException(MICOBSPlugin.INSTANCE.getString("_ERR_WrongReferencedElementClass"));
			}
			HashMap<MCommonPackageElement, HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement>> parametricElementHash = 
					getParametricReferencedElementsClassifiedList().get(referencingElement.eClass());
			
			if (parametricElementHash.get(referencedElement) != null)
			{
				HashMap<MCommonPackageElement, MCommonPackageParametricReferencingElement> parametricHash =
						parametricElementHash.get(referencedElement);
				
				parametricHash.remove(parameterElement);
				if (parametricHash.isEmpty())
				{
					parametricElementHash.remove(referencedElement);
				}
			}
		}
	}

}
