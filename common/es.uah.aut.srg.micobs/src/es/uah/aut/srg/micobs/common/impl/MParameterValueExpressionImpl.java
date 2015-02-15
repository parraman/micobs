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

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterValueExpression</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueExpressionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MParameterValueExpressionImpl extends MinimalEObjectImpl.Container implements MParameterValueExpression {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueTERM left;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final MParameterValueExpressionOperators OPERATION_EDEFAULT = MParameterValueExpressionOperators.PLUS;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpressionOperators operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression right;

	/**
	 * @generated
	 */
	protected MParameterValueExpressionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_VALUE_EXPRESSION;
	}

	/**
	 * @generated
	 */
	public MParameterValueTERM getLeft() {
		return left;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetLeft(MParameterValueTERM newLeft, NotificationChain msgs) {
		MParameterValueTERM oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setLeft(MParameterValueTERM newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT, newLeft, newLeft));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpressionOperators getOperation() {
		return operation;
	}

	/**
	 * @generated
	 */
	public void setOperation(MParameterValueExpressionOperators newOperation) {
		MParameterValueExpressionOperators oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_EXPRESSION__OPERATION, oldOperation, operation));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getRight() {
		return right;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetRight(MParameterValueExpression newRight, NotificationChain msgs) {
		MParameterValueExpression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setRight(MParameterValueExpression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT, newRight, newRight));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT:
				return basicSetLeft(null, msgs);
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT:
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
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT:
				return getLeft();
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__OPERATION:
				return getOperation();
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT:
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
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT:
				setLeft((MParameterValueTERM)newValue);
				return;
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__OPERATION:
				setOperation((MParameterValueExpressionOperators)newValue);
				return;
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT:
				setRight((MParameterValueExpression)newValue);
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
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT:
				setLeft((MParameterValueTERM)null);
				return;
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT:
				setRight((MParameterValueExpression)null);
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
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__LEFT:
				return left != null;
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case commonPackage.MPARAMETER_VALUE_EXPRESSION__RIGHT:
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