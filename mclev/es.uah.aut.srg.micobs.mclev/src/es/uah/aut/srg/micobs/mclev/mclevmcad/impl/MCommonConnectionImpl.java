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
package es.uah.aut.srg.micobs.mclev.mclevmcad.impl;

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
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * An implementation of the model object '<em><b>MCommonConnection</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl#getClientInstance <em>ClientInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl#getClientPort <em>ClientPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl#getServerInstance <em>ServerInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl#getServerPort <em>ServerPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl#getIfaceMapping <em>IfaceMapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCommonConnectionImpl extends MConnectionImpl implements MCommonConnection {
	/**
	 * The cached value of the '{@link #getClientInstance() <em>ClientInstance</em>}' reference.
	 * @see #getClientInstance()
	 * @generated
	 * @ordered
	 */
	protected MComponentInstance clientInstance;

	/**
	 * The cached value of the '{@link #getClientPort() <em>ClientPort</em>}' reference.
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected MClientPort clientPort;

	/**
	 * The cached value of the '{@link #getServerInstance() <em>ServerInstance</em>}' reference.
	 * @see #getServerInstance()
	 * @generated
	 * @ordered
	 */
	protected MComponentInstance serverInstance;

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
	protected MCommonConnectionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MCOMMON_CONNECTION;
	}

	/**
	 * @generated
	 */
	public MComponentInstance getClientInstance() {
		return clientInstance;
	}

	/**
	 * @generated
	 */
	public void setClientInstance(MComponentInstance newClientInstance) {
		MComponentInstance oldClientInstance = clientInstance;
		clientInstance = newClientInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_INSTANCE, oldClientInstance, clientInstance));
	}

	/**
	 * @generated
	 */
	public MClientPort getClientPort() {
		if (clientPort != null && clientPort.eIsProxy()) {
			InternalEObject oldClientPort = (InternalEObject)clientPort;
			clientPort = (MClientPort)eResolveProxy(oldClientPort);
			if (clientPort != oldClientPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_PORT, oldClientPort, clientPort));
			}
		}
		return clientPort;
	}

	/**
	 * @generated
	 */
	public MClientPort basicGetClientPort() {
		return clientPort;
	}

	/**
	 * @generated
	 */
	public void setClientPort(MClientPort newClientPort) {
		MClientPort oldClientPort = clientPort;
		clientPort = newClientPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_PORT, oldClientPort, clientPort));
	}

	/**
	 * @generated
	 */
	public MComponentInstance getServerInstance() {
		return serverInstance;
	}

	/**
	 * @generated
	 */
	public void setServerInstance(MComponentInstance newServerInstance) {
		MComponentInstance oldServerInstance = serverInstance;
		serverInstance = newServerInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCOMMON_CONNECTION__SERVER_INSTANCE, oldServerInstance, serverInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCOMMON_CONNECTION__SERVER_PORT, oldServerPort, serverPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCOMMON_CONNECTION__SERVER_PORT, oldServerPort, serverPort));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCOMMON_CONNECTION__CONNECTOR, oldConnector, connector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCOMMON_CONNECTION__CONNECTOR, oldConnector, connector));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCOMMON_CONNECTION__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCOMMON_CONNECTION__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevmcadPackage.MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevmcadPackage.MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_INSTANCE:
				return getClientInstance();
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_PORT:
				if (resolve) return getClientPort();
				return basicGetClientPort();
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_INSTANCE:
				return getServerInstance();
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_PORT:
				if (resolve) return getServerPort();
				return basicGetServerPort();
			case mclevmcadPackage.MCOMMON_CONNECTION__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case mclevmcadPackage.MCOMMON_CONNECTION__IFACE_MAPPING:
				if (resolve) return getIfaceMapping();
				return basicGetIfaceMapping();
			case mclevmcadPackage.MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_INSTANCE:
				setClientInstance((MComponentInstance)newValue);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_PORT:
				setClientPort((MClientPort)newValue);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_INSTANCE:
				setServerInstance((MComponentInstance)newValue);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_PORT:
				setServerPort((MServerPort)newValue);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__CONNECTOR:
				setConnector((MConnector)newValue);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)newValue);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_INSTANCE:
				setClientInstance((MComponentInstance)null);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_PORT:
				setClientPort((MClientPort)null);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_INSTANCE:
				setServerInstance((MComponentInstance)null);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_PORT:
				setServerPort((MServerPort)null);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__CONNECTOR:
				setConnector((MConnector)null);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)null);
				return;
			case mclevmcadPackage.MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_INSTANCE:
				return clientInstance != null;
			case mclevmcadPackage.MCOMMON_CONNECTION__CLIENT_PORT:
				return clientPort != null;
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_INSTANCE:
				return serverInstance != null;
			case mclevmcadPackage.MCOMMON_CONNECTION__SERVER_PORT:
				return serverPort != null;
			case mclevmcadPackage.MCOMMON_CONNECTION__CONNECTOR:
				return connector != null;
			case mclevmcadPackage.MCOMMON_CONNECTION__IFACE_MAPPING:
				return ifaceMapping != null;
			case mclevmcadPackage.MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}