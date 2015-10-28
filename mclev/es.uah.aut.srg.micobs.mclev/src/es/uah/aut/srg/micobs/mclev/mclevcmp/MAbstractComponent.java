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

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;

/**
 * A representation of an abstract component.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getExternalPorts <em>External Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMAbstractComponent()
 * @model
 * @generated
 */
public interface MAbstractComponent extends MMCLEVCMPPackageElement {
	/**
	 * Returns the list of value assignments to the attributes defined for
	 * the type to which the component is ascribed.
	 * @return the list of value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMAbstractComponent_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

	/**
	 * Returns the domain to which the component is ascribed.
	 * @return the domain to which the component is ascribed.
	 * @see #setDomain(MDomain)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMAbstractComponent_Domain()
	 * @model required="true"
	 * @generated
	 */
	MDomain getDomain();

	/**
	 * Sets the domain to which the component is ascribed.
	 * @param value the new domain.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(MDomain value);

	/**
	 * Returns the type of the component.
	 * @return the type of the component.
	 * @see #setType(MComponentType)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMAbstractComponent_Type()
	 * @model required="true"
	 * @generated
	 */
	MComponentType getType();

	/**
	 * Sets the type of the component.
	 * @param value the new type of the component.
	 * @see #getType()
	 * @generated
	 */
	void setType(MComponentType value);

	/**
	 * Returns the list of attributes defined by the component.
	 * @return the list of attributes defined by the component.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMAbstractComponent_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the list of abstract components inherited by the component.
	 * @return the list of abstract components inherited by the component.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMAbstractComponent_Inherits()
	 * @model
	 * @generated
	 */
	EList<MAbstractComponent> getInherits();

	/**
	 * Returns the list of external ports defined by the component.
	 * @return the list of external ports defined by the component.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMAbstractComponent_ExternalPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPort> getExternalPorts();

}