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
package es.uah.aut.srg.micobs.xtext;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.label.DeclarativeLabelProvider;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;

/**
 * Generic Xtext label provider that creates styled strings for the common
 * elements of the models. This class shall be extended by the different
 * editors.
 *
 */
public class MICOBSLabelProvider extends DeclarativeLabelProvider {
	
	@Inject
	protected ResourceLocator resourceLocator;
	
	public MICOBSLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	StyledString text(MCommonPackageElement element) {
		if (element.getName() == null ||
			element.getName() == "" ||
			element.getVersion() == null ||
			element.getVersion() == "")
		{
			return null;
		}
		StyledString name = new StyledString(MICOBSStringHelper.getInstance().getElementName(element));
		if (resourceLocator.getString("_UI_" + element.eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + element.eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}
	
	StyledString text(MCommonReferenceableObj object) {
		if (object.getName() == null ||
			object.getName() == "")
		{
			return null;
		}
		StyledString name = new StyledString(object.getName());
		if (resourceLocator.getString("_UI_" + object.eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + object.eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}
	
	StyledString text(MParameterValueAssignment object) {
		if (object.getParameter() == null ||
			object.getParameter().eIsProxy() == true)
		{
			return null;
		}
		StyledString name = new StyledString(MICOBSStringHelper.getInstance().getFullObjectNameToElement(object.getParameter()));
		if (resourceLocator.getString("_UI_" + object.getParameter().eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + object.getParameter().eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}

}
