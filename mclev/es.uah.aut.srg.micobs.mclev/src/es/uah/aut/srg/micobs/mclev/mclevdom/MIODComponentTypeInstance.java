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


/**
 * A representation of a component type instance definition to be used on
 * implementation-oriented domains.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODComponentTypeInstance()
 * @model
 * @generated
 */
public interface MIODComponentTypeInstance extends MComponentTypeInstance {
	/**
	 * Returns the type of component to which this definition will apply.
	 * @return the type of component.
	 * @see #setComponentType(MIODAbstractComponentType)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODComponentTypeInstance_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	MIODAbstractComponentType getComponentType();

	/**
	 * Sets the type of component to which this definition will apply.
	 * @param value the new component type.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(MIODAbstractComponentType value);

}