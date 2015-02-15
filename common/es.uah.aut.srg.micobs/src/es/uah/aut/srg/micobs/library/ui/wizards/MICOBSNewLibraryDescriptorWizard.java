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
package es.uah.aut.srg.micobs.library.ui.wizards;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescFactory;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;
import es.uah.aut.srg.micobs.library.LibraryDescriptor;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.library.encoder.ILibraryEncoder;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * This class implements the wizard used to create a new library descriptors file.
 */
public class MICOBSNewLibraryDescriptorWizard extends Wizard implements INewWizard {

	public static final String FILE_EXTENSION = "micobs_libdesc";
	
	protected libdescPackage _libdescPackage = libdescPackage.eINSTANCE;

	protected libdescFactory _libdescFactory = _libdescPackage.getlibdescFactory();
	
	protected MICOBSNewLibraryDescriptorWizardNewFileCreationPage newFileCreationPage;

	protected IStructuredSelection selection;

	protected IWorkbench workbench;

	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		// We are keeping the label and the image from the original wizard
		setWindowTitle(MICOBSPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(MICOBSPlugin.INSTANCE.getImage("full/wizban/Newlibdesc")));
	}
	
	/**
	 * Create a new library descriptor file model.
	 */
	protected MDescriptorList createInitialModel() {
		return _libdescFactory.createMDescriptorList();
	}

	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {

						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						MDescriptorList rootObject = createInitialModel();
						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, "UTF-8");
						
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
											rootObject.getDescriptors().addAll(descriptors);
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
											rootObject.getDescriptors().addAll(descriptors);
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
											rootObject.getDescriptors().addAll(descriptors);
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
												rootObject.getDescriptors().addAll(encoder.getDescriptors(pack));
											}
										}
									} catch (LibraryManagerException e) {
										MICOBSPlugin.INSTANCE.log(e);
									}	
								}
							}
							LibraryDescriptor.removeDuplicatedDescriptors(rootObject);
							
						}
						try {
							resource.save(options);
						} catch (IOException e) {
							MICOBSPlugin.INSTANCE.log(e);
						}
						progressMonitor.done();
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());					 	 
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), MICOBSPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			MICOBSPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new MICOBSNewLibraryDescriptorWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(MICOBSPlugin.INSTANCE.getString("_UI_libdescModelWizard_label"));
		newFileCreationPage.setDescription(MICOBSPlugin.INSTANCE.getString("_UI_libdescModelWizard_description"));
		newFileCreationPage.setFileName(MICOBSPlugin.INSTANCE.getString("_UI_libdescEditorFilenameDefaultBase") + "." + FILE_EXTENSION);
		addPage(newFileCreationPage);
	}
	
	/**
	 * Get the file from the page.
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}
	
	/**
	 * This is the one page of the wizard.
	 */
	public class MICOBSNewLibraryDescriptorWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 */
		public MICOBSNewLibraryDescriptorWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSION.contains(extension)) {
					setErrorMessage(MICOBSPlugin.INSTANCE.getString("_WARN_FilenameExtension", new Object [] { FILE_EXTENSION }));
					return false;
				}
				return true;
			}
			return false;
		}

		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}


}
