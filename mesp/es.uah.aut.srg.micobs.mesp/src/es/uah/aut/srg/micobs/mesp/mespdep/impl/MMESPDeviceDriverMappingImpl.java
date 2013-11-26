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
package es.uah.aut.srg.micobs.mesp.mespdep.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;

/**
 * An implementation of the model object '<em><b>MMESPDeviceDriverMapping</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeviceDriverMappingImpl#getDeployedDevice <em>Deployed Device</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeviceDriverMappingImpl#getSupportedDevice <em>Supported Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMESPDeviceDriverMappingImpl extends EObjectImpl implements MMESPDeviceDriverMapping {
	/**
	 * The cached value of the '{@link #getDeployedDevice() <em>DeployedDevice</em>}' reference.
	 * @see #getDeployedDevice()
	 * @generated
	 * @ordered
	 */
	protected MMESPDeployedDevice deployedDevice;

	/**
	 * The cached value of the '{@link #getSupportedDevice() <em>SupportedDevice</em>}' reference.
	 * @see #getSupportedDevice()
	 * @generated
	 * @ordered
	 */
	protected MDriverSwPackageSupportedDevice supportedDevice;

	/**
	 * @generated
	 */
	protected MMESPDeviceDriverMappingImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespdepPackage.Literals.MMESP_DEVICE_DRIVER_MAPPING;
	}

	/**
	 * @generated
	 */
	public MMESPDeployedDevice getDeployedDevice() {
		if (deployedDevice != null && deployedDevice.eIsProxy()) {
			InternalEObject oldDeployedDevice = (InternalEObject)deployedDevice;
			deployedDevice = (MMESPDeployedDevice)eResolveProxy(oldDeployedDevice);
			if (deployedDevice != oldDeployedDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE, oldDeployedDevice, deployedDevice));
			}
		}
		return deployedDevice;
	}

	/**
	 * @generated
	 */
	public MMESPDeployedDevice basicGetDeployedDevice() {
		return deployedDevice;
	}

	/**
	 * @generated
	 */
	public void setDeployedDevice(MMESPDeployedDevice newDeployedDevice) {
		MMESPDeployedDevice oldDeployedDevice = deployedDevice;
		deployedDevice = newDeployedDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE, oldDeployedDevice, deployedDevice));
	}

	/**
	 * @generated
	 */
	public MDriverSwPackageSupportedDevice getSupportedDevice() {
		if (supportedDevice != null && supportedDevice.eIsProxy()) {
			InternalEObject oldSupportedDevice = (InternalEObject)supportedDevice;
			supportedDevice = (MDriverSwPackageSupportedDevice)eResolveProxy(oldSupportedDevice);
			if (supportedDevice != oldSupportedDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE, oldSupportedDevice, supportedDevice));
			}
		}
		return supportedDevice;
	}

	/**
	 * @generated
	 */
	public MDriverSwPackageSupportedDevice basicGetSupportedDevice() {
		return supportedDevice;
	}

	/**
	 * @generated
	 */
	public void setSupportedDevice(MDriverSwPackageSupportedDevice newSupportedDevice) {
		MDriverSwPackageSupportedDevice oldSupportedDevice = supportedDevice;
		supportedDevice = newSupportedDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE, oldSupportedDevice, supportedDevice));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				if (resolve) return getDeployedDevice();
				return basicGetDeployedDevice();
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
				if (resolve) return getSupportedDevice();
				return basicGetSupportedDevice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				setDeployedDevice((MMESPDeployedDevice)newValue);
				return;
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
				setSupportedDevice((MDriverSwPackageSupportedDevice)newValue);
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
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				setDeployedDevice((MMESPDeployedDevice)null);
				return;
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
				setSupportedDevice((MDriverSwPackageSupportedDevice)null);
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
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				return deployedDevice != null;
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
				return supportedDevice != null;
		}
		return super.eIsSet(featureID);
	}

}