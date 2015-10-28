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
package es.uah.aut.srg.micobs.mclev.mclevimap;

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
 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapFactory
 * @model kind="package"
 * @generated
 */
public interface mclevimapPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevimap";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mclevimap";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevimapPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageElementImpl <em>MMCLEVIMAPPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapPackageImpl#getMMCLEVIMAPPackageElement()
	 * @generated
	 */
	int MMCLEVIMAP_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVIMAPPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MInterfaceMappingImpl <em>MInterfaceMapping</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.MInterfaceMappingImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapPackageImpl#getMInterfaceMapping()
	 * @generated
	 */
	int MINTERFACE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_MAPPING__VERSION = MMCLEVIMAP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_MAPPING__NAME = MMCLEVIMAP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_MAPPING__URI = MMCLEVIMAP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_MAPPING__DOMAIN = MMCLEVIMAP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_MAPPING__TYPE = MMCLEVIMAP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_MAPPING__INTERFACES = MMCLEVIMAP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MInterfaceMapping</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_MAPPING_FEATURE_COUNT = MMCLEVIMAP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageFileImpl <em>MMCLEVIMAPPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapPackageImpl#getMMCLEVIMAPPackageFile()
	 * @generated
	 */
	int MMCLEVIMAP_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVIMAPPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVIMAP_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping <em>MInterfaceMapping</em>}'.
	 * @return the meta object for class '<em>MInterfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping
	 * @generated
	 */
	EClass getMInterfaceMapping();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getDomain <em>Domain</em>}'.
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getDomain()
	 * @see #getMInterfaceMapping()
	 * @generated
	 */
	EReference getMInterfaceMapping_Domain();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getType()
	 * @see #getMInterfaceMapping()
	 * @generated
	 */
	EReference getMInterfaceMapping_Type();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getInterfaces <em>Interfaces</em>}'.
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getInterfaces()
	 * @see #getMInterfaceMapping()
	 * @generated
	 */
	EReference getMInterfaceMapping_Interfaces();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageFile <em>MMCLEVIMAPPackageFile</em>}'.
	 * @return the meta object for class '<em>MMCLEVIMAPPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageFile
	 * @generated
	 */
	EClass getMMCLEVIMAPPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageElement <em>MMCLEVIMAPPackageElement</em>}'.
	 * @return the meta object for class '<em>MMCLEVIMAPPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageElement
	 * @generated
	 */
	EClass getMMCLEVIMAPPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevimapFactory getmclevimapFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MInterfaceMappingImpl <em>MInterfaceMapping</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.MInterfaceMappingImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapPackageImpl#getMInterfaceMapping()
		 * @generated
		 */
		EClass MINTERFACE_MAPPING = eINSTANCE.getMInterfaceMapping();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERFACE_MAPPING__DOMAIN = eINSTANCE.getMInterfaceMapping_Domain();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERFACE_MAPPING__TYPE = eINSTANCE.getMInterfaceMapping_Type();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * @generated
		 */
		EReference MINTERFACE_MAPPING__INTERFACES = eINSTANCE.getMInterfaceMapping_Interfaces();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageFileImpl <em>MMCLEVIMAPPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapPackageImpl#getMMCLEVIMAPPackageFile()
		 * @generated
		 */
		EClass MMCLEVIMAP_PACKAGE_FILE = eINSTANCE.getMMCLEVIMAPPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageElementImpl <em>MMCLEVIMAPPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.MMCLEVIMAPPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapPackageImpl#getMMCLEVIMAPPackageElement()
		 * @generated
		 */
		EClass MMCLEVIMAP_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVIMAPPackageElement();

	}

}