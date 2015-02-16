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
package es.uah.aut.srg.micobs.pdl.util;

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
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.MDevice;
import es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPDLPackageElement;
import es.uah.aut.srg.micobs.pdl.MPDLPackageFile;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage
 * @generated
 */
public class pdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static pdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public pdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = pdlPackage.eINSTANCE;
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
	protected pdlSwitch<Adapter> modelSwitch =
		new pdlSwitch<Adapter>() {
			@Override
			public Adapter caseMBoard(MBoard object) {
				return createMBoardAdapter();
			}
			@Override
			public Adapter caseMBoardSupportedDevice(MBoardSupportedDevice object) {
				return createMBoardSupportedDeviceAdapter();
			}
			@Override
			public Adapter caseMMicroprocessor(MMicroprocessor object) {
				return createMMicroprocessorAdapter();
			}
			@Override
			public Adapter caseMOperatingSystem(MOperatingSystem object) {
				return createMOperatingSystemAdapter();
			}
			@Override
			public Adapter caseMOSSupportedPlatform(MOSSupportedPlatform object) {
				return createMOSSupportedPlatformAdapter();
			}
			@Override
			public Adapter caseMOSSupportedOSAPI(MOSSupportedOSAPI object) {
				return createMOSSupportedOSAPIAdapter();
			}
			@Override
			public Adapter caseMOSSupportedOSAPIPVA(MOSSupportedOSAPIPVA object) {
				return createMOSSupportedOSAPIPVAAdapter();
			}
			@Override
			public Adapter caseMOSSupportedOSAPIPVAExpression(MOSSupportedOSAPIPVAExpression object) {
				return createMOSSupportedOSAPIPVAExpressionAdapter();
			}
			@Override
			public Adapter caseMOSSupportedOSAPIPVASwitch(MOSSupportedOSAPIPVASwitch object) {
				return createMOSSupportedOSAPIPVASwitchAdapter();
			}
			@Override
			public Adapter caseMOSSupportedOSAPIPVASwitchCase(MOSSupportedOSAPIPVASwitchCase object) {
				return createMOSSupportedOSAPIPVASwitchCaseAdapter();
			}
			@Override
			public Adapter caseMOperatingSystemAPI(MOperatingSystemAPI object) {
				return createMOperatingSystemAPIAdapter();
			}
			@Override
			public Adapter caseMArchitecture(MArchitecture object) {
				return createMArchitectureAdapter();
			}
			@Override
			public Adapter caseMPDLPackageFile(MPDLPackageFile object) {
				return createMPDLPackageFileAdapter();
			}
			@Override
			public Adapter caseMPDLPackageElement(MPDLPackageElement object) {
				return createMPDLPackageElementAdapter();
			}
			@Override
			public Adapter caseMPlatform(MPlatform object) {
				return createMPlatformAdapter();
			}
			@Override
			public Adapter caseMCompiler(MCompiler object) {
				return createMCompilerAdapter();
			}
			@Override
			public Adapter caseMCompilerFrontend(MCompilerFrontend object) {
				return createMCompilerFrontendAdapter();
			}
			@Override
			public Adapter caseMDevice(MDevice object) {
				return createMDeviceAdapter();
			}
			@Override
			public Adapter caseMParameterOSSPSwitch(MParameterOSSPSwitch object) {
				return createMParameterOSSPSwitchAdapter();
			}
			@Override
			public Adapter caseMParameterOSSPSwitchCase(MParameterOSSPSwitchCase object) {
				return createMParameterOSSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMBooleanParamOSSPSwitch(MBooleanParamOSSPSwitch object) {
				return createMBooleanParamOSSPSwitchAdapter();
			}
			@Override
			public Adapter caseMBooleanParamOSSPSwitchCase(MBooleanParamOSSPSwitchCase object) {
				return createMBooleanParamOSSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMStringParamOSSPSwitch(MStringParamOSSPSwitch object) {
				return createMStringParamOSSPSwitchAdapter();
			}
			@Override
			public Adapter caseMStringParamOSSPSwitchCase(MStringParamOSSPSwitchCase object) {
				return createMStringParamOSSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMIntegerParamOSSPSwitch(MIntegerParamOSSPSwitch object) {
				return createMIntegerParamOSSPSwitchAdapter();
			}
			@Override
			public Adapter caseMIntegerParamOSSPSwitchCase(MIntegerParamOSSPSwitchCase object) {
				return createMIntegerParamOSSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMEnumParamOSSPSwitch(MEnumParamOSSPSwitch object) {
				return createMEnumParamOSSPSwitchAdapter();
			}
			@Override
			public Adapter caseMEnumParamOSSPSwitchCase(MEnumParamOSSPSwitchCase object) {
				return createMEnumParamOSSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMRealParamOSSPSwitch(MRealParamOSSPSwitch object) {
				return createMRealParamOSSPSwitchAdapter();
			}
			@Override
			public Adapter caseMRealParamOSSPSwitchCase(MRealParamOSSPSwitchCase object) {
				return createMRealParamOSSPSwitchCaseAdapter();
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
			public Adapter caseMParameterValueAssignment(MParameterValueAssignment object) {
				return createMParameterValueAssignmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MBoard <em>MBoard</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MBoard
	 * @generated
	 */
	public Adapter createMBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice <em>MBoard Supported Device</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice
	 * @generated
	 */
	public Adapter createMBoardSupportedDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MMicroprocessor <em>MMicroprocessor</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MMicroprocessor
	 * @generated
	 */
	public Adapter createMMicroprocessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem <em>MOperatingSystem</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystem
	 * @generated
	 */
	public Adapter createMOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform <em>MOSSupportedPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform
	 * @generated
	 */
	public Adapter createMOSSupportedPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI <em>MOSSupportedOSAPI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI
	 * @generated
	 */
	public Adapter createMOSSupportedOSAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA <em>MOS Supported OSAPIPVA</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA
	 * @generated
	 */
	public Adapter createMOSSupportedOSAPIPVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression <em>MOSSupportedOSAPIPVAExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression
	 * @generated
	 */
	public Adapter createMOSSupportedOSAPIPVAExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch <em>MOSSupportedOSAPIPVASwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch
	 * @generated
	 */
	public Adapter createMOSSupportedOSAPIPVASwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase <em>MOSSupportedOSAPIPVASwitch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase
	 * @generated
	 */
	public Adapter createMOSSupportedOSAPIPVASwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI <em>MOperatingSystemAPI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI
	 * @generated
	 */
	public Adapter createMOperatingSystemAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MArchitecture <em>MArchitecture</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MArchitecture
	 * @generated
	 */
	public Adapter createMArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MPDLPackageFile <em>MPDLPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MPDLPackageFile
	 * @generated
	 */
	public Adapter createMPDLPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MPDLPackageElement <em>MPDLPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MPDLPackageElement
	 * @generated
	 */
	public Adapter createMPDLPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MPlatform <em>MPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform
	 * @generated
	 */
	public Adapter createMPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MCompiler <em>MCompiler</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MCompiler
	 * @generated
	 */
	public Adapter createMCompilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend <em>MCompilerFrontend</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MCompilerFrontend
	 * @generated
	 */
	public Adapter createMCompilerFrontendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MDevice <em>MDevice</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MDevice
	 * @generated
	 */
	public Adapter createMDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch <em>MParameter OSSP Switch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch
	 * @generated
	 */
	public Adapter createMParameterOSSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase <em>MParameter OSSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase
	 * @generated
	 */
	public Adapter createMParameterOSSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch <em>MBooleanParamOSSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch
	 * @generated
	 */
	public Adapter createMBooleanParamOSSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase <em>MBooleanParamOSSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase
	 * @generated
	 */
	public Adapter createMBooleanParamOSSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch <em>MStringParamOSSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch
	 * @generated
	 */
	public Adapter createMStringParamOSSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase <em>MStringParamOSSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase
	 * @generated
	 */
	public Adapter createMStringParamOSSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch <em>MIntegerParamOSSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch
	 * @generated
	 */
	public Adapter createMIntegerParamOSSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase <em>MIntegerParamOSSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase
	 * @generated
	 */
	public Adapter createMIntegerParamOSSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch <em>MEnumParamOSSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch
	 * @generated
	 */
	public Adapter createMEnumParamOSSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase <em>MEnumParamOSSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase
	 * @generated
	 */
	public Adapter createMEnumParamOSSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch <em>MRealParamOSSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch
	 * @generated
	 */
	public Adapter createMRealParamOSSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase <em>MRealParamOSSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase
	 * @generated
	 */
	public Adapter createMRealParamOSSPSwitchCaseAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignment <em>MParameterValueAssignment</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignment
	 * @generated
	 */
	public Adapter createMParameterValueAssignmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MBooleanParameter <em>MBoolean Parameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MBooleanParameter
	 * @generated
	 */
	public Adapter createMBooleanParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MStringParameter <em>MString Parameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MStringParameter
	 * @generated
	 */
	public Adapter createMStringParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MIntegerParameter <em>MInteger Parameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MIntegerParameter
	 * @generated
	 */
	public Adapter createMIntegerParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MEnumParameter <em>MEnum Parameter</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameter
	 * @generated
	 */
	public Adapter createMEnumParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MRealParameter <em>MReal Parameter</em>}'.
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
