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
package es.uah.aut.srg.micobs.system.library.systemlibrary.impl;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage;

/**
 * An implementation of the model object '<em><b>MSystemPackageItem</b></em>'.
 *
 * @generated
 */
public abstract class MSystemPackageItemImpl extends MCommonPackageItemImpl implements MSystemPackageItem {
	/**
	 * @generated
	 */
	protected MSystemPackageItemImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return systemlibraryPackage.Literals.MSYSTEM_PACKAGE_ITEM;
	}

}
