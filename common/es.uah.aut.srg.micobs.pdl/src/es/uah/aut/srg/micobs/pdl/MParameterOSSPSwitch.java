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
package es.uah.aut.srg.micobs.pdl;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of an abstract parameter defined by an operating system
 * whose default value is set depending on the different supported platforms.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMParameterOSSPSwitch()
 * @model abstract="true"
 * @generated
 */
public interface MParameterOSSPSwitch extends MParameter {
	/**
	 * Returns the list of cases with the default values assigned for the
	 * different supported platforms.
	 * @return the list of cases.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMParameterOSSPSwitch_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MParameterOSSPSwitchCase> getCases();

}
