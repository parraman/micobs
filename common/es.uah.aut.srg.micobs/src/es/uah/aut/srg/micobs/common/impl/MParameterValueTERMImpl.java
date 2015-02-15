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

import es.uah.aut.srg.micobs.common.MParameterValue;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.MParameterValueTERMOperators;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterValueTERM</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueTERMImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueTERMImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueTERMImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MParameterValueTERMImpl extends MinimalEObjectImpl.Container implements MParameterValueTERM {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected MParameterValue left;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final MParameterValueTERMOperators OPERATION_EDEFAULT = MParameterValueTERMOperators.MULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueTERMOperators operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueTERM right;

	/**
	 * @generated
	 */
	protected MParameterValueTERMImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_VALUE_TERM;
	}

	/**
	 * @generated
	 */
	public MParameterValue getLeft() {
		return left;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetLeft(MParameterValue newLeft, NotificationChain msgs) {
		MParameterValue oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_TERM__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setLeft(MParameterValue newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_TERM__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_TERM__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_TERM__LEFT, newLeft, newLeft));
	}

	/**
	 * @generated
	 */
	public MParameterValueTERMOperators getOperation() {
		return operation;
	}

	/**
	 * @generated
	 */
	public void setOperation(MParameterValueTERMOperators newOperation) {
		MParameterValueTERMOperators oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_TERM__OPERATION, oldOperation, operation));
	}

	/**
	 * @generated
	 */
	public MParameterValueTERM getRight() {
		return right;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetRight(MParameterValueTERM newRight, NotificationChain msgs) {
		MParameterValueTERM oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_TERM__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setRight(MParameterValueTERM newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_TERM__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_TERM__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_TERM__RIGHT, newRight, newRight));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_TERM__LEFT:
				return basicSetLeft(null, msgs);
			case commonPackage.MPARAMETER_VALUE_TERM__RIGHT:
				return basicSetRight(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_TERM__LEFT:
				return getLeft();
			case commonPackage.MPARAMETER_VALUE_TERM__OPERATION:
				return getOperation();
			case commonPackage.MPARAMETER_VALUE_TERM__RIGHT:
				return getRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_TERM__LEFT:
				setLeft((MParameterValue)newValue);
				return;
			case commonPackage.MPARAMETER_VALUE_TERM__OPERATION:
				setOperation((MParameterValueTERMOperators)newValue);
				return;
			case commonPackage.MPARAMETER_VALUE_TERM__RIGHT:
				setRight((MParameterValueTERM)newValue);
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
			case commonPackage.MPARAMETER_VALUE_TERM__LEFT:
				setLeft((MParameterValue)null);
				return;
			case commonPackage.MPARAMETER_VALUE_TERM__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case commonPackage.MPARAMETER_VALUE_TERM__RIGHT:
				setRight((MParameterValueTERM)null);
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
			case commonPackage.MPARAMETER_VALUE_TERM__LEFT:
				return left != null;
			case commonPackage.MPARAMETER_VALUE_TERM__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case commonPackage.MPARAMETER_VALUE_TERM__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

}