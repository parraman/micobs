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
 * A representation of a generic parameter value assignment.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueAssignment#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueAssignment()
 * @model abstract="true"
 * @generated
 */
public interface MParameterValueAssignment extends EObject {
	
	/**
	 * Returns the parameter whose value is being assigned.
	 * @return the reference to the parameter.
	 * @see #setParameter(MParameter)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueAssignment_Parameter()
	 * @model required="true"
	 * @generated
	 */
	MParameter getParameter();

	/**
	 * Sets the reference to the parameter whose value is being assigned.
	 * @param value the new parameter reference..
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(MParameter value);

}