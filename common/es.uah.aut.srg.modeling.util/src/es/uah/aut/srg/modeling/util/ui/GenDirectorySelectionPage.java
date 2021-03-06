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
package es.uah.aut.srg.modeling.util.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;
import org.tigris.subversion.subclipse.ui.IHelpContextIds;
import org.tigris.subversion.subclipse.ui.Policy;
import org.tigris.subversion.subclipse.ui.dialogs.ChooseUrlDialog;
import org.tigris.subversion.subclipse.ui.wizards.SVNWizardPage;
import org.tigris.subversion.subclipse.ui.wizards.sharing.DirectorySelectionPage;
import org.tigris.subversion.subclipse.ui.wizards.sharing.ISVNRepositoryLocationProvider;

import es.uah.aut.srg.modeling.util.ui.ISRGNewProjectWizard;

/**
 * Page used to select the name of the repository folder where the project
 * will be stored. It is a modification of the original
 * {@link DirectorySelectionPage}.
 *
 */
public class GenDirectorySelectionPage extends SVNWizardPage {

	private ISRGNewProjectWizard parentWizard;
	
	private ISVNRepositoryLocationProvider repositoryLocationProvider;
	Button useProjectNameButton;
	Button useSpecifiedNameButton;
	Text text;
	Button browseButton;
	Text urlText;
	
	String result;
	boolean useProjectName = true;
	
	public GenDirectorySelectionPage(String pageName, String title, 
			ImageDescriptor titleImage, 
			ISVNRepositoryLocationProvider repositoryLocationProvider,
			ISRGNewProjectWizard wizard) {
		super(pageName, title, titleImage);
		parentWizard = wizard;
		this.repositoryLocationProvider = repositoryLocationProvider;
	}
	
	public void createControl(Composite parent) {
		Composite composite = createComposite(parent, 3);
		// set F1 help
		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IHelpContextIds.SHARING_MODULE_PAGE);
		
		useProjectNameButton = createRadioButton(composite, Policy.bind("ModuleSelectionPage.moduleIsProject"), 3); //$NON-NLS-1$
		useSpecifiedNameButton = createRadioButton(composite, Policy.bind("ModuleSelectionPage.specifyModule"), 1); //$NON-NLS-1$
		useProjectNameButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
			    setUrlText();
				useProjectName = useProjectNameButton.getSelection();
				if (useProjectName) {
					text.setEnabled(false);
					browseButton.setEnabled(false);
					setPageComplete(true);
				} else {
					text.setEnabled(true);
					text.setFocus();
					text.selectAll();
					browseButton.setEnabled(true);
					result = text.getText();
					if (result.length() == 0) {
						result = null;
						setPageComplete(false);
					} else {
						setPageComplete(true);
					}
				}
			}
		});

		text = createTextField(composite);
		text.setEnabled(false);
		text.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event event) {
			    setUrlText();
				result = text.getText().trim();
				if (result.length() == 0) {
					result = null;
					setPageComplete(false);
				} else {
					setPageComplete(true);
				}
			}
		});
		
		FocusListener focusListener = new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				((Text)e.getSource()).selectAll();
			}
			public void focusLost(FocusEvent e) {
				((Text)e.getSource()).setText(((Text)e.getSource()).getText());
			}					
		};
		text.addFocusListener(focusListener);		
		
		browseButton = new Button(composite, SWT.PUSH);
		browseButton.setText(Policy.bind("SharingWizard.browse")); //$NON-NLS-1$
		browseButton.setEnabled(false);
		browseButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent se) {
                try {
                   ISVNRepositoryLocation repositoryLocation = repositoryLocationProvider.getLocation();
                   ChooseUrlDialog dialog = new ChooseUrlDialog(getShell(), repositoryLocationProvider.getProject());
                   dialog.setRepositoryLocation(repositoryLocation);
                   if (dialog.open() == ChooseUrlDialog.OK && dialog.getUrl() != null) {
                       text.setText(dialog.getUrl().toString().substring(repositoryLocation.getLocation().length() + 1) + "/" + parentWizard.getProjectName());
                       text.setFocus();
                       text.setSelection(text.getText().indexOf(repositoryLocationProvider.getProject().getName()), text.getText().length());
                   }                    
                } catch (Exception e) {}
            }
		});
		Group urlGroup = new Group(composite, SWT.NONE);
		urlGroup.setText(Policy.bind("SharingWizard.url")); //$NON-NLS-1$
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		urlGroup.setLayout(layout);
		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		data.horizontalSpan = 3;
		urlGroup.setLayoutData(data);
		urlText = createTextField(urlGroup);
		urlText.setEditable(false);
		
		useSpecifiedNameButton.setSelection(false);
		useProjectNameButton.setSelection(true);
		setUrlText();
		setControl(composite);
		setPageComplete(true);
	}
    
	public String getDirectoryName() {
		return result;
	}
    
	public boolean useProjectName() {
		return useProjectName;
	}
    
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			useProjectNameButton.setFocus();
			setUrlText();
		}
	}
	
	private void setUrlText() {
		try {
		    if (useProjectNameButton.getSelection()) urlText.setText(repositoryLocationProvider.getLocation().getLocation() + "/" + parentWizard.getProjectName());
		    else urlText.setText(repositoryLocationProvider.getLocation().getLocation() + "/" + text.getText().trim());
		} catch (Exception e) {}	    
	}	

}
