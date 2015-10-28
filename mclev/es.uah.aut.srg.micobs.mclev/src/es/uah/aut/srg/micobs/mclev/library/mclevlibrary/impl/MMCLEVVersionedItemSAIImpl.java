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

import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;

/**
 * An implementation of the model object '<em><b>MMCLEVVersionedItemSAI</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemSAIImpl#getSwInterfaceURI <em>SwInterfaceURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemSAIImpl#getSwInterfaceVersion <em>SwInterfaceVersion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMCLEVVersionedItemSAIImpl extends MMCLEVPackageVersionedItemImpl implements MMCLEVVersionedItemSAI {
	/**
	 * The default value of the '{@link #getSwInterfaceURI() <em>SwInterfaceURI</em>}' attribute.
	 * @see #getSwInterfaceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_INTERFACE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwInterfaceURI() <em>SwInterfaceURI</em>}' attribute.
	 * @see #getSwInterfaceURI()
	 * @generated
	 * @ordered
	 */
	protected String swInterfaceURI = SW_INTERFACE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwInterfaceVersion() <em>SwInterfaceVersion</em>}' attribute.
	 * @see #getSwInterfaceVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SW_INTERFACE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwInterfaceVersion() <em>SwInterfaceVersion</em>}' attribute.
	 * @see #getSwInterfaceVersion()
	 * @generated
	 * @ordered
	 */
	protected String swInterfaceVersion = SW_INTERFACE_VERSION_EDEFAULT;

	/**
	 * @generated
	 */
	protected MMCLEVVersionedItemSAIImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevlibraryPackage.Literals.MMCLEV_VERSIONED_ITEM_SAI;
	}

	/**
	 * @generated
	 */
	public String getSwInterfaceURI() {
		return swInterfaceURI;
	}

	/**
	 * @generated
	 */
	public void setSwInterfaceURI(String newSwInterfaceURI) {
		String oldSwInterfaceURI = swInterfaceURI;
		swInterfaceURI = newSwInterfaceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI, oldSwInterfaceURI, swInterfaceURI));
	}

	/**
	 * @generated
	 */
	public String getSwInterfaceVersion() {
		return swInterfaceVersion;
	}

	/**
	 * @generated
	 */
	public void setSwInterfaceVersion(String newSwInterfaceVersion) {
		String oldSwInterfaceVersion = swInterfaceVersion;
		swInterfaceVersion = newSwInterfaceVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION, oldSwInterfaceVersion, swInterfaceVersion));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI:
				return getSwInterfaceURI();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION:
				return getSwInterfaceVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI:
				setSwInterfaceURI((String)newValue);
				return;
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION:
				setSwInterfaceVersion((String)newValue);
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
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI:
				setSwInterfaceURI(SW_INTERFACE_URI_EDEFAULT);
				return;
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION:
				setSwInterfaceVersion(SW_INTERFACE_VERSION_EDEFAULT);
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
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI:
				return SW_INTERFACE_URI_EDEFAULT == null ? swInterfaceURI != null : !SW_INTERFACE_URI_EDEFAULT.equals(swInterfaceURI);
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION:
				return SW_INTERFACE_VERSION_EDEFAULT == null ? swInterfaceVersion != null : !SW_INTERFACE_VERSION_EDEFAULT.equals(swInterfaceVersion);
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
		result.append(" (swInterfaceURI: ");
		result.append(swInterfaceURI);
		result.append(", swInterfaceVersion: ");
		result.append(swInterfaceVersion);
		result.append(')');
		return result.toString();
	}

}