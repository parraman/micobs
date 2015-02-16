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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage
 * @generated
 */
public interface pdllibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	pdllibraryFactory eINSTANCE = es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MPDLLibrary</em>'.
	 * @return a new object of class '<em>MPDLLibrary</em>'.
	 * @generated
	 */
	MPDLLibrary createMPDLLibrary();

	/**
	 * Returns a new object of class '<em>MPDLPackage</em>'.
	 * @return a new object of class '<em>MPDLPackage</em>'.
	 * @generated
	 */
	MPDLPackage createMPDLPackage();

	/**
	 * Returns a new object of class '<em>MPDLItemOperatingSystemAPI</em>'.
	 * @return a new object of class '<em>MPDLItemOperatingSystemAPI</em>'.
	 * @generated
	 */
	MPDLItemOperatingSystemAPI createMPDLItemOperatingSystemAPI();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemOperatingSystemAPI</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemOperatingSystemAPI</em>'.
	 * @generated
	 */
	MPDLVersionedItemOperatingSystemAPI createMPDLVersionedItemOperatingSystemAPI();

	/**
	 * Returns a new object of class '<em>MPDLItemOperatingSystem</em>'.
	 * @return a new object of class '<em>MPDLItemOperatingSystem</em>'.
	 * @generated
	 */
	MPDLItemOperatingSystem createMPDLItemOperatingSystem();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemOperatingSystem</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemOperatingSystem</em>'.
	 * @generated
	 */
	MPDLVersionedItemOperatingSystem createMPDLVersionedItemOperatingSystem();

	/**
	 * Returns a new object of class '<em>MPDLItemArchitecture</em>'.
	 * @return a new object of class '<em>MPDLItemArchitecture</em>'.
	 * @generated
	 */
	MPDLItemArchitecture createMPDLItemArchitecture();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemArchitecture</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemArchitecture</em>'.
	 * @generated
	 */
	MPDLVersionedItemArchitecture createMPDLVersionedItemArchitecture();

	/**
	 * Returns a new object of class '<em>MPDLItemMicroprocessor</em>'.
	 * @return a new object of class '<em>MPDLItemMicroprocessor</em>'.
	 * @generated
	 */
	MPDLItemMicroprocessor createMPDLItemMicroprocessor();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemMicroprocessor</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemMicroprocessor</em>'.
	 * @generated
	 */
	MPDLVersionedItemMicroprocessor createMPDLVersionedItemMicroprocessor();

	/**
	 * Returns a new object of class '<em>MPDLItemBoard</em>'.
	 * @return a new object of class '<em>MPDLItemBoard</em>'.
	 * @generated
	 */
	MPDLItemBoard createMPDLItemBoard();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemBoard</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemBoard</em>'.
	 * @generated
	 */
	MPDLVersionedItemBoard createMPDLVersionedItemBoard();

	/**
	 * Returns a new object of class '<em>MPDLItemPlatform</em>'.
	 * @return a new object of class '<em>MPDLItemPlatform</em>'.
	 * @generated
	 */
	MPDLItemPlatform createMPDLItemPlatform();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemPlatform</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemPlatform</em>'.
	 * @generated
	 */
	MPDLVersionedItemPlatform createMPDLVersionedItemPlatform();

	/**
	 * Returns a new object of class '<em>MPDLItemCompiler</em>'.
	 * @return a new object of class '<em>MPDLItemCompiler</em>'.
	 * @generated
	 */
	MPDLItemCompiler createMPDLItemCompiler();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemCompiler</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemCompiler</em>'.
	 * @generated
	 */
	MPDLVersionedItemCompiler createMPDLVersionedItemCompiler();

	/**
	 * Returns a new object of class '<em>MPDLItemDevice</em>'.
	 * @return a new object of class '<em>MPDLItemDevice</em>'.
	 * @generated
	 */
	MPDLItemDevice createMPDLItemDevice();

	/**
	 * Returns a new object of class '<em>MPDLVersionedItemDevice</em>'.
	 * @return a new object of class '<em>MPDLVersionedItemDevice</em>'.
	 * @generated
	 */
	MPDLVersionedItemDevice createMPDLVersionedItemDevice();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	pdllibraryPackage getpdllibraryPackage();

}
