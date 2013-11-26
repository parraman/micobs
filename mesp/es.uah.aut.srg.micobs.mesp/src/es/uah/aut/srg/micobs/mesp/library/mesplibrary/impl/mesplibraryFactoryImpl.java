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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDeployment;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPLibrary;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryFactory;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mesplibraryFactoryImpl extends EFactoryImpl implements mesplibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mesplibraryFactory init() {
		try {
			mesplibraryFactory themesplibraryFactory = (mesplibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mesp/library/mesplibrary"); 
			if (themesplibraryFactory != null) {
				return themesplibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mesplibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mesplibraryFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mesplibraryPackage.MMESP_LIBRARY: return createMMESPLibrary();
			case mesplibraryPackage.MMESP_PACKAGE: return createMMESPPackage();
			case mesplibraryPackage.MMESP_ITEM_SW_PACKAGE: return createMMESPItemSwPackage();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_SW_PACKAGE: return createMMESPVersionedItemSwPackage();
			case mesplibraryPackage.MMESP_ITEM_SW_INTERFACE: return createMMESPItemSwInterface();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_SW_INTERFACE: return createMMESPVersionedItemSwInterface();
			case mesplibraryPackage.MMESP_ITEM_OS_SW_PACKAGE: return createMMESPItemOSSwPackage();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_OS_SW_PACKAGE: return createMMESPVersionedItemOSSwPackage();
			case mesplibraryPackage.MMESP_ITEM_OS_SW_INTERFACE: return createMMESPItemOSSwInterface();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_OS_SW_INTERFACE: return createMMESPVersionedItemOSSwInterface();
			case mesplibraryPackage.MMESP_ITEM_PLATFORM_SW_PACKAGE: return createMMESPItemPlatformSwPackage();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE: return createMMESPVersionedItemPlatformSwPackage();
			case mesplibraryPackage.MMESP_ITEM_DEPLOYMENT: return createMMESPItemDeployment();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_DEPLOYMENT: return createMMESPVersionedItemDeployment();
			case mesplibraryPackage.MMESP_ITEM_ABSTRACT_SW_PACKAGE: return createMMESPItemAbstractSwPackage();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE: return createMMESPVersionedItemAbstractSwPackage();
			case mesplibraryPackage.MMESP_ITEM_CONSTRUCTION_TOOL: return createMMESPItemConstructionTool();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL: return createMMESPVersionedItemConstructionTool();
			case mesplibraryPackage.MMESP_ITEM_DRIVER_SW_PACKAGE: return createMMESPItemDriverSwPackage();
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE: return createMMESPVersionedItemDriverSwPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MMESPLibrary createMMESPLibrary() {
		MMESPLibraryImpl mmespLibrary = new MMESPLibraryImpl();
		return mmespLibrary;
	}

	/**
	 * @generated
	 */
	public MMESPPackage createMMESPPackage() {
		MMESPPackageImpl mmespPackage = new MMESPPackageImpl();
		return mmespPackage;
	}

	/**
	 * @generated
	 */
	public MMESPItemSwPackage createMMESPItemSwPackage() {
		MMESPItemSwPackageImpl mmespItemSwPackage = new MMESPItemSwPackageImpl();
		return mmespItemSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemSwPackage createMMESPVersionedItemSwPackage() {
		MMESPVersionedItemSwPackageImpl mmespVersionedItemSwPackage = new MMESPVersionedItemSwPackageImpl();
		return mmespVersionedItemSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPItemSwInterface createMMESPItemSwInterface() {
		MMESPItemSwInterfaceImpl mmespItemSwInterface = new MMESPItemSwInterfaceImpl();
		return mmespItemSwInterface;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemSwInterface createMMESPVersionedItemSwInterface() {
		MMESPVersionedItemSwInterfaceImpl mmespVersionedItemSwInterface = new MMESPVersionedItemSwInterfaceImpl();
		return mmespVersionedItemSwInterface;
	}

	/**
	 * @generated
	 */
	public MMESPItemOSSwPackage createMMESPItemOSSwPackage() {
		MMESPItemOSSwPackageImpl mmespItemOSSwPackage = new MMESPItemOSSwPackageImpl();
		return mmespItemOSSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemOSSwPackage createMMESPVersionedItemOSSwPackage() {
		MMESPVersionedItemOSSwPackageImpl mmespVersionedItemOSSwPackage = new MMESPVersionedItemOSSwPackageImpl();
		return mmespVersionedItemOSSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPItemOSSwInterface createMMESPItemOSSwInterface() {
		MMESPItemOSSwInterfaceImpl mmespItemOSSwInterface = new MMESPItemOSSwInterfaceImpl();
		return mmespItemOSSwInterface;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemOSSwInterface createMMESPVersionedItemOSSwInterface() {
		MMESPVersionedItemOSSwInterfaceImpl mmespVersionedItemOSSwInterface = new MMESPVersionedItemOSSwInterfaceImpl();
		return mmespVersionedItemOSSwInterface;
	}

	/**
	 * @generated
	 */
	public MMESPItemPlatformSwPackage createMMESPItemPlatformSwPackage() {
		MMESPItemPlatformSwPackageImpl mmespItemPlatformSwPackage = new MMESPItemPlatformSwPackageImpl();
		return mmespItemPlatformSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemPlatformSwPackage createMMESPVersionedItemPlatformSwPackage() {
		MMESPVersionedItemPlatformSwPackageImpl mmespVersionedItemPlatformSwPackage = new MMESPVersionedItemPlatformSwPackageImpl();
		return mmespVersionedItemPlatformSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPItemDeployment createMMESPItemDeployment() {
		MMESPItemDeploymentImpl mmespItemDeployment = new MMESPItemDeploymentImpl();
		return mmespItemDeployment;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemDeployment createMMESPVersionedItemDeployment() {
		MMESPVersionedItemDeploymentImpl mmespVersionedItemDeployment = new MMESPVersionedItemDeploymentImpl();
		return mmespVersionedItemDeployment;
	}

	/**
	 * @generated
	 */
	public MMESPItemAbstractSwPackage createMMESPItemAbstractSwPackage() {
		MMESPItemAbstractSwPackageImpl mmespItemAbstractSwPackage = new MMESPItemAbstractSwPackageImpl();
		return mmespItemAbstractSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemAbstractSwPackage createMMESPVersionedItemAbstractSwPackage() {
		MMESPVersionedItemAbstractSwPackageImpl mmespVersionedItemAbstractSwPackage = new MMESPVersionedItemAbstractSwPackageImpl();
		return mmespVersionedItemAbstractSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPItemConstructionTool createMMESPItemConstructionTool() {
		MMESPItemConstructionToolImpl mmespItemConstructionTool = new MMESPItemConstructionToolImpl();
		return mmespItemConstructionTool;
	}

	/**
	 * @generated
	 */
	public MMESPVersionedItemConstructionTool createMMESPVersionedItemConstructionTool() {
		MMESPVersionedItemConstructionToolImpl mmespVersionedItemConstructionTool = new MMESPVersionedItemConstructionToolImpl();
		return mmespVersionedItemConstructionTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMESPItemDriverSwPackage createMMESPItemDriverSwPackage() {
		MMESPItemDriverSwPackageImpl mmespItemDriverSwPackage = new MMESPItemDriverSwPackageImpl();
		return mmespItemDriverSwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMESPVersionedItemDriverSwPackage createMMESPVersionedItemDriverSwPackage() {
		MMESPVersionedItemDriverSwPackageImpl mmespVersionedItemDriverSwPackage = new MMESPVersionedItemDriverSwPackageImpl();
		return mmespVersionedItemDriverSwPackage;
	}

	/**
	 * @generated
	 */
	public mesplibraryPackage getmesplibraryPackage() {
		return (mesplibraryPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mesplibraryPackage getPackage() {
		return mesplibraryPackage.eINSTANCE;
	}

}
