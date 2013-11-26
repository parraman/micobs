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
package es.uah.aut.srg.micobs.system.library.systemlibrary.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage
 * @generated
 */
public class systemlibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static systemlibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public systemlibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = systemlibraryPackage.eINSTANCE;
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
			case systemlibraryPackage.MSYSTEM_LIBRARY: {
				MSystemLibrary mSystemLibrary = (MSystemLibrary)theEObject;
				T result = caseMSystemLibrary(mSystemLibrary);
				if (result == null) result = caseMCommonLibrary(mSystemLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case systemlibraryPackage.MSYSTEM_PACKAGE: {
				MSystemPackage mSystemPackage = (MSystemPackage)theEObject;
				T result = caseMSystemPackage(mSystemPackage);
				if (result == null) result = caseMCommonPackage(mSystemPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case systemlibraryPackage.MSYSTEM_PACKAGE_ITEM: {
				MSystemPackageItem mSystemPackageItem = (MSystemPackageItem)theEObject;
				T result = caseMSystemPackageItem(mSystemPackageItem);
				if (result == null) result = caseMCommonPackageItem(mSystemPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case systemlibraryPackage.MSYSTEM_PACKAGE_VERSIONED_ITEM: {
				MSystemPackageVersionedItem mSystemPackageVersionedItem = (MSystemPackageVersionedItem)theEObject;
				T result = caseMSystemPackageVersionedItem(mSystemPackageVersionedItem);
				if (result == null) result = caseMCommonPackageVersionedItem(mSystemPackageVersionedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case systemlibraryPackage.MSYSTEM_ITEM_LANGUAGE: {
				MSystemItemLanguage mSystemItemLanguage = (MSystemItemLanguage)theEObject;
				T result = caseMSystemItemLanguage(mSystemItemLanguage);
				if (result == null) result = caseMSystemPackageItem(mSystemItemLanguage);
				if (result == null) result = caseMCommonPackageItem(mSystemItemLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case systemlibraryPackage.MSYSTEM_VERSIONED_ITEM_LANGUAGE: {
				MSystemVersionedItemLanguage mSystemVersionedItemLanguage = (MSystemVersionedItemLanguage)theEObject;
				T result = caseMSystemVersionedItemLanguage(mSystemVersionedItemLanguage);
				if (result == null) result = caseMSystemPackageVersionedItem(mSystemVersionedItemLanguage);
				if (result == null) result = caseMCommonPackageVersionedItem(mSystemVersionedItemLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSystemLibrary</em>'.
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSystemLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSystemLibrary(MSystemLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSystemPackage</em>'.
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSystemPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSystemPackage(MSystemPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSystemPackageItem</em>'.
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSystemPackageItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSystemPackageItem(MSystemPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSystemPackageVersionedItem</em>'.
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSystemPackageVersionedItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSystemPackageVersionedItem(MSystemPackageVersionedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSystemItemLanguage</em>'.
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSystemItemLanguage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSystemItemLanguage(MSystemItemLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSystemVersionedItemLanguage</em>'.
	 * 
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSystemVersionedItemLanguage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSystemVersionedItemLanguage(MSystemVersionedItemLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonLibrary</em>'.
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
