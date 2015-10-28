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

/**
 * A representation of a connection defined as part of the internal
 * architecture of a component whose server side is defined depending on the
 * different supported platforms. For each supported platform a specific server
 * port will be defined.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getClientInstance <em>ClientInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getClientPort <em>ClientPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitch()
 * @model
 * @generated
 */
public interface MInternalComponentPlatformSwitch extends MInternalConnection {
	/**
	 * Returns the instance to which the client port of the connection belongs.
	 * If the instance is <code>null</code>, then the client port belongs
	 * to the internal membrane of the container component. The instance must
	 * be part of the supported platform-independent part of the internal
	 * architecture.
	 * @return the instance that defines the client port or <code>null</code>
	 * if the port belongs to the internal membrane of the container component.
	 * @return the value of the '<em>Client Instance</em>' reference.
	 * @see #setClientInstance(MInternalComponentInstance)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitch_ClientInstance()
	 * @model resolveProxies="false"
	 * @generated
	 */
	MInternalComponentInstance getClientInstance();

	/**
	 * Sets the instance that defines the client port of the connection.
	 * If the instance value is set to <code>null</code>, then the client port
	 * will belong to the internal membrane of the container component. The 
	 * instance must be part of the supported platform-independent part of the
	 * internal architecture.
	 * @param value the new instance that defines the client port.
	 * @see #getClientInstance()
	 * @generated
	 */
	void setClientInstance(MInternalComponentInstance value);

	/**
	 * Returns the client port object to which this connection is attached.
	 * @return the client port of the connection.
	 * @see #setClientPort(MClientPort)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitch_ClientPort()
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
	 * connection. For each supported platform, a case will be defined.
	 * @return the list of cases that define the server part of the connection.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentPlatformSwitch_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MInternalComponentPlatformSwitchCase> getCases();

}