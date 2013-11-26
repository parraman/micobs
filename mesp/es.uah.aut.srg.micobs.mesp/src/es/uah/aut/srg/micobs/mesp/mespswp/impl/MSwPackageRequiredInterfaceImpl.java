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

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MSwPackageRequiredInterface</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageRequiredInterfaceImpl#getResourceDemands <em>ResourceDemands</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageRequiredInterfaceImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSwPackageRequiredInterfaceImpl extends EObjectImpl implements MSwPackageRequiredInterface {
	/**
	 * The cached value of the '{@link #getResourceDemands() <em>ResourceDemands</em>}' containment reference list.
	 * @see #getResourceDemands()
	 * @generated
	 * @ordered
	 */
	protected EList<MResourceDemand> resourceDemands;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement interface_;

	/**
	 * @generated
	 */
	protected MSwPackageRequiredInterfaceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MSW_PACKAGE_REQUIRED_INTERFACE;
	}

	/**
	 * @generated
	 */
	public EList<MResourceDemand> getResourceDemands() {
		if (resourceDemands == null) {
			resourceDemands = new EObjectContainmentEList<MResourceDemand>(MResourceDemand.class, this, mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS);
		}
		return resourceDemands;
	}

	/**
	 * @generated
	 */
	public MCommonPackageElement getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (MCommonPackageElement)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * @generated
	 */
	public MCommonPackageElement basicGetInterface() {
		return interface_;
	}

	/**
	 * @generated
	 */
	public void setInterface(MCommonPackageElement newInterface) {
		MCommonPackageElement oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE, oldInterface, interface_));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS:
				return ((InternalEList<?>)getResourceDemands()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS:
				return getResourceDemands();
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
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
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS:
				getResourceDemands().clear();
				getResourceDemands().addAll((Collection<? extends MResourceDemand>)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE:
				setInterface((MCommonPackageElement)newValue);
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
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS:
				getResourceDemands().clear();
				return;
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE:
				setInterface((MCommonPackageElement)null);
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
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS:
				return resourceDemands != null && !resourceDemands.isEmpty();
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE:
				return interface_ != null;
		}
		return super.eIsSet(featureID);
	}

}