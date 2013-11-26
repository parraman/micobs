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
package es.uah.aut.srg.modeling.util.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import es.uah.aut.srg.modeling.util.plugin.ModelingUtilPlugin;

/**
 * Wizard page that can be used to load and check an EMF model file.
 * It is a modification of the page used in the EMF Generator Model
 * creation wizard. 
 *
 */
public class LoadModelPage extends WizardPage implements Listener {

	protected Text uriText;
	
	protected Button browseFileSystemButton;
	protected Button browseWorkspaceButton;
	protected Button loadButton;
	
	protected List<String> fileExtensions;
	protected String[] filterExtensions;
	
	protected EObject model;
	protected AdapterFactory adapterFactory;
	protected EClass modelClass;
	
	/**
	 * Returns the root object found in the loaded model file.
	 * @return the root object found in the loaded model file.
	 */
	public EObject getModel() {
		return model;
	}

	protected Resource modelResource;
	
	protected URI modelURI;
	
	protected String uriTextIntialValue;
	  
	public LoadModelPage(String pageName,
			String pageTitle,
			String pageDescription,
			String modelExtension, 
			EClass modelClass,
			AdapterFactory adapterFactory) 
	{
		super(pageName);

		setTitle(pageTitle);
		setDescription(pageDescription);
	    fileExtensions = new ArrayList<String>();
	    fileExtensions.add(modelExtension);
	    this.adapterFactory = adapterFactory;
	    this.modelClass = modelClass;
	    this.uriTextIntialValue = "";
	}
	
	public LoadModelPage(String pageName,
			String pageTitle,
			String pageDescription,
			String modelExtension, 
			EClass modelClass,
			AdapterFactory adapterFactory,
			URI initialURI) 
	{
		super(pageName);

		setTitle(pageTitle);
		setDescription(pageDescription);
	    fileExtensions = new ArrayList<String>();
	    fileExtensions.add(modelExtension);
	    this.adapterFactory = adapterFactory;
	    this.modelClass = modelClass;
	    if (initialURI != null)
	    {
	    	this.uriTextIntialValue = initialURI.toString();
	    }
	    else
	    {
		    this.uriTextIntialValue = "";
	    }
	}

	@Override
	public void handleEvent(Event event) 
	{
		if (event.type == SWT.Modify && event.widget == uriText)
	    {
			uriTextModified(uriText.getText().trim());
	    }
	    else if (event.type == SWT.Selection && event.widget == browseFileSystemButton)
	    {
	    	browseFileSystem();
	    }
	    else if (event.type == SWT.Selection && event.widget == browseWorkspaceButton)
	    {
	    	browseWorkspace();
	    }
	    else if (event.type == SWT.Selection && event.widget == loadButton)
	    {
	    	refreshModel();
	    	getContainer().updateButtons();
	    } 
	    
		getContainer().updateButtons();
	}
	
	protected List<String> getFileExtensions()
	{
		return fileExtensions;
	}
	
	protected String[] getFilterExtensions()
	{
		if (filterExtensions == null)
	    {
			if (fileExtensions.isEmpty())
			{
				filterExtensions = new String []{ "*.*" };
			}
			else if (fileExtensions.size() == 1)
			{
				filterExtensions = new String[]{"*." + fileExtensions.get(0)};
			}
			else
			{
				StringBuffer allFilterExtensions = new StringBuffer();
				String[] extensions = new String [fileExtensions.size() + 1];
				for (int i = 1, lenght=extensions.length; i < lenght; i++)
				{
					extensions[i] = "*." + fileExtensions.get(i-1);
					allFilterExtensions.append(";").append(extensions[i]);
				}
				allFilterExtensions.deleteCharAt(0);
				extensions[0] = allFilterExtensions.toString();
				filterExtensions = extensions;
			}
	    }
	    return filterExtensions;
	}

