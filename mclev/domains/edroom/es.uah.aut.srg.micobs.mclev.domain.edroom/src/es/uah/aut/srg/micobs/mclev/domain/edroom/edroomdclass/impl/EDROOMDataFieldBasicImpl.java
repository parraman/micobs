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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model object '<em><b>EDROOMDataFieldBasic</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMDataFieldBasicImpl extends EDROOMDataFieldImpl implements EDROOMDataFieldBasic {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EDROOMBasicType TYPE_EDEFAULT = EDROOMBasicType.TEDROOM_BOOL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDROOMBasicType type = TYPE_EDEFAULT;

	/**
	 * @generated
	 */
	protected EDROOMDataFieldBasicImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomdclassPackage.Literals.EDROOM_DATA_FIELD_BASIC;
	}

	/**
	 * @generated
	 */
	public EDROOMBasicType getType() {
		return type;
	}

	/**
	 * @generated
	 */
	public void setType(EDROOMBasicType newType) {
		EDROOMBasicType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edroomdclassPackage.EDROOM_DATA_FIELD_BASIC__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC__TYPE:
				setType((EDROOMBasicType)newValue);
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
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC__TYPE:
				setType(TYPE_EDEFAULT);
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
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

}
