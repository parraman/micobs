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
package es.uah.aut.srg.micobs.mclev.mclevdom;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of a connector defined within a domain. These objects
 * are used when defining a connection between two component instances.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getClientPortTypes <em>Client Port Types</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getServerPortTypes <em>Server Port Types</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getExchangeModel <em>Exchange Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMConnector()
 * @model
 * @generated
 */
public interface MConnector extends MCommonReferenceableObj {
	/**
	 * Returns the list of connectors from which this connector inherits.
	 * @return the list of inherited connectors.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMConnector_Inherits()
	 * @model
	 * @generated
	 */
	EList<MConnector> getInherits();

	/**
	 * Returns the list of attributes defined by the connectors. The values of
	 * these attributes are set when a connection that uses this connector is
	 * defined.
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMConnector_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the list of port types that can be used on the client side of
	 * the connection.
	 * @return the list of valid client port types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMConnector_ClientPortTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<MPortType> getClientPortTypes();

	/**
	 * Returns the list of port types that can be used on the server side of
	 * the connection.
	 * @return the list of valid server port types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMConnector_ServerPortTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<MPortType> getServerPortTypes();

	/**
	 * Returns the exchange model attached to the connector. This model can be
	 * used to translate between the interfaces used on each side of the connection.
	 * @return the exchange model attached to the connector or
	 * <code>null</code> if no exchange model is defined.
	 * @see #setExchangeModel(MExchangeModel)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMConnector_ExchangeModel()
	 * @model
	 * @generated
	 */
	MExchangeModel getExchangeModel();

	/**
	 * Sets the exchange model attached to the connector.
	 * @param value the new exchange model.
	 * @see #getExchangeModel()
	 * @generated
	 */
	void setExchangeModel(MExchangeModel value);

}