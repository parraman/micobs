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
 * MICOBS common package parametric referencing element class. Elements of
 * this class reference another two elements: a main element and a parameter
 * element. It is used to make a model element depend on another one using
 * a second model as a reference parameter.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement#getReferencedElement <em>ReferencedElement</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement#getParameterElement <em>ParameterElement</em>}</li>
 * </ul>
 * </p>
 * @see es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageParametricReferencingElement()
 * @model
 * @generated
 */
public interface MCommonPackageParametricReferencingElement extends MCommonPackageElement {
	/**
	 * Returns the model element on which this elements depends.
	 * @return the model element on which this elements depends.
	 * @see #setReferencedElement(MCommonPackageElement)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageParametricReferencingElement_ReferencedElement()
	 * @model required="true"
	 * @generated
	 */
	MCommonPackageElement getReferencedElement();

	/**
	 * Sets the reference to the model element on which this element depends.
	 * @param value the new value of the reference to the model element on which this element depends.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(MCommonPackageElement value);

	/**
	 * Returns the element that parameterizes the main reference.
	 * @return the element that parameterizes the main reference.
	 * @see #setParameterElement(MCommonPackageElement)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageParametricReferencingElement_ParameterElement()
	 * @model required="true"
	 * @generated
	 */
	MCommonPackageElement getParameterElement();

	/**
	 * Sets the element that parameterizes the main reference.
	 * @param value the new element that parameterizes the main reference.
	 * @see #getParameterElement()
	 * @generated
	 */
	void setParameterElement(MCommonPackageElement value);

}
