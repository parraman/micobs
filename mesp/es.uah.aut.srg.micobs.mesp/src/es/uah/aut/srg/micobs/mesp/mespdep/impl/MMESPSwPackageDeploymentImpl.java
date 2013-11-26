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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;

/**
 * An implementation of the model object '<em><b>MMESPSwPackageDeployment</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPSwPackageDeploymentImpl#getSwPackage <em>Sw Package</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPSwPackageDeploymentImpl#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMESPSwPackageDeploymentImpl extends EObjectImpl implements MMESPSwPackageDeployment {
	/**
	 * The cached value of the '{@link #getSwPackage() <em>SwPackage</em>}' reference.
	 * @see #getSwPackage()
	 * @generated
	 * @ordered
	 */
	protected MSwPackage swPackage;

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
	protected MMESPSwPackageDeploymentImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespdepPackage.Literals.MMESP_SW_PACKAGE_DEPLOYMENT;
	}

	/**
	 * @generated
	 */
	public MSwPackage getSwPackage() {
		if (swPackage != null && swPackage.eIsProxy()) {
			InternalEObject oldSwPackage = (InternalEObject)swPackage;
			swPackage = (MSwPackage)eResolveProxy(oldSwPackage);
			if (swPackage != oldSwPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE, oldSwPackage, swPackage));
			}
		}
		return swPackage;
	}

	/**
	 * @generated
	 */
	public MSwPackage basicGetSwPackage() {
		return swPackage;
	}

	/**
	 * @generated
	 */
	public void setSwPackage(MSwPackage newSwPackage) {
		MSwPackage oldSwPackage = swPackage;
		swPackage = newSwPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE, oldSwPackage, swPackage));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getParameterValueAssignments() {
		if (parameterValueAssignments == null) {
			parameterValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return parameterValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE:
				if (resolve) return getSwPackage();
				return basicGetSwPackage();
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE:
				setSwPackage((MSwPackage)newValue);
				return;
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE:
				setSwPackage((MSwPackage)null);
				return;
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE:
				return swPackage != null;
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS:
				return parameterValueAssignments != null && !parameterValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
