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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;

/**
 * An implementation of the model object '<em><b>EDROOMMessage</b></em>'.
 *
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMMessageImpl#getDataClass <em>DataClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EDROOMMessageImpl extends MCommonReferenceableObjImpl implements EDROOMMessage {
	/**
	 * The cached value of the '{@link #getDataClass() <em>DataClass</em>}' reference.
	 * @see #getDataClass()
	 * @generated
	 * @ordered
	 */
	protected EDROOMDataClass dataClass;

	/**
	 * @generated
	 */
	protected EDROOMMessageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomprotPackage.Literals.EDROOM_MESSAGE;
	}

	/**
	 * @generated
	 */
	public EDROOMDataClass getDataClass() {
		if (dataClass != null && dataClass.eIsProxy()) {
			InternalEObject oldDataClass = (InternalEObject)dataClass;
			dataClass = (EDROOMDataClass)eResolveProxy(oldDataClass);
			if (dataClass != oldDataClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, edroomprotPackage.EDROOM_MESSAGE__DATA_CLASS, oldDataClass, dataClass));
			}
		}
		return dataClass;
	}

	/**
	 * @generated
	 */
	public EDROOMDataClass basicGetDataClass() {
		return dataClass;
	}

	/**
	 * @generated
	 */
	public void setDataClass(EDROOMDataClass newDataClass) {
		EDROOMDataClass oldDataClass = dataClass;
		dataClass = newDataClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edroomprotPackage.EDROOM_MESSAGE__DATA_CLASS, oldDataClass, dataClass));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomprotPackage.EDROOM_MESSAGE__DATA_CLASS:
				if (resolve) return getDataClass();
				return basicGetDataClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edroomprotPackage.EDROOM_MESSAGE__DATA_CLASS:
				setDataClass((EDROOMDataClass)newValue);
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
			case edroomprotPackage.EDROOM_MESSAGE__DATA_CLASS:
				setDataClass((EDROOMDataClass)null);
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
			case edroomprotPackage.EDROOM_MESSAGE__DATA_CLASS:
				return dataClass != null;
		}
		return super.eIsSet(featureID);
	}

}
