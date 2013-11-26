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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ListSelectionDialog;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.ui.wizards.MICOBSProjectCreationPage;

/**
 * Specific version of the MICOBS standard project creation page for MESP
 * projects. This implementations provides a construction tool
 * selection facility.
 *
 */
public class MESPProjectCreationPage extends MICOBSProjectCreationPage {
	
	
	private final static String CTOOL_LABEL = "Const. Tool:";
			
	private List<MConstructionTool> constructionTools = null;
	private List<MConstructionTool> selectedCTools = null;
	private MConstructionTool selectedCTool = null;
	
	private Combo singleConstructionToolCombo;
	
	private Text multiCToolsText;
	private Button cToolSelectionButton;
	
	public MESPProjectCreationPage(String pageName,
			IStructuredSelection selection, Collection<MLanguage> languages,
			Collection<MCommonPackage> packages,
			Collection<MConstructionTool> constructionTools) {
		super(pageName, selection, languages, packages);
		if (constructionTools != null)
		{
			this.constructionTools = new ArrayList<MConstructionTool>();
			this.selectedCTools = new ArrayList<MConstructionTool>();
			this.constructionTools.addAll(constructionTools);
		}
		else
		{
			constructionToolSelection = false;
		}

	}
    	

	/**
	 * Handles the construction tool selection button.
	 */
	private void handleConstructionToolSelectionButtonPressed() {
		
		ListSelectionDialog dialog = 
				new ListSelectionDialog(cToolSelectionButton.getShell(),
						constructionTools.toArray(),
						new ArrayContentProvider(),
						new LabelProvider()
							{

								@Override
								public String getText(Object element) {
									if (element instanceof MConstructionTool)
									{
										return MESPStringHelper.getDefault().getElementName((MConstructionTool)element);
									}
									return super.getText(element);
								}
							}, 
							"Select the construction tools you want to use");
		
		dialog.setTitle("Construction Tool Selection");
		
		String cToolsList = "";
		
		// User pressed cancel
		if (dialog.open() == Window.OK) {
			
			selectedCTools.clear();
			Object[] result = dialog.getResult(); 
			
			if (result.length > 0)
			{
				selectedCTools.add((MConstructionTool)result[0]);
				cToolsList += MESPStringHelper.getDefault().getElementName((MConstructionTool)result[0]);
				
				for (int i = 1; i < result.length; i++)
				{
					selectedCTools.add((MConstructionTool)result[i]);
					cToolsList += ", " + MESPStringHelper.getDefault().getElementName((MConstructionTool)result[i]);
				}
			}
		}
		
		multiCToolsText.setText(cToolsList);

        boolean valid = validatePage();
        setPageComplete(valid);
		
	}
	
