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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MInstantiableResourceDemand</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MInstantiableResourceDemandImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MInstantiableResourceDemandImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MInstantiableResourceDemandImpl#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MInstantiableResourceDemandImpl extends MResourceDemandImpl implements MInstantiableResourceDemand {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected MInstantiableResource resource;

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
	protected MInstantiableResourceDemandImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND;
	}

	/**
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME, oldName, name));
	}

	/**
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION, oldDescription, description));
	}

	/**
	 * @generated
	 */
	public MInstantiableResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (MInstantiableResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * @generated
	 */
	public MInstantiableResource basicGetResource() {
		return resource;
	}

	/**
	 * @generated
	 */
	public void setResource(MInstantiableResource newResource) {
		MInstantiableResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE, oldResource, resource));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getParameterValueAssignments() {
		if (parameterValueAssignments == null) {
			parameterValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return parameterValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME:
				return getName();
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION:
				return getDescription();
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME:
				setName((String)newValue);
				return;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE:
				setResource((MInstantiableResource)newValue);
				return;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE:
				setResource((MInstantiableResource)null);
				return;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS:
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
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE:
				return resource != null;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS:
				return parameterValueAssignments != null && !parameterValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MCommonReferenceableObj.class) {
			switch (derivedFeatureID) {
				case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME: return commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;
				case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION: return commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MCommonReferenceableObj.class) {
			switch (baseFeatureID) {
				case commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME: return mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME;
				case commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION: return mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

}