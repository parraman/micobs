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
package es.uah.aut.srg.micobs.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Generic wizard to define new model files.
 *
 */
public abstract class NewMICOBSFileWizard extends Wizard implements INewWizard {

    private IWorkbench workbench;
    private IContainer initialFolder;
    
    protected abstract void generateFile(MICOBSResourceCreationPage page, IProgressMonitor progressMonitor);
    protected abstract String getFileExtension();
    protected abstract void initializeDefaultPageImageDescriptor();
    
    protected abstract MICOBSResourceCreationPage getResourceCreationPage();
	
	@Override
	public void addPages() {		
		addPage(getResourceCreationPage());
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		if (selection != null &&
			selection.size() == 1 &&
			selection.getFirstElement() instanceof IContainer)
		{
			this.initialFolder = (IContainer)selection.getFirstElement();
		}
		
		initializeDefaultPageImageDescriptor();
	}
	
	/**
	 * Returns the initially selected folder.
	 * @return the initially selected folder.
	 */
	protected IContainer getInitialFolder()
	{
		return initialFolder;
	}

	@Override
	public boolean performFinish() {
		
		try 
		{
			getContainer().run(true, true, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException 
				{	
					monitor.beginTask("Creating project", 100); //$NON-NLS-1$
					
					final Exception except[] = new Exception[1];

					getShell().getDisplay().syncExec(new Runnable() {

						@Override
						public void run() 
						{			
							WorkspaceModifyOperation op = new WorkspaceModifyOperation() 
							{
								protected void execute(IProgressMonitor progressMonitor)
									throws CoreException, InvocationTargetException,
									InterruptedException
								{
									generateFile(getResourceCreationPage(), progressMonitor);
								}
							};
							
							try {
								getContainer().run(false, true, op);
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
					
					getShell().getDisplay().syncExec(new Runnable() {

						@Override
						public void run() 
						{			
							try {
								getContainer().run(false, true, new IRunnableWithProgress() 
								{
									public void run(IProgressMonitor monitor) 
										throws InvocationTargetException, InterruptedException 
									{
										try {
											getResourceCreationPage().getRootFolder().refreshLocal(IProject.DEPTH_INFINITE, monitor);
										} catch (CoreException e) {
											except[0] = e;
										}
									}
								});
							} catch (InvocationTargetException e) {
								except[0] = e;
							} catch (InterruptedException e) {
								except[0] = e;
							}	
						}	
					});
				}
				
			});

		} catch (InvocationTargetException e) {
			MICOBSPlugin.INSTANCE.log(e);
			return false;
		} catch (InterruptedException e) {
			return false;
		}
		
        IFile file = getResourceCreationPage().getFile();
        
        if (file != null && file.exists())
        {
			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(file);
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
					(new FileEditorInput(file),
					 workbench.getEditorRegistry().getDefaultEditor(file.getFullPath().toString()).getId());					 	 
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), "Open Editor", exception.getMessage());
				return false;
			}

			return true;
        }
        return true;
	}
	
}
