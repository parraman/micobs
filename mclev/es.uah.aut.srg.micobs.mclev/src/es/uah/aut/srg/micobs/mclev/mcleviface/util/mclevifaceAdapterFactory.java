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
package es.uah.aut.srg.micobs.mclev.mcleviface.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageElement;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage
 * @generated
 */
public class mclevifaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevifacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevifaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevifacePackage.eINSTANCE;
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
	protected mclevifaceSwitch<Adapter> modelSwitch =
		new mclevifaceSwitch<Adapter>() {
			@Override
			public Adapter caseMInterface(MInterface object) {
				return createMInterfaceAdapter();
			}
			@Override
			public Adapter caseMMCLEVIFACEPackageFile(MMCLEVIFACEPackageFile object) {
				return createMMCLEVIFACEPackageFileAdapter();
			}
			@Override
			public Adapter caseMMCLEVIFACEPackageElement(MMCLEVIFACEPackageElement object) {
				return createMMCLEVIFACEPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageElement(MCommonPackageElement object) {
				return createMCommonPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageFile(MCommonPackageFile object) {
				return createMCommonPackageFileAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface <em>MInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MInterface
	 * @generated
	 */
	public Adapter createMInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile <em>MMCLEVIFACE Package File</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile
	 * @generated
	 */
	public Adapter createMMCLEVIFACEPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageElement <em>MMCLEVIFACE Package Element</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageElement
	 * @generated
	 */
	public Adapter createMMCLEVIFACEPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement <em>MCommon Package Element</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement
	 * @generated
	 */
	public Adapter createMCommonPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile <em>MCommon Package File</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageFile
	 * @generated
	 */
	public Adapter createMCommonPackageFileAdapter() {
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