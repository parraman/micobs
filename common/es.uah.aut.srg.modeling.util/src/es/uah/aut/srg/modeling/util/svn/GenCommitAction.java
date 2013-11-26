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
package es.uah.aut.srg.modeling.util.svn;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.tigris.subversion.subclipse.core.ISVNLocalResource;
import org.tigris.subversion.subclipse.core.SVNException;
import org.tigris.subversion.subclipse.core.SVNProviderPlugin;
import org.tigris.subversion.subclipse.core.commands.GetStatusCommand;
import org.tigris.subversion.subclipse.core.resources.SVNWorkspaceRoot;
import org.tigris.subversion.subclipse.core.util.File2Resource;
import org.tigris.subversion.subclipse.core.util.Util;
import org.tigris.subversion.subclipse.ui.ISVNUIConstants;
import org.tigris.subversion.subclipse.ui.Policy;
import org.tigris.subversion.subclipse.ui.actions.CommitAction;
import org.tigris.subversion.subclipse.ui.actions.WorkbenchWindowAction;
import org.tigris.subversion.subclipse.ui.operations.CommitOperation;
import org.tigris.subversion.svnclientadapter.ISVNStatus;
import org.tigris.subversion.svnclientadapter.SVNStatusKind;
import org.tigris.subversion.svnclientadapter.utils.SVNStatusUtils;

/**
 * Action that commits a set of resources. It is a modification of the
 * class {@link CommitAction}.
 *
 */
public class GenCommitAction extends WorkbenchWindowAction {

    protected IResource[] resourcesToCommit;
    protected String url;
    protected boolean hasUnaddedResources;
    protected boolean commit;
    protected boolean keepLocks;
    protected IResource[] selectedResources;
    private String proposedComment;
    private boolean canRunAsJob = false;
    
    private HashMap<IResource, SVNStatusKind> statusMap;
	
    public GenCommitAction() {
    	
    }
    
	public GenCommitAction(String proposedComment) {
		this.proposedComment = proposedComment;
	}

	public void execute(IAction action) throws InvocationTargetException, InterruptedException {
		statusMap = new HashMap<IResource, SVNStatusKind>();
		final IResource[] resources = getSelectedResources();
	    final List<IResource> resourcesToBeAdded = new ArrayList<IResource>();
	    final List<IResource> resourcesToBeDeleted = new ArrayList<IResource>();
            if (action != null && !action.isEnabled()) { 
            	action.setEnabled(true);
            } 
            else {
            	run(new IRunnableWithProgress() {
        			public void run(IProgressMonitor monitor) throws InvocationTargetException {
        				try {	
        				    // search for modified or added, non-ignored resources in the selection.
        				    resourcesToCommit = getModifiedResources(resources, monitor);
        					
        				    // if no changes since last commit, do not show commit dialog.
        				    if (resourcesToCommit.length == 0) {
        					    commit = false;
        					} else {
        					    commit = true;
        					}

        				    // if commit was not canceled, create a list of any
        				    // unversioned resources that were selected and a list of any missing
        				    // resources that were selected.
        					if (commit) {
        					    for (int i = 0; i < resourcesToCommit.length; i++) {
        					        IResource resource = resourcesToCommit[i];
        					        ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(resource);
        					        if (svnResource.exists() && !svnResource.isManaged()) resourcesToBeAdded.add(resource);
        					        if (svnResource.getStatus().isMissing()) resourcesToBeDeleted.add(resource);
        					    }
        					}
        				} catch (TeamException e) {
        					throw new InvocationTargetException(e);
        				}
        			}
        		}, false, PROGRESS_BUSYCURSOR); //$NON-NLS-1$
        		
        		if (!commit) {
        			return; // user canceled
        		}
        		
        		CommitOperation commitOperation = new CommitOperation(getTargetPart(), resources, 
        				(IResource[]) resourcesToBeAdded.toArray(new IResource[resourcesToBeAdded.size()]),
        				(IResource[]) resourcesToBeDeleted.toArray(new IResource[resourcesToBeDeleted.size()]),
        				resourcesToCommit, proposedComment, keepLocks);
        		commitOperation.setCanRunAsJob(canRunAsJob);       		
        		commitOperation.run();
            }
	}
	
