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
package es.uah.aut.srg.micobs.mclev.mclevdom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MAODComponentTypeInstance</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeInstanceImpl#getComponentType <em>ComponentType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAODComponentTypeInstanceImpl extends MComponentTypeInstanceImpl implements MAODComponentTypeInstance {
	/**
	 * The cached value of the '{@link #getComponentType() <em>ComponentType</em>}' reference.
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected MAODComponentType componentType;

	/**
	 * @generated
	 */
	protected MAODComponentTypeInstanceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MAOD_COMPONENT_TYPE_INSTANCE;
	}

	/**
	 * @generated
	 */
	public MAODComponentType getComponentType() {
		if (componentType != null && componentType.eIsProxy()) {
			InternalEObject oldComponentType = (InternalEObject)componentType;
			componentType = (MAODComponentType)eResolveProxy(oldComponentType);
			if (componentType != oldComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
			}
		}
		return componentType;
	}

	/**
	 * @generated
	 */
	public MAODComponentType basicGetComponentType() {
		return componentType;
	}

	/**
	 * @generated
	 */
	public void setComponentType(MAODComponentType newComponentType) {
		MAODComponentType oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE:
				setComponentType((MAODComponentType)newValue);
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
			case mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE:
				setComponentType((MAODComponentType)null);
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
			case mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE:
				return componentType != null;
		}
		return super.eIsSet(featureID);
	}

}