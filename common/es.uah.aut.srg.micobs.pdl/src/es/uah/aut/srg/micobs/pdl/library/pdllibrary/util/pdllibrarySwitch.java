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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage
 * @generated
 */
public class pdllibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static pdllibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public pdllibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = pdllibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case pdllibraryPackage.MPDL_LIBRARY: {
				MPDLLibrary mpdlLibrary = (MPDLLibrary)theEObject;
				T result = caseMPDLLibrary(mpdlLibrary);
				if (result == null) result = caseMCommonLibrary(mpdlLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_PACKAGE: {
				MPDLPackage mpdlPackage = (MPDLPackage)theEObject;
				T result = caseMPDLPackage(mpdlPackage);
				if (result == null) result = caseMCommonPackage(mpdlPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_PACKAGE_ITEM: {
				MPDLPackageItem mpdlPackageItem = (MPDLPackageItem)theEObject;
				T result = caseMPDLPackageItem(mpdlPackageItem);
				if (result == null) result = caseMCommonPackageItem(mpdlPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_PACKAGE_VERSIONED_ITEM: {
				MPDLPackageVersionedItem mpdlPackageVersionedItem = (MPDLPackageVersionedItem)theEObject;
				T result = caseMPDLPackageVersionedItem(mpdlPackageVersionedItem);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlPackageVersionedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_OPERATING_SYSTEM_API: {
				MPDLItemOperatingSystemAPI mpdlItemOperatingSystemAPI = (MPDLItemOperatingSystemAPI)theEObject;
				T result = caseMPDLItemOperatingSystemAPI(mpdlItemOperatingSystemAPI);
				if (result == null) result = caseMPDLPackageItem(mpdlItemOperatingSystemAPI);
				if (result == null) result = caseMCommonPackageItem(mpdlItemOperatingSystemAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API: {
				MPDLVersionedItemOperatingSystemAPI mpdlVersionedItemOperatingSystemAPI = (MPDLVersionedItemOperatingSystemAPI)theEObject;
				T result = caseMPDLVersionedItemOperatingSystemAPI(mpdlVersionedItemOperatingSystemAPI);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemOperatingSystemAPI);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemOperatingSystemAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_OPERATING_SYSTEM: {
				MPDLItemOperatingSystem mpdlItemOperatingSystem = (MPDLItemOperatingSystem)theEObject;
				T result = caseMPDLItemOperatingSystem(mpdlItemOperatingSystem);
				if (result == null) result = caseMPDLPackageItem(mpdlItemOperatingSystem);
				if (result == null) result = caseMCommonPackageItem(mpdlItemOperatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_OPERATING_SYSTEM: {
				MPDLVersionedItemOperatingSystem mpdlVersionedItemOperatingSystem = (MPDLVersionedItemOperatingSystem)theEObject;
				T result = caseMPDLVersionedItemOperatingSystem(mpdlVersionedItemOperatingSystem);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemOperatingSystem);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemOperatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_ARCHITECTURE: {
				MPDLItemArchitecture mpdlItemArchitecture = (MPDLItemArchitecture)theEObject;
				T result = caseMPDLItemArchitecture(mpdlItemArchitecture);
				if (result == null) result = caseMPDLPackageItem(mpdlItemArchitecture);
				if (result == null) result = caseMCommonPackageItem(mpdlItemArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_ARCHITECTURE: {
				MPDLVersionedItemArchitecture mpdlVersionedItemArchitecture = (MPDLVersionedItemArchitecture)theEObject;
				T result = caseMPDLVersionedItemArchitecture(mpdlVersionedItemArchitecture);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemArchitecture);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_MICROPROCESSOR: {
				MPDLItemMicroprocessor mpdlItemMicroprocessor = (MPDLItemMicroprocessor)theEObject;
				T result = caseMPDLItemMicroprocessor(mpdlItemMicroprocessor);
				if (result == null) result = caseMPDLPackageItem(mpdlItemMicroprocessor);
				if (result == null) result = caseMCommonPackageItem(mpdlItemMicroprocessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_MICROPROCESSOR: {
				MPDLVersionedItemMicroprocessor mpdlVersionedItemMicroprocessor = (MPDLVersionedItemMicroprocessor)theEObject;
				T result = caseMPDLVersionedItemMicroprocessor(mpdlVersionedItemMicroprocessor);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemMicroprocessor);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemMicroprocessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_BOARD: {
				MPDLItemBoard mpdlItemBoard = (MPDLItemBoard)theEObject;
				T result = caseMPDLItemBoard(mpdlItemBoard);
				if (result == null) result = caseMPDLPackageItem(mpdlItemBoard);
				if (result == null) result = caseMCommonPackageItem(mpdlItemBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_BOARD: {
				MPDLVersionedItemBoard mpdlVersionedItemBoard = (MPDLVersionedItemBoard)theEObject;
				T result = caseMPDLVersionedItemBoard(mpdlVersionedItemBoard);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemBoard);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_PLATFORM: {
				MPDLItemPlatform mpdlItemPlatform = (MPDLItemPlatform)theEObject;
				T result = caseMPDLItemPlatform(mpdlItemPlatform);
				if (result == null) result = caseMPDLPackageItem(mpdlItemPlatform);
				if (result == null) result = caseMCommonPackageItem(mpdlItemPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_PLATFORM: {
				MPDLVersionedItemPlatform mpdlVersionedItemPlatform = (MPDLVersionedItemPlatform)theEObject;
				T result = caseMPDLVersionedItemPlatform(mpdlVersionedItemPlatform);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemPlatform);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_COMPILER: {
				MPDLItemCompiler mpdlItemCompiler = (MPDLItemCompiler)theEObject;
				T result = caseMPDLItemCompiler(mpdlItemCompiler);
				if (result == null) result = caseMPDLPackageItem(mpdlItemCompiler);
				if (result == null) result = caseMCommonPackageItem(mpdlItemCompiler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_COMPILER: {
				MPDLVersionedItemCompiler mpdlVersionedItemCompiler = (MPDLVersionedItemCompiler)theEObject;
				T result = caseMPDLVersionedItemCompiler(mpdlVersionedItemCompiler);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemCompiler);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemCompiler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_ITEM_DEVICE: {
				MPDLItemDevice mpdlItemDevice = (MPDLItemDevice)theEObject;
				T result = caseMPDLItemDevice(mpdlItemDevice);
				if (result == null) result = caseMPDLPackageItem(mpdlItemDevice);
				if (result == null) result = caseMCommonPackageItem(mpdlItemDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdllibraryPackage.MPDL_VERSIONED_ITEM_DEVICE: {
				MPDLVersionedItemDevice mpdlVersionedItemDevice = (MPDLVersionedItemDevice)theEObject;
				T result = caseMPDLVersionedItemDevice(mpdlVersionedItemDevice);
				if (result == null) result = caseMPDLPackageVersionedItem(mpdlVersionedItemDevice);
				if (result == null) result = caseMCommonPackageVersionedItem(mpdlVersionedItemDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLLibrary(MPDLLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLPackage(MPDLPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLPackageItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLPackageItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLPackageItem(MPDLPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLPackageVersionedItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLPackageVersionedItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLPackageVersionedItem(MPDLPackageVersionedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemOperatingSystemAPI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemOperatingSystemAPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemOperatingSystemAPI(MPDLItemOperatingSystemAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemOperatingSystemAPI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemOperatingSystemAPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemOperatingSystemAPI(MPDLVersionedItemOperatingSystemAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemOperatingSystem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemOperatingSystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemOperatingSystem(MPDLItemOperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemOperatingSystem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemOperatingSystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemOperatingSystem(MPDLVersionedItemOperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemArchitecture</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemArchitecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemArchitecture(MPDLItemArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemArchitecture</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemArchitecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemArchitecture(MPDLVersionedItemArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemMicroprocessor</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemMicroprocessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemMicroprocessor(MPDLItemMicroprocessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemMicroprocessor</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemMicroprocessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemMicroprocessor(MPDLVersionedItemMicroprocessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemBoard</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemBoard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemBoard(MPDLItemBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemBoard</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemBoard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemBoard(MPDLVersionedItemBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemPlatform(MPDLItemPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemPlatform(MPDLVersionedItemPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemCompiler</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemCompiler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemCompiler(MPDLItemCompiler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemCompiler</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemCompiler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemCompiler(MPDLVersionedItemCompiler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLItemDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLItemDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLItemDevice(MPDLItemDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLVersionedItemDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLVersionedItemDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLVersionedItemDevice(MPDLVersionedItemDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonLibrary(MCommonLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackage(MCommonPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageItem(MCommonPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageVersionedItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageVersionedItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageVersionedItem(MCommonPackageVersionedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

}