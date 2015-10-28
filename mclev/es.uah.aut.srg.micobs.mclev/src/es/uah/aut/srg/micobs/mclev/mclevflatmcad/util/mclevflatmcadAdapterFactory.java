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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage
 * @generated
 */
public class mclevflatmcadAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevflatmcadPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevflatmcadAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevflatmcadPackage.eINSTANCE;
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
	protected mclevflatmcadSwitch<Adapter> modelSwitch =
		new mclevflatmcadSwitch<Adapter>() {
			@Override
			public Adapter caseMFlatMCAD(MFlatMCAD object) {
				return createMFlatMCADAdapter();
			}
			@Override
			public Adapter caseMFlatMCADTarget(MFlatMCADTarget object) {
				return createMFlatMCADTargetAdapter();
			}
			@Override
			public Adapter caseMFlatServiceLibraryInstance(MFlatServiceLibraryInstance object) {
				return createMFlatServiceLibraryInstanceAdapter();
			}
			@Override
			public Adapter caseMFlatDriverSLibInstance(MFlatDriverSLibInstance object) {
				return createMFlatDriverSLibInstanceAdapter();
			}
			@Override
			public Adapter caseMFlatComponentInstance(MFlatComponentInstance object) {
				return createMFlatComponentInstanceAdapter();
			}
			@Override
			public Adapter caseMFlatConnection(MFlatConnection object) {
				return createMFlatConnectionAdapter();
			}
			@Override
			public Adapter caseMMCLEVFLATMCADPackageFile(MMCLEVFLATMCADPackageFile object) {
				return createMMCLEVFLATMCADPackageFileAdapter();
			}
			@Override
			public Adapter caseMMCLEVFLATMCADPackageElement(MMCLEVFLATMCADPackageElement object) {
				return createMMCLEVFLATMCADPackageElementAdapter();
			}
			@Override
			public Adapter caseMFlatDeviceDriverMapping(MFlatDeviceDriverMapping object) {
				return createMFlatDeviceDriverMappingAdapter();
			}
			@Override
			public Adapter caseMCommonPackageElement(MCommonPackageElement object) {
				return createMCommonPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageReferencingElement(MCommonPackageReferencingElement object) {
				return createMCommonPackageReferencingElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD <em>MFlat MCAD</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD
	 * @generated
	 */
	public Adapter createMFlatMCADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget <em>MFlat MCAD Target</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget
	 * @generated
	 */
	public Adapter createMFlatMCADTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance <em>MFlat Service Library Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance
	 * @generated
	 */
	public Adapter createMFlatServiceLibraryInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance <em>MFlat Driver SLib Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance
	 * @generated
	 */
	public Adapter createMFlatDriverSLibInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance <em>MFlat Component Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance
	 * @generated
	 */
	public Adapter createMFlatComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection <em>MFlat Connection</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection
	 * @generated
	 */
	public Adapter createMFlatConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile <em>MMCLEVFLATMCAD Package File</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile
	 * @generated
	 */
	public Adapter createMMCLEVFLATMCADPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageElement <em>MMCLEVFLATMCAD Package Element</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageElement
	 * @generated
	 */
	public Adapter createMMCLEVFLATMCADPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping <em>MFlat Device Driver Mapping</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping
	 * @generated
	 */
	public Adapter createMFlatDeviceDriverMappingAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement <em>MCommon Package Referencing Element</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement
	 * @generated
	 */
	public Adapter createMCommonPackageReferencingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommon Referenceable Obj</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	public Adapter createMCommonReferenceableObjAdapter() {
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