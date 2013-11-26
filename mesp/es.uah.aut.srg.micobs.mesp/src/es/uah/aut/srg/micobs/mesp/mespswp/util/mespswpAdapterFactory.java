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
package es.uah.aut.srg.micobs.mesp.mespswp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage
 * @generated
 */
public class mespswpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mespswpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mespswpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mespswpPackage.eINSTANCE;
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
	protected mespswpSwitch<Adapter> modelSwitch =
		new mespswpSwitch<Adapter>() {
			@Override
			public Adapter caseMSwPackage(MSwPackage object) {
				return createMSwPackageAdapter();
			}
			@Override
			public Adapter caseMDriverSwPackage(MDriverSwPackage object) {
				return createMDriverSwPackageAdapter();
			}
			@Override
			public Adapter caseMSwPackageProvidedInterface(MSwPackageProvidedInterface object) {
				return createMSwPackageProvidedInterfaceAdapter();
			}
			@Override
			public Adapter caseMSwPackageProvidedInterfacePVA(MSwPackageProvidedInterfacePVA object) {
				return createMSwPackageProvidedInterfacePVAAdapter();
			}
			@Override
			public Adapter caseMSwPackageProvidedInterfacePVASwitch(MSwPackageProvidedInterfacePVASwitch object) {
				return createMSwPackageProvidedInterfacePVASwitchAdapter();
			}
			@Override
			public Adapter caseMSwPackageProvidedInterfacePVASwitchCase(MSwPackageProvidedInterfacePVASwitchCase object) {
				return createMSwPackageProvidedInterfacePVASwitchCaseAdapter();
			}
			@Override
			public Adapter caseMSwPackageProvidedInterfacePVAExpression(MSwPackageProvidedInterfacePVAExpression object) {
				return createMSwPackageProvidedInterfacePVAExpressionAdapter();
			}
			@Override
			public Adapter caseMSwPackageRequiredInterface(MSwPackageRequiredInterface object) {
				return createMSwPackageRequiredInterfaceAdapter();
			}
			@Override
			public Adapter caseMAbstractSwPackage(MAbstractSwPackage object) {
				return createMAbstractSwPackageAdapter();
			}
			@Override
			public Adapter caseMSwPackageSupportedPlatform(MSwPackageSupportedPlatform object) {
				return createMSwPackageSupportedPlatformAdapter();
			}
			@Override
			public Adapter caseMDriverSwPackageSupportedPlatform(MDriverSwPackageSupportedPlatform object) {
				return createMDriverSwPackageSupportedPlatformAdapter();
			}
			@Override
			public Adapter caseMDriverSwPackageSupportedDevice(MDriverSwPackageSupportedDevice object) {
				return createMDriverSwPackageSupportedDeviceAdapter();
			}
			@Override
			public Adapter caseMResourceDemand(MResourceDemand object) {
				return createMResourceDemandAdapter();
			}
			@Override
			public Adapter caseMInstantiableResourceDemand(MInstantiableResourceDemand object) {
				return createMInstantiableResourceDemandAdapter();
			}
			@Override
			public Adapter caseMQuantifiableResourceDemand(MQuantifiableResourceDemand object) {
				return createMQuantifiableResourceDemandAdapter();
			}
			@Override
			public Adapter caseMMESPSWPPackageFile(MMESPSWPPackageFile object) {
				return createMMESPSWPPackageFileAdapter();
			}
			@Override
			public Adapter caseMMESPSWPPackageElement(MMESPSWPPackageElement object) {
				return createMMESPSWPPackageElementAdapter();
			}
			@Override
			public Adapter caseMParameterSWPSPSwitch(MParameterSWPSPSwitch object) {
				return createMParameterSWPSPSwitchAdapter();
			}
			@Override
			public Adapter caseMParameterSWPSPSwitchCase(MParameterSWPSPSwitchCase object) {
				return createMParameterSWPSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMBooleanParamSWPSPSwitch(MBooleanParamSWPSPSwitch object) {
				return createMBooleanParamSWPSPSwitchAdapter();
			}
			@Override
			public Adapter caseMBooleanParamSWPSPSwitchCase(MBooleanParamSWPSPSwitchCase object) {
				return createMBooleanParamSWPSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMStringParamSWPSPSwitch(MStringParamSWPSPSwitch object) {
				return createMStringParamSWPSPSwitchAdapter();
			}
			@Override
			public Adapter caseMStringParamSWPSPSwitchCase(MStringParamSWPSPSwitchCase object) {
				return createMStringParamSWPSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMIntegerParamSWPSPSwitch(MIntegerParamSWPSPSwitch object) {
				return createMIntegerParamSWPSPSwitchAdapter();
			}
			@Override
			public Adapter caseMIntegerParamSWPSPSwitchCase(MIntegerParamSWPSPSwitchCase object) {
				return createMIntegerParamSWPSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMEnumParamSWPSPSwitch(MEnumParamSWPSPSwitch object) {
				return createMEnumParamSWPSPSwitchAdapter();
			}
			@Override
			public Adapter caseMEnumParamSWPSPSwitchCase(MEnumParamSWPSPSwitchCase object) {
				return createMEnumParamSWPSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMRealParamSWPSPSwitch(MRealParamSWPSPSwitch object) {
				return createMRealParamSWPSPSwitchAdapter();
			}
			@Override
			public Adapter caseMRealParamSWPSPSwitchCase(MRealParamSWPSPSwitchCase object) {
				return createMRealParamSWPSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMCommonPackageElement(MCommonPackageElement object) {
				return createMCommonPackageElementAdapter();
			}
			@Override
			public Adapter caseMParameterValueAssignment(MParameterValueAssignment object) {
				return createMParameterValueAssignmentAdapter();
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
			public Adapter caseMParameter(MParameter object) {
				return createMParameterAdapter();
			}
			@Override
			public Adapter caseMBooleanParameter(MBooleanParameter object) {
				return createMBooleanParameterAdapter();
			}
			@Override
			public Adapter caseMStringParameter(MStringParameter object) {
				return createMStringParameterAdapter();
			}
			@Override
			public Adapter caseMIntegerParameter(MIntegerParameter object) {
				return createMIntegerParameterAdapter();
			}
			@Override
			public Adapter caseMEnumParameter(MEnumParameter object) {
				return createMEnumParameterAdapter();
			}
			@Override
			public Adapter caseMRealParameter(MRealParameter object) {
				return createMRealParameterAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage <em>MSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage
	 * @generated
	 */
	public Adapter createMSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage <em>MDriverSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage
	 * @generated
	 */
	public Adapter createMDriverSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface <em>MSwPackageProvidedInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface
	 * @generated
	 */
	public Adapter createMSwPackageProvidedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA <em>MSwPackageProvidedInterfacePVA</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA
	 * @generated
	 */
	public Adapter createMSwPackageProvidedInterfacePVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch <em>MSwPackageProvidedInterfacePVASwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch
	 * @generated
	 */
	public Adapter createMSwPackageProvidedInterfacePVASwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase <em>MSwPackageProvidedInterfacePVASwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase
	 * @generated
	 */
	public Adapter createMSwPackageProvidedInterfacePVASwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression <em>MSwPackageProvidedInterfacePVAExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression
	 * @generated
	 */
	public Adapter createMSwPackageProvidedInterfacePVAExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface <em>MSwPackageRequiredInterface</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface
	 * @generated
	 */
	public Adapter createMSwPackageRequiredInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage <em>MAbstractSwPackage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage
	 * @generated
	 */
	public Adapter createMAbstractSwPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform <em>MSw Package Supported Platform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform
	 * @generated
	 */
	public Adapter createMSwPackageSupportedPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform <em>MDriverSwPackageSupportedPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform
	 * @generated
	 */
	public Adapter createMDriverSwPackageSupportedPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice <em>MDriverSwPackageSupportedDevice</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice
	 * @generated
	 */
	public Adapter createMDriverSwPackageSupportedDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand <em>MResourceDemand</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand
	 * @generated
	 */
	public Adapter createMResourceDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand <em>MInstantiableResourceDemand</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand
	 * @generated
	 */
	public Adapter createMInstantiableResourceDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand <em>MQuantifiableResourceDemand</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand
	 * @generated
	 */
	public Adapter createMQuantifiableResourceDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile <em>MMESPSWPPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile
	 * @generated
	 */
	public Adapter createMMESPSWPPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement <em>MMESPSWPPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement
	 * @generated
	 */
	public Adapter createMMESPSWPPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch <em>MParameterSWPSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch
	 * @generated
	 */
	public Adapter createMParameterSWPSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase <em>MParameterSWPSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase
	 * @generated
	 */
	public Adapter createMParameterSWPSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitch <em>MBooleanParamSWPSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitch
	 * @generated
	 */
	public Adapter createMBooleanParamSWPSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitchCase <em>MBooleanParamSWPSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitchCase
	 * @generated
	 */
	public Adapter createMBooleanParamSWPSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch <em>MStringParamSWPSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch
	 * @generated
	 */
	public Adapter createMStringParamSWPSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase <em>MStringParamSWPSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase
	 * @generated
	 */
	public Adapter createMStringParamSWPSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch <em>MIntegerParamSWPSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch
	 * @generated
	 */
	public Adapter createMIntegerParamSWPSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase <em>MIntegerParamSWPSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase
	 * @generated
	 */
	public Adapter createMIntegerParamSWPSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch <em>MEnumParamSWPSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch
	 * @generated
	 */
	public Adapter createMEnumParamSWPSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitchCase <em>MEnumParamSWPSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitchCase
	 * @generated
	 */
	public Adapter createMEnumParamSWPSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch <em>MRealParamSWPSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch
	 * @generated
	 */
	public Adapter createMRealParamSWPSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase <em>MRealParamSWPSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase
	 * @generated
	 */
	public Adapter createMRealParamSWPSPSwitchCaseAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignment <em>MParameterValueAssignment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignment
	 * @generated
	 */
	public Adapter createMParameterValueAssignmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameter <em>MParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameter
	 * @generated
	 */
	public Adapter createMParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MBooleanParameter <em>MBooleanParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MBooleanParameter
	 * @generated
	 */
	public Adapter createMBooleanParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MStringParameter <em>MStringParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MStringParameter
	 * @generated
	 */
	public Adapter createMStringParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MIntegerParameter <em>MIntegerParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MIntegerParameter
	 * @generated
	 */
	public Adapter createMIntegerParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParameter <em>MEnumParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameter
	 * @generated
	 */
	public Adapter createMEnumParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MRealParameter <em>MRealParameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MRealParameter
	 * @generated
	 */
	public Adapter createMRealParameterAdapter() {
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