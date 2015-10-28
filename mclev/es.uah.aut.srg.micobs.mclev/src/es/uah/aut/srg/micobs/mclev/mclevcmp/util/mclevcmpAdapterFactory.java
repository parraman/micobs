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
package es.uah.aut.srg.micobs.mclev.mclevcmp.util;

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
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage
 * @generated
 */
public class mclevcmpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevcmpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevcmpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevcmpPackage.eINSTANCE;
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
	protected mclevcmpSwitch<Adapter> modelSwitch =
		new mclevcmpSwitch<Adapter>() {
			@Override
			public Adapter caseMComponent(MComponent object) {
				return createMComponentAdapter();
			}
			@Override
			public Adapter caseMAbstractComponent(MAbstractComponent object) {
				return createMAbstractComponentAdapter();
			}
			@Override
			public Adapter caseMComponentSupportedPlatform(MComponentSupportedPlatform object) {
				return createMComponentSupportedPlatformAdapter();
			}
			@Override
			public Adapter caseMInternalComponentInstance(MInternalComponentInstance object) {
				return createMInternalComponentInstanceAdapter();
			}
			@Override
			public Adapter caseMPort(MPort object) {
				return createMPortAdapter();
			}
			@Override
			public Adapter caseMServerPort(MServerPort object) {
				return createMServerPortAdapter();
			}
			@Override
			public Adapter caseMClientPort(MClientPort object) {
				return createMClientPortAdapter();
			}
			@Override
			public Adapter caseMInternalConnection(MInternalConnection object) {
				return createMInternalConnectionAdapter();
			}
			@Override
			public Adapter caseMInternalComponentConnection(MInternalComponentConnection object) {
				return createMInternalComponentConnectionAdapter();
			}
			@Override
			public Adapter caseMInternalComponentPlatformSwitch(MInternalComponentPlatformSwitch object) {
				return createMInternalComponentPlatformSwitchAdapter();
			}
			@Override
			public Adapter caseMInternalComponentPlatformSwitchCase(MInternalComponentPlatformSwitchCase object) {
				return createMInternalComponentPlatformSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMMCLEVCMPPackageFile(MMCLEVCMPPackageFile object) {
				return createMMCLEVCMPPackageFileAdapter();
			}
			@Override
			public Adapter caseMMCLEVCMPPackageElement(MMCLEVCMPPackageElement object) {
				return createMMCLEVCMPPackageElementAdapter();
			}
			@Override
			public Adapter caseMParameterCSPSwitch(MParameterCSPSwitch object) {
				return createMParameterCSPSwitchAdapter();
			}
			@Override
			public Adapter caseMParameterCSPSwitchCase(MParameterCSPSwitchCase object) {
				return createMParameterCSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMBooleanParamCSPSwitch(MBooleanParamCSPSwitch object) {
				return createMBooleanParamCSPSwitchAdapter();
			}
			@Override
			public Adapter caseMBooleanParamCSPSwitchCase(MBooleanParamCSPSwitchCase object) {
				return createMBooleanParamCSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMStringParamCSPSwitch(MStringParamCSPSwitch object) {
				return createMStringParamCSPSwitchAdapter();
			}
			@Override
			public Adapter caseMStringParamCSPSwitchCase(MStringParamCSPSwitchCase object) {
				return createMStringParamCSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMIntegerParamCSPSwitch(MIntegerParamCSPSwitch object) {
				return createMIntegerParamCSPSwitchAdapter();
			}
			@Override
			public Adapter caseMIntegerParamCSPSwitchCase(MIntegerParamCSPSwitchCase object) {
				return createMIntegerParamCSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMEnumParamCSPSwitch(MEnumParamCSPSwitch object) {
				return createMEnumParamCSPSwitchAdapter();
			}
			@Override
			public Adapter caseMEnumParamCSPSwitchCase(MEnumParamCSPSwitchCase object) {
				return createMEnumParamCSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMRealParamCSPSwitch(MRealParamCSPSwitch object) {
				return createMRealParamCSPSwitchAdapter();
			}
			@Override
			public Adapter caseMRealParamCSPSwitchCase(MRealParamCSPSwitchCase object) {
				return createMRealParamCSPSwitchCaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent <em>MComponent</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent
	 * @generated
	 */
	public Adapter createMComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent <em>MAbstractComponent</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent
	 * @generated
	 */
	public Adapter createMAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform <em>MComponentSupportedPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform
	 * @generated
	 */
	public Adapter createMComponentSupportedPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance <em>MInternalComponentInstance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance
	 * @generated
	 */
	public Adapter createMInternalComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort <em>MPort</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MPort
	 * @generated
	 */
	public Adapter createMPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort <em>MServerPort</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort
	 * @generated
	 */
	public Adapter createMServerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort <em>MClientPort</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort
	 * @generated
	 */
	public Adapter createMClientPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection <em>MInternalConnection</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection
	 * @generated
	 */
	public Adapter createMInternalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection <em>MInternalComponentConnection</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection
	 * @generated
	 */
	public Adapter createMInternalComponentConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch <em>MInternalComponentPlatformSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch
	 * @generated
	 */
	public Adapter createMInternalComponentPlatformSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase <em>MInternalComponentPlatformSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase
	 * @generated
	 */
	public Adapter createMInternalComponentPlatformSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile <em>MMCLEVCMPPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile
	 * @generated
	 */
	public Adapter createMMCLEVCMPPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageElement <em>MMCLEVCMPPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageElement
	 * @generated
	 */
	public Adapter createMMCLEVCMPPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch <em>MParameterCSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch
	 * @generated
	 */
	public Adapter createMParameterCSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase <em>MParameterCSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase
	 * @generated
	 */
	public Adapter createMParameterCSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitch <em>MBooleanParamCSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitch
	 * @generated
	 */
	public Adapter createMBooleanParamCSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitchCase <em>MBooleanParamCSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitchCase
	 * @generated
	 */
	public Adapter createMBooleanParamCSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitch <em>MStringParamCSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitch
	 * @generated
	 */
	public Adapter createMStringParamCSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitchCase <em>MStringParamCSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitchCase
	 * @generated
	 */
	public Adapter createMStringParamCSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitch <em>MIntegerParamCSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitch
	 * @generated
	 */
	public Adapter createMIntegerParamCSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase <em>MIntegerParamCSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase
	 * @generated
	 */
	public Adapter createMIntegerParamCSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitch <em>MEnumParamCSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitch
	 * @generated
	 */
	public Adapter createMEnumParamCSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitchCase <em>MEnumParamCSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitchCase
	 * @generated
	 */
	public Adapter createMEnumParamCSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch <em>MRealParamCSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch
	 * @generated
	 */
	public Adapter createMRealParamCSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase <em>MRealParamCSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase
	 * @generated
	 */
	public Adapter createMRealParamCSPSwitchCaseAdapter() {
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