	/**
	 * get the modified and unadded resources in resources parameter
	 */	
	protected IResource[] getModifiedResources(IResource[] resources, IProgressMonitor iProgressMonitor) throws SVNException {
		IResource[] allResources = getSelectedResources(true);
		List<IResource> allSelections = new ArrayList<IResource>();
		for (int i = 0; i < allResources.length; i++)
			allSelections.add(allResources[i]);
		List<IFile> conflictFiles = new ArrayList<IFile>();	    
		final List<IResource> modified = new ArrayList<IResource>();
	    List<IResource> unversionedFolders = new ArrayList<IResource>();
		hasUnaddedResources = false;
	    for (int i = 0; i < resources.length; i++) {
			 IResource resource = resources[i];
			 ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(resource);
			 
			 // This check is for when the action is called with unmanaged resources
			 if (svnResource.getRepository() == null) {
				 continue;
			 }
			 
			 // if only one resource selected, get url.  Commit dialog displays this.
			 if (resources.length == 1) {
				   url = svnResource.getStatus().getUrlString();
				   if ((url == null) || (resource.getType() == IResource.FILE)) url = Util.getParentUrl(svnResource);
			 }
			 
			 boolean descend = true;
			 if (resource instanceof IContainer)
			 {
				 outer: for (int j = 0; j < allResources.length; j++) {
					 if (allResources[j] == resource) continue;
					 
					 IContainer parent = allResources[j].getParent();
					 while (parent != null)
					 {
						 if (parent.equals(resource))
						 {
							 descend = false;
							 break outer;
						 }
						 parent = parent.getParent();
					 }
				 }
			 }
			 // get adds, deletes, updates and property updates.
			 GetStatusCommand command = new GetStatusCommand(svnResource, descend, false);
			 command.run(iProgressMonitor);
			 ISVNStatus[] statuses = command.getStatuses();
			 boolean switched = false;
			 for (int j = 0; j < statuses.length; j++) {
			     if (SVNStatusUtils.isReadyForCommit(statuses[j]) || SVNStatusUtils.isMissing(statuses[j])) {
			         IResource currentResource = SVNWorkspaceRoot.getResourceFor(resource, statuses[j]);
			         if (currentResource != null && (descend == true || allSelections.contains(currentResource))) {
			             ISVNLocalResource localResource = SVNWorkspaceRoot.getSVNResourceFor(currentResource);
			             if (!localResource.isIgnored()) {
			                 if (!SVNStatusUtils.isManaged(statuses[j])) {
			                 	hasUnaddedResources = true;
			                 	if ((currentResource.getType() != IResource.FILE) && !isSymLink(currentResource))
			                 		unversionedFolders.add(currentResource);
			                 	else {
		                 			if (!modified.contains(currentResource)) {
		                 				modified.add(currentResource);
		   	                 		 if (currentResource instanceof IContainer) statusMap.put(currentResource, statuses[j].getPropStatus());
			                 		 else statusMap.put(currentResource, statuses[j].getTextStatus());				             
			                 		}
			                 	}
			                 } else
			                	 if (!modified.contains(currentResource)) {
			                		 
			                		 if (statuses[j].isSwitched()) {
			                			 switched = true;
				                		 url = statuses[j].getUrlString();
			                		 }
			                		 
			                		 modified.add(currentResource);
			                 		 if (currentResource instanceof IContainer) statusMap.put(currentResource, statuses[j].getPropStatus());
			                 		 else {
			                 			statusMap.put(currentResource, statuses[j].getTextStatus());				             
			                 			if (SVNStatusUtils.isTextConflicted(statuses[j])) {
			                                IFile conflictNewFile = (IFile) File2Resource
			                                .getResource(statuses[j]
			                                        .getConflictNew());
			                                if (conflictNewFile != null) conflictFiles.add(conflictNewFile);
			                                IFile conflictOldFile = (IFile) File2Resource
			                                .getResource(statuses[j]
			                                        .getConflictOld());
			                                if (conflictOldFile != null) conflictFiles.add(conflictOldFile);
			                                IFile conflictWorkingFile = (IFile) File2Resource
			                                .getResource(statuses[j]
			                                        .getConflictWorking());
			                                if (conflictWorkingFile != null) conflictFiles.add(conflictWorkingFile);		                                
			                 			}			                 		 
			                 		 }
			                	 }
			             }
			         }
			     }
			 }
			 if (switched && modified.size() > 1) {
				 url = null;
			 }
	    }
	    
	    IResource[] unaddedResources = getUnaddedResources(unversionedFolders, iProgressMonitor);
	    for (int i = 0; i < unaddedResources.length; i++)
	    	if (!modified.contains(unaddedResources[i])) modified.add(unaddedResources[i]);
	    Iterator<IFile> iter = conflictFiles.iterator();
	    while (iter.hasNext()) {
	    	IFile conflictFile = (IFile)iter.next();
	    	modified.remove(conflictFile);
	    	statusMap.remove(conflictFile);
	    }
	    return (IResource[]) modified.toArray(new IResource[modified.size()]);
	}

