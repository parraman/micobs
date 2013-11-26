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
package es.uah.aut.srg.micobs.util;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * Public interface of parameter assignment resolver objects.
 *
 */
public interface IParameterAssignmentResolver {

	/**
	 * Returns the original parameter whose value is being assigned or
	 * <code>null</code> if it is being used in a single expression.
	 * @return the original parameter whose value is being assigned.
	 */
	public MParameter getParameter();
	
	/**
	 * Returns the expression that assigns the value to a given parameter.
	 * If the returned value is <code>null</code>, it means that the value
	 * of the parameter has not being assigned and thus the default value
	 * should be used.
	 * @param parameter the parameter from which the assignment expression is
	 * 				    to be obtained.
	 * @return the expression that assigns the value to the parameter or
	 * 		   <code>null</code> if the parameter has been left unassigned.
	 */
	public MParameterValueExpression getAssignmentExpression(MParameter parameter);
	
}
