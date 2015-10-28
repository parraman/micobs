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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage
 * @generated
 */
public class mclevcmpSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevcmpPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevcmpSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevcmpPackage.eINSTANCE;
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
			case mclevcmpPackage.MCOMPONENT: {
				MComponent mComponent = (MComponent)theEObject;
				T result = caseMComponent(mComponent);
				if (result == null) result = caseMAbstractComponent(mComponent);
				if (result == null) result = caseMMCLEVCMPPackageElement(mComponent);
				if (result == null) result = caseMCommonPackageElement(mComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MABSTRACT_COMPONENT: {
				MAbstractComponent mAbstractComponent = (MAbstractComponent)theEObject;
				T result = caseMAbstractComponent(mAbstractComponent);
				if (result == null) result = caseMMCLEVCMPPackageElement(mAbstractComponent);
				if (result == null) result = caseMCommonPackageElement(mAbstractComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MCOMPONENT_SUPPORTED_PLATFORM: {
				MComponentSupportedPlatform mComponentSupportedPlatform = (MComponentSupportedPlatform)theEObject;
				T result = caseMComponentSupportedPlatform(mComponentSupportedPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mComponentSupportedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE: {
				MInternalComponentInstance mInternalComponentInstance = (MInternalComponentInstance)theEObject;
				T result = caseMInternalComponentInstance(mInternalComponentInstance);
				if (result == null) result = caseMCommonReferenceableObj(mInternalComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MPORT: {
				MPort mPort = (MPort)theEObject;
				T result = caseMPort(mPort);
				if (result == null) result = caseMCommonReferenceableObj(mPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MSERVER_PORT: {
				MServerPort mServerPort = (MServerPort)theEObject;
				T result = caseMServerPort(mServerPort);
				if (result == null) result = caseMPort(mServerPort);
				if (result == null) result = caseMCommonReferenceableObj(mServerPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MCLIENT_PORT: {
				MClientPort mClientPort = (MClientPort)theEObject;
				T result = caseMClientPort(mClientPort);
				if (result == null) result = caseMPort(mClientPort);
				if (result == null) result = caseMCommonReferenceableObj(mClientPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MINTERNAL_CONNECTION: {
				MInternalConnection mInternalConnection = (MInternalConnection)theEObject;
				T result = caseMInternalConnection(mInternalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MINTERNAL_COMPONENT_CONNECTION: {
				MInternalComponentConnection mInternalComponentConnection = (MInternalComponentConnection)theEObject;
				T result = caseMInternalComponentConnection(mInternalComponentConnection);
				if (result == null) result = caseMInternalConnection(mInternalComponentConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH: {
				MInternalComponentPlatformSwitch mInternalComponentPlatformSwitch = (MInternalComponentPlatformSwitch)theEObject;
				T result = caseMInternalComponentPlatformSwitch(mInternalComponentPlatformSwitch);
				if (result == null) result = caseMInternalConnection(mInternalComponentPlatformSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE: {
				MInternalComponentPlatformSwitchCase mInternalComponentPlatformSwitchCase = (MInternalComponentPlatformSwitchCase)theEObject;
				T result = caseMInternalComponentPlatformSwitchCase(mInternalComponentPlatformSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MMCLEVCMP_PACKAGE_FILE: {
				MMCLEVCMPPackageFile mmclevcmpPackageFile = (MMCLEVCMPPackageFile)theEObject;
				T result = caseMMCLEVCMPPackageFile(mmclevcmpPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevcmpPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MMCLEVCMP_PACKAGE_ELEMENT: {
				MMCLEVCMPPackageElement mmclevcmpPackageElement = (MMCLEVCMPPackageElement)theEObject;
				T result = caseMMCLEVCMPPackageElement(mmclevcmpPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevcmpPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MPARAMETER_CSP_SWITCH: {
				MParameterCSPSwitch mParameterCSPSwitch = (MParameterCSPSwitch)theEObject;
				T result = caseMParameterCSPSwitch(mParameterCSPSwitch);
				if (result == null) result = caseMParameter(mParameterCSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mParameterCSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MPARAMETER_CSP_SWITCH_CASE: {
				MParameterCSPSwitchCase mParameterCSPSwitchCase = (MParameterCSPSwitchCase)theEObject;
				T result = caseMParameterCSPSwitchCase(mParameterCSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MBOOLEAN_PARAM_CSP_SWITCH: {
				MBooleanParamCSPSwitch mBooleanParamCSPSwitch = (MBooleanParamCSPSwitch)theEObject;
				T result = caseMBooleanParamCSPSwitch(mBooleanParamCSPSwitch);
				if (result == null) result = caseMBooleanParameter(mBooleanParamCSPSwitch);
				if (result == null) result = caseMParameterCSPSwitch(mBooleanParamCSPSwitch);
				if (result == null) result = caseMParameter(mBooleanParamCSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mBooleanParamCSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MBOOLEAN_PARAM_CSP_SWITCH_CASE: {
				MBooleanParamCSPSwitchCase mBooleanParamCSPSwitchCase = (MBooleanParamCSPSwitchCase)theEObject;
				T result = caseMBooleanParamCSPSwitchCase(mBooleanParamCSPSwitchCase);
				if (result == null) result = caseMParameterCSPSwitchCase(mBooleanParamCSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MSTRING_PARAM_CSP_SWITCH: {
				MStringParamCSPSwitch mStringParamCSPSwitch = (MStringParamCSPSwitch)theEObject;
				T result = caseMStringParamCSPSwitch(mStringParamCSPSwitch);
				if (result == null) result = caseMStringParameter(mStringParamCSPSwitch);
				if (result == null) result = caseMParameterCSPSwitch(mStringParamCSPSwitch);
				if (result == null) result = caseMParameter(mStringParamCSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mStringParamCSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MSTRING_PARAM_CSP_SWITCH_CASE: {
				MStringParamCSPSwitchCase mStringParamCSPSwitchCase = (MStringParamCSPSwitchCase)theEObject;
				T result = caseMStringParamCSPSwitchCase(mStringParamCSPSwitchCase);
				if (result == null) result = caseMParameterCSPSwitchCase(mStringParamCSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH: {
				MIntegerParamCSPSwitch mIntegerParamCSPSwitch = (MIntegerParamCSPSwitch)theEObject;
				T result = caseMIntegerParamCSPSwitch(mIntegerParamCSPSwitch);
				if (result == null) result = caseMIntegerParameter(mIntegerParamCSPSwitch);
				if (result == null) result = caseMParameterCSPSwitch(mIntegerParamCSPSwitch);
				if (result == null) result = caseMParameter(mIntegerParamCSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mIntegerParamCSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE: {
				MIntegerParamCSPSwitchCase mIntegerParamCSPSwitchCase = (MIntegerParamCSPSwitchCase)theEObject;
				T result = caseMIntegerParamCSPSwitchCase(mIntegerParamCSPSwitchCase);
				if (result == null) result = caseMParameterCSPSwitchCase(mIntegerParamCSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MENUM_PARAM_CSP_SWITCH: {
				MEnumParamCSPSwitch mEnumParamCSPSwitch = (MEnumParamCSPSwitch)theEObject;
				T result = caseMEnumParamCSPSwitch(mEnumParamCSPSwitch);
				if (result == null) result = caseMEnumParameter(mEnumParamCSPSwitch);
				if (result == null) result = caseMParameterCSPSwitch(mEnumParamCSPSwitch);
				if (result == null) result = caseMParameter(mEnumParamCSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamCSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MENUM_PARAM_CSP_SWITCH_CASE: {
				MEnumParamCSPSwitchCase mEnumParamCSPSwitchCase = (MEnumParamCSPSwitchCase)theEObject;
				T result = caseMEnumParamCSPSwitchCase(mEnumParamCSPSwitchCase);
				if (result == null) result = caseMParameterCSPSwitchCase(mEnumParamCSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MREAL_PARAM_CSP_SWITCH: {
				MRealParamCSPSwitch mRealParamCSPSwitch = (MRealParamCSPSwitch)theEObject;
				T result = caseMRealParamCSPSwitch(mRealParamCSPSwitch);
				if (result == null) result = caseMRealParameter(mRealParamCSPSwitch);
				if (result == null) result = caseMParameterCSPSwitch(mRealParamCSPSwitch);
				if (result == null) result = caseMParameter(mRealParamCSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mRealParamCSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevcmpPackage.MREAL_PARAM_CSP_SWITCH_CASE: {
				MRealParamCSPSwitchCase mRealParamCSPSwitchCase = (MRealParamCSPSwitchCase)theEObject;
				T result = caseMRealParamCSPSwitchCase(mRealParamCSPSwitchCase);
				if (result == null) result = caseMParameterCSPSwitchCase(mRealParamCSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MComponent</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMComponent(MComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstractComponent</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstractComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractComponent(MAbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MComponentSupportedPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MComponentSupportedPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMComponentSupportedPlatform(MComponentSupportedPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternalComponentInstance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternalComponentInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalComponentInstance(MInternalComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPort</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPort(MPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MServerPort</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MServerPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMServerPort(MServerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MClientPort</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MClientPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMClientPort(MClientPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternalConnection</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternalConnection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalConnection(MInternalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternalComponentConnection</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternalComponentConnection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalComponentConnection(MInternalComponentConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternalComponentPlatformSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternalComponentPlatformSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalComponentPlatformSwitch(MInternalComponentPlatformSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternalComponentPlatformSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternalComponentPlatformSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalComponentPlatformSwitchCase(MInternalComponentPlatformSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVCMPPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVCMPPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVCMPPackageFile(MMCLEVCMPPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVCMPPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVCMPPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVCMPPackageElement(MMCLEVCMPPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterCSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterCSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterCSPSwitch(MParameterCSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterCSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterCSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterCSPSwitchCase(MParameterCSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParamCSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParamCSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamCSPSwitch(MBooleanParamCSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParamCSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParamCSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamCSPSwitchCase(MBooleanParamCSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParamCSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParamCSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamCSPSwitch(MStringParamCSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParamCSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParamCSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamCSPSwitchCase(MStringParamCSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParamCSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParamCSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamCSPSwitch(MIntegerParamCSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParamCSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParamCSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamCSPSwitchCase(MIntegerParamCSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamCSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamCSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamCSPSwitch(MEnumParamCSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamCSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamCSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamCSPSwitchCase(MEnumParamCSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParamCSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParamCSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamCSPSwitch(MRealParamCSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParamCSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParamCSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamCSPSwitchCase(MRealParamCSPSwitchCase object) {
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