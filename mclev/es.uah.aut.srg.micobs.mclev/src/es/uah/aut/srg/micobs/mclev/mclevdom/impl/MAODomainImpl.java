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
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MAODomain</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl#getOutputIODomains <em>OutputIODomains</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl#getComponentTypeInstances <em>ComponentTypeInstances</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl#getComponentTypes <em>ComponentTypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAODomainImpl extends MDomainImpl implements MAODomain {
	/**
	 * The cached value of the '{@link #getOutputIODomains() <em>OutputIODomains</em>}' reference list.
	 * @see #getOutputIODomains()
	 * @generated
	 * @ordered
	 */
	protected EList<MIODomain> outputIODomains;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MAODomain> inherits;

	/**
	 * The cached value of the '{@link #getComponentTypeInstances() <em>ComponentTypeInstances</em>}' containment reference list.
	 * @see #getComponentTypeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<MAODComponentTypeInstance> componentTypeInstances;

	/**
	 * The cached value of the '{@link #getComponentTypes() <em>ComponentTypes</em>}' containment reference list.
	 * @see #getComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MAODComponentType> componentTypes;

	/**
	 * @generated
	 */
	protected MAODomainImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MAO_DOMAIN;
	}

	/**
	 * @generated
	 */
	public EList<MIODomain> getOutputIODomains() {
		if (outputIODomains == null) {
			outputIODomains = new EObjectResolvingEList<MIODomain>(MIODomain.class, this, mclevdomPackage.MAO_DOMAIN__OUTPUT_IO_DOMAINS);
		}
		return outputIODomains;
	}

	/**
	 * @generated
	 */
	public EList<MAODomain> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAODomain>(MAODomain.class, this, mclevdomPackage.MAO_DOMAIN__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MAODComponentTypeInstance> getComponentTypeInstances() {
		if (componentTypeInstances == null) {
			componentTypeInstances = new EObjectContainmentEList<MAODComponentTypeInstance>(MAODComponentTypeInstance.class, this, mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPE_INSTANCES);
		}
		return componentTypeInstances;
	}

	/**
	 * @generated
	 */
	public EList<MAODComponentType> getComponentTypes() {
		if (componentTypes == null) {
			componentTypes = new EObjectContainmentEList<MAODComponentType>(MAODComponentType.class, this, mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPES);
		}
		return componentTypes;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				return ((InternalEList<?>)getComponentTypeInstances()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPES:
				return ((InternalEList<?>)getComponentTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MAO_DOMAIN__OUTPUT_IO_DOMAINS:
				return getOutputIODomains();
			case mclevdomPackage.MAO_DOMAIN__INHERITS:
				return getInherits();
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				return getComponentTypeInstances();
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPES:
				return getComponentTypes();
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
			case mclevdomPackage.MAO_DOMAIN__OUTPUT_IO_DOMAINS:
				getOutputIODomains().clear();
				getOutputIODomains().addAll((Collection<? extends MIODomain>)newValue);
				return;
			case mclevdomPackage.MAO_DOMAIN__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAODomain>)newValue);
				return;
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				getComponentTypeInstances().clear();
				getComponentTypeInstances().addAll((Collection<? extends MAODComponentTypeInstance>)newValue);
				return;
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPES:
				getComponentTypes().clear();
				getComponentTypes().addAll((Collection<? extends MAODComponentType>)newValue);
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
			case mclevdomPackage.MAO_DOMAIN__OUTPUT_IO_DOMAINS:
				getOutputIODomains().clear();
				return;
			case mclevdomPackage.MAO_DOMAIN__INHERITS:
				getInherits().clear();
				return;
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				getComponentTypeInstances().clear();
				return;
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPES:
				getComponentTypes().clear();
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
			case mclevdomPackage.MAO_DOMAIN__OUTPUT_IO_DOMAINS:
				return outputIODomains != null && !outputIODomains.isEmpty();
			case mclevdomPackage.MAO_DOMAIN__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				return componentTypeInstances != null && !componentTypeInstances.isEmpty();
			case mclevdomPackage.MAO_DOMAIN__COMPONENT_TYPES:
				return componentTypes != null && !componentTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}