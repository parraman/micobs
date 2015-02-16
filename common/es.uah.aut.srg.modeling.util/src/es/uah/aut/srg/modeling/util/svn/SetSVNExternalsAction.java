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
package es.uah.aut.srg.modeling.util.svn;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.tigris.subversion.subclipse.core.ISVNLocalResource;
import org.tigris.subversion.subclipse.core.SVNException;
import org.tigris.subversion.subclipse.core.resources.SVNWorkspaceRoot;
import org.tigris.subversion.subclipse.ui.ISVNUIConstants;
import org.tigris.subversion.subclipse.ui.Policy;
import org.tigris.subversion.subclipse.ui.actions.SetSvnPropertyAction;
import org.tigris.subversion.subclipse.ui.actions.WorkbenchWindowAction;

import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Action that updates the SVN externals property of a group of selected
 * resources using the same map. It is a specialization of the class
 * {@link SetSvnPropertyAction}.
 *
 */
public class SetSVNExternalsAction extends WorkbenchWindowAction {

	protected Map<String, String> itemMap;
    protected IResource[] selectedResources;
	
	public void setItemList(Map<String, String> itemList) {
		this.itemMap = itemList;
	}

	protected void execute(final IAction action) throws InvocationTargetException, InterruptedException {
       
		if (action != null && !action.isEnabled()) 
		{ 
        	action.setEnabled(true);
        } 
        else if (itemMap != null)
        {
        	if(getSelectedResources().length > 0) 
        	{
				run(new WorkspaceModifyOperation() {
					public void execute(IProgressMonitor monitor) throws InterruptedException, InvocationTargetException {
						
						for (int i = 0; i < getSelectedResources().length; i++)
						{
							IResource resource = getSelectedResources()[i];
							ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(resource);

							String propertyValue = new String();
							// TODO: assert that the name is correct
							for (Map.Entry<String, String> entry : itemMap.entrySet())
							{
								propertyValue += StringHelper.toLowerDefString(entry.getKey()) + " " + entry.getValue() + "\n";
							}
						
							try {
								svnResource.setSvnProperty("svn:externals", propertyValue, false);
							} catch (SVNException e) {
								throw new InvocationTargetException(e);
							}
						}
					} 
				}, false, PROGRESS_BUSYCURSOR);
        	}
        }
        else
        {
        	if(getSelectedResources().length > 0) 
        	{
				run(new WorkspaceModifyOperation() {
					public void execute(IProgressMonitor monitor) throws InterruptedException, InvocationTargetException {
						for (int i = 0; i < getSelectedResources().length; i++)
						{
							IResource resource = getSelectedResources()[i];
							ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(resource);

							try {
								svnResource.setSvnProperty("svn:externals", "", false);
							} catch (SVNException e) {
								throw new InvocationTargetException(e);
							}
						}
					} 
				}, false, PROGRESS_BUSYCURSOR);
        	}

        }
	}

	protected String getErrorTitle() {
		return Policy.bind("SetSvnPropertyAction.set"); //$NON-NLS-1$
	}

	protected boolean isEnabledForManagedResources() {
		return true;
	}

	protected boolean isEnabledForUnmanagedResources() {
		return false;
	}
	
	protected boolean isEnabledForMultipleResources() {
		return false;
	}

	protected String getImageId() {
		return ISVNUIConstants.IMG_MENU_PROPSET;
	}	

    public void setSelectedResources(IResource[] selectedResources) {
        this.selectedResources = selectedResources;
    }
    
    @Override
    protected IResource[] getSelectedResources() {
        if (selectedResources == null)
            return super.getSelectedResources();
        else
            return selectedResources;
    }

}
