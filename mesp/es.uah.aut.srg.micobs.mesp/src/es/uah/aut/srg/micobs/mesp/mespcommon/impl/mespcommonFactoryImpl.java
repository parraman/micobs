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
package es.uah.aut.srg.micobs.mesp.mespcommon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonFactory;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mespcommonFactoryImpl extends EFactoryImpl implements mespcommonFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mespcommonFactory init() {
		try {
			mespcommonFactory themespcommonFactory = (mespcommonFactory)EPackage.Registry.INSTANCE.getEFactory(mespcommonPackage.eNS_URI);
			if (themespcommonFactory != null) {
				return themespcommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mespcommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mespcommonFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE: return createMQuantifiableResource();
			case mespcommonPackage.MINSTANTIABLE_RESOURCE: return createMInstantiableResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MQuantifiableResource createMQuantifiableResource() {
		MQuantifiableResourceImpl mQuantifiableResource = new MQuantifiableResourceImpl();
		return mQuantifiableResource;
	}

	/**
	 * @generated
	 */
	public MInstantiableResource createMInstantiableResource() {
		MInstantiableResourceImpl mInstantiableResource = new MInstantiableResourceImpl();
		return mInstantiableResource;
	}

	/**
	 * @generated
	 */
	public mespcommonPackage getmespcommonPackage() {
		return (mespcommonPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mespcommonPackage getPackage() {
		return mespcommonPackage.eINSTANCE;
	}

}
