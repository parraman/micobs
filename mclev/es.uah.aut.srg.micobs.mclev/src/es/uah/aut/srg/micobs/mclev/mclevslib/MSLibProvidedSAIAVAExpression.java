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
package es.uah.aut.srg.micobs.mclev.mclevslib;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of a service library provided service access interface
 * (SAI) attribute value assignment that uses a single expression to
 * define the value.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMSLibProvidedSAIAVAExpression()
 * @model
 * @generated
 */
public interface MSLibProvidedSAIAVAExpression extends MSLibProvidedSAIAVA {
	/**
	 * Returns the expression that represents the value that is being
	 * assigned to the attribute.
	 * @return the expression of the value of the attribute.
	 * @see #setAttributeValue(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMSLibProvidedSAIAVAExpression_AttributeValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getAttributeValue();

	/**
	 * Sets the expression that represents the value that is being
	 * assigned to the attribute.
	 * @param value the new expression of the value of the parameter.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(MParameterValueExpression value);

}