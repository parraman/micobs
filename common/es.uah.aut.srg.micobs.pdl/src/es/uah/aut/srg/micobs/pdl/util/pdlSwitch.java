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
package es.uah.aut.srg.micobs.pdl.util;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage
 * @generated
 */
public class pdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static pdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public pdlSwitch() {
		if (modelPackage == null) {
			modelPackage = pdlPackage.eINSTANCE;
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
			case pdlPackage.MBOARD: {
				MBoard mBoard = (MBoard)theEObject;
				T result = caseMBoard(mBoard);
				if (result == null) result = caseMPDLPackageElement(mBoard);
				if (result == null) result = caseMCommonPackageElement(mBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MBOARD_SUPPORTED_DEVICE: {
				MBoardSupportedDevice mBoardSupportedDevice = (MBoardSupportedDevice)theEObject;
				T result = caseMBoardSupportedDevice(mBoardSupportedDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MMICROPROCESSOR: {
				MMicroprocessor mMicroprocessor = (MMicroprocessor)theEObject;
				T result = caseMMicroprocessor(mMicroprocessor);
				if (result == null) result = caseMPDLPackageElement(mMicroprocessor);
				if (result == null) result = caseMCommonPackageElement(mMicroprocessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOPERATING_SYSTEM: {
				MOperatingSystem mOperatingSystem = (MOperatingSystem)theEObject;
				T result = caseMOperatingSystem(mOperatingSystem);
				if (result == null) result = caseMPDLPackageElement(mOperatingSystem);
				if (result == null) result = caseMCommonPackageElement(mOperatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOS_SUPPORTED_PLATFORM: {
				MOSSupportedPlatform mosSupportedPlatform = (MOSSupportedPlatform)theEObject;
				T result = caseMOSSupportedPlatform(mosSupportedPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mosSupportedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOS_SUPPORTED_OSAPI: {
				MOSSupportedOSAPI mosSupportedOSAPI = (MOSSupportedOSAPI)theEObject;
				T result = caseMOSSupportedOSAPI(mosSupportedOSAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOS_SUPPORTED_OSAPIPVA: {
				MOSSupportedOSAPIPVA mosSupportedOSAPIPVA = (MOSSupportedOSAPIPVA)theEObject;
				T result = caseMOSSupportedOSAPIPVA(mosSupportedOSAPIPVA);
				if (result == null) result = caseMParameterValueAssignment(mosSupportedOSAPIPVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOS_SUPPORTED_OSAPIPVA_EXPRESSION: {
				MOSSupportedOSAPIPVAExpression mosSupportedOSAPIPVAExpression = (MOSSupportedOSAPIPVAExpression)theEObject;
				T result = caseMOSSupportedOSAPIPVAExpression(mosSupportedOSAPIPVAExpression);
				if (result == null) result = caseMOSSupportedOSAPIPVA(mosSupportedOSAPIPVAExpression);
				if (result == null) result = caseMParameterValueAssignment(mosSupportedOSAPIPVAExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOS_SUPPORTED_OSAPIPVA_SWITCH: {
				MOSSupportedOSAPIPVASwitch mosSupportedOSAPIPVASwitch = (MOSSupportedOSAPIPVASwitch)theEObject;
				T result = caseMOSSupportedOSAPIPVASwitch(mosSupportedOSAPIPVASwitch);
				if (result == null) result = caseMOSSupportedOSAPIPVA(mosSupportedOSAPIPVASwitch);
				if (result == null) result = caseMParameterValueAssignment(mosSupportedOSAPIPVASwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE: {
				MOSSupportedOSAPIPVASwitchCase mosSupportedOSAPIPVASwitchCase = (MOSSupportedOSAPIPVASwitchCase)theEObject;
				T result = caseMOSSupportedOSAPIPVASwitchCase(mosSupportedOSAPIPVASwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MOPERATING_SYSTEM_API: {
				MOperatingSystemAPI mOperatingSystemAPI = (MOperatingSystemAPI)theEObject;
				T result = caseMOperatingSystemAPI(mOperatingSystemAPI);
				if (result == null) result = caseMPDLPackageElement(mOperatingSystemAPI);
				if (result == null) result = caseMCommonPackageElement(mOperatingSystemAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MARCHITECTURE: {
				MArchitecture mArchitecture = (MArchitecture)theEObject;
				T result = caseMArchitecture(mArchitecture);
				if (result == null) result = caseMPDLPackageElement(mArchitecture);
				if (result == null) result = caseMCommonPackageElement(mArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MPDL_PACKAGE_FILE: {
				MPDLPackageFile mpdlPackageFile = (MPDLPackageFile)theEObject;
				T result = caseMPDLPackageFile(mpdlPackageFile);
				if (result == null) result = caseMCommonPackageFile(mpdlPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MPDL_PACKAGE_ELEMENT: {
				MPDLPackageElement mpdlPackageElement = (MPDLPackageElement)theEObject;
				T result = caseMPDLPackageElement(mpdlPackageElement);
				if (result == null) result = caseMCommonPackageElement(mpdlPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MPLATFORM: {
				MPlatform mPlatform = (MPlatform)theEObject;
				T result = caseMPlatform(mPlatform);
				if (result == null) result = caseMPDLPackageElement(mPlatform);
				if (result == null) result = caseMCommonPackageElement(mPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MCOMPILER: {
				MCompiler mCompiler = (MCompiler)theEObject;
				T result = caseMCompiler(mCompiler);
				if (result == null) result = caseMPDLPackageElement(mCompiler);
				if (result == null) result = caseMCommonPackageElement(mCompiler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MCOMPILER_FRONTEND: {
				MCompilerFrontend mCompilerFrontend = (MCompilerFrontend)theEObject;
				T result = caseMCompilerFrontend(mCompilerFrontend);
				if (result == null) result = caseMCommonReferenceableObj(mCompilerFrontend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MDEVICE: {
				MDevice mDevice = (MDevice)theEObject;
				T result = caseMDevice(mDevice);
				if (result == null) result = caseMPDLPackageElement(mDevice);
				if (result == null) result = caseMCommonPackageElement(mDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MPARAMETER_OSSP_SWITCH: {
				MParameterOSSPSwitch mParameterOSSPSwitch = (MParameterOSSPSwitch)theEObject;
				T result = caseMParameterOSSPSwitch(mParameterOSSPSwitch);
				if (result == null) result = caseMParameter(mParameterOSSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mParameterOSSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MPARAMETER_OSSP_SWITCH_CASE: {
				MParameterOSSPSwitchCase mParameterOSSPSwitchCase = (MParameterOSSPSwitchCase)theEObject;
				T result = caseMParameterOSSPSwitchCase(mParameterOSSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MBOOLEAN_PARAM_OSSP_SWITCH: {
				MBooleanParamOSSPSwitch mBooleanParamOSSPSwitch = (MBooleanParamOSSPSwitch)theEObject;
				T result = caseMBooleanParamOSSPSwitch(mBooleanParamOSSPSwitch);
				if (result == null) result = caseMBooleanParameter(mBooleanParamOSSPSwitch);
				if (result == null) result = caseMParameterOSSPSwitch(mBooleanParamOSSPSwitch);
				if (result == null) result = caseMParameter(mBooleanParamOSSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mBooleanParamOSSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MBOOLEAN_PARAM_OSSP_SWITCH_CASE: {
				MBooleanParamOSSPSwitchCase mBooleanParamOSSPSwitchCase = (MBooleanParamOSSPSwitchCase)theEObject;
				T result = caseMBooleanParamOSSPSwitchCase(mBooleanParamOSSPSwitchCase);
				if (result == null) result = caseMParameterOSSPSwitchCase(mBooleanParamOSSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MSTRING_PARAM_OSSP_SWITCH: {
				MStringParamOSSPSwitch mStringParamOSSPSwitch = (MStringParamOSSPSwitch)theEObject;
				T result = caseMStringParamOSSPSwitch(mStringParamOSSPSwitch);
				if (result == null) result = caseMStringParameter(mStringParamOSSPSwitch);
				if (result == null) result = caseMParameterOSSPSwitch(mStringParamOSSPSwitch);
				if (result == null) result = caseMParameter(mStringParamOSSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mStringParamOSSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MSTRING_PARAM_OSSP_SWITCH_CASE: {
				MStringParamOSSPSwitchCase mStringParamOSSPSwitchCase = (MStringParamOSSPSwitchCase)theEObject;
				T result = caseMStringParamOSSPSwitchCase(mStringParamOSSPSwitchCase);
				if (result == null) result = caseMParameterOSSPSwitchCase(mStringParamOSSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH: {
				MIntegerParamOSSPSwitch mIntegerParamOSSPSwitch = (MIntegerParamOSSPSwitch)theEObject;
				T result = caseMIntegerParamOSSPSwitch(mIntegerParamOSSPSwitch);
				if (result == null) result = caseMIntegerParameter(mIntegerParamOSSPSwitch);
				if (result == null) result = caseMParameterOSSPSwitch(mIntegerParamOSSPSwitch);
				if (result == null) result = caseMParameter(mIntegerParamOSSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mIntegerParamOSSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE: {
				MIntegerParamOSSPSwitchCase mIntegerParamOSSPSwitchCase = (MIntegerParamOSSPSwitchCase)theEObject;
				T result = caseMIntegerParamOSSPSwitchCase(mIntegerParamOSSPSwitchCase);
				if (result == null) result = caseMParameterOSSPSwitchCase(mIntegerParamOSSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MENUM_PARAM_OSSP_SWITCH: {
				MEnumParamOSSPSwitch mEnumParamOSSPSwitch = (MEnumParamOSSPSwitch)theEObject;
				T result = caseMEnumParamOSSPSwitch(mEnumParamOSSPSwitch);
				if (result == null) result = caseMEnumParameter(mEnumParamOSSPSwitch);
				if (result == null) result = caseMParameterOSSPSwitch(mEnumParamOSSPSwitch);
				if (result == null) result = caseMParameter(mEnumParamOSSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamOSSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MENUM_PARAM_OSSP_SWITCH_CASE: {
				MEnumParamOSSPSwitchCase mEnumParamOSSPSwitchCase = (MEnumParamOSSPSwitchCase)theEObject;
				T result = caseMEnumParamOSSPSwitchCase(mEnumParamOSSPSwitchCase);
				if (result == null) result = caseMParameterOSSPSwitchCase(mEnumParamOSSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MREAL_PARAM_OSSP_SWITCH: {
				MRealParamOSSPSwitch mRealParamOSSPSwitch = (MRealParamOSSPSwitch)theEObject;
				T result = caseMRealParamOSSPSwitch(mRealParamOSSPSwitch);
				if (result == null) result = caseMRealParameter(mRealParamOSSPSwitch);
				if (result == null) result = caseMParameterOSSPSwitch(mRealParamOSSPSwitch);
				if (result == null) result = caseMParameter(mRealParamOSSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mRealParamOSSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case pdlPackage.MREAL_PARAM_OSSP_SWITCH_CASE: {
				MRealParamOSSPSwitchCase mRealParamOSSPSwitchCase = (MRealParamOSSPSwitchCase)theEObject;
				T result = caseMRealParamOSSPSwitchCase(mRealParamOSSPSwitchCase);
				if (result == null) result = caseMParameterOSSPSwitchCase(mRealParamOSSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBoard</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBoard(MBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBoardSupportedDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoardSupportedDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBoardSupportedDevice(MBoardSupportedDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMicroprocessor</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMicroprocessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMicroprocessor(MMicroprocessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOperatingSystem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOperatingSystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOperatingSystem(MOperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOSSupportedPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOSSupportedPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOSSupportedPlatform(MOSSupportedPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOSSupportedOSAPI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOSSupportedOSAPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOSSupportedOSAPI(MOSSupportedOSAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOSSupportedOSAPIPVA(MOSSupportedOSAPIPVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA Expression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOSSupportedOSAPIPVAExpression(MOSSupportedOSAPIPVAExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOSSupportedOSAPIPVASwitch(MOSSupportedOSAPIPVASwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOS Supported OSAPIPVA Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOSSupportedOSAPIPVASwitchCase(MOSSupportedOSAPIPVASwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MOperatingSystemAPI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MOperatingSystemAPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMOperatingSystemAPI(MOperatingSystemAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MArchitecture</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MArchitecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMArchitecture(MArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLPackageFile(MPDLPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPDLPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPDLPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDLPackageElement(MPDLPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPlatform(MPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCompiler</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCompiler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCompiler(MCompiler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCompilerFrontend</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCompilerFrontend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCompilerFrontend(MCompilerFrontend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDevice(MDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter OSSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter OSSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterOSSPSwitch(MParameterOSSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter OSSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter OSSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterOSSPSwitchCase(MParameterOSSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBoolean Param OSSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoolean Param OSSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamOSSPSwitch(MBooleanParamOSSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBoolean Param OSSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoolean Param OSSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamOSSPSwitchCase(MBooleanParamOSSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MString Param OSSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MString Param OSSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamOSSPSwitch(MStringParamOSSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MString Param OSSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MString Param OSSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamOSSPSwitchCase(MStringParamOSSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInteger Param OSSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInteger Param OSSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamOSSPSwitch(MIntegerParamOSSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInteger Param OSSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInteger Param OSSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamOSSPSwitchCase(MIntegerParamOSSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnum Param OSSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnum Param OSSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamOSSPSwitch(MEnumParamOSSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnum Param OSSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnum Param OSSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamOSSPSwitchCase(MEnumParamOSSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MReal Param OSSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MReal Param OSSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamOSSPSwitch(MRealParamOSSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MReal Param OSSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MReal Param OSSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamOSSPSwitchCase(MRealParamOSSPSwitchCase object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>MParameter Value Assignment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter Value Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueAssignment(MParameterValueAssignment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>MBoolean Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoolean Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParameter(MBooleanParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MString Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MString Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParameter(MStringParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInteger Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInteger Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParameter(MIntegerParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnum Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnum Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParameter(MEnumParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MReal Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MReal Parameter</em>'.
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
