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
package es.uah.aut.srg.micobs.mclev.mclevslib.util;

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
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVA;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage
 * @generated
 */
public class mclevslibAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevslibPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevslibAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevslibPackage.eINSTANCE;
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
	protected mclevslibSwitch<Adapter> modelSwitch =
		new mclevslibSwitch<Adapter>() {
			@Override
			public Adapter caseMServiceLibrary(MServiceLibrary object) {
				return createMServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMServiceLibraryProvidedSAI(MServiceLibraryProvidedSAI object) {
				return createMServiceLibraryProvidedSAIAdapter();
			}
			@Override
			public Adapter caseMSLibProvidedSAIAVA(MSLibProvidedSAIAVA object) {
				return createMSLibProvidedSAIAVAAdapter();
			}
			@Override
			public Adapter caseMSLibProvidedSAIAVASwitch(MSLibProvidedSAIAVASwitch object) {
				return createMSLibProvidedSAIAVASwitchAdapter();
			}
			@Override
			public Adapter caseMSLibProvidedSAIAVASwitchCase(MSLibProvidedSAIAVASwitchCase object) {
				return createMSLibProvidedSAIAVASwitchCaseAdapter();
			}
			@Override
			public Adapter caseMSLibProvidedSAIAVAExpression(MSLibProvidedSAIAVAExpression object) {
				return createMSLibProvidedSAIAVAExpressionAdapter();
			}
			@Override
			public Adapter caseMServiceLibrarySupportedPlatform(MServiceLibrarySupportedPlatform object) {
				return createMServiceLibrarySupportedPlatformAdapter();
			}
			@Override
			public Adapter caseMDriverSLibSupportedPlatform(MDriverSLibSupportedPlatform object) {
				return createMDriverSLibSupportedPlatformAdapter();
			}
			@Override
			public Adapter caseMDriverSLibSupportedDevice(MDriverSLibSupportedDevice object) {
				return createMDriverSLibSupportedDeviceAdapter();
			}
			@Override
			public Adapter caseMAbstractServiceLibrary(MAbstractServiceLibrary object) {
				return createMAbstractServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMMCLEVSLIBPackageFile(MMCLEVSLIBPackageFile object) {
				return createMMCLEVSLIBPackageFileAdapter();
			}
			@Override
			public Adapter caseMMCLEVSLIBPackageElement(MMCLEVSLIBPackageElement object) {
				return createMMCLEVSLIBPackageElementAdapter();
			}
			@Override
			public Adapter caseMDriverServiceLibrary(MDriverServiceLibrary object) {
				return createMDriverServiceLibraryAdapter();
			}
			@Override
			public Adapter caseMParameterSLSPSwitch(MParameterSLSPSwitch object) {
				return createMParameterSLSPSwitchAdapter();
			}
			@Override
			public Adapter caseMParameterSLSPSwitchCase(MParameterSLSPSwitchCase object) {
				return createMParameterSLSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMBooleanParamSLSPSwitch(MBooleanParamSLSPSwitch object) {
				return createMBooleanParamSLSPSwitchAdapter();
			}
			@Override
			public Adapter caseMBooleanParamSLSPSwitchCase(MBooleanParamSLSPSwitchCase object) {
				return createMBooleanParamSLSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMStringParamSLSPSwitch(MStringParamSLSPSwitch object) {
				return createMStringParamSLSPSwitchAdapter();
			}
			@Override
			public Adapter caseMStringParamSLSPSwitchCase(MStringParamSLSPSwitchCase object) {
				return createMStringParamSLSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMIntegerParamSLSPSwitch(MIntegerParamSLSPSwitch object) {
				return createMIntegerParamSLSPSwitchAdapter();
			}
			@Override
			public Adapter caseMIntegerParamSLSPSwitchCase(MIntegerParamSLSPSwitchCase object) {
				return createMIntegerParamSLSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMEnumParamSLSPSwitch(MEnumParamSLSPSwitch object) {
				return createMEnumParamSLSPSwitchAdapter();
			}
			@Override
			public Adapter caseMEnumParamSLSPSwitchCase(MEnumParamSLSPSwitchCase object) {
				return createMEnumParamSLSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMRealParamSLSPSwitch(MRealParamSLSPSwitch object) {
				return createMRealParamSLSPSwitchAdapter();
			}
			@Override
			public Adapter caseMRealParamSLSPSwitchCase(MRealParamSLSPSwitchCase object) {
				return createMRealParamSLSPSwitchCaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary <em>MServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary
	 * @generated
	 */
	public Adapter createMServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI <em>MServiceLibraryProvidedSAI</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI
	 * @generated
	 */
	public Adapter createMServiceLibraryProvidedSAIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVA <em>MSLibProvidedSAIAVA</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVA
	 * @generated
	 */
	public Adapter createMSLibProvidedSAIAVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch <em>MSLibProvidedSAIAVASwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch
	 * @generated
	 */
	public Adapter createMSLibProvidedSAIAVASwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase <em>MSLibProvidedSAIAVASwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase
	 * @generated
	 */
	public Adapter createMSLibProvidedSAIAVASwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression <em>MSLibProvidedSAIAVAExpression</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression
	 * @generated
	 */
	public Adapter createMSLibProvidedSAIAVAExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform <em>MServiceLibrarySupportedPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform
	 * @generated
	 */
	public Adapter createMServiceLibrarySupportedPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform <em>MDriverSLibSupportedPlatform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform
	 * @generated
	 */
	public Adapter createMDriverSLibSupportedPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice <em>MDriverSLibSupportedDevice</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice
	 * @generated
	 */
	public Adapter createMDriverSLibSupportedDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary <em>MAbstractServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary
	 * @generated
	 */
	public Adapter createMAbstractServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile <em>MMCLEVSLIBPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile
	 * @generated
	 */
	public Adapter createMMCLEVSLIBPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageElement <em>MMCLEVSLIBPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageElement
	 * @generated
	 */
	public Adapter createMMCLEVSLIBPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary <em>MDriverServiceLibrary</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary
	 * @generated
	 */
	public Adapter createMDriverServiceLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch <em>MParameterSLSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch
	 * @generated
	 */
	public Adapter createMParameterSLSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase <em>MParameter SLSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase
	 * @generated
	 */
	public Adapter createMParameterSLSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitch <em>MBooleanParamSLSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitch
	 * @generated
	 */
	public Adapter createMBooleanParamSLSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitchCase <em>MBooleanParamSLSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitchCase
	 * @generated
	 */
	public Adapter createMBooleanParamSLSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitch <em>MStringParamSLSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitch
	 * @generated
	 */
	public Adapter createMStringParamSLSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitchCase <em>MStringParamSLSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitchCase
	 * @generated
	 */
	public Adapter createMStringParamSLSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch <em>MIntegerParamSLSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch
	 * @generated
	 */
	public Adapter createMIntegerParamSLSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase <em>MIntegerParamSLSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase
	 * @generated
	 */
	public Adapter createMIntegerParamSLSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitch <em>MEnumParamSLSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitch
	 * @generated
	 */
	public Adapter createMEnumParamSLSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitchCase <em>MEnumParamSLSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitchCase
	 * @generated
	 */
	public Adapter createMEnumParamSLSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch <em>MRealParamSLSPSwitch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch
	 * @generated
	 */
	public Adapter createMRealParamSLSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase <em>MRealParamSLSPSwitchCase</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase
	 * @generated
	 */
	public Adapter createMRealParamSLSPSwitchCaseAdapter() {
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