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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
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
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage
 * @generated
 */
public class mesplibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mesplibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mesplibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = mesplibraryPackage.eINSTANCE;
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
			case mesplibraryPackage.MMESP_LIBRARY: {
				MMESPLibrary mmespLibrary = (MMESPLibrary)theEObject;
				T result = caseMMESPLibrary(mmespLibrary);
				if (result == null) result = caseMCommonLibrary(mmespLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_PACKAGE: {
				MMESPPackage mmespPackage = (MMESPPackage)theEObject;
				T result = caseMMESPPackage(mmespPackage);
				if (result == null) result = caseMCommonPackage(mmespPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_PACKAGE_ITEM: {
				MMESPPackageItem mmespPackageItem = (MMESPPackageItem)theEObject;
				T result = caseMMESPPackageItem(mmespPackageItem);
				if (result == null) result = caseMCommonPackageItem(mmespPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_PACKAGE_VERSIONED_ITEM: {
				MMESPPackageVersionedItem mmespPackageVersionedItem = (MMESPPackageVersionedItem)theEObject;
				T result = caseMMESPPackageVersionedItem(mmespPackageVersionedItem);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespPackageVersionedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY: {
				MMESPPackageVersionedItemWithRepository mmespPackageVersionedItemWithRepository = (MMESPPackageVersionedItemWithRepository)theEObject;
				T result = caseMMESPPackageVersionedItemWithRepository(mmespPackageVersionedItemWithRepository);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespPackageVersionedItemWithRepository);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespPackageVersionedItemWithRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_SW_PACKAGE: {
				MMESPItemSwPackage mmespItemSwPackage = (MMESPItemSwPackage)theEObject;
				T result = caseMMESPItemSwPackage(mmespItemSwPackage);
				if (result == null) result = caseMMESPPackageItem(mmespItemSwPackage);
				if (result == null) result = caseMCommonPackageItem(mmespItemSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_SW_PACKAGE: {
				MMESPVersionedItemSwPackage mmespVersionedItemSwPackage = (MMESPVersionedItemSwPackage)theEObject;
				T result = caseMMESPVersionedItemSwPackage(mmespVersionedItemSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItemWithRepository(mmespVersionedItemSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespVersionedItemSwPackage);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_SW_INTERFACE: {
				MMESPItemSwInterface mmespItemSwInterface = (MMESPItemSwInterface)theEObject;
				T result = caseMMESPItemSwInterface(mmespItemSwInterface);
				if (result == null) result = caseMMESPPackageItem(mmespItemSwInterface);
				if (result == null) result = caseMCommonPackageItem(mmespItemSwInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_SW_INTERFACE: {
				MMESPVersionedItemSwInterface mmespVersionedItemSwInterface = (MMESPVersionedItemSwInterface)theEObject;
				T result = caseMMESPVersionedItemSwInterface(mmespVersionedItemSwInterface);
				if (result == null) result = caseMMESPPackageVersionedItemWithRepository(mmespVersionedItemSwInterface);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespVersionedItemSwInterface);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemSwInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_OS_SW_PACKAGE: {
				MMESPItemOSSwPackage mmespItemOSSwPackage = (MMESPItemOSSwPackage)theEObject;
				T result = caseMMESPItemOSSwPackage(mmespItemOSSwPackage);
				if (result == null) result = caseMMESPPackageItem(mmespItemOSSwPackage);
				if (result == null) result = caseMCommonPackageItem(mmespItemOSSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_OS_SW_PACKAGE: {
				MMESPVersionedItemOSSwPackage mmespVersionedItemOSSwPackage = (MMESPVersionedItemOSSwPackage)theEObject;
				T result = caseMMESPVersionedItemOSSwPackage(mmespVersionedItemOSSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItemWithRepository(mmespVersionedItemOSSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespVersionedItemOSSwPackage);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemOSSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_OS_SW_INTERFACE: {
				MMESPItemOSSwInterface mmespItemOSSwInterface = (MMESPItemOSSwInterface)theEObject;
				T result = caseMMESPItemOSSwInterface(mmespItemOSSwInterface);
				if (result == null) result = caseMMESPPackageItem(mmespItemOSSwInterface);
				if (result == null) result = caseMCommonPackageItem(mmespItemOSSwInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_OS_SW_INTERFACE: {
				MMESPVersionedItemOSSwInterface mmespVersionedItemOSSwInterface = (MMESPVersionedItemOSSwInterface)theEObject;
				T result = caseMMESPVersionedItemOSSwInterface(mmespVersionedItemOSSwInterface);
				if (result == null) result = caseMMESPPackageVersionedItemWithRepository(mmespVersionedItemOSSwInterface);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespVersionedItemOSSwInterface);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemOSSwInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_PLATFORM_SW_PACKAGE: {
				MMESPItemPlatformSwPackage mmespItemPlatformSwPackage = (MMESPItemPlatformSwPackage)theEObject;
				T result = caseMMESPItemPlatformSwPackage(mmespItemPlatformSwPackage);
				if (result == null) result = caseMMESPPackageItem(mmespItemPlatformSwPackage);
				if (result == null) result = caseMCommonPackageItem(mmespItemPlatformSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE: {
				MMESPVersionedItemPlatformSwPackage mmespVersionedItemPlatformSwPackage = (MMESPVersionedItemPlatformSwPackage)theEObject;
				T result = caseMMESPVersionedItemPlatformSwPackage(mmespVersionedItemPlatformSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItemWithRepository(mmespVersionedItemPlatformSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespVersionedItemPlatformSwPackage);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemPlatformSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_DEPLOYMENT: {
				MMESPItemDeployment mmespItemDeployment = (MMESPItemDeployment)theEObject;
				T result = caseMMESPItemDeployment(mmespItemDeployment);
				if (result == null) result = caseMMESPPackageItem(mmespItemDeployment);
				if (result == null) result = caseMCommonPackageItem(mmespItemDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_DEPLOYMENT: {
				MMESPVersionedItemDeployment mmespVersionedItemDeployment = (MMESPVersionedItemDeployment)theEObject;
				T result = caseMMESPVersionedItemDeployment(mmespVersionedItemDeployment);
				if (result == null) result = caseMMESPPackageVersionedItemWithRepository(mmespVersionedItemDeployment);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespVersionedItemDeployment);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_ABSTRACT_SW_PACKAGE: {
				MMESPItemAbstractSwPackage mmespItemAbstractSwPackage = (MMESPItemAbstractSwPackage)theEObject;
				T result = caseMMESPItemAbstractSwPackage(mmespItemAbstractSwPackage);
				if (result == null) result = caseMMESPPackageItem(mmespItemAbstractSwPackage);
				if (result == null) result = caseMCommonPackageItem(mmespItemAbstractSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE: {
				MMESPVersionedItemAbstractSwPackage mmespVersionedItemAbstractSwPackage = (MMESPVersionedItemAbstractSwPackage)theEObject;
				T result = caseMMESPVersionedItemAbstractSwPackage(mmespVersionedItemAbstractSwPackage);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemAbstractSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_CONSTRUCTION_TOOL: {
				MMESPItemConstructionTool mmespItemConstructionTool = (MMESPItemConstructionTool)theEObject;
				T result = caseMMESPItemConstructionTool(mmespItemConstructionTool);
				if (result == null) result = caseMMESPPackageItem(mmespItemConstructionTool);
				if (result == null) result = caseMCommonPackageItem(mmespItemConstructionTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL: {
				MMESPVersionedItemConstructionTool mmespVersionedItemConstructionTool = (MMESPVersionedItemConstructionTool)theEObject;
				T result = caseMMESPVersionedItemConstructionTool(mmespVersionedItemConstructionTool);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemConstructionTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_ITEM_DRIVER_SW_PACKAGE: {
				MMESPItemDriverSwPackage mmespItemDriverSwPackage = (MMESPItemDriverSwPackage)theEObject;
				T result = caseMMESPItemDriverSwPackage(mmespItemDriverSwPackage);
				if (result == null) result = caseMMESPPackageItem(mmespItemDriverSwPackage);
				if (result == null) result = caseMCommonPackageItem(mmespItemDriverSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesplibraryPackage.MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE: {
				MMESPVersionedItemDriverSwPackage mmespVersionedItemDriverSwPackage = (MMESPVersionedItemDriverSwPackage)theEObject;
				T result = caseMMESPVersionedItemDriverSwPackage(mmespVersionedItemDriverSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItemWithRepository(mmespVersionedItemDriverSwPackage);
				if (result == null) result = caseMMESPPackageVersionedItem(mmespVersionedItemDriverSwPackage);
				if (result == null) result = caseMCommonPackageVersionedItem(mmespVersionedItemDriverSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPLibrary(MMESPLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPPackage(MMESPPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPPackageItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPPackageItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPPackageItem(MMESPPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPPackageVersionedItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPPackageVersionedItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPPackageVersionedItem(MMESPPackageVersionedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPPackageVersionedItemWithRepository</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPPackageVersionedItemWithRepository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPPackageVersionedItemWithRepository(MMESPPackageVersionedItemWithRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemSwPackage(MMESPItemSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemSwPackage(MMESPVersionedItemSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemSwInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemSwInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemSwInterface(MMESPItemSwInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemSwInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemSwInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemSwInterface(MMESPVersionedItemSwInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemOSSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemOSSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemOSSwPackage(MMESPItemOSSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemOSSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemOSSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemOSSwPackage(MMESPVersionedItemOSSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemOSSwInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemOSSwInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemOSSwInterface(MMESPItemOSSwInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemOSSwInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemOSSwInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemOSSwInterface(MMESPVersionedItemOSSwInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemPlatformSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemPlatformSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemPlatformSwPackage(MMESPItemPlatformSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemPlatformSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemPlatformSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemPlatformSwPackage(MMESPVersionedItemPlatformSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemDeployment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemDeployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemDeployment(MMESPItemDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemDeployment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemDeployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemDeployment(MMESPVersionedItemDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemAbstractSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemAbstractSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemAbstractSwPackage(MMESPItemAbstractSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemAbstractSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemAbstractSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemAbstractSwPackage(MMESPVersionedItemAbstractSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemConstructionTool</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemConstructionTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemConstructionTool(MMESPItemConstructionTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemConstructionTool</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemConstructionTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemConstructionTool(MMESPVersionedItemConstructionTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPItemDriverSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPItemDriverSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPItemDriverSwPackage(MMESPItemDriverSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPVersionedItemDriverSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPVersionedItemDriverSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPVersionedItemDriverSwPackage(MMESPVersionedItemDriverSwPackage object) {
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