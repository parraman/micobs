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
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.ui.IWorkbenchPart;

import es.uah.aut.srg.micobs.library.ILibraryManager;

/**
 * Class that implements the action used to delete a new package from a library.
 */
public class DeletePackageItemAction extends CommandActionHandler {

	protected ILibraryManager libraryManager;
	
	@Override
	public Command createCommand(Collection<?> selection)
	{
		  return new DeletePackageItemCommand(libraryManager, selection);
	}

	public DeletePackageItemAction(ILibraryManager libraryManager)
	{
	    super(null, EMFEditUIPlugin.INSTANCE.getString("_UI_Delete_menu_item"));
	    this.libraryManager = libraryManager;
	}

	public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart)
	{
	    if (workbenchPart instanceof IEditingDomainProvider)
	    {
	      domain = ((IEditingDomainProvider)workbenchPart).getEditingDomain();
	    }
	}

}
