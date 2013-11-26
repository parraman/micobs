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
package es.uah.aut.srg.micobs.mesp.ui.wizards;

import java.net.MalformedURLException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.tigris.subversion.subclipse.core.ISVNRemoteResource;
import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;
import org.tigris.subversion.subclipse.core.SVNProviderPlugin;
import org.tigris.subversion.subclipse.ui.Policy;
import org.tigris.subversion.svnclientadapter.ISVNClientAdapter;
import org.tigris.subversion.svnclientadapter.ISVNInfo;
import org.tigris.subversion.svnclientadapter.SVNUrl;

import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.mesp.ui.handlers.CreateNewPackageVersionHandler;

/**
 * Wizard to select the version of an element that is being
 * version-tagged.
 *
 * @see CreateNewPackageVersionHandler
 */
public class NewModelVersionWizard extends Wizard {
	
	private NewRepositoryFolderLocationPage newfileLocationPage;
	
	private ISVNRemoteResource resource;
	
	private boolean alreadyExists;
	
	private SVNUrl destinationUrl;
	private String elementName;
	private String version;
	
	public NewModelVersionWizard(String elementName, ISVNRemoteResource resource)
	{
		this.resource = resource;
		this.elementName = elementName;
	}
	
	@Override
	public void addPages() {
		newfileLocationPage = new NewRepositoryFolderLocationPage(resource.getRepository().getUrl());
		newfileLocationPage.setTitle(MESPPlugin.INSTANCE.getString("_UI_NewPackageVersionWizardPageTitle"));
		newfileLocationPage.setDescription(MESPPlugin.INSTANCE.getString("_UI_NewPackageVersionWizardPageDescription"));
		addPage(newfileLocationPage);
	}

	@Override
	public boolean performFinish() {
		
		version = newfileLocationPage.getVersion();
		
		try {
			destinationUrl = new SVNUrl(newfileLocationPage.getUrl() + "/" + elementName +
					"_" + version);
		} catch (MalformedURLException e) {
			MessageDialog.openError(getShell(), Policy.bind("BranchTagDialog.title"), e.getMessage()); //$NON-NLS-1$
            return false;
		}
		
		alreadyExists = false;
    	BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			public void run() {
				ISVNInfo svnInfo = null;
				SVNUrl sourceUrl = resource.getUrl();
				ISVNClientAdapter svnClient = null;
				ISVNRepositoryLocation repository = null;
				try {
					SVNProviderPlugin.disableConsoleLogging();
					repository = SVNProviderPlugin.getPlugin().getRepository(sourceUrl.toString());
					svnClient = repository.getSVNClient();
					svnInfo = svnClient.getInfo(destinationUrl);
				} catch (Exception e) {}
				finally { 
					SVNProviderPlugin.enableConsoleLogging(); 
					if (repository != null) {
						repository.returnSVNClient(svnClient);
					}
				}
				alreadyExists = svnInfo != null;
			}     		
    	});
    	if (alreadyExists) {
            MessageDialog.openError(getShell(), Policy.bind("BranchTagDialog.title"), Policy.bind("BranchTagDialog.alreadyExists", destinationUrl.toString())); //$NON-NLS-1$ //$NON-NLS-2$
            return false;        		
    	}
    	return true;
	}
	
	/**
	 * Returns the new version of the element.
	 * @return the new version of the element.
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * Returns the URL where the new version of the element
	 * will be stored.
	 * @return the new URL where the new version of the element
	 * will be stored.
	 */
	public SVNUrl getDestinationUrl()
	{
		return destinationUrl;
	}

}
