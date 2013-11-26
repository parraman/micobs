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
import org.eclipse.emf.ecore.EObject;

/**
 * MICOBS common package class. Represents package file that stores one model
 * element. Each type of file defined within the framework must inherit from
 * this generic class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageFile#getPackage <em>Package</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageFile#getImports <em>Imports</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageFile#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageFile()
 * @model abstract="true"
 * @generated
 */
public interface MCommonPackageFile extends EObject {
	/**
	 * Returns the package to which this file belongs.
	 * @return the package to which this file belongs.
	 * @see #setPackage(MCommonPackage)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageFile_Package()
	 * @model required="true"
	 * @generated
	 */
	MCommonPackage getPackage();

	/**
	 * Sets the package to which this file belongs.
	 * @param value the new package attached to this file.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(MCommonPackage value);

	/**
	 * Returns the list packages imported by the file. The list of imported
	 * packages will be used to resolve the references between model elements.
	 * @return the list of imported packages.
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageFile_Imports()
	 * @model
	 * @generated
	 */
	EList<MCommonPackage> getImports();

	/**
	 * Returns the element defined in the file.
	 * @return the element defined in the file.
	 * @see #setElement(MCommonPackageElement)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageFile_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MCommonPackageElement getElement();

	/**
	 * Sets the element defined in the file.
	 * @param value the new element defined in the file.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(MCommonPackageElement value);

}
