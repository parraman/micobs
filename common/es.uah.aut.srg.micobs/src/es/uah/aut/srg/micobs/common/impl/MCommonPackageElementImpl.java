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
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MCommonPackageElement</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl#getUri <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MCommonPackageElementImpl extends MinimalEObjectImpl.Container implements MCommonPackageElement {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>URI</em>}' attribute.
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * @generated
	 */
	protected MCommonPackageElementImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MCOMMON_PACKAGE_ELEMENT;
	}

	/**
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * @generated NOT
	 */
	public String getUri() {
		if (this.eContainer() instanceof MCommonPackageFile &&
			((MCommonPackageFile)this.eContainer()).getPackage() != null &&
			((MCommonPackageFile)this.eContainer()).getPackage().getUri() != null)
		{
			MCommonPackageFile file = (MCommonPackageFile)this.eContainer();
			return file.getPackage().getUri() + '.' +
					this.getName();
		}
		return "";
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION:
				return getVersion();
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME:
				return getName();
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__URI:
				return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION:
				setVersion((String)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME:
				setName((String)newValue);
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
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case commonPackage.MCOMMON_PACKAGE_ELEMENT__URI:
				return URI_EDEFAULT == null ? getUri() != null : !URI_EDEFAULT.equals(getUri());
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
		result.append(" (version: ");
		result.append(version);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

}