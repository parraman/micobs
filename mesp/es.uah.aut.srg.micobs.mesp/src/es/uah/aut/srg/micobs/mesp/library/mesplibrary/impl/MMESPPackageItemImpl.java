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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;

/**
 * An implementation of the model object '<em><b>MMESPPackageItem</b></em>'.
 *
 * @generated
 */
public abstract class MMESPPackageItemImpl extends MCommonPackageItemImpl implements MMESPPackageItem {
	/**
	 * @generated
	 */
	protected MMESPPackageItemImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mesplibraryPackage.Literals.MMESP_PACKAGE_ITEM;
	}

}
