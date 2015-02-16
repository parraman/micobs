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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MQuantifiableResourceDemand</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MQuantifiableResourceDemandImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MQuantifiableResourceDemandImpl#getResourceValue <em>Resource Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MQuantifiableResourceDemandImpl extends MResourceDemandImpl implements MQuantifiableResourceDemand {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected MQuantifiableResource resource;

	/**
	 * The cached value of the '{@link #getResourceValue() <em>Resource Value</em>}' containment reference.
	 * @see #getResourceValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression resourceValue;

	/**
	 * @generated
	 */
	protected MQuantifiableResourceDemandImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MQUANTIFIABLE_RESOURCE_DEMAND;
	}

	/**
	 * @generated
	 */
	public MQuantifiableResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (MQuantifiableResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * @generated
	 */
	public MQuantifiableResource basicGetResource() {
		return resource;
	}

	/**
	 * @generated
	 */
	public void setResource(MQuantifiableResource newResource) {
		MQuantifiableResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE, oldResource, resource));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getResourceValue() {
		return resourceValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetResourceValue(MParameterValueExpression newResourceValue, NotificationChain msgs) {
		MParameterValueExpression oldResourceValue = resourceValue;
		resourceValue = newResourceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE, oldResourceValue, newResourceValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setResourceValue(MParameterValueExpression newResourceValue) {
		if (newResourceValue != resourceValue) {
			NotificationChain msgs = null;
			if (resourceValue != null)
				msgs = ((InternalEObject)resourceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE, null, msgs);
			if (newResourceValue != null)
				msgs = ((InternalEObject)newResourceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE, null, msgs);
			msgs = basicSetResourceValue(newResourceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE, newResourceValue, newResourceValue));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE:
				return basicSetResourceValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE:
				return getResourceValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE:
				setResource((MQuantifiableResource)newValue);
				return;
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE:
				setResourceValue((MParameterValueExpression)newValue);
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
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE:
				setResource((MQuantifiableResource)null);
				return;
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE:
				setResourceValue((MParameterValueExpression)null);
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
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE:
				return resource != null;
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE:
				return resourceValue != null;
		}
		return super.eIsSet(featureID);
	}

}