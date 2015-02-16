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

/**
 * A representation of a software package provided interface parameter
 * value assignment that uses a single expression to define the value.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterfacePVAExpression()
 * @model
 * @generated
 */
public interface MSwPackageProvidedInterfacePVAExpression extends MSwPackageProvidedInterfacePVA {
	/**
	 * Returns the expression that represents the value that is being
	 * assigned to the parameter.
	 * @return the expression of the value of the parameter.
	 * @see #setParameterValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterfacePVAExpression_ParameterValue()
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