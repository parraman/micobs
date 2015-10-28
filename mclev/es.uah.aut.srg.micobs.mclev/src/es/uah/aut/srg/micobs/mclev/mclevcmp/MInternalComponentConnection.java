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
package es.uah.aut.srg.micobs.mclev.mclevcmp;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;

/**
 * A representation of a connection defined in the internal structure of a
 * a component. The connection is defined between a client port and a server
 * port. This type of connection can only be defined between entities that
 * belong to the same part of the internal architecture, i.e. either the
 * platform independent or the supported platform-dependent part.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getClientInstance <em>Client Instance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getClientPort <em>Client Port</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getServerInstance <em>Server Instance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getIfaceMapping <em>Interface Mapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection()
 * @model
 * @generated
 */
public interface MInternalComponentConnection extends MInternalConnection {
	/**
	 * Returns the instance to which the client port of the connection belongs.
	 * If the instance is <code>null</code>, then the client port belongs
	 * to the internal membrane of the container component.
	 * @return the instance that defines the client port or <code>null</code>
	 * if the port belongs to the internal membrane of the container component.
	 * @see #setClientInstance(MInternalComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection_ClientInstance()
	 * @model resolveProxies="false"
	 * @generated
	 */
	MInternalComponentInstance getClientInstance();

	/**
	 * Sets the instance that defines the client port of the internal
	 * connection. If the instance value is set to <code>null</code>, then the
	 * client port will belong to the internal membrane of the container
	 * component.
	 * @param value the new instance that defines the client port.
	 * @see #getClientInstance()
	 * @generated
	 */
	void setClientInstance(MInternalComponentInstance value);

	/**
	 * Returns the client port object to which this connection is attached.
	 * @return the client port of the connection.
	 * @see #setClientPort(MClientPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection_ClientPort()
	 * @model required="true"
	 * @generated
	 */
	MClientPort getClientPort();

	/**
	 * Sets the client port object of the connection.
	 * @param value the new client port object of the connection.
	 * @see #getClientPort()
	 * @generated
	 */
	void setClientPort(MClientPort value);

	/**
	 * Returns the instance to which the server port of the connection belongs.
	 * If the instance is <code>null</code>, then the server port belongs
	 * to the internal membrane of the container component.
	 * @return the instance that defines the server port or <code>null</code>
	 * if the port belongs to the internal membrane of the container component.
	 * @see #setServerInstance(MInternalComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection_ServerInstance()
	 * @model resolveProxies="false"
	 * @generated
	 */
	MInternalComponentInstance getServerInstance();

	/**
	 * Sets the instance that defines the server port of the internal
	 * connection. If the instance value is set to <code>null</code>, then the
	 * client port will belong to the internal membrane of the container
	 * component.
	 * @param value the new instance that defines the server port.
	 * @see #getServerInstance()
	 * @generated
	 */
	void setServerInstance(MInternalComponentInstance value);

	/**
	 * Returns the server port object to which this connection is attached.
	 * @return the server port of the connection.
	 * @see #setServerPort(MServerPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection_ServerPort()
	 * @model required="true"
	 * @generated
	 */
	MServerPort getServerPort();

	/**
	 * Sets the server port object of the connection.
	 * @param value the new server port object of the connection.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(MServerPort value);

	/**
	 * Returns the connector that will be used to establish the connection.
	 * @return the connector that will be used in the connection.
	 * @see #setConnector(MConnector)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection_Connector()
	 * @model
	 * @generated
	 */
	MConnector getConnector();

	/**
	 * Sets the connector that will be used in the connection.
	 * @param value the new connector.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(MConnector value);

	/**
	 * Returns the interface mapping that is used in the connection or
	 * <code>null</code> if no mapping is attached.
	 * @return the interface mapping used in this connection.
	 * @see #setIfaceMapping(MInterfaceMapping)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection_IfaceMapping()
	 * @model
	 * @generated
	 */
	MInterfaceMapping getIfaceMapping();

	/**
	 * Sets the interface mapping to be used in the connection.
	 * @param value the new interface mapping.
	 * @see #getIfaceMapping()
	 * @generated
	 */
	void setIfaceMapping(MInterfaceMapping value);

	/**
	 * Returns the list of attribute value assignments defined for the
	 * connection. The attributes are those defined by the connector.
	 * @return the list of value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentConnection_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}