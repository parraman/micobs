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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.xtext.MICOBSLabelProvider;

/**
 * Provides labels for a EObjects.
 *
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class PROTLabelProvider extends MICOBSLabelProvider {

	@Inject
	public PROTLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

/*
	//Labels and icons can be computed like this:

	String text(MyModel ele) {
	  return "my "+ele.getName();
	}

    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
