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
package es.uah.aut.srg.micobs.mesp.mespcommon.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage
 * @generated
 */
public class mespcommonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mespcommonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mespcommonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mespcommonPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
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
	protected mespcommonSwitch<Adapter> modelSwitch =
		new mespcommonSwitch<Adapter>() {
			@Override
			public Adapter caseMProvidedResource(MProvidedResource object) {
				return createMProvidedResourceAdapter();
			}
			@Override
			public Adapter caseMQuantifiableResource(MQuantifiableResource object) {
				return createMQuantifiableResourceAdapter();
			}
			@Override
			public Adapter caseMInstantiableResource(MInstantiableResource object) {
				return createMInstantiableResourceAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource <em>MProvided Resource</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource
	 * @generated
	 */
	public Adapter createMProvidedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource <em>MQuantifiable Resource</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource
	 * @generated
	 */
	public Adapter createMQuantifiableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource <em>MInstantiable Resource</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource
	 * @generated
	 */
	public Adapter createMInstantiableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommon Referenceable Obj</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	public Adapter createMCommonReferenceableObjAdapter() {
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
