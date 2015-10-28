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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemFlatMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterface;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemSAI;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemFlatMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterface;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage
 * @generated
 */
public class mclevlibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevlibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevlibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = mclevlibraryPackage.eINSTANCE;
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
			case mclevlibraryPackage.MMCLEV_LIBRARY: {
				MMCLEVLibrary mmclevLibrary = (MMCLEVLibrary)theEObject;
				T result = caseMMCLEVLibrary(mmclevLibrary);
				if (result == null) result = caseMCommonLibrary(mmclevLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_PACKAGE: {
				MMCLEVPackage mmclevPackage = (MMCLEVPackage)theEObject;
				T result = caseMMCLEVPackage(mmclevPackage);
				if (result == null) result = caseMCommonPackage(mmclevPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_PACKAGE_ITEM: {
				MMCLEVPackageItem mmclevPackageItem = (MMCLEVPackageItem)theEObject;
				T result = caseMMCLEVPackageItem(mmclevPackageItem);
				if (result == null) result = caseMCommonPackageItem(mmclevPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_PACKAGE_VERSIONED_ITEM: {
				MMCLEVPackageVersionedItem mmclevPackageVersionedItem = (MMCLEVPackageVersionedItem)theEObject;
				T result = caseMMCLEVPackageVersionedItem(mmclevPackageVersionedItem);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevPackageVersionedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_COMPONENT: {
				MMCLEVItemComponent mmclevItemComponent = (MMCLEVItemComponent)theEObject;
				T result = caseMMCLEVItemComponent(mmclevItemComponent);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemComponent);
				if (result == null) result = caseMCommonPackageItem(mmclevItemComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_COMPONENT: {
				MMCLEVVersionedItemComponent mmclevVersionedItemComponent = (MMCLEVVersionedItemComponent)theEObject;
				T result = caseMMCLEVVersionedItemComponent(mmclevVersionedItemComponent);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemComponent);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_SAI: {
				MMCLEVItemSAI mmclevItemSAI = (MMCLEVItemSAI)theEObject;
				T result = caseMMCLEVItemSAI(mmclevItemSAI);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemSAI);
				if (result == null) result = caseMCommonPackageItem(mmclevItemSAI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI: {
				MMCLEVVersionedItemSAI mmclevVersionedItemSAI = (MMCLEVVersionedItemSAI)theEObject;
				T result = caseMMCLEVVersionedItemSAI(mmclevVersionedItemSAI);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemSAI);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemSAI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_INTERFACE: {
				MMCLEVItemInterface mmclevItemInterface = (MMCLEVItemInterface)theEObject;
				T result = caseMMCLEVItemInterface(mmclevItemInterface);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemInterface);
				if (result == null) result = caseMCommonPackageItem(mmclevItemInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_INTERFACE: {
				MMCLEVVersionedItemInterface mmclevVersionedItemInterface = (MMCLEVVersionedItemInterface)theEObject;
				T result = caseMMCLEVVersionedItemInterface(mmclevVersionedItemInterface);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemInterface);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_INTERFACE_MAPPING: {
				MMCLEVItemInterfaceMapping mmclevItemInterfaceMapping = (MMCLEVItemInterfaceMapping)theEObject;
				T result = caseMMCLEVItemInterfaceMapping(mmclevItemInterfaceMapping);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemInterfaceMapping);
				if (result == null) result = caseMCommonPackageItem(mmclevItemInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING: {
				MMCLEVVersionedItemInterfaceMapping mmclevVersionedItemInterfaceMapping = (MMCLEVVersionedItemInterfaceMapping)theEObject;
				T result = caseMMCLEVVersionedItemInterfaceMapping(mmclevVersionedItemInterfaceMapping);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemInterfaceMapping);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_SERVICE_LIBRARY: {
				MMCLEVItemServiceLibrary mmclevItemServiceLibrary = (MMCLEVItemServiceLibrary)theEObject;
				T result = caseMMCLEVItemServiceLibrary(mmclevItemServiceLibrary);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemServiceLibrary);
				if (result == null) result = caseMCommonPackageItem(mmclevItemServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY: {
				MMCLEVVersionedItemServiceLibrary mmclevVersionedItemServiceLibrary = (MMCLEVVersionedItemServiceLibrary)theEObject;
				T result = caseMMCLEVVersionedItemServiceLibrary(mmclevVersionedItemServiceLibrary);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemServiceLibrary);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_IO_DOMAIN: {
				MMCLEVItemIODomain mmclevItemIODomain = (MMCLEVItemIODomain)theEObject;
				T result = caseMMCLEVItemIODomain(mmclevItemIODomain);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemIODomain);
				if (result == null) result = caseMCommonPackageItem(mmclevItemIODomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_IO_DOMAIN: {
				MMCLEVVersionedItemIODomain mmclevVersionedItemIODomain = (MMCLEVVersionedItemIODomain)theEObject;
				T result = caseMMCLEVVersionedItemIODomain(mmclevVersionedItemIODomain);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemIODomain);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemIODomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_AO_DOMAIN: {
				MMCLEVItemAODomain mmclevItemAODomain = (MMCLEVItemAODomain)theEObject;
				T result = caseMMCLEVItemAODomain(mmclevItemAODomain);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemAODomain);
				if (result == null) result = caseMCommonPackageItem(mmclevItemAODomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_AO_DOMAIN: {
				MMCLEVVersionedItemAODomain mmclevVersionedItemAODomain = (MMCLEVVersionedItemAODomain)theEObject;
				T result = caseMMCLEVVersionedItemAODomain(mmclevVersionedItemAODomain);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemAODomain);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemAODomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_MCAD: {
				MMCLEVItemMCAD mmclevItemMCAD = (MMCLEVItemMCAD)theEObject;
				T result = caseMMCLEVItemMCAD(mmclevItemMCAD);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemMCAD);
				if (result == null) result = caseMCommonPackageItem(mmclevItemMCAD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_MCAD: {
				MMCLEVVersionedItemMCAD mmclevVersionedItemMCAD = (MMCLEVVersionedItemMCAD)theEObject;
				T result = caseMMCLEVVersionedItemMCAD(mmclevVersionedItemMCAD);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemMCAD);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemMCAD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_ABSTRACT_COMPONENT: {
				MMCLEVItemAbstractComponent mmclevItemAbstractComponent = (MMCLEVItemAbstractComponent)theEObject;
				T result = caseMMCLEVItemAbstractComponent(mmclevItemAbstractComponent);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemAbstractComponent);
				if (result == null) result = caseMCommonPackageItem(mmclevItemAbstractComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT: {
				MMCLEVVersionedItemAbstractComponent mmclevVersionedItemAbstractComponent = (MMCLEVVersionedItemAbstractComponent)theEObject;
				T result = caseMMCLEVVersionedItemAbstractComponent(mmclevVersionedItemAbstractComponent);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemAbstractComponent);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemAbstractComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY: {
				MMCLEVItemAbstractServiceLibrary mmclevItemAbstractServiceLibrary = (MMCLEVItemAbstractServiceLibrary)theEObject;
				T result = caseMMCLEVItemAbstractServiceLibrary(mmclevItemAbstractServiceLibrary);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemAbstractServiceLibrary);
				if (result == null) result = caseMCommonPackageItem(mmclevItemAbstractServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY: {
				MMCLEVVersionedItemAbstractServiceLibrary mmclevVersionedItemAbstractServiceLibrary = (MMCLEVVersionedItemAbstractServiceLibrary)theEObject;
				T result = caseMMCLEVVersionedItemAbstractServiceLibrary(mmclevVersionedItemAbstractServiceLibrary);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemAbstractServiceLibrary);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemAbstractServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_FLAT_MCAD: {
				MMCLEVItemFlatMCAD mmclevItemFlatMCAD = (MMCLEVItemFlatMCAD)theEObject;
				T result = caseMMCLEVItemFlatMCAD(mmclevItemFlatMCAD);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemFlatMCAD);
				if (result == null) result = caseMCommonPackageItem(mmclevItemFlatMCAD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_FLAT_MCAD: {
				MMCLEVVersionedItemFlatMCAD mmclevVersionedItemFlatMCAD = (MMCLEVVersionedItemFlatMCAD)theEObject;
				T result = caseMMCLEVVersionedItemFlatMCAD(mmclevVersionedItemFlatMCAD);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemFlatMCAD);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemFlatMCAD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY: {
				MMCLEVItemDriverServiceLibrary mmclevItemDriverServiceLibrary = (MMCLEVItemDriverServiceLibrary)theEObject;
				T result = caseMMCLEVItemDriverServiceLibrary(mmclevItemDriverServiceLibrary);
				if (result == null) result = caseMMCLEVPackageItem(mmclevItemDriverServiceLibrary);
				if (result == null) result = caseMCommonPackageItem(mmclevItemDriverServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY: {
				MMCLEVVersionedItemDriverServiceLibrary mmclevVersionedItemDriverServiceLibrary = (MMCLEVVersionedItemDriverServiceLibrary)theEObject;
				T result = caseMMCLEVVersionedItemDriverServiceLibrary(mmclevVersionedItemDriverServiceLibrary);
				if (result == null) result = caseMMCLEVPackageVersionedItem(mmclevVersionedItemDriverServiceLibrary);
				if (result == null) result = caseMCommonPackageVersionedItem(mmclevVersionedItemDriverServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVLibrary(MMCLEVLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVPackage(MMCLEVPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVPackageItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVPackageItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVPackageItem(MMCLEVPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVPackage VersionedItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVPackage VersionedItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVPackageVersionedItem(MMCLEVPackageVersionedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemComponent</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemComponent(MMCLEVItemComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemComponent</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemComponent(MMCLEVVersionedItemComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemSAI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemSAI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemSAI(MMCLEVItemSAI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemSAI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemSAI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemSAI(MMCLEVVersionedItemSAI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemInterface(MMCLEVItemInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemInterface(MMCLEVVersionedItemInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemInterface Mapping</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemInterface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemInterfaceMapping(MMCLEVItemInterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemInterface Mapping</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemInterface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemInterfaceMapping(MMCLEVVersionedItemInterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemServiceLibrary(MMCLEVItemServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemServiceLibrary(MMCLEVVersionedItemServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemIODomain</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemIODomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemIODomain(MMCLEVItemIODomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemIODomain</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemIODomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemIODomain(MMCLEVVersionedItemIODomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemAODomain</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemAODomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemAODomain(MMCLEVItemAODomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemAODomain</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemAODomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemAODomain(MMCLEVVersionedItemAODomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemMCAD</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemMCAD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemMCAD(MMCLEVItemMCAD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemMCAD</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemMCAD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemMCAD(MMCLEVVersionedItemMCAD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemAbstractComponent</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemAbstractComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemAbstractComponent(MMCLEVItemAbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemAbstractComponent</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemAbstractComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemAbstractComponent(MMCLEVVersionedItemAbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemAbstractServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemAbstractServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemAbstractServiceLibrary(MMCLEVItemAbstractServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemAbstractServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemAbstractServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemAbstractServiceLibrary(MMCLEVVersionedItemAbstractServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemFlatMCAD</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemFlatMCAD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemFlatMCAD(MMCLEVItemFlatMCAD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemFlatMCAD</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemFlatMCAD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemFlatMCAD(MMCLEVVersionedItemFlatMCAD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVItemDriverServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVItemDriverServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVItemDriverServiceLibrary(MMCLEVItemDriverServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemDriverServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVVersionedItemDriverServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVVersionedItemDriverServiceLibrary(MMCLEVVersionedItemDriverServiceLibrary object) {
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