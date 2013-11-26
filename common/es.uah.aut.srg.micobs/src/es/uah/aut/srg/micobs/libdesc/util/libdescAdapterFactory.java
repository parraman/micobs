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
package es.uah.aut.srg.micobs.libdesc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage
 * @generated
 */
public class libdescAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static libdescPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public libdescAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = libdescPackage.eINSTANCE;
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
	protected libdescSwitch<Adapter> modelSwitch =
		new libdescSwitch<Adapter>() {
			@Override
			public Adapter caseMDescriptor(MDescriptor object) {
				return createMDescriptorAdapter();
			}
			@Override
			public Adapter caseMDescriptorList(MDescriptorList object) {
				return createMDescriptorListAdapter();
			}
			@Override
			public Adapter caseMDescriptorField(MDescriptorField object) {
				return createMDescriptorFieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.libdesc.MDescriptor <em>MDescriptor</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptor
	 * @generated
	 */
	public Adapter createMDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.libdesc.MDescriptorList <em>MDescriptorList</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptorList
	 * @generated
	 */
	public Adapter createMDescriptorListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.libdesc.MDescriptorField <em>MDescriptorField</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.libdesc.MDescriptorField
	 * @generated
	 */
	public Adapter createMDescriptorFieldAdapter() {
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
