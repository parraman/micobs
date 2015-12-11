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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage
 * @generated
 */
public class edroomlibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static edroomlibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public edroomlibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = edroomlibraryPackage.eINSTANCE;
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
	protected edroomlibrarySwitch<Adapter> modelSwitch =
		new edroomlibrarySwitch<Adapter>() {
			@Override
			public Adapter caseEDROOMLibrary(EDROOMLibrary object) {
				return createEDROOMLibraryAdapter();
			}
			@Override
			public Adapter caseEDROOMPackage(EDROOMPackage object) {
				return createEDROOMPackageAdapter();
			}
			@Override
			public Adapter caseEDROOMPackageItem(EDROOMPackageItem object) {
				return createEDROOMPackageItemAdapter();
			}
			@Override
			public Adapter caseEDROOMPackageVersionedItem(EDROOMPackageVersionedItem object) {
				return createEDROOMPackageVersionedItemAdapter();
			}
			@Override
			public Adapter caseEDROOMItemDataClass(EDROOMItemDataClass object) {
				return createEDROOMItemDataClassAdapter();
			}
			@Override
			public Adapter caseEDROOMVersionedItemDataClass(EDROOMVersionedItemDataClass object) {
				return createEDROOMVersionedItemDataClassAdapter();
			}
			@Override
			public Adapter caseEDROOMItemProtocol(EDROOMItemProtocol object) {
				return createEDROOMItemProtocolAdapter();
			}
			@Override
			public Adapter caseEDROOMVersionedItemProtocol(EDROOMVersionedItemProtocol object) {
				return createEDROOMVersionedItemProtocolAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary <em>EDROOMLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary
	 * @generated
	 */
	public Adapter createEDROOMLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage <em>EDROOMPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage
	 * @generated
	 */
	public Adapter createEDROOMPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageItem <em>EDROOMPackageItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageItem
	 * @generated
	 */
	public Adapter createEDROOMPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageVersionedItem <em>EDROOMPackageVersionedItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageVersionedItem
	 * @generated
	 */
	public Adapter createEDROOMPackageVersionedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass <em>EDROOMItemDataClass</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass
	 * @generated
	 */
	public Adapter createEDROOMItemDataClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass <em>EDROOMVersionedItemDataClass</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass
	 * @generated
	 */
	public Adapter createEDROOMVersionedItemDataClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol <em>EDROOMItemProtocol</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol
	 * @generated
	 */
	public Adapter createEDROOMItemProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol <em>EDROOMVersionedItemProtocol</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol
	 * @generated
	 */
	public Adapter createEDROOMVersionedItemProtocolAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackage <em>MCommonPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackage
	 * @generated
	 */
	public Adapter createMCommonPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageItem <em>MCommonPackageItem</em>}'.
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
	 * Creates a new adapter for the default case.
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

}
