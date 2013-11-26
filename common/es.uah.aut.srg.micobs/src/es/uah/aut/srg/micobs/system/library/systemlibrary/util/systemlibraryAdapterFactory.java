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
package es.uah.aut.srg.micobs.system.library.systemlibrary.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * 
 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage
 * @generated
 */
public class systemlibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static systemlibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public systemlibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = systemlibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * 
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
	protected systemlibrarySwitch<Adapter> modelSwitch =
		new systemlibrarySwitch<Adapter>() {
			@Override
			public Adapter caseMSystemLibrary(MSystemLibrary object) {
				return createMSystemLibraryAdapter();
			}
			@Override
			public Adapter caseMSystemPackage(MSystemPackage object) {
				return createMSystemPackageAdapter();
			}
			@Override
			public Adapter caseMSystemPackageItem(MSystemPackageItem object) {
				return createMSystemPackageItemAdapter();
			}
			@Override
			public Adapter caseMSystemPackageVersionedItem(MSystemPackageVersionedItem object) {
				return createMSystemPackageVersionedItemAdapter();
			}
			@Override
			public Adapter caseMSystemItemLanguage(MSystemItemLanguage object) {
				return createMSystemItemLanguageAdapter();
			}
			@Override
			public Adapter caseMSystemVersionedItemLanguage(MSystemVersionedItemLanguage object) {
				return createMSystemVersionedItemLanguageAdapter();
			}
			@Override
			public Adapter caseMCommonLibrary(MCommonLibrary object) {
				return createMCommonLibraryAdapter();
			}
			@Override
			public Adapter caseMCommonPackage(MCommonPackage object) {
				return createMCommonPackageAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary <em>MSystemLibrary</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary
	 * @generated
	 */
	public Adapter createMSystemLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage <em>MSystemPackage</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage
	 * @generated
	 */
	public Adapter createMSystemPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem <em>MSystemPackageItem</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem
	 * @generated
	 */
	public Adapter createMSystemPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem <em>MSystemPackageVersionedItem</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem
	 * @generated
	 */
	public Adapter createMSystemPackageVersionedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage <em>MSystemItemLanguage</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage
	 * @generated
	 */
	public Adapter createMSystemItemLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage <em>MSystemVersionedItemLanguage</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage
	 * @generated
	 */
	public Adapter createMSystemVersionedItemLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonLibrary <em>MCommonLibrary</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonLibrary
	 * @generated
	 */
	public Adapter createMCommonLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackage <em>MCommonPackage</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackage
	 * @generated
	 */
	public Adapter createMCommonPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageItem <em>MCommonPackageItem</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageItem
	 * @generated
	 */
	public Adapter createMCommonPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem <em>MCommonPackageVersionedItem</em>}'.
	 * 
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem
	 * @generated
	 */
	public Adapter createMCommonPackageVersionedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

}
