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
package es.uah.aut.srg.micobs.library.ui;

import java.util.Vector;

import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 * Class that implements the dialog shown to the user to confirm the deletion
 * of a given set of model elements from the libraries.
 *
 */
public class ConfirmElementsDeletion extends TrayDialog {
	
	public ConfirmElementsDeletion(Shell parentShell, boolean resizeable) {
		
		super(parentShell);
		setShellStyle(getShellStyle() | ((resizeable == true) ? SWT.RESIZE : 0));
		this.columnTitles = new Vector<String>();
		this.columnWidths = new Vector<Integer>();
	}
	
	public void addColumn(String title, int width)
	{
		columnTitles.add(title);
		columnWidths.add(width);
		numColumns++;
	}
	
	protected Vector<String> columnTitles;
	protected Vector<Integer> columnWidths;
	
	protected int numColumns = 0;
	
    protected ITableLabelProvider fLabelProvider;

    protected Object fInput;

    protected TableViewer fTableViewer;

    protected int widthInChars = 120;

    protected int heightInChars = 30;
    
    public void setInput(Object input) {
        fInput = input;
    }

    public void setLabelProvider(ITableLabelProvider lp) {
        fLabelProvider = lp;
    }

    public TableViewer getTableViewer() {
        return fTableViewer;
    }

	protected String message = ""; //$NON-NLS-1$
	
	
	public void setMessage(String message) {
		this.message = message;
	}

	protected Label createMessageArea(Composite composite) {
		Label label = new Label(composite, SWT.NONE);
		if (message != null) {
			label.setText(message);
		}
		label.setFont(composite.getFont());
		return label;
	}

    protected Control createDialogArea(Composite container) {
        Composite parent = (Composite) super.createDialogArea(container);
        createMessageArea(parent);
        fTableViewer = new TableViewer(parent, getTableStyle());


        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.heightHint = convertHeightInCharsToPixels(heightInChars);
        gd.widthHint = convertWidthInCharsToPixels(widthInChars);
        Table table = fTableViewer.getTable();
        table.setLayoutData(gd);
        table.setFont(container.getFont());
        table.setHeaderVisible(true);
        
        for (int i = 0; i < numColumns; i++)
        {
        	TableColumn column = new TableColumn(table, SWT.NULL);
        	column.setText(columnTitles.get(i));
        	column.setWidth(convertWidthInCharsToPixels(columnWidths.get(i)));
        }
        
        fTableViewer.setContentProvider(ArrayContentProvider.getInstance());
        fTableViewer.setLabelProvider(fLabelProvider);
        fTableViewer.setInput(fInput);
        
        return parent;
    }

    protected int getTableStyle() {
        return SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER;
    }

    public int getHeightInChars() {
        return heightInChars;
    }

    public int getWidthInChars() {
        return widthInChars;
    }

    public void setHeightInChars(int heightInChars) {
        this.heightInChars = heightInChars;
    }

    public void setWidthInChars(int widthInChars) {
        this.widthInChars = widthInChars;
    }

}
