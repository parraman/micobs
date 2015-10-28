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
package es.uah.aut.srg.micobs.mclev.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.ui.wizards.MICOBSProjectCreationPage;

/**
 * Specific version of the MICOBS standard project creation page for creating
 * MCLEV projects. This implementations provides a domain
 * selection facility.
 */
public class MCLEVProjectCreationPage extends MICOBSProjectCreationPage {
	
	
	private final static String DOMAIN_LABEL = "Domain:";
			
	private List<MDomain> domains = null;
	private MDomain selectedDomain = null;
	
	private Combo singleDomainCombo;
	
	public MCLEVProjectCreationPage(String pageName, 
			IStructuredSelection selection,
			Collection<MLanguage> languages,
			Collection<MCommonPackage> packages,
			Collection<MDomain> domains) {
		super(pageName, selection, languages, packages);
		if (domains != null)
		{
			this.domains = new ArrayList<MDomain>();
			this.domains.addAll(domains);
		}
		else
		{
			domainSelection = false;
		}

	}
	
	protected void createExtraParameters(Composite composite) {
		
		if (canSelectDomain() == false)
		{
			return;
		}
		
		Composite subComposite = new Composite(composite, SWT.NONE);
			
		subComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		GridLayout layout = new GridLayout(2, false);
		subComposite.setLayout(layout);
			
		Label cToolLabel = new Label(subComposite, SWT.NONE);
		cToolLabel.setText(DOMAIN_LABEL);
			
		singleDomainCombo = new Combo(subComposite,
				SWT.BORDER | SWT.DROP_DOWN | 
                SWT.V_SCROLL | SWT.H_SCROLL);
			
		singleDomainCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		if (domains.size() > 0)
		{
			for (MDomain domain : domains)
			{
				singleDomainCombo.add(MCLEVStringHelper.getDefault().getElementName(domain));
			}
			singleDomainCombo.select(0);
			selectedDomain = domains.get(0);
		}
		singleDomainCombo.addListener(SWT.Modify, this);
	}
	
	public MDomain getSelectedDomain()
	{
		if (canSelectDomain() == true &&
			domains.size() > 0)
		{
			return selectedDomain;
		}
		return null;
	}
		
    protected boolean validateExtraParameters() 
	{
		if (canSelectDomain() == true && 
			validateDomain() == false)
		{
			return false;
		}
		return true;
	}
    
	private boolean validateDomain() {
    	
		if (getSelectedDomain() == null)
		{
			setErrorMessage("A domain must be selected");
			return false;
		}
		setErrorMessage(null);
   		setMessage(null);
   		return true;
    }
        
	private boolean domainSelection = true;
    
    public boolean canSelectDomain() {
    	return domainSelection;
    }
    
	
	@Override
	public void handleEvent(Event event) {
		if (canSelectDomain() == true && 
			event.widget == singleDomainCombo && 
			event.type == SWT.Modify)
		{
			selectedDomain = domains.get(singleDomainCombo.getSelectionIndex());
		}
		super.handleEvent(event);
	}
    
}