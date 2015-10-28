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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * An implementation of the model object '<em><b>MDriverSLibInstance</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDriverSLibInstanceImpl#getDeviceDriverMappings <em>DeviceDriverMappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDriverSLibInstanceImpl extends MServiceLibraryInstanceImpl implements MDriverSLibInstance {
	/**
	 * The cached value of the '{@link #getDeviceDriverMappings() <em>DeviceDriverMappings</em>}' containment reference list.
	 * @see #getDeviceDriverMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<MDeviceDriverMapping> deviceDriverMappings;

	/**
	 * @generated
	 */
	protected MDriverSLibInstanceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MDRIVER_SLIB_INSTANCE;
	}

	/**
	 * @generated
	 */
	public EList<MDeviceDriverMapping> getDeviceDriverMappings() {
		if (deviceDriverMappings == null) {
			deviceDriverMappings = new EObjectContainmentEList<MDeviceDriverMapping>(MDeviceDriverMapping.class, this, mclevmcadPackage.MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS);
		}
		return deviceDriverMappings;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevmcadPackage.MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
				return ((InternalEList<?>)getDeviceDriverMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevmcadPackage.MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
				return getDeviceDriverMappings();
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
			case mclevmcadPackage.MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
				getDeviceDriverMappings().clear();
				getDeviceDriverMappings().addAll((Collection<? extends MDeviceDriverMapping>)newValue);
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
			case mclevmcadPackage.MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
				getDeviceDriverMappings().clear();
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
			case mclevmcadPackage.MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
				return deviceDriverMappings != null && !deviceDriverMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}