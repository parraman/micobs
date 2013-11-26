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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.team.core.TeamException;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.tigris.subversion.subclipse.core.ISVNRemoteFolder;
import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;
import org.tigris.subversion.subclipse.core.SVNException;
import org.tigris.subversion.subclipse.core.SVNProviderPlugin;
import org.tigris.subversion.subclipse.core.resources.SVNWorkspaceRoot;
import org.tigris.subversion.subclipse.ui.ISVNUIConstants;
import org.tigris.subversion.subclipse.ui.Policy;
import org.tigris.subversion.subclipse.ui.SVNUIPlugin;
import org.tigris.subversion.subclipse.ui.wizards.ConfigurationWizardMainPage;
import org.tigris.subversion.subclipse.ui.wizards.sharing.ISVNRepositoryLocationProvider;
import org.tigris.subversion.subclipse.ui.wizards.sharing.RepositorySelectionPage;

import es.uah.aut.srg.micobs.nature.MICOBSProjectNature;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtil;
import es.uah.aut.srg.modeling.util.file.FileConverter;
import es.uah.aut.srg.modeling.util.svn.SVNUtil;
import es.uah.aut.srg.modeling.util.ui.GenDirectorySelectionPage;
import es.uah.aut.srg.modeling.util.ui.ISRGNewProjectWizard;

/**
 * Abstract class that implements the basis of a MICOBS project.
 * 
 */
