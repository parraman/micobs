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
package es.uah.aut.srg.micobs.mclev.mclevcmp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;

/**
 * An implementation of the model object '<em><b>MPort</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MPortImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MPortImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MPortImpl extends MCommonReferenceableObjImpl implements MPort {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MPortType type;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected MInterface interface_;

	/**
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>AttributeValueAssignments</em>}' containment reference list.
	 * @see #getAttributeValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> attributeValueAssignments;

	/**
	 * @generated
	 */
	protected MPortImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MPORT;
	}

	/**
	 * @generated
	 */
	public MPortType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MPortType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MPORT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * @generated
	 */
	public MPortType basicGetType() {
		return type;
	}

	/**
	 * @generated
	 */
	public void setType(MPortType newType) {
		MPortType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MPORT__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	public MInterface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (MInterface)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MPORT__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * @generated
	 */
	public MInterface basicGetInterface() {
		return interface_;
	}

	/**
	 * @generated
	 */
	public void setInterface(MInterface newInterface) {
		MInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MPORT__INTERFACE, oldInterface, interface_));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevcmpPackage.MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevcmpPackage.MPORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case mclevcmpPackage.MPORT__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case mclevcmpPackage.MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
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
			case mclevcmpPackage.MPORT__TYPE:
				setType((MPortType)newValue);
				return;
			case mclevcmpPackage.MPORT__INTERFACE:
				setInterface((MInterface)newValue);
				return;
			case mclevcmpPackage.MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
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
			case mclevcmpPackage.MPORT__TYPE:
				setType((MPortType)null);
				return;
			case mclevcmpPackage.MPORT__INTERFACE:
				setInterface((MInterface)null);
				return;
			case mclevcmpPackage.MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
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
			case mclevcmpPackage.MPORT__TYPE:
				return type != null;
			case mclevcmpPackage.MPORT__INTERFACE:
				return interface_ != null;
			case mclevcmpPackage.MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}