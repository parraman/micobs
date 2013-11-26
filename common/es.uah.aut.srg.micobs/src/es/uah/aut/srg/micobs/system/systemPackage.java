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
package es.uah.aut.srg.micobs.system;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Package</b> for the model.
 * 
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * @see es.uah.aut.srg.micobs.system.systemFactory
 * @model kind="package"
 * @generated
 */
public interface systemPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/system";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	systemPackage eINSTANCE = es.uah.aut.srg.micobs.system.impl.systemPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageElementImpl <em>MSYSTEMPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageElementImpl
	 * @see es.uah.aut.srg.micobs.system.impl.systemPackageImpl#getMSYSTEMPackageElement()
	 * @generated
	 */
	int MSYSTEM_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MSYSTEMPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.impl.MLanguageImpl <em>MLanguage</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.impl.MLanguageImpl
	 * @see es.uah.aut.srg.micobs.system.impl.systemPackageImpl#getMLanguage()
	 * @generated
	 */
	int MLANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MLANGUAGE__VERSION = MSYSTEM_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MLANGUAGE__NAME = MSYSTEM_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MLANGUAGE__URI = MSYSTEM_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MLANGUAGE__EXTENDS = MSYSTEM_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MLanguage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MLANGUAGE_FEATURE_COUNT = MSYSTEM_PACKAGE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageFileImpl <em>MSYSTEMPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageFileImpl
	 * @see es.uah.aut.srg.micobs.system.impl.systemPackageImpl#getMSYSTEMPackageFile()
	 * @generated
	 */
	int MSYSTEM_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MSYSTEM Package File</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.MLanguage <em>MLanguage</em>}'.
	 * @return the meta object for class '<em>MLanguage</em>'.
	 * @see es.uah.aut.srg.micobs.system.MLanguage
	 * @generated
	 */
	EClass getMLanguage();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.system.MLanguage#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.system.MLanguage#getExtends()
	 * @see #getMLanguage()
	 * @generated
	 */
	EReference getMLanguage_Extends();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.MSYSTEMPackageFile <em>MSYSTEM Package File</em>}'.
	 * @return the meta object for class '<em>MSYSTEMPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.system.MSYSTEMPackageFile
	 * @generated
	 */
	EClass getMSYSTEMPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.MSYSTEMPackageElement <em>MSYSTEMPackageElement</em>}'.
	 * @return the meta object for class '<em>MSYSTEMPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.system.MSYSTEMPackageElement
	 * @generated
	 */
	EClass getMSYSTEMPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	systemFactory getsystemFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.impl.MLanguageImpl <em>MLanguage</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.impl.MLanguageImpl
		 * @see es.uah.aut.srg.micobs.system.impl.systemPackageImpl#getMLanguage()
		 * @generated
		 */
		EClass MLANGUAGE = eINSTANCE.getMLanguage();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MLANGUAGE__EXTENDS = eINSTANCE.getMLanguage_Extends();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageFileImpl <em>MSYSTEMPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageFileImpl
		 * @see es.uah.aut.srg.micobs.system.impl.systemPackageImpl#getMSYSTEMPackageFile()
		 * @generated
		 */
		EClass MSYSTEM_PACKAGE_FILE = eINSTANCE.getMSYSTEMPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageElementImpl <em>MSYSTEM Package Element</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.impl.MSYSTEMPackageElementImpl
		 * @see es.uah.aut.srg.micobs.system.impl.systemPackageImpl#getMSYSTEMPackageElement()
		 * @generated
		 */
		EClass MSYSTEM_PACKAGE_ELEMENT = eINSTANCE.getMSYSTEMPackageElement();

	}

}