    public int getHighestProblemSeverity(IResource[] resources) {
    	int mostSeriousSeverity = -1;
    	
    	for (int i = 0; i < resources.length; i++) {
    		IResource resource = resources[i];
    		try {
				IMarker[] problems = resource.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
				for (int j = 0; j < problems.length; j++) {
					IMarker problem = problems[j];
					int severity = problem.getAttribute(IMarker.SEVERITY, 0);
					if (severity > mostSeriousSeverity) {
						mostSeriousSeverity = severity;
					}
				}
			} catch (CoreException e) {
			}
    	}
    	
    	return mostSeriousSeverity;
    }

    /**
	 * @see org.tigris.subversion.subclipse.ui.actions.SVNAction#getErrorTitle()
	 */
	protected String getErrorTitle() {
		return Policy.bind("CommitAction.commitFailed"); //$NON-NLS-1$
	}

	/**
	 * @see org.tigris.subversion.subclipse.ui.actions.WorkspaceAction#isEnabledForUnmanagedResources()
	 */
	protected boolean isEnabledForUnmanagedResources() {
		return true;
	}
    
    protected boolean isEnabled() throws TeamException {
		
		// invoke the inherited method so that overlaps are maintained
		IResource[] resources = super.getSelectedResources();
		
		// disable if no resources are selected
		if(resources.length==0) return false;
		
		// validate enabled for each resource in the selection
		for (int i = 0; i < resources.length; i++) {
			IResource resource = resources[i];
			
			// no SVN actions are enabled if the selection contains a linked resource
			if (SVNWorkspaceRoot.isLinkedResource(resource)) return false;
			
			// only enable for resources in a project shared with SVN
			if(RepositoryProvider.getProvider(resource.getProject(), SVNProviderPlugin.getTypeId()) == null) {
				return false;
			}
			
			// ensure that resource management state matches what the action requires
			ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(resource);
			if (!isEnabledForSVNResource(svnResource)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * get the unadded resources in resources parameter
	 */
	private IResource[] getUnaddedResources(List<IResource> resources, IProgressMonitor iProgressMonitor) throws SVNException {
		final List<IResource> unadded = new ArrayList<IResource>();
		final SVNException[] exception = new SVNException[] { null };
		for (Iterator<IResource> iter = resources.iterator(); iter.hasNext();) {
			IResource resource = (IResource) iter.next();
	        if (resource.exists()) {
			    // visit each resource deeply
			    try {
				    resource.accept(new IResourceVisitor() {
					public boolean visit(IResource aResource) {
						ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(aResource);
						// skip ignored resources and their children
						try {
							if (svnResource.isIgnored())
								return false;
							// visit the children of shared resources
							if (svnResource.isManaged())
								return true;
							if ((aResource.getType() == IResource.FOLDER) && isSymLink(aResource)) // don't traverse into symlink folders
								return false;
						} catch (SVNException e) {
							exception[0] = e;
						}
						// file/folder is unshared so record it
						unadded.add(aResource);
						return aResource.getType() == IResource.FOLDER;
					}
				}, IResource.DEPTH_INFINITE, false /* include phantoms */);
			    } catch (CoreException e) {
				    throw SVNException.wrapException(e);
			    }
			    if (exception[0] != null) throw exception[0];
	        }
		}
		if (unadded.size() > 0) hasUnaddedResources = true;
		return (IResource[]) unadded.toArray(new IResource[unadded.size()]);
	}
	
	protected boolean isSymLink(IResource resource) {
		File file = resource.getLocation().toFile();
	    try {
	    	if (!file.exists())
	    		return true;
	    	else {
	    		String cnnpath = file.getCanonicalPath();
	    		String abspath = file.getAbsolutePath();
	    		return !abspath.equals(cnnpath);
	    	}
	    } catch(IOException ex) {
	      return true;
	    }	
	}	
    protected IResource[] getSelectedResources() {
        if (selectedResources == null)
            return super.getSelectedResources();
        else
            return selectedResources;
    }
    public void setSelectedResources(IResource[] selectedResources) {
        this.selectedResources = selectedResources;
    }
    
    public boolean hasOutgoingChanges() {
    	try {
    		return getModifiedResources(selectedResources, new NullProgressMonitor()).length > 0;
    	} catch (SVNException e) {
    	}
    	return false;
    }

	protected String getImageId()
	{
		return ISVNUIConstants.IMG_MENU_COMMIT;
	}

	public void setCanRunAsJob(boolean canRunAsJob) {
		this.canRunAsJob = canRunAsJob;
	}

	
}
