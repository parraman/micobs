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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemArchitecture;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemBoard;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemCompiler;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemDevice;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemMicroprocessor;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLLibrary;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemArchitecture;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemBoard;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemCompiler;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemDevice;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemMicroprocessor;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryFactory;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class pdllibraryFactoryImpl extends EFactoryImpl implements pdllibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static pdllibraryFactory init() {
		try {
			pdllibraryFactory thepdllibraryFactory = (pdllibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/library/pdllibrary"); 
			if (thepdllibraryFactory != null) {
				return thepdllibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new pdllibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public pdllibraryFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case pdllibraryPackage.MPDL_LIBRARY: return createMPDLLibrary();
			case pdllibraryPackage.MPDL_PACKAGE: return createMPDLPackage();
			case pdllibraryPackage.MPDL_ITEM_OPERATING_SYSTEM_API: return createMPDLItemOperatingSystemAPI();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API: return createMPDLVersionedItemOperatingSystemAPI();
			case pdllibraryPackage.MPDL_ITEM_OPERATING_SYSTEM: return createMPDLItemOperatingSystem();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_OPERATING_SYSTEM: return createMPDLVersionedItemOperatingSystem();
			case pdllibraryPackage.MPDL_ITEM_ARCHITECTURE: return createMPDLItemArchitecture();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_ARCHITECTURE: return createMPDLVersionedItemArchitecture();
			case pdllibraryPackage.MPDL_ITEM_MICROPROCESSOR: return createMPDLItemMicroprocessor();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_MICROPROCESSOR: return createMPDLVersionedItemMicroprocessor();
			case pdllibraryPackage.MPDL_ITEM_BOARD: return createMPDLItemBoard();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_BOARD: return createMPDLVersionedItemBoard();
			case pdllibraryPackage.MPDL_ITEM_PLATFORM: return createMPDLItemPlatform();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_PLATFORM: return createMPDLVersionedItemPlatform();
			case pdllibraryPackage.MPDL_ITEM_COMPILER: return createMPDLItemCompiler();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_COMPILER: return createMPDLVersionedItemCompiler();
			case pdllibraryPackage.MPDL_ITEM_DEVICE: return createMPDLItemDevice();
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_DEVICE: return createMPDLVersionedItemDevice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MPDLLibrary createMPDLLibrary() {
		MPDLLibraryImpl mpdlLibrary = new MPDLLibraryImpl();
		return mpdlLibrary;
	}

	/**
	 * @generated
	 */
	public MPDLPackage createMPDLPackage() {
		MPDLPackageImpl mpdlPackage = new MPDLPackageImpl();
		return mpdlPackage;
	}

	/**
	 * @generated
	 */
	public MPDLItemOperatingSystemAPI createMPDLItemOperatingSystemAPI() {
		MPDLItemOperatingSystemAPIImpl mpdlItemOperatingSystemAPI = new MPDLItemOperatingSystemAPIImpl();
		return mpdlItemOperatingSystemAPI;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemOperatingSystemAPI createMPDLVersionedItemOperatingSystemAPI() {
		MPDLVersionedItemOperatingSystemAPIImpl mpdlVersionedItemOperatingSystemAPI = new MPDLVersionedItemOperatingSystemAPIImpl();
		return mpdlVersionedItemOperatingSystemAPI;
	}

	/**
	 * @generated
	 */
	public MPDLItemOperatingSystem createMPDLItemOperatingSystem() {
		MPDLItemOperatingSystemImpl mpdlItemOperatingSystem = new MPDLItemOperatingSystemImpl();
		return mpdlItemOperatingSystem;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemOperatingSystem createMPDLVersionedItemOperatingSystem() {
		MPDLVersionedItemOperatingSystemImpl mpdlVersionedItemOperatingSystem = new MPDLVersionedItemOperatingSystemImpl();
		return mpdlVersionedItemOperatingSystem;
	}

	/**
	 * @generated
	 */
	public MPDLItemArchitecture createMPDLItemArchitecture() {
		MPDLItemArchitectureImpl mpdlItemArchitecture = new MPDLItemArchitectureImpl();
		return mpdlItemArchitecture;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemArchitecture createMPDLVersionedItemArchitecture() {
		MPDLVersionedItemArchitectureImpl mpdlVersionedItemArchitecture = new MPDLVersionedItemArchitectureImpl();
		return mpdlVersionedItemArchitecture;
	}

	/**
	 * @generated
	 */
	public MPDLItemMicroprocessor createMPDLItemMicroprocessor() {
		MPDLItemMicroprocessorImpl mpdlItemMicroprocessor = new MPDLItemMicroprocessorImpl();
		return mpdlItemMicroprocessor;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemMicroprocessor createMPDLVersionedItemMicroprocessor() {
		MPDLVersionedItemMicroprocessorImpl mpdlVersionedItemMicroprocessor = new MPDLVersionedItemMicroprocessorImpl();
		return mpdlVersionedItemMicroprocessor;
	}

	/**
	 * @generated
	 */
	public MPDLItemBoard createMPDLItemBoard() {
		MPDLItemBoardImpl mpdlItemBoard = new MPDLItemBoardImpl();
		return mpdlItemBoard;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemBoard createMPDLVersionedItemBoard() {
		MPDLVersionedItemBoardImpl mpdlVersionedItemBoard = new MPDLVersionedItemBoardImpl();
		return mpdlVersionedItemBoard;
	}

	/**
	 * @generated
	 */
	public MPDLItemPlatform createMPDLItemPlatform() {
		MPDLItemPlatformImpl mpdlItemPlatform = new MPDLItemPlatformImpl();
		return mpdlItemPlatform;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemPlatform createMPDLVersionedItemPlatform() {
		MPDLVersionedItemPlatformImpl mpdlVersionedItemPlatform = new MPDLVersionedItemPlatformImpl();
		return mpdlVersionedItemPlatform;
	}

	/**
	 * @generated
	 */
	public MPDLItemCompiler createMPDLItemCompiler() {
		MPDLItemCompilerImpl mpdlItemCompiler = new MPDLItemCompilerImpl();
		return mpdlItemCompiler;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemCompiler createMPDLVersionedItemCompiler() {
		MPDLVersionedItemCompilerImpl mpdlVersionedItemCompiler = new MPDLVersionedItemCompilerImpl();
		return mpdlVersionedItemCompiler;
	}

	/**
	 * @generated
	 */
	public MPDLItemDevice createMPDLItemDevice() {
		MPDLItemDeviceImpl mpdlItemDevice = new MPDLItemDeviceImpl();
		return mpdlItemDevice;
	}

	/**
	 * @generated
	 */
	public MPDLVersionedItemDevice createMPDLVersionedItemDevice() {
		MPDLVersionedItemDeviceImpl mpdlVersionedItemDevice = new MPDLVersionedItemDeviceImpl();
		return mpdlVersionedItemDevice;
	}

	/**
	 * @generated
	 */
	public pdllibraryPackage getpdllibraryPackage() {
		return (pdllibraryPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static pdllibraryPackage getPackage() {
		return pdllibraryPackage.eINSTANCE;
	}

}
