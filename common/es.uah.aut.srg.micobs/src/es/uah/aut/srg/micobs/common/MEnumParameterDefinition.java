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

import org.eclipse.emf.common.util.EList;

/**
 * A representation of an enumerated parameter definition. These objects define
 * the set of possible literal values that can be taken by the enumerated
 * parameters attached to them.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MEnumParameterDefinition#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParameterDefinition()
 * @model
 * @generated
 */
public interface MEnumParameterDefinition extends MParameter {
	/**
	 * Returns the list of possible literal values that can be taken by an
	 * enumerated parameter attached to it.
	 * @return the list of possible literal values that can be taken by an
	 * enumerated parameter attached to it.
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParameterDefinition_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MEnumParameterLiteral> getLiterals();

}
