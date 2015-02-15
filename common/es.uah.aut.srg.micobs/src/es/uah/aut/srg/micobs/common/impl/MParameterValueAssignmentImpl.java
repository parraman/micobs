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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterValueAssignment</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MParameterValueAssignmentImpl extends MinimalEObjectImpl.Container implements MParameterValueAssignment {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected MParameter parameter;

	/**
	 * @generated
	 */
	protected MParameterValueAssignmentImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_VALUE_ASSIGNMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER, oldParameter, parameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER, oldParameter, parameter));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER:
				setParameter((MParameter)newValue);
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
			case commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER:
				setParameter((MParameter)null);
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
			case commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

}