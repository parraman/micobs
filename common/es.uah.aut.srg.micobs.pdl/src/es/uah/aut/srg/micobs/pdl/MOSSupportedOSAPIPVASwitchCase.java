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

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of an operating system provided OSAPI parameter
 * value assignment that depends on a given supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedOSAPIPVASwitchCase()
 * @model
 * @generated
 */
public interface MOSSupportedOSAPIPVASwitchCase extends EObject {
	/**
	 * Returns the attached supported platform for which the
	 * value of the parameter will be assigned.
	 * @return the attached supported platform.
	 * @see #setPlatform(MOSSupportedPlatform)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedOSAPIPVASwitchCase_Platform()
	 * @model required="true"
	 * @generated
	 */
	MOSSupportedPlatform getPlatform();

	/**
	 * Sets the attached supported platform for which the
	 * value of the parameter will be assigned.
	 * @param value the new attached supported platform.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(MOSSupportedPlatform value);

	/**
	 * Returns the expression that represents the value that is being
	 * assigned to the parameter.
	 * @return the expression of the value of the parameter.
	 * @see #setParameterValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedOSAPIPVASwitchCase_ParameterValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getParameterValue();

	/**
	 * Sets the expression that represents the value that is being
	 * assigned to the parameter.
	 * @param value the new expression of the value of the parameter.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(MParameterValueExpression value);

}