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

import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A version of the MESP project creation page that provides the selection of
 * a referencing element.
 *
 */
public class ReferencingMESPProjectCreationPage extends MESPProjectCreationPage {

	protected Collection<MCommonPackageElement> elements = null;
	protected MCommonPackageElement selectedElement = null;
	protected Text elementText;
	protected Button elementSelectionButton;
	
	private String elementLabel = "Element:";
	private String elementDialogTitle = "Element Selection";
	private String elementDialogMessage = "Select the attached element:";
	private String elementErrorMessage = "An element must be selected";
	private String elementButtonLabel = "Select element";
	
	/**
	 * Returns the element selection button label.
	 * @return the element selection button label.
	 */
	public String getElementButtonLabel() {
		return elementButtonLabel;
	}

	/**
	 * Sets the label of the element selection button.
	 * @param elementButtonLabel the new label for the element selection
	 * button.
	 */
	public void setElementButtonLabel(String elementButtonLabel) {
		this.elementButtonLabel = elementButtonLabel;
	}

	/**
	 * Returns the element label text.
	 * @return the element label text.
	 */
	public String getElementLabel() {
		return elementLabel;
	}

	/**
	 * Sets the element label text.
	 * @param elementLabel the new element label text.
	 */
	public void setElementLabel(String elementLabel) {
		this.elementLabel = elementLabel;
	}

	/**
	 * Returns the title of the element selection dialog.
	 * @return the title of the element selection dialog.
	 */
	public String getElementDialogTitle() {
		return elementDialogTitle;
	}

	/**
	 * Sets the title of the element selection dialog.
	 * @param elementDialogTitle the new title of the element
	 * selection dialog.
	 */
	public void setElementDialogTitle(String elementDialogTitle) {
		this.elementDialogTitle = elementDialogTitle;
	}

	/**
	 * Returns the message of the element selection dialog.
	 * @return the message of the element selection dialog.
	 */
	public String getElementDialogMessage() {
		return elementDialogMessage;
	}

	/**
	 * Sets the new message of the element selection dialog.
	 * @param elementDialogMessage the new message of the element
	 * selection dialog.
	 */
	public void setElementDialogMessage(String elementDialogMessage) {
		this.elementDialogMessage = elementDialogMessage;
	}

	/**
	 * Returns the error message to show if an element was not selected.
	 * 
	 * @return the error message to show if an element was not selected.
	 */
	public String getElementErrorMessage() {
		return elementErrorMessage;
	}

	/**
	 * Sets the error message to show if an element was not selected.
	 * @param elementErrorMessage the new error message.
	 */
	public void setElementErrorMessage(String elementErrorMessage) {
		this.elementErrorMessage = elementErrorMessage;
	}

	public ReferencingMESPProjectCreationPage(String pageName,
			IStructuredSelection selection,
			Collection<MLanguage> languages,
			Collection<MCommonPackage> packages,
			Collection<MConstructionTool> constructionTools,
			Collection<MCommonPackageElement> elements) {
		super(pageName, selection, languages, packages, constructionTools);
		this.elements = elements;
	}

	@Override
	protected void createExtraParameters(Composite parent) {
		super.createExtraParameters(parent);
		createElementSelection(parent);
		
	}
	
	/**
	 * Creates the element selection controls.
	 * @param composite the composite where the controls will be located,.
	 */
	private void createElementSelection(Composite composite)
	{
		Composite subComposite = new Composite(composite, SWT.NONE);
			
		subComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout layout = new GridLayout(3, false);
		subComposite.setLayout(layout);

		Label label = new Label(subComposite, SWT.NONE);
		label.setText(elementLabel);
		
		elementText = new Text(subComposite, SWT.BORDER);
		elementText.setEditable(false);
		elementText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			
		elementSelectionButton = new Button(subComposite, SWT.PUSH);
		elementSelectionButton.setText(elementButtonLabel);
		elementSelectionButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				handleElementSelectionButton();
			}
		});
			
		if (elements.size() <= 0)
		{
			elementSelectionButton.setEnabled(false);
		}
	}
	
	/**
	 * Handles the element selection button.
	 */
	private void handleElementSelectionButton() {
		
		ElementListSelectionDialog dialog = 
				new ElementListSelectionDialog(elementSelectionButton.getShell(),
						new LabelProvider()
							{

								@Override
								public String getText(Object element) {
									if (element instanceof MCommonPackageElement)
									{
										return MESPStringHelper.getDefault().getFullElementName((MCommonPackageElement)element);
									}
									return super.getText(element);
								}
							});
		
		dialog.setTitle(elementDialogTitle);
		dialog.setMessage(elementDialogMessage);
		dialog.setElements(elements.toArray());
		dialog.setMultipleSelection(false);
		
		// User pressed cancel
		if (dialog.open() == Window.OK) {
			
			Object[] result = dialog.getResult(); 
			
			if (result.length == 1)
			{
				selectedElement = (MCommonPackageElement) result[0];
				elementText.setText(MESPStringHelper.getDefault().getFullElementName(selectedElement));
			}
			else
			{
				selectedElement = null;
				elementText.setText("");
			}
		}

        boolean valid = validatePage();
        setPageComplete(valid);
		
	}

	@Override
	protected boolean validateExtraParameters() {
		
		if (super.validateExtraParameters() == false)
		{
			return false;
		}
    	if (selectedElement == null)
    	{
    		setErrorMessage(elementErrorMessage);
			return false;
    	}
    	else
    	{
    		setErrorMessage(null);
    		setMessage(null);
    		return true;
    	}
	}
	
	/**
	 * Returns the selected element.
	 * @return the selected element.
	 */
	public MCommonPackageElement getSelectedElement()
	{
		return this.selectedElement;
	}
}
