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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage;

/**
 * An implementation of the model <b>Factory</b>.
 *
 * @generated
 */
public class edroomlibraryFactoryImpl extends EFactoryImpl implements edroomlibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static edroomlibraryFactory init() {
		try {
			edroomlibraryFactory theedroomlibraryFactory = (edroomlibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mclev/domain/edroom/library/edroomlibrary");
			if (theedroomlibraryFactory != null) {
				return theedroomlibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new edroomlibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public edroomlibraryFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case edroomlibraryPackage.EDROOM_LIBRARY: return createEDROOMLibrary();
			case edroomlibraryPackage.EDROOM_PACKAGE: return createEDROOMPackage();
			case edroomlibraryPackage.EDROOM_ITEM_DATA_CLASS: return createEDROOMItemDataClass();
			case edroomlibraryPackage.EDROOM_VERSIONED_ITEM_DATA_CLASS: return createEDROOMVersionedItemDataClass();
			case edroomlibraryPackage.EDROOM_ITEM_PROTOCOL: return createEDROOMItemProtocol();
			case edroomlibraryPackage.EDROOM_VERSIONED_ITEM_PROTOCOL: return createEDROOMVersionedItemProtocol();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public EDROOMLibrary createEDROOMLibrary() {
		EDROOMLibraryImpl edroomLibrary = new EDROOMLibraryImpl();
		return edroomLibrary;
	}

	/**
	 * @generated
	 */
	public EDROOMPackage createEDROOMPackage() {
		EDROOMPackageImpl edroomPackage = new EDROOMPackageImpl();
		return edroomPackage;
	}

	/**
	 * @generated
	 */
	public EDROOMItemDataClass createEDROOMItemDataClass() {
		EDROOMItemDataClassImpl edroomItemDataClass = new EDROOMItemDataClassImpl();
		return edroomItemDataClass;
	}

	/**
	 * @generated
	 */
	public EDROOMVersionedItemDataClass createEDROOMVersionedItemDataClass() {
		EDROOMVersionedItemDataClassImpl edroomVersionedItemDataClass = new EDROOMVersionedItemDataClassImpl();
		return edroomVersionedItemDataClass;
	}

	/**
	 * @generated
	 */
	public EDROOMItemProtocol createEDROOMItemProtocol() {
		EDROOMItemProtocolImpl edroomItemProtocol = new EDROOMItemProtocolImpl();
		return edroomItemProtocol;
	}

	/**
	 * @generated
	 */
	public EDROOMVersionedItemProtocol createEDROOMVersionedItemProtocol() {
		EDROOMVersionedItemProtocolImpl edroomVersionedItemProtocol = new EDROOMVersionedItemProtocolImpl();
		return edroomVersionedItemProtocol;
	}

	/**
	 * @generated
	 */
	public edroomlibraryPackage getedroomlibraryPackage() {
		return (edroomlibraryPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static edroomlibraryPackage getPackage() {
		return edroomlibraryPackage.eINSTANCE;
	}

}
