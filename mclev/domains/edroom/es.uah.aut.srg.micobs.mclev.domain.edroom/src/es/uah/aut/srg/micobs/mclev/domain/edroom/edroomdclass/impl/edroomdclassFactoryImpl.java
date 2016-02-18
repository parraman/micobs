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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class edroomdclassFactoryImpl extends EFactoryImpl implements edroomdclassFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static edroomdclassFactory init() {
		try {
			edroomdclassFactory theedroomdclassFactory = (edroomdclassFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mclev/domain/edroom/edroomdclass");
			if (theedroomdclassFactory != null) {
				return theedroomdclassFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new edroomdclassFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public edroomdclassFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case edroomdclassPackage.EDROOM_DATA_CLASS: return createEDROOMDataClass();
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC: return createEDROOMDataFieldBasic();
			case edroomdclassPackage.EDROOM_DATA_FIELD_BASIC_ARRAY: return createEDROOMDataFieldBasicArray();
			case edroomdclassPackage.EDROOM_DATA_FIELD_CLASS: return createEDROOMDataFieldClass();
			case edroomdclassPackage.EDROOM_DATA_FIELD_CLASS_ARRAY: return createEDROOMDataFieldClassArray();
			case edroomdclassPackage.EDROOM_DATA_FIELD_UNION_ARRAY: return createEDROOMDataFieldUnionArray();
			case edroomdclassPackage.EDROOM_DATA_FIELD_UNION: return createEDROOMDataFieldUnion();
			case edroomdclassPackage.EDROOM_DATA_FIELD_ENUM_ARRAY: return createEDROOMDataFieldEnumArray();
			case edroomdclassPackage.EDROOM_DATA_FIELD_ENUM: return createEDROOMDataFieldEnum();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION: return createEDROOMDataDefinitionUnion();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC: return createEDROOMDataDefinitionUnionElementBasic();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS: return createEDROOMDataDefinitionUnionElementClass();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY: return createEDROOMDataDefinitionUnionElementBasicArray();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY: return createEDROOMDataDefinitionUnionElementClassArray();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION: return createEDROOMDataDefinitionUnionElementUnion();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY: return createEDROOMDataDefinitionUnionElementUnionArray();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM: return createEDROOMDataDefinitionEnum();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_ENUM_ELEMENT: return createEDROOMDataDefinitionEnumElement();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM: return createEDROOMDataDefinitionUnionElementEnum();
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY: return createEDROOMDataDefinitionUnionElementEnumArray();
			case edroomdclassPackage.EDROOMDCLASS_PACKAGE_FILE: return createEDROOMDCLASSPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case edroomdclassPackage.EDROOM_BASIC_TYPE:
				return createEDROOMBasicTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case edroomdclassPackage.EDROOM_BASIC_TYPE:
				return convertEDROOMBasicTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public EDROOMDataClass createEDROOMDataClass() {
		EDROOMDataClassImpl edroomDataClass = new EDROOMDataClassImpl();
		return edroomDataClass;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldBasic createEDROOMDataFieldBasic() {
		EDROOMDataFieldBasicImpl edroomDataFieldBasic = new EDROOMDataFieldBasicImpl();
		return edroomDataFieldBasic;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldBasicArray createEDROOMDataFieldBasicArray() {
		EDROOMDataFieldBasicArrayImpl edroomDataFieldBasicArray = new EDROOMDataFieldBasicArrayImpl();
		return edroomDataFieldBasicArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldClass createEDROOMDataFieldClass() {
		EDROOMDataFieldClassImpl edroomDataFieldClass = new EDROOMDataFieldClassImpl();
		return edroomDataFieldClass;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldClassArray createEDROOMDataFieldClassArray() {
		EDROOMDataFieldClassArrayImpl edroomDataFieldClassArray = new EDROOMDataFieldClassArrayImpl();
		return edroomDataFieldClassArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldUnionArray createEDROOMDataFieldUnionArray() {
		EDROOMDataFieldUnionArrayImpl edroomDataFieldUnionArray = new EDROOMDataFieldUnionArrayImpl();
		return edroomDataFieldUnionArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldUnion createEDROOMDataFieldUnion() {
		EDROOMDataFieldUnionImpl edroomDataFieldUnion = new EDROOMDataFieldUnionImpl();
		return edroomDataFieldUnion;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldEnumArray createEDROOMDataFieldEnumArray() {
		EDROOMDataFieldEnumArrayImpl edroomDataFieldEnumArray = new EDROOMDataFieldEnumArrayImpl();
		return edroomDataFieldEnumArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDataFieldEnum createEDROOMDataFieldEnum() {
		EDROOMDataFieldEnumImpl edroomDataFieldEnum = new EDROOMDataFieldEnumImpl();
		return edroomDataFieldEnum;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnion createEDROOMDataDefinitionUnion() {
		EDROOMDataDefinitionUnionImpl edroomDataDefinitionUnion = new EDROOMDataDefinitionUnionImpl();
		return edroomDataDefinitionUnion;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementBasic createEDROOMDataDefinitionUnionElementBasic() {
		EDROOMDataDefinitionUnionElementBasicImpl edroomDataDefinitionUnionElementBasic = new EDROOMDataDefinitionUnionElementBasicImpl();
		return edroomDataDefinitionUnionElementBasic;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementClass createEDROOMDataDefinitionUnionElementClass() {
		EDROOMDataDefinitionUnionElementClassImpl edroomDataDefinitionUnionElementClass = new EDROOMDataDefinitionUnionElementClassImpl();
		return edroomDataDefinitionUnionElementClass;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementBasicArray createEDROOMDataDefinitionUnionElementBasicArray() {
		EDROOMDataDefinitionUnionElementBasicArrayImpl edroomDataDefinitionUnionElementBasicArray = new EDROOMDataDefinitionUnionElementBasicArrayImpl();
		return edroomDataDefinitionUnionElementBasicArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementClassArray createEDROOMDataDefinitionUnionElementClassArray() {
		EDROOMDataDefinitionUnionElementClassArrayImpl edroomDataDefinitionUnionElementClassArray = new EDROOMDataDefinitionUnionElementClassArrayImpl();
		return edroomDataDefinitionUnionElementClassArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementUnion createEDROOMDataDefinitionUnionElementUnion() {
		EDROOMDataDefinitionUnionElementUnionImpl edroomDataDefinitionUnionElementUnion = new EDROOMDataDefinitionUnionElementUnionImpl();
		return edroomDataDefinitionUnionElementUnion;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementUnionArray createEDROOMDataDefinitionUnionElementUnionArray() {
		EDROOMDataDefinitionUnionElementUnionArrayImpl edroomDataDefinitionUnionElementUnionArray = new EDROOMDataDefinitionUnionElementUnionArrayImpl();
		return edroomDataDefinitionUnionElementUnionArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionEnum createEDROOMDataDefinitionEnum() {
		EDROOMDataDefinitionEnumImpl edroomDataDefinitionEnum = new EDROOMDataDefinitionEnumImpl();
		return edroomDataDefinitionEnum;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionEnumElement createEDROOMDataDefinitionEnumElement() {
		EDROOMDataDefinitionEnumElementImpl edroomDataDefinitionEnumElement = new EDROOMDataDefinitionEnumElementImpl();
		return edroomDataDefinitionEnumElement;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementEnum createEDROOMDataDefinitionUnionElementEnum() {
		EDROOMDataDefinitionUnionElementEnumImpl edroomDataDefinitionUnionElementEnum = new EDROOMDataDefinitionUnionElementEnumImpl();
		return edroomDataDefinitionUnionElementEnum;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnionElementEnumArray createEDROOMDataDefinitionUnionElementEnumArray() {
		EDROOMDataDefinitionUnionElementEnumArrayImpl edroomDataDefinitionUnionElementEnumArray = new EDROOMDataDefinitionUnionElementEnumArrayImpl();
		return edroomDataDefinitionUnionElementEnumArray;
	}

	/**
	 * @generated
	 */
	public EDROOMDCLASSPackageFile createEDROOMDCLASSPackageFile() {
		EDROOMDCLASSPackageFileImpl edroomdclassPackageFile = new EDROOMDCLASSPackageFileImpl();
		return edroomdclassPackageFile;
	}

	/**
	 * @generated
	 */
	public EDROOMBasicType createEDROOMBasicTypeFromString(EDataType eDataType, String initialValue) {
		EDROOMBasicType result = EDROOMBasicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * @generated
	 */
	public String convertEDROOMBasicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * @generated
	 */
	public edroomdclassPackage getedroomdclassPackage() {
		return (edroomdclassPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static edroomdclassPackage getPackage() {
		return edroomdclassPackage.eINSTANCE;
	}

}
