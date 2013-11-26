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
package es.uah.aut.srg.micobs.mesp.mespcommon;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonFactory
 * @model kind="package"
 * @generated
 */
public interface mespcommonPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mespcommon";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mespcommon";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mespcommonPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MProvidedResourceImpl <em>MProvidedResource</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.MProvidedResourceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonPackageImpl#getMProvidedResource()
	 * @generated
	 */
	int MPROVIDED_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPROVIDED_RESOURCE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPROVIDED_RESOURCE__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>MProvidedResource</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPROVIDED_RESOURCE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MQuantifiableResourceImpl <em>MQuantifiableResource</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.MQuantifiableResourceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonPackageImpl#getMQuantifiableResource()
	 * @generated
	 */
	int MQUANTIFIABLE_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE__NAME = MPROVIDED_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE__DESCRIPTION = MPROVIDED_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>LowerBound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE__LOWER_BOUND = MPROVIDED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>UpperBound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE__UPPER_BOUND = MPROVIDED_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MQuantifiableResource</em>' class.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE_FEATURE_COUNT = MPROVIDED_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MInstantiableResourceImpl <em>MInstantiableResource</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.MInstantiableResourceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonPackageImpl#getMInstantiableResource()
	 * @generated
	 */
	int MINSTANTIABLE_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE__NAME = MPROVIDED_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE__DESCRIPTION = MPROVIDED_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE__PARAMETERS = MPROVIDED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MInstantiableResource</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE_FEATURE_COUNT = MPROVIDED_RESOURCE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource <em>MProvidedResource</em>}'.
	 * @return the meta object for class '<em>MProvidedResource</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource
	 * @generated
	 */
	EClass getMProvidedResource();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource <em>MQuantifiableResource</em>}'.
	 * @return the meta object for class '<em>MQuantifiableResource</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource
	 * @generated
	 */
	EClass getMQuantifiableResource();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource#getLowerBound <em>LowerBound</em>}'.
	 * @return the meta object for the containment reference '<em>LowerBound</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource#getLowerBound()
	 * @see #getMQuantifiableResource()
	 * @generated
	 */
	EReference getMQuantifiableResource_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource#getUpperBound <em>UpperBound</em>}'.
	 * @return the meta object for the containment reference '<em>UpperBound</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource#getUpperBound()
	 * @see #getMQuantifiableResource()
	 * @generated
	 */
	EReference getMQuantifiableResource_UpperBound();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource <em>MInstantiableResource</em>}'.
	 * @return the meta object for class '<em>MInstantiableResource</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource
	 * @generated
	 */
	EClass getMInstantiableResource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource#getParameters()
	 * @see #getMInstantiableResource()
	 * @generated
	 */
	EReference getMInstantiableResource_Parameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mespcommonFactory getmespcommonFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MProvidedResourceImpl <em>MProvidedResource</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.MProvidedResourceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonPackageImpl#getMProvidedResource()
		 * @generated
		 */
		EClass MPROVIDED_RESOURCE = eINSTANCE.getMProvidedResource();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MQuantifiableResourceImpl <em>MQuantifiableResource</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.MQuantifiableResourceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonPackageImpl#getMQuantifiableResource()
		 * @generated
		 */
		EClass MQUANTIFIABLE_RESOURCE = eINSTANCE.getMQuantifiableResource();

		/**
		 * The meta object literal for the '<em><b>LowerBound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MQUANTIFIABLE_RESOURCE__LOWER_BOUND = eINSTANCE.getMQuantifiableResource_LowerBound();

		/**
		 * The meta object literal for the '<em><b>UpperBound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MQUANTIFIABLE_RESOURCE__UPPER_BOUND = eINSTANCE.getMQuantifiableResource_UpperBound();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespcommon.impl.MInstantiableResourceImpl <em>MInstantiableResource</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.MInstantiableResourceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonPackageImpl#getMInstantiableResource()
		 * @generated
		 */
		EClass MINSTANTIABLE_RESOURCE = eINSTANCE.getMInstantiableResource();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MINSTANTIABLE_RESOURCE__PARAMETERS = eINSTANCE.getMInstantiableResource_Parameters();

	}

}
