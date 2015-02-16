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
package es.uah.aut.srg.micobs.mesp.lang.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.xtext.MESPLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 */
public class SWPLabelProvider extends MESPLabelProvider {

	@Inject
	public SWPLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	StyledString text(MSwPackageProvidedInterface pswi) {
		if (pswi.getSwinterface() == null ||
			pswi.getSwinterface().eIsProxy() == true)
		{
			return null;
		}
		StyledString name = new StyledString(MESPStringHelper.getDefault().getElementName(pswi.getSwinterface()));
		if (resourceLocator.getString("_UI_" + pswi.eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + pswi.eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}

}