	protected void createExtraParameters(Composite composite) {
		
		if (canSelectConstructionTool() == false)
		{
			return;
		}
		
		if (canSelectMultipleCTools() == true)
		{
			Composite subComposite = new Composite(composite, SWT.NONE);
			
			subComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			GridLayout layout = new GridLayout(3, false);
			subComposite.setLayout(layout);

			Label cToolLabel = new Label(subComposite, SWT.NONE);
			cToolLabel.setText(CTOOL_LABEL);
			
			multiCToolsText = new Text(subComposite, SWT.BORDER);
			multiCToolsText.setEditable(false);
			multiCToolsText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
				
			cToolSelectionButton = new Button(subComposite, SWT.PUSH);
			cToolSelectionButton.setText("Select Const. Tools");
			cToolSelectionButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					handleConstructionToolSelectionButtonPressed();
				}
			});
				
			if (constructionTools.size() <= 0)
			{
				cToolSelectionButton.setEnabled(false);
			}
		}
		else
		{
			Composite subComposite = new Composite(composite, SWT.NONE);
			
			subComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			GridLayout layout = new GridLayout(2, false);
			subComposite.setLayout(layout);
			
			Label cToolLabel = new Label(subComposite, SWT.NONE);
			cToolLabel.setText(CTOOL_LABEL);
			
			singleConstructionToolCombo = new Combo(subComposite,
					SWT.BORDER | SWT.DROP_DOWN | 
	                SWT.V_SCROLL | SWT.H_SCROLL);
			
			singleConstructionToolCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			
			if (constructionTools.size() > 0)
			{
				for (MConstructionTool ctool : constructionTools)
				{
					singleConstructionToolCombo.add(MESPStringHelper.getDefault().getElementName(ctool));
				}
				singleConstructionToolCombo.select(0);
				selectedCTool = constructionTools.get(0);
			}
			singleConstructionToolCombo.addListener(SWT.Modify, this);
		}

	}
	
	
	
	@Override
	public void handleEvent(Event event) {
		if (canSelectConstructionTool() == true && 
			event.widget == singleConstructionToolCombo && 
			event.type == SWT.Modify)
		{
			selectedCTool = constructionTools.get(singleConstructionToolCombo.getSelectionIndex());
		}
		super.handleEvent(event);
	}


	/**
	 * Returns the selected construction tools. If the model cannot support
	 * the selection of multiple tools, the method will return <code>null</code>.
	 * 
	 * @return the set of selected tools or <code>null</code> if the model
	 * cannot support the selection of multiple construction tools.
	 */
	public Collection<MConstructionTool> getSelectedConstructionTools()
	{
		if (canSelectConstructionTool() == true &&
			canSelectMultipleCTools())
		{
			return selectedCTools;
		}
		return null;
	}
	
	/**
	 * Returns the selected tool. If the model can support the selection
	 * of multiple construction tools, the method will return <code>null</code>.
	 * 
	 * @return the selected construction tool or <code>null</code> if the model
	 * supports the selection of multiple tools.
	 */
	public MConstructionTool getSelectedCTool()
	{
		if (canSelectConstructionTool() == true &&
			constructionTools.size() > 0)
		{
			return selectedCTool;
		}
		return null;
	}
	
	@Override
    protected boolean validateExtraParameters() 
	{
		if (canSelectConstructionTool() == true && 
			validateConstructionTool() == false)
		{
			return false;
		}
		return true;
	}
    
	/**
	 * Checks that at least one construction tool is selected.
     * @return <code>true</code> if at least one tool is selected and
     * <code>false</code> otherwise.
	 */
	private boolean validateConstructionTool() {
    	
		if (canSelectMultipleCTools() == true)
		{
			if (getSelectedConstructionTools().isEmpty())
			{
				setErrorMessage("A construction tool must be selected");
				return false;
			}
			setErrorMessage(null);
			setMessage(null);
			return true;
		}
		else
		{
			if (getSelectedCTool() == null)
			{
				setErrorMessage("A construction tool must be selected");
				return false;
			}
			setErrorMessage(null);
    		setMessage(null);
    		return true;
		}
    }
        
	private boolean constructionToolSelection = true;
    
    /**
     * Returns <code>true</code> if the page allows the selection of a
     * construction tool.
     * 
     * @return <code>true</code> if the page allows the selection of a
     * construction tool and <code>false</code> otherwise.
     */
    public boolean canSelectConstructionTool() {
    	return constructionToolSelection;
    }
    
    private boolean multiCTool = false;
    
    /**
     * Returns <code>true</code> if the page allows the selection of
     * multiple construction tools.
     * 
     * @return <code>true</code> if the page allows the selection of
 	 * multiple tools and <code>false</code> otherwise.
     */
    public boolean canSelectMultipleCTools() {
    	return multiCTool;
    }
    
    /**
     * Sets if the page shall allow the selection of multiple construction
     * tools. This method shall be called before the page is initially
     * displayed.
     * 
     * @param multiCTool <code>true</code> if the page shall allow
     * the selection of multiple tools.
     */
    public void setSelectMultipleCTools(boolean multiCTool) {
    	this.multiCTool = multiCTool;
    	selectedCTools.clear();
    }
    
}
