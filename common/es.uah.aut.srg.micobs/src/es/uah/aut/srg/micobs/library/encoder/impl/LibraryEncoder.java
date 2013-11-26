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
package es.uah.aut.srg.micobs.library.encoder.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.libdescFactory;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryDescriptor;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;

/**
 * Common implementation of a library encoder. Its implementation is
 * library-independent.
 *
 */
public class LibraryEncoder implements ILibraryEncoder {

	/**
	 * Static function that is used to obtain the list of elements on which
	 * a given element depends. The method obtains the direct references made
	 * within the element to other elements an recursively calculates the references
	 * that these objects define to other objects.
	 * 
	 * @param element the element of which the list of references shall be obtained.
	 * @return the list of elements on which the main element depends.
	 */
	static public Collection<MCommonPackageElement> getReferencedElements(MCommonPackageElement element)
	{
		Set<MCommonPackageElement> elements = new LinkedHashSet<MCommonPackageElement>();
		
		// First we have to check the cross references of the main element:
		
		for (Iterator<EObject> r = element.eCrossReferences().iterator(); r.hasNext(); )
		{
			EObject refObj = r.next();
			EObject root = EcoreUtil.getRootContainer(refObj);
			
			if (root instanceof MCommonPackageFile &&
				root != element.eContainer())
			{
				elements.add(((MCommonPackageFile)root).getElement());
			}
		}
		
		// And then we have to check all the contained objects and do the same:

		for (TreeIterator<EObject> it = element.eAllContents(); it.hasNext(); )
		{
			EObject object = it.next();
			for (Iterator<EObject> r =  object.eCrossReferences().iterator(); r.hasNext(); )
			{
				EObject refObj = r.next();
				EObject root = EcoreUtil.getRootContainer(refObj);
				
				if (root instanceof MCommonPackageFile &&
					root != element.eContainer())
				{
					elements.add(((MCommonPackageFile)root).getElement());
				}		
			}
		}
		return elements;
	}
	
	@Override
	public List<MDescriptor> getDescriptors(
			MCommonPackageVersionedItem versionedItem) throws LibraryManagerException {
		
		List<MDescriptor> descriptors = new ArrayList<MDescriptor>();
		
		MCommonPackageItem item = (MCommonPackageItem) versionedItem.eContainer();
		MCommonPackage pack = (MCommonPackage)item.eContainer();
		
		EObject root = EcoreUtil.getRootContainer(item);
		String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(root.eClass().getName());
		LibraryAdapter adapter = 
				LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
		ILibraryManager libraryManager = null;
		if (adapter != null)
		{
			libraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);

		}
		
		if (libraryManager == null)
		{
			return descriptors;
		}
		
		MDescriptor packDesc = libdescFactory.eINSTANCE.createMDescriptor();

		packDesc.setLibrary(libraryID);
		packDesc.setItem(pack.eClass().getName());
		packDesc.setUri(pack.getUri());
		descriptors.add(packDesc);
		
		MCommonPackageElement element = libraryManager.getElement(item.getUri(), versionedItem.getVersion());
		
		if (element == null)
		{
			// Something really weird happened...
			return descriptors;
		}
		
		MCommonPackageFile packFile = (MCommonPackageFile) element.eContainer();
		
		for (MCommonPackage importedPackage : packFile.getImports())
		{
			String ipackLibraryID =  LibraryAdapterFactory.getAdapterFactory().getLibraryID(importedPackage.eContainer().eClass().getName());
			
			MDescriptor importedPackageDesc = libdescFactory.eINSTANCE.createMDescriptor();

			LibraryAdapter ipackLibraryAdapter = 
					LibraryAdapterFactory.getAdapterFactory().getAdapter(ipackLibraryID);
			ILibraryManager ipackLibraryManager = null;
			
			if (ipackLibraryAdapter != null)
			{
				ipackLibraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
			}
			
			if (ipackLibraryManager == null)
			{
				// Something really weird happened...
				return descriptors;
			}
			
			importedPackageDesc.setLibrary(ipackLibraryID);
			importedPackageDesc.setItem(importedPackage.eClass().getName());
			importedPackageDesc.setUri(importedPackage.getUri());
			descriptors.add(importedPackageDesc);
		}
		
