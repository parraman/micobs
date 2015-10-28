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
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MComponent</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getExternalPorts <em>ExternalPorts</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getInternalPorts <em>InternalPorts</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getSupportedPlatforms <em>SupportedPlatforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getInternalComponents <em>InternalComponents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MComponentImpl extends MMCLEVCMPPackageElementImpl implements MComponent {
	/**
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>Attribute Value Assignments</em>}' containment reference list.
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
	 * The cached value of the '{@link #getExternalPorts() <em>ExternalPorts</em>}' containment reference list.
	 * @see #getExternalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<MPort> externalPorts;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<MSAI> requires;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * The cached value of the '{@link #getInternalPorts() <em>InternalPorts</em>}' containment reference list.
	 * @see #getInternalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<MPort> internalPorts;

	/**
	 * The cached value of the '{@link #getSupportedPlatforms() <em>SupportedPlatforms</em>}' containment reference list.
	 * @see #getSupportedPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MComponentSupportedPlatform> supportedPlatforms;

	/**
	 * The cached value of the '{@link #getInternalComponents() <em>InternalComponents</em>}' containment reference list.
	 * @see #getInternalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<MInternalComponentInstance> internalComponents;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<MInternalConnection> connections;

	/**
	 * @generated
	 */
	protected MComponentImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MCOMPONENT;
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MCOMPONENT__DOMAIN, oldDomain, domain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MCOMPONENT__DOMAIN, oldDomain, domain));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MCOMPONENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MCOMPONENT__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevcmpPackage.MCOMPONENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MAbstractComponent> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAbstractComponent>(MAbstractComponent.class, this, mclevcmpPackage.MCOMPONENT__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MPort> getExternalPorts() {
		if (externalPorts == null) {
			externalPorts = new EObjectContainmentEList<MPort>(MPort.class, this, mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS);
		}
		return externalPorts;
	}

	/**
	 * @generated
	 */
	public EList<MSAI> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<MSAI>(MSAI.class, this, mclevcmpPackage.MCOMPONENT__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, mclevcmpPackage.MCOMPONENT__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	public EList<MPort> getInternalPorts() {
		if (internalPorts == null) {
			internalPorts = new EObjectContainmentEList<MPort>(MPort.class, this, mclevcmpPackage.MCOMPONENT__INTERNAL_PORTS);
		}
		return internalPorts;
	}

	/**
	 * @generated
	 */
	public EList<MComponentSupportedPlatform> getSupportedPlatforms() {
		if (supportedPlatforms == null) {
			supportedPlatforms = new EObjectContainmentEList<MComponentSupportedPlatform>(MComponentSupportedPlatform.class, this, mclevcmpPackage.MCOMPONENT__SUPPORTED_PLATFORMS);
		}
		return supportedPlatforms;
	}

	/**
	 * @generated
	 */
	public EList<MInternalComponentInstance> getInternalComponents() {
		if (internalComponents == null) {
			internalComponents = new EObjectContainmentEList<MInternalComponentInstance>(MInternalComponentInstance.class, this, mclevcmpPackage.MCOMPONENT__INTERNAL_COMPONENTS);
		}
		return internalComponents;
	}

	/**
	 * @generated
	 */
	public EList<MInternalConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<MInternalConnection>(MInternalConnection.class, this, mclevcmpPackage.MCOMPONENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS:
				return ((InternalEList<?>)getExternalPorts()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MCOMPONENT__INTERNAL_PORTS:
				return ((InternalEList<?>)getInternalPorts()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MCOMPONENT__SUPPORTED_PLATFORMS:
				return ((InternalEList<?>)getSupportedPlatforms()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MCOMPONENT__INTERNAL_COMPONENTS:
				return ((InternalEList<?>)getInternalComponents()).basicRemove(otherEnd, msgs);
			case mclevcmpPackage.MCOMPONENT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
			case mclevcmpPackage.MCOMPONENT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case mclevcmpPackage.MCOMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTES:
				return getAttributes();
			case mclevcmpPackage.MCOMPONENT__INHERITS:
				return getInherits();
			case mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS:
				return getExternalPorts();
			case mclevcmpPackage.MCOMPONENT__REQUIRES:
				return getRequires();
			case mclevcmpPackage.MCOMPONENT__LANGUAGES:
				return getLanguages();
			case mclevcmpPackage.MCOMPONENT__INTERNAL_PORTS:
				return getInternalPorts();
			case mclevcmpPackage.MCOMPONENT__SUPPORTED_PLATFORMS:
				return getSupportedPlatforms();
			case mclevcmpPackage.MCOMPONENT__INTERNAL_COMPONENTS:
				return getInternalComponents();
			case mclevcmpPackage.MCOMPONENT__CONNECTIONS:
				return getConnections();
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
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__DOMAIN:
				setDomain((MDomain)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__TYPE:
				setType((MComponentType)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAbstractComponent>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS:
				getExternalPorts().clear();
				getExternalPorts().addAll((Collection<? extends MPort>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSAI>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__INTERNAL_PORTS:
				getInternalPorts().clear();
				getInternalPorts().addAll((Collection<? extends MPort>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				getSupportedPlatforms().addAll((Collection<? extends MComponentSupportedPlatform>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__INTERNAL_COMPONENTS:
				getInternalComponents().clear();
				getInternalComponents().addAll((Collection<? extends MInternalComponentInstance>)newValue);
				return;
			case mclevcmpPackage.MCOMPONENT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends MInternalConnection>)newValue);
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
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__DOMAIN:
				setDomain((MDomain)null);
				return;
			case mclevcmpPackage.MCOMPONENT__TYPE:
				setType((MComponentType)null);
				return;
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__INHERITS:
				getInherits().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS:
				getExternalPorts().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__REQUIRES:
				getRequires().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__LANGUAGES:
				getLanguages().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__INTERNAL_PORTS:
				getInternalPorts().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__INTERNAL_COMPONENTS:
				getInternalComponents().clear();
				return;
			case mclevcmpPackage.MCOMPONENT__CONNECTIONS:
				getConnections().clear();
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
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
			case mclevcmpPackage.MCOMPONENT__DOMAIN:
				return domain != null;
			case mclevcmpPackage.MCOMPONENT__TYPE:
				return type != null;
			case mclevcmpPackage.MCOMPONENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevcmpPackage.MCOMPONENT__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS:
				return externalPorts != null && !externalPorts.isEmpty();
			case mclevcmpPackage.MCOMPONENT__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mclevcmpPackage.MCOMPONENT__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case mclevcmpPackage.MCOMPONENT__INTERNAL_PORTS:
				return internalPorts != null && !internalPorts.isEmpty();
			case mclevcmpPackage.MCOMPONENT__SUPPORTED_PLATFORMS:
				return supportedPlatforms != null && !supportedPlatforms.isEmpty();
			case mclevcmpPackage.MCOMPONENT__INTERNAL_COMPONENTS:
				return internalComponents != null && !internalComponents.isEmpty();
			case mclevcmpPackage.MCOMPONENT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MAbstractComponent.class) {
			switch (derivedFeatureID) {
				case mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS: return mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS;
				case mclevcmpPackage.MCOMPONENT__DOMAIN: return mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN;
				case mclevcmpPackage.MCOMPONENT__TYPE: return mclevcmpPackage.MABSTRACT_COMPONENT__TYPE;
				case mclevcmpPackage.MCOMPONENT__ATTRIBUTES: return mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES;
				case mclevcmpPackage.MCOMPONENT__INHERITS: return mclevcmpPackage.MABSTRACT_COMPONENT__INHERITS;
				case mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS: return mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS;
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
		if (baseClass == MAbstractComponent.class) {
			switch (baseFeatureID) {
				case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS: return mclevcmpPackage.MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS;
				case mclevcmpPackage.MABSTRACT_COMPONENT__DOMAIN: return mclevcmpPackage.MCOMPONENT__DOMAIN;
				case mclevcmpPackage.MABSTRACT_COMPONENT__TYPE: return mclevcmpPackage.MCOMPONENT__TYPE;
				case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES: return mclevcmpPackage.MCOMPONENT__ATTRIBUTES;
				case mclevcmpPackage.MABSTRACT_COMPONENT__INHERITS: return mclevcmpPackage.MCOMPONENT__INHERITS;
				case mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS: return mclevcmpPackage.MCOMPONENT__EXTERNAL_PORTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}