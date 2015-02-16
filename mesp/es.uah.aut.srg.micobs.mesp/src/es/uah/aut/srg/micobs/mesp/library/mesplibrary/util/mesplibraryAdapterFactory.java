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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDeployment;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPLibrary;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage
 * @generated
 */
public class mesplibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mesplibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mesplibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mesplibraryPackage.eINSTANCE;
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
	protected mesplibrarySwitch<Adapter> modelSwitch =
		new mesplibrarySwitch<Adapter>() {
			@Override
			public Adapter caseMMESPLibrary(MMESPLibrary object) {
				return createMMESPLibraryAdapter();
			}
			@Override
			public Adapter caseMMESPPackage(MMESPPackage object) {
				return createMMESPPackageAdapter();
			}
			@Override
			public Adapter caseMMESPPackageItem(MMESPPackageItem object) {
				return createMMESPPackageItemAdapter();
			}
			@Override
			public Adapter caseMMESPPackageVersionedItem(MMESPPackageVersionedItem object) {
				return createMMESPPackageVersionedItemAdapter();
			}
			@Override
			public Adapter caseMMESPPackageVersionedItemWithRepository(MMESPPackageVersionedItemWithRepository object) {
				return createMMESPPackageVersionedItemWithRepositoryAdapter();
			}
			@Override
			public Adapter caseMMESPItemSwPackage(MMESPItemSwPackage object) {
				return createMMESPItemSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemSwPackage(MMESPVersionedItemSwPackage object) {
				return createMMESPVersionedItemSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPItemSwInterface(MMESPItemSwInterface object) {
				return createMMESPItemSwInterfaceAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemSwInterface(MMESPVersionedItemSwInterface object) {
				return createMMESPVersionedItemSwInterfaceAdapter();
			}
			@Override
			public Adapter caseMMESPItemOSSwPackage(MMESPItemOSSwPackage object) {
				return createMMESPItemOSSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemOSSwPackage(MMESPVersionedItemOSSwPackage object) {
				return createMMESPVersionedItemOSSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPItemOSSwInterface(MMESPItemOSSwInterface object) {
				return createMMESPItemOSSwInterfaceAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemOSSwInterface(MMESPVersionedItemOSSwInterface object) {
				return createMMESPVersionedItemOSSwInterfaceAdapter();
			}
			@Override
			public Adapter caseMMESPItemPlatformSwPackage(MMESPItemPlatformSwPackage object) {
				return createMMESPItemPlatformSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemPlatformSwPackage(MMESPVersionedItemPlatformSwPackage object) {
				return createMMESPVersionedItemPlatformSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPItemDeployment(MMESPItemDeployment object) {
				return createMMESPItemDeploymentAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemDeployment(MMESPVersionedItemDeployment object) {
				return createMMESPVersionedItemDeploymentAdapter();
			}
			@Override
			public Adapter caseMMESPItemAbstractSwPackage(MMESPItemAbstractSwPackage object) {
				return createMMESPItemAbstractSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemAbstractSwPackage(MMESPVersionedItemAbstractSwPackage object) {
				return createMMESPVersionedItemAbstractSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPItemConstructionTool(MMESPItemConstructionTool object) {
				return createMMESPItemConstructionToolAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemConstructionTool(MMESPVersionedItemConstructionTool object) {
				return createMMESPVersionedItemConstructionToolAdapter();
			}
			@Override
			public Adapter caseMMESPItemDriverSwPackage(MMESPItemDriverSwPackage object) {
				return createMMESPItemDriverSwPackageAdapter();
			}
			@Override
			public Adapter caseMMESPVersionedItemDriverSwPackage(MMESPVersionedItemDriverSwPackage object) {
				return createMMESPVersionedItemDriverSwPackageAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPLibrary <em>MMESPLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPLibrary
	 * @generated
	 */
	public Adapter createMMESPLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackage <em>MMESPPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackage
	 * @generated
	 */
	public Adapter createMMESPPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem <em>MMESPPackageItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem
	 * @generated
	 */
	public Adapter createMMESPPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItem <em>MMESPPackageVersionedItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItem
	 * @generated
	 */
	public Adapter createMMESPPackageVersionedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository <em>MMESPPackageVersionedItem With Repository</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository
	 * @generated
	 */
	public Adapter createMMESPPackageVersionedItemWithRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwPackage <em>MMESPItemSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwPackage
	 * @generated
	 */
	public Adapter createMMESPItemSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage <em>MMESPVersionedItemSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage
	 * @generated
	 */
	public Adapter createMMESPVersionedItemSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwInterface <em>MMESPItemSwInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwInterface
	 * @generated
	 */
	public Adapter createMMESPItemSwInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface <em>MMESPVersionedItemSwInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface
	 * @generated
	 */
	public Adapter createMMESPVersionedItemSwInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwPackage <em>MMESPItemOSSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwPackage
	 * @generated
	 */
	public Adapter createMMESPItemOSSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage <em>MMESPVersionedItemOSSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage
	 * @generated
	 */
	public Adapter createMMESPVersionedItemOSSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwInterface <em>MMESPItemOSSwInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwInterface
	 * @generated
	 */
	public Adapter createMMESPItemOSSwInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface <em>MMESPVersionedItemOSSwInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface
	 * @generated
	 */
	public Adapter createMMESPVersionedItemOSSwInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemPlatformSwPackage <em>MMESPItemPlatformSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemPlatformSwPackage
	 * @generated
	 */
	public Adapter createMMESPItemPlatformSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage <em>MMESPVersionedItemPlatformSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage
	 * @generated
	 */
	public Adapter createMMESPVersionedItemPlatformSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDeployment <em>MMESPItemDeployment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDeployment
	 * @generated
	 */
	public Adapter createMMESPItemDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment <em>MMESPVersionedItemDeployment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment
	 * @generated
	 */
	public Adapter createMMESPVersionedItemDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemAbstractSwPackage <em>MMESPItemAbstractSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemAbstractSwPackage
	 * @generated
	 */
	public Adapter createMMESPItemAbstractSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage <em>MMESPVersionedItemAbstractSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage
	 * @generated
	 */
	public Adapter createMMESPVersionedItemAbstractSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool <em>MMESPItemConstructionTool</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool
	 * @generated
	 */
	public Adapter createMMESPItemConstructionToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool <em>MMESPVersionedItemConstructionTool</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool
	 * @generated
	 */
	public Adapter createMMESPVersionedItemConstructionToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDriverSwPackage <em>MMESPItemDriverSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDriverSwPackage
	 * @generated
	 */
	public Adapter createMMESPItemDriverSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage <em>MMESPVersionedItemDriverSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage
	 * @generated
	 */
	public Adapter createMMESPVersionedItemDriverSwPackageAdapter() {
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
