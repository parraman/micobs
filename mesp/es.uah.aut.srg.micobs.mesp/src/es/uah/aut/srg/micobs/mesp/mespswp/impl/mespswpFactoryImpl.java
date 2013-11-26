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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mespswpFactoryImpl extends EFactoryImpl implements mespswpFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mespswpFactory init() {
		try {
			mespswpFactory themespswpFactory = (mespswpFactory)EPackage.Registry.INSTANCE.getEFactory(mespswpPackage.eNS_URI);
			if (themespswpFactory != null) {
				return themespswpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mespswpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mespswpFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mespswpPackage.MSW_PACKAGE: return createMSwPackage();
			case mespswpPackage.MDRIVER_SW_PACKAGE: return createMDriverSwPackage();
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE: return createMSwPackageProvidedInterface();
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH: return createMSwPackageProvidedInterfacePVASwitch();
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE: return createMSwPackageProvidedInterfacePVASwitchCase();
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION: return createMSwPackageProvidedInterfacePVAExpression();
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE: return createMSwPackageRequiredInterface();
			case mespswpPackage.MABSTRACT_SW_PACKAGE: return createMAbstractSwPackage();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM: return createMSwPackageSupportedPlatform();
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM: return createMDriverSwPackageSupportedPlatform();
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE: return createMDriverSwPackageSupportedDevice();
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND: return createMInstantiableResourceDemand();
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND: return createMQuantifiableResourceDemand();
			case mespswpPackage.MMESPSWP_PACKAGE_FILE: return createMMESPSWPPackageFile();
			case mespswpPackage.MBOOLEAN_PARAM_SWPSP_SWITCH: return createMBooleanParamSWPSPSwitch();
			case mespswpPackage.MBOOLEAN_PARAM_SWPSP_SWITCH_CASE: return createMBooleanParamSWPSPSwitchCase();
			case mespswpPackage.MSTRING_PARAM_SWPSP_SWITCH: return createMStringParamSWPSPSwitch();
			case mespswpPackage.MSTRING_PARAM_SWPSP_SWITCH_CASE: return createMStringParamSWPSPSwitchCase();
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH: return createMIntegerParamSWPSPSwitch();
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH_CASE: return createMIntegerParamSWPSPSwitchCase();
			case mespswpPackage.MENUM_PARAM_SWPSP_SWITCH: return createMEnumParamSWPSPSwitch();
			case mespswpPackage.MENUM_PARAM_SWPSP_SWITCH_CASE: return createMEnumParamSWPSPSwitchCase();
			case mespswpPackage.MREAL_PARAM_SWPSP_SWITCH: return createMRealParamSWPSPSwitch();
			case mespswpPackage.MREAL_PARAM_SWPSP_SWITCH_CASE: return createMRealParamSWPSPSwitchCase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MSwPackage createMSwPackage() {
		MSwPackageImpl mSwPackage = new MSwPackageImpl();
		return mSwPackage;
	}

	/**
	 * @generated
	 */
	public MDriverSwPackage createMDriverSwPackage() {
		MDriverSwPackageImpl mDriverSwPackage = new MDriverSwPackageImpl();
		return mDriverSwPackage;
	}

	/**
	 * @generated
	 */
	public MSwPackageProvidedInterface createMSwPackageProvidedInterface() {
		MSwPackageProvidedInterfaceImpl mSwPackageProvidedInterface = new MSwPackageProvidedInterfaceImpl();
		return mSwPackageProvidedInterface;
	}

	/**
	 * @generated
	 */
	public MSwPackageProvidedInterfacePVASwitch createMSwPackageProvidedInterfacePVASwitch() {
		MSwPackageProvidedInterfacePVASwitchImpl mSwPackageProvidedInterfacePVASwitch = new MSwPackageProvidedInterfacePVASwitchImpl();
		return mSwPackageProvidedInterfacePVASwitch;
	}

	/**
	 * @generated
	 */
	public MSwPackageProvidedInterfacePVASwitchCase createMSwPackageProvidedInterfacePVASwitchCase() {
		MSwPackageProvidedInterfacePVASwitchCaseImpl mSwPackageProvidedInterfacePVASwitchCase = new MSwPackageProvidedInterfacePVASwitchCaseImpl();
		return mSwPackageProvidedInterfacePVASwitchCase;
	}

	/**
	 * @generated
	 */
	public MSwPackageProvidedInterfacePVAExpression createMSwPackageProvidedInterfacePVAExpression() {
		MSwPackageProvidedInterfacePVAExpressionImpl mSwPackageProvidedInterfacePVAExpression = new MSwPackageProvidedInterfacePVAExpressionImpl();
		return mSwPackageProvidedInterfacePVAExpression;
	}

	/**
	 * @generated
	 */
	public MSwPackageRequiredInterface createMSwPackageRequiredInterface() {
		MSwPackageRequiredInterfaceImpl mSwPackageRequiredInterface = new MSwPackageRequiredInterfaceImpl();
		return mSwPackageRequiredInterface;
	}

	/**
	 * @generated
	 */
	public MAbstractSwPackage createMAbstractSwPackage() {
		MAbstractSwPackageImpl mAbstractSwPackage = new MAbstractSwPackageImpl();
		return mAbstractSwPackage;
	}

	/**
	 * @generated
	 */
	public MSwPackageSupportedPlatform createMSwPackageSupportedPlatform() {
		MSwPackageSupportedPlatformImpl mSwPackageSupportedPlatform = new MSwPackageSupportedPlatformImpl();
		return mSwPackageSupportedPlatform;
	}

	/**
	 * @generated
	 */
	public MDriverSwPackageSupportedPlatform createMDriverSwPackageSupportedPlatform() {
		MDriverSwPackageSupportedPlatformImpl mDriverSwPackageSupportedPlatform = new MDriverSwPackageSupportedPlatformImpl();
		return mDriverSwPackageSupportedPlatform;
	}

	/**
	 * @generated
	 */
	public MDriverSwPackageSupportedDevice createMDriverSwPackageSupportedDevice() {
		MDriverSwPackageSupportedDeviceImpl mDriverSwPackageSupportedDevice = new MDriverSwPackageSupportedDeviceImpl();
		return mDriverSwPackageSupportedDevice;
	}

	/**
	 * @generated
	 */
	public MInstantiableResourceDemand createMInstantiableResourceDemand() {
		MInstantiableResourceDemandImpl mInstantiableResourceDemand = new MInstantiableResourceDemandImpl();
		return mInstantiableResourceDemand;
	}

	/**
	 * @generated
	 */
	public MQuantifiableResourceDemand createMQuantifiableResourceDemand() {
		MQuantifiableResourceDemandImpl mQuantifiableResourceDemand = new MQuantifiableResourceDemandImpl();
		return mQuantifiableResourceDemand;
	}

	/**
	 * @generated
	 */
	public MMESPSWPPackageFile createMMESPSWPPackageFile() {
		MMESPSWPPackageFileImpl mmespswpPackageFile = new MMESPSWPPackageFileImpl();
		return mmespswpPackageFile;
	}

	/**
	 * @generated
	 */
	public MBooleanParamSWPSPSwitch createMBooleanParamSWPSPSwitch() {
		MBooleanParamSWPSPSwitchImpl mBooleanParamSWPSPSwitch = new MBooleanParamSWPSPSwitchImpl();
		return mBooleanParamSWPSPSwitch;
	}

	/**
	 * @generated
	 */
	public MBooleanParamSWPSPSwitchCase createMBooleanParamSWPSPSwitchCase() {
		MBooleanParamSWPSPSwitchCaseImpl mBooleanParamSWPSPSwitchCase = new MBooleanParamSWPSPSwitchCaseImpl();
		return mBooleanParamSWPSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MStringParamSWPSPSwitch createMStringParamSWPSPSwitch() {
		MStringParamSWPSPSwitchImpl mStringParamSWPSPSwitch = new MStringParamSWPSPSwitchImpl();
		return mStringParamSWPSPSwitch;
	}

	/**
	 * @generated
	 */
	public MStringParamSWPSPSwitchCase createMStringParamSWPSPSwitchCase() {
		MStringParamSWPSPSwitchCaseImpl mStringParamSWPSPSwitchCase = new MStringParamSWPSPSwitchCaseImpl();
		return mStringParamSWPSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MIntegerParamSWPSPSwitch createMIntegerParamSWPSPSwitch() {
		MIntegerParamSWPSPSwitchImpl mIntegerParamSWPSPSwitch = new MIntegerParamSWPSPSwitchImpl();
		return mIntegerParamSWPSPSwitch;
	}

	/**
	 * @generated
	 */
	public MIntegerParamSWPSPSwitchCase createMIntegerParamSWPSPSwitchCase() {
		MIntegerParamSWPSPSwitchCaseImpl mIntegerParamSWPSPSwitchCase = new MIntegerParamSWPSPSwitchCaseImpl();
		return mIntegerParamSWPSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MEnumParamSWPSPSwitch createMEnumParamSWPSPSwitch() {
		MEnumParamSWPSPSwitchImpl mEnumParamSWPSPSwitch = new MEnumParamSWPSPSwitchImpl();
		return mEnumParamSWPSPSwitch;
	}

	/**
	 * @generated
	 */
	public MEnumParamSWPSPSwitchCase createMEnumParamSWPSPSwitchCase() {
		MEnumParamSWPSPSwitchCaseImpl mEnumParamSWPSPSwitchCase = new MEnumParamSWPSPSwitchCaseImpl();
		return mEnumParamSWPSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MRealParamSWPSPSwitch createMRealParamSWPSPSwitch() {
		MRealParamSWPSPSwitchImpl mRealParamSWPSPSwitch = new MRealParamSWPSPSwitchImpl();
		return mRealParamSWPSPSwitch;
	}

	/**
	 * @generated
	 */
	public MRealParamSWPSPSwitchCase createMRealParamSWPSPSwitchCase() {
		MRealParamSWPSPSwitchCaseImpl mRealParamSWPSPSwitchCase = new MRealParamSWPSPSwitchCaseImpl();
		return mRealParamSWPSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public mespswpPackage getmespswpPackage() {
		return (mespswpPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mespswpPackage getPackage() {
		return mespswpPackage.eINSTANCE;
	}

}