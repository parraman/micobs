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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MDriverSwPackageSupportedPlatform</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedPlatformImpl#getSupportedDevices <em>SupportedDevices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDriverSwPackageSupportedPlatformImpl extends MSwPackageSupportedPlatformImpl implements MDriverSwPackageSupportedPlatform {
	/**
	 * The cached value of the '{@link #getSupportedDevices() <em>SupportedDevices</em>}' containment reference list.
	 * @see #getSupportedDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<MDriverSwPackageSupportedDevice> supportedDevices;

	/**
	 * @generated
	 */
	protected MDriverSwPackageSupportedPlatformImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM;
	}

	/**
	 * @generated
	 */
	public EList<MDriverSwPackageSupportedDevice> getSupportedDevices() {
		if (supportedDevices == null) {
			supportedDevices = new EObjectContainmentEList<MDriverSwPackageSupportedDevice>(MDriverSwPackageSupportedDevice.class, this, mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES);
		}
		return supportedDevices;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
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
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
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
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
				getSupportedDevices().clear();
				getSupportedDevices().addAll((Collection<? extends MDriverSwPackageSupportedDevice>)newValue);
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
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
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
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES:
				return supportedDevices != null && !supportedDevices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}