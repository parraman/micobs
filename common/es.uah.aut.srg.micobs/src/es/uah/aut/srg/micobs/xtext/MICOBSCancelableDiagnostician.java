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
package es.uah.aut.srg.micobs.xtext;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.xtext.validation.CancelableDiagnostician;

import com.google.inject.Inject;

/**
 * MICOBS generic diagnostician for Xtext models. This diagnostician uses
 * the item provider adapter factories of the elements to provide a more
 * comprehensive description of the validation errors.
 *
 */
public class MICOBSCancelableDiagnostician extends CancelableDiagnostician {
	
	@Inject
	AdapterFactory adapterFactory;

	@Inject
	public MICOBSCancelableDiagnostician(Registry registry) {
		super(registry);
	}

	@Override
	public String getObjectLabel(EObject eObject) {
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

}
