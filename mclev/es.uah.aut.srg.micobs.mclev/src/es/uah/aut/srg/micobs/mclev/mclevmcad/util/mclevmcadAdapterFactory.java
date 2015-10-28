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
package es.uah.aut.srg.micobs.mclev.mclevmcad.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage
 * @generated
 */
public class mclevmcadAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevmcadPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevmcadAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevmcadPackage.eINSTANCE;
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
	protected mclevmcadSwitch<Adapter> modelSwitch =
		new mclevmcadSwitch<Adapter>() {
			@Override
			public Adapter caseMMCADeployment(MMCADeployment object) {
				return createMMCADeploymentAdapter();
			}
			@Override
			public Adapter caseMServiceLibraryInstance(MServiceLibraryInstance object) {
				return createMServiceLibraryInstanceAdapter();
			}
			@Override
			public Adapter caseMDriverSLibInstance(MDriverSLibInstance object) {
				return createMDriverSLibInstanceAdapter();
			}
			@Override
			public Adapter caseMDeviceDriverMapping(MDeviceDriverMapping object) {
				return createMDeviceDriverMappingAdapter();
			}
			@Override
			public Adapter caseMComponentInstance(MComponentInstance object) {
				return createMComponentInstanceAdapter();
			}
			@Override
			public Adapter caseMDeploymentAlternative(MDeploymentAlternative object) {
				return createMDeploymentAlternativeAdapter();
			}
			@Override
			public Adapter caseMConnection(MConnection object) {
				return createMConnectionAdapter();
			}
			@Override
			public Adapter caseMCommonConnection(MCommonConnection object) {
				return createMCommonConnectionAdapter();
			}
			@Override
			public Adapter caseMConnectionSwitch(MConnectionSwitch object) {
				return createMConnectionSwitchAdapter();
			}
			@Override
			public Adapter caseMConnectionSwitchCase(MConnectionSwitchCase object) {
				return createMConnectionSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMDeploymentPlatform(MDeploymentPlatform object) {
				return createMDeploymentPlatformAdapter();
			}
			@Override
			public Adapter caseMDeployedDevice(MDeployedDevice object) {
				return createMDeployedDeviceAdapter();
			}
			@Override
			public Adapter caseMMCLEVMCADPackageFile(MMCLEVMCADPackageFile object) {
				return createMMCLEVMCADPackageFileAdapter();
			}
			@Override
			public Adapter caseMMCLEVMCADPackageElement(MMCLEVMCADPackageElement object) {
				return createMMCLEVMCADPackageElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment <em>MMCADeployment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment
	 * @generated
	 */
	public Adapter createMMCADeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance <em>MServiceLibraryInstance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance
	 * @generated
	 */
	public Adapter createMServiceLibraryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance <em>MDriverSLibInstance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance
	 * @generated
	 */
	public Adapter createMDriverSLibInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping <em>MDeviceDriverMapping</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping
	 * @generated
	 */
	public Adapter createMDeviceDriverMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance <em>MComponentInstance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance
	 * @generated
	 */
	public Adapter createMComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative <em>MDeploymentAlternative</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative
	 * @generated
	 */
	public Adapter createMDeploymentAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection <em>MConnection</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection
	 * @generated
	 */
	public Adapter createMConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection <em>MCommonConnection</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection
	 * @generated
	 */
	public Adapter createMCommonConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch <em>MConnectionSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch
	 * @generated
	 */
	public Adapter createMConnectionSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase <em>MConnectionSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase
	 * @generated
	 */
	public Adapter createMConnectionSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform <em>MDeploymentPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform
	 * @generated
	 */
	public Adapter createMDeploymentPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice <em>MDeployedDevice</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice
	 * @generated
	 */
	public Adapter createMDeployedDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile <em>MMCLEVMCADPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile
	 * @generated
	 */
	public Adapter createMMCLEVMCADPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageElement <em>MMCLEVMCADPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageElement
	 * @generated
	 */
	public Adapter createMMCLEVMCADPackageElementAdapter() {
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