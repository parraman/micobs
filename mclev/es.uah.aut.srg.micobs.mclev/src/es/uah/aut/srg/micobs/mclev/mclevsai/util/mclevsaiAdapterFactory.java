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
package es.uah.aut.srg.micobs.mclev.mclevsai.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage
 * @generated
 */
public class mclevsaiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevsaiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevsaiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevsaiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
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
	protected mclevsaiSwitch<Adapter> modelSwitch =
		new mclevsaiSwitch<Adapter>() {
			@Override
			public Adapter caseMSAI(MSAI object) {
				return createMSAIAdapter();
			}
			@Override
			public Adapter caseMMCLEVSAIPackageFile(MMCLEVSAIPackageFile object) {
				return createMMCLEVSAIPackageFileAdapter();
			}
			@Override
			public Adapter caseMMCLEVSAIPackageElement(MMCLEVSAIPackageElement object) {
				return createMMCLEVSAIPackageElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI <em>MSAI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MSAI
	 * @generated
	 */
	public Adapter createMSAIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile <em>MMCLEVSAIPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile
	 * @generated
	 */
	public Adapter createMMCLEVSAIPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageElement <em>MMCLEVSAIPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageElement
	 * @generated
	 */
	public Adapter createMMCLEVSAIPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement <em>MCommonPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement
	 * @generated
	 */
	public Adapter createMCommonPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile <em>MCommonPackageFile</em>}'.
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