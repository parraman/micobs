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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;

/**
 * A representation of an abstract port. For each two different roles, i.e.
 * client and server, a class that inherits from this one is defined.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMPort()
 * @model abstract="true"
 * @generated
 */
public interface MPort extends MCommonReferenceableObj {
	/**
	 * Returns the type of port. This type will be one of the types defined
	 * by the domain to which the deploying component is attached.
	 * @return the type of port.
	 * @see #setType(MPortType)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMPort_Type()
	 * @model required="true"
	 * @generated
	 */
	MPortType getType();

	/**
	 * Sets the type of port. This type must be one of the types defined by
	 * the domain to which the deploying component belongs.
	 * @param value the new port type.
	 * @see #getType()
	 * @generated
	 */
	void setType(MPortType value);

	/**
	 * Returns the interface attached to the port. This interface will be one
	 * of those defined by the domain to which the deploying component belongs.
	 * @return the interface attached to the port.
	 * @see #setInterface(MInterface)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMPort_Interface()
	 * @model required="true"
	 * @generated
	 */
	MInterface getInterface();

	/**
	 * Sets the interface that will be attached to the port. This interface
	 * must be one of those defined by the domain to which the deploying
	 * component belongs.
	 * @param value the new interface.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(MInterface value);

	/**
	 * Returns the list of attribute value assignments defined by the port
	 * instance. These attributes are the ones defined within the port type.
	 * @return the list of value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMPort_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}