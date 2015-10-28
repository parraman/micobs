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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;

/**
 * An implementation of the model object '<em><b>MAbstractComponent</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl#getExternalPorts <em>External Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAbstractComponentImpl extends MMCLEVCMPPackageElementImpl implements MAbstractComponent {
	/**
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>AttributeValueAssignments</em>}' containment reference list.
	 * @see #getAttributeValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> attributeValueAssignments;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected MDomain domain;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MComponentType type;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MAbstractComponent> inherits;

	/**
	 * The cached value of the '{@link #getExternalPorts() <em>External Ports</em>}' containment reference list.
	 * @see #getExternalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<MPort> externalPorts;

	/**
	 * @generated
	 */
	protected MAbstractComponentImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MABSTRACT_COMPONENT;
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	public MDomain getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (MDomain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * @generated
	 */
	public MDomain basicGetDomain() {
		return domain;
	}

	/**
	 * @generated
	 */
	public void setDomain(MDomain newDomain) {
		MDomain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN, oldDomain, domain));
	}

	/**
	 * @generated
	 */
	public MComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MComponentType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MABSTRACT_COMPONENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * @generated
	 */
	public MComponentType basicGetType() {
		return type;
	}

	/**
	 * @generated
	 */
	public void setType(MComponentType newType) {
		MComponentType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MABSTRACT_COMPONENT__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MAbstractComponent> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAbstractComponent>(MAbstractComponent.class, this, mclevcmpPackage.MABSTRACT_COMPONENT__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MPort> getExternalPorts() {
		if (externalPorts == null) {
			externalPorts = new EObjectContainmentEList<MPort>(MPort.class, this, mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS);
		}
		return externalPorts;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS:
				return ((InternalEList<?>)getExternalPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
			case mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case mclevcmpPackage.MABSTRACT_COMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES:
				return getAttributes();
			case mclevcmpPackage.MABSTRACT_COMPONENT__INHERITS:
				return getInherits();
			case mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS:
				return getExternalPorts();
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
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN:
				setDomain((MDomain)newValue);
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__TYPE:
				setType((MComponentType)newValue);
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAbstractComponent>)newValue);
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS:
				getExternalPorts().clear();
				getExternalPorts().addAll((Collection<? extends MPort>)newValue);
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
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN:
				setDomain((MDomain)null);
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__TYPE:
				setType((MComponentType)null);
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__INHERITS:
				getInherits().clear();
				return;
			case mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS:
				getExternalPorts().clear();
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
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
			case mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN:
				return domain != null;
			case mclevcmpPackage.MABSTRACT_COMPONENT__TYPE:
				return type != null;
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevcmpPackage.MABSTRACT_COMPONENT__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS:
				return externalPorts != null && !externalPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}