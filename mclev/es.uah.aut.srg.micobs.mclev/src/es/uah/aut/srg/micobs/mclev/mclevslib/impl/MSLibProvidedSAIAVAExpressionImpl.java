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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * An implementation of the model object '<em><b>MSLibProvidedSAIAVAExpression</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAExpressionImpl#getAttributeValue <em>AttributeValue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSLibProvidedSAIAVAExpressionImpl extends MSLibProvidedSAIAVAImpl implements MSLibProvidedSAIAVAExpression {
	/**
	 * The cached value of the '{@link #getAttributeValue() <em>AttributeValue</em>}' containment reference.
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression attributeValue;

	/**
	 * @generated
	 */
	protected MSLibProvidedSAIAVAExpressionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevslibPackage.Literals.MS_LIB_PROVIDED_SAIAVA_EXPRESSION;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getAttributeValue() {
		return attributeValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetAttributeValue(MParameterValueExpression newAttributeValue, NotificationChain msgs) {
		MParameterValueExpression oldAttributeValue = attributeValue;
		attributeValue = newAttributeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE, oldAttributeValue, newAttributeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setAttributeValue(MParameterValueExpression newAttributeValue) {
		if (newAttributeValue != attributeValue) {
			NotificationChain msgs = null;
			if (attributeValue != null)
				msgs = ((InternalEObject)attributeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE, null, msgs);
			if (newAttributeValue != null)
				msgs = ((InternalEObject)newAttributeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE, null, msgs);
			msgs = basicSetAttributeValue(newAttributeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE, newAttributeValue, newAttributeValue));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE:
				return basicSetAttributeValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE:
				return getAttributeValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE:
				setAttributeValue((MParameterValueExpression)newValue);
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
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE:
				setAttributeValue((MParameterValueExpression)null);
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
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE:
				return attributeValue != null;
		}
		return super.eIsSet(featureID);
	}

}