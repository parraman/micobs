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

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of a default value assignment for an operating system
 * abstract parameter for a given platform.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMParameterOSSPSwitchCase()
 * @model abstract="true"
 * @generated
 */
public interface MParameterOSSPSwitchCase extends EObject {
	/**
	 * Returns the supported platform for which the default value is being
	 * defined.
	 * @return the supported platform.
	 * @see #setPlatform(MOSSupportedPlatform)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMParameterOSSPSwitchCase_Platform()
	 * @model required="true"
	 * @generated
	 */
	MOSSupportedPlatform getPlatform();

	/**
	 * Sets the supported platform for which the default value is being
	 * defined.
	 * @param value the new reference to the supported platform.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(MOSSupportedPlatform value);

	/**
	 * Returns the default value of the parameter for the given platform.
	 * @return the default value of the parameter.
	 * @see #setDefaultValue(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMParameterOSSPSwitchCase_DefaultValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getDefaultValue();

	/**
	 * Sets the default value of the parameter for the given platform.
	 * @param value the new default value of the parameter.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(MParameterValueExpression value);

}