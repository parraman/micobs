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

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;
import es.uah.aut.srg.micobs.libdesc.provider.libdescItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.library.decoder.ILibraryDecoder;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.modeling.util.ui.LoadModelPage;

/**
 * This class implements the wizard used to select and load a library
 * descriptor file. It requests the user to provide a descriptor file and,
 * after checking it, it decodes it and upload its contents to the 
 * corresponding local libraries.
 *
 */
public class MICOBSLoadLibraryDescriptorWizard extends BasicNewResourceWizard {

	protected LoadModelPage loadModelPage;
	
	AdapterFactory itemProviderAdapterFactory = new libdescItemProviderAdapterFactory();
	
	@Override
	public boolean needsProgressMonitor() {
		return true;
	}

	@Override
	public void addPages() {
		
		URI selectionURI = null;

		if (getSelection() instanceof IStructuredSelection &&
			((IStructuredSelection)getSelection()).size() == 1)
		{
			Object selection = ((IStructuredSelection)getSelection()).getFirstElement();
			if (selection instanceof IFile)
			{
				IFile resource = (IFile)selection;
				selectionURI = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			}
		}
		
	    loadModelPage = new LoadModelPage(
	    		MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptorpageName"),
	    		MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptorpageTitle"),
	    		MICOBSPlugin.INSTANCE.getString("_UI_loadlibrarydescriptorpageDescription"),
	    		MICOBSPlugin.INSTANCE.getString("_UI_libdescEditorFilenameExtensions"),
	    		libdescPackage.eINSTANCE.getMDescriptorList(),
	    		itemProviderAdapterFactory,
	    		selectionURI);

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
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					
					MDescriptorList descriptorList = (MDescriptorList)loadModelPage.getModel();
					
					if (descriptorList.getDescriptors().size() == 0)
					{
						monitor.done();
						return;
					}
					
					monitor.beginTask("Loading library descriptors", descriptorList.getDescriptors().size());	
					
					for (Iterator<MDescriptor> d = descriptorList.getDescriptors().iterator(); d.hasNext(); )
					{
						if (monitor.isCanceled())
						{
							break;
						}

						MDescriptor desc = d.next();
						LibraryAdapter adapter = 
							LibraryAdapterFactory.getAdapterFactory().getAdapter(desc.getLibrary());
						if (adapter == null)
						{
							CheckingDiagnostic diag = CheckingDiagnostic.createError(
									MICOBSPlugin.INSTANCE.getString("_UI_UnknownLibraryError_message",
											new Object[] { desc.getLibrary() }), desc);
							diagnostics.add(diag);
							continue;
						}
						ILibraryDecoder decode = null;
						if ((decode = (ILibraryDecoder) adapter.adapt(ILibraryDecoder.class)) == null)
						{
							CheckingDiagnostic diag = CheckingDiagnostic.createError(
									MICOBSPlugin.INSTANCE.getString("_UI_LibraryInstallError_message",
											new Object[] { desc.getUri() }), desc);
							diagnostics.add(diag);
							continue;
						}
						Diagnostic diag = null;
						if ((diag = decode.decodeDescriptor(desc, new SubProgressMonitor(monitor, 1))) != null);
						{
							String descriptorLabel = null;
							IItemLabelProvider itemLabelProvider = (IItemLabelProvider)itemProviderAdapterFactory.adapt(desc, IItemLabelProvider.class);
        					if (itemLabelProvider != null)
        					{
        						descriptorLabel = itemLabelProvider.getText(desc);
        					}
        					else
        					{
        						descriptorLabel = EcoreUtil.getIdentification(desc);
        					}
        					CheckingDiagnostic diagnostic = 
        							CheckingDiagnostic.createOK
        							(EcorePlugin.INSTANCE.getString("_UI_DiagnosticRoot_diagnostic", new Object[] { descriptorLabel }),
        									desc);
							diagnostic.add(diag);
							diagnostics.add(diagnostic);
						}
					}

					monitor.done();
					
				}
			});

		} catch (InvocationTargetException e) {
			MICOBSPlugin.INSTANCE.log(e);
			return false;
		} catch (InterruptedException e) {
			MICOBSPlugin.INSTANCE.log(e);
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
