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
package es.uah.aut.srg.micobs.pdl.impl;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl;
import es.uah.aut.srg.micobs.pdl.MPDLPackageElement;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MPDLPackageElement</b></em>'.
 *
 * @generated
 */
public abstract class MPDLPackageElementImpl extends MCommonPackageElementImpl implements MPDLPackageElement {
	/**
	 * @generated
	 */
	protected MPDLPackageElementImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MPDL_PACKAGE_ELEMENT;
	}

}
