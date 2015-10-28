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
 * A representation of a port type.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getInterfaceTypes <em>InterfaceTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getClientAttributes <em>ClientAttributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getServerAttributes <em>ServerAttributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortType()
 * @model
 * @generated
 */
public interface MPortType extends MCommonReferenceableObj {
	/**
	 * Returns the list of port types from which this type inherits.
	 * @return the list of inherited port types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortType_Inherits()
	 * @model
	 * @generated
	 */
	EList<MPortType> getInherits();

	/**
	 * Returns the list of interface types supported by the port type.
	 * @return the list of supported interface types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortType_InterfaceTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<MInterfaceType> getInterfaceTypes();

	/**
	 * Returns the list of attributes defined by the type without depending
	 * on the port role. The value of these attributes shall be assigned when
	 * a port of this type is instantiated as part of the architecture of a
	 * component.
	 * @return the list of role-independent attributes defined by the port type.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the list of attributes defined by the port type for when the
	 * ports are instantiated as client ports.
	 * @return the list of attributes defined for the client ports.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortType_ClientAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getClientAttributes();

	/**
	 * Returns the list of attributes defined by the port type for when the
	 * ports are instantiated as server ports.
	 * @return the list of attributes defined for the server ports.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortType_ServerAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getServerAttributes();

}