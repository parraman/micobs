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

import es.uah.aut.srg.micobs.common.MParameterValueStringLiteral;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterValueStringLiteral</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueStringLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MParameterValueStringLiteralImpl extends MParameterValueLiteralImpl implements MParameterValueStringLiteral {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRaw() <em>IsRaw</em>}' attribute.
	 * @see #isIsRaw()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RAW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRaw() <em>IsRaw</em>}' attribute.
	 * @see #isIsRaw()
	 * @generated
	 * @ordered
	 */
	protected boolean isRaw = IS_RAW_EDEFAULT;

	/**
	 * @generated
	 */
	protected MParameterValueStringLiteralImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_VALUE_STRING_LITERAL;
	}

	/**
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_STRING_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * @generated
	 */
	public boolean isIsRaw() {
		return isRaw;
	}

	/**
	 * @generated
	 */
	public void setIsRaw(boolean newIsRaw) {
		boolean oldIsRaw = isRaw;
		isRaw = newIsRaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_STRING_LITERAL__IS_RAW, oldIsRaw, isRaw));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__VALUE:
				return getValue();
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__IS_RAW:
				return isIsRaw();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__VALUE:
				setValue((String)newValue);
				return;
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__IS_RAW:
				setIsRaw((Boolean)newValue);
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
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__IS_RAW:
				setIsRaw(IS_RAW_EDEFAULT);
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
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL__IS_RAW:
				return isRaw != IS_RAW_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", isRaw: ");
		result.append(isRaw);
		result.append(')');
		return result.toString();
	}

}
