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
package es.uah.aut.srg.micobs.mesp.mesppswp;

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
 * @see es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpFactory
 * @model kind="package"
 * @generated
 */
public interface mesppswpPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mesppswp";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mesppswp";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mesppswpPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mesppswp.impl.mesppswpPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageElementImpl <em>MMESPPSWPPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.mesppswpPackageImpl#getMMESPPSWPPackageElement()
	 * @generated
	 */
	int MMESPPSWP_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMESPPSWPPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MPlatformSwPackageImpl <em>MPlatformSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.MPlatformSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.mesppswpPackageImpl#getMPlatformSwPackage()
	 * @generated
	 */
	int MPLATFORM_SW_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_SW_PACKAGE__VERSION = MMESPPSWP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_SW_PACKAGE__NAME = MMESPPSWP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_SW_PACKAGE__URI = MMESPPSWP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>ReferencedElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT = MMESPPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OsSwPackages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES = MMESPPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ctools</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_SW_PACKAGE__CTOOLS = MMESPPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MPlatformSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_SW_PACKAGE_FEATURE_COUNT = MMESPPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageFileImpl <em>MMESPPSWPPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.mesppswpPackageImpl#getMMESPPSWPPackageFile()
	 * @generated
	 */
	int MMESPPSWP_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMESPPSWPPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPPSWP_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage <em>MPlatformSwPackage</em>}'.
	 * @return the meta object for class '<em>MPlatformSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage
	 * @generated
	 */
	EClass getMPlatformSwPackage();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage#getOsSwPackages <em>OsSwPackages</em>}'.
	 * @return the meta object for the reference list '<em>OsSwPackages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage#getOsSwPackages()
	 * @see #getMPlatformSwPackage()
	 * @generated
	 */
	EReference getMPlatformSwPackage_OsSwPackages();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage#getCtools <em>Ctools</em>}'.
	 * @return the meta object for the reference list '<em>Ctools</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage#getCtools()
	 * @see #getMPlatformSwPackage()
	 * @generated
	 */
	EReference getMPlatformSwPackage_Ctools();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile <em>MMESPPSWPPackageFile</em>}'.
	 * @return the meta object for class '<em>MMESPPSWPPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile
	 * @generated
	 */
	EClass getMMESPPSWPPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageElement <em>MMESPPSWPPackageElement</em>}'.
	 * @return the meta object for class '<em>MMESPPSWPPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageElement
	 * @generated
	 */
	EClass getMMESPPSWPPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mesppswpFactory getmesppswpFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MPlatformSwPackageImpl <em>MPlatformSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.MPlatformSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.mesppswpPackageImpl#getMPlatformSwPackage()
		 * @generated
		 */
		EClass MPLATFORM_SW_PACKAGE = eINSTANCE.getMPlatformSwPackage();

		/**
		 * The meta object literal for the '<em><b>OsSwPackages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES = eINSTANCE.getMPlatformSwPackage_OsSwPackages();

		/**
		 * The meta object literal for the '<em><b>Ctools</b></em>' reference list feature.
		 * @generated
		 */
		EReference MPLATFORM_SW_PACKAGE__CTOOLS = eINSTANCE.getMPlatformSwPackage_Ctools();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageFileImpl <em>MMESPPSWPPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.mesppswpPackageImpl#getMMESPPSWPPackageFile()
		 * @generated
		 */
		EClass MMESPPSWP_PACKAGE_FILE = eINSTANCE.getMMESPPSWPPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageElementImpl <em>MMESPPSWPPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.MMESPPSWPPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mesp.mesppswp.impl.mesppswpPackageImpl#getMMESPPSWPPackageElement()
		 * @generated
		 */
		EClass MMESPPSWP_PACKAGE_ELEMENT = eINSTANCE.getMMESPPSWPPackageElement();

	}

}
