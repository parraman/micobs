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
package es.uah.aut.srg.micobs.mesp.mespctool;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespctool.mespctoolFactory
 * @model kind="package"
 * @generated
 */
public interface mespctoolPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mespctool";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mespctool";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mespctoolPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mespctool.impl.mespctoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageElementImpl <em>MMESPCTOOLPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.mespctoolPackageImpl#getMMESPCTOOLPackageElement()
	 * @generated
	 */
	int MMESPCTOOL_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMESPCTOOLPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MConstructionToolImpl <em>MConstructionTool</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.MConstructionToolImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.mespctoolPackageImpl#getMConstructionTool()
	 * @generated
	 */
	int MCONSTRUCTION_TOOL = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTION_TOOL__VERSION = MMESPCTOOL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTION_TOOL__NAME = MMESPCTOOL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTION_TOOL__URI = MMESPCTOOL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTION_TOOL__EXTENDS = MMESPCTOOL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SupportedLanguages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES = MMESPCTOOL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MConstructionTool</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTION_TOOL_FEATURE_COUNT = MMESPCTOOL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageFileImpl <em>MMESPCTOOLPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.mespctoolPackageImpl#getMMESPCTOOLPackageFile()
	 * @generated
	 */
	int MMESPCTOOL_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMESPCTOOLPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPCTOOL_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool <em>MConstructionTool</em>}'.
	 * @return the meta object for class '<em>MConstructionTool</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool
	 * @generated
	 */
	EClass getMConstructionTool();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool#getExtends()
	 * @see #getMConstructionTool()
	 * @generated
	 */
	EReference getMConstructionTool_Extends();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool#getSupportedLanguages <em>SupportedLanguages</em>}'.
	 * @return the meta object for the reference list '<em>SupportedLanguages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool#getSupportedLanguages()
	 * @see #getMConstructionTool()
	 * @generated
	 */
	EReference getMConstructionTool_SupportedLanguages();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageFile <em>MMESPCTOOLPackageFile</em>}'.
	 * @return the meta object for class '<em>MMESPCTOOLPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageFile
	 * @generated
	 */
	EClass getMMESPCTOOLPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageElement <em>MMESPCTOOLPackageElement</em>}'.
	 * @return the meta object for class '<em>MMESPCTOOLPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageElement
	 * @generated
	 */
	EClass getMMESPCTOOLPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mespctoolFactory getmespctoolFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MConstructionToolImpl <em>MConstructionTool</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.MConstructionToolImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.mespctoolPackageImpl#getMConstructionTool()
		 * @generated
		 */
		EClass MCONSTRUCTION_TOOL = eINSTANCE.getMConstructionTool();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCONSTRUCTION_TOOL__EXTENDS = eINSTANCE.getMConstructionTool_Extends();

		/**
		 * The meta object literal for the '<em><b>SupportedLanguages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES = eINSTANCE.getMConstructionTool_SupportedLanguages();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageFileImpl <em>MMESPCTOOLPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.mespctoolPackageImpl#getMMESPCTOOLPackageFile()
		 * @generated
		 */
		EClass MMESPCTOOL_PACKAGE_FILE = eINSTANCE.getMMESPCTOOLPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageElementImpl <em>MMESPCTOOLPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.MMESPCTOOLPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespctool.impl.mespctoolPackageImpl#getMMESPCTOOLPackageElement()
		 * @generated
		 */
		EClass MMESPCTOOL_PACKAGE_ELEMENT = eINSTANCE.getMMESPCTOOLPackageElement();

	}

} //mespctoolPackage
