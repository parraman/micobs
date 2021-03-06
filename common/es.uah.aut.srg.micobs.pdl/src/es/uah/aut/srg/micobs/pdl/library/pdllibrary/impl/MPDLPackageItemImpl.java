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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageItem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage;

/**
 * An implementation of the model object '<em><b>MPDLPackageItem</b></em>'.
 *
 * @generated
 */
public abstract class MPDLPackageItemImpl extends MCommonPackageItemImpl implements MPDLPackageItem {
	/**
	 * @generated
	 */
	protected MPDLPackageItemImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdllibraryPackage.Literals.MPDL_PACKAGE_ITEM;
	}

} //MPDLPackageItemImpl
