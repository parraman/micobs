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
package es.uah.aut.srg.micobs.mesp.mesposswp;

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
 * @see es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpFactory
 * @model kind="package"
 * @generated
 */
public interface mesposswpPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mesposswp";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mesposswp";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mesposswpPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageElementImpl <em>MMESPOSSWPPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpPackageImpl#getMMESPOSSWPPackageElement()
	 * @generated
	 */
	int MMESPOSSWP_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMESPOSSWPPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl <em>MOSSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpPackageImpl#getMOSSwPackage()
	 * @generated
	 */
	int MOS_SW_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE__VERSION = MMESPOSSWP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE__NAME = MMESPOSSWP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE__URI = MMESPOSSWP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>ReferencedElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE__REFERENCED_ELEMENT = MMESPOSSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE__EXTENDS = MMESPOSSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ctools</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE__CTOOLS = MMESPOSSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ProvidedOSSWIs</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE__PROVIDED_OSSW_IS = MMESPOSSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MOSSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SW_PACKAGE_FEATURE_COUNT = MMESPOSSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageFileImpl <em>MMESPOSSWPPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpPackageImpl#getMMESPOSSWPPackageFile()
	 * @generated
	 */
	int MMESPOSSWP_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMESPOSSWPPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPOSSWP_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage <em>MOSSwPackage</em>}'.
	 * @return the meta object for class '<em>MOSSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage
	 * @generated
	 */
	EClass getMOSSwPackage();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getExtends()
	 * @see #getMOSSwPackage()
	 * @generated
	 */
	EReference getMOSSwPackage_Extends();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getCtools <em>Ctools</em>}'.
	 * @return the meta object for the reference list '<em>Ctools</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getCtools()
	 * @see #getMOSSwPackage()
	 * @generated
	 */
	EReference getMOSSwPackage_Ctools();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getProvidedOSSWIs <em>ProvidedOSSWIs</em>}'.
	 * @return the meta object for the reference list '<em>ProvidedOSSWIs</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getProvidedOSSWIs()
	 * @see #getMOSSwPackage()
	 * @generated
	 */
	EReference getMOSSwPackage_ProvidedOSSWIs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile <em>MMESPOSSWPPackageFile</em>}'.
	 * @return the meta object for class '<em>MMESPOSSWPPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile
	 * @generated
	 */
	EClass getMMESPOSSWPPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageElement <em>MMESPOSSWPPackageElement</em>}'.
	 * @return the meta object for class '<em>MMESPOSSWPPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageElement
	 * @generated
	 */
	EClass getMMESPOSSWPPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mesposswpFactory getmesposswpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl <em>MOSSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpPackageImpl#getMOSSwPackage()
		 * @generated
		 */
		EClass MOS_SW_PACKAGE = eINSTANCE.getMOSSwPackage();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOS_SW_PACKAGE__EXTENDS = eINSTANCE.getMOSSwPackage_Extends();

		/**
		 * The meta object literal for the '<em><b>Ctools</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOS_SW_PACKAGE__CTOOLS = eINSTANCE.getMOSSwPackage_Ctools();

		/**
		 * The meta object literal for the '<em><b>ProvidedOSSWIs</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOS_SW_PACKAGE__PROVIDED_OSSW_IS = eINSTANCE.getMOSSwPackage_ProvidedOSSWIs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageFileImpl <em>MMESPOSSWPPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpPackageImpl#getMMESPOSSWPPackageFile()
		 * @generated
		 */
		EClass MMESPOSSWP_PACKAGE_FILE = eINSTANCE.getMMESPOSSWPPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageElementImpl <em>MMESPOSSWPPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.MMESPOSSWPPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpPackageImpl#getMMESPOSSWPPackageElement()
		 * @generated
		 */
		EClass MMESPOSSWP_PACKAGE_ELEMENT = eINSTANCE.getMMESPOSSWPPackageElement();

	}

}
