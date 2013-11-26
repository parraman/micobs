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
package es.uah.aut.srg.micobs.pdl;

import es.uah.aut.srg.micobs.common.MParameterRange;

/**
 * A representation of a default value assignment for an operating system
 * real parameter for a given platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMRealParamOSSPSwitchCase()
 * @model
 * @generated
 */
public interface MRealParamOSSPSwitchCase extends MParameterOSSPSwitchCase {
	/**
	 * Returns the {@link MParameterRange} object representing the range
	 * of possible valid values that the parameter can take. If no range
	 * has been defined, the method returns <code>null</code>
	 * @return the {@link MParameterRange} object representing the range
	 * of possible valid values that the parameter can take or <code>null</code>
	 * if no range has been set.
	 * @see #setRange(MParameterRange)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMRealParamOSSPSwitchCase_Range()
	 * @model containment="true"
	 * @generated
	 */
	MParameterRange getRange();

	/**
	 * Sets the {@link MParameterRange} object representing the range
	 * of possible valid values that the parameter can take.
	 * @param value the new {@link MParameterRange} object representing the range
	 * of possible valid values that the parameter can take.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(MParameterRange value);

}