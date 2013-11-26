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
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.pdl.MPlatform;

/**
 * An implementation of the model object '<em><b>MMESPDeploymentPlatform</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentPlatformImpl#getPlatformSwPackage <em>PlatformSwPackage</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentPlatformImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentPlatformImpl#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMESPDeploymentPlatformImpl extends MCommonReferenceableObjImpl implements MMESPDeploymentPlatform {
	/**
	 * The cached value of the '{@link #getPlatformSwPackage() <em>PlatformSwPackage</em>}' reference.
	 * @see #getPlatformSwPackage()
	 * @generated
	 * @ordered
	 */
	protected MPlatformSwPackage platformSwPackage;

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
	protected EList<MMESPDeployedDevice> deployedDevices;

	/**
	 * @generated
	 */
	protected MMESPDeploymentPlatformImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespdepPackage.Literals.MMESP_DEPLOYMENT_PLATFORM;
	}

	/**
	 * @generated
	 */
	public MPlatformSwPackage getPlatformSwPackage() {
		if (platformSwPackage != null && platformSwPackage.eIsProxy()) {
			InternalEObject oldPlatformSwPackage = (InternalEObject)platformSwPackage;
			platformSwPackage = (MPlatformSwPackage)eResolveProxy(oldPlatformSwPackage);
			if (platformSwPackage != oldPlatformSwPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE, oldPlatformSwPackage, platformSwPackage));
			}
		}
		return platformSwPackage;
	}

	/**
	 * @generated
	 */
	public MPlatformSwPackage basicGetPlatformSwPackage() {
		return platformSwPackage;
	}

	/**
	 * @generated
	 */
	public void setPlatformSwPackage(MPlatformSwPackage newPlatformSwPackage) {
		MPlatformSwPackage oldPlatformSwPackage = platformSwPackage;
		platformSwPackage = newPlatformSwPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE, oldPlatformSwPackage, platformSwPackage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM, oldPlatform, platform));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM, oldPlatform, platform));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getParameterValueAssignments() {
		if (parameterValueAssignments == null) {
			parameterValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return parameterValueAssignments;
	}

	/**
	 * @generated
	 */
	public EList<MMESPDeployedDevice> getDeployedDevices() {
		if (deployedDevices == null) {
			deployedDevices = new EObjectContainmentEList<MMESPDeployedDevice>(MMESPDeployedDevice.class, this, mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES);
		}
		return deployedDevices;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getParameterValueAssignments()).basicRemove(otherEnd, msgs);
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
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
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE:
				if (resolve) return getPlatformSwPackage();
				return basicGetPlatformSwPackage();
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM:
				if (resolve) return getPlatform();
				return basicGetPlatform();
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				return getParameterValueAssignments();
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
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
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE:
				setPlatformSwPackage((MPlatformSwPackage)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM:
				setPlatform((MPlatform)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
				getParameterValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
				getDeployedDevices().clear();
				getDeployedDevices().addAll((Collection<? extends MMESPDeployedDevice>)newValue);
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
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE:
				setPlatformSwPackage((MPlatformSwPackage)null);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM:
				setPlatform((MPlatform)null);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
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
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE:
				return platformSwPackage != null;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PLATFORM:
				return platform != null;
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS:
				return parameterValueAssignments != null && !parameterValueAssignments.isEmpty();
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES:
				return deployedDevices != null && !deployedDevices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