	protected boolean browseFileSystem()
	{
		FileDialog fileDialog = new FileDialog(getShell(), SWT.OPEN | SWT.SINGLE);
		fileDialog.setFilterExtensions(getFilterExtensions());
	    
	    if (fileDialog.open() != null && fileDialog.getFileNames().length > 0)
	    {
	    	String[] fileNames = fileDialog.getFileNames();
	    	StringBuffer text = new StringBuffer();
	    	for (int i = 0; i < fileNames.length; ++i)
	    	{
	    		String filePath = fileDialog.getFilterPath() + File.separator + fileNames[i];
	    		text.append(URI.createFileURI(filePath).toString());
	    		text.append(" ");
	    	}
	    	setURIText(text.toString());
	    	refreshModel();
	    	return true;
	    }
	    return false;
	}

	protected boolean isValidWorkspaceResource(IResource resource)
	{
		if (resource.getType() == IResource.FILE) 
	    {
			String[] filterExtensions = getFilterExtensions();
			if (filterExtensions.length > 0)
			{
				for (int i = 0; i < filterExtensions.length; i++)
				{
					if (filterExtensions[i].endsWith(".*") || filterExtensions[i].endsWith("." + resource.getFileExtension()))
					{
						return true;
					}
				}
			}
	    }
	    return false;
	}
	  
	protected boolean browseWorkspace()
	{
		ViewerFilter extensionFilter = new ViewerFilter()
			{
				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element)
				{
					return !(element instanceof IFile) || getFileExtensions().contains(((IFile)element).getFileExtension());
				}
			};
	    
