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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;

/**
 * An implementation of the model object '<em><b>MInternalComponentPlatformSwitchCase</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl#getServerInstance <em>ServerInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl#getServerPort <em>ServerPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl#getIfaceMapping <em>IfaceMapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MInternalComponentPlatformSwitchCaseImpl extends EObjectImpl implements MInternalComponentPlatformSwitchCase {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference.
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected MComponentSupportedPlatform platform;

	/**
	 * The cached value of the '{@link #getServerInstance() <em>ServerInstance</em>}' reference.
	 * @see #getServerInstance()
	 * @generated
	 * @ordered
	 */
	protected MInternalComponentInstance serverInstance;

	/**
	 * The cached value of the '{@link #getServerPort() <em>ServerPort</em>}' reference.
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected MServerPort serverPort;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected MConnector connector;

	/**
	 * The cached value of the '{@link #getIfaceMapping() <em>IfaceMapping</em>}' reference.
	 * @see #getIfaceMapping()
	 * @generated
	 * @ordered
	 */
	protected MInterfaceMapping ifaceMapping;

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
	protected MInternalComponentPlatformSwitchCaseImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE;
	}

	/**
	 * @generated
	 */
	public MComponentSupportedPlatform getPlatform() {
		if (platform != null && platform.eIsProxy()) {
			InternalEObject oldPlatform = (InternalEObject)platform;
			platform = (MComponentSupportedPlatform)eResolveProxy(oldPlatform);
			if (platform != oldPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM, oldPlatform, platform));
			}
		}
		return platform;
	}

	/**
	 * @generated
	 */
	public MComponentSupportedPlatform basicGetPlatform() {
		return platform;
	}

	/**
	 * @generated
	 */
	public void setPlatform(MComponentSupportedPlatform newPlatform) {
		MComponentSupportedPlatform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM, oldPlatform, platform));
	}

	/**
	 * @generated
	 */
	public MInternalComponentInstance getServerInstance() {
		return serverInstance;
	}

	/**
	 * @generated
	 */
	public void setServerInstance(MInternalComponentInstance newServerInstance) {
		MInternalComponentInstance oldServerInstance = serverInstance;
		serverInstance = newServerInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE, oldServerInstance, serverInstance));
	}

	/**
	 * @generated
	 */
	public MServerPort getServerPort() {
		if (serverPort != null && serverPort.eIsProxy()) {
			InternalEObject oldServerPort = (InternalEObject)serverPort;
			serverPort = (MServerPort)eResolveProxy(oldServerPort);
			if (serverPort != oldServerPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT, oldServerPort, serverPort));
			}
		}
		return serverPort;
	}

	/**
	 * @generated
	 */
	public MServerPort basicGetServerPort() {
		return serverPort;
	}

	/**
	 * @generated
	 */
	public void setServerPort(MServerPort newServerPort) {
		MServerPort oldServerPort = serverPort;
		serverPort = newServerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT, oldServerPort, serverPort));
	}

	/**
	 * @generated
	 */
	public MConnector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (MConnector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * @generated
	 */
	public MConnector basicGetConnector() {
		return connector;
	}

	/**
	 * @generated
	 */
	public void setConnector(MConnector newConnector) {
		MConnector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR, oldConnector, connector));
	}

	/**
	 * @generated
	 */
	public MInterfaceMapping getIfaceMapping() {
		if (ifaceMapping != null && ifaceMapping.eIsProxy()) {
			InternalEObject oldIfaceMapping = (InternalEObject)ifaceMapping;
			ifaceMapping = (MInterfaceMapping)eResolveProxy(oldIfaceMapping);
			if (ifaceMapping != oldIfaceMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
			}
		}
		return ifaceMapping;
	}

	/**
	 * @generated
	 */
	public MInterfaceMapping basicGetIfaceMapping() {
		return ifaceMapping;
	}

	/**
	 * @generated
	 */
	public void setIfaceMapping(MInterfaceMapping newIfaceMapping) {
		MInterfaceMapping oldIfaceMapping = ifaceMapping;
		ifaceMapping = newIfaceMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM:
				if (resolve) return getPlatform();
				return basicGetPlatform();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE:
				return getServerInstance();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT:
				if (resolve) return getServerPort();
				return basicGetServerPort();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING:
				if (resolve) return getIfaceMapping();
				return basicGetIfaceMapping();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM:
				setPlatform((MComponentSupportedPlatform)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE:
				setServerInstance((MInternalComponentInstance)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT:
				setServerPort((MServerPort)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR:
				setConnector((MConnector)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM:
				setPlatform((MComponentSupportedPlatform)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE:
				setServerInstance((MInternalComponentInstance)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT:
				setServerPort((MServerPort)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR:
				setConnector((MConnector)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM:
				return platform != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE:
				return serverInstance != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT:
				return serverPort != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR:
				return connector != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING:
				return ifaceMapping != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MInternalComponentPlatformSwitchCaseImpl
