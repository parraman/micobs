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

/**
 * A representation of a component type defined within an application-oriented
 * domain model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType#getComponentTypeInstances <em>ComponentTypeInstances</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODComponentType()
 * @model
 * @generated
 */
public interface MAODComponentType extends MComponentType {
	/**
	 * Returns the list of component types from which this type inherits.
	 * @return the list of inherited component types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODComponentType_Inherits()
	 * @model
	 * @generated
	 */
	EList<MAODComponentType> getInherits();

	/**
	 * Returns the list of component type instance definitions. These objects
	 * can be used to define the minimum and maximum number of components of
	 * a given type that can be deployed inside the components of this
	 * particular type.
	 * @return the list of component type instance definitions.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODComponentType_ComponentTypeInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<MAODComponentTypeInstance> getComponentTypeInstances();

}