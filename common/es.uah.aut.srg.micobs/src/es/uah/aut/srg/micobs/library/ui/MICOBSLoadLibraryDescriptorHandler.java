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
package es.uah.aut.srg.micobs.library.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import es.uah.aut.srg.micobs.library.ui.wizards.MICOBSLoadLibraryDescriptorWizard;

/**
 * Handler that launches the wizard to load and install a library descriptors
 * list.
 * 
 * @see MICOBSLoadLibraryDescriptorWizard
 *
 */
public class MICOBSLoadLibraryDescriptorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		MICOBSLoadLibraryDescriptorWizard wizard = new MICOBSLoadLibraryDescriptorWizard();
		if (HandlerUtil.getCurrentSelection(event) instanceof IStructuredSelection)
		{
			wizard.init(HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench(), 
				(IStructuredSelection) HandlerUtil.getCurrentSelection(event));
		}
		else
		{
			wizard.init(HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench(), null);
		}
		
		Shell shell = HandlerUtil.getActiveShell(event);
		
		WizardDialog dialog = new WizardDialog(shell, wizard);
		
		dialog.create();
		dialog.open();
		
		return null;
	}

}
