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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.tigris.subversion.subclipse.core.ISVNLocalResource;
import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;
import org.tigris.subversion.subclipse.core.SVNException;
import org.tigris.subversion.subclipse.core.SVNProviderPlugin;
import org.tigris.subversion.subclipse.core.resources.RemoteFile;
import org.tigris.subversion.subclipse.core.resources.RemoteFolder;
import org.tigris.subversion.subclipse.core.resources.SVNWorkspaceRoot;
import org.tigris.subversion.subclipse.ui.actions.UpdateAction;
import org.tigris.subversion.subclipse.ui.wizards.CheckoutWizard;
import org.tigris.subversion.subclipse.ui.wizards.ClosableWizardDialog;
import org.tigris.subversion.svnclientadapter.ISVNProperty;
import org.tigris.subversion.svnclientadapter.SVNRevision;
import org.tigris.subversion.svnclientadapter.SVNUrl;

/**
 * Helper functions to perform SVN actions on files and folders.
 *
 */
public class SVNUtil {

	/**
	 * Sets the external items property of a given folder.
	 * 
	 * @param folder the folder to modify.
	 * @param itemMap the external items map.
	 */
	public static void setExternalItems(IFolder folder,
			Map<String, String> itemMap)
	{
		IResource[] selectedResources = { folder };
		SetSVNExternalsAction setSVNExternalsAction = new SetSVNExternalsAction();
		setSVNExternalsAction.setSelectedResources(selectedResources);
		
		setSVNExternalsAction.setItemList(itemMap);
		setSVNExternalsAction.run(null);
	}
	
	/**
	 * Returns the external items map of a given folder.
	 * 
	 * @param folder the folder.
	 * @return the external items map.
	 */
	public static Map<String, String> getExternalItems(IFolder folder)
	{
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		ISVNLocalResource svnResource = SVNWorkspaceRoot.getSVNResourceFor(folder);
		if (svnResource != null)
		{
			ISVNProperty property = null;
			try {
				property = svnResource.getSvnProperty("svn:externals");
			} catch (SVNException e) {
				e.printStackTrace();
				return hashMap;
			}
			if (property == null)
			{
				return hashMap;
			}
			String propertyValue = property.getValue();
			String[] split = propertyValue.split("\\n");
			for (int i = 0; i < split.length; i++)
			{
				String[] line = split[i].split(" ");
				if (line.length != 2)
				{
					// ooops!
					continue;
				}
				hashMap.put(line[0], line[1]);
			}
		}
		
		return hashMap;
	}
	
	/**
	 * Triggers a SVN action to commit a given project.
	 * @param project the project to commit.
	 */
	public static void commitProject(IProject project)
	{
		IResource[] selectedResources = { project };
		GenCommitAction commitAction = new GenCommitAction(project.getName() + " project commit.");	
		commitAction.setSelectedResources(selectedResources);
		commitAction.run(null);
	}

	/**
	 * Updates a list of resources.
	 * @param selectedResources the resources to update.
	 */
	public static void updateResources(IResource[] selectedResources) {

		UpdateAction updateAction = new UpdateAction();
		updateAction.setSelectedResources(selectedResources);
		updateAction.setCanRunAsJob(false);
		updateAction.run(null);	
	}
	
	/**
	 * Loads a remote file and returns its contents in an input stream.
	 * 
	 * The method will throw a {@link CoreException} or an
	 * {@link IOException} if an error occurs when accessing the remote
	 * file.
	 * 
	 * @param url the URL of the remote file.
	 * @return the input stream with the contents of the file.
	 */
	public static InputStream loadRemoteFile(String url) throws CoreException, IOException
	{
		ISVNRepositoryLocation location = SVNProviderPlugin.getPlugin().getRepository(url);

		RemoteFile file = null;

		file = new RemoteFile(location, new SVNUrl(url), SVNRevision.HEAD);
		file.fetchContents(new NullProgressMonitor());

		return file.getStorage(new NullProgressMonitor()).getContents();
	}
	
	/**
	 * Checks out a remote folder and opens a dialog to select the local location
	 * in which to store it.
	 * 
	 * The method will throw a {@link CoreException} or an
	 * {@link IOException} if an error occurs when accessing the remote
	 * folder.
	 * 
	 * @param parentShell the parent shell used to open the wizards. 
	 * @param url the URL of the remote folder.
	 */
	public static void checkoutRemoteFolder(Shell parentShell, String url) throws CoreException, IOException
	{
		ISVNRepositoryLocation location = SVNProviderPlugin.getPlugin().getRepository(url);
		RemoteFolder folder = new RemoteFolder(location, new SVNUrl(url), SVNRevision.HEAD);
		
	    CheckoutWizard wizard = new CheckoutWizard(new RemoteFolder[] { folder });
	    WizardDialog dialog = new ClosableWizardDialog(parentShell, wizard);
	    dialog.open();

	}
	
	/**
	 * Loads a remote file and stores its contents in a temporary file.
	 * 
	 * The method will throw a {@link CoreException} or an
	 * {@link IOException} if an error occurs when accessing the remote
	 * file.
	 * 
	 * @param url the URL of the remote file.
	 * @prefix the prefix string to be used in generating the file's name;
	 * must be at least three characters long.
	 * @suffix the suffix string to be used in generating the file's name; 
	 * may be null, in which case the suffix ".tmp" will be used
	 * @param monitor progress monitor that controls the execution.
	 * @return the Java file object corresponding to the new file.
	 */
	public static File loadRemoteFileOnTmp(String url, 
			String prefix, String suffix, IProgressMonitor monitor) throws CoreException, IOException
	{
		ISVNRepositoryLocation location = null;
		InputStream istream = null;
		SVNUrl locationUrl = new SVNUrl(url);
		location = SVNProviderPlugin.getPlugin().getRepositories().getRepository(locationUrl.getParent().toString(), false);
		location.refreshRootFolder();
		location.updateCache();

		RemoteFile file = null;
		file = new RemoteFile(location, locationUrl, SVNRevision.HEAD);
		file.fetchContents(monitor);

		istream = file.getStorage(monitor).getContents();

		byte[] bytes = new byte[4092];
		File tmp = null;

		tmp = File.createTempFile(prefix, suffix);
		tmp.deleteOnExit();
		FileOutputStream fos = new FileOutputStream(tmp);
		int ch;
		while (true) {
			ch = istream.read(bytes);
			if (ch == -1) {
				break;
			}
			fos.write(bytes, 0, ch);
		}
		fos.close();
		return tmp;
	}
}
