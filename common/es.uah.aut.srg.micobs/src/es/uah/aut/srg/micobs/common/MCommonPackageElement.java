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
 * MICOBS common element class. Represents an element model. Each type of
 * model element defined within the framework must inherit from this generic
 * class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageElement#getVersion <em>Version</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageElement#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageElement#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageElement()
 * @model abstract="true"
 * @generated
 */
public interface MCommonPackageElement extends EObject {
	/**
	 * Returns the version of the element.
	 * @return the version of the element.
	 * @see #setVersion(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageElement_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the version of the element.
	 * @param value the new value of the version of the element.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the name of the element.
	 * @return the name of the element.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the name of the element.
	 * @param value the new name of the element.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the URI of the element. This attribute is volatile, and it is
	 * generated as a concatenation of the URI of the package to which the element
	 * is ascribed followed by a dot '.' and the name of the element.
	 * E.g. es.uah.aut.srg.micobs.common.ElementName.
	 * 
	 * @return the URI of the element.
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageElement_Uri()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getUri();

}
