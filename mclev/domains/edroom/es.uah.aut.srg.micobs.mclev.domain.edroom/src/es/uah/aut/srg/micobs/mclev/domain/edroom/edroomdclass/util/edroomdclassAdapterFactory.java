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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
public class edroomdclassAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static edroomdclassPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public edroomdclassAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = edroomdclassPackage.eINSTANCE;
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
	protected edroomdclassSwitch<Adapter> modelSwitch =
		new edroomdclassSwitch<Adapter>() {
			@Override
			public Adapter caseEDROOMDataClass(EDROOMDataClass object) {
				return createEDROOMDataClassAdapter();
			}
			@Override
			public Adapter caseEDROOMDataField(EDROOMDataField object) {
				return createEDROOMDataFieldAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldBasic(EDROOMDataFieldBasic object) {
				return createEDROOMDataFieldBasicAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldBasicArray(EDROOMDataFieldBasicArray object) {
				return createEDROOMDataFieldBasicArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldClass(EDROOMDataFieldClass object) {
				return createEDROOMDataFieldClassAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldClassArray(EDROOMDataFieldClassArray object) {
				return createEDROOMDataFieldClassArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldUnionArray(EDROOMDataFieldUnionArray object) {
				return createEDROOMDataFieldUnionArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldUnion(EDROOMDataFieldUnion object) {
				return createEDROOMDataFieldUnionAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldEnumArray(EDROOMDataFieldEnumArray object) {
				return createEDROOMDataFieldEnumArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDataFieldEnum(EDROOMDataFieldEnum object) {
				return createEDROOMDataFieldEnumAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinition(EDROOMDataDefinition object) {
				return createEDROOMDataDefinitionAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnion(EDROOMDataDefinitionUnion object) {
				return createEDROOMDataDefinitionUnionAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElement(EDROOMDataDefinitionUnionElement object) {
				return createEDROOMDataDefinitionUnionElementAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementBasic(EDROOMDataDefinitionUnionElementBasic object) {
				return createEDROOMDataDefinitionUnionElementBasicAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementClass(EDROOMDataDefinitionUnionElementClass object) {
				return createEDROOMDataDefinitionUnionElementClassAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementBasicArray(EDROOMDataDefinitionUnionElementBasicArray object) {
				return createEDROOMDataDefinitionUnionElementBasicArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementClassArray(EDROOMDataDefinitionUnionElementClassArray object) {
				return createEDROOMDataDefinitionUnionElementClassArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementUnion(EDROOMDataDefinitionUnionElementUnion object) {
				return createEDROOMDataDefinitionUnionElementUnionAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementUnionArray(EDROOMDataDefinitionUnionElementUnionArray object) {
				return createEDROOMDataDefinitionUnionElementUnionArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionEnum(EDROOMDataDefinitionEnum object) {
				return createEDROOMDataDefinitionEnumAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionEnumElement(EDROOMDataDefinitionEnumElement object) {
				return createEDROOMDataDefinitionEnumElementAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementEnum(EDROOMDataDefinitionUnionElementEnum object) {
				return createEDROOMDataDefinitionUnionElementEnumAdapter();
			}
			@Override
			public Adapter caseEDROOMDataDefinitionUnionElementEnumArray(EDROOMDataDefinitionUnionElementEnumArray object) {
				return createEDROOMDataDefinitionUnionElementEnumArrayAdapter();
			}
			@Override
			public Adapter caseEDROOMDCLASSPackageFile(EDROOMDCLASSPackageFile object) {
				return createEDROOMDCLASSPackageFileAdapter();
			}
			@Override
			public Adapter caseEDROOMDCLASSPackageElement(EDROOMDCLASSPackageElement object) {
				return createEDROOMDCLASSPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageElement(MCommonPackageElement object) {
				return createMCommonPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
			}
			@Override
			public Adapter caseMCommonPackageFile(MCommonPackageFile object) {
				return createMCommonPackageFileAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass <em>EDROOMDataClass</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass
	 * @generated
	 */
	public Adapter createEDROOMDataClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField <em>EDROOMDataField</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField
	 * @generated
	 */
	public Adapter createEDROOMDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic <em>EDROOMDataFieldBasic</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic
	 * @generated
	 */
	public Adapter createEDROOMDataFieldBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray <em>EDROOMDataFieldBasicArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray
	 * @generated
	 */
	public Adapter createEDROOMDataFieldBasicArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass <em>EDROOMDataFieldClass</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass
	 * @generated
	 */
	public Adapter createEDROOMDataFieldClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray <em>EDROOMDataFieldClassArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray
	 * @generated
	 */
	public Adapter createEDROOMDataFieldClassArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray <em>EDROOMDataFieldUnionArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray
	 * @generated
	 */
	public Adapter createEDROOMDataFieldUnionArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion <em>EDROOMDataFieldUnion</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion
	 * @generated
	 */
	public Adapter createEDROOMDataFieldUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray <em>EDROOMDataFieldEnumArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray
	 * @generated
	 */
	public Adapter createEDROOMDataFieldEnumArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum <em>EDROOMDataFieldEnum</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum
	 * @generated
	 */
	public Adapter createEDROOMDataFieldEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition <em>EDROOMDataDefinition</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion <em>EDROOMDataDefinitionUnion</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement <em>EDROOMDataDefinitionUnionElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic <em>EDROOMDataDefinitionUnionElementBasic</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass <em>EDROOMDataDefinitionUnionElementClass</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray <em>EDROOMDataDefinitionUnionElementBasicArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementBasicArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray <em>EDROOMDataDefinitionUnionElementClassArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementClassArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion <em>EDROOMDataDefinitionUnionElementUnion</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray <em>EDROOMDataDefinitionUnionElementUnionArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementUnionArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum <em>EDROOMDataDefinitionEnum</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement <em>EDROOMDataDefinitionEnumElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionEnumElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum <em>EDROOMDataDefinitionUnionElementEnum</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray <em>EDROOMDataDefinitionUnionElementEnumArray</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray
	 * @generated
	 */
	public Adapter createEDROOMDataDefinitionUnionElementEnumArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile <em>EDROOMDCLASSPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile
	 * @generated
	 */
	public Adapter createEDROOMDCLASSPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageElement <em>EDROOMDCLASSPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageElement
	 * @generated
	 */
	public Adapter createEDROOMDCLASSPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement <em>MCommonPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement
	 * @generated
	 */
	public Adapter createMCommonPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommonReferenceableObj</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	public Adapter createMCommonReferenceableObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile <em>MCommonPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageFile
	 * @generated
	 */
	public Adapter createMCommonPackageFileAdapter() {
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
