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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.impl.MParameterImpl;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;

/**
 * An implementation of the model object '<em><b>MParameterCSPSwitch</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MParameterCSPSwitchImpl extends MParameterImpl implements MParameterCSPSwitch {
	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterCSPSwitchCase> cases;

	/**
	 * @generated
	 */
	protected MParameterCSPSwitchImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MPARAMETER_CSP_SWITCH;
	}

	/**
	 * @generated
	 */
	public EList<MParameterCSPSwitchCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<MParameterCSPSwitchCase>(MParameterCSPSwitchCase.class, this, mclevcmpPackage.MPARAMETER_CSP_SWITCH__CASES);
		}
		return cases;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MPARAMETER_CSP_SWITCH__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevcmpPackage.MPARAMETER_CSP_SWITCH__CASES:
				return getCases();
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
			case mclevcmpPackage.MPARAMETER_CSP_SWITCH__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends MParameterCSPSwitchCase>)newValue);
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
			case mclevcmpPackage.MPARAMETER_CSP_SWITCH__CASES:
				getCases().clear();
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
			case mclevcmpPackage.MPARAMETER_CSP_SWITCH__CASES:
				return cases != null && !cases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}