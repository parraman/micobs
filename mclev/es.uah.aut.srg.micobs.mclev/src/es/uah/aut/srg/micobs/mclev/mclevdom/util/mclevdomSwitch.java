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
package es.uah.aut.srg.micobs.mclev.mclevdom.util;

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
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage
 * @generated
 */
public class mclevdomSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevdomPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevdomSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevdomPackage.eINSTANCE;
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
			case mclevdomPackage.MDOMAIN: {
				MDomain mDomain = (MDomain)theEObject;
				T result = caseMDomain(mDomain);
				if (result == null) result = caseMMCLEVDOMPackageElement(mDomain);
				if (result == null) result = caseMCommonPackageElement(mDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MAO_DOMAIN: {
				MAODomain maoDomain = (MAODomain)theEObject;
				T result = caseMAODomain(maoDomain);
				if (result == null) result = caseMDomain(maoDomain);
				if (result == null) result = caseMMCLEVDOMPackageElement(maoDomain);
				if (result == null) result = caseMCommonPackageElement(maoDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MIO_DOMAIN: {
				MIODomain mioDomain = (MIODomain)theEObject;
				T result = caseMIODomain(mioDomain);
				if (result == null) result = caseMDomain(mioDomain);
				if (result == null) result = caseMMCLEVDOMPackageElement(mioDomain);
				if (result == null) result = caseMCommonPackageElement(mioDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MCOMPONENT_TYPE: {
				MComponentType mComponentType = (MComponentType)theEObject;
				T result = caseMComponentType(mComponentType);
				if (result == null) result = caseMCommonReferenceableObj(mComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MIOD_ABSTRACT_COMPONENT_TYPE: {
				MIODAbstractComponentType miodAbstractComponentType = (MIODAbstractComponentType)theEObject;
				T result = caseMIODAbstractComponentType(miodAbstractComponentType);
				if (result == null) result = caseMComponentType(miodAbstractComponentType);
				if (result == null) result = caseMCommonReferenceableObj(miodAbstractComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MIOD_COMPONENT_TYPE: {
				MIODComponentType miodComponentType = (MIODComponentType)theEObject;
				T result = caseMIODComponentType(miodComponentType);
				if (result == null) result = caseMIODAbstractComponentType(miodComponentType);
				if (result == null) result = caseMComponentType(miodComponentType);
				if (result == null) result = caseMCommonReferenceableObj(miodComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MAOD_COMPONENT_TYPE: {
				MAODComponentType maodComponentType = (MAODComponentType)theEObject;
				T result = caseMAODComponentType(maodComponentType);
				if (result == null) result = caseMComponentType(maodComponentType);
				if (result == null) result = caseMCommonReferenceableObj(maodComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MCOMPONENT_TYPE_INSTANCE: {
				MComponentTypeInstance mComponentTypeInstance = (MComponentTypeInstance)theEObject;
				T result = caseMComponentTypeInstance(mComponentTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MIOD_COMPONENT_TYPE_INSTANCE: {
				MIODComponentTypeInstance miodComponentTypeInstance = (MIODComponentTypeInstance)theEObject;
				T result = caseMIODComponentTypeInstance(miodComponentTypeInstance);
				if (result == null) result = caseMComponentTypeInstance(miodComponentTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE: {
				MAODComponentTypeInstance maodComponentTypeInstance = (MAODComponentTypeInstance)theEObject;
				T result = caseMAODComponentTypeInstance(maodComponentTypeInstance);
				if (result == null) result = caseMComponentTypeInstance(maodComponentTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MPORT_TYPE_INSTANCE: {
				MPortTypeInstance mPortTypeInstance = (MPortTypeInstance)theEObject;
				T result = caseMPortTypeInstance(mPortTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MINTERNAL_PORT_TYPE_INSTANCE: {
				MInternalPortTypeInstance mInternalPortTypeInstance = (MInternalPortTypeInstance)theEObject;
				T result = caseMInternalPortTypeInstance(mInternalPortTypeInstance);
				if (result == null) result = caseMPortTypeInstance(mInternalPortTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MINTERNAL_CLIENT_PORT_TYPE_INSTANCE: {
				MInternalClientPortTypeInstance mInternalClientPortTypeInstance = (MInternalClientPortTypeInstance)theEObject;
				T result = caseMInternalClientPortTypeInstance(mInternalClientPortTypeInstance);
				if (result == null) result = caseMInternalPortTypeInstance(mInternalClientPortTypeInstance);
				if (result == null) result = caseMPortTypeInstance(mInternalClientPortTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MINTERNAL_SERVER_PORT_TYPE_INSTANCE: {
				MInternalServerPortTypeInstance mInternalServerPortTypeInstance = (MInternalServerPortTypeInstance)theEObject;
				T result = caseMInternalServerPortTypeInstance(mInternalServerPortTypeInstance);
				if (result == null) result = caseMInternalPortTypeInstance(mInternalServerPortTypeInstance);
				if (result == null) result = caseMPortTypeInstance(mInternalServerPortTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MEXTERNAL_PORT_TYPE_INSTANCE: {
				MExternalPortTypeInstance mExternalPortTypeInstance = (MExternalPortTypeInstance)theEObject;
				T result = caseMExternalPortTypeInstance(mExternalPortTypeInstance);
				if (result == null) result = caseMPortTypeInstance(mExternalPortTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE: {
				MExternalClientPortTypeInstance mExternalClientPortTypeInstance = (MExternalClientPortTypeInstance)theEObject;
				T result = caseMExternalClientPortTypeInstance(mExternalClientPortTypeInstance);
				if (result == null) result = caseMExternalPortTypeInstance(mExternalClientPortTypeInstance);
				if (result == null) result = caseMPortTypeInstance(mExternalClientPortTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MEXTERNAL_SERVER_PORT_TYPE_INSTANCE: {
				MExternalServerPortTypeInstance mExternalServerPortTypeInstance = (MExternalServerPortTypeInstance)theEObject;
				T result = caseMExternalServerPortTypeInstance(mExternalServerPortTypeInstance);
				if (result == null) result = caseMExternalPortTypeInstance(mExternalServerPortTypeInstance);
				if (result == null) result = caseMPortTypeInstance(mExternalServerPortTypeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MCONNECTOR: {
				MConnector mConnector = (MConnector)theEObject;
				T result = caseMConnector(mConnector);
				if (result == null) result = caseMCommonReferenceableObj(mConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MPORT_TYPE: {
				MPortType mPortType = (MPortType)theEObject;
				T result = caseMPortType(mPortType);
				if (result == null) result = caseMCommonReferenceableObj(mPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MINTERFACE_TYPE: {
				MInterfaceType mInterfaceType = (MInterfaceType)theEObject;
				T result = caseMInterfaceType(mInterfaceType);
				if (result == null) result = caseMCommonReferenceableObj(mInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MEXCHANGE_MODEL: {
				MExchangeModel mExchangeModel = (MExchangeModel)theEObject;
				T result = caseMExchangeModel(mExchangeModel);
				if (result == null) result = caseMCommonReferenceableObj(mExchangeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MMCLEVDOM_PACKAGE_FILE: {
				MMCLEVDOMPackageFile mmclevdomPackageFile = (MMCLEVDOMPackageFile)theEObject;
				T result = caseMMCLEVDOMPackageFile(mmclevdomPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevdomPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MMCLEVDOM_PACKAGE_ELEMENT: {
				MMCLEVDOMPackageElement mmclevdomPackageElement = (MMCLEVDOMPackageElement)theEObject;
				T result = caseMMCLEVDOMPackageElement(mmclevdomPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevdomPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MIO_DOMAIN_SUPPORTED_PLATFORM: {
				MIODomainSupportedPlatform mioDomainSupportedPlatform = (MIODomainSupportedPlatform)theEObject;
				T result = caseMIODomainSupportedPlatform(mioDomainSupportedPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mioDomainSupportedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MPARAMETER_IODSP_SWITCH: {
				MParameterIODSPSwitch mParameterIODSPSwitch = (MParameterIODSPSwitch)theEObject;
				T result = caseMParameterIODSPSwitch(mParameterIODSPSwitch);
				if (result == null) result = caseMParameter(mParameterIODSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mParameterIODSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MPARAMETER_IODSP_SWITCH_CASE: {
				MParameterIODSPSwitchCase mParameterIODSPSwitchCase = (MParameterIODSPSwitchCase)theEObject;
				T result = caseMParameterIODSPSwitchCase(mParameterIODSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MBOOLEAN_PARAM_IODSP_SWITCH: {
				MBooleanParamIODSPSwitch mBooleanParamIODSPSwitch = (MBooleanParamIODSPSwitch)theEObject;
				T result = caseMBooleanParamIODSPSwitch(mBooleanParamIODSPSwitch);
				if (result == null) result = caseMBooleanParameter(mBooleanParamIODSPSwitch);
				if (result == null) result = caseMParameterIODSPSwitch(mBooleanParamIODSPSwitch);
				if (result == null) result = caseMParameter(mBooleanParamIODSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mBooleanParamIODSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MBOOLEAN_PARAM_IODSP_SWITCH_CASE: {
				MBooleanParamIODSPSwitchCase mBooleanParamIODSPSwitchCase = (MBooleanParamIODSPSwitchCase)theEObject;
				T result = caseMBooleanParamIODSPSwitchCase(mBooleanParamIODSPSwitchCase);
				if (result == null) result = caseMParameterIODSPSwitchCase(mBooleanParamIODSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MSTRING_PARAM_IODSP_SWITCH: {
				MStringParamIODSPSwitch mStringParamIODSPSwitch = (MStringParamIODSPSwitch)theEObject;
				T result = caseMStringParamIODSPSwitch(mStringParamIODSPSwitch);
				if (result == null) result = caseMStringParameter(mStringParamIODSPSwitch);
				if (result == null) result = caseMParameterIODSPSwitch(mStringParamIODSPSwitch);
				if (result == null) result = caseMParameter(mStringParamIODSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mStringParamIODSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MSTRING_PARAM_IODSP_SWITCH_CASE: {
				MStringParamIODSPSwitchCase mStringParamIODSPSwitchCase = (MStringParamIODSPSwitchCase)theEObject;
				T result = caseMStringParamIODSPSwitchCase(mStringParamIODSPSwitchCase);
				if (result == null) result = caseMParameterIODSPSwitchCase(mStringParamIODSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MINTEGER_PARAM_IODSP_SWITCH: {
				MIntegerParamIODSPSwitch mIntegerParamIODSPSwitch = (MIntegerParamIODSPSwitch)theEObject;
				T result = caseMIntegerParamIODSPSwitch(mIntegerParamIODSPSwitch);
				if (result == null) result = caseMIntegerParameter(mIntegerParamIODSPSwitch);
				if (result == null) result = caseMParameterIODSPSwitch(mIntegerParamIODSPSwitch);
				if (result == null) result = caseMParameter(mIntegerParamIODSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mIntegerParamIODSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MINTEGER_PARAM_IODSP_SWITCH_CASE: {
				MIntegerParamIODSPSwitchCase mIntegerParamIODSPSwitchCase = (MIntegerParamIODSPSwitchCase)theEObject;
				T result = caseMIntegerParamIODSPSwitchCase(mIntegerParamIODSPSwitchCase);
				if (result == null) result = caseMParameterIODSPSwitchCase(mIntegerParamIODSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MENUM_PARAM_IODSP_SWITCH: {
				MEnumParamIODSPSwitch mEnumParamIODSPSwitch = (MEnumParamIODSPSwitch)theEObject;
				T result = caseMEnumParamIODSPSwitch(mEnumParamIODSPSwitch);
				if (result == null) result = caseMEnumParameter(mEnumParamIODSPSwitch);
				if (result == null) result = caseMParameterIODSPSwitch(mEnumParamIODSPSwitch);
				if (result == null) result = caseMParameter(mEnumParamIODSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamIODSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MENUM_PARAM_IODSP_SWITCH_CASE: {
				MEnumParamIODSPSwitchCase mEnumParamIODSPSwitchCase = (MEnumParamIODSPSwitchCase)theEObject;
				T result = caseMEnumParamIODSPSwitchCase(mEnumParamIODSPSwitchCase);
				if (result == null) result = caseMParameterIODSPSwitchCase(mEnumParamIODSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MREAL_PARAM_IODSP_SWITCH: {
				MRealParamIODSPSwitch mRealParamIODSPSwitch = (MRealParamIODSPSwitch)theEObject;
				T result = caseMRealParamIODSPSwitch(mRealParamIODSPSwitch);
				if (result == null) result = caseMRealParameter(mRealParamIODSPSwitch);
				if (result == null) result = caseMParameterIODSPSwitch(mRealParamIODSPSwitch);
				if (result == null) result = caseMParameter(mRealParamIODSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mRealParamIODSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevdomPackage.MREAL_PARAM_IODSP_SWITCH_CASE: {
				MRealParamIODSPSwitchCase mRealParamIODSPSwitchCase = (MRealParamIODSPSwitchCase)theEObject;
				T result = caseMRealParamIODSPSwitchCase(mRealParamIODSPSwitchCase);
				if (result == null) result = caseMParameterIODSPSwitchCase(mRealParamIODSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDomain</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDomain(MDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAO Domain</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAO Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAODomain(MAODomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIO Domain</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIO Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIODomain(MIODomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MComponent Type</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MComponent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMComponentType(MComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIOD Abstract Component Type</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIOD Abstract Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIODAbstractComponentType(MIODAbstractComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIOD Component Type</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIOD Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIODComponentType(MIODComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAOD Component Type</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAOD Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAODComponentType(MAODComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MComponent Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MComponent Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMComponentTypeInstance(MComponentTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIOD Component Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIOD Component Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIODComponentTypeInstance(MIODComponentTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAOD Component Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAOD Component Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAODComponentTypeInstance(MAODComponentTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPort Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPort Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPortTypeInstance(MPortTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternal Port Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternal Port Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalPortTypeInstance(MInternalPortTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternal Client Port Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternal Client Port Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalClientPortTypeInstance(MInternalClientPortTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInternal Server Port Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInternal Server Port Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInternalServerPortTypeInstance(MInternalServerPortTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MExternal Port Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MExternal Port Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMExternalPortTypeInstance(MExternalPortTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MExternal Client Port Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MExternal Client Port Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMExternalClientPortTypeInstance(MExternalClientPortTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MExternal Server Port Type Instance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MExternal Server Port Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMExternalServerPortTypeInstance(MExternalServerPortTypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConnector</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConnector(MConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPort Type</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPort Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPortType(MPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInterface Type</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInterface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInterfaceType(MInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MExchange Model</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MExchange Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMExchangeModel(MExchangeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVDOM Package File</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVDOM Package File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVDOMPackageFile(MMCLEVDOMPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVDOM Package Element</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVDOM Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVDOMPackageElement(MMCLEVDOMPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIO Domain Supported Platform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIO Domain Supported Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIODomainSupportedPlatform(MIODomainSupportedPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter IODSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter IODSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterIODSPSwitch(MParameterIODSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter IODSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter IODSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterIODSPSwitchCase(MParameterIODSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBoolean Param IODSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoolean Param IODSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamIODSPSwitch(MBooleanParamIODSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBoolean Param IODSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoolean Param IODSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamIODSPSwitchCase(MBooleanParamIODSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MString Param IODSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MString Param IODSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamIODSPSwitch(MStringParamIODSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MString Param IODSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MString Param IODSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamIODSPSwitchCase(MStringParamIODSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInteger Param IODSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInteger Param IODSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamIODSPSwitch(MIntegerParamIODSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInteger Param IODSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInteger Param IODSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamIODSPSwitchCase(MIntegerParamIODSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnum Param IODSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnum Param IODSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamIODSPSwitch(MEnumParamIODSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnum Param IODSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnum Param IODSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamIODSPSwitchCase(MEnumParamIODSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MReal Param IODSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MReal Param IODSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamIODSPSwitch(MRealParamIODSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MReal Param IODSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MReal Param IODSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamIODSPSwitchCase(MRealParamIODSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Package Element</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageElement(MCommonPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Package File</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Package File</em>'.
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