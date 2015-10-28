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
package es.uah.aut.srg.micobs.mclev.mclevcmp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;

/**
 * An implementation of the model object '<em><b>MIntegerParamCSPSwitchCase</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchCaseImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIntegerParamCSPSwitchCaseImpl extends MParameterCSPSwitchCaseImpl implements MIntegerParamCSPSwitchCase {
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
	protected MIntegerParamCSPSwitchCaseImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MINTEGER_PARAM_CSP_SWITCH_CASE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE, oldRange, newRange);
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
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE, newRange, newRange));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE:
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
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE:
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
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE:
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
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE:
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
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

}