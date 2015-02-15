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
package es.uah.aut.srg.micobs.system.library.systemlibrary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryFactory
 * @model kind="package"
 * @generated
 */
public interface systemlibraryPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "systemlibrary";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/library/systemlibrary";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.system.library";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	systemlibraryPackage eINSTANCE = es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemLibraryImpl <em>MSystemLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemLibraryImpl
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemLibrary()
	 * @generated
	 */
	int MSYSTEM_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_LIBRARY__PACKAGES = commonPackage.MCOMMON_LIBRARY__PACKAGES;

	/**
	 * The number of structural features of the '<em>MSystemLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_LIBRARY_FEATURE_COUNT = commonPackage.MCOMMON_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageImpl <em>MSystemPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageImpl
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemPackage()
	 * @generated
	 */
	int MSYSTEM_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE__URI = commonPackage.MCOMMON_PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE__ITEMS = commonPackage.MCOMMON_PACKAGE__ITEMS;

	/**
	 * The number of structural features of the '<em>MSystemPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageItemImpl <em>MSystem Package Item</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageItemImpl
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemPackageItem()
	 * @generated
	 */
	int MSYSTEM_PACKAGE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_ITEM__VERSIONED_ITEMS = commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_ITEM__URI = commonPackage.MCOMMON_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MSystemPackageItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageVersionedItemImpl <em>MSystem Package Versioned Item</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageVersionedItemImpl
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemPackageVersionedItem()
	 * @generated
	 */
	int MSYSTEM_PACKAGE_VERSIONED_ITEM = 3;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_VERSIONED_ITEM__VERSION = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MSystemPackageVersionedItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemItemLanguageImpl <em>MSystemItemLanguage</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemItemLanguageImpl
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemItemLanguage()
	 * @generated
	 */
	int MSYSTEM_ITEM_LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_ITEM_LANGUAGE__VERSIONED_ITEMS = MSYSTEM_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_ITEM_LANGUAGE__URI = MSYSTEM_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MSystemItemLanguage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_ITEM_LANGUAGE_FEATURE_COUNT = MSYSTEM_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemVersionedItemLanguageImpl <em>MSystemVersionedItemLanguage</em>}' class.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemVersionedItemLanguageImpl
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemVersionedItemLanguage()
	 * @generated
	 */
	int MSYSTEM_VERSIONED_ITEM_LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_VERSIONED_ITEM_LANGUAGE__LOCAL_MODEL_URI = MSYSTEM_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_VERSIONED_ITEM_LANGUAGE__REMOTE_MODEL_URI = MSYSTEM_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_VERSIONED_ITEM_LANGUAGE__REPOSITORY_FOLDER_URI = MSYSTEM_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_VERSIONED_ITEM_LANGUAGE__VERSION = MSYSTEM_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MSystemVersionedItemLanguage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSYSTEM_VERSIONED_ITEM_LANGUAGE_FEATURE_COUNT = MSYSTEM_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary <em>MSystemLibrary</em>}'.
	 * @return the meta object for class '<em>MSystemLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary
	 * @generated
	 */
	EClass getMSystemLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage <em>MSystemPackage</em>}'.
	 * @return the meta object for class '<em>MSystemPackage</em>'.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage
	 * @generated
	 */
	EClass getMSystemPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem <em>MSystemPackageItem</em>}'.
	 * @return the meta object for class '<em>MSystemPackageItem</em>'.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem
	 * @generated
	 */
	EClass getMSystemPackageItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem <em>MSystemPackageVersionedItem</em>}'.
	 * @return the meta object for class '<em>MSystemPackageVersionedItem</em>'.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem
	 * @generated
	 */
	EClass getMSystemPackageVersionedItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage <em>MSystemItemLanguage</em>}'.
	 * @return the meta object for class '<em>MSystemItemLanguage</em>'.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage
	 * @generated
	 */
	EClass getMSystemItemLanguage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage <em>MSystemVersionedItemLanguage</em>}'.
	 * @return the meta object for class '<em>MSystemVersionedItemLanguage</em>'.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage
	 * @generated
	 */
	EClass getMSystemVersionedItemLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	systemlibraryFactory getsystemlibraryFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemLibraryImpl <em>MSystemLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemLibraryImpl
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemLibrary()
		 * @generated
		 */
		EClass MSYSTEM_LIBRARY = eINSTANCE.getMSystemLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageImpl <em>MSystemPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageImpl
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemPackage()
		 * @generated
		 */
		EClass MSYSTEM_PACKAGE = eINSTANCE.getMSystemPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageItemImpl <em>MSystemPackageItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageItemImpl
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemPackageItem()
		 * @generated
		 */
		EClass MSYSTEM_PACKAGE_ITEM = eINSTANCE.getMSystemPackageItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageVersionedItemImpl <em>MSystemPackageVersionedItem</em>}' class.
		 * 
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemPackageVersionedItemImpl
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemPackageVersionedItem()
		 * @generated
		 */
		EClass MSYSTEM_PACKAGE_VERSIONED_ITEM = eINSTANCE.getMSystemPackageVersionedItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemItemLanguageImpl <em>MSystemItemLanguage</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemItemLanguageImpl
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemItemLanguage()
		 * @generated
		 */
		EClass MSYSTEM_ITEM_LANGUAGE = eINSTANCE.getMSystemItemLanguage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemVersionedItemLanguageImpl <em>MSystemVersionedItemLanguage</em>}' class.
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.MSystemVersionedItemLanguageImpl
		 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryPackageImpl#getMSystemVersionedItemLanguage()
		 * @generated
		 */
		EClass MSYSTEM_VERSIONED_ITEM_LANGUAGE = eINSTANCE.getMSystemVersionedItemLanguage();

	}

}
