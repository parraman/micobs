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
package es.uah.aut.srg.micobs.mesp.mespcommon.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;

/**
 * An implementation of the model object '<em><b>MQuantifiableResource</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MQuantifiableResourceImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MQuantifiableResourceImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MQuantifiableResourceImpl extends MProvidedResourceImpl implements MQuantifiableResource {
	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression lowerBound;
	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression upperBound;
	/**
	 * @generated
	 */
	protected MQuantifiableResourceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespcommonPackage.Literals.MQUANTIFIABLE_RESOURCE;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getLowerBound() {
		return lowerBound;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(MParameterValueExpression newLowerBound, NotificationChain msgs) {
		MParameterValueExpression oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setLowerBound(MParameterValueExpression newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND, newLowerBound, newLowerBound));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getUpperBound() {
		return upperBound;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(MParameterValueExpression newUpperBound, NotificationChain msgs) {
		MParameterValueExpression oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setUpperBound(MParameterValueExpression newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND:
				return getLowerBound();
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND:
				return getUpperBound();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND:
				setLowerBound((MParameterValueExpression)newValue);
				return;
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND:
				setUpperBound((MParameterValueExpression)newValue);
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
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND:
				setLowerBound((MParameterValueExpression)null);
				return;
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND:
				setUpperBound((MParameterValueExpression)null);
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
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__LOWER_BOUND:
				return lowerBound != null;
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE__UPPER_BOUND:
				return upperBound != null;
		}
		return super.eIsSet(featureID);
	}

}
