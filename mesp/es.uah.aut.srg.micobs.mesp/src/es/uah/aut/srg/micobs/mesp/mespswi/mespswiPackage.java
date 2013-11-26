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
package es.uah.aut.srg.micobs.mesp.mespswi;

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
 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiFactory
 * @model kind="package"
 * @generated
 */
public interface mespswiPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mespswi";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mespswi";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mespswiPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mespswi.impl.mespswiPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageElementImpl <em>MMESPSWIPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.mespswiPackageImpl#getMMESPSWIPackageElement()
	 * @generated
	 */
	int MMESPSWI_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMESPSWIPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MMESPSWIPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_ELEMENT_OPERATION_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl <em>MSwInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.mespswiPackageImpl#getMSwInterface()
	 * @generated
	 */
	int MSW_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__VERSION = MMESPSWI_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__NAME = MMESPSWI_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__URI = MMESPSWI_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__EXTENDS = MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__LANGUAGE = MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__REQUIRES = MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__PARAMETERS = MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ProvidedResources</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__PROVIDED_RESOURCES = MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>RequiredOSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE__REQUIRED_OSAPI = MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MSwInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE_FEATURE_COUNT = MMESPSWI_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>MSw Interface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_INTERFACE_OPERATION_COUNT = MMESPSWI_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageFileImpl <em>MMESPSWIPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.mespswiPackageImpl#getMMESPSWIPackageFile()
	 * @generated
	 */
	int MMESPSWI_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMESPSWIPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>MMESPSWI Package File</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPSWI_PACKAGE_FILE_OPERATION_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface <em>MSwInterface</em>}'.
	 * @return the meta object for class '<em>MSwInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface
	 * @generated
	 */
	EClass getMSwInterface();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getExtends()
	 * @see #getMSwInterface()
	 * @generated
	 */
	EReference getMSwInterface_Extends();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getLanguage <em>Language</em>}'.
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getLanguage()
	 * @see #getMSwInterface()
	 * @generated
	 */
	EReference getMSwInterface_Language();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getRequires()
	 * @see #getMSwInterface()
	 * @generated
	 */
	EReference getMSwInterface_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getParameters()
	 * @see #getMSwInterface()
	 * @generated
	 */
	EReference getMSwInterface_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getProvidedResources <em>ProvidedResources</em>}'.
	 * @return the meta object for the containment reference list '<em>ProvidedResources</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getProvidedResources()
	 * @see #getMSwInterface()
	 * @generated
	 */
	EReference getMSwInterface_ProvidedResources();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getRequiredOSAPI <em>RequiredOSAPI</em>}'.
	 * @return the meta object for the reference '<em>RequiredOSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getRequiredOSAPI()
	 * @see #getMSwInterface()
	 * @generated
	 */
	EReference getMSwInterface_RequiredOSAPI();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile <em>MMESPSWIPackageFile</em>}'.
	 * @return the meta object for class '<em>MMESPSWIPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile
	 * @generated
	 */
	EClass getMMESPSWIPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageElement <em>MMESPSWIPackageElement</em>}'.
	 * @return the meta object for class '<em>MMESPSWIPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageElement
	 * @generated
	 */
	EClass getMMESPSWIPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mespswiFactory getmespswiFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl <em>MSwInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.mespswiPackageImpl#getMSwInterface()
		 * @generated
		 */
		EClass MSW_INTERFACE = eINSTANCE.getMSwInterface();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSW_INTERFACE__EXTENDS = eINSTANCE.getMSwInterface_Extends();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_INTERFACE__LANGUAGE = eINSTANCE.getMSwInterface_Language();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSW_INTERFACE__REQUIRES = eINSTANCE.getMSwInterface_Requires();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_INTERFACE__PARAMETERS = eINSTANCE.getMSwInterface_Parameters();

		/**
		 * The meta object literal for the '<em><b>ProvidedResources</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_INTERFACE__PROVIDED_RESOURCES = eINSTANCE.getMSwInterface_ProvidedResources();

		/**
		 * The meta object literal for the '<em><b>Required OSAPI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSW_INTERFACE__REQUIRED_OSAPI = eINSTANCE.getMSwInterface_RequiredOSAPI();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageFileImpl <em>MMESPSWIPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.mespswiPackageImpl#getMMESPSWIPackageFile()
		 * @generated
		 */
		EClass MMESPSWI_PACKAGE_FILE = eINSTANCE.getMMESPSWIPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageElementImpl <em>MMESPSWIPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.MMESPSWIPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswi.impl.mespswiPackageImpl#getMMESPSWIPackageElement()
		 * @generated
		 */
		EClass MMESPSWI_PACKAGE_ELEMENT = eINSTANCE.getMMESPSWIPackageElement();

	}

}