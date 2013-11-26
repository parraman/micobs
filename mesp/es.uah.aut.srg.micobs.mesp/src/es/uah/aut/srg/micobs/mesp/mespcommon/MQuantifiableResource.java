/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mesp.mespcommon;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of a quantifiable resource. When defined, this kind of 
 * resources shall state the upper and lower bounds of the amount of
 * resource that a software package can require.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage#getMQuantifiableResource()
 * @model
 * @generated
 */
public interface MQuantifiableResource extends MProvidedResource {
	/**
	 * Returns the lower bound of the amount of resource that a
	 * software package can require.
	 * @return the lower bound of the amount of resource that a
	 * software package can require.
	 * @see #setLowerBound(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage#getMQuantifiableResource_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getLowerBound();

	/**
	 * Sets the lower bound of the amount of resource that a
	 * software package can require.
	 * @param value the new lower bound of the amount of resource that a
	 * software package can require.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(MParameterValueExpression value);

	/**
	 * Returns the upper bound of the amount of resource that a
	 * software package can require.
	 * @return the upper bound of the amount of resource that a
	 * software package can require.
	 * @see #setUpperBound(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage#getMQuantifiableResource_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getUpperBound();

	/**
	 * Sets the upper bound of the amount of resource that a
	 * software package can require.
	 * @param value the new upper bound of the amount of resource that a
	 * software package can require.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(MParameterValueExpression value);

}
