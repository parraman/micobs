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

/**
 * A representation of a component instance defined as part of the internal
 * architecture of a component.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#getComponent <em>Component</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#isIsSingleton <em>Is Singleton</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentInstance()
 * @model
 * @generated
 */
public interface MInternalComponentInstance extends MCommonReferenceableObj {
	/**
	 * Returns the component that is instantiated.
	 * @return the component that is instantiated.
	 * @see #setComponent(MComponent)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentInstance_Component()
	 * @model required="true"
	 * @generated
	 */
	MComponent getComponent();

	/**
	 * Sets the component that is instantiated.
	 * @param value the new component reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(MComponent value);

	/**
	 * Returns whether this instance is singleton or not.
	 * @return true if the instance is singleton or false if it is not.
	 * @see #setIsSingleton(boolean)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentInstance_IsSingleton()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSingleton();

	/**
	 * Sets the value of the singleton flag. If the flag is set to true, then
	 * the instance will be considered singleton.
	 * @param value the new value of the singleton flag.
	 * @see #isIsSingleton()
	 * @generated
	 */
	void setIsSingleton(boolean value);

	/**
	 * Returns the list of attribute value assignments of the instance. These
	 * attributes are those of the component that is being instantiated.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMInternalComponentInstance_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}