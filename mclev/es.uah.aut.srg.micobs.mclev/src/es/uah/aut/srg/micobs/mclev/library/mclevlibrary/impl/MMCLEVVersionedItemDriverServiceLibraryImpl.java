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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;

/**
 * An implementation of the model object '<em><b>MMCLEVVersionedItemDriverServiceLibrary</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemDriverServiceLibraryImpl#getSwPackageURI <em>SwPackageURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemDriverServiceLibraryImpl#getSwPackageVersion <em>SwPackageVersion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMCLEVVersionedItemDriverServiceLibraryImpl extends MMCLEVPackageVersionedItemImpl implements MMCLEVVersionedItemDriverServiceLibrary {
	/**
	 * The default value of the '{@link #getSwPackageURI() <em>SwPackageURI</em>}' attribute.
	 * @see #getSwPackageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_PACKAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwPackageURI() <em>SwPackageURI</em>}' attribute.
	 * @see #getSwPackageURI()
	 * @generated
	 * @ordered
	 */
	protected String swPackageURI = SW_PACKAGE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwPackageVersion() <em>SwPackageVersion</em>}' attribute.
	 * @see #getSwPackageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_PACKAGE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwPackageVersion() <em>SwPackageVersion</em>}' attribute.
	 * @see #getSwPackageVersion()
	 * @generated
	 * @ordered
	 */
	protected String swPackageVersion = SW_PACKAGE_VERSION_EDEFAULT;

	/**
	 * @generated
	 */
	protected MMCLEVVersionedItemDriverServiceLibraryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevlibraryPackage.Literals.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY;
	}

	/**
	 * @generated
	 */
	public String getSwPackageURI() {
		return swPackageURI;
	}

	/**
	 * @generated
	 */
	public void setSwPackageURI(String newSwPackageURI) {
		String oldSwPackageURI = swPackageURI;
		swPackageURI = newSwPackageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI, oldSwPackageURI, swPackageURI));
	}

	/**
	 * @generated
	 */
	public String getSwPackageVersion() {
		return swPackageVersion;
	}

	/**
	 * @generated
	 */
	public void setSwPackageVersion(String newSwPackageVersion) {
		String oldSwPackageVersion = swPackageVersion;
		swPackageVersion = newSwPackageVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION, oldSwPackageVersion, swPackageVersion));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI:
				return getSwPackageURI();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION:
				return getSwPackageVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI:
				setSwPackageURI((String)newValue);
				return;
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION:
				setSwPackageVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI:
				setSwPackageURI(SW_PACKAGE_URI_EDEFAULT);
				return;
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION:
				setSwPackageVersion(SW_PACKAGE_VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI:
				return SW_PACKAGE_URI_EDEFAULT == null ? swPackageURI != null : !SW_PACKAGE_URI_EDEFAULT.equals(swPackageURI);
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION:
				return SW_PACKAGE_VERSION_EDEFAULT == null ? swPackageVersion != null : !SW_PACKAGE_VERSION_EDEFAULT.equals(swPackageVersion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (swPackageURI: ");
		result.append(swPackageURI);
		result.append(", swPackageVersion: ");
		result.append(swPackageVersion);
		result.append(')');
		return result.toString();
	}

}