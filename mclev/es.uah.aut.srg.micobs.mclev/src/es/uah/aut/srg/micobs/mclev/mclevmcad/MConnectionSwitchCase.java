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
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;

/**
 * A representation of a connection switch case. These objects are used to set
 * the server side of a switch connection depending on a given deployment
 * alternative.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getServerInstance <em>ServerInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getServerPort <em>ServerPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getConnector <em>Connector</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getIfaceMapping <em>IfaceMapping</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitchCase()
 * @model
 * @generated
 */
public interface MConnectionSwitchCase extends EObject {
	/**
	 * Returns the deployment alternative for which this case is defined.
	 * @return the deployment alternative of the switch case.
	 * @see #setAlternative(MDeploymentAlternative)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitchCase_Alternative()
	 * @model required="true"
	 * @generated
	 */
	MDeploymentAlternative getAlternative();

	/**
	 * Sets the deployment alternative for which the case is defined.
	 * @param value the new deployment alternative.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(MDeploymentAlternative value);

	/**
	 * Returns the instance to which the server port of the connection belongs.
	 * The instance must be part of the deployment alternative attached to the
	 * case.
	 * @return the instance that defines the server port.
	 * @see #setServerInstance(MComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitchCase_ServerInstance()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	MComponentInstance getServerInstance();

	/**
	 * Sets the instance that defines the server port of the connection. 
	 * The instance must be part of the deployment alternative attached to the
	 * case.
	 * @param value the new instance that defines the server port.
	 * @see #getServerInstance()
	 * @generated
	 */
	void setServerInstance(MComponentInstance value);

	/**
	 * Returns the server port object to which this case is attached.
	 * @return the server port of the connection.
	 * @see #setServerPort(MServerPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitchCase_ServerPort()
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
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitchCase_Connector()
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
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitchCase_IfaceMapping()
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
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitchCase_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}