	    IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, false, null, extensionFilter == null ? null : Collections.singletonList(extensionFilter));
	    if (files.length > 0)
	    {
	    	StringBuffer text = new StringBuffer();
	    	for (int i = 0; i < files.length; ++i)
	    	{
	    		if (isValidWorkspaceResource(files[i]))
	    		{
	    			text.append(URI.createPlatformResourceURI(files[i].getFullPath().toString(), true));
	    			text.append("  ");
	    		}
	    	}
	    	setURIText(text.toString());
	    	refreshModel();
	    	return true;
	    }
	    return false;
	}


	@Override
	public void createControl(Composite parent)
	{	
	    Composite composite = new Composite(parent, SWT.NONE);
	    composite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_VERTICAL));

	    GridLayout layout = new GridLayout();
	    layout.verticalSpacing = 8;
	    composite.setLayout(layout);

	    createURIControl(composite);
	    setControl(composite);
	}

	protected void refreshModel()
	{
		WorkspaceModifyOperation initializeOperation = new WorkspaceModifyOperation()
			{
				@Override
				protected void execute(IProgressMonitor progressMonitor) 
					throws CoreException
				{
					setErrorMessage(null);
					setMessage(null);
	          
					Monitor monitor = BasicMonitor.toMonitor(progressMonitor);

					ResourceSet resourceSet = new ResourceSetImpl();
	          
					modelURI = URI.createURI(uriText.getText());
					
					try
					{
						modelResource = resourceSet.getResource(modelURI, true);
					}
					catch (Exception exception)
					{
						setMessage(null);
						setErrorMessage("Resource Loading Error");
					}
					finally
					{
						monitor.done();
					}
	          
					if (modelResource != null)
					{
						model = modelResource.getContents().get(0);
						if (model.eClass() != modelClass)
						{
							model = null;
							setMessage(null);
							setErrorMessage("Wrong model!");
							return;
						}
						
						if (modelResource instanceof XtextResource)
						{
							IResourceValidator validator = 
								((XtextResource)modelResource).getResourceServiceProvider().getResourceValidator();
							List<Issue> issues = validator.validate(modelResource, CheckMode.ALL, null);
							if (!issues.isEmpty())
							{
						    	model = null;

								setMessage(null);
								setErrorMessage("Resource Validation Error!");
							}
						}
						else
						{
							Diagnostician diagnostician = new Diagnostician()
							{
								@Override
								public String getObjectLabel(EObject eObject)
								{
									if (!eObject.eIsProxy())
									{
										IItemLabelProvider itemLabelProvider = 
											(IItemLabelProvider)adapterFactory.adapt(eObject, IItemLabelProvider.class);
										if (itemLabelProvider != null)
										{
											return itemLabelProvider.getText(eObject);
										}
									} 
									return super.getObjectLabel(eObject);
								}
							};
					    
							BasicDiagnostic diagnostic;
							diagnostic = diagnostician.createDefaultDiagnostic(model);

							Map<Object, Object> context = diagnostician.createDefaultContext();
							diagnostician.validate(model, diagnostic, context);				
						
					    	if (diagnostic.getSeverity() != Diagnostic.OK)
					    	{
					    		model = null;

								setMessage(null);
								setErrorMessage("Resource Validation Error!");
								handleDiagnostic(diagnostic);
					    	}
						}
					    
					    if (isPageComplete())
						{
							setPageComplete(true);
						}
						else
						{
							setPageComplete(false);
							uriText.selectAll();
							uriText.setFocus();
						}
					}
				}
			};

		try
		{
			getContainer().run(false, false, initializeOperation);
		}
		catch (Exception exception)
		{
			setMessage(null);
			setErrorMessage("Unable to load resource");
		}

		if (isPageComplete())
		{
			setPageComplete(true);
		}
		else
		{
			setPageComplete(false);
			uriText.selectAll();
			uriText.setFocus();
		}
	}	
	
	  protected void handleDiagnostic(Diagnostic diagnostic)
	  {
	    int severity = diagnostic.getSeverity();
	    String title = null;
	    String message = null;

	    if (severity == Diagnostic.ERROR || severity == Diagnostic.WARNING)
	    {
	      title = ModelingUtilPlugin.getString("_UI_ValidationProblems_title");
	      message = ModelingUtilPlugin.getString("_UI_ValidationProblems_message");
	    }
	    else
	    {
	      title = ModelingUtilPlugin.getString("_UI_ValidationResults_title");
	      message = ModelingUtilPlugin.getString(severity == Diagnostic.OK ? "_UI_ValidationOK_message" : "_UI_ValidationResults_message");
	    }

	    if (diagnostic.getSeverity() == Diagnostic.OK)
	    {
	      MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message);
	    }
	    else
	    {
	      DiagnosticDialog.open
	        (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message, diagnostic);
	    }

	  }

	
	protected void createURIControl(Composite parent)
	{
		Composite composite = new Composite(parent, SWT.NONE);
	    composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
	    {
	    	FormLayout layout = new FormLayout();
	    	layout.marginTop = 10;
	    	layout.spacing = 10;
	    	composite.setLayout(layout);
	    }
	    
	    Label uriLabel = new Label(composite, SWT.LEFT);
	    {
	    	FormData data = new FormData();
	    	data.left = new FormAttachment(0);
	    	uriLabel.setLayoutData(data);      
	    }
	    
	    uriLabel.setText(getURITextLabel());

	    Composite uriComposite = new Composite(composite, SWT.NONE);
	    {
	    	FormData data = new FormData();
	    	data.top = new FormAttachment(uriLabel, 5);
	    	data.left = new FormAttachment(0);
	    	data.right = new FormAttachment(100);
	    	uriComposite.setLayoutData(data);

	    	GridLayout layout = new GridLayout(2, false);
	    	layout.marginTop = -5;
	    	layout.marginLeft = -5;
	    	layout.marginRight = -5;
	    	uriComposite.setLayout(layout);
	    }
	    
	    Composite buttonComposite = new Composite(composite, SWT.NONE);
	    {
	    	FormData data = new FormData();
	    	data.top = new FormAttachment(uriLabel, 0, SWT.CENTER);
	    	data.left = new FormAttachment(uriLabel, 0);
	    	data.right = new FormAttachment(100);
	    	buttonComposite.setLayoutData(data);      

	    	FormLayout layout = new FormLayout();
	    	layout.marginTop = 0;
	    	layout.marginBottom = 0;
	    	layout.marginLeft = 0;
	    	layout.marginRight = 0;
	    	layout.spacing = 5;
	    	buttonComposite.setLayout(layout);
	    }

	    browseFileSystemButton = new Button(buttonComposite, SWT.PUSH);
	    browseFileSystemButton.setText(getBrowseFileSystemButtonLabel());
	    browseFileSystemButton.addListener(SWT.Selection, this);

	    browseWorkspaceButton = new Button(buttonComposite, SWT.PUSH);
	    browseWorkspaceButton.setText(getBrowseWorkspaceButtonLabel());
	    browseWorkspaceButton.addListener(SWT.Selection, this);

	    {
	    	FormData data = new FormData();
	    	data.right = new FormAttachment(browseWorkspaceButton);
	    	browseFileSystemButton.setLayoutData(data);      
	    }

	    {
	    	FormData data = new FormData();
	    	data.right = new FormAttachment(100);
	    	browseWorkspaceButton.setLayoutData(data);      
	    }
	     
	    uriText = new Text(uriComposite, SWT.SINGLE | SWT.BORDER);
	    setURIText(getURITextInitialValue());
	    if (uriText.getText().length() > 0)
	    {
	    	uriText.selectAll();
	    }
	    uriText.addListener(SWT.Modify, this);
	    
	    addURIControl(uriComposite);

	    {
	    	GridData gridData = new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL);
	    	if (uriComposite.getChildren().length == 1)
	    	{
	    		gridData.horizontalSpan = 2;
	    	}
	    	uriText.setLayoutData(gridData);      
	    }
	}

	protected String getURITextLabel()
	{
		return "";
	}
	  
	protected String getURITextInitialValue()
	{
		return uriTextIntialValue;
	}
	  
	protected void addURIControl(Composite parent)
	{
		loadButton = new Button(parent, SWT.PUSH);
		loadButton.setText(ModelingUtilPlugin.getString("_UI_Load_label"));
		loadButton.setLayoutData(new GridData(GridData.END));
		loadButton.addListener(SWT.Selection, this);
	}
	
	protected void adjustLoadButton()
	{
		if (loadButton != null)
		{
			String text = uriText.getText();
			loadButton.setEnabled(text != null && text.trim().length() > 0);
		}    
	}
	  
	public void dispose()
	{
		if (uriText != null)
		{
			uriText.removeListener(SWT.Modify, this);
			uriText = null;
		}
		if (browseFileSystemButton != null)
		{
			browseFileSystemButton.removeListener(SWT.Selection, this);
			browseFileSystemButton = null;
		}
		if (browseWorkspaceButton != null)
		{
			browseWorkspaceButton.removeListener(SWT.Selection, this);
			browseWorkspaceButton = null;
		}
	    if (loadButton != null)
	    {
	    	loadButton.removeListener(SWT.Selection, this);
	    	loadButton = null;
	    }

	    super.dispose();
	}
	
	protected void setURIText(String uri)
	{
	    uri = uri.trim();
	    StringBuffer text = new StringBuffer(uriText.getText());
	    if (!uri.equals(text))
	    {
	    	uriText.setText(uri.trim());
	    }
	}
	  
	protected String getBrowseFileSystemButtonLabel()
	{
	    return ModelingUtilPlugin.getString("_UI_BrowseFileSystemFile_label");
	}

	protected String getBrowseWorkspaceButtonLabel()
	{
	    return ModelingUtilPlugin.getString("_UI_BrowseWorkspace_label");
	}
	  
	protected void uriTextModified(String text)
	{
	    setErrorMessage(null);
	    setMessage(null);
	}

	@Override
	public boolean isPageComplete()
	{
		return model != null;
	}

	public URI getModelURI() {
		return modelURI;
	}  
}
