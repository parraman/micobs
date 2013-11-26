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
package es.uah.aut.srg.micobs.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MCommonPackageItem</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl#getVersionedItems <em>VersionedItems</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl#getUri <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MCommonPackageItemImpl extends MinimalEObjectImpl.Container implements MCommonPackageItem {
	/**
	 * The cached value of the '{@link #getVersionedItems() <em>VersionedItems</em>}' containment reference list.
	 * @see #getVersionedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MCommonPackageVersionedItem> versionedItems;

	/**
	 * The default value of the '{@link #getUri() <em>URI</em>}' attribute.
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>URI</em>}' attribute.
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * @generated
	 */
	protected MCommonPackageItemImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MCOMMON_PACKAGE_ITEM;
	}

	/**
	 * @generated
	 */
	public EList<MCommonPackageVersionedItem> getVersionedItems() {
		if (versionedItems == null) {
			versionedItems = new EObjectContainmentEList<MCommonPackageVersionedItem>(MCommonPackageVersionedItem.class, this, commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS);
		}
		return versionedItems;
	}

	/**
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_ITEM__URI, oldUri, uri));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS:
				return ((InternalEList<?>)getVersionedItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS:
				return getVersionedItems();
			case commonPackage.MCOMMON_PACKAGE_ITEM__URI:
				return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS:
				getVersionedItems().clear();
				getVersionedItems().addAll((Collection<? extends MCommonPackageVersionedItem>)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_ITEM__URI:
				setUri((String)newValue);
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
			case commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS:
				getVersionedItems().clear();
				return;
			case commonPackage.MCOMMON_PACKAGE_ITEM__URI:
				setUri(URI_EDEFAULT);
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
			case commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS:
				return versionedItems != null && !versionedItems.isEmpty();
			case commonPackage.MCOMMON_PACKAGE_ITEM__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

}