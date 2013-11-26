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
package es.uah.aut.srg.micobs.mesp.mespctool.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageElement;
import es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageFile;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolFactory;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mespctoolFactoryImpl extends EFactoryImpl implements mespctoolFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mespctoolFactory init() {
		try {
			mespctoolFactory themespctoolFactory = (mespctoolFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mesp/mespctool"); 
			if (themespctoolFactory != null) {
				return themespctoolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mespctoolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mespctoolFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mespctoolPackage.MCONSTRUCTION_TOOL: return createMConstructionTool();
			case mespctoolPackage.MMESPCTOOL_PACKAGE_FILE: return createMMESPCTOOLPackageFile();
			case mespctoolPackage.MMESPCTOOL_PACKAGE_ELEMENT: return createMMESPCTOOLPackageElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MConstructionTool createMConstructionTool() {
		MConstructionToolImpl mConstructionTool = new MConstructionToolImpl();
		return mConstructionTool;
	}

	/**
	 * @generated
	 */
	public MMESPCTOOLPackageFile createMMESPCTOOLPackageFile() {
		MMESPCTOOLPackageFileImpl mmespctoolPackageFile = new MMESPCTOOLPackageFileImpl();
		return mmespctoolPackageFile;
	}

	/**
	 * @generated
	 */
	public MMESPCTOOLPackageElement createMMESPCTOOLPackageElement() {
		MMESPCTOOLPackageElementImpl mmespctoolPackageElement = new MMESPCTOOLPackageElementImpl();
		return mmespctoolPackageElement;
	}

	/**
	 * @generated
	 */
	public mespctoolPackage getmespctoolPackage() {
		return (mespctoolPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mespctoolPackage getPackage() {
		return mespctoolPackage.eINSTANCE;
	}

}
