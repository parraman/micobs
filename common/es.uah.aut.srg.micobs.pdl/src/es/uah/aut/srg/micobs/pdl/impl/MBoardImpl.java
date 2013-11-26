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
package es.uah.aut.srg.micobs.pdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MBoard</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MBoardImpl#getMicroprocessor <em>Microprocessor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MBoardImpl extends MPDLPackageElementImpl implements MBoard {
	/**
	 * The cached value of the '{@link #getMicroprocessor() <em>Microprocessor</em>}' reference.
	 * @see #getMicroprocessor()
	 * @generated
	 * @ordered
	 */
	protected MMicroprocessor microprocessor;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;
	/**
	 * The cached value of the '{@link #getSupportedDevices() <em>SupportedDevices</em>}' containment reference list.
	 * @see #getSupportedDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<MBoardSupportedDevice> supportedDevices;

	/**
	 * @generated
	 */
	protected MBoardImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MBOARD;
	}

	/**
	 * @generated
	 */
	public MMicroprocessor getMicroprocessor() {
		if (microprocessor != null && microprocessor.eIsProxy()) {
			InternalEObject oldMicroprocessor = (InternalEObject)microprocessor;
			microprocessor = (MMicroprocessor)eResolveProxy(oldMicroprocessor);
			if (microprocessor != oldMicroprocessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MBOARD__MICROPROCESSOR, oldMicroprocessor, microprocessor));
			}
		}
		return microprocessor;
	}

	/**
	 * @generated
	 */
	public MMicroprocessor basicGetMicroprocessor() {
		return microprocessor;
	}

	/**
	 * @generated
	 */
	public void setMicroprocessor(MMicroprocessor newMicroprocessor) {
		MMicroprocessor oldMicroprocessor = microprocessor;
		microprocessor = newMicroprocessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MBOARD__MICROPROCESSOR, oldMicroprocessor, microprocessor));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MBOARD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	public EList<MBoardSupportedDevice> getSupportedDevices() {
		if (supportedDevices == null) {
			supportedDevices = new EObjectContainmentEList<MBoardSupportedDevice>(MBoardSupportedDevice.class, this, pdlPackage.MBOARD__SUPPORTED_DEVICES);
		}
		return supportedDevices;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MBOARD__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case pdlPackage.MBOARD__SUPPORTED_DEVICES:
				return ((InternalEList<?>)getSupportedDevices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pdlPackage.MBOARD__MICROPROCESSOR:
				if (resolve) return getMicroprocessor();
				return basicGetMicroprocessor();
			case pdlPackage.MBOARD__PARAMETERS:
				return getParameters();
			case pdlPackage.MBOARD__SUPPORTED_DEVICES:
				return getSupportedDevices();
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
			case pdlPackage.MBOARD__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)newValue);
				return;
			case pdlPackage.MBOARD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
				return;
			case pdlPackage.MBOARD__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
				getSupportedDevices().addAll((Collection<? extends MBoardSupportedDevice>)newValue);
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
			case pdlPackage.MBOARD__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)null);
				return;
			case pdlPackage.MBOARD__PARAMETERS:
				getParameters().clear();
				return;
			case pdlPackage.MBOARD__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
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
			case pdlPackage.MBOARD__MICROPROCESSOR:
				return microprocessor != null;
			case pdlPackage.MBOARD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case pdlPackage.MBOARD__SUPPORTED_DEVICES:
				return supportedDevices != null && !supportedDevices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
