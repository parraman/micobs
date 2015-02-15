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
 * The generic MICOBS parameter class. The rest of the classes
 * representing the different parameter types inherit from this
 * one.
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameter()
 * @model abstract="true"
 * @generated
 */
public interface MParameter extends MCommonReferenceableObj {

	/**
	 * Returns <code>true</code> if the parameter is constant. If it is
	 * constant, then the default value given to the parameter cannot be
	 * later modified.
	 * @return <code>true</code> if the parameter is constant, ]
	 * <code>false</code> otherwise.
	 * @see #setConstant(boolean)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameter_Constant()
	 * @model required="true"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the constant attribute of the parameter. If <code>true</code>
	 * the parameter is set to be constant and the default value cannot
	 * be later modified.
	 * @param value the new value of the constant attribute of the parameter.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);
}