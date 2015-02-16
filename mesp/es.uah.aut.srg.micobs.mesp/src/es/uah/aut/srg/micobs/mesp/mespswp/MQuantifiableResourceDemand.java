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
package es.uah.aut.srg.micobs.mesp.mespswp;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;

/**
 * A representation of a quantifiable resource demand.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand#getResource <em>Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand#getResourceValue <em>Resource Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMQuantifiableResourceDemand()
 * @model
 * @generated
 */
public interface MQuantifiableResourceDemand extends MResourceDemand {
	/**
	 * Returns the demanded resource.
	 * @return the demanded resource.
	 * @see #setResource(MQuantifiableResource)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMQuantifiableResourceDemand_Resource()
	 * @model required="true"
	 * @generated
	 */
	MQuantifiableResource getResource();

	/**
	 * Sets the demanded resource.
	 * @param value the new demanded resource.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(MQuantifiableResource value);

	/**
	 * Returns the expression representing the amount of resource that is
	 * being demanded.
	 * @return the amount of resource that is being demanded.
	 * @see #setResourceValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMQuantifiableResourceDemand_ResourceValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getResourceValue();

	/**
	 * Sets the expression representing the amount of resource that is
	 * being demanded.
	 * @param value the new amount of resource that is being demanded.
	 * @see #getResourceValue()
	 * @generated
	 */
	void setResourceValue(MParameterValueExpression value);

}