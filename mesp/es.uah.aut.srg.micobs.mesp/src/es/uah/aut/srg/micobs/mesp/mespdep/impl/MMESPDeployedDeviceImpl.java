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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.pdl.MDevice;

/**
 * An implementation of the model object '<em><b>MMESPDeployedDevice</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeployedDeviceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeployedDeviceImpl#getParameterValueAssignments <em>Parameter Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMESPDeployedDeviceImpl extends MCommonReferenceableObjImpl implements MMESPDeployedDevice {
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected MDevice device;

	/**
	 * The cached value of the '{@link #getParameterValueAssignments() <em>ParameterValueAssignments</em>}' containment reference list.
	 * @see #getParameterValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> parameterValueAssignments;

	/**
	 * @generated
	 */
	protected MMESPDeployedDeviceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespdepPackage.Literals.MMESP_DEPLOYED_DEVICE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespdepPackage.MMESP_DEPLOYED_DEVICE__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mespdepPackage.MMESP_DEPLOYED_DEVICE__DEVICE, oldDevice, device));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getParameterValueAssignments() {
		if (parameterValueAssignments == null) {
			parameterValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mespdepPackage.MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return parameterValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getParameterValueAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS:
				return getParameterValueAssignments();
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
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__DEVICE:
				setDevice((MDevice)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
				getParameterValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
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
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__DEVICE:
				setDevice((MDevice)null);
				return;
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
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
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__DEVICE:
				return device != null;
			case mespdepPackage.MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS:
				return parameterValueAssignments != null && !parameterValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}