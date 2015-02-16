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
package es.uah.aut.srg.micobs.mesp.mespdep.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;

/**
 * An implementation of the model object '<em><b>MMESPDriverSwPackageDeployment</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDriverSwPackageDeploymentImpl#getDeviceDriverAssignments <em>Device Driver Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMESPDriverSwPackageDeploymentImpl extends MMESPSwPackageDeploymentImpl implements MMESPDriverSwPackageDeployment {
	/**
	 * The cached value of the '{@link #getDeviceDriverMappings() <em>Device Driver Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDriverMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<MMESPDeviceDriverMapping> deviceDriverMappings;
	/**
	 * @generated
	 */
	protected MMESPDriverSwPackageDeploymentImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespdepPackage.Literals.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMESPDeviceDriverMapping> getDeviceDriverMappings() {
		if (deviceDriverMappings == null) {
			deviceDriverMappings = new EObjectContainmentEList<MMESPDeviceDriverMapping>(MMESPDeviceDriverMapping.class, this, mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS);
		}
		return deviceDriverMappings;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS:
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
			case mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS:
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
			case mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS:
				getDeviceDriverMappings().clear();
				getDeviceDriverMappings().addAll((Collection<? extends MMESPDeviceDriverMapping>)newValue);
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
			case mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS:
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
			case mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS:
				return deviceDriverMappings != null && !deviceDriverMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}