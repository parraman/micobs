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
package es.uah.aut.srg.micobs.libdesc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;

/**
 * An implementation of the model object '<em><b>MDescriptorList</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorListImpl#getDescriptors <em>Descriptors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDescriptorListImpl extends EObjectImpl implements MDescriptorList {
	/**
	 * The cached value of the '{@link #getDescriptors() <em>Descriptors</em>}' containment reference list.
	 * @see #getDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<MDescriptor> descriptors;

	/**
	 * @generated
	 */
	protected MDescriptorListImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return libdescPackage.Literals.MDESCRIPTOR_LIST;
	}

	/**
	 * @generated
	 */
	public EList<MDescriptor> getDescriptors() {
		if (descriptors == null) {
			descriptors = new EObjectContainmentEList<MDescriptor>(MDescriptor.class, this, libdescPackage.MDESCRIPTOR_LIST__DESCRIPTORS);
		}
		return descriptors;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case libdescPackage.MDESCRIPTOR_LIST__DESCRIPTORS:
				return ((InternalEList<?>)getDescriptors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case libdescPackage.MDESCRIPTOR_LIST__DESCRIPTORS:
				return getDescriptors();
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
			case libdescPackage.MDESCRIPTOR_LIST__DESCRIPTORS:
				getDescriptors().clear();
				getDescriptors().addAll((Collection<? extends MDescriptor>)newValue);
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
			case libdescPackage.MDESCRIPTOR_LIST__DESCRIPTORS:
				getDescriptors().clear();
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
			case libdescPackage.MDESCRIPTOR_LIST__DESCRIPTORS:
				return descriptors != null && !descriptors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
