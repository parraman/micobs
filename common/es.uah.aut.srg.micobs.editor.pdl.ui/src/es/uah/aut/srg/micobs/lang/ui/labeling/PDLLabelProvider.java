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
package es.uah.aut.srg.micobs.lang.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLStringHelper;
import es.uah.aut.srg.micobs.xtext.MICOBSLabelProvider;

/**
 * Provides labels for a EObjects.
 */
public class PDLLabelProvider extends MICOBSLabelProvider {

	@Inject
	public PDLLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	StyledString text(MOSSupportedOSAPI sosapi) {
		if (sosapi.getOsapi() == null ||
			sosapi.getOsapi().eIsProxy() == true)
		{
			return null;
		}
		StyledString name = new StyledString(PDLStringHelper.getInstance().getElementName(sosapi.getOsapi()));
		if (resourceLocator.getString("_UI_" + sosapi.eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + sosapi.eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}

}