public abstract class EmptyMICOBSProjectWizard extends
		Wizard implements INewWizard, ISRGNewProjectWizard {

	private EObject model;
	private IProject newProject;
	private IContainer rootFolder;
	
	private IMICOBSProjectCreationPage projectCreationPage;

	private ISVNRepositoryLocation[] locations;
	
	private RepositorySelectionPage locationPage;
	
	private ConfigurationWizardMainPage createLocationPage;

	private GenDirectorySelectionPage directoryPage;
	
	private boolean finalCommit = false;
	
	public EmptyMICOBSProjectWizard(String projectWindowTitle) {
		super();
		setWindowTitle(projectWindowTitle);
	}

	public EmptyMICOBSProjectWizard(String projectWindowTitle, boolean finalCommit) {
		super();
		setWindowTitle(projectWindowTitle);
		this.finalCommit = finalCommit;
	}
	
    protected IWorkbench workbench;

    protected IStructuredSelection selection;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
        this.workbench = workbench;
        this.selection = currentSelection;

        initializeDefaultPageImageDescriptor();
		
	}

	/**
	 * Returns the selected repository location.
	 * 
	 * If an error occurs when accessing the repository
	 * locations, the method will throw a
	 * {@link TeamException}.
	 * 
	 * @return the selected repository location.
	 */
	protected ISVNRepositoryLocation getLocation() throws TeamException {
		
		// If the import page has a location, use it.
		if (locationPage != null) {
			ISVNRepositoryLocation location = locationPage.getLocation();
			if (location != null) return location;
		}
		
		// Otherwise, get the location from the create location page
		getShell().getDisplay().syncExec(new Runnable() {
			public void run() {
				createLocationPage.finish(new NullProgressMonitor());
			}
		});
		Properties properties = createLocationPage.getProperties();
		ISVNRepositoryLocation location = SVNProviderPlugin.getPlugin().getRepositories().createRepository(properties);
		return location;
	}
	
	@Override
	public boolean canFinish() {
		IWizardPage page = getContainer().getCurrentPage();
		if (page == directoryPage) {
			return directoryPage.useProjectName() || directoryPage.getDirectoryName() != null;
		}
		else if (page == projectCreationPage && 
				 projectCreationPage.isPageComplete() &&
				 projectCreationPage.useExistingProject() == true)
		{
			return true;
		}
		return super.canFinish();
	}
	
	/**
	 * Initializes the default image descriptor of the wizard.
	 */
	protected void initializeDefaultPageImageDescriptor() {
		
		URI iconURI = URI.createPlatformPluginURI("/es.uah.aut.srg.micobs/icons/full/wizban/MICOBSNewWizard.gif", true);
		try {
			ImageDescriptor desc = ImageDescriptor.createFromURL(
					FileConverter.platformPluginURItoURL(iconURI));
			setDefaultPageImageDescriptor(desc);
		} catch (IOException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
	}

	/**
	 * Method that shall be implemented by the derived classes that
	 * proves the project creation page.
	 * 
	 * @param selection the selection if any from which the wizard has been
	 *        triggered.
	 *        
	 * @return the project creation page that has been added.
	 */
	public abstract IMICOBSProjectCreationPage addProjectCreationPage(IStructuredSelection selection);
	
	/**
	 * Generates the initial set of files of the project. It shall be
	 * implemented by the derived classes.
	 * 
	 * If an error occurs when generating the files, the method
	 * will throw an {@link InvocationTargetException}
	 * 
	 * @param model the main model of the project.
	 * @param rootFolder the container folder of the project.
	 * @param progressMonitor the progress monitor that controls the activity.
	 */
	protected abstract void generateFiles(EObject model, IContainer rootFolder,
			IProgressMonitor progressMonitor) throws InvocationTargetException;
	
	
	/**
	 * Returns the main model of the project from the information obtained
	 * from the user with the project creation page.
	 * @param projectCreationPage the project creation page.
	 * @return the main model of the project.
	 */
	protected abstract EObject createModel(IMICOBSProjectCreationPage projectCreationPage);

	/**
	 * Generates the skeleton of the project. It shall be
	 * implemented by the derived classes.
	 * 
	 * If an error occurs when creating the folders, the method
	 * will throw an {@link InvocationTargetException}
	 * 
	 * @param model the main model of the project.
	 * @param rootFolder the container folder of the project.
	 * @param progressMonitor the progress monitor that controls the activity.
	 */
	protected abstract void createFolders(EObject model, IContainer rootFolder, IProgressMonitor monitor);
	
	@Override
	public void addPages() {
		
		projectCreationPage = addProjectCreationPage(selection);
		if (projectCreationPage == null)
		{
			return;
		}
		addPage(projectCreationPage);
	    
		ImageDescriptor sharingImage = SVNUIPlugin.getPlugin().getImageDescriptor(ISVNUIConstants.IMG_WIZBAN_SHARE);
	    
       	IRunnableWithProgress runnable = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
            	locations = SVNUIPlugin.getPlugin().getRepositoryManager().getKnownRepositoryLocations(monitor);
            }
    	};
        try {
			new ProgressMonitorDialog(getShell()).run(true, false, runnable);
		} catch (Exception e) {
            SVNUIPlugin.openError(getShell(), null, null, e, SVNUIPlugin.LOG_TEAM_EXCEPTIONS);
		}
		if (locations.length > 0) {
			locationPage = new RepositorySelectionPage("importPage", Policy.bind("SharingWizard.importTitle"), sharingImage); //$NON-NLS-1$ //$NON-NLS-2$
			locationPage.setDescription(Policy.bind("SharingWizard.importTitleDescription")); //$NON-NLS-1$
			addPage(locationPage);
		}
		createLocationPage = new ConfigurationWizardMainPage("createLocationPage", Policy.bind("SharingWizard.enterInformation"), sharingImage); //$NON-NLS-1$ //$NON-NLS-2$
		createLocationPage.setDescription(Policy.bind("SharingWizard.enterInformationDescription")); //$NON-NLS-1$
		addPage(createLocationPage);
		createLocationPage.setDialogSettings(getDialogSettings());
		ISVNRepositoryLocationProvider repositoryLocationProvider = new ISVNRepositoryLocationProvider() {
			public ISVNRepositoryLocation getLocation() throws TeamException {
				return EmptyMICOBSProjectWizard.this.getLocation();
			}
			public IProject getProject() {
				return EmptyMICOBSProjectWizard.this.newProject;
			}				
		};
		directoryPage = new GenDirectorySelectionPage("modulePage", Policy.bind("SharingWizard.enterModuleName"), sharingImage, repositoryLocationProvider, this); //$NON-NLS-1$ //$NON-NLS-2$
		directoryPage.setDescription(Policy.bind("SharingWizard.enterModuleNameDescription")); //$NON-NLS-1$
		addPage(directoryPage);
	    
	}

	/**
	 * Adds the MICOBS and Xtext natures to the project.
	 * @param project
	 */
	protected void addProjectNature(IProject project)
	{
		MICOBSProjectNature.addNature(project);
		// And the Xtext nature:
		MICOBSUtil.getDefault().addXtextNature(project); 
	}
	
	

	@Override
	public boolean needsProgressMonitor() {
		return true;
	}

	@Override
	public boolean performFinish() 
	{
		try 
		{
			getContainer().run(true, true, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException 
				{	
					monitor.beginTask("Creating project", 100); //$NON-NLS-1$
						
					final Exception except[] = new Exception[1];

					getShell().getDisplay().asyncExec(new Runnable() {

						@Override
						public void run() 
						{		
							WorkspaceModifyOperation op = new WorkspaceModifyOperation() 
							{
								protected void execute(IProgressMonitor progressMonitor)
									throws CoreException, InvocationTargetException,
									InterruptedException
								{
									model = createModel(projectCreationPage);
									newProject = projectCreationPage.getProjectHandle();
									
									if (projectCreationPage.useExistingProject() == false)
									{
										IProjectDescription description = 
											ResourcesPlugin.getWorkspace().newProjectDescription(newProject.getName());
										description.setLocationURI(projectCreationPage.getProjectLocationURI());
										
										if (!newProject.exists()) {
											newProject.create(description, new SubProgressMonitor(progressMonitor, 50));
										}
										
										newProject.open(IResource.BACKGROUND_REFRESH, new SubProgressMonitor(progressMonitor,50));
										rootFolder = newProject;
										addProjectNature(newProject);
									}
									else
									{
										rootFolder = projectCreationPage.getRootFolder().getFolder(new Path(projectCreationPage.getProjectName()));
										addProjectNature(newProject);
										
										if (rootFolder instanceof IFolder &&
											((IFolder)rootFolder).exists() == false)
										{
											((IFolder)rootFolder).create(true, true, progressMonitor);
										}
										
									}
											
									
								}
							};

							try 
							{
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
						
					monitor.worked(10);
					monitor.subTask("Creating folders");

					getShell().getDisplay().asyncExec(new Runnable() {

						@Override
						public void run() {
								
							WorkspaceModifyOperation op = new WorkspaceModifyOperation() 
							{
								protected void execute(IProgressMonitor progressMonitor)
									throws CoreException, InvocationTargetException,
									InterruptedException
								{
									createFolders(model, rootFolder, progressMonitor);
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

					monitor.worked(10);
					if (projectCreationPage.useExistingProject() == false)
					{
						monitor.subTask("Sharing project");
						
						getShell().getDisplay().syncExec(new Runnable() {

							@Override
							public void run() {
								
								try {
									getContainer().run(false, true, new IRunnableWithProgress() {
										
										public void run(IProgressMonitor monitor) 
											throws InvocationTargetException, InterruptedException 
										{
											shareProject(newProject, monitor);
										}
									});

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
					}
					monitor.worked(20);
					monitor.subTask("Generating files");

					getShell().getDisplay().asyncExec(new Runnable() {

						@Override
						public void run() 
						{			
							WorkspaceModifyOperation op = new WorkspaceModifyOperation() 
							{
								protected void execute(IProgressMonitor progressMonitor)
									throws CoreException, InvocationTargetException,
									InterruptedException
								{
									generateFiles(model, rootFolder, progressMonitor);
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
						
					monitor.worked(20);
					monitor.subTask("Refreshing");
						
					getShell().getDisplay().asyncExec(new Runnable() {

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
											newProject.refreshLocal(IProject.DEPTH_INFINITE, monitor);
										} catch (CoreException e) {
											except[0] = e;
										}
										if (projectCreationPage.useExistingProject() == false && 
											finalCommit == true)
										{
											SVNUtil.commitProject(newProject);	
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
					monitor.done();
				}	
			});
		} catch (InvocationTargetException e) {
			MICOBSPlugin.INSTANCE.log(e);
			return false;
		} catch (InterruptedException e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Shares the project in the selected SVN repository folder.
	 * 
	 * If an error occurs when accessing the SVN repository, the method
	 * will throw an {@link InvocationTargetException}. If the sharing
	 * is interrupted by the user, the method will throw an
	 * {@link InterruptedException}.
	 * 
	 * @param project the project that is being created.
	 * @param monitor the progress monitor that controls the activity.
	 */
	private void shareProject(IProject project, IProgressMonitor monitor) 
		throws InterruptedException, InvocationTargetException 
	{

		monitor.beginTask("Sharing project", 100);
		shareCanceled = false;
	
		// check if the remote directory already exist
	    final String remoteDirectoryName = getRemoteDirectoryName();
			
		monitor.beginTask("Sharing Project", 100); //$NON-NLS-1$
		// Check if the directory exists on the server
			
		ISVNRepositoryLocation location = null;
		boolean isKnown = false;
		boolean createDirectory = true;
		
		try {
			location = getLocation();
			isKnown = SVNProviderPlugin.getPlugin().getRepositories().isKnownRepository(location.getLocation(), false);
				
            // Purge any svn folders that may exists in subfolders
            SVNWorkspaceRoot.getSVNFolderFor(project).unmanage(null);

			ISVNRemoteFolder folder = location.getRemoteFolder(remoteDirectoryName);
			if (folder.exists(new SubProgressMonitor(monitor, 50))) 
			{
				getShell().getDisplay().syncExec(new Runnable() {
					public void run() {
						if (!MessageDialog.openQuestion(getShell(), Policy.bind("SharingWizard.couldNotImport"), Policy.bind("SharingWizard.couldNotImportLong"))) {  //$NON-NLS-1$ //$NON-NLS-2$
						   	shareCanceled = true;
						   	return;
						}
					}
				});
				if (shareCanceled)
				{
					throw new InterruptedException();
				}
				createDirectory = false;
			}
		} catch (TeamException e) {
			SVNUIPlugin.openError(getShell(), null, null, e, SVNUIPlugin.PERFORM_SYNC_EXEC);
			throw new InvocationTargetException(e);
		}
		
		try
		{
            // Add the location to the provider if it is new
			if (!isKnown) 
			{
				SVNProviderPlugin.getPlugin().getRepositories().addOrUpdateRepository(location);
			}
				
			// Create the remote module for the project
			SVNWorkspaceRoot.shareProject(location, newProject, remoteDirectoryName, "Initial import.", createDirectory, new SubProgressMonitor(monitor, 50));
				
			project.refreshLocal(IProject.DEPTH_INFINITE, new SubProgressMonitor(monitor, 50));
		} catch (SVNException e)
		{
			throw new InvocationTargetException(e);
		} catch (CoreException e)
		{
			throw new InvocationTargetException(e);
		} finally {
			monitor.done();
		}
	}
	
	private boolean shareCanceled;

	@Override
	public IWizardPage getNextPage(IWizardPage page) 
	{
		if (page == locationPage) 
		{
			if (locationPage.getLocation() == null) 
			{
				return createLocationPage;
			} else {
				return directoryPage;
			}
		}
		if (page == createLocationPage) {
			return directoryPage;
		}
		if (page == projectCreationPage &&
			projectCreationPage.useExistingProject() == true)
		{
			return null;
		}

		return super.getNextPage(page);
	}

	@Override
	public String getProjectName() 
	{
		return projectCreationPage.getProjectName();
	}
	
	/**
	 * Returns the name of the remote folder where the project will be
	 * shared.
	 * @return the name of the remote folder where the project will be
	 * shared.
	 */
	private String getRemoteDirectoryName() 
	{
		String moduleName = directoryPage.getDirectoryName();
		if (moduleName == null) moduleName = this.getProjectName();
		return moduleName;
	}

}
