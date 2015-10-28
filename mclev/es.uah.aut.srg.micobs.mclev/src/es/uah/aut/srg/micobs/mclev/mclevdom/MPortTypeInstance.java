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

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of a port type instance. These objects are used to
 * define simple restrictions on the instantiation of ports. The
 * restrictions are defined in terms of the lower and upper bounds on the
 * number ports of a given type that can be instantiated.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getPortType <em>Port Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortTypeInstance()
 * @model abstract="true"
 * @generated
 */
public interface MPortTypeInstance extends EObject {
	/**
	 * Returns the type of port to which the instance refers.
	 * @return the port type.
	 * @see #setPortType(MPortType)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortTypeInstance_PortType()
	 * @model required="true"
	 * @generated
	 */
	MPortType getPortType();

	/**
	 * Sets the type of port to which the instance refers.
	 * @param value the new value of port type.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(MPortType value);

	/**
	 * Returns the lower limit on the number of ports that can be
	 * instantiated.
	 * @return the lower limit on the port instances.
	 * @see #setLowerBound(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortTypeInstance_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getLowerBound();

	/**
	 * Sets the lower limit on the number of ports that can be
	 * instantiated.
	 * @param value the new lower limit on the port instances.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(MParameterValueExpression value);

	/**
	 * Returns the upper limit on the number of ports that can be
	 * instantiated.
	 * @return the upper limit on the port instances.
	 * @see #setUpperBound(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMPortTypeInstance_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getUpperBound();

	/**
	 * Sets the upper limit on the number of ports that can be
	 * instantiated.
	 * @param value the new upper limit on the port instances.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(MParameterValueExpression value);

}