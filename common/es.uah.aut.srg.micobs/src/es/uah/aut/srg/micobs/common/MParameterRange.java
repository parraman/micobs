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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of a parameter range. Each one of the four types of 
 * parameter ranges, i.e., {@link MParameterCOR}, {@link MParameterOOR},
 * {@link MParameterOCR}, {@link MParameterCCR}, inherit from this
 * abstract class. The values are {@link MParameterValueAssignmentExpression}
 * objects.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterRange#getLowerValue <em>LowerValue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterRange#getUpperValue <em>UpperValue</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterRange()
 * @model abstract="true"
 * @generated
 */
public interface MParameterRange extends EObject {
	/**
	 * Returns the lower value of the parameter range.
	 * @return the lower value of the parameter range.
	 * @see #setLowerValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterRange_LowerValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getLowerValue();

	/**
	 * Sets the lower value of the parameter range.
	 * @param value the new lower value of the parameter range.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(MParameterValueExpression value);

	/**
	 * Returns the upper value of the parameter range.
	 * @return the upper value of the parameter range.
	 * @see #setUpperValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterRange_UpperValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getUpperValue();

	/**
	 * Sets the upper value of the parameter range.
	 * @param value the new upper value of the parameter range.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(MParameterValueExpression value);

}
