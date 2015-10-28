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
package es.uah.aut.srg.micobs.mclev.mclevsai;

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
 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiFactory
 * @model kind="package"
 * @generated
 */
public interface mclevsaiPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevsai";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mclevsai";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevsaiPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageElementImpl <em>MMCLEVSAIPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiPackageImpl#getMMCLEVSAIPackageElement()
	 * @generated
	 */
	int MMCLEVSAI_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVSAIPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MMCLEVSAIPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_ELEMENT_OPERATION_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl <em>MSAI</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiPackageImpl#getMSAI()
	 * @generated
	 */
	int MSAI = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSAI__VERSION = MMCLEVSAI_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSAI__NAME = MMCLEVSAI_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSAI__URI = MMCLEVSAI_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSAI__EXTENDS = MMCLEVSAI_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSAI__LANGUAGE = MMCLEVSAI_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSAI__REQUIRES = MMCLEVSAI_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSAI__ATTRIBUTES = MMCLEVSAI_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>RequiredOSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSAI__REQUIRED_OSAPI = MMCLEVSAI_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MSAI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSAI_FEATURE_COUNT = MMCLEVSAI_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>MSAI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSAI_OPERATION_COUNT = MMCLEVSAI_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageFileImpl <em>MMCLEVSAIPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiPackageImpl#getMMCLEVSAIPackageFile()
	 * @generated
	 */
	int MMCLEVSAI_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVSAIPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>MMCLEVSAIPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSAI_PACKAGE_FILE_OPERATION_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI <em>MSAI</em>}'.
	 * @return the meta object for class '<em>MSAI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MSAI
	 * @generated
	 */
	EClass getMSAI();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getExtends()
	 * @see #getMSAI()
	 * @generated
	 */
	EReference getMSAI_Extends();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getLanguage <em>Language</em>}'.
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getLanguage()
	 * @see #getMSAI()
	 * @generated
	 */
	EReference getMSAI_Language();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getRequires()
	 * @see #getMSAI()
	 * @generated
	 */
	EReference getMSAI_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getAttributes()
	 * @see #getMSAI()
	 * @generated
	 */
	EReference getMSAI_Attributes();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getRequiredOSAPI <em>RequiredOSAPI</em>}'.
	 * @return the meta object for the reference '<em>RequiredOSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getRequiredOSAPI()
	 * @see #getMSAI()
	 * @generated
	 */
	EReference getMSAI_RequiredOSAPI();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile <em>MMCLEVSAIPackageFile</em>}'.
	 * @return the meta object for class '<em>MMCLEVSAIPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile
	 * @generated
	 */
	EClass getMMCLEVSAIPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageElement <em>MMCLEVSAIPackageElement</em>}'.
	 * @return the meta object for class '<em>MMCLEVSAIPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageElement
	 * @generated
	 */
	EClass getMMCLEVSAIPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevsaiFactory getmclevsaiFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl <em>MSAI</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiPackageImpl#getMSAI()
		 * @generated
		 */
		EClass MSAI = eINSTANCE.getMSAI();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSAI__EXTENDS = eINSTANCE.getMSAI_Extends();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * @generated
		 */
		EReference MSAI__LANGUAGE = eINSTANCE.getMSAI_Language();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSAI__REQUIRES = eINSTANCE.getMSAI_Requires();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSAI__ATTRIBUTES = eINSTANCE.getMSAI_Attributes();

		/**
		 * The meta object literal for the '<em><b>RequiredOSAPI</b></em>' reference feature.
		 * @generated
		 */
		EReference MSAI__REQUIRED_OSAPI = eINSTANCE.getMSAI_RequiredOSAPI();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageFileImpl <em>MMCLEVSAIPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiPackageImpl#getMMCLEVSAIPackageFile()
		 * @generated
		 */
		EClass MMCLEVSAI_PACKAGE_FILE = eINSTANCE.getMMCLEVSAIPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageElementImpl <em>MMCLEVSAIPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.MMCLEVSAIPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiPackageImpl#getMMCLEVSAIPackageElement()
		 * @generated
		 */
		EClass MMCLEVSAI_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVSAIPackageElement();

	}

}