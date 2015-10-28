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
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;

/**
 * A representation of an internal component connection platform switch case.
 * These objects are used to set the server side of a switch connection
 * depending on a given supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getServerInstance <em>Server Instance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getIfaceMapping <em>Iface Mapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitchCase()
 * @model
 * @generated
 */
public interface MInternalComponentPlatformSwitchCase extends EObject {
	/**
	 * Returns the supported platform for which this case is defined.
	 * @return the supported platform of the switch case.
	 * @see #setPlatform(MComponentSupportedPlatform)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitchCase_Platform()
	 * @model required="true"
	 * @generated
	 */
	MComponentSupportedPlatform getPlatform();

	/**
	 * Sets the supported platform for which the case is defined.
	 * @param value the new component supported platform.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(MComponentSupportedPlatform value);

	/**
	 * Returns the instance to which the server port of the connection belongs.
	 * The instance must be part of the internal architecture defined for the
	 * supported platform attached to the case.
	 * @return the instance that defines the server port.
	 * @see #setServerInstance(MInternalComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitchCase_ServerInstance()
	 * @model resolveProxies="false"
	 * @generated
	 */
	MInternalComponentInstance getServerInstance();

	/**
	 * Sets the instance that defines the server port of the internal
	 * connection. The instance must be part of the internal architecture
	 * defined for the supported platform attached to the case.
	 * @param value the new instance that defines the server port.
	 * @see #getServerInstance()
	 * @generated
	 */
	void setServerInstance(MInternalComponentInstance value);

	/**
	 * Returns the server port object to which this case is attached.
	 * @return the server port of the connection.
	 * @see #setServerPort(MServerPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitchCase_ServerPort()
	 * @model required="true"
	 * @generated
	 */
	MServerPort getServerPort();

	/**
	 * Sets the server port object of the connection case.
	 * @param value the new server port object of the connection case.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(MServerPort value);

	/**
	 * Returns the connector that will be used to establish the connection.
	 * @return the connector that will be used in the connection.
	 * @see #setConnector(MConnector)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitchCase_Connector()
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
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitchCase_IfaceMapping()
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
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitchCase_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}