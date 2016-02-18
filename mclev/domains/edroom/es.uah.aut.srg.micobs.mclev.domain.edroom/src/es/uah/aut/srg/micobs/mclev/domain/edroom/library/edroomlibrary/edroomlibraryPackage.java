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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary;

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
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryFactory
 * @model kind="package"
 * @generated
 */
public interface edroomlibraryPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "edroomlibrary";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/domain/edroom/library/edroomlibrary";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev.domain.edroom.library";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	edroomlibraryPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMLibraryImpl <em>EDROOMLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMLibrary()
	 * @generated
	 */
	int EDROOM_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_LIBRARY__PACKAGES = commonPackage.MCOMMON_LIBRARY__PACKAGES;

	/**
	 * The number of structural features of the '<em>EDROOMLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_LIBRARY_FEATURE_COUNT = commonPackage.MCOMMON_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageImpl <em>EDROOMPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMPackage()
	 * @generated
	 */
	int EDROOM_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE__URI = commonPackage.MCOMMON_PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE__ITEMS = commonPackage.MCOMMON_PACKAGE__ITEMS;

	/**
	 * The number of structural features of the '<em>EDROOMPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageItemImpl <em>EDROOMPackageItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageItemImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMPackageItem()
	 * @generated
	 */
	int EDROOM_PACKAGE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_ITEM__VERSIONED_ITEMS = commonPackage.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_ITEM__URI = commonPackage.MCOMMON_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>EDROOMPackageItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageVersionedItemImpl <em>EDROOMPackageVersionedItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageVersionedItemImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMPackageVersionedItem()
	 * @generated
	 */
	int EDROOM_PACKAGE_VERSIONED_ITEM = 3;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_VERSIONED_ITEM__VERSION = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>EDROOMPackageVersionedItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemDataClassImpl <em>EDROOMItemDataClass</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemDataClassImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMItemDataClass()
	 * @generated
	 */
	int EDROOM_ITEM_DATA_CLASS = 4;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_ITEM_DATA_CLASS__VERSIONED_ITEMS = EDROOM_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_ITEM_DATA_CLASS__URI = EDROOM_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>EDROOMItemDataClass</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_ITEM_DATA_CLASS_FEATURE_COUNT = EDROOM_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemDataClassImpl <em>EDROOMVersionedItemDataClass</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemDataClassImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMVersionedItemDataClass()
	 * @generated
	 */
	int EDROOM_VERSIONED_ITEM_DATA_CLASS = 5;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_DATA_CLASS__LOCAL_MODEL_URI = EDROOM_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_DATA_CLASS__REMOTE_MODEL_URI = EDROOM_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_DATA_CLASS__REPOSITORY_FOLDER_URI = EDROOM_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_DATA_CLASS__VERSION = EDROOM_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>EDROOMVersionedItemDataClass</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_DATA_CLASS_FEATURE_COUNT = EDROOM_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemProtocolImpl <em>EDROOMItemProtocol</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemProtocolImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMItemProtocol()
	 * @generated
	 */
	int EDROOM_ITEM_PROTOCOL = 6;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_ITEM_PROTOCOL__VERSIONED_ITEMS = EDROOM_PACKAGE_ITEM__VERSIONED_ITEMS;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_ITEM_PROTOCOL__URI = EDROOM_PACKAGE_ITEM__URI;

	/**
	 * The number of structural features of the '<em>EDROOMItemProtocol</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_ITEM_PROTOCOL_FEATURE_COUNT = EDROOM_PACKAGE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemProtocolImpl <em>EDROOMVersionedItemProtocol</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemProtocolImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMVersionedItemProtocol()
	 * @generated
	 */
	int EDROOM_VERSIONED_ITEM_PROTOCOL = 7;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_PROTOCOL__LOCAL_MODEL_URI = EDROOM_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_PROTOCOL__REMOTE_MODEL_URI = EDROOM_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_PROTOCOL__REPOSITORY_FOLDER_URI = EDROOM_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_PROTOCOL__VERSION = EDROOM_PACKAGE_VERSIONED_ITEM__VERSION;

	/**
	 * The number of structural features of the '<em>EDROOMVersionedItemProtocol</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_VERSIONED_ITEM_PROTOCOL_FEATURE_COUNT = EDROOM_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary <em>EDROOMLibrary</em>}'.
	 * @return the meta object for class '<em>EDROOMLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary
	 * @generated
	 */
	EClass getEDROOMLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage <em>EDROOMPackage</em>}'.
	 * @return the meta object for class '<em>EDROOMPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage
	 * @generated
	 */
	EClass getEDROOMPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageItem <em>EDROOMPackageItem</em>}'.
	 * @return the meta object for class '<em>EDROOMPackageItem</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageItem
	 * @generated
	 */
	EClass getEDROOMPackageItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageVersionedItem <em>EDROOMPackageVersionedItem</em>}'.
	 * @return the meta object for class '<em>EDROOMPackageVersionedItem</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageVersionedItem
	 * @generated
	 */
	EClass getEDROOMPackageVersionedItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass <em>EDROOMItemDataClass</em>}'.
	 * @return the meta object for class '<em>EDROOMItemDataClass</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass
	 * @generated
	 */
	EClass getEDROOMItemDataClass();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass <em>EDROOMVersionedItemDataClass</em>}'.
	 * @return the meta object for class '<em>EDROOMVersionedItemDataClass</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass
	 * @generated
	 */
	EClass getEDROOMVersionedItemDataClass();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol <em>EDROOMItemProtocol</em>}'.
	 * @return the meta object for class '<em>EDROOMItemProtocol</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol
	 * @generated
	 */
	EClass getEDROOMItemProtocol();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol <em>EDROOMVersionedItemProtocol</em>}'.
	 * @return the meta object for class '<em>EDROOMVersionedItemProtocol</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol
	 * @generated
	 */
	EClass getEDROOMVersionedItemProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	edroomlibraryFactory getedroomlibraryFactory();

	/**
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMLibraryImpl <em>EDROOMLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMLibrary()
		 * @generated
		 */
		EClass EDROOM_LIBRARY = eINSTANCE.getEDROOMLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageImpl <em>EDROOMPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMPackage()
		 * @generated
		 */
		EClass EDROOM_PACKAGE = eINSTANCE.getEDROOMPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageItemImpl <em>EDROOMPackageItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageItemImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMPackageItem()
		 * @generated
		 */
		EClass EDROOM_PACKAGE_ITEM = eINSTANCE.getEDROOMPackageItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageVersionedItemImpl <em>EDROOMPackageVersionedItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMPackageVersionedItemImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMPackageVersionedItem()
		 * @generated
		 */
		EClass EDROOM_PACKAGE_VERSIONED_ITEM = eINSTANCE.getEDROOMPackageVersionedItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemDataClassImpl <em>EDROOMItemDataClass</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemDataClassImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMItemDataClass()
		 * @generated
		 */
		EClass EDROOM_ITEM_DATA_CLASS = eINSTANCE.getEDROOMItemDataClass();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemDataClassImpl <em>EDROOMVersionedItemDataClass</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemDataClassImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMVersionedItemDataClass()
		 * @generated
		 */
		EClass EDROOM_VERSIONED_ITEM_DATA_CLASS = eINSTANCE.getEDROOMVersionedItemDataClass();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemProtocolImpl <em>EDROOMItemProtocol</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMItemProtocolImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMItemProtocol()
		 * @generated
		 */
		EClass EDROOM_ITEM_PROTOCOL = eINSTANCE.getEDROOMItemProtocol();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemProtocolImpl <em>EDROOMVersionedItemProtocol</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.EDROOMVersionedItemProtocolImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryPackageImpl#getEDROOMVersionedItemProtocol()
		 * @generated
		 */
		EClass EDROOM_VERSIONED_ITEM_PROTOCOL = eINSTANCE.getEDROOMVersionedItemProtocol();

	}

}
