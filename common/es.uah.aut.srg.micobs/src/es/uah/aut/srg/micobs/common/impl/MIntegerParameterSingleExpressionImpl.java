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

import es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MIntegerParameterSingleExpression</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterSingleExpressionImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterSingleExpressionImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIntegerParameterSingleExpressionImpl extends MIntegerParameterImpl implements MIntegerParameterSingleExpression {
	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression defaultValue;

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
	protected MIntegerParameterSingleExpressionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MINTEGER_PARAMETER_SINGLE_EXPRESSION;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getDefaultValue() {
		return defaultValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(MParameterValueExpression newDefaultValue, NotificationChain msgs) {
		MParameterValueExpression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setDefaultValue(MParameterValueExpression newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE, oldRange, newRange);
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
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE, newRange, newRange));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE:
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
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE:
				return getDefaultValue();
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE:
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
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE:
				setDefaultValue((MParameterValueExpression)newValue);
				return;
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE:
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
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE:
				setDefaultValue((MParameterValueExpression)null);
				return;
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE:
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
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE:
				return defaultValue != null;
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MParameterDefaultValueSingleExpression.class) {
			switch (derivedFeatureID) {
				case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE: return commonPackage.MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__DEFAULT_VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MParameterDefaultValueSingleExpression.class) {
			switch (baseFeatureID) {
				case commonPackage.MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__DEFAULT_VALUE: return commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}