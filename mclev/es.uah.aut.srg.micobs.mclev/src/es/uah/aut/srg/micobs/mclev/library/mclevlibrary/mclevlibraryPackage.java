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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryFactory
 * @model kind="package"
 * @generated
 */
public interface mclevlibraryPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevlibrary";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/library/mclevlibrary";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev.library";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevlibraryPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVLibraryImpl <em>MMCLEVLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVLibrary()
	 * @generated
	 */
	int MMCLEV_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_LIBRARY__PACKAGES = commonPackage.MCOMMON_LIBRARY__PACKAGES;

	/**
	 * The number of structural features of the '<em>MMCLEVLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_LIBRARY_FEATURE_COUNT = commonPackage.MCOMMON_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageImpl <em>MMCLEVPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVPackage()
	 * @generated
	 */
	int MMCLEV_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE__URI = commonPackage.MCOMMON_PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE__ITEMS = commonPackage.MCOMMON_PACKAGE__ITEMS;

	/**
	 * The number of structural features of the '<em>MMCLEVPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageItemImpl <em>MMCLEVPackageItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageItemImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVPackageItem()
	 * @generated
	 */
	int MMCLEV_PACKAGE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS = commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_ITEM__URI = commonPackage.MCOMMON_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVPackageItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageVersionedItemImpl <em>MMCLEVPackageVersionedItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageVersionedItemImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVPackageVersionedItem()
	 * @generated
	 */
	int MMCLEV_PACKAGE_VERSIONED_ITEM = 3;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVPackageVersionedItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemComponentImpl <em>MMCLEVItemComponent</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemComponentImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemComponent()
	 * @generated
	 */
	int MMCLEV_ITEM_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_COMPONENT__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_COMPONENT__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemComponent</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_COMPONENT_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemComponentImpl <em>MMCLEVVersionedItemComponent</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemComponentImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemComponent()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>SwPackageURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__SW_PACKAGE_URI = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SwPackageVersion</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__SW_PACKAGE_VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sw Interface URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__SW_INTERFACE_URI = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sw Interface Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT__SW_INTERFACE_VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemComponent</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_COMPONENT_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemSAIImpl <em>MMCLEVItemSAI</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemSAIImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemSAI()
	 * @generated
	 */
	int MMCLEV_ITEM_SAI = 6;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_SAI__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_SAI__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemSAI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_SAI_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemSAIImpl <em>MMCLEVVersionedItemSAI</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemSAIImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemSAI()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_SAI = 7;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SAI__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SAI__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SAI__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SAI__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>SwInterfaceURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SwInterfaceVersion</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemSAI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SAI_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceImpl <em>MMCLEVItemInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemInterface()
	 * @generated
	 */
	int MMCLEV_ITEM_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_INTERFACE__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_INTERFACE__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_INTERFACE_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceImpl <em>MMCLEVVersionedItemInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemInterface()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceMappingImpl <em>MMCLEVItemInterfaceMapping</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceMappingImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemInterfaceMapping()
	 * @generated
	 */
	int MMCLEV_ITEM_INTERFACE_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_INTERFACE_MAPPING__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_INTERFACE_MAPPING__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemInterfaceMapping</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_INTERFACE_MAPPING_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceMappingImpl <em>MMCLEVVersionedItemInterfaceMapping</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceMappingImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemInterfaceMapping()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemInterfaceMapping</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemServiceLibraryImpl <em>MMCLEVItemService Library</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemServiceLibrary()
	 * @generated
	 */
	int MMCLEV_ITEM_SERVICE_LIBRARY = 12;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_SERVICE_LIBRARY__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_SERVICE_LIBRARY__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemService Library</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_SERVICE_LIBRARY_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemServiceLibraryImpl <em>MMCLEVVersionedItemService Library</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemServiceLibrary()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY = 13;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>SwPackageURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__SW_PACKAGE_URI = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SwPackageVersion</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__SW_PACKAGE_VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemService Library</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemIODomainImpl <em>MMCLEVItemIODomain</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemIODomainImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemIODomain()
	 * @generated
	 */
	int MMCLEV_ITEM_IO_DOMAIN = 14;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_IO_DOMAIN__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_IO_DOMAIN__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemIODomain</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_IO_DOMAIN_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemIODomainImpl <em>MMCLEVVersionedItemIODomain</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemIODomainImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemIODomain()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_IO_DOMAIN = 15;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_IO_DOMAIN__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_IO_DOMAIN__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_IO_DOMAIN__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_IO_DOMAIN__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemIODomain</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_IO_DOMAIN_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAODomainImpl <em>MMCLEVItemAODomain</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAODomainImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemAODomain()
	 * @generated
	 */
	int MMCLEV_ITEM_AO_DOMAIN = 16;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_AO_DOMAIN__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_AO_DOMAIN__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemAODomain</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_AO_DOMAIN_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAODomainImpl <em>MMCLEVVersionedItemAODomain</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAODomainImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemAODomain()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_AO_DOMAIN = 17;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_AO_DOMAIN__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_AO_DOMAIN__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_AO_DOMAIN__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_AO_DOMAIN__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemAODomain</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_AO_DOMAIN_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemMCADImpl <em>MMCLEVItemMCAD</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemMCADImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemMCAD()
	 * @generated
	 */
	int MMCLEV_ITEM_MCAD = 18;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_MCAD__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_MCAD__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemMCAD</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_MCAD_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemMCADImpl <em>MMCLEVVersionedItemMCAD</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemMCADImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemMCAD()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_MCAD = 19;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_MCAD__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_MCAD__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_MCAD__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_MCAD__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemMCAD</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_MCAD_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractComponentImpl <em>MMCLEVItemAbstractComponent</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractComponentImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemAbstractComponent()
	 * @generated
	 */
	int MMCLEV_ITEM_ABSTRACT_COMPONENT = 20;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_ABSTRACT_COMPONENT__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_ABSTRACT_COMPONENT__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemAbstractComponent</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_ABSTRACT_COMPONENT_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractComponentImpl <em>MMCLEVVersionedItemAbstractComponent</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractComponentImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemAbstractComponent()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT = 21;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemAbstractComponent</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractServiceLibraryImpl <em>MMCLEVItemAbstractServiceLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemAbstractServiceLibrary()
	 * @generated
	 */
	int MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY = 22;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemAbstractServiceLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractServiceLibraryImpl <em>MMCLEVVersionedItemAbstractServiceLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemAbstractServiceLibrary()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY = 23;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemAbstractServiceLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemFlatMCADImpl <em>MMCLEVItemFlatMCAD</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemFlatMCADImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemFlatMCAD()
	 * @generated
	 */
	int MMCLEV_ITEM_FLAT_MCAD = 24;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_FLAT_MCAD__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_FLAT_MCAD__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemFlatMCAD</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_FLAT_MCAD_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemFlatMCADImpl <em>MMCLEVVersionedItemFlatMCAD</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemFlatMCADImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemFlatMCAD()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_FLAT_MCAD = 25;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_FLAT_MCAD__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_FLAT_MCAD__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_FLAT_MCAD__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_FLAT_MCAD__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemFlatMCAD</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_FLAT_MCAD_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemDriverServiceLibraryImpl <em>MMCLEVItemDriverServiceLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemDriverServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemDriverServiceLibrary()
	 * @generated
	 */
	int MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY = 26;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY__VERSIONED_ITEMS = MMCLEV_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY__URI = MMCLEV_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVItemDriverServiceLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY_FEATURE_COUNT = MMCLEV_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemDriverServiceLibraryImpl <em>MMCLEVVersionedItemDriverServiceLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemDriverServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemDriverServiceLibrary()
	 * @generated
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY = 27;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__LOCAL_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__REMOTE_MODEL_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__REPOSITORY_FOLDER_URI = MMCLEV_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The feature id for the '<em><b>SwPackageURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SwPackageVersion</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMCLEVVersionedItemDriverServiceLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY_FEATURE_COUNT = MMCLEV_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVLibrary <em>MMCLEVLibrary</em>}'.
	 * @return the meta object for class '<em>MMCLEVLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVLibrary
	 * @generated
	 */
	EClass getMMCLEVLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage <em>MMCLEVPackage</em>}'.
	 * @return the meta object for class '<em>MMCLEVPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage
	 * @generated
	 */
	EClass getMMCLEVPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem <em>MMCLEVPackageItem</em>}'.
	 * @return the meta object for class '<em>MMCLEVPackageItem</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem
	 * @generated
	 */
	EClass getMMCLEVPackageItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageVersionedItem <em>MMCLEVPackageVersionedItem</em>}'.
	 * @return the meta object for class '<em>MMCLEVPackageVersionedItem</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageVersionedItem
	 * @generated
	 */
	EClass getMMCLEVPackageVersionedItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemComponent <em>MMCLEVItemComponent</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemComponent</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemComponent
	 * @generated
	 */
	EClass getMMCLEVItemComponent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent <em>MMCLEVVersionedItemComponent</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemComponent</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent
	 * @generated
	 */
	EClass getMMCLEVVersionedItemComponent();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwPackageURI <em>SwPackageURI</em>}'.
	 * @return the meta object for the attribute '<em>SwPackageURI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwPackageURI()
	 * @see #getMMCLEVVersionedItemComponent()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemComponent_SwPackageURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwPackageVersion <em>SwPackageVersion</em>}'.
	 * @return the meta object for the attribute '<em>SwPackageVersion</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwPackageVersion()
	 * @see #getMMCLEVVersionedItemComponent()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemComponent_SwPackageVersion();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwInterfaceURI <em>Sw Interface URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Interface URI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwInterfaceURI()
	 * @see #getMMCLEVVersionedItemComponent()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemComponent_SwInterfaceURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwInterfaceVersion <em>Sw Interface Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sw Interface Version</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwInterfaceVersion()
	 * @see #getMMCLEVVersionedItemComponent()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemComponent_SwInterfaceVersion();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemSAI <em>MMCLEVItemSAI</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemSAI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemSAI
	 * @generated
	 */
	EClass getMMCLEVItemSAI();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI <em>MMCLEVVersionedItemSAI</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemSAI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI
	 * @generated
	 */
	EClass getMMCLEVVersionedItemSAI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI#getSwInterfaceURI <em>SwInterfaceURI</em>}'.
	 * @return the meta object for the attribute '<em>SwInterfaceURI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI#getSwInterfaceURI()
	 * @see #getMMCLEVVersionedItemSAI()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemSAI_SwInterfaceURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI#getSwInterfaceVersion <em>SwInterfaceVersion</em>}'.
	 * @return the meta object for the attribute '<em>SwInterfaceVersion</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI#getSwInterfaceVersion()
	 * @see #getMMCLEVVersionedItemSAI()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemSAI_SwInterfaceVersion();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterface <em>MMCLEVItemInterface</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterface
	 * @generated
	 */
	EClass getMMCLEVItemInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterface <em>MMCLEVVersionedItemInterface</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterface
	 * @generated
	 */
	EClass getMMCLEVVersionedItemInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterfaceMapping <em>MMCLEVItemInterfaceMapping</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemInterfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterfaceMapping
	 * @generated
	 */
	EClass getMMCLEVItemInterfaceMapping();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterfaceMapping <em>MMCLEVVersionedItemInterfaceMapping</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemInterfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterfaceMapping
	 * @generated
	 */
	EClass getMMCLEVVersionedItemInterfaceMapping();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemServiceLibrary <em>MMCLEVItemService Library</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemService Library</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemServiceLibrary
	 * @generated
	 */
	EClass getMMCLEVItemServiceLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary <em>MMCLEVVersionedItemService Library</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemService Library</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary
	 * @generated
	 */
	EClass getMMCLEVVersionedItemServiceLibrary();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary#getSwPackageURI <em>SwPackageURI</em>}'.
	 * @return the meta object for the attribute '<em>SwPackageURI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary#getSwPackageURI()
	 * @see #getMMCLEVVersionedItemServiceLibrary()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemServiceLibrary_SwPackageURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary#getSwPackageVersion <em>SwPackageVersion</em>}'.
	 * @return the meta object for the attribute '<em>SwPackageVersion</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary#getSwPackageVersion()
	 * @see #getMMCLEVVersionedItemServiceLibrary()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemServiceLibrary_SwPackageVersion();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain <em>MMCLEVItemIODomain</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemIODomain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain
	 * @generated
	 */
	EClass getMMCLEVItemIODomain();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain <em>MMCLEVVersionedItemIODomain</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemIODomain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain
	 * @generated
	 */
	EClass getMMCLEVVersionedItemIODomain();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain <em>MMCLEVItemAODomain</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemAODomain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain
	 * @generated
	 */
	EClass getMMCLEVItemAODomain();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain <em>MMCLEVVersionedItemAODomain</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemAODomain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain
	 * @generated
	 */
	EClass getMMCLEVVersionedItemAODomain();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemMCAD <em>MMCLEVItemMCAD</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemMCAD</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemMCAD
	 * @generated
	 */
	EClass getMMCLEVItemMCAD();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemMCAD <em>MMCLEVVersionedItemMCAD</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemMCAD</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemMCAD
	 * @generated
	 */
	EClass getMMCLEVVersionedItemMCAD();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractComponent <em>MMCLEVItemAbstractComponent</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemAbstractComponent</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractComponent
	 * @generated
	 */
	EClass getMMCLEVItemAbstractComponent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractComponent <em>MMCLEVVersionedItemAbstractComponent</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemAbstractComponent</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractComponent
	 * @generated
	 */
	EClass getMMCLEVVersionedItemAbstractComponent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractServiceLibrary <em>MMCLEVItemAbstractServiceLibrary</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemAbstractServiceLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractServiceLibrary
	 * @generated
	 */
	EClass getMMCLEVItemAbstractServiceLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractServiceLibrary <em>MMCLEVVersionedItemAbstractServiceLibrary</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemAbstractServiceLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractServiceLibrary
	 * @generated
	 */
	EClass getMMCLEVVersionedItemAbstractServiceLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemFlatMCAD <em>MMCLEVItemFlatMCAD</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemFlatMCAD</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemFlatMCAD
	 * @generated
	 */
	EClass getMMCLEVItemFlatMCAD();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemFlatMCAD <em>MMCLEVVersionedItemFlatMCAD</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemFlatMCAD</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemFlatMCAD
	 * @generated
	 */
	EClass getMMCLEVVersionedItemFlatMCAD();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemDriverServiceLibrary <em>MMCLEVItemDriverServiceLibrary</em>}'.
	 * @return the meta object for class '<em>MMCLEVItemDriverServiceLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemDriverServiceLibrary
	 * @generated
	 */
	EClass getMMCLEVItemDriverServiceLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary <em>MMCLEVVersionedItemDriverServiceLibrary</em>}'.
	 * @return the meta object for class '<em>MMCLEVVersionedItemDriverServiceLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary
	 * @generated
	 */
	EClass getMMCLEVVersionedItemDriverServiceLibrary();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary#getSwPackageURI <em>SwPackageURI</em>}'.
	 * @return the meta object for the attribute '<em>SwPackageURI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary#getSwPackageURI()
	 * @see #getMMCLEVVersionedItemDriverServiceLibrary()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemDriverServiceLibrary_SwPackageURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary#getSwPackageVersion <em>SwPackageVersion</em>}'.
	 * @return the meta object for the attribute '<em>SwPackageVersion</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary#getSwPackageVersion()
	 * @see #getMMCLEVVersionedItemDriverServiceLibrary()
	 * @generated
	 */
	EAttribute getMMCLEVVersionedItemDriverServiceLibrary_SwPackageVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevlibraryFactory getmclevlibraryFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVLibraryImpl <em>MMCLEVLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVLibrary()
		 * @generated
		 */
		EClass MMCLEV_LIBRARY = eINSTANCE.getMMCLEVLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageImpl <em>MMCLEVPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVPackage()
		 * @generated
		 */
		EClass MMCLEV_PACKAGE = eINSTANCE.getMMCLEVPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageItemImpl <em>MMCLEVPackageItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageItemImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVPackageItem()
		 * @generated
		 */
		EClass MMCLEV_PACKAGE_ITEM = eINSTANCE.getMMCLEVPackageItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageVersionedItemImpl <em>MMCLEVPackageVersionedItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVPackageVersionedItemImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVPackageVersionedItem()
		 * @generated
		 */
		EClass MMCLEV_PACKAGE_VERSIONED_ITEM = eINSTANCE.getMMCLEVPackageVersionedItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemComponentImpl <em>MMCLEVItemComponent</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemComponentImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemComponent()
		 * @generated
		 */
		EClass MMCLEV_ITEM_COMPONENT = eINSTANCE.getMMCLEVItemComponent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemComponentImpl <em>MMCLEVVersionedItemComponent</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemComponentImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemComponent()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_COMPONENT = eINSTANCE.getMMCLEVVersionedItemComponent();

		/**
		 * The meta object literal for the '<em><b>SwPackageURI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_COMPONENT__SW_PACKAGE_URI = eINSTANCE.getMMCLEVVersionedItemComponent_SwPackageURI();

		/**
		 * The meta object literal for the '<em><b>SwPackageVersion</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_COMPONENT__SW_PACKAGE_VERSION = eINSTANCE.getMMCLEVVersionedItemComponent_SwPackageVersion();

		/**
		 * The meta object literal for the '<em><b>Sw Interface URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_COMPONENT__SW_INTERFACE_URI = eINSTANCE.getMMCLEVVersionedItemComponent_SwInterfaceURI();

		/**
		 * The meta object literal for the '<em><b>Sw Interface Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_COMPONENT__SW_INTERFACE_VERSION = eINSTANCE.getMMCLEVVersionedItemComponent_SwInterfaceVersion();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemSAIImpl <em>MMCLEVItemSAI</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemSAIImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemSAI()
		 * @generated
		 */
		EClass MMCLEV_ITEM_SAI = eINSTANCE.getMMCLEVItemSAI();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemSAIImpl <em>MMCLEVVersionedItemSAI</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemSAIImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemSAI()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_SAI = eINSTANCE.getMMCLEVVersionedItemSAI();

		/**
		 * The meta object literal for the '<em><b>SwInterfaceURI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI = eINSTANCE.getMMCLEVVersionedItemSAI_SwInterfaceURI();

		/**
		 * The meta object literal for the '<em><b>SwInterfaceVersion</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION = eINSTANCE.getMMCLEVVersionedItemSAI_SwInterfaceVersion();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceImpl <em>MMCLEVItemInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemInterface()
		 * @generated
		 */
		EClass MMCLEV_ITEM_INTERFACE = eINSTANCE.getMMCLEVItemInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceImpl <em>MMCLEVVersionedItemInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemInterface()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_INTERFACE = eINSTANCE.getMMCLEVVersionedItemInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceMappingImpl <em>MMCLEVItemInterfaceMapping</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemInterfaceMappingImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemInterfaceMapping()
		 * @generated
		 */
		EClass MMCLEV_ITEM_INTERFACE_MAPPING = eINSTANCE.getMMCLEVItemInterfaceMapping();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceMappingImpl <em>MMCLEVVersionedItemInterfaceMapping</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemInterfaceMappingImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemInterfaceMapping()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING = eINSTANCE.getMMCLEVVersionedItemInterfaceMapping();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemServiceLibraryImpl <em>MMCLEVItemService Library</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemServiceLibrary()
		 * @generated
		 */
		EClass MMCLEV_ITEM_SERVICE_LIBRARY = eINSTANCE.getMMCLEVItemServiceLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemServiceLibraryImpl <em>MMCLEVVersionedItemService Library</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemServiceLibrary()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY = eINSTANCE.getMMCLEVVersionedItemServiceLibrary();

		/**
		 * The meta object literal for the '<em><b>SwPackageURI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__SW_PACKAGE_URI = eINSTANCE.getMMCLEVVersionedItemServiceLibrary_SwPackageURI();

		/**
		 * The meta object literal for the '<em><b>SwPackageVersion</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__SW_PACKAGE_VERSION = eINSTANCE.getMMCLEVVersionedItemServiceLibrary_SwPackageVersion();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemIODomainImpl <em>MMCLEVItemIODomain</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemIODomainImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemIODomain()
		 * @generated
		 */
		EClass MMCLEV_ITEM_IO_DOMAIN = eINSTANCE.getMMCLEVItemIODomain();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemIODomainImpl <em>MMCLEVVersionedItemIODomain</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemIODomainImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemIODomain()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_IO_DOMAIN = eINSTANCE.getMMCLEVVersionedItemIODomain();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAODomainImpl <em>MMCLEVItemAODomain</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAODomainImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemAODomain()
		 * @generated
		 */
		EClass MMCLEV_ITEM_AO_DOMAIN = eINSTANCE.getMMCLEVItemAODomain();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAODomainImpl <em>MMCLEVVersionedItemAODomain</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAODomainImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemAODomain()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_AO_DOMAIN = eINSTANCE.getMMCLEVVersionedItemAODomain();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemMCADImpl <em>MMCLEVItemMCAD</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemMCADImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemMCAD()
		 * @generated
		 */
		EClass MMCLEV_ITEM_MCAD = eINSTANCE.getMMCLEVItemMCAD();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemMCADImpl <em>MMCLEVVersionedItemMCAD</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemMCADImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemMCAD()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_MCAD = eINSTANCE.getMMCLEVVersionedItemMCAD();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractComponentImpl <em>MMCLEVItemAbstractComponent</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractComponentImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemAbstractComponent()
		 * @generated
		 */
		EClass MMCLEV_ITEM_ABSTRACT_COMPONENT = eINSTANCE.getMMCLEVItemAbstractComponent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractComponentImpl <em>MMCLEVVersionedItemAbstractComponent</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractComponentImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemAbstractComponent()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT = eINSTANCE.getMMCLEVVersionedItemAbstractComponent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractServiceLibraryImpl <em>MMCLEVItemAbstractServiceLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemAbstractServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemAbstractServiceLibrary()
		 * @generated
		 */
		EClass MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY = eINSTANCE.getMMCLEVItemAbstractServiceLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractServiceLibraryImpl <em>MMCLEVVersionedItemAbstractServiceLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemAbstractServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemAbstractServiceLibrary()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY = eINSTANCE.getMMCLEVVersionedItemAbstractServiceLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemFlatMCADImpl <em>MMCLEVItemFlatMCAD</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemFlatMCADImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemFlatMCAD()
		 * @generated
		 */
		EClass MMCLEV_ITEM_FLAT_MCAD = eINSTANCE.getMMCLEVItemFlatMCAD();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemFlatMCADImpl <em>MMCLEVVersionedItemFlatMCAD</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemFlatMCADImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemFlatMCAD()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_FLAT_MCAD = eINSTANCE.getMMCLEVVersionedItemFlatMCAD();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemDriverServiceLibraryImpl <em>MMCLEV Item Driver Service Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVItemDriverServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVItemDriverServiceLibrary()
		 * @generated
		 */
		EClass MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY = eINSTANCE.getMMCLEVItemDriverServiceLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemDriverServiceLibraryImpl <em>MMCLEV Versioned Item Driver Service Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.MMCLEVVersionedItemDriverServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl.mclevlibraryPackageImpl#getMMCLEVVersionedItemDriverServiceLibrary()
		 * @generated
		 */
		EClass MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY = eINSTANCE.getMMCLEVVersionedItemDriverServiceLibrary();

		/**
		 * The meta object literal for the '<em><b>Sw Package URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI = eINSTANCE.getMMCLEVVersionedItemDriverServiceLibrary_SwPackageURI();

		/**
		 * The meta object literal for the '<em><b>Sw Package Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION = eINSTANCE.getMMCLEVVersionedItemDriverServiceLibrary_SwPackageVersion();

	}

}