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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary;

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
 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryFactory
 * @model kind="package"
 * @generated
 */
public interface pdllibraryPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "pdllibrary";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/library/pdllibrary";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.library";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	pdllibraryPackage eINSTANCE = es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLLibraryImpl <em>MPDLLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLLibraryImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLLibrary()
	 * @generated
	 */
	int MPDL_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_LIBRARY__PACKAGES = commonPackage.MCOMMON_LIBRARY__PACKAGES;

	/**
	 * The number of structural features of the '<em>MPDLLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_LIBRARY_FEATURE_COUNT = commonPackage.MCOMMON_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageImpl <em>MPDLPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLPackage()
	 * @generated
	 */
	int MPDL_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE__URI = commonPackage.MCOMMON_PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE__ITEMS = commonPackage.MCOMMON_PACKAGE__ITEMS;

	/**
	 * The number of structural features of the '<em>MPDLPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageItemImpl <em>MPDLPackageItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageItemImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLPackageItem()
	 * @generated
	 */
	int MPDL_PACKAGE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_ITEM__VERSIONED_ITEMS = commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_ITEM__URI = commonPackage.MCOMMON_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLPackageItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageVersionedItemImpl <em>MPDLPackageVersionedItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageVersionedItemImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLPackageVersionedItem()
	 * @generated
	 */
	int MPDL_PACKAGE_VERSIONED_ITEM = 3;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_VERSIONED_ITEM__VERSION = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLPackageVersionedItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemAPIImpl <em>MPDLItemOperatingSystemAPI</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemAPIImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemOperatingSystemAPI()
	 * @generated
	 */
	int MPDL_ITEM_OPERATING_SYSTEM_API = 4;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_OPERATING_SYSTEM_API__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_OPERATING_SYSTEM_API__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemOperatingSystemAPI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_OPERATING_SYSTEM_API_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemAPIImpl <em>MPDLVersionedItemOperatingSystemAPI</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemAPIImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemOperatingSystemAPI()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API = 5;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemOperatingSystemAPI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemImpl <em>MPDLItemOperatingSystem</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemOperatingSystem()
	 * @generated
	 */
	int MPDL_ITEM_OPERATING_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_OPERATING_SYSTEM__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_OPERATING_SYSTEM__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemOperatingSystem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_OPERATING_SYSTEM_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemImpl <em>MPDLVersionedItemOperatingSystem</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemOperatingSystem()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemOperatingSystem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemArchitectureImpl <em>MPDLItemArchitecture</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemArchitectureImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemArchitecture()
	 * @generated
	 */
	int MPDL_ITEM_ARCHITECTURE = 8;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_ARCHITECTURE__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_ARCHITECTURE__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemArchitecture</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_ARCHITECTURE_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemArchitectureImpl <em>MPDLVersionedItemArchitecture</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemArchitectureImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemArchitecture()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_ARCHITECTURE = 9;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_ARCHITECTURE__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_ARCHITECTURE__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_ARCHITECTURE__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_ARCHITECTURE__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemArchitecture</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_ARCHITECTURE_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemMicroprocessorImpl <em>MPDLItemMicroprocessor</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemMicroprocessorImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemMicroprocessor()
	 * @generated
	 */
	int MPDL_ITEM_MICROPROCESSOR = 10;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_MICROPROCESSOR__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_MICROPROCESSOR__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemMicroprocessor</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_MICROPROCESSOR_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemMicroprocessorImpl <em>MPDLVersionedItemMicroprocessor</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemMicroprocessorImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemMicroprocessor()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_MICROPROCESSOR = 11;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_MICROPROCESSOR__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_MICROPROCESSOR__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_MICROPROCESSOR__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_MICROPROCESSOR__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemMicroprocessor</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_MICROPROCESSOR_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemBoardImpl <em>MPDLItemBoard</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemBoardImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemBoard()
	 * @generated
	 */
	int MPDL_ITEM_BOARD = 12;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_BOARD__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_BOARD__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemBoard</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_BOARD_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemBoardImpl <em>MPDLVersionedItemBoard</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemBoardImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemBoard()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_BOARD = 13;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_BOARD__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_BOARD__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_BOARD__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_BOARD__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemBoard</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_BOARD_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemPlatformImpl <em>MPDLItemPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemPlatformImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemPlatform()
	 * @generated
	 */
	int MPDL_ITEM_PLATFORM = 14;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_PLATFORM__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_PLATFORM__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_PLATFORM_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemPlatformImpl <em>MPDLVersionedItemPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemPlatformImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemPlatform()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_PLATFORM = 15;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_PLATFORM__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_PLATFORM__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_PLATFORM__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_PLATFORM__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_PLATFORM_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemCompilerImpl <em>MPDLItemCompiler</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemCompilerImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemCompiler()
	 * @generated
	 */
	int MPDL_ITEM_COMPILER = 16;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_COMPILER__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_COMPILER__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemCompiler</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_COMPILER_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemCompilerImpl <em>MPDLVersionedItemCompiler</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemCompilerImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemCompiler()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_COMPILER = 17;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_COMPILER__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_COMPILER__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_COMPILER__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_COMPILER__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemCompiler</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_COMPILER_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemDeviceImpl <em>MPDLItemDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemDeviceImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemDevice()
	 * @generated
	 */
	int MPDL_ITEM_DEVICE = 18;

	/**
	 * The feature id for the '<em><b>Versioned Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_DEVICE__VERSIONED_ITEMS = MPDL_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_DEVICE__URI = MPDL_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MPDLItemDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_ITEM_DEVICE_FEATURE_COUNT = MPDL_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemDeviceImpl <em>MPDLVersionedItemDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemDeviceImpl
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemDevice()
	 * @generated
	 */
	int MPDL_VERSIONED_ITEM_DEVICE = 19;

	/**
	 * The feature id for the '<em><b>Local Model URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_DEVICE__LOCAL_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>Remote Model URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_DEVICE__REMOTE_MODEL_URI = MPDL_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>Repository Folder URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_DEVICE__REPOSITORY_FOLDER_URI = MPDL_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_DEVICE__VERSION = MPDL_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MPDLVersionedItemDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_VERSIONED_ITEM_DEVICE_FEATURE_COUNT = MPDL_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLLibrary <em>MPDLLibrary</em>}'.
	 * @return the meta object for class '<em>MPDLLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLLibrary
	 * @generated
	 */
	EClass getMPDLLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage <em>MPDLPackage</em>}'.
	 * @return the meta object for class '<em>MPDLPackage</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage
	 * @generated
	 */
	EClass getMPDLPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageItem <em>MPDLPackageItem</em>}'.
	 * @return the meta object for class '<em>MPDLPackageItem</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageItem
	 * @generated
	 */
	EClass getMPDLPackageItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageVersionedItem <em>MPDLPackageVersionedItem</em>}'.
	 * @return the meta object for class '<em>MPDLPackageVersionedItem</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageVersionedItem
	 * @generated
	 */
	EClass getMPDLPackageVersionedItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystemAPI <em>MPDLItemOperatingSystemAPI</em>}'.
	 * @return the meta object for class '<em>MPDLItemOperatingSystemAPI</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystemAPI
	 * @generated
	 */
	EClass getMPDLItemOperatingSystemAPI();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystemAPI <em>MPDLVersionedItemOperatingSystemAPI</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemOperatingSystemAPI</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystemAPI
	 * @generated
	 */
	EClass getMPDLVersionedItemOperatingSystemAPI();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystem <em>MPDLItemOperatingSystem</em>}'.
	 * @return the meta object for class '<em>MPDLItemOperatingSystem</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystem
	 * @generated
	 */
	EClass getMPDLItemOperatingSystem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystem <em>MPDLVersionedItemOperatingSystem</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemOperatingSystem</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystem
	 * @generated
	 */
	EClass getMPDLVersionedItemOperatingSystem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemArchitecture <em>MPDLItemArchitecture</em>}'.
	 * @return the meta object for class '<em>MPDLItemArchitecture</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemArchitecture
	 * @generated
	 */
	EClass getMPDLItemArchitecture();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemArchitecture <em>MPDLVersionedItemArchitecture</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemArchitecture</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemArchitecture
	 * @generated
	 */
	EClass getMPDLVersionedItemArchitecture();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemMicroprocessor <em>MPDLItemMicroprocessor</em>}'.
	 * @return the meta object for class '<em>MPDLItemMicroprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemMicroprocessor
	 * @generated
	 */
	EClass getMPDLItemMicroprocessor();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemMicroprocessor <em>MPDLVersionedItemMicroprocessor</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemMicroprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemMicroprocessor
	 * @generated
	 */
	EClass getMPDLVersionedItemMicroprocessor();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemBoard <em>MPDLItemBoard</em>}'.
	 * @return the meta object for class '<em>MPDLItemBoard</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemBoard
	 * @generated
	 */
	EClass getMPDLItemBoard();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemBoard <em>MPDLVersionedItemBoard</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemBoard</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemBoard
	 * @generated
	 */
	EClass getMPDLVersionedItemBoard();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemPlatform <em>MPDLItemPlatform</em>}'.
	 * @return the meta object for class '<em>MPDLItemPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemPlatform
	 * @generated
	 */
	EClass getMPDLItemPlatform();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemPlatform <em>MPDLVersionedItemPlatform</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemPlatform
	 * @generated
	 */
	EClass getMPDLVersionedItemPlatform();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemCompiler <em>MPDLItemCompiler</em>}'.
	 * @return the meta object for class '<em>MPDLItemCompiler</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemCompiler
	 * @generated
	 */
	EClass getMPDLItemCompiler();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemCompiler <em>MPDLVersionedItemCompiler</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemCompiler</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemCompiler
	 * @generated
	 */
	EClass getMPDLVersionedItemCompiler();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemDevice <em>MPDLItemDevice</em>}'.
	 * @return the meta object for class '<em>MPDLItemDevice</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemDevice
	 * @generated
	 */
	EClass getMPDLItemDevice();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemDevice <em>MPDLVersionedItemDevice</em>}'.
	 * @return the meta object for class '<em>MPDLVersionedItemDevice</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemDevice
	 * @generated
	 */
	EClass getMPDLVersionedItemDevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	pdllibraryFactory getpdllibraryFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLLibraryImpl <em>MPDLLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLLibraryImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLLibrary()
		 * @generated
		 */
		EClass MPDL_LIBRARY = eINSTANCE.getMPDLLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageImpl <em>MPDLPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLPackage()
		 * @generated
		 */
		EClass MPDL_PACKAGE = eINSTANCE.getMPDLPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageItemImpl <em>MPDLPackageItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageItemImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLPackageItem()
		 * @generated
		 */
		EClass MPDL_PACKAGE_ITEM = eINSTANCE.getMPDLPackageItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageVersionedItemImpl <em>MPDLPackageVersionedItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLPackageVersionedItemImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLPackageVersionedItem()
		 * @generated
		 */
		EClass MPDL_PACKAGE_VERSIONED_ITEM = eINSTANCE.getMPDLPackageVersionedItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemAPIImpl <em>MPDLItemOperatingSystemAPI</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemAPIImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemOperatingSystemAPI()
		 * @generated
		 */
		EClass MPDL_ITEM_OPERATING_SYSTEM_API = eINSTANCE.getMPDLItemOperatingSystemAPI();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemAPIImpl <em>MPDLVersionedItemOperatingSystemAPI</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemAPIImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemOperatingSystemAPI()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API = eINSTANCE.getMPDLVersionedItemOperatingSystemAPI();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemImpl <em>MPDLItemOperatingSystem</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemOperatingSystemImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemOperatingSystem()
		 * @generated
		 */
		EClass MPDL_ITEM_OPERATING_SYSTEM = eINSTANCE.getMPDLItemOperatingSystem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemImpl <em>MPDLVersionedItemOperatingSystem</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemOperatingSystemImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemOperatingSystem()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_OPERATING_SYSTEM = eINSTANCE.getMPDLVersionedItemOperatingSystem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemArchitectureImpl <em>MPDLItemArchitecture</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemArchitectureImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemArchitecture()
		 * @generated
		 */
		EClass MPDL_ITEM_ARCHITECTURE = eINSTANCE.getMPDLItemArchitecture();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemArchitectureImpl <em>MPDLVersionedItemArchitecture</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemArchitectureImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemArchitecture()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_ARCHITECTURE = eINSTANCE.getMPDLVersionedItemArchitecture();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemMicroprocessorImpl <em>MPDLItemMicroprocessor</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemMicroprocessorImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemMicroprocessor()
		 * @generated
		 */
		EClass MPDL_ITEM_MICROPROCESSOR = eINSTANCE.getMPDLItemMicroprocessor();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemMicroprocessorImpl <em>MPDLVersionedItemMicroprocessor</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemMicroprocessorImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemMicroprocessor()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_MICROPROCESSOR = eINSTANCE.getMPDLVersionedItemMicroprocessor();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemBoardImpl <em>MPDLItemBoard</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemBoardImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemBoard()
		 * @generated
		 */
		EClass MPDL_ITEM_BOARD = eINSTANCE.getMPDLItemBoard();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemBoardImpl <em>MPDLVersionedItemBoard</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemBoardImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemBoard()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_BOARD = eINSTANCE.getMPDLVersionedItemBoard();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemPlatformImpl <em>MPDLItemPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemPlatformImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemPlatform()
		 * @generated
		 */
		EClass MPDL_ITEM_PLATFORM = eINSTANCE.getMPDLItemPlatform();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemPlatformImpl <em>MPDLVersionedItemPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemPlatformImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemPlatform()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_PLATFORM = eINSTANCE.getMPDLVersionedItemPlatform();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemCompilerImpl <em>MPDLItemCompiler</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemCompilerImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemCompiler()
		 * @generated
		 */
		EClass MPDL_ITEM_COMPILER = eINSTANCE.getMPDLItemCompiler();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemCompilerImpl <em>MPDLVersionedItemCompiler</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemCompilerImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemCompiler()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_COMPILER = eINSTANCE.getMPDLVersionedItemCompiler();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemDeviceImpl <em>MPDLItemDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLItemDeviceImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLItemDevice()
		 * @generated
		 */
		EClass MPDL_ITEM_DEVICE = eINSTANCE.getMPDLItemDevice();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemDeviceImpl <em>MPDLVersionedItemDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.MPDLVersionedItemDeviceImpl
		 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl.pdllibraryPackageImpl#getMPDLVersionedItemDevice()
		 * @generated
		 */
		EClass MPDL_VERSIONED_ITEM_DEVICE = eINSTANCE.getMPDLVersionedItemDevice();

	}

}
