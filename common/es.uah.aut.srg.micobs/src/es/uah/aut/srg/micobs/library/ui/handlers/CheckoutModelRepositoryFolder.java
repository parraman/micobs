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

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.modeling.util.svn.SVNUtil;

/**
 * Class that implements the handler used to checkout the repository folder
 * where a given model element is stored. The URL of the repository is
 * extracted from the corresponding versioned item stored in the library. 
 *
 */
public class CheckoutModelRepositoryFolder extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		
		if (selection.getFirstElement() instanceof MCommonPackageVersionedItem)
		{
			MCommonPackageVersionedItem item = (MCommonPackageVersionedItem)selection.getFirstElement();
			
			Shell parentShell = HandlerUtil.getActiveShell(event);
			
			try {
				SVNUtil.checkoutRemoteFolder(parentShell, item.getRepositoryFolderURI());
			} catch (CoreException e) {
				throw new ExecutionException(e.getMessage());
			} catch (IOException e) {
				throw new ExecutionException(e.getMessage());
			}
		}
		
		return null;
	}
	

}
