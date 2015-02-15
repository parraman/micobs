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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the definition of a range of possible values of a
 * parameter. Objects of this class are used in the definition of conditional
 * data that is valid or not depending on the values of a given parameter or a
 * set of parameters. The class provides a reference to the parameter and the
 * possibility of defining a fixed value or a range of possible values for which
 * the dependent data would be valid.
 * 
 * The range can be defined as one particular fixed value or as an actual
 * range of parameters. Only the numeric parameters (i.e., integer or real) can
 * define a range of valid values.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueRange#getParameter <em>Parameter</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueRange#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueRange#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueRange()
 * @model
 * @generated
 */
public interface MParameterValueRange extends EObject {
	/**
	 * Returns the parameter on which the conditional data depends.
	 * @return the parameter on which the conditional data depends.
	 * @see #setParameter(MParameter)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueRange_Parameter()
	 * @model required="true"
	 * @generated
	 */
	MParameter getParameter();

	/**
	 * Sets the parameter on which the conditional data depends.
	 * @param value the new parameter on which the conditional data depends.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(MParameter value);

	/**
	 * Returns the fixed value of the parameter for which the conditional
	 * data is valid. If an actual range of valid values is defined, this
	 * method would return <code>null</code>.
	 * @return the fixed value of the parameter for which the conditional
	 *         data is valid or <code>null</code> if a range is being defined.
	 * @see #setParameterValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueRange_ParameterValue()
	 * @model containment="true"
	 * @generated
	 */
	MParameterValueExpression getParameterValue();

	/**
	 * Sets the fixed value of the parameter for which the conditional
	 * data is valid.
	 * @param value the new fixed value of the parameter for which the
	 * conditional data is valid or <code>null</code> if a range is being
	 * defined.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(MParameterValueExpression value);

	/**
	 * Returns the range of valid values of the parameter for which the
	 * conditional data is valid. If a fixed parameter value is defined
	 * instead of a numerical range, this method would return <code>null</code>.
	 * @return the range of valid values of the parameter for which the
	 * 		   conditional data is valid.
	 * @see #setRange(MParameterRange)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueRange_Range()
	 * @model containment="true"
	 * @generated
	 */
	MParameterRange getRange();

	/**
	 * Sets the range of valid values of the parameter for which the
	 * conditional data is valid.
	 * @param value the new range of valid values of the parameter for which the
	 * 				conditional data is valid.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(MParameterRange value);

}
