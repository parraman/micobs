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
package es.uah.aut.srg.micobs.mclev.mclevmcad;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;

/**
 * A representation of a regular connection between two components deployed on
 * an MCAD model. The connection is defined between a client port and a server
 * port. This type of connection can only be defined between entities that
 * belong to the same part of the component architecture, i.e. either on the
 * global part or on a given alternative.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getClientInstance <em>ClientInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getClientPort <em>ClientPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getServerInstance <em>ServerInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getServerPort <em>ServerPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getIfaceMapping <em>IfaceMapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection()
 * @model
 * @generated
 */
public interface MCommonConnection extends MConnection {
	/**
	 * Returns the instance to which the client port of the connection belongs.
	 * @return the instance that defines the client port.
	 * @see #setClientInstance(MComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection_ClientInstance()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	MComponentInstance getClientInstance();

	/**
	 * Sets the instance that defines the client port of the connection.
	 * @param value the new instance that defines the client port.
	 * @see #getClientInstance()
	 * @generated
	 */
	void setClientInstance(MComponentInstance value);

	/**
	 * Returns the client port object to which this connection is attached. The
	 * client port will belong to the client component instance.
	 * @return the client port of the connection.
	 * @see #setClientPort(MClientPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection_ClientPort()
	 * @model required="true"
	 * @generated
	 */
	MClientPort getClientPort();

	/**
	 * Sets the client port object of the connection. The client port must
	 * belong to the client component instance.
	 * @param value the new client port object of the connection.
	 * @see #getClientPort()
	 * @generated
	 */
	void setClientPort(MClientPort value);

	/**
	 * Returns the instance to which the server port of the connection belongs.
	 * @return the instance that defines the server port.
	 * @see #setServerInstance(MComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection_ServerInstance()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	MComponentInstance getServerInstance();

	/**
	 * Sets the instance that defines the server port of the connection.
	 * @param value the new instance that defines the server port.
	 * @see #getServerInstance()
	 * @generated
	 */
	void setServerInstance(MComponentInstance value);

	/**
	 * Returns the server port object to which this connection is attached. The
	 * server port will belong to the server component instance.
	 * @return the server port of the connection.
	 * @see #setServerPort(MServerPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection_ServerPort()
	 * @model required="true"
	 * @generated
	 */
	MServerPort getServerPort();

	/**
	 * Sets the server port object of the connection. The server port must
	 * belong to the server component instance.
	 * @param value the new server port object of the connection.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(MServerPort value);

	/**
	 * Returns the connector that will be used to establish the connection.
	 * @return the connector that will be used in the connection.
	 * @see #setConnector(MConnector)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection_Connector()
	 * @model required="true"
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
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection_IfaceMapping()
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
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMCommonConnection_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}