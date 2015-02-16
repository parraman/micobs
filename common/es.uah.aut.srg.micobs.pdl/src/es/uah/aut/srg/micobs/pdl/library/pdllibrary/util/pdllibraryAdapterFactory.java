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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
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
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageItem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageVersionedItem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemArchitecture;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemBoard;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemCompiler;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemDevice;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemMicroprocessor;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage
 * @generated
 */
public class pdllibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static pdllibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public pdllibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = pdllibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * @generated
	 */
	protected pdllibrarySwitch<Adapter> modelSwitch =
		new pdllibrarySwitch<Adapter>() {
			@Override
			public Adapter caseMPDLLibrary(MPDLLibrary object) {
				return createMPDLLibraryAdapter();
			}
			@Override
			public Adapter caseMPDLPackage(MPDLPackage object) {
				return createMPDLPackageAdapter();
			}
			@Override
			public Adapter caseMPDLPackageItem(MPDLPackageItem object) {
				return createMPDLPackageItemAdapter();
			}
			@Override
			public Adapter caseMPDLPackageVersionedItem(MPDLPackageVersionedItem object) {
				return createMPDLPackageVersionedItemAdapter();
			}
			@Override
			public Adapter caseMPDLItemOperatingSystemAPI(MPDLItemOperatingSystemAPI object) {
				return createMPDLItemOperatingSystemAPIAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemOperatingSystemAPI(MPDLVersionedItemOperatingSystemAPI object) {
				return createMPDLVersionedItemOperatingSystemAPIAdapter();
			}
			@Override
			public Adapter caseMPDLItemOperatingSystem(MPDLItemOperatingSystem object) {
				return createMPDLItemOperatingSystemAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemOperatingSystem(MPDLVersionedItemOperatingSystem object) {
				return createMPDLVersionedItemOperatingSystemAdapter();
			}
			@Override
			public Adapter caseMPDLItemArchitecture(MPDLItemArchitecture object) {
				return createMPDLItemArchitectureAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemArchitecture(MPDLVersionedItemArchitecture object) {
				return createMPDLVersionedItemArchitectureAdapter();
			}
			@Override
			public Adapter caseMPDLItemMicroprocessor(MPDLItemMicroprocessor object) {
				return createMPDLItemMicroprocessorAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemMicroprocessor(MPDLVersionedItemMicroprocessor object) {
				return createMPDLVersionedItemMicroprocessorAdapter();
			}
			@Override
			public Adapter caseMPDLItemBoard(MPDLItemBoard object) {
				return createMPDLItemBoardAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemBoard(MPDLVersionedItemBoard object) {
				return createMPDLVersionedItemBoardAdapter();
			}
			@Override
			public Adapter caseMPDLItemPlatform(MPDLItemPlatform object) {
				return createMPDLItemPlatformAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemPlatform(MPDLVersionedItemPlatform object) {
				return createMPDLVersionedItemPlatformAdapter();
			}
			@Override
			public Adapter caseMPDLItemCompiler(MPDLItemCompiler object) {
				return createMPDLItemCompilerAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemCompiler(MPDLVersionedItemCompiler object) {
				return createMPDLVersionedItemCompilerAdapter();
			}
			@Override
			public Adapter caseMPDLItemDevice(MPDLItemDevice object) {
				return createMPDLItemDeviceAdapter();
			}
			@Override
			public Adapter caseMPDLVersionedItemDevice(MPDLVersionedItemDevice object) {
				return createMPDLVersionedItemDeviceAdapter();
			}
			@Override
			public Adapter caseMCommonLibrary(MCommonLibrary object) {
				return createMCommonLibraryAdapter();
			}
			@Override
			public Adapter caseMCommonPackage(MCommonPackage object) {
				return createMCommonPackageAdapter();
			}
			@Override
			public Adapter caseMCommonPackageItem(MCommonPackageItem object) {
				return createMCommonPackageItemAdapter();
			}
			@Override
			public Adapter caseMCommonPackageVersionedItem(MCommonPackageVersionedItem object) {
				return createMCommonPackageVersionedItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLLibrary <em>MPDLLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLLibrary
	 * @generated
	 */
	public Adapter createMPDLLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage <em>MPDLPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage
	 * @generated
	 */
	public Adapter createMPDLPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageItem <em>MPDLPackageItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageItem
	 * @generated
	 */
	public Adapter createMPDLPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageVersionedItem <em>MPDLPackageVersionedItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageVersionedItem
	 * @generated
	 */
	public Adapter createMPDLPackageVersionedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystemAPI <em>MPDLItemOperatingSystemAPI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystemAPI
	 * @generated
	 */
	public Adapter createMPDLItemOperatingSystemAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystemAPI <em>MPDLVersionedItemOperatingSystemAPI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystemAPI
	 * @generated
	 */
	public Adapter createMPDLVersionedItemOperatingSystemAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystem <em>MPDLItemOperatingSystem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystem
	 * @generated
	 */
	public Adapter createMPDLItemOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystem <em>MPDLVersionedItemOperating System</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystem
	 * @generated
	 */
	public Adapter createMPDLVersionedItemOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemArchitecture <em>MPDLItemArchitecture</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemArchitecture
	 * @generated
	 */
	public Adapter createMPDLItemArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemArchitecture <em>MPDLVersionedItemArchitecture</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemArchitecture
	 * @generated
	 */
	public Adapter createMPDLVersionedItemArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemMicroprocessor <em>MPDLItemMicroprocessor</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemMicroprocessor
	 * @generated
	 */
	public Adapter createMPDLItemMicroprocessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemMicroprocessor <em>MPDLVersionedItemMicroprocessor</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemMicroprocessor
	 * @generated
	 */
	public Adapter createMPDLVersionedItemMicroprocessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemBoard <em>MPDLItemBoard</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemBoard
	 * @generated
	 */
	public Adapter createMPDLItemBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemBoard <em>MPDLVersionedItemBoard</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemBoard
	 * @generated
	 */
	public Adapter createMPDLVersionedItemBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemPlatform <em>MPDLItemPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemPlatform
	 * @generated
	 */
	public Adapter createMPDLItemPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemPlatform <em>MPDLVersionedItemPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemPlatform
	 * @generated
	 */
	public Adapter createMPDLVersionedItemPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemCompiler <em>MPDLItemCompiler</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemCompiler
	 * @generated
	 */
	public Adapter createMPDLItemCompilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemCompiler <em>MPDLVersionedItemCompiler</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemCompiler
	 * @generated
	 */
	public Adapter createMPDLVersionedItemCompilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemDevice <em>MPDL Item Device</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemDevice
	 * @generated
	 */
	public Adapter createMPDLItemDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemDevice <em>MPDL Versioned Item Device</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemDevice
	 * @generated
	 */
	public Adapter createMPDLVersionedItemDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonLibrary <em>MCommonLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonLibrary
	 * @generated
	 */
	public Adapter createMCommonLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackage <em>MCommonPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackage
	 * @generated
	 */
	public Adapter createMCommonPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageItem <em>MCommonPackageItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageItem
	 * @generated
	 */
	public Adapter createMCommonPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem <em>MCommonPackageVersionedItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem
	 * @generated
	 */
	public Adapter createMCommonPackageVersionedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

}
