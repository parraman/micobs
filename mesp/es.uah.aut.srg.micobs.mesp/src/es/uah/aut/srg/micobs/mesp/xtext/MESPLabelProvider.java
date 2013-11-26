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
package es.uah.aut.srg.micobs.mesp.xtext;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;

import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.xtext.MICOBSLabelProvider;

/**
 * Generic MESP label provider to be used by the Xtext editors.
 *
 */
public class MESPLabelProvider extends MICOBSLabelProvider {

	public MESPLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/**
	 * Provides the styled string label of a software package required
	 * interface.
	 * 
	 * @param rswi the software package required interface.
	 * @return the styled string label.
	 */
	StyledString text(MSwPackageRequiredInterface rswi) {

		if (rswi.getInterface() == null ||
			rswi.getInterface().eIsProxy() == true)
		{
			return null;
		}
		StyledString name = new StyledString(MESPStringHelper.getDefault().getElementName(rswi.getInterface()));
		if (resourceLocator.getString("_UI_" + rswi.eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + rswi.eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}

	/**
	 * Provides the styled string label of a quantifiable resource
	 * demand.
	 * 
	 * @param qrd the quantifiable resource demand.
	 * @return the styled string label.
	 */
	StyledString text(MQuantifiableResourceDemand qrd) {
		if (qrd.getResource() == null ||
			qrd.getResource().eIsProxy() == true)
		{
			return null;
		}
		MSwPackageRequiredInterface rswi = (MSwPackageRequiredInterface) qrd.eContainer();
		StyledString name;
		if (qrd.getResource().eContainer() == rswi.getInterface())
		{
			name = new StyledString(MESPStringHelper.getDefault().getRelativeObjectName(qrd.getResource()));
		}
		else
		{
			name = new StyledString(MESPStringHelper.getDefault().getFullObjectNameToElement(qrd.getResource()));
		}
		if (resourceLocator.getString("_UI_" + qrd.eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + qrd.eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}
	
	/**
	 * Provides the styled string label of a instantiable resource
	 * demand.
	 * 
	 * @param ird the instantiable resource demand.
	 * @return the styled string label.
	 */
	StyledString text(MInstantiableResourceDemand ird) {
		if (ird.getResource() == null ||
			ird.getResource().eIsProxy() == true)
		{
			return null;
		}
		MSwPackageRequiredInterface rswi = (MSwPackageRequiredInterface) ird.eContainer();
		StyledString name;
		if (ird.getResource().eContainer() == rswi.getInterface())
		{
			name = new StyledString(MESPStringHelper.getDefault().getRelativeObjectName(ird.getResource()));
		}
		else
		{
			name = new StyledString(MESPStringHelper.getDefault().getFullObjectNameToElement(ird.getResource()));
		}
		if (resourceLocator.getString("_UI_" + ird.eClass().getName() + "_type") != null)
		{
			name.append(" : " + resourceLocator.getString("_UI_" + ird.eClass().getName() + "_type"), StyledString.DECORATIONS_STYLER);
		}
		return name;
	}
	
}
