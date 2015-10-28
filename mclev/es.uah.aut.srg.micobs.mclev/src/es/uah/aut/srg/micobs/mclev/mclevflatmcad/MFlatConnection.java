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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;

/**
 * A representation of a connection between two component instances defined on
 * an MCLEV flat deployment model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getClientInstance <em>Client Instance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getClientPort <em>Client Port</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getServerInstance <em>Server Instance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getIfaceMapping <em>Iface Mapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection()
 * @model
 * @generated
 */
public interface MFlatConnection extends EObject {
	/**
	 * Returns the instance that defines the client port of the connection.
	 * @return the client instance.
	 * @see #setClientInstance(MFlatComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection_ClientInstance()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	MFlatComponentInstance getClientInstance();

	/**
	 * Sets the instance that defines the client port of the connection.
	 * @param value the new client instance.
	 * @see #getClientInstance()
	 * @generated
	 */
	void setClientInstance(MFlatComponentInstance value);

	/**
	 * Returns the client port of the connection. This port is defined as part
	 * of the external membrane of the client component instance.
	 * @return the client port of the connection.
	 * @see #setClientPort(MClientPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection_ClientPort()
	 * @model required="true"
	 * @generated
	 */
	MClientPort getClientPort();

	/**
	 * Sets the client port of the connection. This port must be defined as
	 * part of the external membrane of the client component instance.
	 * @param value the new client port of the connection.
	 * @see #getClientPort()
	 * @generated
	 */
	void setClientPort(MClientPort value);

	/**
	 * Returns the instance that defines the server port of the connection.
	 * @return the server instance.
	 * @see #setServerInstance(MFlatComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection_ServerInstance()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	MFlatComponentInstance getServerInstance();

	/**
	 * Sets the instance that defines the server port of the connection.
	 * @param value the new server instance.
	 * @see #getServerInstance()
	 * @generated
	 */
	void setServerInstance(MFlatComponentInstance value);

	/**
	 * Returns the server port of the connection. This port is defined as part
	 * of the external membrane of the server component instance.
	 * @return the server port of the connection.
	 * @see #setServerPort(MServerPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection_ServerPort()
	 * @model required="true"
	 * @generated
	 */
	MServerPort getServerPort();

	/**
	 * Sets the server port of the connection. This port must be defined as
	 * part of the external membrane of the server component instance.
	 * @param value the new server port of the connection.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(MServerPort value);

	/**
	 * Returns the connector that is used in the connection.
	 * @return the connector of the connection.
	 * @see #setConnector(MConnector)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection_Connector()
	 * @model required="true"
	 * @generated
	 */
	MConnector getConnector();

	/**
	 * Sets the connector that will be used in the connection.
	 * @param value the new connector of the connection.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(MConnector value);

	/**
	 * Returns the interface mapping of the connection or <code>null</code> if
	 * no interface mapping is defined.
	 * @return the interface mapping required by the connection.
	 * @see #setIfaceMapping(MInterfaceMapping)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection_IfaceMapping()
	 * @model
	 * @generated
	 */
	MInterfaceMapping getIfaceMapping();

	/**
	 * Sets the interface mapping that will be used in the connection.
	 * @param value the new interface mapping of the connection.
	 * @see #getIfaceMapping()
	 * @generated
	 */
	void setIfaceMapping(MInterfaceMapping value);

	/**
	 * Returns the list of value assignments to the attributes defined by the
	 * connector of the connection.
	 * @return the list of value assignments to the attributes of the connector.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatConnection_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}