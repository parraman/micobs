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
package es.uah.aut.srg.micobs.pdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MIntegerParamOSSPSwitchCase</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchCaseImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIntegerParamOSSPSwitchCaseImpl extends MParameterOSSPSwitchCaseImpl implements MIntegerParamOSSPSwitchCase {
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
	protected MIntegerParamOSSPSwitchCaseImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MINTEGER_PARAM_OSSP_SWITCH_CASE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE, oldRange, newRange);
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
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE, newRange, newRange));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE:
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
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE:
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
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE:
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
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE:
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
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

}