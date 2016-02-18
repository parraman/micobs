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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model object '<em><b>EDROOMDataDefinitionEnumElement</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMDataDefinitionEnumElementImpl extends EObjectImpl implements EDROOMDataDefinitionEnumElement {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * @generated
	 */
	protected EDROOMDataDefinitionEnumElementImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomdclassPackage.Literals.EDROOM_DATA_DEFINITION_ENUM_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME, oldName, name));
	}

	/**
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE, oldValue, value));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME:
				return getName();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE:
				setValue((Integer)newValue);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

}
