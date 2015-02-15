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

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Class that implements the action used to add a new package to a library.
 *
 */
public class AddPackageAction extends CommandActionHandler {

	/**
	 * The library manager object asociated to the library.
	 */
	protected ILibraryManager libraryManager;
	
	/**
	 * The object factory used to create the new package objects.
	 */
	protected EFactory factory;
	
	@Override
	public Command createCommand(Collection<?> selection)
	{
		  return new AddPackageCommand(domain, selection, 
				  libraryManager);
	}

	public AddPackageAction(ILibraryManager libraryManager,
			EFactory factory,
			EClass packageClass)
	{
	    super(null, MICOBSPlugin.INSTANCE.getString("_UI_AddPackageCommand_label"));
	    this.libraryManager = libraryManager;
	    this.factory = factory;
	}

	public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart)
	{
	    if (workbenchPart instanceof IEditingDomainProvider)
	    {
	      domain = ((IEditingDomainProvider)workbenchPart).getEditingDomain();
	    }
	}

	@Override
	public boolean isEnabled() {
		IStructuredSelection selection = getStructuredSelection();
		if (selection.size() == 1)
		{
			if (selection.getFirstElement() instanceof MCommonLibrary &&
				libraryManager != null)
			{
				return true;
			}
		}
		return false;
	}
	
	
}
