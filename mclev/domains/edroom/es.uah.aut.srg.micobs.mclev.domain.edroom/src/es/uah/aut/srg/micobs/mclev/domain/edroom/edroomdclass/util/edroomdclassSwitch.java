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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage
 * @generated
 */
public class edroomdclassSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static edroomdclassPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public edroomdclassSwitch() {
		if (modelPackage == null) {
			modelPackage = edroomdclassPackage.eINSTANCE;
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
			case edroomdclassPackage.EDROOM_DATA_CLASS: {
				EDROOMDataClass edroomDataClass = (EDROOMDataClass)theEObject;
				T result = caseEDROOMDataClass(edroomDataClass);
				if (result == null) result = caseEDROOMDCLASSPackageElement(edroomDataClass);
				if (result == null) result = caseMCommonPackageElement(edroomDataClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD: {
				EDROOMDataField edroomDataField = (EDROOMDataField)theEObject;
				T result = caseEDROOMDataField(edroomDataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC: {
				EDROOMDataFieldBasic edroomDataFieldBasic = (EDROOMDataFieldBasic)theEObject;
				T result = caseEDROOMDataFieldBasic(edroomDataFieldBasic);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldBasic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC_ARRAY: {
				EDROOMDataFieldBasicArray edroomDataFieldBasicArray = (EDROOMDataFieldBasicArray)theEObject;
				T result = caseEDROOMDataFieldBasicArray(edroomDataFieldBasicArray);
				if (result == null) result = caseEDROOMDataFieldBasic(edroomDataFieldBasicArray);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldBasicArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_CLASS: {
				EDROOMDataFieldClass edroomDataFieldClass = (EDROOMDataFieldClass)theEObject;
				T result = caseEDROOMDataFieldClass(edroomDataFieldClass);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_CLASS_ARRAY: {
				EDROOMDataFieldClassArray edroomDataFieldClassArray = (EDROOMDataFieldClassArray)theEObject;
				T result = caseEDROOMDataFieldClassArray(edroomDataFieldClassArray);
				if (result == null) result = caseEDROOMDataFieldClass(edroomDataFieldClassArray);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldClassArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_UNION_ARRAY: {
				EDROOMDataFieldUnionArray edroomDataFieldUnionArray = (EDROOMDataFieldUnionArray)theEObject;
				T result = caseEDROOMDataFieldUnionArray(edroomDataFieldUnionArray);
				if (result == null) result = caseEDROOMDataFieldUnion(edroomDataFieldUnionArray);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldUnionArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_UNION: {
				EDROOMDataFieldUnion edroomDataFieldUnion = (EDROOMDataFieldUnion)theEObject;
				T result = caseEDROOMDataFieldUnion(edroomDataFieldUnion);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_ENUM_ARRAY: {
				EDROOMDataFieldEnumArray edroomDataFieldEnumArray = (EDROOMDataFieldEnumArray)theEObject;
				T result = caseEDROOMDataFieldEnumArray(edroomDataFieldEnumArray);
				if (result == null) result = caseEDROOMDataFieldEnum(edroomDataFieldEnumArray);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldEnumArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_FIELD_ENUM: {
				EDROOMDataFieldEnum edroomDataFieldEnum = (EDROOMDataFieldEnum)theEObject;
				T result = caseEDROOMDataFieldEnum(edroomDataFieldEnum);
				if (result == null) result = caseEDROOMDataField(edroomDataFieldEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION: {
				EDROOMDataDefinition edroomDataDefinition = (EDROOMDataDefinition)theEObject;
				T result = caseEDROOMDataDefinition(edroomDataDefinition);
				if (result == null) result = caseMCommonReferenceableObj(edroomDataDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION: {
				EDROOMDataDefinitionUnion edroomDataDefinitionUnion = (EDROOMDataDefinitionUnion)theEObject;
				T result = caseEDROOMDataDefinitionUnion(edroomDataDefinitionUnion);
				if (result == null) result = caseEDROOMDataDefinition(edroomDataDefinitionUnion);
				if (result == null) result = caseMCommonReferenceableObj(edroomDataDefinitionUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT: {
				EDROOMDataDefinitionUnionElement edroomDataDefinitionUnionElement = (EDROOMDataDefinitionUnionElement)theEObject;
				T result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC: {
				EDROOMDataDefinitionUnionElementBasic edroomDataDefinitionUnionElementBasic = (EDROOMDataDefinitionUnionElementBasic)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementBasic(edroomDataDefinitionUnionElementBasic);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementBasic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS: {
				EDROOMDataDefinitionUnionElementClass edroomDataDefinitionUnionElementClass = (EDROOMDataDefinitionUnionElementClass)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementClass(edroomDataDefinitionUnionElementClass);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY: {
				EDROOMDataDefinitionUnionElementBasicArray edroomDataDefinitionUnionElementBasicArray = (EDROOMDataDefinitionUnionElementBasicArray)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementBasicArray(edroomDataDefinitionUnionElementBasicArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElementBasic(edroomDataDefinitionUnionElementBasicArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementBasicArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY: {
				EDROOMDataDefinitionUnionElementClassArray edroomDataDefinitionUnionElementClassArray = (EDROOMDataDefinitionUnionElementClassArray)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementClassArray(edroomDataDefinitionUnionElementClassArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElementClass(edroomDataDefinitionUnionElementClassArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementClassArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION: {
				EDROOMDataDefinitionUnionElementUnion edroomDataDefinitionUnionElementUnion = (EDROOMDataDefinitionUnionElementUnion)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementUnion(edroomDataDefinitionUnionElementUnion);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY: {
				EDROOMDataDefinitionUnionElementUnionArray edroomDataDefinitionUnionElementUnionArray = (EDROOMDataDefinitionUnionElementUnionArray)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementUnionArray(edroomDataDefinitionUnionElementUnionArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElementUnion(edroomDataDefinitionUnionElementUnionArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementUnionArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM: {
				EDROOMDataDefinitionEnum edroomDataDefinitionEnum = (EDROOMDataDefinitionEnum)theEObject;
				T result = caseEDROOMDataDefinitionEnum(edroomDataDefinitionEnum);
				if (result == null) result = caseEDROOMDataDefinition(edroomDataDefinitionEnum);
				if (result == null) result = caseMCommonReferenceableObj(edroomDataDefinitionEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT: {
				EDROOMDataDefinitionEnumElement edroomDataDefinitionEnumElement = (EDROOMDataDefinitionEnumElement)theEObject;
				T result = caseEDROOMDataDefinitionEnumElement(edroomDataDefinitionEnumElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM: {
				EDROOMDataDefinitionUnionElementEnum edroomDataDefinitionUnionElementEnum = (EDROOMDataDefinitionUnionElementEnum)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementEnum(edroomDataDefinitionUnionElementEnum);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY: {
				EDROOMDataDefinitionUnionElementEnumArray edroomDataDefinitionUnionElementEnumArray = (EDROOMDataDefinitionUnionElementEnumArray)theEObject;
				T result = caseEDROOMDataDefinitionUnionElementEnumArray(edroomDataDefinitionUnionElementEnumArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElementEnum(edroomDataDefinitionUnionElementEnumArray);
				if (result == null) result = caseEDROOMDataDefinitionUnionElement(edroomDataDefinitionUnionElementEnumArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOMDCLASS_PACKAGE_FILE: {
				EDROOMDCLASSPackageFile edroomdclassPackageFile = (EDROOMDCLASSPackageFile)theEObject;
				T result = caseEDROOMDCLASSPackageFile(edroomdclassPackageFile);
				if (result == null) result = caseMCommonPackageFile(edroomdclassPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomdclassPackage.EDROOMDCLASS_PACKAGE_ELEMENT: {
				EDROOMDCLASSPackageElement edroomdclassPackageElement = (EDROOMDCLASSPackageElement)theEObject;
				T result = caseEDROOMDCLASSPackageElement(edroomdclassPackageElement);
				if (result == null) result = caseMCommonPackageElement(edroomdclassPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataClass</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataClass(EDROOMDataClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataField</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataField(EDROOMDataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldBasic</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldBasic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldBasic(EDROOMDataFieldBasic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldBasicArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldBasicArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldBasicArray(EDROOMDataFieldBasicArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldClass</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldClass(EDROOMDataFieldClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldClassArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldClassArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldClassArray(EDROOMDataFieldClassArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldUnionArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldUnionArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldUnionArray(EDROOMDataFieldUnionArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldUnion</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldUnion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldUnion(EDROOMDataFieldUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldEnumArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldEnumArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldEnumArray(EDROOMDataFieldEnumArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataFieldEnum</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataFieldEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataFieldEnum(EDROOMDataFieldEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinition</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinition(EDROOMDataDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnion</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnion(EDROOMDataDefinitionUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElement(EDROOMDataDefinitionUnionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementBasic</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementBasic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementBasic(EDROOMDataDefinitionUnionElementBasic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementClass</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementClass(EDROOMDataDefinitionUnionElementClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementBasicArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementBasicArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementBasicArray(EDROOMDataDefinitionUnionElementBasicArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementClassArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementClassArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementClassArray(EDROOMDataDefinitionUnionElementClassArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementUnion</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementUnion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementUnion(EDROOMDataDefinitionUnionElementUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementUnionArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementUnionArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementUnionArray(EDROOMDataDefinitionUnionElementUnionArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionEnum</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionEnum(EDROOMDataDefinitionEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionEnumElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionEnumElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionEnumElement(EDROOMDataDefinitionEnumElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementEnum</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementEnum(EDROOMDataDefinitionUnionElementEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementEnumArray</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDataDefinitionUnionElementEnumArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDataDefinitionUnionElementEnumArray(EDROOMDataDefinitionUnionElementEnumArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDCLASSPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDCLASSPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDCLASSPackageFile(EDROOMDCLASSPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMDCLASSPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMDCLASSPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMDCLASSPackageElement(EDROOMDCLASSPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageElement(MCommonPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageFile(MCommonPackageFile object) {
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
