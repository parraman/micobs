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
 * MICOBS common package referencing element class. Model elements that implement
 * this interface depend or reference another model element. The referenced element
 * may be of the same library of the main model or of another library.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageReferencingElement()
 * @model abstract="true"
 * @generated
 */
public interface MCommonPackageReferencingElement extends MCommonPackageElement {
	/**
	 * Returns the reference of the model on which this element depends.
	 * @return the reference of the model on which this element depends.
	 * @see #setReferencedElement(MCommonPackageElement)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageReferencingElement_ReferencedElement()
	 * @model required="true"
	 * @generated
	 */
	MCommonPackageElement getReferencedElement();

	/**
	 * Sets the value of the reference of the model on which this element depends.
	 * @param value the new value of the reference of the model on which this element depends.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(MCommonPackageElement value);

}
