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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage
 * @generated
 */
public class mclevdomAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static mclevdomPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public mclevdomAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = mclevdomPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
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
	protected mclevdomSwitch<Adapter> modelSwitch =
		new mclevdomSwitch<Adapter>() {
			@Override
			public Adapter caseMDomain(MDomain object) {
				return createMDomainAdapter();
			}
			@Override
			public Adapter caseMAODomain(MAODomain object) {
				return createMAODomainAdapter();
			}
			@Override
			public Adapter caseMIODomain(MIODomain object) {
				return createMIODomainAdapter();
			}
			@Override
			public Adapter caseMComponentType(MComponentType object) {
				return createMComponentTypeAdapter();
			}
			@Override
			public Adapter caseMIODAbstractComponentType(MIODAbstractComponentType object) {
				return createMIODAbstractComponentTypeAdapter();
			}
			@Override
			public Adapter caseMIODComponentType(MIODComponentType object) {
				return createMIODComponentTypeAdapter();
			}
			@Override
			public Adapter caseMAODComponentType(MAODComponentType object) {
				return createMAODComponentTypeAdapter();
			}
			@Override
			public Adapter caseMComponentTypeInstance(MComponentTypeInstance object) {
				return createMComponentTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMIODComponentTypeInstance(MIODComponentTypeInstance object) {
				return createMIODComponentTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMAODComponentTypeInstance(MAODComponentTypeInstance object) {
				return createMAODComponentTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMPortTypeInstance(MPortTypeInstance object) {
				return createMPortTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMInternalPortTypeInstance(MInternalPortTypeInstance object) {
				return createMInternalPortTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMInternalClientPortTypeInstance(MInternalClientPortTypeInstance object) {
				return createMInternalClientPortTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMInternalServerPortTypeInstance(MInternalServerPortTypeInstance object) {
				return createMInternalServerPortTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMExternalPortTypeInstance(MExternalPortTypeInstance object) {
				return createMExternalPortTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMExternalClientPortTypeInstance(MExternalClientPortTypeInstance object) {
				return createMExternalClientPortTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMExternalServerPortTypeInstance(MExternalServerPortTypeInstance object) {
				return createMExternalServerPortTypeInstanceAdapter();
			}
			@Override
			public Adapter caseMConnector(MConnector object) {
				return createMConnectorAdapter();
			}
			@Override
			public Adapter caseMPortType(MPortType object) {
				return createMPortTypeAdapter();
			}
			@Override
			public Adapter caseMInterfaceType(MInterfaceType object) {
				return createMInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseMExchangeModel(MExchangeModel object) {
				return createMExchangeModelAdapter();
			}
			@Override
			public Adapter caseMMCLEVDOMPackageFile(MMCLEVDOMPackageFile object) {
				return createMMCLEVDOMPackageFileAdapter();
			}
			@Override
			public Adapter caseMMCLEVDOMPackageElement(MMCLEVDOMPackageElement object) {
				return createMMCLEVDOMPackageElementAdapter();
			}
			@Override
			public Adapter caseMIODomainSupportedPlatform(MIODomainSupportedPlatform object) {
				return createMIODomainSupportedPlatformAdapter();
			}
			@Override
			public Adapter caseMParameterIODSPSwitch(MParameterIODSPSwitch object) {
				return createMParameterIODSPSwitchAdapter();
			}
			@Override
			public Adapter caseMParameterIODSPSwitchCase(MParameterIODSPSwitchCase object) {
				return createMParameterIODSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMBooleanParamIODSPSwitch(MBooleanParamIODSPSwitch object) {
				return createMBooleanParamIODSPSwitchAdapter();
			}
			@Override
			public Adapter caseMBooleanParamIODSPSwitchCase(MBooleanParamIODSPSwitchCase object) {
				return createMBooleanParamIODSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMStringParamIODSPSwitch(MStringParamIODSPSwitch object) {
				return createMStringParamIODSPSwitchAdapter();
			}
			@Override
			public Adapter caseMStringParamIODSPSwitchCase(MStringParamIODSPSwitchCase object) {
				return createMStringParamIODSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMIntegerParamIODSPSwitch(MIntegerParamIODSPSwitch object) {
				return createMIntegerParamIODSPSwitchAdapter();
			}
			@Override
			public Adapter caseMIntegerParamIODSPSwitchCase(MIntegerParamIODSPSwitchCase object) {
				return createMIntegerParamIODSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMEnumParamIODSPSwitch(MEnumParamIODSPSwitch object) {
				return createMEnumParamIODSPSwitchAdapter();
			}
			@Override
			public Adapter caseMEnumParamIODSPSwitchCase(MEnumParamIODSPSwitchCase object) {
				return createMEnumParamIODSPSwitchCaseAdapter();
			}
			@Override
			public Adapter caseMRealParamIODSPSwitch(MRealParamIODSPSwitch object) {
				return createMRealParamIODSPSwitchAdapter();
			}
			@Override
			public Adapter caseMRealParamIODSPSwitchCase(MRealParamIODSPSwitchCase object) {
				return createMRealParamIODSPSwitchCaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain <em>MDomain</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MDomain
	 * @generated
	 */
	public Adapter createMDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain <em>MAO Domain</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain
	 * @generated
	 */
	public Adapter createMAODomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain <em>MIO Domain</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain
	 * @generated
	 */
	public Adapter createMIODomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType <em>MComponent Type</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType
	 * @generated
	 */
	public Adapter createMComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType <em>MIOD Abstract Component Type</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType
	 * @generated
	 */
	public Adapter createMIODAbstractComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType <em>MIOD Component Type</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType
	 * @generated
	 */
	public Adapter createMIODComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType <em>MAOD Component Type</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType
	 * @generated
	 */
	public Adapter createMAODComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance <em>MComponent Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance
	 * @generated
	 */
	public Adapter createMComponentTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance <em>MIOD Component Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance
	 * @generated
	 */
	public Adapter createMIODComponentTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance <em>MAOD Component Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance
	 * @generated
	 */
	public Adapter createMAODComponentTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance <em>MPort Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance
	 * @generated
	 */
	public Adapter createMPortTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInternalPortTypeInstance <em>MInternal Port Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInternalPortTypeInstance
	 * @generated
	 */
	public Adapter createMInternalPortTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance <em>MInternal Client Port Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance
	 * @generated
	 */
	public Adapter createMInternalClientPortTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance <em>MInternal Server Port Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance
	 * @generated
	 */
	public Adapter createMInternalServerPortTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExternalPortTypeInstance <em>MExternal Port Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExternalPortTypeInstance
	 * @generated
	 */
	public Adapter createMExternalPortTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance <em>MExternal Client Port Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance
	 * @generated
	 */
	public Adapter createMExternalClientPortTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance <em>MExternal Server Port Type Instance</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance
	 * @generated
	 */
	public Adapter createMExternalServerPortTypeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector <em>MConnector</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MConnector
	 * @generated
	 */
	public Adapter createMConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType <em>MPort Type</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortType
	 * @generated
	 */
	public Adapter createMPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType <em>MInterface Type</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType
	 * @generated
	 */
	public Adapter createMInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel <em>MExchange Model</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel
	 * @generated
	 */
	public Adapter createMExchangeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageFile <em>MMCLEVDOM Package File</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageFile
	 * @generated
	 */
	public Adapter createMMCLEVDOMPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageElement <em>MMCLEVDOM Package Element</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageElement
	 * @generated
	 */
	public Adapter createMMCLEVDOMPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform <em>MIO Domain Supported Platform</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform
	 * @generated
	 */
	public Adapter createMIODomainSupportedPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch <em>MParameter IODSP Switch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch
	 * @generated
	 */
	public Adapter createMParameterIODSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase <em>MParameter IODSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase
	 * @generated
	 */
	public Adapter createMParameterIODSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitch <em>MBoolean Param IODSP Switch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitch
	 * @generated
	 */
	public Adapter createMBooleanParamIODSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitchCase <em>MBoolean Param IODSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitchCase
	 * @generated
	 */
	public Adapter createMBooleanParamIODSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitch <em>MString Param IODSP Switch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitch
	 * @generated
	 */
	public Adapter createMStringParamIODSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitchCase <em>MString Param IODSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitchCase
	 * @generated
	 */
	public Adapter createMStringParamIODSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitch <em>MInteger Param IODSP Switch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitch
	 * @generated
	 */
	public Adapter createMIntegerParamIODSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase <em>MInteger Param IODSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase
	 * @generated
	 */
	public Adapter createMIntegerParamIODSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitch <em>MEnum Param IODSP Switch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitch
	 * @generated
	 */
	public Adapter createMEnumParamIODSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitchCase <em>MEnum Param IODSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitchCase
	 * @generated
	 */
	public Adapter createMEnumParamIODSPSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitch <em>MReal Param IODSP Switch</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitch
	 * @generated
	 */
	public Adapter createMRealParamIODSPSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase <em>MReal Param IODSP Switch Case</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase
	 * @generated
	 */
	public Adapter createMRealParamIODSPSwitchCaseAdapter() {
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