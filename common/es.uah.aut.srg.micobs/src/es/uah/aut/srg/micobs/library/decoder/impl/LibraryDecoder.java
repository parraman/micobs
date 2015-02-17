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
package es.uah.aut.srg.micobs.library.decoder.impl;

import java.util.UUID;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryDescriptor;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.decoder.ILibraryDecoder;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtilProvider;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;
import es.uah.aut.srg.modeling.util.svn.SVNUtil;

/**
 * Common implementation of a library decoder. This object implements a 
 * general library-independent decoder. The object can be parameterized
 * at construction time with the information on the associated library
 * and its items and model elements. It is capable of decoding a
 * specific descriptor, installing the corresponding model
 * element into the library.
 *
 */
public class LibraryDecoder implements ILibraryDecoder {
	
	protected EClass[] itemClasses;
	protected EClass[] elementClasses;
	protected AdapterFactory[] adapterFactories;
	protected EClass packageClass;
	protected EFactory libraryItemFactory;
	
	protected ILibraryManager libraryManager;
	
	protected String[] modelFileExtensions;
	
	public LibraryDecoder(ILibraryManager libraryManager, 
			EClass[] itemClasses, EClass[] elementClasses,
			AdapterFactory[] adapterFactories, EClass packageClass,
			EFactory libraryItemFactory,
			String[] modelFileExtensions) {
		super();
		this.itemClasses = itemClasses;
		this.elementClasses = elementClasses;
		this.adapterFactories = adapterFactories;
		this.packageClass = packageClass;
		this.libraryItemFactory = libraryItemFactory;
		this.libraryManager = libraryManager;
		this.modelFileExtensions = modelFileExtensions;
	}

