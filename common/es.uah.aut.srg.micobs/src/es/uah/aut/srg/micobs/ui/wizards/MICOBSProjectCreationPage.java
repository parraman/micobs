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

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea.IErrorMessageReporter;
import org.tigris.subversion.subclipse.core.resources.SVNWorkspaceRoot;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Initial implementation of a MICOBS project creation page. This page is
 * intended to create a new model that will be stored in the new project.
 * The page provides package and language selectors, as well as an option for
 * selecting an existing project as the storage of the new project.
 *
 */
@SuppressWarnings("restriction")
public class MICOBSProjectCreationPage extends WizardPage implements IMICOBSProjectCreationPage, Listener {
	
	private String modelLabelText = "Package:";
	
	public void setModelLabel(String modelLabelText) {
		this.modelLabelText = modelLabelText;
	}
	
	private final static String VERSION_LABEL = "Version:";
	private final static String LANGUAGE_LABEL = "Language:";
	
	private final static String PACKAGE_LABEL = "Package:";
	
	private Text modelText;
	private Text versionText;
	
	private Combo singleLanguageCombo;
	
	private Button languageSelectionButton;
	private Text multiLanguagesText;
	
	private String defaultVersion = "HEAD";
	
	private ProjectContentsLocationArea locationArea;
	
	private List<MLanguage> languages = null;
	private List<MLanguage> selectedLanguages = null;
	
	private Collection<MCommonPackage> packages;
	private MCommonPackage selectedPackage;
	private Text packageText;
	private Button packageSelectionButton;
	
	private Button folderSelectionButton;
	private Text folderSelectionText;
	private Button folderSelectionOption;
	
	private Composite locationComposite;
	private Composite folderSelectionComposite;
	private Composite stackComposite;
	private StackLayout stackCompositeLayout;
	
	protected IProject projectHandle;
	protected IContainer rootFolder;
	
	protected IStructuredSelection selection;
	
	public IContainer getRootFolder()
	{
		return rootFolder;
	}
	
	/**
	 * Constructor of the page. If the collection of languages is not
	 * <code>null</code>, then the model will have attached one or more languagues
	 * that will be selected from the ones of the list.
	 * 
	 * @param pageName the name given to the page.
	 * @param languages the collection of languages from which the ones attached to the
	 * model will be selected. If the collection is <code>null</code>, then
	 * no language will be selected.
	 * @param packages the collection of packages from which one has to be selected
	 * to store the model of the new project.
	 */
	public MICOBSProjectCreationPage(String pageName, 
			IStructuredSelection selection,
			Collection<MLanguage> languages,
			Collection<MCommonPackage> packages) {
		super(pageName);
		this.packages = packages;
		this.selection = selection;
		if (languages != null)
		{
			this.languages = new ArrayList<MLanguage>();
			this.selectedLanguages = new ArrayList<MLanguage>();
			this.languages.addAll(languages);
		}
		else
		{
			languageSelection = false;
		}
		
		if (selection != null && selection.size() == 1 &&
			selection.getFirstElement() instanceof IFolder)
		{
			IFolder folder = (IFolder) selection.getFirstElement();
			projectHandle = folder.getProject();
			rootFolder = folder;
		}
	}
    
    /**
     * Updates the location area with the new project name.
     */
    void setLocationForSelection() {
    	locationArea.updateProjectName(getProjectName());
    }

    public String getProjectName() {
        if (getModelName() == null ||
        	getModelName().equals("")) {
			return ""; //$NON-NLS-1$
		}

        return StringHelper.toLowerDefString(getModelName());
    }
    
    /**
     * Sets the default version of the model that will be stored
     * in the project.
     * 
     * @param version the new default version.
     */
    public void setDefaultVersion(String version) {
    	this.defaultVersion = version;
    }
    
	private IErrorMessageReporter getErrorReporter() {
		return new IErrorMessageReporter(){

			public void reportError(String errorMessage, boolean infoOnly) {
				if (infoOnly) {
					setMessage(errorMessage, IStatus.INFO);
					setErrorMessage(null);
				}
				else
					setErrorMessage(errorMessage);
				boolean valid = errorMessage == null;
				if(valid) {
					valid = validatePage();
				}
				
				setPageComplete(valid);
			}
		};
	}
	
