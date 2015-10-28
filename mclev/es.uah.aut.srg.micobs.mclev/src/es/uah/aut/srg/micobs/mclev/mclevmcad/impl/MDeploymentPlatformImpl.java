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
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.pdl.MPlatform;

/**
 * An implementation of the model object '<em><b>MDeploymentPlatform</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentPlatformImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentPlatformImpl#getParameterValueAssignments <em>ParameterValue Assignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentPlatformImpl#getDeployedDevices <em>DeployedDevices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDeploymentPlatformImpl extends MCommonReferenceableObjImpl implements MDeploymentPlatform {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference.
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected MPlatform platform;

	/**
	 * The cached value of the '{@link #getParameterValueAssignments() <em>ParameterValueAssignments</em>}' containment reference list.
	 * @see #getParameterValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> parameterValueAssignments;

	/**
	 * The cached value of the '{@link #getDeployedDevices() <em>DeployedDevices</em>}' containment reference list.
	 * @see #getDeployedDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<MDeployedDevice> deployedDevices;

	/**
	 * @generated
	 */
	protected MDeploymentPlatformImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MDEPLOYMENT_PLATFORM;
	}

	/**
	 * @generated
	 */
	public MPlatform getPlatform() {
		if (platform != null && platform.eIsProxy()) {
			InternalEObject oldPlatform = (InternalEObject)platform;
			platform = (MPlatform)eResolveProxy(oldPlatform);
			if (platform != oldPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MDEPLOYMENT_PLATFORM__PLATFORM, oldPlatform, platform));
			}
		}
		return platform;
	}

	/**
	 * @generated
	 */
	public MPlatform basicGetPlatform() {
		return platform;
	}

	/**
	 * @generated
	 */
	public void setPlatform(MPlatform newPlatform) {
		MPlatform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MDEPLOYMENT_PLATFORM__PLATFORM, oldPlatform, platform));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getParameterValueAssignments() {
		if (parameterValueAssignments == null) {
			parameterValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevmcadPackage.MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return parameterValueAssignments;
	}

	/**
	 * @generated
	 */
	public EList<MDeployedDevice> getDeployedDevices() {
		if (deployedDevices == null) {
			deployedDevices = new EObjectContainmentEList<MDeployedDevice>(MDeployedDevice.class, this, mclevmcadPackage.MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES);
		}
		return deployedDevices;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getParameterValueAssignments()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
				return ((InternalEList<?>)getDeployedDevices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PLATFORM:
				if (resolve) return getPlatform();
				return basicGetPlatform();
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				return getParameterValueAssignments();
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
				return getDeployedDevices();
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
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PLATFORM:
				setPlatform((MPlatform)newValue);
				return;
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
				getParameterValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
				return;
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
				getDeployedDevices().clear();
				getDeployedDevices().addAll((Collection<? extends MDeployedDevice>)newValue);
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
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PLATFORM:
				setPlatform((MPlatform)null);
				return;
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
				return;
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
				getDeployedDevices().clear();
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
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PLATFORM:
				return platform != null;
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				return parameterValueAssignments != null && !parameterValueAssignments.isEmpty();
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
				return deployedDevices != null && !deployedDevices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}