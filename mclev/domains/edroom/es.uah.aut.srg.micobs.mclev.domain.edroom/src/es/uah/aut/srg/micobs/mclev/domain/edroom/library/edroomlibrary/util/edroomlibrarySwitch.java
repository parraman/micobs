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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage
 * @generated
 */
public class edroomlibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static edroomlibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public edroomlibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = edroomlibraryPackage.eINSTANCE;
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
			case edroomlibraryPackage.EDROOM_LIBRARY: {
				EDROOMLibrary edroomLibrary = (EDROOMLibrary)theEObject;
				T result = caseEDROOMLibrary(edroomLibrary);
				if (result == null) result = caseMCommonLibrary(edroomLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomlibraryPackage.EDROOM_PACKAGE: {
				EDROOMPackage edroomPackage = (EDROOMPackage)theEObject;
				T result = caseEDROOMPackage(edroomPackage);
				if (result == null) result = caseMCommonPackage(edroomPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomlibraryPackage.EDROOM_PACKAGE_ITEM: {
				EDROOMPackageItem edroomPackageItem = (EDROOMPackageItem)theEObject;
				T result = caseEDROOMPackageItem(edroomPackageItem);
				if (result == null) result = caseMCommonPackageItem(edroomPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomlibraryPackage.EDROOM_PACKAGE_VERSIONED_ITEM: {
				EDROOMPackageVersionedItem edroomPackageVersionedItem = (EDROOMPackageVersionedItem)theEObject;
				T result = caseEDROOMPackageVersionedItem(edroomPackageVersionedItem);
				if (result == null) result = caseMCommonPackageVersionedItem(edroomPackageVersionedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomlibraryPackage.EDROOM_ITEM_DATA_CLASS: {
				EDROOMItemDataClass edroomItemDataClass = (EDROOMItemDataClass)theEObject;
				T result = caseEDROOMItemDataClass(edroomItemDataClass);
				if (result == null) result = caseEDROOMPackageItem(edroomItemDataClass);
				if (result == null) result = caseMCommonPackageItem(edroomItemDataClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomlibraryPackage.EDROOM_VERSIONED_ITEM_DATA_CLASS: {
				EDROOMVersionedItemDataClass edroomVersionedItemDataClass = (EDROOMVersionedItemDataClass)theEObject;
				T result = caseEDROOMVersionedItemDataClass(edroomVersionedItemDataClass);
				if (result == null) result = caseEDROOMPackageVersionedItem(edroomVersionedItemDataClass);
				if (result == null) result = caseMCommonPackageVersionedItem(edroomVersionedItemDataClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomlibraryPackage.EDROOM_ITEM_PROTOCOL: {
				EDROOMItemProtocol edroomItemProtocol = (EDROOMItemProtocol)theEObject;
				T result = caseEDROOMItemProtocol(edroomItemProtocol);
				if (result == null) result = caseEDROOMPackageItem(edroomItemProtocol);
				if (result == null) result = caseMCommonPackageItem(edroomItemProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomlibraryPackage.EDROOM_VERSIONED_ITEM_PROTOCOL: {
				EDROOMVersionedItemProtocol edroomVersionedItemProtocol = (EDROOMVersionedItemProtocol)theEObject;
				T result = caseEDROOMVersionedItemProtocol(edroomVersionedItemProtocol);
				if (result == null) result = caseEDROOMPackageVersionedItem(edroomVersionedItemProtocol);
				if (result == null) result = caseMCommonPackageVersionedItem(edroomVersionedItemProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMLibrary(EDROOMLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMPackage(EDROOMPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMPackageItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMPackageItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMPackageItem(EDROOMPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMPackageVersionedItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMPackageVersionedItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMPackageVersionedItem(EDROOMPackageVersionedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMItemDataClass</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMItemDataClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMItemDataClass(EDROOMItemDataClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMVersionedItemDataClass</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMVersionedItemDataClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMVersionedItemDataClass(EDROOMVersionedItemDataClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMItemProtocol</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMItemProtocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMItemProtocol(EDROOMItemProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMVersionedItemProtocol</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMVersionedItemProtocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMVersionedItemProtocol(EDROOMVersionedItemProtocol object) {
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