		for (MCommonPackageElement elem : getReferencedElements(element))
		{
			// The elements might be of a different library!!
			MCommonPackage elemPack = ((MCommonPackageFile) elem.eContainer()).getPackage();
			String elemLibraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(elemPack.eContainer().eClass().getName());
			LibraryAdapter elemAdapter = 
					LibraryAdapterFactory.getAdapterFactory().getAdapter(elemLibraryID);
			ILibraryManager elemLibraryManager = null;
			ILibraryEncoder encoder = null;
			if (adapter != null)
			{
				elemLibraryManager = (ILibraryManager) elemAdapter.adapt(ILibraryManager.class);
				encoder = (ILibraryEncoder) elemAdapter.adapt(ILibraryEncoder.class);
			}
			
			if (elemLibraryManager != null && encoder != null)
			{
				MCommonPackageVersionedItem vitem = elemLibraryManager.getVersionedItem(elem.getUri(), elem.getVersion());
				descriptors.addAll(encoder.getDescriptors(vitem));
			}
		}
		
		MDescriptor descriptor = libdescFactory.eINSTANCE.createMDescriptor();

		descriptor.setLibrary(libraryID);
		descriptor.setItem(versionedItem.eClass().getName());
		descriptor.setUri(element.getUri());
		
		MDescriptorField version = libdescFactory.eINSTANCE.createMDescriptorField();
		version.setName(LibraryDescriptor.VERSION_FIELDNAME);
		version.setValue(element.getVersion());
		descriptor.getFields().add(version);
		
		MDescriptorField remoteModelURI = libdescFactory.eINSTANCE.createMDescriptorField();
		remoteModelURI.setName(LibraryDescriptor.REMOTEMODELURI_FIELDNAME);
		remoteModelURI.setValue(versionedItem.getRemoteModelURI());
		descriptor.getFields().add(remoteModelURI);
		
		// Now we have to add the fields:
		for (Iterator<EAttribute> a = versionedItem.eClass().getEAllAttributes().iterator(); a.hasNext(); )
		{
			EAttribute attribute = a.next();
			if (attribute.getName().matches(commonPackage.eINSTANCE.getMCommonPackageVersionedItem_Version().getName()) ||
				attribute.getName().matches(commonPackage.eINSTANCE.getMCommonPackageVersionedItem_RemoteModelURI().getName()) ||
				attribute.getName().matches(commonPackage.eINSTANCE.getMCommonPackageVersionedItem_LocalModelURI().getName()) ||
				attribute.getEAttributeType() != EcorePackage.eINSTANCE.getEString())
			{
				continue;
			}
			MDescriptorField field = libdescFactory.eINSTANCE.createMDescriptorField();
			field.setName(attribute.getName());
			field.setValue((String) versionedItem.eGet(attribute));
			descriptor.getFields().add(field);
			
		}

		descriptors.add(descriptor);

		return descriptors;
	}


	@Override
	public List<MDescriptor> getDescriptors(MCommonPackageItem item) throws LibraryManagerException {
		
		List<MDescriptor> descriptors = new ArrayList<MDescriptor>();
		
		for (Iterator<MCommonPackageVersionedItem> i = item.getVersionedItems().iterator(); i.hasNext(); )
		{
			MCommonPackageVersionedItem versionedItem = i.next();
			descriptors.addAll(getDescriptors(versionedItem));
		}
		return descriptors;
	}

	@Override
	public List<MDescriptor> getDescriptors(MCommonPackage _package) throws LibraryManagerException {
		
		List<MDescriptor> descriptors = new ArrayList<MDescriptor>();
		
		for (Iterator<MCommonPackageItem> i = _package.getItems().iterator(); i.hasNext(); )
		{
			MCommonPackageItem item = i.next();
			descriptors.addAll(getDescriptors(item));
		}
		return descriptors;
	}

}
