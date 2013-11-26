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
package es.uah.aut.srg.micobs.mesp.mespdep.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageElement;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage
 * @generated
 */
public class mespdepAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mespdepPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mespdepAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mespdepPackage.eINSTANCE;
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
	protected mespdepSwitch<Adapter> modelSwitch =
		new mespdepSwitch<Adapter>() {
			@Override
			public Adapter caseMMESPDeployment(MMESPDeployment object) {
				return createMMESPDeploymentAdapter();
			}
			@Override
			public Adapter caseMMESPDeploymentPlatform(MMESPDeploymentPlatform object) {
				return createMMESPDeploymentPlatformAdapter();
			}
			@Override
			public Adapter caseMMESPDeployedDevice(MMESPDeployedDevice object) {
				return createMMESPDeployedDeviceAdapter();
			}
			@Override
			public Adapter caseMMESPDeploymentAlternative(MMESPDeploymentAlternative object) {
				return createMMESPDeploymentAlternativeAdapter();
			}
			@Override
			public Adapter caseMMESPSwPackageDeployment(MMESPSwPackageDeployment object) {
				return createMMESPSwPackageDeploymentAdapter();
			}
			@Override
			public Adapter caseMMESPDriverSwPackageDeployment(MMESPDriverSwPackageDeployment object) {
				return createMMESPDriverSwPackageDeploymentAdapter();
			}
			@Override
			public Adapter caseMMESPDeviceDriverMapping(MMESPDeviceDriverMapping object) {
				return createMMESPDeviceDriverMappingAdapter();
			}
			@Override
			public Adapter caseMMESPDEPPackageFile(MMESPDEPPackageFile object) {
				return createMMESPDEPPackageFileAdapter();
			}
			@Override
			public Adapter caseMMESPDEPPackageElement(MMESPDEPPackageElement object) {
				return createMMESPDEPPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageElement(MCommonPackageElement object) {
				return createMCommonPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment <em>MMESPDeployment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment
	 * @generated
	 */
	public Adapter createMMESPDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform <em>MMESPDeploymentPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform
	 * @generated
	 */
	public Adapter createMMESPDeploymentPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice <em>MMESPDeployedDevice</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice
	 * @generated
	 */
	public Adapter createMMESPDeployedDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative <em>MMESPDeploymentAlternative</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative
	 * @generated
	 */
	public Adapter createMMESPDeploymentAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment <em>MMESPSwPackageDeployment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment
	 * @generated
	 */
	public Adapter createMMESPSwPackageDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment <em>MMESPDriverSwPackageDeployment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment
	 * @generated
	 */
	public Adapter createMMESPDriverSwPackageDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping <em>MMESPDeviceDriverMapping</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping
	 * @generated
	 */
	public Adapter createMMESPDeviceDriverMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile <em>MMESPDEPPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile
	 * @generated
	 */
	public Adapter createMMESPDEPPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageElement <em>MMESPDEPPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageElement
	 * @generated
	 */
	public Adapter createMMESPDEPPackageElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommonReferenceableObj</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	public Adapter createMCommonReferenceableObjAdapter() {
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
