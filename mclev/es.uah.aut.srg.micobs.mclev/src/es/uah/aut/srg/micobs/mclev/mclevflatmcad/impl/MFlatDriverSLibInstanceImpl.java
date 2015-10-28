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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;

/**
 * An implementation of the model object '<em><b>MFlatDriverSLibInstance</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDriverSLibInstanceImpl#getDeviceDriverMappings <em>DeviceDriverMappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MFlatDriverSLibInstanceImpl extends MFlatServiceLibraryInstanceImpl implements MFlatDriverSLibInstance {
	/**
	 * The cached value of the '{@link #getDeviceDriverMappings() <em>DeviceDriverMappings</em>}' containment reference list.
	 * @see #getDeviceDriverMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlatDeviceDriverMapping> deviceDriverMappings;

	/**
	 * @generated
	 */
	protected MFlatDriverSLibInstanceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevflatmcadPackage.Literals.MFLAT_DRIVER_SLIB_INSTANCE;
	}

	/**
	 * @generated
	 */
	public EList<MFlatDeviceDriverMapping> getDeviceDriverMappings() {
		if (deviceDriverMappings == null) {
			deviceDriverMappings = new EObjectContainmentEList<MFlatDeviceDriverMapping>(MFlatDeviceDriverMapping.class, this, mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS);
		}
		return deviceDriverMappings;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
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
			case mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
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
			case mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
				getDeviceDriverMappings().clear();
				getDeviceDriverMappings().addAll((Collection<? extends MFlatDeviceDriverMapping>)newValue);
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
			case mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
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
			case mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS:
				return deviceDriverMappings != null && !deviceDriverMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}