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


/**
 * An abstract representation of an enumerated parameter. An enumerated
 * parameter is attached to an {@link MEnumParameterDefinition}, which
 * defines the list of possible literals that can be used as values of the
 * parameter.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MEnumParameter#getEnumDefinition <em>EnumDefinition</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MEnumParameter#getDefaultValue <em>DefaultValue</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParameter()
 * @model
 * @generated
 */
public interface MEnumParameter extends MParameter {
	/**
	 * Returns the enumerated definition attached to the parameter.
	 * @return the value of the '<em>EnumDefinition</em>' reference.
	 * @see #setEnumDefinition(MEnumParameterDefinition)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParameter_EnumDefinition()
	 * @model required="true"
	 * @generated
	 */
	MEnumParameterDefinition getEnumDefinition();

	/**
	 * Sets the enumerated definition attached to the parameter.
	 * @param value the new value of the '<em>EnumDefinition</em>' reference.
	 * @see #getEnumDefinition()
	 * @generated
	 */
	void setEnumDefinition(MEnumParameterDefinition value);

}
