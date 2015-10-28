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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;

/**
 * A representation of a component instance defined on an MCLEV flat deployment
 * model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance#getComponent <em>Component</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatComponentInstance()
 * @model
 * @generated
 */
public interface MFlatComponentInstance extends MCommonReferenceableObj {
	/**
	 * Returns the component that is being deployed.
	 * @return the deployed component.
	 * @see #setComponent(MComponent)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatComponentInstance_Component()
	 * @model required="true"
	 * @generated
	 */
	MComponent getComponent();

	/**
	 * Sets the component that is to be deployed.
	 * @param value the new deployed component.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(MComponent value);

	/**
	 * Returns the list of value assignments to the attributes defined by the
	 * component.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatComponentInstance_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}