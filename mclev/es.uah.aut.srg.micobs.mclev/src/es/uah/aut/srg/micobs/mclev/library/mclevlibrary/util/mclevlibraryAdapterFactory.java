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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemFlatMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterface;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemSAI;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemFlatMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterface;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage
 * @generated
 */
public class mclevlibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevlibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevlibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevlibraryPackage.eINSTANCE;
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
	protected mclevlibrarySwitch<Adapter> modelSwitch =
		new mclevlibrarySwitch<Adapter>() {
			@Override
			public Adapter caseMMCLEVLibrary(MMCLEVLibrary object) {
				return createMMCLEVLibraryAdapter();
			}
			@Override
			public Adapter caseMMCLEVPackage(MMCLEVPackage object) {
				return createMMCLEVPackageAdapter();
			}
			@Override
			public Adapter caseMMCLEVPackageItem(MMCLEVPackageItem object) {
				return createMMCLEVPackageItemAdapter();
			}
			@Override
			public Adapter caseMMCLEVPackageVersionedItem(MMCLEVPackageVersionedItem object) {
				return createMMCLEVPackageVersionedItemAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemComponent(MMCLEVItemComponent object) {
				return createMMCLEVItemComponentAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemComponent(MMCLEVVersionedItemComponent object) {
				return createMMCLEVVersionedItemComponentAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemSAI(MMCLEVItemSAI object) {
				return createMMCLEVItemSAIAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemSAI(MMCLEVVersionedItemSAI object) {
				return createMMCLEVVersionedItemSAIAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemInterface(MMCLEVItemInterface object) {
				return createMMCLEVItemInterfaceAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemInterface(MMCLEVVersionedItemInterface object) {
				return createMMCLEVVersionedItemInterfaceAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemInterfaceMapping(MMCLEVItemInterfaceMapping object) {
				return createMMCLEVItemInterfaceMappingAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemInterfaceMapping(MMCLEVVersionedItemInterfaceMapping object) {
				return createMMCLEVVersionedItemInterfaceMappingAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemServiceLibrary(MMCLEVItemServiceLibrary object) {
				return createMMCLEVItemServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemServiceLibrary(MMCLEVVersionedItemServiceLibrary object) {
				return createMMCLEVVersionedItemServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemIODomain(MMCLEVItemIODomain object) {
				return createMMCLEVItemIODomainAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemIODomain(MMCLEVVersionedItemIODomain object) {
				return createMMCLEVVersionedItemIODomainAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemAODomain(MMCLEVItemAODomain object) {
				return createMMCLEVItemAODomainAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemAODomain(MMCLEVVersionedItemAODomain object) {
				return createMMCLEVVersionedItemAODomainAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemMCAD(MMCLEVItemMCAD object) {
				return createMMCLEVItemMCADAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemMCAD(MMCLEVVersionedItemMCAD object) {
				return createMMCLEVVersionedItemMCADAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemAbstractComponent(MMCLEVItemAbstractComponent object) {
				return createMMCLEVItemAbstractComponentAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemAbstractComponent(MMCLEVVersionedItemAbstractComponent object) {
				return createMMCLEVVersionedItemAbstractComponentAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemAbstractServiceLibrary(MMCLEVItemAbstractServiceLibrary object) {
				return createMMCLEVItemAbstractServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemAbstractServiceLibrary(MMCLEVVersionedItemAbstractServiceLibrary object) {
				return createMMCLEVVersionedItemAbstractServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemFlatMCAD(MMCLEVItemFlatMCAD object) {
				return createMMCLEVItemFlatMCADAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemFlatMCAD(MMCLEVVersionedItemFlatMCAD object) {
				return createMMCLEVVersionedItemFlatMCADAdapter();
			}
			@Override
			public Adapter caseMMCLEVItemDriverServiceLibrary(MMCLEVItemDriverServiceLibrary object) {
				return createMMCLEVItemDriverServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMMCLEVVersionedItemDriverServiceLibrary(MMCLEVVersionedItemDriverServiceLibrary object) {
				return createMMCLEVVersionedItemDriverServiceLibraryAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVLibrary <em>MMCLEVLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVLibrary
	 * @generated
	 */
	public Adapter createMMCLEVLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage <em>MMCLEVPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage
	 * @generated
	 */
	public Adapter createMMCLEVPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem <em>MMCLEVPackageItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem
	 * @generated
	 */
	public Adapter createMMCLEVPackageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageVersionedItem <em>MMCLEVPackageVersionedItem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageVersionedItem
	 * @generated
	 */
	public Adapter createMMCLEVPackageVersionedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemComponent <em>MMCLEVItemComponent</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemComponent
	 * @generated
	 */
	public Adapter createMMCLEVItemComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent <em>MMCLEVVersionedItemComponent</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemSAI <em>MMCLEVItemSAI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemSAI
	 * @generated
	 */
	public Adapter createMMCLEVItemSAIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI <em>MMCLEVVersionedItemSAI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemSAIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterface <em>MMCLEVItemInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterface
	 * @generated
	 */
	public Adapter createMMCLEVItemInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterface <em>MMCLEVVersionedItemInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterface
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterfaceMapping <em>MMCLEVItemInterfaceMapping</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterfaceMapping
	 * @generated
	 */
	public Adapter createMMCLEVItemInterfaceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterfaceMapping <em>MMCLEVVersionedItemInterfaceMapping</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterfaceMapping
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemInterfaceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemServiceLibrary <em>MMCLEVItemServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemServiceLibrary
	 * @generated
	 */
	public Adapter createMMCLEVItemServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary <em>MMCLEVVersionedItemServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain <em>MMCLEVItemIODomain</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain
	 * @generated
	 */
	public Adapter createMMCLEVItemIODomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain <em>MMCLEVVersionedItemIODomain</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemIODomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain <em>MMCLEVItemAODomain</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain
	 * @generated
	 */
	public Adapter createMMCLEVItemAODomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain <em>MMCLEVVersionedItemAODomain</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemAODomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemMCAD <em>MMCLEVItemMCAD</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemMCAD
	 * @generated
	 */
	public Adapter createMMCLEVItemMCADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemMCAD <em>MMCLEVVersionedItemMCAD</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemMCAD
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemMCADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractComponent <em>MMCLEVItemAbstractComponent</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractComponent
	 * @generated
	 */
	public Adapter createMMCLEVItemAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractComponent <em>MMCLEVVersionedItemAbstractComponent</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractComponent
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractServiceLibrary <em>MMCLEVItemAbstractServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractServiceLibrary
	 * @generated
	 */
	public Adapter createMMCLEVItemAbstractServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractServiceLibrary <em>MMCLEVVersionedItemAbstractServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractServiceLibrary
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemAbstractServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemFlatMCAD <em>MMCLEVItemFlatMCAD</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemFlatMCAD
	 * @generated
	 */
	public Adapter createMMCLEVItemFlatMCADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemFlatMCAD <em>MMCLEVVersionedItemFlatMCAD</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemFlatMCAD
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemFlatMCADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemDriverServiceLibrary <em>MMCLEVItemDriverServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemDriverServiceLibrary
	 * @generated
	 */
	public Adapter createMMCLEVItemDriverServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary <em>MMCLEVVersionedItemDriverServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary
	 * @generated
	 */
	public Adapter createMMCLEVVersionedItemDriverServiceLibraryAdapter() {
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