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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MAODComponentType</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeImpl#getComponentTypeInstances <em>ComponentTypeInstances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAODComponentTypeImpl extends MComponentTypeImpl implements MAODComponentType {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MAODComponentType> inherits;

	/**
	 * The cached value of the '{@link #getComponentTypeInstances() <em>ComponentTypeInstances</em>}' containment reference list.
	 * @see #getComponentTypeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<MAODComponentTypeInstance> componentTypeInstances;

	/**
	 * @generated
	 */
	protected MAODComponentTypeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MAOD_COMPONENT_TYPE;
	}

	/**
	 * @generated
	 */
	public EList<MAODComponentType> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAODComponentType>(MAODComponentType.class, this, mclevdomPackage.MAOD_COMPONENT_TYPE__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MAODComponentTypeInstance> getComponentTypeInstances() {
		if (componentTypeInstances == null) {
			componentTypeInstances = new EObjectContainmentEList<MAODComponentTypeInstance>(MAODComponentTypeInstance.class, this, mclevdomPackage.MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES);
		}
		return componentTypeInstances;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES:
				return ((InternalEList<?>)getComponentTypeInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MAOD_COMPONENT_TYPE__INHERITS:
				return getInherits();
			case mclevdomPackage.MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES:
				return getComponentTypeInstances();
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
			case mclevdomPackage.MAOD_COMPONENT_TYPE__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAODComponentType>)newValue);
				return;
			case mclevdomPackage.MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES:
				getComponentTypeInstances().clear();
				getComponentTypeInstances().addAll((Collection<? extends MAODComponentTypeInstance>)newValue);
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
			case mclevdomPackage.MAOD_COMPONENT_TYPE__INHERITS:
				getInherits().clear();
				return;
			case mclevdomPackage.MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES:
				getComponentTypeInstances().clear();
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
			case mclevdomPackage.MAOD_COMPONENT_TYPE__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevdomPackage.MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES:
				return componentTypeInstances != null && !componentTypeInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}