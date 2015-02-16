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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MSwPackageProvidedInterface</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfaceImpl#getSwinterface <em>Swinterface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfaceImpl#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSwPackageProvidedInterfaceImpl extends EObjectImpl implements MSwPackageProvidedInterface {
	/**
	 * The cached value of the '{@link #getSwinterface() <em>Swinterface</em>}' reference.
	 * @see #getSwinterface()
	 * @generated
	 * @ordered
	 */
	protected MSwInterface swinterface;

	/**
	 * The cached value of the '{@link #getParameterValueAssignments() <em>ParameterValueAssignments</em>}' containment reference list.
	 * @see #getParameterValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackageProvidedInterfacePVA> parameterValueAssignments;

	/**
	 * @generated
	 */
	protected MSwPackageProvidedInterfaceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MSW_PACKAGE_PROVIDED_INTERFACE;
	}

	/**
	 * @generated
	 */
	public MSwInterface getSwinterface() {
		if (swinterface != null && swinterface.eIsProxy()) {
			InternalEObject oldSwinterface = (InternalEObject)swinterface;
			swinterface = (MSwInterface)eResolveProxy(oldSwinterface);
			if (swinterface != oldSwinterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE, oldSwinterface, swinterface));
			}
		}
		return swinterface;
	}

	/**
	 * @generated
	 */
	public MSwInterface basicGetSwinterface() {
		return swinterface;
	}

	/**
	 * @generated
	 */
	public void setSwinterface(MSwInterface newSwinterface) {
		MSwInterface oldSwinterface = swinterface;
		swinterface = newSwinterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE, oldSwinterface, swinterface));
	}

	/**
	 * @generated
	 */
	public EList<MSwPackageProvidedInterfacePVA> getParameterValueAssignments() {
		if (parameterValueAssignments == null) {
			parameterValueAssignments = new EObjectContainmentEList<MSwPackageProvidedInterfacePVA>(MSwPackageProvidedInterfacePVA.class, this, mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return parameterValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE:
				if (resolve) return getSwinterface();
				return basicGetSwinterface();
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE:
				setSwinterface((MSwInterface)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS:
				getParameterValueAssignments().clear();
				getParameterValueAssignments().addAll((Collection<? extends MSwPackageProvidedInterfacePVA>)newValue);
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
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE:
				setSwinterface((MSwInterface)null);
				return;
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE:
				return swinterface != null;
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS:
				return parameterValueAssignments != null && !parameterValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}