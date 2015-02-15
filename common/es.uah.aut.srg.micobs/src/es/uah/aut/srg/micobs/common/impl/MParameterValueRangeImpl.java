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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueRange;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterValueRange</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRangeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRangeImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRangeImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MParameterValueRangeImpl extends MinimalEObjectImpl.Container implements MParameterValueRange {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter parameter;

	/**
	 * The cached value of the '{@link #getParameterValue() <em>ParameterValue</em>}' containment reference.
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression parameterValue;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected MParameterRange range;

	/**
	 * @generated
	 */
	protected MParameterValueRangeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_VALUE_RANGE;
	}

	/**
	 * @generated
	 */
	public MParameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (MParameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * @generated
	 */
	public MParameter basicGetParameter() {
		return parameter;
	}

	/**
	 * @generated
	 */
	public void setParameter(MParameter newParameter) {
		MParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getParameterValue() {
		return parameterValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetParameterValue(MParameterValueExpression newParameterValue, NotificationChain msgs) {
		MParameterValueExpression oldParameterValue = parameterValue;
		parameterValue = newParameterValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE, oldParameterValue, newParameterValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setParameterValue(MParameterValueExpression newParameterValue) {
		if (newParameterValue != parameterValue) {
			NotificationChain msgs = null;
			if (parameterValue != null)
				msgs = ((InternalEObject)parameterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE, null, msgs);
			if (newParameterValue != null)
				msgs = ((InternalEObject)newParameterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE, null, msgs);
			msgs = basicSetParameterValue(newParameterValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE, newParameterValue, newParameterValue));
	}

	/**
	 * @generated
	 */
	public MParameterRange getRange() {
		return range;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetRange(MParameterRange newRange, NotificationChain msgs) {
		MParameterRange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_RANGE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setRange(MParameterRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_RANGE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_RANGE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_RANGE__RANGE, newRange, newRange));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE:
				return basicSetParameterValue(null, msgs);
			case commonPackage.MPARAMETER_VALUE_RANGE__RANGE:
				return basicSetRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE:
				return getParameterValue();
			case commonPackage.MPARAMETER_VALUE_RANGE__RANGE:
				return getRange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER:
				setParameter((MParameter)newValue);
				return;
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE:
				setParameterValue((MParameterValueExpression)newValue);
				return;
			case commonPackage.MPARAMETER_VALUE_RANGE__RANGE:
				setRange((MParameterRange)newValue);
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
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER:
				setParameter((MParameter)null);
				return;
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE:
				setParameterValue((MParameterValueExpression)null);
				return;
			case commonPackage.MPARAMETER_VALUE_RANGE__RANGE:
				setRange((MParameterRange)null);
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
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER:
				return parameter != null;
			case commonPackage.MPARAMETER_VALUE_RANGE__PARAMETER_VALUE:
				return parameterValue != null;
			case commonPackage.MPARAMETER_VALUE_RANGE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

}
