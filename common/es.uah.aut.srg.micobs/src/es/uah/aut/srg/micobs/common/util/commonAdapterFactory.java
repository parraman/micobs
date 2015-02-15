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
package es.uah.aut.srg.micobs.common.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MBooleanParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamRealLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamStringLiteral;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MEnumParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterCCR;
import es.uah.aut.srg.micobs.common.MParameterCOR;
import es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterOCR;
import es.uah.aut.srg.micobs.common.MParameterOOR;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValue;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueDependentItem;
import es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueLiteral;
import es.uah.aut.srg.micobs.common.MParameterValuePAR;
import es.uah.aut.srg.micobs.common.MParameterValueRange;
import es.uah.aut.srg.micobs.common.MParameterValueRealLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueRefObject;
import es.uah.aut.srg.micobs.common.MParameterValueStringLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MRealParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.common.MStringParameterSingleExpression;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.common.commonPackage
 * @generated
 */
public class commonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static commonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public commonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = commonPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
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
	protected commonSwitch<Adapter> modelSwitch =
		new commonSwitch<Adapter>() {
			@Override
			public Adapter caseMCommonPackage(MCommonPackage object) {
				return createMCommonPackageAdapter();
			}
			@Override
			public Adapter caseMCommonPackageFile(MCommonPackageFile object) {
				return createMCommonPackageFileAdapter();
			}
			@Override
			public Adapter caseMCommonPackageElement(MCommonPackageElement object) {
				return createMCommonPackageElementAdapter();
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
			public Adapter caseMCommonLibrary(MCommonLibrary object) {
				return createMCommonLibraryAdapter();
			}
			@Override
			public Adapter caseMCommonPackageReferencingElement(MCommonPackageReferencingElement object) {
				return createMCommonPackageReferencingElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageParametricReferencingElement(MCommonPackageParametricReferencingElement object) {
				return createMCommonPackageParametricReferencingElementAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
			}
			@Override
			public Adapter caseMParameter(MParameter object) {
				return createMParameterAdapter();
			}
			@Override
			public Adapter caseMParameterDefaultValueSingleExpression(MParameterDefaultValueSingleExpression object) {
				return createMParameterDefaultValueSingleExpressionAdapter();
			}
			@Override
			public Adapter caseMEnumParameterDefinition(MEnumParameterDefinition object) {
				return createMEnumParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseMBooleanParameter(MBooleanParameter object) {
				return createMBooleanParameterAdapter();
			}
			@Override
			public Adapter caseMBooleanParameterSingleExpression(MBooleanParameterSingleExpression object) {
				return createMBooleanParameterSingleExpressionAdapter();
			}
			@Override
			public Adapter caseMStringParameter(MStringParameter object) {
				return createMStringParameterAdapter();
			}
			@Override
			public Adapter caseMStringParameterSingleExpression(MStringParameterSingleExpression object) {
				return createMStringParameterSingleExpressionAdapter();
			}
			@Override
			public Adapter caseMIntegerParameter(MIntegerParameter object) {
				return createMIntegerParameterAdapter();
			}
			@Override
			public Adapter caseMIntegerParameterSingleExpression(MIntegerParameterSingleExpression object) {
				return createMIntegerParameterSingleExpressionAdapter();
			}
			@Override
			public Adapter caseMEnumParameter(MEnumParameter object) {
				return createMEnumParameterAdapter();
			}
			@Override
			public Adapter caseMEnumParameterSingleExpression(MEnumParameterSingleExpression object) {
				return createMEnumParameterSingleExpressionAdapter();
			}
			@Override
			public Adapter caseMEnumParameterLiteral(MEnumParameterLiteral object) {
				return createMEnumParameterLiteralAdapter();
			}
			@Override
			public Adapter caseMRealParameter(MRealParameter object) {
				return createMRealParameterAdapter();
			}
			@Override
			public Adapter caseMRealParameterSingleExpression(MRealParameterSingleExpression object) {
				return createMRealParameterSingleExpressionAdapter();
			}
			@Override
			public Adapter caseMParameterRange(MParameterRange object) {
				return createMParameterRangeAdapter();
			}
			@Override
			public Adapter caseMParameterOOR(MParameterOOR object) {
				return createMParameterOORAdapter();
			}
			@Override
			public Adapter caseMParameterOCR(MParameterOCR object) {
				return createMParameterOCRAdapter();
			}
			@Override
			public Adapter caseMParameterCCR(MParameterCCR object) {
				return createMParameterCCRAdapter();
			}
			@Override
			public Adapter caseMParameterCOR(MParameterCOR object) {
				return createMParameterCORAdapter();
			}
			@Override
			public Adapter caseMEnumParamIntegerLiteral(MEnumParamIntegerLiteral object) {
				return createMEnumParamIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseMEnumParamRealLiteral(MEnumParamRealLiteral object) {
				return createMEnumParamRealLiteralAdapter();
			}
			@Override
			public Adapter caseMEnumParamStringLiteral(MEnumParamStringLiteral object) {
				return createMEnumParamStringLiteralAdapter();
			}
			@Override
			public Adapter caseMParameterValue(MParameterValue object) {
				return createMParameterValueAdapter();
			}
			@Override
			public Adapter caseMParameterValueLiteral(MParameterValueLiteral object) {
				return createMParameterValueLiteralAdapter();
			}
			@Override
			public Adapter caseMParameterValueIntegerLiteral(MParameterValueIntegerLiteral object) {
				return createMParameterValueIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseMParameterValueRealLiteral(MParameterValueRealLiteral object) {
				return createMParameterValueRealLiteralAdapter();
			}
			@Override
			public Adapter caseMParameterValueBooleanLiteral(MParameterValueBooleanLiteral object) {
				return createMParameterValueBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseMParameterValueStringLiteral(MParameterValueStringLiteral object) {
				return createMParameterValueStringLiteralAdapter();
			}
			@Override
			public Adapter caseMParameterValueRefObject(MParameterValueRefObject object) {
				return createMParameterValueRefObjectAdapter();
			}
			@Override
			public Adapter caseMParameterValueExpression(MParameterValueExpression object) {
				return createMParameterValueExpressionAdapter();
			}
			@Override
			public Adapter caseMParameterValueTERM(MParameterValueTERM object) {
				return createMParameterValueTERMAdapter();
			}
			@Override
			public Adapter caseMParameterValuePAR(MParameterValuePAR object) {
				return createMParameterValuePARAdapter();
			}
			@Override
			public Adapter caseMParameterValueAssignment(MParameterValueAssignment object) {
				return createMParameterValueAssignmentAdapter();
			}
			@Override
			public Adapter caseMParameterValueAssignmentSingleExpression(MParameterValueAssignmentSingleExpression object) {
				return createMParameterValueAssignmentSingleExpressionAdapter();
			}
			@Override
			public Adapter caseMParameterValueRange(MParameterValueRange object) {
				return createMParameterValueRangeAdapter();
			}
			@Override
			public Adapter caseMParameterValueDependentItem(MParameterValueDependentItem object) {
				return createMParameterValueDependentItemAdapter();
			}
			@Override
			public Adapter caseMParameterValueDependentItemsList(MParameterValueDependentItemsList object) {
				return createMParameterValueDependentItemsListAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackage <em>MCommonPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackage
	 * @generated
	 */
	public Adapter createMCommonPackageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement <em>MCommonPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement
	 * @generated
	 */
	public Adapter createMCommonPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageItem <em>MCommon Package Item</em>}'.
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonLibrary <em>MCommonLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonLibrary
	 * @generated
	 */
	public Adapter createMCommonLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement <em>MCommonPackageReferencingElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement
	 * @generated
	 */
	public Adapter createMCommonPackageReferencingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement <em>MCommonPackageParametricReferencingElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement
	 * @generated
	 */
	public Adapter createMCommonPackageParametricReferencingElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameter <em>MParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameter
	 * @generated
	 */
	public Adapter createMParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression <em>MParameter Default Value Single Expression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression
	 * @generated
	 */
	public Adapter createMParameterDefaultValueSingleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParameterDefinition <em>MEnumParameterDefinition</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameterDefinition
	 * @generated
	 */
	public Adapter createMEnumParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MBooleanParameter <em>MBooleanParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MBooleanParameter
	 * @generated
	 */
	public Adapter createMBooleanParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MBooleanParameterSingleExpression <em>MBooleanParameterSingleExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MBooleanParameterSingleExpression
	 * @generated
	 */
	public Adapter createMBooleanParameterSingleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MStringParameter <em>MStringParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MStringParameter
	 * @generated
	 */
	public Adapter createMStringParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MStringParameterSingleExpression <em>MStringParameterSingleExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MStringParameterSingleExpression
	 * @generated
	 */
	public Adapter createMStringParameterSingleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MIntegerParameter <em>MIntegerParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MIntegerParameter
	 * @generated
	 */
	public Adapter createMIntegerParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression <em>MIntegerParameterSingleExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression
	 * @generated
	 */
	public Adapter createMIntegerParameterSingleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParameter <em>MEnumParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameter
	 * @generated
	 */
	public Adapter createMEnumParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParameterSingleExpression <em>MEnumParameterSingleExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameterSingleExpression
	 * @generated
	 */
	public Adapter createMEnumParameterSingleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParameterLiteral <em>MEnumParameterLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameterLiteral
	 * @generated
	 */
	public Adapter createMEnumParameterLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MRealParameter <em>MRealParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MRealParameter
	 * @generated
	 */
	public Adapter createMRealParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MRealParameterSingleExpression <em>MRealParameterSingleExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MRealParameterSingleExpression
	 * @generated
	 */
	public Adapter createMRealParameterSingleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterRange <em>MParameterRange</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterRange
	 * @generated
	 */
	public Adapter createMParameterRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterOOR <em>MParameterOOR</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterOOR
	 * @generated
	 */
	public Adapter createMParameterOORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterOCR <em>MParameterOCR</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterOCR
	 * @generated
	 */
	public Adapter createMParameterOCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterCCR <em>MParameterCCR</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterCCR
	 * @generated
	 */
	public Adapter createMParameterCCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterCOR <em>MParameterCOR</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterCOR
	 * @generated
	 */
	public Adapter createMParameterCORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral <em>MEnumParamIntegerLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral
	 * @generated
	 */
	public Adapter createMEnumParamIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParamRealLiteral <em>MEnumParamRealLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamRealLiteral
	 * @generated
	 */
	public Adapter createMEnumParamRealLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParamStringLiteral <em>MEnumParamStringLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamStringLiteral
	 * @generated
	 */
	public Adapter createMEnumParamStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValue <em>MParameterValue</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValue
	 * @generated
	 */
	public Adapter createMParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueLiteral <em>MParameterValueLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueLiteral
	 * @generated
	 */
	public Adapter createMParameterValueLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral <em>MParameterValueIntegerLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral
	 * @generated
	 */
	public Adapter createMParameterValueIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueRealLiteral <em>MParameterValueRealLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRealLiteral
	 * @generated
	 */
	public Adapter createMParameterValueRealLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral <em>MParameterValueBooleanLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral
	 * @generated
	 */
	public Adapter createMParameterValueBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueStringLiteral <em>MParameterValueStringLiteral</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueStringLiteral
	 * @generated
	 */
	public Adapter createMParameterValueStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueRefObject <em>MParameter Value Ref Object</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRefObject
	 * @generated
	 */
	public Adapter createMParameterValueRefObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueExpression <em>MParameter Value Expression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpression
	 * @generated
	 */
	public Adapter createMParameterValueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueTERM <em>MParameter Value TERM</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERM
	 * @generated
	 */
	public Adapter createMParameterValueTERMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValuePAR <em>MParameterValuePAR</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValuePAR
	 * @generated
	 */
	public Adapter createMParameterValuePARAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignment <em>MParameterValueAssignment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignment
	 * @generated
	 */
	public Adapter createMParameterValueAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression <em>MParameter Value Assignment Single Expression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression
	 * @generated
	 */
	public Adapter createMParameterValueAssignmentSingleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueRange <em>MParameterValueRange</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRange
	 * @generated
	 */
	public Adapter createMParameterValueRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItem <em>MParameterValueDependentItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueDependentItem
	 * @generated
	 */
	public Adapter createMParameterValueDependentItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList <em>MParameterValueDependentItems List</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList
	 * @generated
	 */
	public Adapter createMParameterValueDependentItemsListAdapter() {
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