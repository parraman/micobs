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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MIntegerParamSWPSPSwitch</b></em>'.
 *
 * @generated
 */
public class MIntegerParamSWPSPSwitchImpl extends MIntegerParameterImpl implements MIntegerParamSWPSPSwitch {
	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterSWPSPSwitchCase> cases;

	/**
	 * @generated
	 */
	protected MIntegerParamSWPSPSwitchImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MINTEGER_PARAM_SWPSP_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MParameterSWPSPSwitchCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<MParameterSWPSPSwitchCase>(MParameterSWPSPSwitchCase.class, this, mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES:
				return getCases();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends MParameterSWPSPSwitchCase>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES:
				getCases().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES:
				return cases != null && !cases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MParameterSWPSPSwitch.class) {
			switch (derivedFeatureID) {
				case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES: return mespswpPackage.MPARAMETER_SWPSP_SWITCH__CASES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MParameterSWPSPSwitch.class) {
			switch (baseFeatureID) {
				case mespswpPackage.MPARAMETER_SWPSP_SWITCH__CASES: return mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH__CASES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}