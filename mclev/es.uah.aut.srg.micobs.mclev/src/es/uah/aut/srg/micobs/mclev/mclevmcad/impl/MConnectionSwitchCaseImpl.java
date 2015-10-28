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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * An implementation of the model object '<em><b>MConnectionSwitchCase</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl#getServerInstance <em>ServerInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl#getServerPort <em>ServerPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl#getIfaceMapping <em>IfaceMapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MConnectionSwitchCaseImpl extends EObjectImpl implements MConnectionSwitchCase {
	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference.
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected MDeploymentAlternative alternative;

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
	protected MConnectionSwitchCaseImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MCONNECTION_SWITCH_CASE;
	}

	/**
	 * @generated
	 */
	public MDeploymentAlternative getAlternative() {
		if (alternative != null && alternative.eIsProxy()) {
			InternalEObject oldAlternative = (InternalEObject)alternative;
			alternative = (MDeploymentAlternative)eResolveProxy(oldAlternative);
			if (alternative != oldAlternative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCONNECTION_SWITCH_CASE__ALTERNATIVE, oldAlternative, alternative));
			}
		}
		return alternative;
	}

	/**
	 * @generated
	 */
	public MDeploymentAlternative basicGetAlternative() {
		return alternative;
	}

	/**
	 * @generated
	 */
	public void setAlternative(MDeploymentAlternative newAlternative) {
		MDeploymentAlternative oldAlternative = alternative;
		alternative = newAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCONNECTION_SWITCH_CASE__ALTERNATIVE, oldAlternative, alternative));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_INSTANCE, oldServerInstance, serverInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_PORT, oldServerPort, serverPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_PORT, oldServerPort, serverPort));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCONNECTION_SWITCH_CASE__CONNECTOR, oldConnector, connector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCONNECTION_SWITCH_CASE__CONNECTOR, oldConnector, connector));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCONNECTION_SWITCH_CASE__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCONNECTION_SWITCH_CASE__IFACE_MAPPING, oldIfaceMapping, ifaceMapping));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevmcadPackage.MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ALTERNATIVE:
				if (resolve) return getAlternative();
				return basicGetAlternative();
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_INSTANCE:
				return getServerInstance();
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_PORT:
				if (resolve) return getServerPort();
				return basicGetServerPort();
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__IFACE_MAPPING:
				if (resolve) return getIfaceMapping();
				return basicGetIfaceMapping();
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ALTERNATIVE:
				setAlternative((MDeploymentAlternative)newValue);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_INSTANCE:
				setServerInstance((MComponentInstance)newValue);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_PORT:
				setServerPort((MServerPort)newValue);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__CONNECTOR:
				setConnector((MConnector)newValue);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)newValue);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ALTERNATIVE:
				setAlternative((MDeploymentAlternative)null);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_INSTANCE:
				setServerInstance((MComponentInstance)null);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_PORT:
				setServerPort((MServerPort)null);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__CONNECTOR:
				setConnector((MConnector)null);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__IFACE_MAPPING:
				setIfaceMapping((MInterfaceMapping)null);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
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
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ALTERNATIVE:
				return alternative != null;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_INSTANCE:
				return serverInstance != null;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__SERVER_PORT:
				return serverPort != null;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__CONNECTOR:
				return connector != null;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__IFACE_MAPPING:
				return ifaceMapping != null;
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}