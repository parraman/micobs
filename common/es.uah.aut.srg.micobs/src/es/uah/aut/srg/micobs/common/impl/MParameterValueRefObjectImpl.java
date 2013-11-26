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
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueRefObject;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MParameterValueRefObject</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRefObjectImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MParameterValueRefObjectImpl extends MParameterValueImpl implements MParameterValueRefObject {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected MCommonReferenceableObj object;

	/**
	 * @generated
	 */
	protected MParameterValueRefObjectImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MPARAMETER_VALUE_REF_OBJECT;
	}

	/**
	 * @generated
	 */
	public MCommonReferenceableObj getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (MCommonReferenceableObj)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MPARAMETER_VALUE_REF_OBJECT__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * @generated
	 */
	public MCommonReferenceableObj basicGetObject() {
		return object;
	}

	/**
	 * @generated
	 */
	public void setObject(MCommonReferenceableObj newObject) {
		MCommonReferenceableObj oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MPARAMETER_VALUE_REF_OBJECT__OBJECT, oldObject, object));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_REF_OBJECT__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MPARAMETER_VALUE_REF_OBJECT__OBJECT:
				setObject((MCommonReferenceableObj)newValue);
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
			case commonPackage.MPARAMETER_VALUE_REF_OBJECT__OBJECT:
				setObject((MCommonReferenceableObj)null);
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
			case commonPackage.MPARAMETER_VALUE_REF_OBJECT__OBJECT:
				return object != null;
		}
		return super.eIsSet(featureID);
	}

}