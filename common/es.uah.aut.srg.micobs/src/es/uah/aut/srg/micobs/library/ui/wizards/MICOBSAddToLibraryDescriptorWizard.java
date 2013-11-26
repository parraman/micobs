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
package es.uah.aut.srg.micobs.library.ui.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;
import es.uah.aut.srg.micobs.libdesc.provider.libdescItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.library.LibraryDescriptor;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.modeling.util.ui.LoadModelPage;

/**
 * This class implements the wizard used to add library descriptors to an
 * existing file. The wizard asks the use which file to append, checks that 
 * the file is correct and then appends the selected info at the end of the file.
 *
 */
public class MICOBSAddToLibraryDescriptorWizard extends BasicNewResourceWizard {

	protected LoadModelPage loadModelPage;
	
	@Override
	public void addPages() {
		
	    loadModelPage = new LoadModelPage(
	    		MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptorpageName"),
	    		MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptorpageTitle"),
	    		MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptorpageDescription"),
	    		MICOBSPlugin.INSTANCE.getString("_UI_libdescEditorFilenameExtensions"),
	    		libdescPackage.eINSTANCE.getMDescriptorList(),
	    		new libdescItemProviderAdapterFactory(),
	    		null);

	    addPage(loadModelPage);		
	}

	@Override
	public boolean performFinish() {

		final BasicDiagnostic diagnostics = new BasicDiagnostic(MICOBSPlugin.INSTANCE.getSymbolicName(),
													0, "Library Descriptors load", null);
		try 
		{
			getContainer().run(true, true, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException 
				{	
					monitor.beginTask("Loading library descriptors", 100); //$NON-NLS-1$
						
					final Exception except[] = new Exception[1];

					getShell().getDisplay().syncExec(new Runnable() {

						@Override
						public void run() {
							
							try {
								getContainer().run(false, true, new IRunnableWithProgress() {
									
									public void run(IProgressMonitor monitor) 
										throws InvocationTargetException, InterruptedException 
									{
										
										MDescriptorList rootObject = (MDescriptorList)loadModelPage.getModel();
										
										for (Iterator<?> i = selection.iterator(); i.hasNext(); )
										{
											Object object = i.next();
											
											if (object instanceof MCommonPackageVersionedItem)
											{
												MCommonPackageVersionedItem versionedItem = (MCommonPackageVersionedItem)object;
												EObject root = EcoreUtil.getRootContainer(versionedItem);
												String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(root.eClass().getName());
												LibraryAdapter adapter = 
														LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
												if (adapter != null)
												{
													try {
														ILibraryEncoder encoder = (ILibraryEncoder)adapter.adapt(ILibraryEncoder.class);
														if (encoder != null)
														{
															List<MDescriptor> descriptors = encoder.getDescriptors(versionedItem);
															rootObject.getDescriptors().addAll(0, descriptors);
														}
													} catch (LibraryManagerException e) {
														MICOBSPlugin.INSTANCE.log(e);
													}	
												}
											}
											else if (object instanceof MCommonPackageItem)
											{
												MCommonPackageItem item = (MCommonPackageItem)object;
												EObject root = EcoreUtil.getRootContainer(item);
												String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(root.eClass().getName());
												LibraryAdapter adapter = 
														LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
												if (adapter != null)
												{
													try {
														ILibraryEncoder encoder = (ILibraryEncoder)adapter.adapt(ILibraryEncoder.class);
														if (encoder != null)
														{
															List<MDescriptor> descriptors = encoder.getDescriptors(item);
															rootObject.getDescriptors().addAll(0, descriptors);
														}
													} catch (LibraryManagerException e) {
														MICOBSPlugin.INSTANCE.log(e);
													}	
												}
											}
											else if (object instanceof MCommonPackage)
											{
												MCommonPackage pack = (MCommonPackage)object;
												EObject root = EcoreUtil.getRootContainer(pack);
												String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(root.eClass().getName());
												LibraryAdapter adapter = 
														LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
												if (adapter != null)
												{
													try {
														ILibraryEncoder encoder = (ILibraryEncoder)adapter.adapt(ILibraryEncoder.class);
														if (encoder != null)
														{
															List<MDescriptor> descriptors = encoder.getDescriptors(pack);
															rootObject.getDescriptors().addAll(0, descriptors);
														}
													} catch (LibraryManagerException e) {
														MICOBSPlugin.INSTANCE.log(e);
													}	
												}
											}
											else if (object instanceof MCommonLibrary)
											{
												MCommonLibrary library = (MCommonLibrary) object;
												String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(library.eClass().getName());
												LibraryAdapter adapter = 
														LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
												if (adapter != null)
												{
													try {
														ILibraryEncoder encoder = (ILibraryEncoder)adapter.adapt(ILibraryEncoder.class);
														if (encoder != null)
														{
															for (MCommonPackage pack : library.getPackages())
															{
																rootObject.getDescriptors().addAll(0, encoder.getDescriptors(pack));
															}
														}
													} catch (LibraryManagerException e) {
														MICOBSPlugin.INSTANCE.log(e);
													}	
												}
											}
											LibraryDescriptor.removeDuplicatedDescriptors(rootObject);
										}
										// Save the contents of the resource to the file system.
										//
										Map<Object, Object> options = new HashMap<Object, Object>();
										options.put(XMLResource.OPTION_ENCODING, "UTF-8");
										
										try {
											rootObject.eResource().save(options);
										} catch (IOException e) {
											MICOBSPlugin.INSTANCE.log(e);
										}
										monitor.done();
									}
								});

							} catch (InvocationTargetException e) {
								except[0] = e;
							} catch (InterruptedException e) {
								except[0] = e;
							}	
						}
					});
												
					if (except[0] != null)
					{
						if (except[0] instanceof InvocationTargetException) {
							throw (InvocationTargetException)except[0];
						}
						if (except[0] instanceof InterruptedException) {
							throw (InterruptedException)except[0];
						}
						throw new InvocationTargetException(except[0]);
					}
						
					monitor.done();
				}	
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
		
		if (diagnostics.getSeverity() != Diagnostic.OK)
		{
		      DiagnosticDialog.open
		        (getShell(), 
		        	MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptordiagnosispageTitle"),
		        	MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptordiagnosisError_message"),
		        	diagnostics);
		}
		
		return true;

	}

}
