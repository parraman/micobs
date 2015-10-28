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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl;

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
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;

/**
 * An implementation of the model object '<em><b>MFlatConnection</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl#getClientInstance <em>ClientInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl#getClientPort <em>ClientPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl#getServerInstance <em>ServerInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl#getServerPort <em>ServerPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl#getIfaceMapping <em>IfaceMapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MFlatConnectionImpl extends EObjectImpl implements MFlatConnection {
	/**
	 * The cached value of the '{@link #getClientInstance() <em>ClientInstance</em>}' reference.
	 * @see #getClientInstance()
	 * @generated
	 * @ordered
	 */
	protected MFlatComponentInstance clientInstance;

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
	protected MFlatComponentInstance serverInstance;

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
	protected MFlatConnectionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevflatmcadPackage.Literals.MFLAT_CONNECTION;
	}

	/**
	 * @generated
	 */
	public MFlatComponentInstance getClientInstance() {
		return clientInstance;
	}

	/**
	 * @generated
	 */
	public void setClientInstance(MFlatComponentInstance newClientInstance) {
		MFlatComponentInstance oldClientInstance = clientInstance;
		clientInstance = newClientInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_INSTANCE, oldClientInstance, clientInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_PORT, oldClientPort, clientPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_PORT, oldClientPort, clientPort));
	}

	/**
	 * @generated
	 */
	public MFlatComponentInstance getServerInstance() {
		return serverInstance;
	}

	/**
	 * @generated
	 */
	public void setServerInstance(MFlatComponentInstance newServerInstance) {
		MFlatComponentInstance oldServerInstance = serverInstance;
		serverInstance = newServerInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_INSTANCE, oldServerInstance, serverInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_PORT, oldServerPort, serverPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_PORT, oldServerPort, serverPort));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_CONNECTION__CONNECTOR, oldConnector, connector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_CONNECTION__CONNECTOR, oldConnector, connector));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_CONNECTION__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_CONNECTION__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevflatmcadPackage.MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevflatmcadPackage.MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_INSTANCE:
				return getClientInstance();
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_PORT:
				if (resolve) return getClientPort();
				return basicGetClientPort();
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_INSTANCE:
				return getServerInstance();
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_PORT:
				if (resolve) return getServerPort();
				return basicGetServerPort();
			case mclevflatmcadPackage.MFLAT_CONNECTION__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case mclevflatmcadPackage.MFLAT_CONNECTION__IFACE_MAPPING:
				if (resolve) return getIfaceMapping();
				return basicGetIfaceMapping();
			case mclevflatmcadPackage.MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_INSTANCE:
				setClientInstance((MFlatComponentInstance)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_PORT:
				setClientPort((MClientPort)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_INSTANCE:
				setServerInstance((MFlatComponentInstance)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_PORT:
				setServerPort((MServerPort)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__CONNECTOR:
				setConnector((MConnector)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_INSTANCE:
				setClientInstance((MFlatComponentInstance)null);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_PORT:
				setClientPort((MClientPort)null);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_INSTANCE:
				setServerInstance((MFlatComponentInstance)null);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_PORT:
				setServerPort((MServerPort)null);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__CONNECTOR:
				setConnector((MConnector)null);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)null);
				return;
			case mclevflatmcadPackage.MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_INSTANCE:
				return clientInstance != null;
			case mclevflatmcadPackage.MFLAT_CONNECTION__CLIENT_PORT:
				return clientPort != null;
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_INSTANCE:
				return serverInstance != null;
			case mclevflatmcadPackage.MFLAT_CONNECTION__SERVER_PORT:
				return serverPort != null;
			case mclevflatmcadPackage.MFLAT_CONNECTION__CONNECTOR:
				return connector != null;
			case mclevflatmcadPackage.MFLAT_CONNECTION__IFACE_MAPPING:
				return ifaceMapping != null;
			case mclevflatmcadPackage.MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}