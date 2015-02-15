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
 * A representation of a reference to an object that is part of a parameter value
 * expression.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueRefObject#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueRefObject()
 * @model
 * @generated
 */
public interface MParameterValueRefObject extends MParameterValue {
	/**
	 * Returns the referenced object.
	 * @return the referenced object.
	 * @see #setObject(MCommonReferenceableObj)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueRefObject_Object()
	 * @model required="true"
	 * @generated
	 */
	MCommonReferenceableObj getObject();

	/**
	 * Sets the referenced object.
	 * @param value the new referenced object.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(MCommonReferenceableObj value);

}