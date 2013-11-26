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


/**
 * A representation of a literal value defined as part of a value assignment
 * expression. This abstract class is extended depending on the type of literal
 * value:
 * 
 * <ul>
 * 		<li>boolean: {@link MParameterValueBooleanLiteral}.</li>
 * 		<li>string: {@link MParameterValueStringLiteral}.</li>
 * 		<li>integer: {@link MParameterValueIntegerLiteral}.</li>
 * 		<li>real: {@link MParameterValueRealLiteral}.</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueLiteral()
 * @model abstract="true"
 * @generated
 */
public interface MParameterValueLiteral extends MParameterValue {
}
