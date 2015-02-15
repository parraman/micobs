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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueDependentItem;
import es.uah.aut.srg.micobs.common.MParameterValueRange;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterValueDependentItem</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemImpl#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MParameterValueDependentItemImpl extends MinimalEObjectImpl.Container implements MParameterValueDependentItem {
	/**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference.
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueRange> ranges;

	/**
	 * @generated
	 */
	protected MParameterValueDependentItemImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_VALUE_DEPENDENT_ITEM;
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueRange> getRanges() {
		if (ranges == null) {
			ranges = new EObjectContainmentEList<MParameterValueRange>(MParameterValueRange.class, this, commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES);
		}
		return ranges;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES:
				return ((InternalEList<?>)getRanges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES:
				return getRanges();
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
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES:
				getRanges().clear();
				getRanges().addAll((Collection<? extends MParameterValueRange>)newValue);
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
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES:
				getRanges().clear();
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
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES:
				return ranges != null && !ranges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
