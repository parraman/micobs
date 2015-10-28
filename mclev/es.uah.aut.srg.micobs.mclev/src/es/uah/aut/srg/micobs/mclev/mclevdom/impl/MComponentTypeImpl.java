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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MComponentType</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeImpl#getPortTypeInstances <em>PortTypeInstances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MComponentTypeImpl extends MCommonReferenceableObjImpl implements MComponentType {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

	/**
	 * The cached value of the '{@link #getPortTypeInstances() <em>PortTypeInstances</em>}' containment reference list.
	 * @see #getPortTypeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<MPortTypeInstance> portTypeInstances;

	/**
	 * @generated
	 */
	protected MComponentTypeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MCOMPONENT_TYPE;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevdomPackage.MCOMPONENT_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MPortTypeInstance> getPortTypeInstances() {
		if (portTypeInstances == null) {
			portTypeInstances = new EObjectContainmentEList<MPortTypeInstance>(MPortTypeInstance.class, this, mclevdomPackage.MCOMPONENT_TYPE__PORT_TYPE_INSTANCES);
		}
		return portTypeInstances;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MCOMPONENT_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MCOMPONENT_TYPE__PORT_TYPE_INSTANCES:
				return ((InternalEList<?>)getPortTypeInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MCOMPONENT_TYPE__ATTRIBUTES:
				return getAttributes();
			case mclevdomPackage.MCOMPONENT_TYPE__PORT_TYPE_INSTANCES:
				return getPortTypeInstances();
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
			case mclevdomPackage.MCOMPONENT_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevdomPackage.MCOMPONENT_TYPE__PORT_TYPE_INSTANCES:
				getPortTypeInstances().clear();
				getPortTypeInstances().addAll((Collection<? extends MPortTypeInstance>)newValue);
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
			case mclevdomPackage.MCOMPONENT_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevdomPackage.MCOMPONENT_TYPE__PORT_TYPE_INSTANCES:
				getPortTypeInstances().clear();
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
			case mclevdomPackage.MCOMPONENT_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevdomPackage.MCOMPONENT_TYPE__PORT_TYPE_INSTANCES:
				return portTypeInstances != null && !portTypeInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}