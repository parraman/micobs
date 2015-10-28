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

import es.uah.aut.srg.micobs.common.MParameter;


/**
 * A representation of a generic domain. Both implementation-oriented and
 * application-oriented domains inherit from this representation.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#isAllowsSingleton <em>AllowsSingleton</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getPortTypes <em>PortTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getInterfaceTypes <em>InterfaceTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getConnectors <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMDomain()
 * @model abstract="true"
 * @generated
 */
public interface MDomain extends MMCLEVDOMPackageElement {
	/**
	 * Returns a flag that indicates whether the domain supports singleton
	 * components or not.
	 * @return <code>true</code> if the domain supports singleton components or
	 * <code>false</code> if it does not.
	 * @see #setAllowsSingleton(boolean)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMDomain_AllowsSingleton()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAllowsSingleton();

	/**
	 * Sets the value of the flag that indicates whether the domain supports
	 * singleton components or not.
	 * @param value the new value of the flag.
	 * @see #isAllowsSingleton()
	 * @generated
	 */
	void setAllowsSingleton(boolean value);

	/**
	 * Returns the list of attributes defined by the domain. The value of these
	 * attributes will be assigned when defining a new deployment model
	 * attached to this domain.
	 * @return the list of attributes defined by the domain.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMDomain_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the list of port types defined by the domain.
	 * @return the list of port types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMDomain_PortTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPortType> getPortTypes();

	/**
	 * Returns the list of interface types defined by the domain.
	 * @return the list of interface types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMDomain_InterfaceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MInterfaceType> getInterfaceTypes();

	/**
	 * Returns the list of connectors defined by the domain.
	 * @return the list of connectors.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMDomain_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<MConnector> getConnectors();

}