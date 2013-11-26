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
package es.uah.aut.srg.micobs.libdesc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescFactory;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class libdescFactoryImpl extends EFactoryImpl implements libdescFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static libdescFactory init() {
		try {
			libdescFactory thelibdescFactory = (libdescFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/libdesc"); 
			if (thelibdescFactory != null) {
				return thelibdescFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new libdescFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public libdescFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case libdescPackage.MDESCRIPTOR: return createMDescriptor();
			case libdescPackage.MDESCRIPTOR_LIST: return createMDescriptorList();
			case libdescPackage.MDESCRIPTOR_FIELD: return createMDescriptorField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MDescriptor createMDescriptor() {
		MDescriptorImpl mDescriptor = new MDescriptorImpl();
		return mDescriptor;
	}

	/**
	 * @generated
	 */
	public MDescriptorList createMDescriptorList() {
		MDescriptorListImpl mDescriptorList = new MDescriptorListImpl();
		return mDescriptorList;
	}

	/**
	 * @generated
	 */
	public MDescriptorField createMDescriptorField() {
		MDescriptorFieldImpl mDescriptorField = new MDescriptorFieldImpl();
		return mDescriptorField;
	}

	/**
	 * @generated
	 */
	public libdescPackage getlibdescPackage() {
		return (libdescPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static libdescPackage getPackage() {
		return libdescPackage.eINSTANCE;
	}

}
