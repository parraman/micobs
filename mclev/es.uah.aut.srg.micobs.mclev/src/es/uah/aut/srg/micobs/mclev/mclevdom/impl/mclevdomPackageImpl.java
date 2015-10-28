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
package es.uah.aut.srg.micobs.mclev.mclevdom.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
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
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevdomPackageImpl extends EPackageImpl implements mclevdomPackage {
	/**
	 * @generated
	 */
	private EClass mDomainEClass = null;

	/**
	 * @generated
	 */
	private EClass maoDomainEClass = null;

	/**
	 * @generated
	 */
	private EClass mioDomainEClass = null;

	/**
	 * @generated
	 */
	private EClass mComponentTypeEClass = null;

	/**
	 * @generated
	 */
	private EClass miodAbstractComponentTypeEClass = null;

	/**
	 * @generated
	 */
	private EClass miodComponentTypeEClass = null;

	/**
	 * @generated
	 */
	private EClass maodComponentTypeEClass = null;

	/**
	 * @generated
	 */
	private EClass mComponentTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass miodComponentTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass maodComponentTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mPortTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalPortTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalClientPortTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalServerPortTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mExternalPortTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mExternalClientPortTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mExternalServerPortTypeInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mConnectorEClass = null;

	/**
	 * @generated
	 */
	private EClass mPortTypeEClass = null;

	/**
	 * @generated
	 */
	private EClass mInterfaceTypeEClass = null;

	/**
	 * @generated
	 */
	private EClass mExchangeModelEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevdomPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevdomPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mioDomainSupportedPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterIODSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterIODSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamIODSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamIODSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamIODSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamIODSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamIODSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamIODSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamIODSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamIODSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamIODSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamIODSPSwitchCaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevdomPackageImpl() {
		super(eNS_URI, mclevdomFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevdomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevdomPackage init() {
		if (isInited) return (mclevdomPackage)EPackage.Registry.INSTANCE.getEPackage(mclevdomPackage.eNS_URI);

		// Obtain or create and register package
		mclevdomPackageImpl themclevdomPackage = (mclevdomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevdomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevdomPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mclevsaiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevdomPackage.createPackageContents();

		// Initialize created meta-data
		themclevdomPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevdomPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevdomPackage.eNS_URI, themclevdomPackage);
		return themclevdomPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMDomain() {
		return mDomainEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMDomain_AllowsSingleton() {
		return (EAttribute)mDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMDomain_Attributes() {
		return (EReference)mDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMDomain_PortTypes() {
		return (EReference)mDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMDomain_InterfaceTypes() {
		return (EReference)mDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMDomain_Connectors() {
		return (EReference)mDomainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EClass getMAODomain() {
		return maoDomainEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMAODomain_OutputIODomains() {
		return (EReference)maoDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMAODomain_Inherits() {
		return (EReference)maoDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMAODomain_ComponentTypeInstances() {
		return (EReference)maoDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMAODomain_ComponentTypes() {
		return (EReference)maoDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EClass getMIODomain() {
		return mioDomainEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIODomain_Inherits() {
		return (EReference)mioDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomain_Languages() {
		return (EReference)mioDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomain_Requires() {
		return (EReference)mioDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomain_ExchangeModels() {
		return (EReference)mioDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomain_SupportedPlatforms() {
		return (EReference)mioDomainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomain_ComponentTypes() {
		return (EReference)mioDomainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomain_ComponentTypeInstances() {
		return (EReference)mioDomainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EClass getMComponentType() {
		return mComponentTypeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMComponentType_Attributes() {
		return (EReference)mComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentType_PortTypeInstances() {
		return (EReference)mComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMIODAbstractComponentType() {
		return miodAbstractComponentTypeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIODAbstractComponentType_Inherits() {
		return (EReference)miodAbstractComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMIODAbstractComponentType_ComponentTypeInstances() {
		return (EReference)miodAbstractComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMIODComponentType() {
		return miodComponentTypeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIODComponentType_Language() {
		return (EReference)miodComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMAODComponentType() {
		return maodComponentTypeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMAODComponentType_Inherits() {
		return (EReference)maodComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMAODComponentType_ComponentTypeInstances() {
		return (EReference)maodComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMComponentTypeInstance() {
		return mComponentTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMComponentTypeInstance_LowerBound() {
		return (EReference)mComponentTypeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentTypeInstance_UpperBound() {
		return (EReference)mComponentTypeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMIODComponentTypeInstance() {
		return miodComponentTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIODComponentTypeInstance_ComponentType() {
		return (EReference)miodComponentTypeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMAODComponentTypeInstance() {
		return maodComponentTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMAODComponentTypeInstance_ComponentType() {
		return (EReference)maodComponentTypeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMPortTypeInstance() {
		return mPortTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMPortTypeInstance_PortType() {
		return (EReference)mPortTypeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMPortTypeInstance_LowerBound() {
		return (EReference)mPortTypeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMPortTypeInstance_UpperBound() {
		return (EReference)mPortTypeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMInternalPortTypeInstance() {
		return mInternalPortTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMInternalClientPortTypeInstance() {
		return mInternalClientPortTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMInternalServerPortTypeInstance() {
		return mInternalServerPortTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMExternalPortTypeInstance() {
		return mExternalPortTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMExternalClientPortTypeInstance() {
		return mExternalClientPortTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMExternalServerPortTypeInstance() {
		return mExternalServerPortTypeInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMConnector() {
		return mConnectorEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMConnector_Inherits() {
		return (EReference)mConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMConnector_Attributes() {
		return (EReference)mConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMConnector_ClientPortTypes() {
		return (EReference)mConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMConnector_ServerPortTypes() {
		return (EReference)mConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMConnector_ExchangeModel() {
		return (EReference)mConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EClass getMPortType() {
		return mPortTypeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMPortType_Inherits() {
		return (EReference)mPortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMPortType_InterfaceTypes() {
		return (EReference)mPortTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMPortType_Attributes() {
		return (EReference)mPortTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMPortType_ClientAttributes() {
		return (EReference)mPortTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMPortType_ServerAttributes() {
		return (EReference)mPortTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EClass getMInterfaceType() {
		return mInterfaceTypeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInterfaceType_Inherits() {
		return (EReference)mInterfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMExchangeModel() {
		return mExchangeModelEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMExchangeModel_InterfaceTypes() {
		return (EReference)mExchangeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMExchangeModel_Inherits() {
		return (EReference)mExchangeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVDOMPackageFile() {
		return mmclevdomPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVDOMPackageElement() {
		return mmclevdomPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIODomainSupportedPlatform() {
		return mioDomainSupportedPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Osapi() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Os() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Architecture() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Compiler() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Microprocessor() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Board() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Attributes() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Requires() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated
	 */
	public EReference getMIODomainSupportedPlatform_Languages() {
		return (EReference)mioDomainSupportedPlatformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterIODSPSwitch() {
		return mParameterIODSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterIODSPSwitch_Cases() {
		return (EReference)mParameterIODSPSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterIODSPSwitchCase() {
		return mParameterIODSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterIODSPSwitchCase_DefaultValue() {
		return (EReference)mParameterIODSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterIODSPSwitchCase_Platform() {
		return (EReference)mParameterIODSPSwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamIODSPSwitch() {
		return mBooleanParamIODSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamIODSPSwitchCase() {
		return mBooleanParamIODSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamIODSPSwitch() {
		return mStringParamIODSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamIODSPSwitchCase() {
		return mStringParamIODSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamIODSPSwitch() {
		return mIntegerParamIODSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamIODSPSwitchCase() {
		return mIntegerParamIODSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIntegerParamIODSPSwitchCase_Range() {
		return (EReference)mIntegerParamIODSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamIODSPSwitch() {
		return mEnumParamIODSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamIODSPSwitchCase() {
		return mEnumParamIODSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamIODSPSwitch() {
		return mRealParamIODSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamIODSPSwitchCase() {
		return mRealParamIODSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMRealParamIODSPSwitchCase_Range() {
		return (EReference)mRealParamIODSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public mclevdomFactory getmclevdomFactory() {
		return (mclevdomFactory)getEFactoryInstance();
	}

	/**
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mDomainEClass = createEClass(MDOMAIN);
		createEAttribute(mDomainEClass, MDOMAIN__ALLOWS_SINGLETON);
		createEReference(mDomainEClass, MDOMAIN__ATTRIBUTES);
		createEReference(mDomainEClass, MDOMAIN__PORT_TYPES);
		createEReference(mDomainEClass, MDOMAIN__INTERFACE_TYPES);
		createEReference(mDomainEClass, MDOMAIN__CONNECTORS);

		maoDomainEClass = createEClass(MAO_DOMAIN);
		createEReference(maoDomainEClass, MAO_DOMAIN__OUTPUT_IO_DOMAINS);
		createEReference(maoDomainEClass, MAO_DOMAIN__INHERITS);
		createEReference(maoDomainEClass, MAO_DOMAIN__COMPONENT_TYPE_INSTANCES);
		createEReference(maoDomainEClass, MAO_DOMAIN__COMPONENT_TYPES);

		mioDomainEClass = createEClass(MIO_DOMAIN);
		createEReference(mioDomainEClass, MIO_DOMAIN__INHERITS);
		createEReference(mioDomainEClass, MIO_DOMAIN__LANGUAGES);
		createEReference(mioDomainEClass, MIO_DOMAIN__REQUIRES);
		createEReference(mioDomainEClass, MIO_DOMAIN__EXCHANGE_MODELS);
		createEReference(mioDomainEClass, MIO_DOMAIN__SUPPORTED_PLATFORMS);
		createEReference(mioDomainEClass, MIO_DOMAIN__COMPONENT_TYPES);
		createEReference(mioDomainEClass, MIO_DOMAIN__COMPONENT_TYPE_INSTANCES);

		mComponentTypeEClass = createEClass(MCOMPONENT_TYPE);
		createEReference(mComponentTypeEClass, MCOMPONENT_TYPE__ATTRIBUTES);
		createEReference(mComponentTypeEClass, MCOMPONENT_TYPE__PORT_TYPE_INSTANCES);

		miodAbstractComponentTypeEClass = createEClass(MIOD_ABSTRACT_COMPONENT_TYPE);
		createEReference(miodAbstractComponentTypeEClass, MIOD_ABSTRACT_COMPONENT_TYPE__INHERITS);
		createEReference(miodAbstractComponentTypeEClass, MIOD_ABSTRACT_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES);

		miodComponentTypeEClass = createEClass(MIOD_COMPONENT_TYPE);
		createEReference(miodComponentTypeEClass, MIOD_COMPONENT_TYPE__LANGUAGE);

		maodComponentTypeEClass = createEClass(MAOD_COMPONENT_TYPE);
		createEReference(maodComponentTypeEClass, MAOD_COMPONENT_TYPE__INHERITS);
		createEReference(maodComponentTypeEClass, MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES);

		mComponentTypeInstanceEClass = createEClass(MCOMPONENT_TYPE_INSTANCE);
		createEReference(mComponentTypeInstanceEClass, MCOMPONENT_TYPE_INSTANCE__LOWER_BOUND);
		createEReference(mComponentTypeInstanceEClass, MCOMPONENT_TYPE_INSTANCE__UPPER_BOUND);

		miodComponentTypeInstanceEClass = createEClass(MIOD_COMPONENT_TYPE_INSTANCE);
		createEReference(miodComponentTypeInstanceEClass, MIOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE);

		maodComponentTypeInstanceEClass = createEClass(MAOD_COMPONENT_TYPE_INSTANCE);
		createEReference(maodComponentTypeInstanceEClass, MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE);

		mPortTypeInstanceEClass = createEClass(MPORT_TYPE_INSTANCE);
		createEReference(mPortTypeInstanceEClass, MPORT_TYPE_INSTANCE__PORT_TYPE);
		createEReference(mPortTypeInstanceEClass, MPORT_TYPE_INSTANCE__LOWER_BOUND);
		createEReference(mPortTypeInstanceEClass, MPORT_TYPE_INSTANCE__UPPER_BOUND);

		mInternalPortTypeInstanceEClass = createEClass(MINTERNAL_PORT_TYPE_INSTANCE);

		mInternalClientPortTypeInstanceEClass = createEClass(MINTERNAL_CLIENT_PORT_TYPE_INSTANCE);

		mInternalServerPortTypeInstanceEClass = createEClass(MINTERNAL_SERVER_PORT_TYPE_INSTANCE);

		mExternalPortTypeInstanceEClass = createEClass(MEXTERNAL_PORT_TYPE_INSTANCE);

		mExternalClientPortTypeInstanceEClass = createEClass(MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE);

		mExternalServerPortTypeInstanceEClass = createEClass(MEXTERNAL_SERVER_PORT_TYPE_INSTANCE);

		mConnectorEClass = createEClass(MCONNECTOR);
		createEReference(mConnectorEClass, MCONNECTOR__INHERITS);
		createEReference(mConnectorEClass, MCONNECTOR__ATTRIBUTES);
		createEReference(mConnectorEClass, MCONNECTOR__CLIENT_PORT_TYPES);
		createEReference(mConnectorEClass, MCONNECTOR__SERVER_PORT_TYPES);
		createEReference(mConnectorEClass, MCONNECTOR__EXCHANGE_MODEL);

		mPortTypeEClass = createEClass(MPORT_TYPE);
		createEReference(mPortTypeEClass, MPORT_TYPE__INHERITS);
		createEReference(mPortTypeEClass, MPORT_TYPE__INTERFACE_TYPES);
		createEReference(mPortTypeEClass, MPORT_TYPE__ATTRIBUTES);
		createEReference(mPortTypeEClass, MPORT_TYPE__CLIENT_ATTRIBUTES);
		createEReference(mPortTypeEClass, MPORT_TYPE__SERVER_ATTRIBUTES);

		mInterfaceTypeEClass = createEClass(MINTERFACE_TYPE);
		createEReference(mInterfaceTypeEClass, MINTERFACE_TYPE__INHERITS);

		mExchangeModelEClass = createEClass(MEXCHANGE_MODEL);
		createEReference(mExchangeModelEClass, MEXCHANGE_MODEL__INTERFACE_TYPES);
		createEReference(mExchangeModelEClass, MEXCHANGE_MODEL__INHERITS);

		mmclevdomPackageFileEClass = createEClass(MMCLEVDOM_PACKAGE_FILE);

		mmclevdomPackageElementEClass = createEClass(MMCLEVDOM_PACKAGE_ELEMENT);

		mioDomainSupportedPlatformEClass = createEClass(MIO_DOMAIN_SUPPORTED_PLATFORM);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__OSAPI);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__OS);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__ARCHITECTURE);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__COMPILER);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__MICROPROCESSOR);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__BOARD);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__ATTRIBUTES);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__REQUIRES);
		createEReference(mioDomainSupportedPlatformEClass, MIO_DOMAIN_SUPPORTED_PLATFORM__LANGUAGES);

		mParameterIODSPSwitchEClass = createEClass(MPARAMETER_IODSP_SWITCH);
		createEReference(mParameterIODSPSwitchEClass, MPARAMETER_IODSP_SWITCH__CASES);

		mParameterIODSPSwitchCaseEClass = createEClass(MPARAMETER_IODSP_SWITCH_CASE);
		createEReference(mParameterIODSPSwitchCaseEClass, MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE);
		createEReference(mParameterIODSPSwitchCaseEClass, MPARAMETER_IODSP_SWITCH_CASE__PLATFORM);

		mBooleanParamIODSPSwitchEClass = createEClass(MBOOLEAN_PARAM_IODSP_SWITCH);

		mBooleanParamIODSPSwitchCaseEClass = createEClass(MBOOLEAN_PARAM_IODSP_SWITCH_CASE);

		mStringParamIODSPSwitchEClass = createEClass(MSTRING_PARAM_IODSP_SWITCH);

		mStringParamIODSPSwitchCaseEClass = createEClass(MSTRING_PARAM_IODSP_SWITCH_CASE);

		mIntegerParamIODSPSwitchEClass = createEClass(MINTEGER_PARAM_IODSP_SWITCH);

		mIntegerParamIODSPSwitchCaseEClass = createEClass(MINTEGER_PARAM_IODSP_SWITCH_CASE);
		createEReference(mIntegerParamIODSPSwitchCaseEClass, MINTEGER_PARAM_IODSP_SWITCH_CASE__RANGE);

		mEnumParamIODSPSwitchEClass = createEClass(MENUM_PARAM_IODSP_SWITCH);

		mEnumParamIODSPSwitchCaseEClass = createEClass(MENUM_PARAM_IODSP_SWITCH_CASE);

		mRealParamIODSPSwitchEClass = createEClass(MREAL_PARAM_IODSP_SWITCH);

		mRealParamIODSPSwitchCaseEClass = createEClass(MREAL_PARAM_IODSP_SWITCH_CASE);
		createEReference(mRealParamIODSPSwitchCaseEClass, MREAL_PARAM_IODSP_SWITCH_CASE__RANGE);
	}

	/**
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		systemPackage thesystemPackage = (systemPackage)EPackage.Registry.INSTANCE.getEPackage(systemPackage.eNS_URI);
		mclevsaiPackage themclevsaiPackage = (mclevsaiPackage)EPackage.Registry.INSTANCE.getEPackage(mclevsaiPackage.eNS_URI);
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mDomainEClass.getESuperTypes().add(this.getMMCLEVDOMPackageElement());
		maoDomainEClass.getESuperTypes().add(this.getMDomain());
		mioDomainEClass.getESuperTypes().add(this.getMDomain());
		mComponentTypeEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		miodAbstractComponentTypeEClass.getESuperTypes().add(this.getMComponentType());
		miodComponentTypeEClass.getESuperTypes().add(this.getMIODAbstractComponentType());
		maodComponentTypeEClass.getESuperTypes().add(this.getMComponentType());
		miodComponentTypeInstanceEClass.getESuperTypes().add(this.getMComponentTypeInstance());
		maodComponentTypeInstanceEClass.getESuperTypes().add(this.getMComponentTypeInstance());
		mInternalPortTypeInstanceEClass.getESuperTypes().add(this.getMPortTypeInstance());
		mInternalClientPortTypeInstanceEClass.getESuperTypes().add(this.getMInternalPortTypeInstance());
		mInternalServerPortTypeInstanceEClass.getESuperTypes().add(this.getMInternalPortTypeInstance());
		mExternalPortTypeInstanceEClass.getESuperTypes().add(this.getMPortTypeInstance());
		mExternalClientPortTypeInstanceEClass.getESuperTypes().add(this.getMExternalPortTypeInstance());
		mExternalServerPortTypeInstanceEClass.getESuperTypes().add(this.getMExternalPortTypeInstance());
		mConnectorEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mPortTypeEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mInterfaceTypeEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mExchangeModelEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mmclevdomPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevdomPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());
		mioDomainSupportedPlatformEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mParameterIODSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMParameter());
		mBooleanParamIODSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMBooleanParameter());
		mBooleanParamIODSPSwitchEClass.getESuperTypes().add(this.getMParameterIODSPSwitch());
		mBooleanParamIODSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterIODSPSwitchCase());
		mStringParamIODSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMStringParameter());
		mStringParamIODSPSwitchEClass.getESuperTypes().add(this.getMParameterIODSPSwitch());
		mStringParamIODSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterIODSPSwitchCase());
		mIntegerParamIODSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMIntegerParameter());
		mIntegerParamIODSPSwitchEClass.getESuperTypes().add(this.getMParameterIODSPSwitch());
		mIntegerParamIODSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterIODSPSwitchCase());
		mEnumParamIODSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMEnumParameter());
		mEnumParamIODSPSwitchEClass.getESuperTypes().add(this.getMParameterIODSPSwitch());
		mEnumParamIODSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterIODSPSwitchCase());
		mRealParamIODSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMRealParameter());
		mRealParamIODSPSwitchEClass.getESuperTypes().add(this.getMParameterIODSPSwitch());
		mRealParamIODSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterIODSPSwitchCase());

		// Initialize classes and features; add operations and parameters
		initEClass(mDomainEClass, MDomain.class, "MDomain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMDomain_AllowsSingleton(), ecorePackage.getEBoolean(), "allowsSingleton", "false", 1, 1, MDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDomain_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDomain_PortTypes(), this.getMPortType(), null, "portTypes", null, 0, -1, MDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDomain_InterfaceTypes(), this.getMInterfaceType(), null, "interfaceTypes", null, 0, -1, MDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDomain_Connectors(), this.getMConnector(), null, "connectors", null, 0, -1, MDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maoDomainEClass, MAODomain.class, "MAODomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAODomain_OutputIODomains(), this.getMIODomain(), null, "outputIODomains", null, 0, -1, MAODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAODomain_Inherits(), this.getMAODomain(), null, "inherits", null, 0, -1, MAODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAODomain_ComponentTypeInstances(), this.getMAODComponentTypeInstance(), null, "componentTypeInstances", null, 0, -1, MAODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAODomain_ComponentTypes(), this.getMAODComponentType(), null, "componentTypes", null, 0, -1, MAODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mioDomainEClass, MIODomain.class, "MIODomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIODomain_Inherits(), this.getMIODomain(), null, "inherits", null, 0, -1, MIODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomain_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MIODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomain_Requires(), themclevsaiPackage.getMSAI(), null, "requires", null, 0, -1, MIODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomain_ExchangeModels(), this.getMExchangeModel(), null, "exchangeModels", null, 0, -1, MIODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomain_SupportedPlatforms(), this.getMIODomainSupportedPlatform(), null, "supportedPlatforms", null, 0, -1, MIODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomain_ComponentTypes(), this.getMIODAbstractComponentType(), null, "componentTypes", null, 0, -1, MIODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomain_ComponentTypeInstances(), this.getMIODComponentTypeInstance(), null, "componentTypeInstances", null, 0, -1, MIODomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mComponentTypeEClass, MComponentType.class, "MComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMComponentType_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentType_PortTypeInstances(), this.getMPortTypeInstance(), null, "portTypeInstances", null, 0, -1, MComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miodAbstractComponentTypeEClass, MIODAbstractComponentType.class, "MIODAbstractComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIODAbstractComponentType_Inherits(), this.getMIODAbstractComponentType(), null, "inherits", null, 0, -1, MIODAbstractComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODAbstractComponentType_ComponentTypeInstances(), this.getMIODComponentTypeInstance(), null, "componentTypeInstances", null, 0, -1, MIODAbstractComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miodComponentTypeEClass, MIODComponentType.class, "MIODComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIODComponentType_Language(), thesystemPackage.getMLanguage(), null, "language", null, 1, 1, MIODComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maodComponentTypeEClass, MAODComponentType.class, "MAODComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAODComponentType_Inherits(), this.getMAODComponentType(), null, "inherits", null, 0, -1, MAODComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAODComponentType_ComponentTypeInstances(), this.getMAODComponentTypeInstance(), null, "componentTypeInstances", null, 0, -1, MAODComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mComponentTypeInstanceEClass, MComponentTypeInstance.class, "MComponentTypeInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMComponentTypeInstance_LowerBound(), thecommonPackage.getMParameterValueExpression(), null, "lowerBound", null, 1, 1, MComponentTypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentTypeInstance_UpperBound(), thecommonPackage.getMParameterValueExpression(), null, "upperBound", null, 1, 1, MComponentTypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miodComponentTypeInstanceEClass, MIODComponentTypeInstance.class, "MIODComponentTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIODComponentTypeInstance_ComponentType(), this.getMIODAbstractComponentType(), null, "componentType", null, 1, 1, MIODComponentTypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maodComponentTypeInstanceEClass, MAODComponentTypeInstance.class, "MAODComponentTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAODComponentTypeInstance_ComponentType(), this.getMAODComponentType(), null, "componentType", null, 1, 1, MAODComponentTypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPortTypeInstanceEClass, MPortTypeInstance.class, "MPortTypeInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPortTypeInstance_PortType(), this.getMPortType(), null, "portType", null, 1, 1, MPortTypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPortTypeInstance_LowerBound(), thecommonPackage.getMParameterValueExpression(), null, "lowerBound", null, 1, 1, MPortTypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPortTypeInstance_UpperBound(), thecommonPackage.getMParameterValueExpression(), null, "upperBound", null, 1, 1, MPortTypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mInternalPortTypeInstanceEClass, MInternalPortTypeInstance.class, "MInternalPortTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mInternalClientPortTypeInstanceEClass, MInternalClientPortTypeInstance.class, "MInternalClientPortTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mInternalServerPortTypeInstanceEClass, MInternalServerPortTypeInstance.class, "MInternalServerPortTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mExternalPortTypeInstanceEClass, MExternalPortTypeInstance.class, "MExternalPortTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mExternalClientPortTypeInstanceEClass, MExternalClientPortTypeInstance.class, "MExternalClientPortTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mExternalServerPortTypeInstanceEClass, MExternalServerPortTypeInstance.class, "MExternalServerPortTypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mConnectorEClass, MConnector.class, "MConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConnector_Inherits(), this.getMConnector(), null, "inherits", null, 0, -1, MConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnector_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnector_ClientPortTypes(), this.getMPortType(), null, "clientPortTypes", null, 1, -1, MConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnector_ServerPortTypes(), this.getMPortType(), null, "serverPortTypes", null, 1, -1, MConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnector_ExchangeModel(), this.getMExchangeModel(), null, "exchangeModel", null, 0, 1, MConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPortTypeEClass, MPortType.class, "MPortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPortType_Inherits(), this.getMPortType(), null, "inherits", null, 0, -1, MPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPortType_InterfaceTypes(), this.getMInterfaceType(), null, "interfaceTypes", null, 1, -1, MPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPortType_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPortType_ClientAttributes(), thecommonPackage.getMParameter(), null, "clientAttributes", null, 0, -1, MPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPortType_ServerAttributes(), thecommonPackage.getMParameter(), null, "serverAttributes", null, 0, -1, MPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mInterfaceTypeEClass, MInterfaceType.class, "MInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInterfaceType_Inherits(), this.getMInterfaceType(), null, "inherits", null, 0, -1, MInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mExchangeModelEClass, MExchangeModel.class, "MExchangeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMExchangeModel_InterfaceTypes(), this.getMInterfaceType(), null, "interfaceTypes", null, 2, -1, MExchangeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMExchangeModel_Inherits(), this.getMExchangeModel(), null, "inherits", null, 0, -1, MExchangeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevdomPackageFileEClass, MMCLEVDOMPackageFile.class, "MMCLEVDOMPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevdomPackageElementEClass, MMCLEVDOMPackageElement.class, "MMCLEVDOMPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mioDomainSupportedPlatformEClass, MIODomainSupportedPlatform.class, "MIODomainSupportedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIODomainSupportedPlatform_Osapi(), thepdlPackage.getMOperatingSystemAPI(), null, "osapi", null, 0, 1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Os(), thepdlPackage.getMOperatingSystem(), null, "os", null, 0, 1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Architecture(), thepdlPackage.getMArchitecture(), null, "architecture", null, 0, 1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Compiler(), thepdlPackage.getMCompiler(), null, "compiler", null, 0, 1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Microprocessor(), thepdlPackage.getMMicroprocessor(), null, "microprocessor", null, 0, 1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Board(), thepdlPackage.getMBoard(), null, "board", null, 0, 1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Requires(), themclevsaiPackage.getMSAI(), null, "requires", null, 0, -1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMIODomainSupportedPlatform_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MIODomainSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterIODSPSwitchEClass, MParameterIODSPSwitch.class, "MParameterIODSPSwitch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterIODSPSwitch_Cases(), this.getMParameterIODSPSwitchCase(), null, "cases", null, 1, -1, MParameterIODSPSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterIODSPSwitchCaseEClass, MParameterIODSPSwitchCase.class, "MParameterIODSPSwitchCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterIODSPSwitchCase_DefaultValue(), thecommonPackage.getMParameterValueExpression(), null, "defaultValue", null, 1, 1, MParameterIODSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterIODSPSwitchCase_Platform(), this.getMIODomainSupportedPlatform(), null, "platform", null, 1, 1, MParameterIODSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mBooleanParamIODSPSwitchEClass, MBooleanParamIODSPSwitch.class, "MBooleanParamIODSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBooleanParamIODSPSwitchCaseEClass, MBooleanParamIODSPSwitchCase.class, "MBooleanParamIODSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamIODSPSwitchEClass, MStringParamIODSPSwitch.class, "MStringParamIODSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamIODSPSwitchCaseEClass, MStringParamIODSPSwitchCase.class, "MStringParamIODSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamIODSPSwitchEClass, MIntegerParamIODSPSwitch.class, "MIntegerParamIODSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamIODSPSwitchCaseEClass, MIntegerParamIODSPSwitchCase.class, "MIntegerParamIODSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIntegerParamIODSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MIntegerParamIODSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParamIODSPSwitchEClass, MEnumParamIODSPSwitch.class, "MEnumParamIODSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mEnumParamIODSPSwitchCaseEClass, MEnumParamIODSPSwitchCase.class, "MEnumParamIODSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamIODSPSwitchEClass, MRealParamIODSPSwitch.class, "MRealParamIODSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamIODSPSwitchCaseEClass, MRealParamIODSPSwitchCase.class, "MRealParamIODSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRealParamIODSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MRealParamIODSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}