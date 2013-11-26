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
package es.uah.aut.srg.micobs.mesp.mesposswi;

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
 * @see es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiFactory
 * @model kind="package"
 * @generated
 */
public interface mesposswiPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mesposswi";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mesposswi";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mesposswiPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mesposswi.impl.mesposswiPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageElementImpl <em>MMESPOSSWIPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.mesposswiPackageImpl#getMMESPOSSWIPackageElement()
	 * @generated
	 */
	int MMESPOSSWI_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMESPOSSWIPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MOSSwInterfaceImpl <em>MOSSwInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.MOSSwInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.mesposswiPackageImpl#getMOSSwInterface()
	 * @generated
	 */
	int MOS_SW_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_INTERFACE__VERSION = MMESPOSSWI_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_INTERFACE__NAME = MMESPOSSWI_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_INTERFACE__URI = MMESPOSSWI_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>ReferencedElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_INTERFACE__REFERENCED_ELEMENT = MMESPOSSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_INTERFACE__EXTENDS = MMESPOSSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ProvidedResources</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_INTERFACE__PROVIDED_RESOURCES = MMESPOSSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MOSSwInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_INTERFACE_FEATURE_COUNT = MMESPOSSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageFileImpl <em>MMESPOSSWIPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.mesposswiPackageImpl#getMMESPOSSWIPackageFile()
	 * @generated
	 */
	int MMESPOSSWI_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMESPOSSWIPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWI_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface <em>MOSSwInterface</em>}'.
	 * @return the meta object for class '<em>MOSSwInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface
	 * @generated
	 */
	EClass getMOSSwInterface();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface#getExtends()
	 * @see #getMOSSwInterface()
	 * @generated
	 */
	EReference getMOSSwInterface_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface#getProvidedResources <em>ProvidedResources</em>}'.
	 * @return the meta object for the containment reference list '<em>ProvidedResources</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface#getProvidedResources()
	 * @see #getMOSSwInterface()
	 * @generated
	 */
	EReference getMOSSwInterface_ProvidedResources();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile <em>MMESPOSSWIPackageFile</em>}'.
	 * @return the meta object for class '<em>MMESPOSSWIPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile
	 * @generated
	 */
	EClass getMMESPOSSWIPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageElement <em>MMESPOSSWIPackageElement</em>}'.
	 * @return the meta object for class '<em>MMESPOSSWIPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageElement
	 * @generated
	 */
	EClass getMMESPOSSWIPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mesposswiFactory getmesposswiFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MOSSwInterfaceImpl <em>MOSSwInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.MOSSwInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.mesposswiPackageImpl#getMOSSwInterface()
		 * @generated
		 */
		EClass MOS_SW_INTERFACE = eINSTANCE.getMOSSwInterface();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOS_SW_INTERFACE__EXTENDS = eINSTANCE.getMOSSwInterface_Extends();

		/**
		 * The meta object literal for the '<em><b>ProvidedResources</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOS_SW_INTERFACE__PROVIDED_RESOURCES = eINSTANCE.getMOSSwInterface_ProvidedResources();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageFileImpl <em>MMESPOSSWIPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.mesposswiPackageImpl#getMMESPOSSWIPackageFile()
		 * @generated
		 */
		EClass MMESPOSSWI_PACKAGE_FILE = eINSTANCE.getMMESPOSSWIPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageElementImpl <em>MMESPOSSWIPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.MMESPOSSWIPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesposswi.impl.mesposswiPackageImpl#getMMESPOSSWIPackageElement()
		 * @generated
		 */
		EClass MMESPOSSWI_PACKAGE_ELEMENT = eINSTANCE.getMMESPOSSWIPackageElement();

	}

}
