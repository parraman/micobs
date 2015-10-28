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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;

/**
 * A representation of a component instance deployed on an MCAD model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance#getComponent <em>Component</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMComponentInstance()
 * @model
 * @generated
 */
public interface MComponentInstance extends MCommonReferenceableObj {
	/**
	 * Returns the component that is instantiated.
	 * @return the component that is instantiated.
	 * @see #setComponent(MComponent)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMComponentInstance_Component()
	 * @model required="true"
	 * @generated
	 */
	MComponent getComponent();

	/**
	 * Sets the component that will be instantiated.
	 * @param value the new component reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(MComponent value);

	/**
	 * Returns the list of attribute value assignments of the instance. These
	 * attributes are those of the component that is being instantiated.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMComponentInstance_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}