	private void createFolderSelectionOption(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout layout = new GridLayout(2, false);
		composite.setLayout(layout);
		
		folderSelectionOption = new Button(composite, SWT.CHECK);
		folderSelectionOption.setText("Use a folder already existing in the workspace");
		folderSelectionOption.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				handleFolderSelectionOptionPressed();
			}
		});
		folderSelectionOption.setSelection(false);
		folderSelectionOption.setEnabled(true);
		
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
		
		createLine(composite, 1);
		
		createPackageSelection(composite);
		
		createLine(composite, 1);
		
		if (canSelectLanguage() == true)
		{
			createLanguageSelection(composite);
		
			createLine(composite, 1);
		}
		
		createExtraParameters(composite);
		
		createFolderSelectionOption(composite);
		
		createLine(composite, 1);
		
		stackComposite = new Composite(composite, SWT.NONE);
		stackComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		stackCompositeLayout = new StackLayout();
		stackComposite.setLayout(stackCompositeLayout);
		
		folderSelectionComposite = new Composite(stackComposite, SWT.NONE);
		folderSelectionComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		folderSelectionComposite.setLayout(new GridLayout(3, false));
		
		Label location = new Label(folderSelectionComposite, SWT.NONE);
		location.setText("Location:");
		
		folderSelectionText = new Text(folderSelectionComposite, SWT.BORDER);
		folderSelectionText.setEditable(false);
		folderSelectionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		if (rootFolder != null)
		{
			folderSelectionText.setText(rootFolder.getFullPath().toOSString());
		}
		
		folderSelectionButton = new Button(folderSelectionComposite, SWT.PUSH | SWT.RIGHT);
		folderSelectionButton.setText("Select Folder");
		folderSelectionButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				handleFolderSelectionButtonPressed();
			}
		});
		
		folderSelectionComposite.setVisible(false);
		useExistingProject = false;
		
		locationComposite = new Composite(stackComposite, SWT.NONE);
		locationComposite.setLayout(new GridLayout());
		locationComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		locationArea = new ProjectContentsLocationArea(getErrorReporter(), locationComposite);

		setButtonLayoutData(locationArea.getBrowseButton());
		
		stackCompositeLayout.topControl = locationComposite;
		
        setPageComplete(validatePage());

        setErrorMessage(null);
        setMessage(null);
        setControl(composite);
        Dialog.applyDialogFont(composite);
	}
	
	/**
	 * Protected method to allow the derived classes to add new
	 * parameters.
	 * 
	 * @param composite the composite where the new parameters will be
	 * created.
	 */
	protected void createExtraParameters(Composite composite) {
		// This is the function the subclasses must override/implement
		
	}

	/**
	 * Returns the default version of the model that will be stored in the
	 * project.
	 * 
	 * @return the default version of the model that will be stored in the
	 * project.
	 */
	public String getDefaultVersion() {
		return defaultVersion;
	}

	/**
	 * Creates the main controls to select the name and the version of the
	 * model that will be stored in the project.
	 * 
	 * @param parent the parent composite where the new controls will be
	 * created.
	 */
	protected void createModelParameters(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout layout = new GridLayout(2, false);
		composite.setLayout(layout);
		
		Label modelLabel = new Label(composite, SWT.NONE);
		modelLabel.setText(modelLabelText);
		
		modelText = new Text(composite, SWT.BORDER);
		modelText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		modelText.addListener(SWT.Modify, this);
		
		Label versionLabel = new Label(composite, SWT.NONE);
		versionLabel.setText(VERSION_LABEL);
		
		versionText = new Text(composite, SWT.BORDER);
		versionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		versionText.setText(getDefaultVersion());
		versionText.addListener(SWT.Modify, this);

	}
	
	/**
	 * Handles the folder selection option button.
	 */
	private void handleFolderSelectionOptionPressed() {
		
		if (folderSelectionOption.getSelection() == true)
		{
			stackCompositeLayout.topControl = folderSelectionComposite;
			stackComposite.layout();
			useExistingProject = true;
		}
		else
		{
			stackCompositeLayout.topControl = locationComposite;
			stackComposite.layout();
			useExistingProject = false;
		}
		setPageComplete(validatePage());
		
	}
	
	/**
	 * Handles the language selection button.
	 */
	private void handleLanguageSelectionButtonPressed() {
		
		ListSelectionDialog dialog = 
				new ListSelectionDialog(languageSelectionButton.getShell(),
						languages.toArray(),
						new ArrayContentProvider(),
						new LabelProvider()
							{

								@Override
								public String getText(Object element) {
									if (element instanceof MLanguage)
									{
										return MICOBSStringHelper.getInstance().getElementName((MLanguage)element);
									}
									return super.getText(element);
								}
							}, 
							"Select the languages you want to include");
		
		dialog.setTitle("Language Selection");
		
		String languagesList = "";
		
		// User pressed cancel
		if (dialog.open() == Window.OK) {
			
			selectedLanguages.clear();
			Object[] result = dialog.getResult(); 
			
			if (result.length > 0)
			{
				selectedLanguages.add((MLanguage)result[0]);
				languagesList += MICOBSStringHelper.getInstance().getElementName((MLanguage)result[0]);
				
				for (int i = 1; i < result.length; i++)
				{
					selectedLanguages.add((MLanguage)result[i]);
					languagesList += ", " + MICOBSStringHelper.getInstance().getElementName((MLanguage)result[i]);
				}
			}
		}
		
		multiLanguagesText.setText(languagesList);

        boolean valid = validatePage();
        setPageComplete(valid);
		
	}
	
	/**
	 * Handles the package selection button.
	 */
	private void handlePackageSelectionButtonPressed() {
		
		ElementListSelectionDialog dialog = 
				new ElementListSelectionDialog(packageSelectionButton.getShell(),
						new LabelProvider()
							{

								@Override
								public String getText(Object element) {
									if (element instanceof MCommonPackage)
									{
										return ((MCommonPackage)element).getUri();
									}
									return super.getText(element);
								}
							});
		
		dialog.setTitle("Package Selection");
		dialog.setMessage("Select the corresponding MICOBS package:");
		dialog.setElements(packages.toArray());
		dialog.setMultipleSelection(false);
		
		// User pressed cancel
		if (dialog.open() == Window.OK) {
			
			Object[] result = dialog.getResult(); 
			
			if (result.length == 1)
			{
				selectedPackage = (MCommonPackage) result[0];
				packageText.setText(selectedPackage.getUri());
			}
			else
			{
				selectedPackage = null;
				packageText.setText("");
			}
		}

        boolean valid = validatePage();
        setPageComplete(valid);
		
	}
	
	/**
	 * Handles the folder selection button.
	 */
	private void handleFolderSelectionButtonPressed() {
		
		IContainer[] folders = WorkspaceResourceDialog.openFolderSelection(
				folderSelectionButton.getShell(), "Select Folder",
				"Select the containing folder", false, null, null);
		if (folders != null && folders[0] != null)
		{
			projectHandle = folders[0].getProject();
			rootFolder = folders[0];
		}
		setPageComplete(validatePage());
	}
	
	/**
	 * Creates the control to select the package of the model that will
	 * be stored in the project.
	 * 
	 * @param composite the composite where the new controls will be 
	 * located.
	 */
	private void createPackageSelection(Composite composite)
	{
		Composite subComposite = new Composite(composite, SWT.NONE);
			
		subComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout layout = new GridLayout(3, false);
		subComposite.setLayout(layout);

		Label packageLabel = new Label(subComposite, SWT.NONE);
		packageLabel.setText(PACKAGE_LABEL);
		
		packageText = new Text(subComposite, SWT.BORDER);
		packageText.setEditable(false);
		packageText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			
		packageSelectionButton = new Button(subComposite, SWT.PUSH);
		packageSelectionButton.setText("Select Package");
		packageSelectionButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				handlePackageSelectionButtonPressed();
			}
		});
			
		if (packages.size() <= 0)
		{
			packageSelectionButton.setEnabled(false);
		}

	}

	/**
	 * Creates the control to select the language/s attached to the project.
	 * This control can be a combo box or can trigger a multiple selection
	 * dialog box, depending on whether the model can have attached a single
	 * language or a set of parameters.
	 * 
	 * @param composite the composite where the new controls will be located.
	 */
	private void createLanguageSelection(Composite composite)
	{	
		if (canSelectMultipleLanguages())
		{
			Composite subComposite = new Composite(composite, SWT.NONE);
			
			subComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			GridLayout layout = new GridLayout(3, false);
			subComposite.setLayout(layout);
			
			Label languageLabel = new Label(subComposite, SWT.NONE);
			languageLabel.setText(LANGUAGE_LABEL);
			
			multiLanguagesText = new Text(subComposite, SWT.BORDER);
			multiLanguagesText.setEditable(false);
			multiLanguagesText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			
			languageSelectionButton = new Button(subComposite, SWT.PUSH);
			languageSelectionButton.setText("Select Languages");
			languageSelectionButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					handleLanguageSelectionButtonPressed();
				}
			});
			
			if (languages.size() <= 0)
			{
				languageSelectionButton.setEnabled(false);
			}

		}
		else
		{
			Composite subComposite = new Composite(composite, SWT.NONE);
			
			subComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			GridLayout layout = new GridLayout(2, false);
			subComposite.setLayout(layout);
			
			Label languageLabel = new Label(subComposite, SWT.NONE);
			languageLabel.setText(LANGUAGE_LABEL);
			
			singleLanguageCombo = new Combo(subComposite,
					SWT.BORDER | SWT.DROP_DOWN | 
	                SWT.V_SCROLL | SWT.H_SCROLL);
			
			singleLanguageCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			
			if (languages.size() > 0)
			{
				for (MLanguage language : languages)
				{
					singleLanguageCombo.add(MICOBSStringHelper.getInstance().getElementName(language));
				}
				singleLanguageCombo.select(0);
			}
			singleLanguageCombo.addListener(SWT.Modify, this);
		}
	}
	
	/**
	 * Helper function to create a separator line.
	 * 
	 * @param parent the parent composite.
	 * @param ncol the number of columns of the parent composite that will
	 * the new line have.
	 */
	protected void createLine(Composite parent, int ncol) {
	
		Label line = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL
	        | SWT.BOLD);
	    GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
	    gridData.horizontalSpan = ncol;
	    line.setLayoutData(gridData);
	
	}
		
	/**
	 * Returns the set of selected languages. If the model cannot support
	 * the selection of multiple languages, the method will return <code>null</code>.
	 * 
	 * @return the set of selected languages or <code>null</code> if the model
	 * cannot support the selection of multiple languages.
	 */
	public Collection<MLanguage> getSelectedLanguages()
	{
		if (canSelectLanguage() == true &&
			canSelectMultipleLanguages())
		{
			return selectedLanguages;
		}
		return null;
	}
	
	/**
	 * Returns the selected language. If the model can support the selection
	 * of multiple languages, the method will return <code>null</code>.
	 * 
	 * @return the selected language or <code>null</code> if the model
	 * supports the selection of multiple languages.
	 */
	public MLanguage getSelectedLanguage()
	{
		if (canSelectLanguage() == true && 
			languages.size() > 0 &&
			singleLanguageCombo != null &&
			singleLanguageCombo.getSelectionIndex() >= 0)
		{
			return languages.get(singleLanguageCombo.getSelectionIndex());
		}
		return null;
	}
	
	/**
	 * Returns the name given to the model.
	 * @return the name given to the model.
	 */
	public String getModelName()
	{
		return modelText.getText().trim();
	}
	
	/**
	 * Returns the version given to the model.
	 * @return the version given to the model.
	 */
	public String getVersion()
	{
		return versionText.getText().trim();
	}
	
    public IProject getProjectHandle() {
        return projectHandle;
    }
    
	/**
	 * Updates the text shown in the folder selection control.
	 */
	private void updateFolderSelectionOption() {
		if (rootFolder == null)
		{
			folderSelectionText.setText("");
		}
		else
		{
			folderSelectionText.setText(rootFolder.getFolder(new Path(getProjectName())).getFullPath().toOSString());
		}
	}
	
    /**
     * Validates the creation page by checking that no parameter is
     * missing and that all the given values are correct.
     * 
     * @return <code>true</code> if the page is valid and <code>false</code>
     * otherwise.
     */
    protected boolean validatePage() 
	{
		if (validateModelName() == false)
		{
			return false;
		}
		if (validateVersion() == false)
		{
			return false;
		}
		if (validatePackage() == false)
		{
			return false;
		}
		if (canSelectLanguage() == true &&
			validateLanguage() == false)
		{
			return false;
		}
		if (validateExtraParameters() == false)
		{
			return false;
		}

		if (folderSelectionOption.getSelection() == true)
		{
			updateFolderSelectionOption();
			
			if (rootFolder == null)
			{
				setErrorMessage("A folder must be selected");
				return false;
			}
			else if (rootFolder.getFolder(new Path(getProjectName())).exists() == true)
			{
				setErrorMessage("A folder with the same name arealdy exists in the workspace");
				return false;
			}
			else if (SVNWorkspaceRoot.getSVNResourceFor(rootFolder).getUrl() == null)
			{
				setErrorMessage("The selected folder must be versioned under SVN");
				return false;
			}
			projectHandle = rootFolder.getProject();
		}
		else
		{
			projectHandle = ResourcesPlugin.getWorkspace().getRoot().getProject(
	                getProjectName());
			
		    if (projectHandle.exists()) {
		        setErrorMessage("A project with the same name already exists in the workspace");
		        return false;
		    }
	    
		    locationArea.setExistingProject(projectHandle);
			
		    String validLocationMessage = locationArea.checkValidLocation();
		    if (validLocationMessage != null) { // there is no destination location given
		    	setErrorMessage(validLocationMessage);
		    	return false;
		    }
		}

	    setErrorMessage(null);
	    setMessage(null);
	    return true;

	}

	/**
	 * Method to be overridden by the derived classes to check  the
	 * added extra parameters.
	 * @return
	 */
	protected boolean validateExtraParameters() {
		return true;
	}

	@Override
	public void handleEvent(Event event) {
    	setLocationForSelection();
        boolean valid = validatePage();
        setPageComplete(valid);
	}
	
	/**
	 * Validates the name given to the model.
     * @return <code>true</code> if the name is valid and <code>false</code>
     * otherwise.
	 */
	private boolean validateModelName() 
    {
		if (getModelName() == null ||
			getModelName().equals(""))
		{
			setMessage("Model name must be specified");
			return false;
		}
    	    	
        for (int i = 0; i < getModelName().length(); i++)
        {
            char c = getModelName().charAt(i);
            if ('a'<=c && c<='z') continue;
            if ('A'<=c && c<='Z') continue;
            if ('0'<=c && c<='9') continue;
            if (c=='_') continue;
            setErrorMessage("Wrong character set used in version name");
            return false;
        }
        setErrorMessage(null);
        setMessage(null);
        return true;
    }
	
	/**
	 * Validates the version given to the model.
     * @return <code>true</code> if the version is valid and <code>false</code>
     * otherwise.
	 */
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
    
	/**
	 * Checks that at least one language is selected.
     * @return <code>true</code> if at least one language is selected and
     * <code>false</code> otherwise.
	 */
	private boolean validateLanguage() {
    	
    	if (canSelectMultipleLanguages() == true)
    	{
    		if (getSelectedLanguages().isEmpty())
    		{
    			setErrorMessage("A language must be selected");
    			return false;
    		}
    		setErrorMessage(null);
    		setMessage(null);
    		return true;
    	}
    	else
    	{
    		if (getSelectedLanguage() == null)
    		{
    			setErrorMessage("A language must be selected");
    			return false;
    		}
    		setErrorMessage(null);
    		setMessage(null);
    		return true;
    	}
    }
    
	/**
	 * Checks that a package is selected.
     * @return <code>true</code> if a package is selected and
     * <code>false</code> otherwise.
	 */
	private boolean validatePackage() {
    	if (selectedPackage == null)
    	{
    		setErrorMessage("A package must be selected");
			return false;
    	}
    	else
    	{
    		setErrorMessage(null);
    		setMessage(null);
    		return true;
    	}
    }
        
    private boolean languageSelection = true;
    
    /**
     * Returns <code>true</code> if the page allows the selection of a
     * language.
     * 
     * @return <code>true</code> if the page allows the selection of a
     * language and <code>false</code> otherwise.
     */
    public boolean canSelectLanguage() {
    	return languageSelection;
    }
    
    private boolean multiLanguage = false;
    
    /**
     * Returns <code>true</code> if the page allows the selection of
     * multiple languages.
     * 
     * @return <code>true</code> if the page allows the selection of
 	 * multiple languages and <code>false</code> otherwise.
     */
    public boolean canSelectMultipleLanguages() {
    	return multiLanguage;
    }
    
    /**
     * Sets if the page shall allow the selection of multiple languages.
     * This method shall be called before the page is initially displayed.
     * 
     * @param multiLanguage <code>true</code> if the page shall allow
     * the selection of multiple languages.
     */
    public void setSelectMultipleLanguages(boolean multiLanguage) {
    	this.multiLanguage = multiLanguage;
    	selectedLanguages.clear();
    }
    
    /**
     * Returns the selected package.
     * @return the selected package.
     */
    public MCommonPackage getSelectedPackage() {
    	return this.selectedPackage;
    }
    
    public URI getProjectLocationURI()
    {
       if (locationArea.isDefault())
       {
    	   return null;
       }
       else
       {
    	   return locationArea.getProjectLocationURI();
       }
    }
    
    private boolean useExistingProject;

	@Override
	public boolean useExistingProject() {
		
		return useExistingProject;
	}

}
