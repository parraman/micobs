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

import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;

/**
 * A representation of a connection defined as part of an MCAD model whose
 * server side is defined depending on the different deployment
 * sub-alternatives. For each supported platform a specific server port will
 * be defined.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getClientInstance <em>ClientInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getClientPort <em>ClientPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitch()
 * @model
 * @generated
 */
public interface MConnectionSwitch extends MConnection {
	/**
	 * Returns the instance to which the client port of the connection belongs.
	 * @return the instance that defines the client port.
	 * @see #setClientInstance(MComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitch_ClientInstance()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	MComponentInstance getClientInstance();

	/**
	 * Sets the instance that defines the client port of the connection. The 
	 * instance may be part of the global part of the deployment model or part
	 * of a given alternative.
	 * @param value the new instance that defines the client port.
	 * @see #getClientInstance()
	 * @generated
	 */
	void setClientInstance(MComponentInstance value);

	/**
	 * Returns the client port object to which this connection is attached.
	 * @return the client port of the connection.
	 * @see #setClientPort(MClientPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitch_ClientPort()
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
	 * Returns the list of cases that will define the server part of the
	 * connection. For each deployment sub-alternative, a case will be defined.
	 * @return the list of cases that define the server part of the connection.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnectionSwitch_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MConnectionSwitchCase> getCases();

}