	/**
	 * Decodes a library descriptor associated to model element.
	 * 
	 * @param versionedItemClass the {@link MCommonPackageVersionedItem}
	 * class corresponding to the element whose descriptor is being decoded.
	 * @param elementClass the class of the model element.
	 * @param adapterFactory the adapter factory of the model element. 
	 * @param descriptor the descriptor that is being decoded.
	 * @param modelFileExtension the extension of the model element file.
	 * @param monitor the monitor that controls the execution process.
	 * @return the diagnostic chain of the decoding process.
	 */
	protected Diagnostic decodePackageItem(EClass versionedItemClass, EClass elementClass,
			AdapterFactory adapterFactory,
			MDescriptor descriptor,
			String modelFileExtension, IProgressMonitor monitor)
	{
		String itemURI = descriptor.getUri();

		String remoteModelURI = null;
		String repositoryFolderURI = null;
		String version = null;
		HashMap<EStructuralFeature, String> fields = new HashMap<EStructuralFeature, String>();
		
		for(Iterator<MDescriptorField> f = descriptor.getFields().iterator(); f.hasNext(); )
		{
			MDescriptorField field = f.next();
			if (field.getName().matches(LibraryDescriptor.REMOTEMODELURI_FIELDNAME))
			{
				if (remoteModelURI != null)
				{
					// Repeated field: ERROR
					return CheckingDiagnostic.createError(
							MICOBSPlugin.INSTANCE.getString("_ERROR_ItemWithRepeatedField", 
									new Object[] { itemURI, field.getName() }), descriptor);
				}
				remoteModelURI = field.getValue();
			}
			if (field.getName().matches(LibraryDescriptor.REPOSITORYFOLDERURI_FIELDNAME))
			{
				if (repositoryFolderURI != null)
				{
					// Repeated field: ERROR
					return CheckingDiagnostic.createError(
							MICOBSPlugin.INSTANCE.getString("_ERROR_ItemWithRepeatedField", 
									new Object[] { itemURI, field.getName() }), descriptor);
				}
				repositoryFolderURI = field.getValue();
			}
			else if (field.getName().matches(LibraryDescriptor.VERSION_FIELDNAME))
			{
				if (version != null)
				{
					// Repeated field: ERROR
					return CheckingDiagnostic.createError(
							MICOBSPlugin.INSTANCE.getString("_ERROR_ItemWithRepeatedField", 
									new Object[] { itemURI, field.getName() }), descriptor);
				}
				version = field.getValue();
			}
			else
			{
				EStructuralFeature feature = versionedItemClass.getEStructuralFeature(field.getName());
				if (feature == null ||
					!(feature instanceof EAttribute))
				{
					return CheckingDiagnostic.createError(
							MICOBSPlugin.INSTANCE.getString("_ERROR_ItemWithWrongField", 
									new Object[] { itemURI, field.getName() }), descriptor);							
				}
				if (fields.get(feature) != null)
				{
					return CheckingDiagnostic.createError(
							MICOBSPlugin.INSTANCE.getString("_ERROR_ItemWithRepeatedField", 
									new Object[] { itemURI, field.getName() }), descriptor);
				}
				fields.put(feature, field.getValue());
			}
		}
		if (remoteModelURI == null)
		{
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_MissingItemField", 
							new Object[] { itemURI, LibraryDescriptor.REMOTEMODELURI_FIELDNAME }), descriptor);
		}
		if (repositoryFolderURI == null)
		{
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_MissingItemField", 
							new Object[] { itemURI, LibraryDescriptor.REPOSITORYFOLDERURI_FIELDNAME }), descriptor);
		}
		if (version == null)
		{
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_MissingItemField", 
							new Object[] { itemURI, LibraryDescriptor.VERSION_FIELDNAME }), descriptor);
		}
		
		File tmp = null;
		try {
			tmp = SVNUtil.loadRemoteFileOnTmp(
					remoteModelURI,
					"model", "." + modelFileExtension, monitor);
		} catch (CoreException e) {
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_ModelElementLoading", 
							new Object[] { remoteModelURI }), descriptor);
		} catch (IOException e) {
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_SavingTmp"), 
							descriptor);
		}

		URI tmpFile = URI.createFileURI(tmp.getAbsolutePath());
		
		// Now I have to check the downloaded file
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(tmpFile, true);
		
		MCommonPackageFile packageFile = (MCommonPackageFile)resource.getContents().get(0);
		
		String elementClassifier = packageFile.getElement().eClass().getName();
		String elementURI = packageFile.getElement().getUri();
		String elementVersion = packageFile.getElement().getVersion();
		
		if (!elementURI.matches(itemURI))
		{
			// The uri of the model file is not the same as the one
			// written in the descriptor!!
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_ModelURIMismatch",
						new Object[] { itemURI, version, elementURI, elementVersion }), 
					descriptor);
		}
		if (!elementVersion.matches(version))
		{
			// The version of the model file is not the same as the one
			// written in the descriptor!!
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_VersionMismatch",
						new Object[] { itemURI, version, elementURI, elementVersion }), 
					descriptor);
		}
		
		try {
			if ((libraryManager.getElement(elementClass, elementURI, elementVersion)) != null)
			{
				// There was a previous element with the same name!
				// We have to remove it and update it
				libraryManager.removeElement(elementClass, elementURI, elementVersion);
			}
		} catch (LibraryManagerException e2) {
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_LibraryLoading"), 
					descriptor);
		}
			
		// Now I have to copy the file

		IPath destPath = libraryManager.getPlugin().getStateLocation().append(
					ILibraryManager.LIBRARY_FOLDER);
		destPath = destPath.append(ILibraryManager.PACKAGES_FOLDER);
		destPath = destPath.append(StringHelper.toLowerDefString(packageFile.getPackage().getUri()));
		destPath = destPath.append(UUID.nameUUIDFromBytes(StringHelper.toLowerDefString(
				elementClassifier, elementURI, elementVersion).getBytes()).toString() + 
				"." + modelFileExtension);
		
		File destFile = new File(destPath.toOSString());
		
		try {
			if (destFile.isFile())
			{
				destFile.setWritable(true);
				destFile.delete();
			}
			FileHelper.copyBinaryFile(tmp.getAbsolutePath(), destPath.toOSString());
			destFile.setWritable(false);
		} catch (IOException e) {
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_CopyingFileToLibrary"), 
							descriptor);
		}

		URI modelURI = URI.createPlatformPluginURI(
				libraryManager.getPlugin().getBundle().getSymbolicName() + "/" +
				ILibraryManager.LIBRARY_FOLDER + "/" +
				ILibraryManager.PACKAGES_FOLDER + "/" +
				StringHelper.toLowerDefString(packageFile.getPackage().getUri()) + "/" +
				UUID.nameUUIDFromBytes(StringHelper.toLowerDefString(elementClassifier, 
						elementURI, elementVersion).getBytes()).toString() +
				"." + modelFileExtension, true);
		
		
		MCommonPackageVersionedItem item;
		
		try {
			item = libraryManager.putElement(modelURI);
		} catch (LibraryManagerException e1) {
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_ModelElementLibraryInsertion", 
							new Object[] { modelURI }), descriptor);
		}
		
		item.setRemoteModelURI(remoteModelURI);
		item.setRepositoryFolderURI(repositoryFolderURI);
		
		for (Iterator<EStructuralFeature> f = fields.keySet().iterator(); f.hasNext(); )
		{
			EStructuralFeature feature = f.next();
			item.eSet(feature, fields.get(feature));
		}
		
		try {
			libraryManager.saveLibraryWithCommandFlush();
		} catch (IOException e) {
			e.printStackTrace();
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_LibrarySave"), descriptor);
		}
		
		// If everything went OK, then we have to return the result of
		// validating the resource.	
		return MICOBSUtilProvider.getMICOBSUtil().validateResource(resource, adapterFactory);

	}
	
	/**
	 * Decodes a library descriptor associated to a package. This kind of descriptors
	 * force the creation of a new package with a given URI.
	 * 
	 * @param descriptor the descriptor that calls for the creation of the package.
	 * @return the diagnostic of the creation process.
	 */
	protected Diagnostic decodePackage(MDescriptor descriptor)
	{
		String packageURI = descriptor.getUri();

		if (libraryManager.getPackage(packageURI) != null)
		{
			// This means that the package already existed!
			return CheckingDiagnostic.createWarning(
					MICOBSPlugin.INSTANCE.getString("_WARN_PackageAlreadyExisted", 
							new Object[] { packageURI }), descriptor);
		}

		IPath newPackageFolder = libraryManager.getPlugin().getStateLocation().append(
        				ILibraryManager.LIBRARY_FOLDER);
		newPackageFolder = newPackageFolder.append(ILibraryManager.PACKAGES_FOLDER);
		newPackageFolder = newPackageFolder.append(StringHelper.toLowerDefString(packageURI));

        FileHelper.createFolder(newPackageFolder.toOSString());
		
		try {
			libraryManager.addPackage(packageURI);
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_PackageCreation",
					new Object[] { packageURI }), descriptor);
		}
		
		try {
			libraryManager.saveLibraryWithCommandFlush();
		} catch (IOException e) {
			e.printStackTrace();
			return CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_ERROR_LibrarySave"), descriptor);
		}
		
		return CheckingDiagnostic.createOK(
				MICOBSPlugin.INSTANCE.getString("_OK_ItemProcessed", 
						new Object[] { descriptor.getItem() }), descriptor);
	}
	
	/**
	 * Main switch that checks if a descriptor corresponds to a model element
	 * or a package. If the descriptor item ID does not match with any of the
	 * classes or with the library package class, then the method returns an
	 * error diagnostic.
	 * 
	 * @param descriptor the descriptor that is being decoded.
	 * @param monitor the monitor that controls the execution process.
	 * @return the diagnostic chain of the operation.
	 */
	protected Diagnostic performSwitch(MDescriptor descriptor, IProgressMonitor monitor)
	{
		if (descriptor.getItem().matches(packageClass.getName()))
		{
			return decodePackage(descriptor);
		}
		
		for (int i = 0; i < itemClasses.length; i++)
		{
			if (descriptor.getItem().matches(itemClasses[i].getName()))
			{
				return decodePackageItem(itemClasses[i], 
						elementClasses[i], 
						adapterFactories[i], descriptor,
						modelFileExtensions[i], monitor);
			}
		}
		return CheckingDiagnostic.createError(
				MICOBSPlugin.INSTANCE.getString("_ERROR_UnknownLibraryDescriptor", 
				new Object[] { descriptor.getItem() }), descriptor);
	}
	
	@Override
	public Diagnostic decodeDescriptor(MDescriptor descriptor, IProgressMonitor monitor) {
			
		return performSwitch(descriptor, monitor);
	}

}
