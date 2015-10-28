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
 * A representation of a component type instance. These objects are used to
 * define simple restrictions on the instantiation of components. They can
 * be included on the definition of both domains and components. The
 * restrictions are defined in terms of the lower and upper bounds on the
 * number components of a given type that can be instantiated.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance#getLowerBound <em>LowerBound</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance#getUpperBound <em>UpperBound</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMComponentTypeInstance()
 * @model abstract="true"
 * @generated
 */
public interface MComponentTypeInstance extends EObject {
	/**
	 * Returns the lower limit on the number of components that can be
	 * instantiated.
	 * @return the lower limit on the component instances.
	 * @see #setLowerBound(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMComponentTypeInstance_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getLowerBound();

	/**
	 * Sets the lower limit on the number of components that can be
	 * instantiated.
	 * @param value the new lower limit on the component instances.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(MParameterValueExpression value);

	/**
	 * Returns the upper limit on the number of components that can be
	 * instantiated.
	 * @return the upper limit on the component instances.
	 * @see #setUpperBound(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMComponentTypeInstance_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getUpperBound();

	/**
	 * Sets the upper limit on the number of components that can be
	 * instantiated.
	 * @param value the new upper limit on the component instances.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(MParameterValueExpression value);

}