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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage
 * @generated
 */
public class mclevslibSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevslibPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevslibSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevslibPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case mclevslibPackage.MSERVICE_LIBRARY: {
				MServiceLibrary mServiceLibrary = (MServiceLibrary)theEObject;
				T result = caseMServiceLibrary(mServiceLibrary);
				if (result == null) result = caseMAbstractServiceLibrary(mServiceLibrary);
				if (result == null) result = caseMMCLEVSLIBPackageElement(mServiceLibrary);
				if (result == null) result = caseMCommonPackageElement(mServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI: {
				MServiceLibraryProvidedSAI mServiceLibraryProvidedSAI = (MServiceLibraryProvidedSAI)theEObject;
				T result = caseMServiceLibraryProvidedSAI(mServiceLibraryProvidedSAI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA: {
				MSLibProvidedSAIAVA msLibProvidedSAIAVA = (MSLibProvidedSAIAVA)theEObject;
				T result = caseMSLibProvidedSAIAVA(msLibProvidedSAIAVA);
				if (result == null) result = caseMParameterValueAssignment(msLibProvidedSAIAVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_SWITCH: {
				MSLibProvidedSAIAVASwitch msLibProvidedSAIAVASwitch = (MSLibProvidedSAIAVASwitch)theEObject;
				T result = caseMSLibProvidedSAIAVASwitch(msLibProvidedSAIAVASwitch);
				if (result == null) result = caseMSLibProvidedSAIAVA(msLibProvidedSAIAVASwitch);
				if (result == null) result = caseMParameterValueAssignment(msLibProvidedSAIAVASwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE: {
				MSLibProvidedSAIAVASwitchCase msLibProvidedSAIAVASwitchCase = (MSLibProvidedSAIAVASwitchCase)theEObject;
				T result = caseMSLibProvidedSAIAVASwitchCase(msLibProvidedSAIAVASwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION: {
				MSLibProvidedSAIAVAExpression msLibProvidedSAIAVAExpression = (MSLibProvidedSAIAVAExpression)theEObject;
				T result = caseMSLibProvidedSAIAVAExpression(msLibProvidedSAIAVAExpression);
				if (result == null) result = caseMSLibProvidedSAIAVA(msLibProvidedSAIAVAExpression);
				if (result == null) result = caseMParameterValueAssignment(msLibProvidedSAIAVAExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MSERVICE_LIBRARY_SUPPORTED_PLATFORM: {
				MServiceLibrarySupportedPlatform mServiceLibrarySupportedPlatform = (MServiceLibrarySupportedPlatform)theEObject;
				T result = caseMServiceLibrarySupportedPlatform(mServiceLibrarySupportedPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mServiceLibrarySupportedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM: {
				MDriverSLibSupportedPlatform mDriverSLibSupportedPlatform = (MDriverSLibSupportedPlatform)theEObject;
				T result = caseMDriverSLibSupportedPlatform(mDriverSLibSupportedPlatform);
				if (result == null) result = caseMServiceLibrarySupportedPlatform(mDriverSLibSupportedPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mDriverSLibSupportedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_DEVICE: {
				MDriverSLibSupportedDevice mDriverSLibSupportedDevice = (MDriverSLibSupportedDevice)theEObject;
				T result = caseMDriverSLibSupportedDevice(mDriverSLibSupportedDevice);
				if (result == null) result = caseMCommonReferenceableObj(mDriverSLibSupportedDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY: {
				MAbstractServiceLibrary mAbstractServiceLibrary = (MAbstractServiceLibrary)theEObject;
				T result = caseMAbstractServiceLibrary(mAbstractServiceLibrary);
				if (result == null) result = caseMMCLEVSLIBPackageElement(mAbstractServiceLibrary);
				if (result == null) result = caseMCommonPackageElement(mAbstractServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MMCLEVSLIB_PACKAGE_FILE: {
				MMCLEVSLIBPackageFile mmclevslibPackageFile = (MMCLEVSLIBPackageFile)theEObject;
				T result = caseMMCLEVSLIBPackageFile(mmclevslibPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevslibPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MMCLEVSLIB_PACKAGE_ELEMENT: {
				MMCLEVSLIBPackageElement mmclevslibPackageElement = (MMCLEVSLIBPackageElement)theEObject;
				T result = caseMMCLEVSLIBPackageElement(mmclevslibPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevslibPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MDRIVER_SERVICE_LIBRARY: {
				MDriverServiceLibrary mDriverServiceLibrary = (MDriverServiceLibrary)theEObject;
				T result = caseMDriverServiceLibrary(mDriverServiceLibrary);
				if (result == null) result = caseMServiceLibrary(mDriverServiceLibrary);
				if (result == null) result = caseMAbstractServiceLibrary(mDriverServiceLibrary);
				if (result == null) result = caseMMCLEVSLIBPackageElement(mDriverServiceLibrary);
				if (result == null) result = caseMCommonPackageElement(mDriverServiceLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH: {
				MParameterSLSPSwitch mParameterSLSPSwitch = (MParameterSLSPSwitch)theEObject;
				T result = caseMParameterSLSPSwitch(mParameterSLSPSwitch);
				if (result == null) result = caseMParameter(mParameterSLSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mParameterSLSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE: {
				MParameterSLSPSwitchCase mParameterSLSPSwitchCase = (MParameterSLSPSwitchCase)theEObject;
				T result = caseMParameterSLSPSwitchCase(mParameterSLSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MBOOLEAN_PARAM_SLSP_SWITCH: {
				MBooleanParamSLSPSwitch mBooleanParamSLSPSwitch = (MBooleanParamSLSPSwitch)theEObject;
				T result = caseMBooleanParamSLSPSwitch(mBooleanParamSLSPSwitch);
				if (result == null) result = caseMBooleanParameter(mBooleanParamSLSPSwitch);
				if (result == null) result = caseMParameterSLSPSwitch(mBooleanParamSLSPSwitch);
				if (result == null) result = caseMParameter(mBooleanParamSLSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mBooleanParamSLSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MBOOLEAN_PARAM_SLSP_SWITCH_CASE: {
				MBooleanParamSLSPSwitchCase mBooleanParamSLSPSwitchCase = (MBooleanParamSLSPSwitchCase)theEObject;
				T result = caseMBooleanParamSLSPSwitchCase(mBooleanParamSLSPSwitchCase);
				if (result == null) result = caseMParameterSLSPSwitchCase(mBooleanParamSLSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MSTRING_PARAM_SLSP_SWITCH: {
				MStringParamSLSPSwitch mStringParamSLSPSwitch = (MStringParamSLSPSwitch)theEObject;
				T result = caseMStringParamSLSPSwitch(mStringParamSLSPSwitch);
				if (result == null) result = caseMStringParameter(mStringParamSLSPSwitch);
				if (result == null) result = caseMParameterSLSPSwitch(mStringParamSLSPSwitch);
				if (result == null) result = caseMParameter(mStringParamSLSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mStringParamSLSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MSTRING_PARAM_SLSP_SWITCH_CASE: {
				MStringParamSLSPSwitchCase mStringParamSLSPSwitchCase = (MStringParamSLSPSwitchCase)theEObject;
				T result = caseMStringParamSLSPSwitchCase(mStringParamSLSPSwitchCase);
				if (result == null) result = caseMParameterSLSPSwitchCase(mStringParamSLSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH: {
				MIntegerParamSLSPSwitch mIntegerParamSLSPSwitch = (MIntegerParamSLSPSwitch)theEObject;
				T result = caseMIntegerParamSLSPSwitch(mIntegerParamSLSPSwitch);
				if (result == null) result = caseMIntegerParameter(mIntegerParamSLSPSwitch);
				if (result == null) result = caseMParameterSLSPSwitch(mIntegerParamSLSPSwitch);
				if (result == null) result = caseMParameter(mIntegerParamSLSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mIntegerParamSLSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH_CASE: {
				MIntegerParamSLSPSwitchCase mIntegerParamSLSPSwitchCase = (MIntegerParamSLSPSwitchCase)theEObject;
				T result = caseMIntegerParamSLSPSwitchCase(mIntegerParamSLSPSwitchCase);
				if (result == null) result = caseMParameterSLSPSwitchCase(mIntegerParamSLSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MENUM_PARAM_SLSP_SWITCH: {
				MEnumParamSLSPSwitch mEnumParamSLSPSwitch = (MEnumParamSLSPSwitch)theEObject;
				T result = caseMEnumParamSLSPSwitch(mEnumParamSLSPSwitch);
				if (result == null) result = caseMEnumParameter(mEnumParamSLSPSwitch);
				if (result == null) result = caseMParameterSLSPSwitch(mEnumParamSLSPSwitch);
				if (result == null) result = caseMParameter(mEnumParamSLSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamSLSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MENUM_PARAM_SLSP_SWITCH_CASE: {
				MEnumParamSLSPSwitchCase mEnumParamSLSPSwitchCase = (MEnumParamSLSPSwitchCase)theEObject;
				T result = caseMEnumParamSLSPSwitchCase(mEnumParamSLSPSwitchCase);
				if (result == null) result = caseMParameterSLSPSwitchCase(mEnumParamSLSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MREAL_PARAM_SLSP_SWITCH: {
				MRealParamSLSPSwitch mRealParamSLSPSwitch = (MRealParamSLSPSwitch)theEObject;
				T result = caseMRealParamSLSPSwitch(mRealParamSLSPSwitch);
				if (result == null) result = caseMRealParameter(mRealParamSLSPSwitch);
				if (result == null) result = caseMParameterSLSPSwitch(mRealParamSLSPSwitch);
				if (result == null) result = caseMParameter(mRealParamSLSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mRealParamSLSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevslibPackage.MREAL_PARAM_SLSP_SWITCH_CASE: {
				MRealParamSLSPSwitchCase mRealParamSLSPSwitchCase = (MRealParamSLSPSwitchCase)theEObject;
				T result = caseMRealParamSLSPSwitchCase(mRealParamSLSPSwitchCase);
				if (result == null) result = caseMParameterSLSPSwitchCase(mRealParamSLSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMServiceLibrary(MServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MServiceLibraryProvidedSAI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MServiceLibraryProvidedSAI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMServiceLibraryProvidedSAI(MServiceLibraryProvidedSAI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVA</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSLibProvidedSAIAVA(MSLibProvidedSAIAVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVASwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVASwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSLibProvidedSAIAVASwitch(MSLibProvidedSAIAVASwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVASwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVASwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSLibProvidedSAIAVASwitchCase(MSLibProvidedSAIAVASwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVAExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSLibProvidedSAIAVAExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSLibProvidedSAIAVAExpression(MSLibProvidedSAIAVAExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MServiceLibrarySupportedPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MServiceLibrarySupportedPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMServiceLibrarySupportedPlatform(MServiceLibrarySupportedPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDriverSLibSupportedPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDriverSLibSupportedPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDriverSLibSupportedPlatform(MDriverSLibSupportedPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDriverSLibSupportedDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDriverSLibSupportedDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDriverSLibSupportedDevice(MDriverSLibSupportedDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstractServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstractServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractServiceLibrary(MAbstractServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVSLIBPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVSLIBPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVSLIBPackageFile(MMCLEVSLIBPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVSLIBPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVSLIBPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVSLIBPackageElement(MMCLEVSLIBPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDriverServiceLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDriverServiceLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDriverServiceLibrary(MDriverServiceLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterSLSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterSLSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterSLSPSwitch(MParameterSLSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterSLSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterSLSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterSLSPSwitchCase(MParameterSLSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParamSLSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParamSLSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamSLSPSwitch(MBooleanParamSLSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParamSLSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParamSLSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamSLSPSwitchCase(MBooleanParamSLSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParamSLSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParamSLSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamSLSPSwitch(MStringParamSLSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParamSLSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParamSLSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamSLSPSwitchCase(MStringParamSLSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParamSLSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParamSLSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamSLSPSwitch(MIntegerParamSLSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParamSLSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParamSLSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamSLSPSwitchCase(MIntegerParamSLSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamSLSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamSLSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamSLSPSwitch(MEnumParamSLSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamSLSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamSLSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamSLSPSwitchCase(MEnumParamSLSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParamSLSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParamSLSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamSLSPSwitch(MRealParamSLSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParamSLSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParamSLSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamSLSPSwitchCase(MRealParamSLSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageElement(MCommonPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueAssignment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueAssignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueAssignment(MParameterValueAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageFile(MCommonPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameter(MParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParameter(MBooleanParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParameter(MStringParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParameter(MIntegerParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParameter(MEnumParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParameter(MRealParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

}