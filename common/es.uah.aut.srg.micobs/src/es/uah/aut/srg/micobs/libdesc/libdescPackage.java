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
package es.uah.aut.srg.micobs.libdesc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @see es.uah.aut.srg.micobs.libdesc.libdescFactory
 * @model kind="package"
 * @generated
 */
public interface libdescPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "libdesc";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/libdesc";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	libdescPackage eINSTANCE = es.uah.aut.srg.micobs.libdesc.impl.libdescPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl <em>MDescriptor</em>}' class.
	 * @see es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl
	 * @see es.uah.aut.srg.micobs.libdesc.impl.libdescPackageImpl#getMDescriptor()
	 * @generated
	 */
	int MDESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR__URI = 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR__LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR__ITEM = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR__FIELDS = 3;

	/**
	 * The number of structural features of the '<em>MDescriptor</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorListImpl <em>MDescriptorList</em>}' class.
	 * @see es.uah.aut.srg.micobs.libdesc.impl.MDescriptorListImpl
	 * @see es.uah.aut.srg.micobs.libdesc.impl.libdescPackageImpl#getMDescriptorList()
	 * @generated
	 */
	int MDESCRIPTOR_LIST = 1;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR_LIST__DESCRIPTORS = 0;

	/**
	 * The number of structural features of the '<em>MDescriptorList</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorFieldImpl <em>MDescriptorField</em>}' class.
	 * @see es.uah.aut.srg.micobs.libdesc.impl.MDescriptorFieldImpl
	 * @see es.uah.aut.srg.micobs.libdesc.impl.libdescPackageImpl#getMDescriptorField()
	 * @generated
	 */
	int MDESCRIPTOR_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR_FIELD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>MDescriptorField</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDESCRIPTOR_FIELD_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.libdesc.MDescriptor <em>MDescriptor</em>}'.
	 * @return the meta object for class '<em>MDescriptor</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptor
	 * @generated
	 */
	EClass getMDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getUri <em>URI</em>}'.
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptor#getUri()
	 * @see #getMDescriptor()
	 * @generated
	 */
	EAttribute getMDescriptor_Uri();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getLibrary <em>Library</em>}'.
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptor#getLibrary()
	 * @see #getMDescriptor()
	 * @generated
	 */
	EAttribute getMDescriptor_Library();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getItem <em>Item</em>}'.
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptor#getItem()
	 * @see #getMDescriptor()
	 * @generated
	 */
	EAttribute getMDescriptor_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getFields <em>Fields</em>}'.
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptor#getFields()
	 * @see #getMDescriptor()
	 * @generated
	 */
	EReference getMDescriptor_Fields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.libdesc.MDescriptorList <em>MDescriptorList</em>}'.
	 * @return the meta object for class '<em>MDescriptorList</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptorList
	 * @generated
	 */
	EClass getMDescriptorList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.libdesc.MDescriptorList#getDescriptors <em>Descriptors</em>}'.
	 * @return the meta object for the containment reference list '<em>Descriptors</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptorList#getDescriptors()
	 * @see #getMDescriptorList()
	 * @generated
	 */
	EReference getMDescriptorList_Descriptors();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.libdesc.MDescriptorField <em>MDescriptorField</em>}'.
	 * @return the meta object for class '<em>MDescriptorField</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptorField
	 * @generated
	 */
	EClass getMDescriptorField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.libdesc.MDescriptorField#getName <em>Name</em>}'.
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptorField#getName()
	 * @see #getMDescriptorField()
	 * @generated
	 */
	EAttribute getMDescriptorField_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.libdesc.MDescriptorField#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptorField#getValue()
	 * @see #getMDescriptorField()
	 * @generated
	 */
	EAttribute getMDescriptorField_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	libdescFactory getlibdescFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl <em>MDescriptor</em>}' class.
		 * @see es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl
		 * @see es.uah.aut.srg.micobs.libdesc.impl.libdescPackageImpl#getMDescriptor()
		 * @generated
		 */
		EClass MDESCRIPTOR = eINSTANCE.getMDescriptor();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MDESCRIPTOR__URI = eINSTANCE.getMDescriptor_Uri();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MDESCRIPTOR__LIBRARY = eINSTANCE.getMDescriptor_Library();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MDESCRIPTOR__ITEM = eINSTANCE.getMDescriptor_Item();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDESCRIPTOR__FIELDS = eINSTANCE.getMDescriptor_Fields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorListImpl <em>MDescriptor List</em>}' class.
		 * @see es.uah.aut.srg.micobs.libdesc.impl.MDescriptorListImpl
		 * @see es.uah.aut.srg.micobs.libdesc.impl.libdescPackageImpl#getMDescriptorList()
		 * @generated
		 */
		EClass MDESCRIPTOR_LIST = eINSTANCE.getMDescriptorList();

		/**
		 * The meta object literal for the '<em><b>Descriptors</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDESCRIPTOR_LIST__DESCRIPTORS = eINSTANCE.getMDescriptorList_Descriptors();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorFieldImpl <em>MDescriptor Field</em>}' class.
		 * @see es.uah.aut.srg.micobs.libdesc.impl.MDescriptorFieldImpl
		 * @see es.uah.aut.srg.micobs.libdesc.impl.libdescPackageImpl#getMDescriptorField()
		 * @generated
		 */
		EClass MDESCRIPTOR_FIELD = eINSTANCE.getMDescriptorField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MDESCRIPTOR_FIELD__NAME = eINSTANCE.getMDescriptorField_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MDESCRIPTOR_FIELD__VALUE = eINSTANCE.getMDescriptorField_Value();

	}

}