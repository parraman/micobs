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
package es.uah.aut.srg.micobs.mesp.ui.wizards;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.tigris.subversion.subclipse.ui.dialogs.ChooseUrlDialog;
import org.tigris.subversion.subclipse.ui.util.UrlCombo;
import org.tigris.subversion.svnclientadapter.SVNUrl;

/**
 * Page to select the version and the repository folder where the new version
 * of an element that is being version-tagged.
 * 
 * @see NewModelVersionWizard
 *
 */
public class NewRepositoryFolderLocationPage extends WizardPage implements Listener {
	
	private UrlCombo toUrlCombo;
	
	protected Button makeParentsButton;
    
    private SVNUrl url;
	
	public NewRepositoryFolderLocationPage(SVNUrl defaultUrl) {
		super("NewRepositoryFileLocationPage");
		this.url = defaultUrl;
	}
	
	public String getUrl() {
		return toUrlCombo.getText();
	}
	
	private final static String VERSION_LABEL = "Version:";
	private Text versionText;
	
	private void createModelParameters(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout layout = new GridLayout(2, false);
		composite.setLayout(layout);
		
		Label versionLabel = new Label(composite, SWT.NONE);
		versionLabel.setText(VERSION_LABEL);
		
		versionText = new Text(composite, SWT.BORDER);
		versionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		versionText.setText("");
		versionText.addListener(SWT.Modify, this);

	}
	
	private void createRepositorySelectionGroup(Composite parent) {
	
		Group repositoryGroup = new Group(parent, SWT.NULL);
		repositoryGroup.setText("Repository"); //$NON-NLS-1$
		repositoryGroup.setLayout(new GridLayout());
		GridData data = new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL);
		repositoryGroup.setLayoutData(data);
		
		Label toUrlLabel = new Label(repositoryGroup, SWT.NONE);
		toUrlLabel.setText("New version's location URL:"); //$NON-NLS-1$   
		
		Composite urlComposite = new Composite(repositoryGroup, SWT.NULL);
		GridLayout urlLayout = new GridLayout();
		urlLayout.numColumns = 2;
		urlLayout.marginWidth = 0;
		urlLayout.marginHeight = 0;
		urlComposite.setLayout(urlLayout);
		data = new GridData(SWT.FILL, SWT.FILL, true, false);
		urlComposite.setLayoutData(data);
		
		toUrlCombo = new UrlCombo(urlComposite, SWT.NONE);
		toUrlCombo.init("repositoryBrowser"); //$NON-NLS-1$
		toUrlCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
		toUrlCombo.setText(getFileRoot());
		toUrlCombo.getCombo().addListener(SWT.Modify, this);
		
		Button browseButton = new Button(urlComposite, SWT.PUSH);
		browseButton.setText("Select..."); //$NON-NLS-1$
		browseButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                ChooseUrlDialog dialog = new ChooseUrlDialog(getShell(), null);
                if ((dialog.open() == ChooseUrlDialog.OK) && (dialog.getUrl() != null)) {
                    toUrlCombo.setText(dialog.getUrl());
                }
            }
		});	
		
		makeParentsButton = new Button(urlComposite, SWT.CHECK);
		makeParentsButton.setText("Create any intermediate folders that are missing"); //$NON-NLS-1$  
		data = new GridData();
		data.horizontalSpan = 2;
		makeParentsButton.setLayoutData(data);
		makeParentsButton.setSelection(false); //$NON-NLS-1$  
	}
	
	private String fileRoot;
	
	private String getFileRoot() {
		if (fileRoot == null)
		{
	    	for (int i = 0; i < url.toString().length(); i++) {
	    		String partialPath = url.toString().substring(0, i+1);
	    		if (partialPath.endsWith("/")) {
	    			fileRoot = partialPath.substring(0, i);
	    		}
	    	}
		}
		return fileRoot;
	}

	@Override
	public void handleEvent(Event event) {
        boolean valid = validatePage();
        setPageComplete(valid);
	}

	@Override
	public void createControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		initializeDialogUnits(parent);
		
		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 0;
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
        createModelParameters(composite);
		
        createRepositorySelectionGroup(composite);
        
        setPageComplete(validatePage());

        setErrorMessage(null);
        setMessage(null);
        setControl(composite);
        Dialog.applyDialogFont(composite);

	}
	
	public String getVersion()
	{
		return versionText.getText().trim();
	}
	
	private boolean validateVersion() 
    {
		if (getVersion() == null ||
			getVersion().equals(""))
		{
			setMessage("Version must be specified");
			return false;
		}
    	    	
        for (int i = 0; i < getVersion().length(); i++)
        {
            char c = getVersion().charAt(i);
            if ('a'<=c && c<='z') continue;
            if ('A'<=c && c<='Z') continue;
            if ('0'<=c && c<='9') continue;
            if (c=='.') continue;
            if (c=='_') continue;
            setErrorMessage("Wrong character set used in version name");
            return false;
        }
        setErrorMessage(null);
        setMessage(null);
        return true;
    }

	protected boolean validatePage() {
		if (validateVersion() == false)
		{
			return false;
		}
		if (validateURL() == false)
		{
			return false;
		}
		return true;
	}
	
	private boolean validateURL() {
		return toUrlCombo.getText().trim().length() > 0;
	}
}
