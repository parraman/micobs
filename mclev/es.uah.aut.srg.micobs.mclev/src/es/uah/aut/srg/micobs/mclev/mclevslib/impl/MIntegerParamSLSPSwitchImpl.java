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
package es.uah.aut.srg.micobs.mclev.mclevslib.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl;
import es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * An implementation of the model object '<em><b>MIntegerParamSLSPSwitch</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIntegerParamSLSPSwitchImpl extends MIntegerParameterImpl implements MIntegerParamSLSPSwitch {
	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterSLSPSwitchCase> cases;

	/**
	 * @generated
	 */
	protected MIntegerParamSLSPSwitchImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevslibPackage.Literals.MINTEGER_PARAM_SLSP_SWITCH;
	}

	/**
	 * @generated
	 */
	public EList<MParameterSLSPSwitchCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<MParameterSLSPSwitchCase>(MParameterSLSPSwitchCase.class, this, mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES);
		}
		return cases;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES:
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
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES:
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
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends MParameterSLSPSwitchCase>)newValue);
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
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES:
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
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES:
				return cases != null && !cases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MParameterSLSPSwitch.class) {
			switch (derivedFeatureID) {
				case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES: return mclevslibPackage.MPARAMETER_SLSP_SWITCH__CASES;
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
		if (baseClass == MParameterSLSPSwitch.class) {
			switch (baseFeatureID) {
				case mclevslibPackage.MPARAMETER_SLSP_SWITCH__CASES: return mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH__CASES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}