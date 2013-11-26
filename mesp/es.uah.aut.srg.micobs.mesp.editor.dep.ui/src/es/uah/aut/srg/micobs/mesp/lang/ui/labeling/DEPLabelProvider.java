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
package es.uah.aut.srg.micobs.mesp.lang.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mesp.xtext.MESPLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 */
public class DEPLabelProvider extends MESPLabelProvider {

	@Inject
	public DEPLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

}