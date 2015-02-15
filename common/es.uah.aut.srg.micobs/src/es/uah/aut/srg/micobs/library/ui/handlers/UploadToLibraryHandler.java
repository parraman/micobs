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
package es.uah.aut.srg.micobs.library.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.tigris.subversion.subclipse.core.ISVNLocalResource;
import org.tigris.subversion.subclipse.core.resources.SVNWorkspaceRoot;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.IParametricReferencingLibraryManager;
import es.uah.aut.srg.micobs.library.IReferencingLibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtilProvider;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.plugin.ModelingUtilPlugin;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Abstract handlers that implements the generic methods to upload a model to
 * a library. For each library, the class has to be overriden and the abstract
 * methods implemented.
 *
 */
public abstract class UploadToLibraryHandler extends AbstractHandler {

	/**
	 * Returns the manager of the library to which the elements will be
	 * uploaded.
	 * 
	 * If an error occurs when accessing the library, the method will
	 * throw a {@link LibraryManagerException}.
	 * 
	 * @return the manager of the library to which the elements will be
	 * uploaded.
	 */
	protected abstract ILibraryManager getLibraryManager() throws LibraryManagerException;
	
	/**
	 * Checks that the root class of the file that stores the model is
	 * compatible with the ones managed by the library.
	 * 
	 * @param packageFile the root class of the model file.
	 * @return <code>true</code> if the class is supported and <code>false</code>
	 * otherwise.
	 */
	protected abstract boolean checkPackageFile(MCommonPackageFile packageFile);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		if (selection instanceof IStructuredSelection)
		{
			IStructuredSelection selectionList = (IStructuredSelection)selection;
			
			Shell parentShell = HandlerUtil.getActiveShell(event);

			// We have to open the library like this because we later want to
			// save it. Otherwise, the proper way is to use a platform URI
			
			ILibraryManager libraryManager;
			try {
				libraryManager = getLibraryManager();
			} catch (LibraryManagerException e) {
				throw new ExecutionException(e.getMessage());
			}
									
			for (Iterator<?> i = selectionList.iterator(); i.hasNext(); )
			{
				Object object = i.next();
				if (object instanceof IResource)
				{
					IResource resource = (IResource)object;
					
					URI resourceURI = URI.createPlatformResourceURI(resource.getFullPath().toPortableString(), true);
					String resourceExtension = resource.getFileExtension();
					
					ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(resource);
					ISVNLocalResource svnContainer = null;
					if (resource.getParent() != null &&
						resource.getParent().getName().matches(MICOBSPlugin.INSTANCE.getString("_MICOBSProject_models_foldername")) &&
						resource.getParent().getParent() != null)
					{
						svnContainer = SVNWorkspaceRoot.getSVNResourceFor(resource.getParent().getParent());
					}
					else if (resource.getParent() != null)
					{
						svnContainer = SVNWorkspaceRoot.getSVNResourceFor(resource.getParent());
					}
					else if (resource.getProject() != null)
					{
						svnContainer = SVNWorkspaceRoot.getSVNResourceFor(resource.getProject());
					}
					String remoteModelURI = null;
					String repositoryFolderURI = null;
					if (svnResource != null && 
						svnResource.getUrl() != null)
					{
						remoteModelURI = svnResource.getUrl().toString();
					}
					if (svnContainer != null &&
						svnContainer.getUrl() != null)
					{
						repositoryFolderURI = svnContainer.getUrl().toString();
					}
					
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource emfResource = resourceSet.getResource(resourceURI, true);
					final MCommonPackageFile packageFile = (MCommonPackageFile)emfResource.getContents().get(0);
					
					if (!checkPackageFile(packageFile))
					{
						MessageDialog.openError(parentShell, "Wrong file type", "This is not a valid MICOBS file");
						return null;
					}
									    
				    Diagnostic diagnostic = MICOBSUtilProvider.getMICOBSUtil().validateResource(emfResource, getModelAdapterFactory(packageFile));
					
				    if (diagnostic.getSeverity() != Diagnostic.OK)
				    {
						handleDiagnostic(diagnostic);
						return null;
				    }
					
				    String elementClassifier = packageFile.getElement().eClass().getName();
					String elementURI = packageFile.getElement().getUri();
					String elementVersion = packageFile.getElement().getVersion();
					
					MCommonPackageVersionedItem oldItem = null;
					MCommonPackageElement oldElement = null;
					
					try {
						if ((oldElement = getLibraryManager().getElement(packageFile.getElement().eClass(), 
								elementURI, elementVersion)) != null)
						{
							// There was a previous element with the same name!
							oldItem = getLibraryManager().getVersionedItem(oldElement);
							if (MessageDialog.openQuestion(parentShell, "Item previously exists!", "Item with the same URI <" +
									elementURI + "> and version <" + elementVersion + "> previously exists. Overwrite?"))
							{
								try {
									getLibraryManager().removeElement(oldElement.eClass(), elementURI, elementVersion);
								} catch (LibraryManagerException e) {
									MessageDialog.openError(parentShell, "Remove Element", "Error when removing the element");
									return null;
								}
							}
							else
							{
								return null;
							}
						}
						if (packageFile.getElement() instanceof MCommonPackageReferencingElement)
						{
							// It is a referencing element, we have to check if there is a
							// previously loaded item in the library that points to the same element
							MCommonPackageElement referencedElement = 
									((MCommonPackageReferencingElement)packageFile.getElement()).getReferencedElement();
							IReferencingLibraryManager manager = (IReferencingLibraryManager)getLibraryManager();
							MCommonPackageElement referencingElement = null;
							if ((referencingElement = manager.getReferencingElement(referencedElement, packageFile.getElement().eClass())) != null)
							{
								// There was a previous element pointing to the same reference
								if (MessageDialog.openQuestion(parentShell, "Previously referenced item!", "An item pointing to the element " +
										MICOBSStringHelper.getInstance().getElementName(referencedElement) + " previously exists. Overwrite?"))
								{
									try {
										getLibraryManager().removeElement(referencingElement.eClass(), 
												referencingElement.getUri(), referencingElement.getVersion());
									} catch (LibraryManagerException e) {
										MessageDialog.openError(parentShell, "Remove Element", "Error when removing the element");
										return null;
									}
								}
								else
								{
									return null;
								}
							}
						}
						else if (packageFile.getElement() instanceof MCommonPackageParametricReferencingElement)
						{
							// It is a referencing element, we have to check if there is a
							// previously loaded item in the library that points to the same element
							MCommonPackageElement referencedElement = 
									((MCommonPackageParametricReferencingElement)packageFile.getElement()).getReferencedElement();
							MCommonPackageElement parameterElement = 
									((MCommonPackageParametricReferencingElement)packageFile.getElement()).getParameterElement();
							
							IParametricReferencingLibraryManager manager = (IParametricReferencingLibraryManager)getLibraryManager();
							
							MCommonPackageElement referencingElement = null;
							if ((referencingElement = manager.getParametricReferencingElement(referencedElement, parameterElement, 
									packageFile.getElement().eClass())) != null)
							{
								// There was a previous element pointing to the same reference
								if (MessageDialog.openQuestion(parentShell, "Previously referenced item!", "An item pointing to the element " +
										MICOBSStringHelper.getInstance().getElementName(referencedElement) + " with parameter " +
										MICOBSStringHelper.getInstance().getElementName(parameterElement) + " previously exists. Overwrite?"))
								{
									try {
										getLibraryManager().removeElement(referencingElement.eClass(),
												referencingElement.getUri(), referencingElement.getVersion());
									} catch (LibraryManagerException e) {
										MessageDialog.openError(parentShell, "Remove Element", "Error when removing the element");
										return null;
									}
								}
								else
								{
									return null;
								}
							}
						}
					} catch (LibraryManagerException e) {
						throw new ExecutionException(e.getMessage());
					}
						
					// Now I have to copy the file
						
					IPath path = resource.getLocation();
						
					IPath destPath = libraryManager.getPlugin().getStateLocation().append(ILibraryManager.LIBRARY_FOLDER);
					destPath = destPath.append(ILibraryManager.PACKAGES_FOLDER);
					destPath = destPath.append(StringHelper.toLowerDefString(packageFile.getPackage().getUri()));
						
					destPath = destPath.append(StringHelper.toLowerDefString(
							elementClassifier, elementURI, elementVersion) +
							"." + resourceExtension);
					
					File destFile = new File(destPath.toOSString());
					
					try {
						if (destFile.isFile())
						{
							destFile.setWritable(true);
							destFile.delete();
						}
						FileHelper.copyBinaryFile(path, destPath.toOSString());
						destFile.setWritable(false);
						
					} catch (IOException e) {
						throw new ExecutionException(e.toString());
					}
					
					URI modelURI;
					try {
						modelURI = URI.createPlatformPluginURI(
								getLibraryManager().getPlugin().getBundle().getSymbolicName() + "/" +
								ILibraryManager.LIBRARY_FOLDER + "/" +
								ILibraryManager.PACKAGES_FOLDER + "/" +
								StringHelper.toLowerDefString(packageFile.getPackage().getUri()) + "/" +
								StringHelper.toLowerDefString(elementClassifier, elementURI, elementVersion) +
								"." + resourceExtension, true);
					} catch (LibraryManagerException e) {
						throw new ExecutionException(e.toString());
					}

					MCommonPackageVersionedItem newItem;
					try {
						newItem = getLibraryManager().putElement(modelURI);
					} catch (LibraryManagerException e) {
						MessageDialog.openError(parentShell, "Add Element", e.getMessage());
						return null;
					}
					if (remoteModelURI != null)
					{
						newItem.setRemoteModelURI(remoteModelURI);
					}
					if (repositoryFolderURI != null)
					{
						newItem.setRepositoryFolderURI(repositoryFolderURI);
					}
					if (oldItem != null)
					{
						for (Iterator<EStructuralFeature> f = oldItem.eClass().getEAllStructuralFeatures().iterator(); f.hasNext(); )
						{
							EStructuralFeature feature = f.next();
							if (feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_LocalModelURI() &&
								feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_Version() &&
								feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_RemoteModelURI() &&
								feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_RepositoryFolderURI() &&
								oldItem.eGet(feature) != null)
							{
								newItem.eSet(feature, oldItem.eGet(feature));
							}
						}
					}
				}
			}
			try {
				getLibraryManager().saveLibrary();
			} catch (IOException e) {
				throw new ExecutionException(e.getMessage());
			} catch (LibraryManagerException e) {
				throw new ExecutionException(e.getMessage());
			}
		}
		return null;
	}

	/**
	 * Returns the item provider adapter factory that corresponds to the specific
	 * model file.
	 * 
	 * @param packageFile the root class of the model file.
	 * @return the item provider adapter factory that corresponds to the specific
	 * model file.
	 */
	protected abstract AdapterFactory getModelAdapterFactory(MCommonPackageFile packageFile);
	
	/**
	 * Handles the diagnostic of the given model file. If the file has any kind of error, the
	 * upload will be interrupted and a dialog will be shown with the cause.
	 * 
	 * @param diagnostic the diagnostic of the given model file.
	 */
	protected void handleDiagnostic(Diagnostic diagnostic)
	{
		int severity = diagnostic.getSeverity();
		String title = null;
		String message = null;

		if (severity == Diagnostic.ERROR || severity == Diagnostic.WARNING)
		{
			title = ModelingUtilPlugin.getString("_UI_ValidationProblems_title");
			message = ModelingUtilPlugin.getString("_UI_ValidationProblems_message");
		}
		else
		{
			title = ModelingUtilPlugin.getString("_UI_ValidationResults_title");
			message = ModelingUtilPlugin.getString(severity == Diagnostic.OK ? "_UI_ValidationOK_message" : "_UI_ValidationResults_message");
		}

		if (diagnostic.getSeverity() == Diagnostic.OK)
		{
			MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message);
		}
		else
		{
			DiagnosticDialog.openProblem
				(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message, diagnostic);
		}
	}
}
