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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterRange</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterRangeImpl#getLowerValue <em>LowerValue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterRangeImpl#getUpperValue <em>UpperValue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MParameterRangeImpl extends MinimalEObjectImpl.Container implements MParameterRange {
	/**
	 * The cached value of the '{@link #getLowerValue() <em>LowerValue</em>}' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression lowerValue;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>UpperValue</em>}' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression upperValue;

	/**
	 * @generated
	 */
	protected MParameterRangeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_RANGE;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getLowerValue() {
		return lowerValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(MParameterValueExpression newLowerValue, NotificationChain msgs) {
		MParameterValueExpression oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_RANGE__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setLowerValue(MParameterValueExpression newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_RANGE__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_RANGE__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_RANGE__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getUpperValue() {
		return upperValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(MParameterValueExpression newUpperValue, NotificationChain msgs) {
		MParameterValueExpression oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_RANGE__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setUpperValue(MParameterValueExpression newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_RANGE__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_RANGE__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_RANGE__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MPARAMETER_RANGE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case commonPackage.MPARAMETER_RANGE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MPARAMETER_RANGE__LOWER_VALUE:
				return getLowerValue();
			case commonPackage.MPARAMETER_RANGE__UPPER_VALUE:
				return getUpperValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MPARAMETER_RANGE__LOWER_VALUE:
				setLowerValue((MParameterValueExpression)newValue);
				return;
			case commonPackage.MPARAMETER_RANGE__UPPER_VALUE:
				setUpperValue((MParameterValueExpression)newValue);
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
			case commonPackage.MPARAMETER_RANGE__LOWER_VALUE:
				setLowerValue((MParameterValueExpression)null);
				return;
			case commonPackage.MPARAMETER_RANGE__UPPER_VALUE:
				setUpperValue((MParameterValueExpression)null);
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
			case commonPackage.MPARAMETER_RANGE__LOWER_VALUE:
				return lowerValue != null;
			case commonPackage.MPARAMETER_RANGE__UPPER_VALUE:
				return upperValue != null;
		}
		return super.eIsSet(featureID);
	}

}
