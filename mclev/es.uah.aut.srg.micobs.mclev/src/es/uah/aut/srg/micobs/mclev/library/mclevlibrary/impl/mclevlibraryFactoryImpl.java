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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryFactory;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mclevlibraryFactoryImpl extends EFactoryImpl implements mclevlibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevlibraryFactory init() {
		try {
			mclevlibraryFactory themclevlibraryFactory = (mclevlibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mclev/library/mclevlibrary"); 
			if (themclevlibraryFactory != null) {
				return themclevlibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevlibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevlibraryFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevlibraryPackage.MMCLEV_LIBRARY: return createMMCLEVLibrary();
			case mclevlibraryPackage.MMCLEV_PACKAGE: return createMMCLEVPackage();
			case mclevlibraryPackage.MMCLEV_ITEM_COMPONENT: return createMMCLEVItemComponent();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_COMPONENT: return createMMCLEVVersionedItemComponent();
			case mclevlibraryPackage.MMCLEV_ITEM_SAI: return createMMCLEVItemSAI();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SAI: return createMMCLEVVersionedItemSAI();
			case mclevlibraryPackage.MMCLEV_ITEM_INTERFACE: return createMMCLEVItemInterface();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_INTERFACE: return createMMCLEVVersionedItemInterface();
			case mclevlibraryPackage.MMCLEV_ITEM_INTERFACE_MAPPING: return createMMCLEVItemInterfaceMapping();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING: return createMMCLEVVersionedItemInterfaceMapping();
			case mclevlibraryPackage.MMCLEV_ITEM_SERVICE_LIBRARY: return createMMCLEVItemServiceLibrary();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY: return createMMCLEVVersionedItemServiceLibrary();
			case mclevlibraryPackage.MMCLEV_ITEM_IO_DOMAIN: return createMMCLEVItemIODomain();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_IO_DOMAIN: return createMMCLEVVersionedItemIODomain();
			case mclevlibraryPackage.MMCLEV_ITEM_AO_DOMAIN: return createMMCLEVItemAODomain();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_AO_DOMAIN: return createMMCLEVVersionedItemAODomain();
			case mclevlibraryPackage.MMCLEV_ITEM_MCAD: return createMMCLEVItemMCAD();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_MCAD: return createMMCLEVVersionedItemMCAD();
			case mclevlibraryPackage.MMCLEV_ITEM_ABSTRACT_COMPONENT: return createMMCLEVItemAbstractComponent();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT: return createMMCLEVVersionedItemAbstractComponent();
			case mclevlibraryPackage.MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY: return createMMCLEVItemAbstractServiceLibrary();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY: return createMMCLEVVersionedItemAbstractServiceLibrary();
			case mclevlibraryPackage.MMCLEV_ITEM_FLAT_MCAD: return createMMCLEVItemFlatMCAD();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_FLAT_MCAD: return createMMCLEVVersionedItemFlatMCAD();
			case mclevlibraryPackage.MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY: return createMMCLEVItemDriverServiceLibrary();
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY: return createMMCLEVVersionedItemDriverServiceLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MMCLEVLibrary createMMCLEVLibrary() {
		MMCLEVLibraryImpl mmclevLibrary = new MMCLEVLibraryImpl();
		return mmclevLibrary;
	}

	/**
	 * @generated
	 */
	public MMCLEVPackage createMMCLEVPackage() {
		MMCLEVPackageImpl mmclevPackage = new MMCLEVPackageImpl();
		return mmclevPackage;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemComponent createMMCLEVItemComponent() {
		MMCLEVItemComponentImpl mmclevItemComponent = new MMCLEVItemComponentImpl();
		return mmclevItemComponent;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemComponent createMMCLEVVersionedItemComponent() {
		MMCLEVVersionedItemComponentImpl mmclevVersionedItemComponent = new MMCLEVVersionedItemComponentImpl();
		return mmclevVersionedItemComponent;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemSAI createMMCLEVItemSAI() {
		MMCLEVItemSAIImpl mmclevItemSAI = new MMCLEVItemSAIImpl();
		return mmclevItemSAI;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemSAI createMMCLEVVersionedItemSAI() {
		MMCLEVVersionedItemSAIImpl mmclevVersionedItemSAI = new MMCLEVVersionedItemSAIImpl();
		return mmclevVersionedItemSAI;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemInterface createMMCLEVItemInterface() {
		MMCLEVItemInterfaceImpl mmclevItemInterface = new MMCLEVItemInterfaceImpl();
		return mmclevItemInterface;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemInterface createMMCLEVVersionedItemInterface() {
		MMCLEVVersionedItemInterfaceImpl mmclevVersionedItemInterface = new MMCLEVVersionedItemInterfaceImpl();
		return mmclevVersionedItemInterface;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemInterfaceMapping createMMCLEVItemInterfaceMapping() {
		MMCLEVItemInterfaceMappingImpl mmclevItemInterfaceMapping = new MMCLEVItemInterfaceMappingImpl();
		return mmclevItemInterfaceMapping;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemInterfaceMapping createMMCLEVVersionedItemInterfaceMapping() {
		MMCLEVVersionedItemInterfaceMappingImpl mmclevVersionedItemInterfaceMapping = new MMCLEVVersionedItemInterfaceMappingImpl();
		return mmclevVersionedItemInterfaceMapping;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemServiceLibrary createMMCLEVItemServiceLibrary() {
		MMCLEVItemServiceLibraryImpl mmclevItemServiceLibrary = new MMCLEVItemServiceLibraryImpl();
		return mmclevItemServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemServiceLibrary createMMCLEVVersionedItemServiceLibrary() {
		MMCLEVVersionedItemServiceLibraryImpl mmclevVersionedItemServiceLibrary = new MMCLEVVersionedItemServiceLibraryImpl();
		return mmclevVersionedItemServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemIODomain createMMCLEVItemIODomain() {
		MMCLEVItemIODomainImpl mmclevItemIODomain = new MMCLEVItemIODomainImpl();
		return mmclevItemIODomain;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemIODomain createMMCLEVVersionedItemIODomain() {
		MMCLEVVersionedItemIODomainImpl mmclevVersionedItemIODomain = new MMCLEVVersionedItemIODomainImpl();
		return mmclevVersionedItemIODomain;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemAODomain createMMCLEVItemAODomain() {
		MMCLEVItemAODomainImpl mmclevItemAODomain = new MMCLEVItemAODomainImpl();
		return mmclevItemAODomain;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemAODomain createMMCLEVVersionedItemAODomain() {
		MMCLEVVersionedItemAODomainImpl mmclevVersionedItemAODomain = new MMCLEVVersionedItemAODomainImpl();
		return mmclevVersionedItemAODomain;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemMCAD createMMCLEVItemMCAD() {
		MMCLEVItemMCADImpl mmclevItemMCAD = new MMCLEVItemMCADImpl();
		return mmclevItemMCAD;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemMCAD createMMCLEVVersionedItemMCAD() {
		MMCLEVVersionedItemMCADImpl mmclevVersionedItemMCAD = new MMCLEVVersionedItemMCADImpl();
		return mmclevVersionedItemMCAD;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemAbstractComponent createMMCLEVItemAbstractComponent() {
		MMCLEVItemAbstractComponentImpl mmclevItemAbstractComponent = new MMCLEVItemAbstractComponentImpl();
		return mmclevItemAbstractComponent;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemAbstractComponent createMMCLEVVersionedItemAbstractComponent() {
		MMCLEVVersionedItemAbstractComponentImpl mmclevVersionedItemAbstractComponent = new MMCLEVVersionedItemAbstractComponentImpl();
		return mmclevVersionedItemAbstractComponent;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemAbstractServiceLibrary createMMCLEVItemAbstractServiceLibrary() {
		MMCLEVItemAbstractServiceLibraryImpl mmclevItemAbstractServiceLibrary = new MMCLEVItemAbstractServiceLibraryImpl();
		return mmclevItemAbstractServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemAbstractServiceLibrary createMMCLEVVersionedItemAbstractServiceLibrary() {
		MMCLEVVersionedItemAbstractServiceLibraryImpl mmclevVersionedItemAbstractServiceLibrary = new MMCLEVVersionedItemAbstractServiceLibraryImpl();
		return mmclevVersionedItemAbstractServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemFlatMCAD createMMCLEVItemFlatMCAD() {
		MMCLEVItemFlatMCADImpl mmclevItemFlatMCAD = new MMCLEVItemFlatMCADImpl();
		return mmclevItemFlatMCAD;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemFlatMCAD createMMCLEVVersionedItemFlatMCAD() {
		MMCLEVVersionedItemFlatMCADImpl mmclevVersionedItemFlatMCAD = new MMCLEVVersionedItemFlatMCADImpl();
		return mmclevVersionedItemFlatMCAD;
	}

	/**
	 * @generated
	 */
	public MMCLEVItemDriverServiceLibrary createMMCLEVItemDriverServiceLibrary() {
		MMCLEVItemDriverServiceLibraryImpl mmclevItemDriverServiceLibrary = new MMCLEVItemDriverServiceLibraryImpl();
		return mmclevItemDriverServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MMCLEVVersionedItemDriverServiceLibrary createMMCLEVVersionedItemDriverServiceLibrary() {
		MMCLEVVersionedItemDriverServiceLibraryImpl mmclevVersionedItemDriverServiceLibrary = new MMCLEVVersionedItemDriverServiceLibraryImpl();
		return mmclevVersionedItemDriverServiceLibrary;
	}

	/**
	 * @generated
	 */
	public mclevlibraryPackage getmclevlibraryPackage() {
		return (mclevlibraryPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevlibraryPackage getPackage() {
		return mclevlibraryPackage.eINSTANCE;
	}

}