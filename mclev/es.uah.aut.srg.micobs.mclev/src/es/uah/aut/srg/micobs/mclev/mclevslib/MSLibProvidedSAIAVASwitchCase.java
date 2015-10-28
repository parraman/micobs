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

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of a service library provided SAI attribute
 * value assignment that depends on a given supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMSLibProvidedSAIAVASwitchCase()
 * @model
 * @generated
 */
public interface MSLibProvidedSAIAVASwitchCase extends EObject {
	/**
	 * Returns the attached supported platform for which the
	 * value of the attribute will be assigned.
	 * @return the attached supported platform.
	 * @see #setPlatform(MServiceLibrarySupportedPlatform)
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMSLibProvidedSAIAVASwitchCase_Platform()
	 * @model required="true"
	 * @generated
	 */
	MServiceLibrarySupportedPlatform getPlatform();

	/**
	 * Sets the attached supported platform for which the
	 * value of the attribute will be assigned.
	 * @param value the new attached supported platform.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(MServiceLibrarySupportedPlatform value);

	/**
	 * Returns the expression that represents the value that is being
	 * assigned to the attribute.
	 * @return the expression of the value of the attribute.
	 * @see #setAttributeValue(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMSLibProvidedSAIAVASwitchCase_AttributeValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getAttributeValue();

	/**
	 * Sets the expression that represents the value that is being
	 * assigned to the attribute.
	 * @param value the new expression of the value of the attribute.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(MParameterValueExpression value);

}