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
package es.uah.aut.srg.micobs.mclev.mcleviface;

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
 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifaceFactory
 * @model kind="package"
 * @generated
 */
public interface mclevifacePackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mcleviface";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mcleviface";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevifacePackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mcleviface.impl.mclevifacePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageElementImpl <em>MMCLEVIFACEPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.mclevifacePackageImpl#getMMCLEVIFACEPackageElement()
	 * @generated
	 */
	int MMCLEVIFACE_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVIFACEPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MInterfaceImpl <em>MInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.MInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.mclevifacePackageImpl#getMInterface()
	 * @generated
	 */
	int MINTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE__VERSION = MMCLEVIFACE_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE__NAME = MMCLEVIFACE_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE__URI = MMCLEVIFACE_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE__EXTENDS = MMCLEVIFACE_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE__DOMAIN = MMCLEVIFACE_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE__TYPE = MMCLEVIFACE_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_FEATURE_COUNT = MMCLEVIFACE_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageFileImpl <em>MMCLEVIFACEPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.mclevifacePackageImpl#getMMCLEVIFACEPackageFile()
	 * @generated
	 */
	int MMCLEVIFACE_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVIFACEPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIFACE_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface <em>MInterface</em>}'.
	 * @return the meta object for class '<em>MInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MInterface
	 * @generated
	 */
	EClass getMInterface();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getExtends()
	 * @see #getMInterface()
	 * @generated
	 */
	EReference getMInterface_Extends();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getDomain <em>Domain</em>}'.
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getDomain()
	 * @see #getMInterface()
	 * @generated
	 */
	EReference getMInterface_Domain();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getType()
	 * @see #getMInterface()
	 * @generated
	 */
	EReference getMInterface_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile <em>MMCLEVIFACEPackageFile</em>}'.
	 * @return the meta object for class '<em>MMCLEVIFACEPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile
	 * @generated
	 */
	EClass getMMCLEVIFACEPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageElement <em>MMCLEVIFACEPackageElement</em>}'.
	 * @return the meta object for class '<em>MMCLEVIFACEPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageElement
	 * @generated
	 */
	EClass getMMCLEVIFACEPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevifaceFactory getmclevifaceFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MInterfaceImpl <em>MInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.MInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.mclevifacePackageImpl#getMInterface()
		 * @generated
		 */
		EClass MINTERFACE = eINSTANCE.getMInterface();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINTERFACE__EXTENDS = eINSTANCE.getMInterface_Extends();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINTERFACE__DOMAIN = eINSTANCE.getMInterface_Domain();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINTERFACE__TYPE = eINSTANCE.getMInterface_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageFileImpl <em>MMCLEVIFACEPackageFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.mclevifacePackageImpl#getMMCLEVIFACEPackageFile()
		 * @generated
		 */
		EClass MMCLEVIFACE_PACKAGE_FILE = eINSTANCE.getMMCLEVIFACEPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageElementImpl <em>MMCLEVIFACEPackageElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.MMCLEVIFACEPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mcleviface.impl.mclevifacePackageImpl#getMMCLEVIFACEPackageElement()
		 * @generated
		 */
		EClass MMCLEVIFACE_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVIFACEPackageElement();

	}

} //mclevifacePackage
