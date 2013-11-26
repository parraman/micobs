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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.MDevice;

/**
 * An implementation of the model object '<em><b>MDriverSwPackageSupportedDevice</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedDeviceImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedDeviceImpl#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDriverSwPackageSupportedDeviceImpl extends MCommonReferenceableObjImpl implements MDriverSwPackageSupportedDevice {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression required;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected MDevice device;

	/**
	 * @generated
	 */
	protected MDriverSwPackageSupportedDeviceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getRequired() {
		return required;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetRequired(MParameterValueExpression newRequired, NotificationChain msgs) {
		MParameterValueExpression oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setRequired(MParameterValueExpression newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED, newRequired, newRequired));
	}

	/**
	 * @generated
	 */
	public MDevice getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (MDevice)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * @generated
	 */
	public MDevice basicGetDevice() {
		return device;
	}

	/**
	 * @generated
	 */
	public void setDevice(MDevice newDevice) {
		MDevice oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE, oldDevice, device));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED:
				return basicSetRequired(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED:
				return getRequired();
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED:
				setRequired((MParameterValueExpression)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE:
				setDevice((MDevice)newValue);
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
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED:
				setRequired((MParameterValueExpression)null);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE:
				setDevice((MDevice)null);
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
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED:
				return required != null;
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE:
				return device != null;
		}
		return super.eIsSet(featureID);
	}

}