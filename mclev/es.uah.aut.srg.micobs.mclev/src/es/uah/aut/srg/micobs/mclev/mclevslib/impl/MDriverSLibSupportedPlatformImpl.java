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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * An implementation of the model object '<em><b>MDriverSLibSupportedPlatform</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedPlatformImpl#getSupportedDevices <em>SupportedDevices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDriverSLibSupportedPlatformImpl extends MServiceLibrarySupportedPlatformImpl implements MDriverSLibSupportedPlatform {
	/**
	 * The cached value of the '{@link #getSupportedDevices() <em>SupportedDevices</em>}' containment reference list.
	 * @see #getSupportedDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<MDriverSLibSupportedDevice> supportedDevices;

	/**
	 * @generated
	 */
	protected MDriverSLibSupportedPlatformImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevslibPackage.Literals.MDRIVER_SLIB_SUPPORTED_PLATFORM;
	}

	/**
	 * @generated
	 */
	public EList<MDriverSLibSupportedDevice> getSupportedDevices() {
		if (supportedDevices == null) {
			supportedDevices = new EObjectContainmentEList<MDriverSLibSupportedDevice>(MDriverSLibSupportedDevice.class, this, mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES);
		}
		return supportedDevices;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
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
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
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
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
				getSupportedDevices().addAll((Collection<? extends MDriverSLibSupportedDevice>)newValue);
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
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
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
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
				return supportedDevices != null && !supportedDevices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}