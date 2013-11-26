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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary;

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
 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryFactory
 * @model kind="package"
 * @generated
 */
public interface mesplibraryPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mesplibrary";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/library/mesplibrary";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp.library";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mesplibraryPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPLibraryImpl <em>MMESPLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPLibraryImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPLibrary()
	 * @generated
	 */
	int MMESP_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_LIBRARY__PACKAGES = commonPackage.MCOMMON_LIBRARY__PACKAGES;

	/**
	 * The number of structural features of the '<em>MMESPLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_LIBRARY_FEATURE_COUNT = commonPackage.MCOMMON_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageImpl <em>MMESPPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackage()
	 * @generated
	 */
	int MMESP_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE__URI = commonPackage.MCOMMON_PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE__ITEMS = commonPackage.MCOMMON_PACKAGE__ITEMS;

	/**
	 * The number of structural features of the '<em>MMESPPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageItemImpl <em>MMESPPackageItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageItemImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackageItem()
	 * @generated
	 */
	int MMESP_PACKAGE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_ITEM__VERSIONED_ITEMS = commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_ITEM__URI = commonPackage.MCOMMON_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPPackageItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemImpl <em>MMESPPackageVersionedItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackageVersionedItem()
	 * @generated
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM = 3;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM__VERSION = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPPackageVersionedItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemWithRepositoryImpl <em>MMESPPackageVersionedItemWithRepository</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemWithRepositoryImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackageVersionedItemWithRepository()
	 * @generated
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION = MMESP_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPPackageVersionedItemWithRepository</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwPackageImpl <em>MMESPItemSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemSwPackage()
	 * @generated
	 */
	int MMESP_ITEM_SW_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_SW_PACKAGE__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_SW_PACKAGE__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwPackageImpl <em>MMESPVersionedItemSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemSwPackage()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_SW_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_PACKAGE__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_PACKAGE__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_PACKAGE__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_PACKAGE__VERSION = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwInterfaceImpl <em>MMESPItemSwInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemSwInterface()
	 * @generated
	 */
	int MMESP_ITEM_SW_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_SW_INTERFACE__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_SW_INTERFACE__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemSwInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_SW_INTERFACE_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwInterfaceImpl <em>MMESPVersionedItemSwInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemSwInterface()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_SW_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_INTERFACE__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_INTERFACE__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_INTERFACE__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_INTERFACE__VERSION = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemSwInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_SW_INTERFACE_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwPackageImpl <em>MMESPItemOSSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemOSSwPackage()
	 * @generated
	 */
	int MMESP_ITEM_OS_SW_PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_OS_SW_PACKAGE__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_OS_SW_PACKAGE__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemOSSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_OS_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwPackageImpl <em>MMESPVersionedItemOSSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemOSSwPackage()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_PACKAGE__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_PACKAGE__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_PACKAGE__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_PACKAGE__VERSION = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemOSSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwInterfaceImpl <em>MMESPItemOSSwInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemOSSwInterface()
	 * @generated
	 */
	int MMESP_ITEM_OS_SW_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_OS_SW_INTERFACE__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_OS_SW_INTERFACE__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemOSSwInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_OS_SW_INTERFACE_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwInterfaceImpl <em>MMESPVersionedItemOSSwInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemOSSwInterface()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_INTERFACE__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_INTERFACE__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_INTERFACE__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_INTERFACE__VERSION = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemOSSwInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_OS_SW_INTERFACE_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemPlatformSwPackageImpl <em>MMESPItemPlatformSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemPlatformSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemPlatformSwPackage()
	 * @generated
	 */
	int MMESP_ITEM_PLATFORM_SW_PACKAGE = 13;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_PLATFORM_SW_PACKAGE__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_PLATFORM_SW_PACKAGE__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemPlatformSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_PLATFORM_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemPlatformSwPackageImpl <em>MMESPVersionedItemPlatformSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemPlatformSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemPlatformSwPackage()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE = 14;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE__VERSION = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemPlatformSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDeploymentImpl <em>MMESPItemDeployment</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDeploymentImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemDeployment()
	 * @generated
	 */
	int MMESP_ITEM_DEPLOYMENT = 15;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_DEPLOYMENT__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_DEPLOYMENT__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemDeployment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_DEPLOYMENT_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDeploymentImpl <em>MMESPVersionedItemDeployment</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDeploymentImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemDeployment()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_DEPLOYMENT = 16;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DEPLOYMENT__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DEPLOYMENT__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DEPLOYMENT__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DEPLOYMENT__VERSION = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemDeployment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DEPLOYMENT_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemAbstractSwPackageImpl <em>MMESPItemAbstractSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemAbstractSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemAbstractSwPackage()
	 * @generated
	 */
	int MMESP_ITEM_ABSTRACT_SW_PACKAGE = 17;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_ABSTRACT_SW_PACKAGE__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_ABSTRACT_SW_PACKAGE__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemAbstractSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_ABSTRACT_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemAbstractSwPackageImpl <em>MMESPVersionedItemAbstractSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemAbstractSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemAbstractSwPackage()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE = 18;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE__LOCAL_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE__REMOTE_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE__REPOSITORY_FOLDER_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE__VERSION = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemAbstractSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemConstructionToolImpl <em>MMESPItemConstructionTool</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemConstructionToolImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemConstructionTool()
	 * @generated
	 */
	int MMESP_ITEM_CONSTRUCTION_TOOL = 19;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_CONSTRUCTION_TOOL__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_CONSTRUCTION_TOOL__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemConstructionTool</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_CONSTRUCTION_TOOL_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemConstructionToolImpl <em>MMESPVersionedItemConstructionTool</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemConstructionToolImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemConstructionTool()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL = 20;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL__LOCAL_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL__REMOTE_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL__REPOSITORY_FOLDER_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL__VERSION = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemConstructionTool</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDriverSwPackageImpl <em>MMESPItemDriverSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDriverSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemDriverSwPackage()
	 * @generated
	 */
	int MMESP_ITEM_DRIVER_SW_PACKAGE = 21;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_DRIVER_SW_PACKAGE__VERSIONED_ITEMS = MMESP_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_DRIVER_SW_PACKAGE__URI = MMESP_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMESPItemDriverSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_ITEM_DRIVER_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDriverSwPackageImpl <em>MMESPVersionedItemDriverSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDriverSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemDriverSwPackage()
	 * @generated
	 */
	int MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE = 22;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE__LOCAL_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE__REMOTE_MODEL_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE__REPOSITORY_FOLDER_URI = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE__VERSION = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY__VERSION;

	/**
	 * The number of structural features of the '<em>MMESPVersionedItemDriverSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE_FEATURE_COUNT = MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPLibrary <em>MMESPLibrary</em>}'.
	 * @return the meta object for class '<em>MMESPLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPLibrary
	 * @generated
	 */
	EClass getMMESPLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackage <em>MMESPPackage</em>}'.
	 * @return the meta object for class '<em>MMESPPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackage
	 * @generated
	 */
	EClass getMMESPPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem <em>MMESPPackageItem</em>}'.
	 * @return the meta object for class '<em>MMESPPackageItem</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem
	 * @generated
	 */
	EClass getMMESPPackageItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItem <em>MMESPPackageVersionedItem</em>}'.
	 * @return the meta object for class '<em>MMESPPackageVersionedItem</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItem
	 * @generated
	 */
	EClass getMMESPPackageVersionedItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository <em>MMESPPackageVersionedItemWithRepository</em>}'.
	 * @return the meta object for class '<em>MMESPPackageVersionedItemWithRepository</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository
	 * @generated
	 */
	EClass getMMESPPackageVersionedItemWithRepository();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwPackage <em>MMESPItemSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPItemSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwPackage
	 * @generated
	 */
	EClass getMMESPItemSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage <em>MMESPVersionedItemSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage
	 * @generated
	 */
	EClass getMMESPVersionedItemSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwInterface <em>MMESPItemSwInterface</em>}'.
	 * @return the meta object for class '<em>MMESPItemSwInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwInterface
	 * @generated
	 */
	EClass getMMESPItemSwInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface <em>MMESPVersionedItemSwInterface</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemSwInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface
	 * @generated
	 */
	EClass getMMESPVersionedItemSwInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwPackage <em>MMESPItemOSSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPItemOSSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwPackage
	 * @generated
	 */
	EClass getMMESPItemOSSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage <em>MMESPVersionedItemOSSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemOSSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage
	 * @generated
	 */
	EClass getMMESPVersionedItemOSSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwInterface <em>MMESPItemOSSwInterface</em>}'.
	 * @return the meta object for class '<em>MMESPItemOSSwInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwInterface
	 * @generated
	 */
	EClass getMMESPItemOSSwInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface <em>MMESPVersionedItemOSSwInterface</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemOSSwInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface
	 * @generated
	 */
	EClass getMMESPVersionedItemOSSwInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemPlatformSwPackage <em>MMESPItemPlatformSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPItemPlatformSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemPlatformSwPackage
	 * @generated
	 */
	EClass getMMESPItemPlatformSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage <em>MMESPVersionedItemPlatformSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemPlatformSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage
	 * @generated
	 */
	EClass getMMESPVersionedItemPlatformSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDeployment <em>MMESPItemDeployment</em>}'.
	 * @return the meta object for class '<em>MMESPItemDeployment</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDeployment
	 * @generated
	 */
	EClass getMMESPItemDeployment();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment <em>MMESPVersionedItemDeployment</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemDeployment</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment
	 * @generated
	 */
	EClass getMMESPVersionedItemDeployment();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemAbstractSwPackage <em>MMESPItemAbstractSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPItemAbstractSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemAbstractSwPackage
	 * @generated
	 */
	EClass getMMESPItemAbstractSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage <em>MMESPVersionedItemAbstractSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemAbstractSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage
	 * @generated
	 */
	EClass getMMESPVersionedItemAbstractSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool <em>MMESPItemConstructionTool</em>}'.
	 * @return the meta object for class '<em>MMESPItemConstructionTool</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool
	 * @generated
	 */
	EClass getMMESPItemConstructionTool();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool <em>MMESPVersionedItemConstructionTool</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemConstructionTool</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool
	 * @generated
	 */
	EClass getMMESPVersionedItemConstructionTool();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDriverSwPackage <em>MMESPItemDriverSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPItemDriverSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDriverSwPackage
	 * @generated
	 */
	EClass getMMESPItemDriverSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage <em>MMESPVersionedItemDriverSwPackage</em>}'.
	 * @return the meta object for class '<em>MMESPVersionedItemDriverSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage
	 * @generated
	 */
	EClass getMMESPVersionedItemDriverSwPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mesplibraryFactory getmesplibraryFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPLibraryImpl <em>MMESPLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPLibraryImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPLibrary()
		 * @generated
		 */
		EClass MMESP_LIBRARY = eINSTANCE.getMMESPLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageImpl <em>MMESPPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackage()
		 * @generated
		 */
		EClass MMESP_PACKAGE = eINSTANCE.getMMESPPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageItemImpl <em>MMESPPackageItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageItemImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackageItem()
		 * @generated
		 */
		EClass MMESP_PACKAGE_ITEM = eINSTANCE.getMMESPPackageItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemImpl <em>MMESPPackageVersionedItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackageVersionedItem()
		 * @generated
		 */
		EClass MMESP_PACKAGE_VERSIONED_ITEM = eINSTANCE.getMMESPPackageVersionedItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemWithRepositoryImpl <em>MMESPPackageVersionedItemWithRepository</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPPackageVersionedItemWithRepositoryImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPPackageVersionedItemWithRepository()
		 * @generated
		 */
		EClass MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY = eINSTANCE.getMMESPPackageVersionedItemWithRepository();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwPackageImpl <em>MMESPItemSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemSwPackage()
		 * @generated
		 */
		EClass MMESP_ITEM_SW_PACKAGE = eINSTANCE.getMMESPItemSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwPackageImpl <em>MMESPVersionedItemSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemSwPackage()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_SW_PACKAGE = eINSTANCE.getMMESPVersionedItemSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwInterfaceImpl <em>MMESPItemSwInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemSwInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemSwInterface()
		 * @generated
		 */
		EClass MMESP_ITEM_SW_INTERFACE = eINSTANCE.getMMESPItemSwInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwInterfaceImpl <em>MMESPVersionedItemSwInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemSwInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemSwInterface()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_SW_INTERFACE = eINSTANCE.getMMESPVersionedItemSwInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwPackageImpl <em>MMESPItemOSSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemOSSwPackage()
		 * @generated
		 */
		EClass MMESP_ITEM_OS_SW_PACKAGE = eINSTANCE.getMMESPItemOSSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwPackageImpl <em>MMESPVersionedItemOSSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemOSSwPackage()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_OS_SW_PACKAGE = eINSTANCE.getMMESPVersionedItemOSSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwInterfaceImpl <em>MMESPItemOSSwInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemOSSwInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemOSSwInterface()
		 * @generated
		 */
		EClass MMESP_ITEM_OS_SW_INTERFACE = eINSTANCE.getMMESPItemOSSwInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwInterfaceImpl <em>MMESPVersionedItemOSSwInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemOSSwInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemOSSwInterface()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_OS_SW_INTERFACE = eINSTANCE.getMMESPVersionedItemOSSwInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemPlatformSwPackageImpl <em>MMESPItemPlatformSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemPlatformSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemPlatformSwPackage()
		 * @generated
		 */
		EClass MMESP_ITEM_PLATFORM_SW_PACKAGE = eINSTANCE.getMMESPItemPlatformSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemPlatformSwPackageImpl <em>MMESPVersionedItemPlatformSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemPlatformSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemPlatformSwPackage()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE = eINSTANCE.getMMESPVersionedItemPlatformSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDeploymentImpl <em>MMESPItemDeployment</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDeploymentImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemDeployment()
		 * @generated
		 */
		EClass MMESP_ITEM_DEPLOYMENT = eINSTANCE.getMMESPItemDeployment();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDeploymentImpl <em>MMESPVersionedItemDeployment</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDeploymentImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemDeployment()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_DEPLOYMENT = eINSTANCE.getMMESPVersionedItemDeployment();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemAbstractSwPackageImpl <em>MMESPItemAbstractSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemAbstractSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemAbstractSwPackage()
		 * @generated
		 */
		EClass MMESP_ITEM_ABSTRACT_SW_PACKAGE = eINSTANCE.getMMESPItemAbstractSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemAbstractSwPackageImpl <em>MMESPVersionedItemAbstractSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemAbstractSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemAbstractSwPackage()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE = eINSTANCE.getMMESPVersionedItemAbstractSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemConstructionToolImpl <em>MMESPItemConstructionTool</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemConstructionToolImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemConstructionTool()
		 * @generated
		 */
		EClass MMESP_ITEM_CONSTRUCTION_TOOL = eINSTANCE.getMMESPItemConstructionTool();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemConstructionToolImpl <em>MMESPVersionedItemConstructionTool</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemConstructionToolImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemConstructionTool()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL = eINSTANCE.getMMESPVersionedItemConstructionTool();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDriverSwPackageImpl <em>MMESPItemDriverSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPItemDriverSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPItemDriverSwPackage()
		 * @generated
		 */
		EClass MMESP_ITEM_DRIVER_SW_PACKAGE = eINSTANCE.getMMESPItemDriverSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDriverSwPackageImpl <em>MMESPVersionedItemDriverSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.MMESPVersionedItemDriverSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl.mesplibraryPackageImpl#getMMESPVersionedItemDriverSwPackage()
		 * @generated
		 */
		EClass MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE = eINSTANCE.getMMESPVersionedItemDriverSwPackage();

	}

}
