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
package es.uah.aut.srg.micobs.pdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MOSSupportedOSAPI</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIImpl#getOsapi <em>OSAPI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIImpl#getParametersValueAssignments <em>Parameters Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOSSupportedOSAPIImpl extends EObjectImpl implements MOSSupportedOSAPI {
	/**
	 * The cached value of the '{@link #getOsapi() <em>OSAPI</em>}' reference.
	 * @see #getOsapi()
	 * @generated
	 * @ordered
	 */
	protected MOperatingSystemAPI osapi;

	/**
	 * The cached value of the '{@link #getParameterValueAssignments() <em>Parameter Value Assignments</em>}' containment reference list.
	 * @see #getParameterValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MOSSupportedOSAPIPVA> parameterValueAssignments;

	/**
	 * @generated
	 */
	protected MOSSupportedOSAPIImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MOS_SUPPORTED_OSAPI;
	}

	/**
	 * @generated
	 */
	public MOperatingSystemAPI getOsapi() {
		if (osapi != null && osapi.eIsProxy()) {
			InternalEObject oldOsapi = (InternalEObject)osapi;
			osapi = (MOperatingSystemAPI)eResolveProxy(oldOsapi);
			if (osapi != oldOsapi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MOS_SUPPORTED_OSAPI__OSAPI, oldOsapi, osapi));
			}
		}
		return osapi;
	}

	/**
	 * @generated
	 */
	public MOperatingSystemAPI basicGetOsapi() {
		return osapi;
	}

	/**
	 * @generated
	 */
	public void setOsapi(MOperatingSystemAPI newOsapi) {
		MOperatingSystemAPI oldOsapi = osapi;
		osapi = newOsapi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MOS_SUPPORTED_OSAPI__OSAPI, oldOsapi, osapi));
	}

	/**
	 * @generated
	 */
	public EList<MOSSupportedOSAPIPVA> getParameterValueAssignments() {
		if (parameterValueAssignments == null) {
			parameterValueAssignments = new EObjectContainmentEList<MOSSupportedOSAPIPVA>(MOSSupportedOSAPIPVA.class, this, pdlPackage.MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return parameterValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS:
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
			case pdlPackage.MOS_SUPPORTED_OSAPI__OSAPI:
				if (resolve) return getOsapi();
				return basicGetOsapi();
			case pdlPackage.MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS:
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
			case pdlPackage.MOS_SUPPORTED_OSAPI__OSAPI:
				setOsapi((MOperatingSystemAPI)newValue);
				return;
			case pdlPackage.MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
				getParameterValueAssignments().addAll((Collection<? extends MOSSupportedOSAPIPVA>)newValue);
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
			case pdlPackage.MOS_SUPPORTED_OSAPI__OSAPI:
				setOsapi((MOperatingSystemAPI)null);
				return;
			case pdlPackage.MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS:
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
			case pdlPackage.MOS_SUPPORTED_OSAPI__OSAPI:
				return osapi != null;
			case pdlPackage.MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS:
				return parameterValueAssignments != null && !parameterValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}