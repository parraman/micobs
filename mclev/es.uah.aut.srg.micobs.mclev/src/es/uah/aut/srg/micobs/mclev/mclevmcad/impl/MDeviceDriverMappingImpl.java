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
package es.uah.aut.srg.micobs.mclev.mclevmcad.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;

/**
 * An implementation of the model object '<em><b>MDeviceDriverMapping</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeviceDriverMappingImpl#getDeployedDevice <em>DeployedDevice</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeviceDriverMappingImpl#getSupportedDevice <em>SupportedDevice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDeviceDriverMappingImpl extends EObjectImpl implements MDeviceDriverMapping {
	/**
	 * The cached value of the '{@link #getDeployedDevice() <em>DeployedDevice</em>}' reference.
	 * @see #getDeployedDevice()
	 * @generated
	 * @ordered
	 */
	protected MDeployedDevice deployedDevice;

	/**
	 * The cached value of the '{@link #getSupportedDevice() <em>SupportedDevice</em>}' reference.
	 * @see #getSupportedDevice()
	 * @generated
	 * @ordered
	 */
	protected MDriverSLibSupportedDevice supportedDevice;

	/**
	 * @generated
	 */
	protected MDeviceDriverMappingImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MDEVICE_DRIVER_MAPPING;
	}

	/**
	 * @generated
	 */
	public MDeployedDevice getDeployedDevice() {
		if (deployedDevice != null && deployedDevice.eIsProxy()) {
			InternalEObject oldDeployedDevice = (InternalEObject)deployedDevice;
			deployedDevice = (MDeployedDevice)eResolveProxy(oldDeployedDevice);
			if (deployedDevice != oldDeployedDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE, oldDeployedDevice, deployedDevice));
			}
		}
		return deployedDevice;
	}

	/**
	 * @generated
	 */
	public MDeployedDevice basicGetDeployedDevice() {
		return deployedDevice;
	}

	/**
	 * @generated
	 */
	public void setDeployedDevice(MDeployedDevice newDeployedDevice) {
		MDeployedDevice oldDeployedDevice = deployedDevice;
		deployedDevice = newDeployedDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE, oldDeployedDevice, deployedDevice));
	}

	/**
	 * @generated
	 */
	public MDriverSLibSupportedDevice getSupportedDevice() {
		if (supportedDevice != null && supportedDevice.eIsProxy()) {
			InternalEObject oldSupportedDevice = (InternalEObject)supportedDevice;
			supportedDevice = (MDriverSLibSupportedDevice)eResolveProxy(oldSupportedDevice);
			if (supportedDevice != oldSupportedDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE, oldSupportedDevice, supportedDevice));
			}
		}
		return supportedDevice;
	}

	/**
	 * @generated
	 */
	public MDriverSLibSupportedDevice basicGetSupportedDevice() {
		return supportedDevice;
	}

	/**
	 * @generated
	 */
	public void setSupportedDevice(MDriverSLibSupportedDevice newSupportedDevice) {
		MDriverSLibSupportedDevice oldSupportedDevice = supportedDevice;
		supportedDevice = newSupportedDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE, oldSupportedDevice, supportedDevice));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				if (resolve) return getDeployedDevice();
				return basicGetDeployedDevice();
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
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
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				setDeployedDevice((MDeployedDevice)newValue);
				return;
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
				setSupportedDevice((MDriverSLibSupportedDevice)newValue);
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
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				setDeployedDevice((MDeployedDevice)null);
				return;
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
				setSupportedDevice((MDriverSLibSupportedDevice)null);
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
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE:
				return deployedDevice != null;
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE:
				return supportedDevice != null;
		}
		return super.eIsSet(featureID);
	}

}