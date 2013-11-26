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
package es.uah.aut.srg.micobs.mesp.mespswp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpFactory
 * @model kind="package"
 * @generated
 */
public interface mespswpPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mespswp";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mespswp";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mespswpPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageElementImpl <em>MMESPSWPPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMMESPSWPPackageElement()
	 * @generated
	 */
	int MMESPSWP_PACKAGE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMESPSWPPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageImpl <em>MSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackage()
	 * @generated
	 */
	int MSW_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__VERSION = MMESPSWP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__NAME = MMESPSWP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__URI = MMESPSWP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__INHERITS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__PROVIDES = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__PARAMETERS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__EXTENDS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__LANGUAGES = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ctools</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__CTOOLS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__REQUIRES = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>SupportedPlatforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE__SUPPORTED_PLATFORMS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>MSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_FEATURE_COUNT = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl <em>MDriverSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMDriverSwPackage()
	 * @generated
	 */
	int MDRIVER_SW_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__VERSION = MMESPSWP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__NAME = MMESPSWP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__URI = MMESPSWP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__INHERITS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__PROVIDES = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__PARAMETERS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__EXTENDS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__LANGUAGES = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ctools</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__CTOOLS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__REQUIRES = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>SupportedPlatforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>MDriverSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_FEATURE_COUNT = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfaceImpl <em>MSwPackageProvidedInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterface()
	 * @generated
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Swinterface</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE = 0;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>MSwPackageProvidedInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAImpl <em>MSwPackageProvidedInterfacePVA</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVA()
	 * @generated
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA__PARAMETER = commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER;

	/**
	 * The number of structural features of the '<em>MSwPackageProvidedInterfacePVA</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_FEATURE_COUNT = commonPackage.MPARAMETER_VALUE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchImpl <em>MSwPackageProvidedInterfacePVASwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVASwitch()
	 * @generated
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH__PARAMETER = MSW_PACKAGE_PROVIDED_INTERFACE_PVA__PARAMETER;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH__CASES = MSW_PACKAGE_PROVIDED_INTERFACE_PVA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSwPackageProvidedInterfacePVASwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_FEATURE_COUNT = MSW_PACKAGE_PROVIDED_INTERFACE_PVA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchCaseImpl <em>MSwPackageProvidedInterfacePVASwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVASwitchCase()
	 * @generated
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE = 5;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>ParameterValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE = 1;

	/**
	 * The number of structural features of the '<em>MSwPackageProvidedInterfacePVASwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAExpressionImpl <em>MSwPackageProvidedInterfacePVAExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAExpressionImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVAExpression()
	 * @generated
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION__PARAMETER = MSW_PACKAGE_PROVIDED_INTERFACE_PVA__PARAMETER;

	/**
	 * The feature id for the '<em><b>ParameterValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION__PARAMETER_VALUE = MSW_PACKAGE_PROVIDED_INTERFACE_PVA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MSwPackageProvidedInterfacePVAExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION_FEATURE_COUNT = MSW_PACKAGE_PROVIDED_INTERFACE_PVA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageRequiredInterfaceImpl <em>MSwPackageRequiredInterface</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageRequiredInterfaceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageRequiredInterface()
	 * @generated
	 */
	int MSW_PACKAGE_REQUIRED_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>ResourceDemands</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>MSwPackageRequiredInterface</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_REQUIRED_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MAbstractSwPackageImpl <em>MAbstractSwPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MAbstractSwPackageImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMAbstractSwPackage()
	 * @generated
	 */
	int MABSTRACT_SW_PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SW_PACKAGE__VERSION = MMESPSWP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SW_PACKAGE__NAME = MMESPSWP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SW_PACKAGE__URI = MMESPSWP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SW_PACKAGE__INHERITS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SW_PACKAGE__PROVIDES = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SW_PACKAGE__PARAMETERS = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MAbstractSwPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SW_PACKAGE_FEATURE_COUNT = MMESPSWP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl <em>MSwPackageSupportedPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageSupportedPlatform()
	 * @generated
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OS</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__OS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>MSwPackageSupportedPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSW_PACKAGE_SUPPORTED_PLATFORM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedPlatformImpl <em>MDriverSwPackageSupportedPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedPlatformImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMDriverSwPackageSupportedPlatform()
	 * @generated
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__NAME = MSW_PACKAGE_SUPPORTED_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__DESCRIPTION = MSW_PACKAGE_SUPPORTED_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Osapi</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__OSAPI = MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI;

	/**
	 * The feature id for the '<em><b>Os</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__OS = MSW_PACKAGE_SUPPORTED_PLATFORM__OS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE = MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__COMPILER = MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR = MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__BOARD = MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES = MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES = MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS = MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>SupportedDevices</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES = MSW_PACKAGE_SUPPORTED_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MDriverSwPackageSupportedPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM_FEATURE_COUNT = MSW_PACKAGE_SUPPORTED_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedDeviceImpl <em>MDriverSwPackageSupportedDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedDeviceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMDriverSwPackageSupportedDevice()
	 * @generated
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MDriverSwPackageSupportedDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MResourceDemandImpl <em>MResourceDemand</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MResourceDemandImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMResourceDemand()
	 * @generated
	 */
	int MRESOURCE_DEMAND = 12;

	/**
	 * The number of structural features of the '<em>MResourceDemand</em>' class.
	 * @generated
	 * @ordered
	 */
	int MRESOURCE_DEMAND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MInstantiableResourceDemandImpl <em>MInstantiableResourceDemand</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MInstantiableResourceDemandImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMInstantiableResourceDemand()
	 * @generated
	 */
	int MINSTANTIABLE_RESOURCE_DEMAND = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE_DEMAND__NAME = MRESOURCE_DEMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION = MRESOURCE_DEMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE = MRESOURCE_DEMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS = MRESOURCE_DEMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MInstantiableResourceDemand</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINSTANTIABLE_RESOURCE_DEMAND_FEATURE_COUNT = MRESOURCE_DEMAND_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MQuantifiableResourceDemandImpl <em>MQuantifiableResourceDemand</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MQuantifiableResourceDemandImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMQuantifiableResourceDemand()
	 * @generated
	 */
	int MQUANTIFIABLE_RESOURCE_DEMAND = 14;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE = MRESOURCE_DEMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ResourceValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE = MRESOURCE_DEMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MQuantifiableResourceDemand</em>' class.
	 * @generated
	 * @ordered
	 */
	int MQUANTIFIABLE_RESOURCE_DEMAND_FEATURE_COUNT = MRESOURCE_DEMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageFileImpl <em>MMESPSWPPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMMESPSWPPackageFile()
	 * @generated
	 */
	int MMESPSWP_PACKAGE_FILE = 15;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMESPSWPPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPSWP_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchImpl <em>MParameterSWPSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMParameterSWPSPSwitch()
	 * @generated
	 */
	int MPARAMETER_SWPSP_SWITCH = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH__NAME = commonPackage.MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH__DESCRIPTION = commonPackage.MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH__CONSTANT = commonPackage.MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH__CASES = commonPackage.MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterSWPSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH_FEATURE_COUNT = commonPackage.MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchCaseImpl <em>MParameterSWPSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMParameterSWPSPSwitchCase()
	 * @generated
	 */
	int MPARAMETER_SWPSP_SWITCH_CASE = 18;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>MParameterSWPSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchImpl <em>MBooleanParamSWPSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMBooleanParamSWPSPSwitch()
	 * @generated
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH__NAME = commonPackage.MBOOLEAN_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH__DESCRIPTION = commonPackage.MBOOLEAN_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH__CONSTANT = commonPackage.MBOOLEAN_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH__CASES = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MBooleanParamSWPSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH_FEATURE_COUNT = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchCaseImpl <em>MBooleanParamSWPSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMBooleanParamSWPSPSwitchCase()
	 * @generated
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH_CASE = 20;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH_CASE__PLATFORM = MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>MBooleanParamSWPSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SWPSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchImpl <em>MStringParamSWPSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMStringParamSWPSPSwitch()
	 * @generated
	 */
	int MSTRING_PARAM_SWPSP_SWITCH = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH__NAME = commonPackage.MSTRING_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH__DESCRIPTION = commonPackage.MSTRING_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH__CONSTANT = commonPackage.MSTRING_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH__CASES = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MStringParamSWPSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH_FEATURE_COUNT = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchCaseImpl <em>MStringParamSWPSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMStringParamSWPSPSwitchCase()
	 * @generated
	 */
	int MSTRING_PARAM_SWPSP_SWITCH_CASE = 22;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH_CASE__PLATFORM = MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>MStringParamSWPSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SWPSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchImpl <em>MIntegerParamSWPSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMIntegerParamSWPSPSwitch()
	 * @generated
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH__NAME = commonPackage.MINTEGER_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH__DESCRIPTION = commonPackage.MINTEGER_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH__CONSTANT = commonPackage.MINTEGER_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH__CASES = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIntegerParamSWPSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH_FEATURE_COUNT = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchCaseImpl <em>MIntegerParamSWPSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMIntegerParamSWPSPSwitchCase()
	 * @generated
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH_CASE = 24;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH_CASE__PLATFORM = MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH_CASE__RANGE = MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIntegerParamSWPSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SWPSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchImpl <em>MEnumParamSWPSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMEnumParamSWPSPSwitch()
	 * @generated
	 */
	int MENUM_PARAM_SWPSP_SWITCH = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH__NAME = commonPackage.MENUM_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH__DESCRIPTION = commonPackage.MENUM_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH__CONSTANT = commonPackage.MENUM_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>EnumDefinition</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH__ENUM_DEFINITION = commonPackage.MENUM_PARAMETER__ENUM_DEFINITION;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH__CASES = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParamSWPSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH_FEATURE_COUNT = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchCaseImpl <em>MEnumParamSWPSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMEnumParamSWPSPSwitchCase()
	 * @generated
	 */
	int MENUM_PARAM_SWPSP_SWITCH_CASE = 26;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH_CASE__PLATFORM = MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>MEnumParamSWPSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SWPSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchImpl <em>MRealParamSWPSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMRealParamSWPSPSwitch()
	 * @generated
	 */
	int MREAL_PARAM_SWPSP_SWITCH = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH__NAME = commonPackage.MREAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH__DESCRIPTION = commonPackage.MREAL_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH__CONSTANT = commonPackage.MREAL_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH__CASES = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MRealParamSWPSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH_FEATURE_COUNT = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchCaseImpl <em>MRealParamSWPSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMRealParamSWPSPSwitchCase()
	 * @generated
	 */
	int MREAL_PARAM_SWPSP_SWITCH_CASE = 28;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH_CASE__PLATFORM = MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH_CASE__RANGE = MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MRealParamSWPSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SWPSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SWPSP_SWITCH_CASE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage <em>MSwPackage</em>}'.
	 * @return the meta object for class '<em>MSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage
	 * @generated
	 */
	EClass getMSwPackage();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getExtends()
	 * @see #getMSwPackage()
	 * @generated
	 */
	EReference getMSwPackage_Extends();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getLanguages()
	 * @see #getMSwPackage()
	 * @generated
	 */
	EReference getMSwPackage_Languages();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getCtools <em>Ctools</em>}'.
	 * @return the meta object for the reference list '<em>Ctools</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getCtools()
	 * @see #getMSwPackage()
	 * @generated
	 */
	EReference getMSwPackage_Ctools();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getRequires <em>Requires</em>}'.
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getRequires()
	 * @see #getMSwPackage()
	 * @generated
	 */
	EReference getMSwPackage_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getSupportedPlatforms <em>SupportedPlatforms</em>}'.
	 * @return the meta object for the containment reference list '<em>SupportedPlatforms</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getSupportedPlatforms()
	 * @see #getMSwPackage()
	 * @generated
	 */
	EReference getMSwPackage_SupportedPlatforms();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage <em>MDriverSwPackage</em>}'.
	 * @return the meta object for class '<em>MDriverSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage
	 * @generated
	 */
	EClass getMDriverSwPackage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface <em>MSwPackageProvidedInterface</em>}'.
	 * @return the meta object for class '<em>MSwPackageProvidedInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface
	 * @generated
	 */
	EClass getMSwPackageProvidedInterface();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface#getSwinterface <em>Swinterface</em>}'.
	 * @return the meta object for the reference '<em>Swinterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface#getSwinterface()
	 * @see #getMSwPackageProvidedInterface()
	 * @generated
	 */
	EReference getMSwPackageProvidedInterface_Swinterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface#getParameterValueAssignments()
	 * @see #getMSwPackageProvidedInterface()
	 * @generated
	 */
	EReference getMSwPackageProvidedInterface_ParameterValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA <em>MSwPackageProvidedInterfacePVA</em>}'.
	 * @return the meta object for class '<em>MSwPackageProvidedInterfacePVA</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA
	 * @generated
	 */
	EClass getMSwPackageProvidedInterfacePVA();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch <em>MSwPackageProvidedInterfacePVASwitch</em>}'.
	 * @return the meta object for class '<em>MSwPackageProvidedInterfacePVASwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch
	 * @generated
	 */
	EClass getMSwPackageProvidedInterfacePVASwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch#getCases()
	 * @see #getMSwPackageProvidedInterfacePVASwitch()
	 * @generated
	 */
	EReference getMSwPackageProvidedInterfacePVASwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase <em>MSwPackageProvidedInterfacePVASwitchCase</em>}'.
	 * @return the meta object for class '<em>MSwPackageProvidedInterfacePVASwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase
	 * @generated
	 */
	EClass getMSwPackageProvidedInterfacePVASwitchCase();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase#getPlatform()
	 * @see #getMSwPackageProvidedInterfacePVASwitchCase()
	 * @generated
	 */
	EReference getMSwPackageProvidedInterfacePVASwitchCase_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase#getParameterValue <em>ParameterValue</em>}'.
	 * @return the meta object for the containment reference '<em>ParameterValue</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase#getParameterValue()
	 * @see #getMSwPackageProvidedInterfacePVASwitchCase()
	 * @generated
	 */
	EReference getMSwPackageProvidedInterfacePVASwitchCase_ParameterValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression <em>MSwPackageProvidedInterfacePVAExpression</em>}'.
	 * @return the meta object for class '<em>MSwPackageProvidedInterfacePVAExpression</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression
	 * @generated
	 */
	EClass getMSwPackageProvidedInterfacePVAExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression#getParameterValue <em>ParameterValue</em>}'.
	 * @return the meta object for the containment reference '<em>ParameterValue</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression#getParameterValue()
	 * @see #getMSwPackageProvidedInterfacePVAExpression()
	 * @generated
	 */
	EReference getMSwPackageProvidedInterfacePVAExpression_ParameterValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface <em>MSwPackageRequiredInterface</em>}'.
	 * @return the meta object for class '<em>MSwPackageRequiredInterface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface
	 * @generated
	 */
	EClass getMSwPackageRequiredInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface#getResourceDemands <em>ResourceDemands</em>}'.
	 * @return the meta object for the containment reference list '<em>ResourceDemands</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface#getResourceDemands()
	 * @see #getMSwPackageRequiredInterface()
	 * @generated
	 */
	EReference getMSwPackageRequiredInterface_ResourceDemands();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface#getInterface <em>Interface</em>}'.
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface#getInterface()
	 * @see #getMSwPackageRequiredInterface()
	 * @generated
	 */
	EReference getMSwPackageRequiredInterface_Interface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage <em>MAbstractSwPackage</em>}'.
	 * @return the meta object for class '<em>MAbstractSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage
	 * @generated
	 */
	EClass getMAbstractSwPackage();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getInherits()
	 * @see #getMAbstractSwPackage()
	 * @generated
	 */
	EReference getMAbstractSwPackage_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getProvides <em>Provides</em>}'.
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getProvides()
	 * @see #getMAbstractSwPackage()
	 * @generated
	 */
	EReference getMAbstractSwPackage_Provides();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getParameters()
	 * @see #getMAbstractSwPackage()
	 * @generated
	 */
	EReference getMAbstractSwPackage_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform <em>MSwPackageSupportedPlatform</em>}'.
	 * @return the meta object for class '<em>MSwPackageSupportedPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform
	 * @generated
	 */
	EClass getMSwPackageSupportedPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getOsapi <em>OSAPI</em>}'.
	 * @return the meta object for the reference '<em>OSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getOsapi()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Osapi();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getOs <em>OS</em>}'.
	 * @return the meta object for the reference '<em>OS</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getOs()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Os();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getArchitecture <em>Architecture</em>}'.
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getArchitecture()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Architecture();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getCompiler <em>Compiler</em>}'.
	 * @return the meta object for the reference '<em>Compiler</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getCompiler()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Compiler();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getMicroprocessor <em>Microprocessor</em>}'.
	 * @return the meta object for the reference '<em>Microprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getMicroprocessor()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Microprocessor();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getBoard <em>Board</em>}'.
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getBoard()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Board();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getLanguages()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getRequires <em>Requires</em>}'.
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getRequires()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform#getParameters()
	 * @see #getMSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMSwPackageSupportedPlatform_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform <em>MDriverSwPackageSupportedPlatform</em>}'.
	 * @return the meta object for class '<em>MDriverSwPackageSupportedPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform
	 * @generated
	 */
	EClass getMDriverSwPackageSupportedPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform#getSupportedDevices <em>SupportedDevices</em>}'.
	 * @return the meta object for the containment reference list '<em>SupportedDevices</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform#getSupportedDevices()
	 * @see #getMDriverSwPackageSupportedPlatform()
	 * @generated
	 */
	EReference getMDriverSwPackageSupportedPlatform_SupportedDevices();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice <em>MDriverSwPackageSupportedDevice</em>}'.
	 * @return the meta object for class '<em>MDriverSwPackageSupportedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice
	 * @generated
	 */
	EClass getMDriverSwPackageSupportedDevice();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice#getRequired <em>Required</em>}'.
	 * @return the meta object for the containment reference '<em>Required</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice#getRequired()
	 * @see #getMDriverSwPackageSupportedDevice()
	 * @generated
	 */
	EReference getMDriverSwPackageSupportedDevice_Required();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice#getDevice <em>Device</em>}'.
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice#getDevice()
	 * @see #getMDriverSwPackageSupportedDevice()
	 * @generated
	 */
	EReference getMDriverSwPackageSupportedDevice_Device();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand <em>MResourceDemand</em>}'.
	 * @return the meta object for class '<em>MResourceDemand</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand
	 * @generated
	 */
	EClass getMResourceDemand();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand <em>MInstantiableResourceDemand</em>}'.
	 * @return the meta object for class '<em>MInstantiableResourceDemand</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand
	 * @generated
	 */
	EClass getMInstantiableResourceDemand();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand#getResource <em>Resource</em>}'.
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand#getResource()
	 * @see #getMInstantiableResourceDemand()
	 * @generated
	 */
	EReference getMInstantiableResourceDemand_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand#getParameterValueAssignments()
	 * @see #getMInstantiableResourceDemand()
	 * @generated
	 */
	EReference getMInstantiableResourceDemand_ParameterValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand <em>MQuantifiableResourceDemand</em>}'.
	 * @return the meta object for class '<em>MQuantifiableResourceDemand</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand
	 * @generated
	 */
	EClass getMQuantifiableResourceDemand();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand#getResource <em>Resource</em>}'.
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand#getResource()
	 * @see #getMQuantifiableResourceDemand()
	 * @generated
	 */
	EReference getMQuantifiableResourceDemand_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand#getResourceValue <em>ResourceValue</em>}'.
	 * @return the meta object for the containment reference '<em>ResourceValue</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand#getResourceValue()
	 * @see #getMQuantifiableResourceDemand()
	 * @generated
	 */
	EReference getMQuantifiableResourceDemand_ResourceValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile <em>MMESPSWPPackageFile</em>}'.
	 * @return the meta object for class '<em>MMESPSWPPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile
	 * @generated
	 */
	EClass getMMESPSWPPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement <em>MMESPSWPPackageElement</em>}'.
	 * @return the meta object for class '<em>MMESPSWPPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement
	 * @generated
	 */
	EClass getMMESPSWPPackageElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch <em>MParameterSWPSPSwitch</em>}'.
	 * @return the meta object for class '<em>MParameterSWPSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch
	 * @generated
	 */
	EClass getMParameterSWPSPSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch#getCases()
	 * @see #getMParameterSWPSPSwitch()
	 * @generated
	 */
	EReference getMParameterSWPSPSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase <em>MParameterSWPSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MParameterSWPSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase
	 * @generated
	 */
	EClass getMParameterSWPSPSwitchCase();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase#getPlatform()
	 * @see #getMParameterSWPSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterSWPSPSwitchCase_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase#getDefaultValue()
	 * @see #getMParameterSWPSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterSWPSPSwitchCase_DefaultValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitch <em>MBooleanParamSWPSPSwitch</em>}'.
	 * @return the meta object for class '<em>MBooleanParamSWPSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitch
	 * @generated
	 */
	EClass getMBooleanParamSWPSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitchCase <em>MBooleanParamSWPSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MBooleanParamSWPSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitchCase
	 * @generated
	 */
	EClass getMBooleanParamSWPSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch <em>MStringParamSWPSPSwitch</em>}'.
	 * @return the meta object for class '<em>MStringParamSWPSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch
	 * @generated
	 */
	EClass getMStringParamSWPSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase <em>MStringParamSWPSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MStringParamSWPSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase
	 * @generated
	 */
	EClass getMStringParamSWPSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch <em>MIntegerParamSWPSPSwitch</em>}'.
	 * @return the meta object for class '<em>MIntegerParamSWPSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch
	 * @generated
	 */
	EClass getMIntegerParamSWPSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase <em>MIntegerParamSWPSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MIntegerParamSWPSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase
	 * @generated
	 */
	EClass getMIntegerParamSWPSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase#getRange()
	 * @see #getMIntegerParamSWPSPSwitchCase()
	 * @generated
	 */
	EReference getMIntegerParamSWPSPSwitchCase_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch <em>MEnumParamSWPSPSwitch</em>}'.
	 * @return the meta object for class '<em>MEnumParamSWPSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch
	 * @generated
	 */
	EClass getMEnumParamSWPSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitchCase <em>MEnumParamSWPSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MEnumParamSWPSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitchCase
	 * @generated
	 */
	EClass getMEnumParamSWPSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch <em>MRealParamSWPSPSwitch</em>}'.
	 * @return the meta object for class '<em>MRealParamSWPSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch
	 * @generated
	 */
	EClass getMRealParamSWPSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase <em>MRealParamSWPSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MRealParamSWPSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase
	 * @generated
	 */
	EClass getMRealParamSWPSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase#getRange()
	 * @see #getMRealParamSWPSPSwitchCase()
	 * @generated
	 */
	EReference getMRealParamSWPSPSwitchCase_Range();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mespswpFactory getmespswpFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageImpl <em>MSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackage()
		 * @generated
		 */
		EClass MSW_PACKAGE = eINSTANCE.getMSwPackage();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE__EXTENDS = eINSTANCE.getMSwPackage_Extends();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE__LANGUAGES = eINSTANCE.getMSwPackage_Languages();

		/**
		 * The meta object literal for the '<em><b>Ctools</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE__CTOOLS = eINSTANCE.getMSwPackage_Ctools();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE__REQUIRES = eINSTANCE.getMSwPackage_Requires();

		/**
		 * The meta object literal for the '<em><b>SupportedPlatforms</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE__SUPPORTED_PLATFORMS = eINSTANCE.getMSwPackage_SupportedPlatforms();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl <em>MDriverSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMDriverSwPackage()
		 * @generated
		 */
		EClass MDRIVER_SW_PACKAGE = eINSTANCE.getMDriverSwPackage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfaceImpl <em>MSwPackageProvidedInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterface()
		 * @generated
		 */
		EClass MSW_PACKAGE_PROVIDED_INTERFACE = eINSTANCE.getMSwPackageProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Swinterface</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE = eINSTANCE.getMSwPackageProvidedInterface_Swinterface();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMSwPackageProvidedInterface_ParameterValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAImpl <em>MSwPackageProvidedInterfacePVA</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVA()
		 * @generated
		 */
		EClass MSW_PACKAGE_PROVIDED_INTERFACE_PVA = eINSTANCE.getMSwPackageProvidedInterfacePVA();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchImpl <em>MSwPackageProvidedInterfacePVASwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVASwitch()
		 * @generated
		 */
		EClass MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH = eINSTANCE.getMSwPackageProvidedInterfacePVASwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH__CASES = eINSTANCE.getMSwPackageProvidedInterfacePVASwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchCaseImpl <em>MSwPackageProvidedInterfacePVASwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVASwitchCase()
		 * @generated
		 */
		EClass MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE = eINSTANCE.getMSwPackageProvidedInterfacePVASwitchCase();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM = eINSTANCE.getMSwPackageProvidedInterfacePVASwitchCase_Platform();

		/**
		 * The meta object literal for the '<em><b>ParameterValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE = eINSTANCE.getMSwPackageProvidedInterfacePVASwitchCase_ParameterValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAExpressionImpl <em>MSwPackageProvidedInterfacePVAExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAExpressionImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageProvidedInterfacePVAExpression()
		 * @generated
		 */
		EClass MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION = eINSTANCE.getMSwPackageProvidedInterfacePVAExpression();

		/**
		 * The meta object literal for the '<em><b>ParameterValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION__PARAMETER_VALUE = eINSTANCE.getMSwPackageProvidedInterfacePVAExpression_ParameterValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageRequiredInterfaceImpl <em>MSwPackageRequiredInterface</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageRequiredInterfaceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageRequiredInterface()
		 * @generated
		 */
		EClass MSW_PACKAGE_REQUIRED_INTERFACE = eINSTANCE.getMSwPackageRequiredInterface();

		/**
		 * The meta object literal for the '<em><b>ResourceDemands</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS = eINSTANCE.getMSwPackageRequiredInterface_ResourceDemands();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE = eINSTANCE.getMSwPackageRequiredInterface_Interface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MAbstractSwPackageImpl <em>MAbstractSwPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MAbstractSwPackageImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMAbstractSwPackage()
		 * @generated
		 */
		EClass MABSTRACT_SW_PACKAGE = eINSTANCE.getMAbstractSwPackage();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_SW_PACKAGE__INHERITS = eINSTANCE.getMAbstractSwPackage_Inherits();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_SW_PACKAGE__PROVIDES = eINSTANCE.getMAbstractSwPackage_Provides();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_SW_PACKAGE__PARAMETERS = eINSTANCE.getMAbstractSwPackage_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl <em>MSwPackageSupportedPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMSwPackageSupportedPlatform()
		 * @generated
		 */
		EClass MSW_PACKAGE_SUPPORTED_PLATFORM = eINSTANCE.getMSwPackageSupportedPlatform();

		/**
		 * The meta object literal for the '<em><b>OSAPI</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI = eINSTANCE.getMSwPackageSupportedPlatform_Osapi();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__OS = eINSTANCE.getMSwPackageSupportedPlatform_Os();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE = eINSTANCE.getMSwPackageSupportedPlatform_Architecture();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER = eINSTANCE.getMSwPackageSupportedPlatform_Compiler();

		/**
		 * The meta object literal for the '<em><b>Microprocessor</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR = eINSTANCE.getMSwPackageSupportedPlatform_Microprocessor();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD = eINSTANCE.getMSwPackageSupportedPlatform_Board();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES = eINSTANCE.getMSwPackageSupportedPlatform_Languages();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES = eINSTANCE.getMSwPackageSupportedPlatform_Requires();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS = eINSTANCE.getMSwPackageSupportedPlatform_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedPlatformImpl <em>MDriverSwPackageSupportedPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedPlatformImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMDriverSwPackageSupportedPlatform()
		 * @generated
		 */
		EClass MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM = eINSTANCE.getMDriverSwPackageSupportedPlatform();

		/**
		 * The meta object literal for the '<em><b>SupportedDevices</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES = eINSTANCE.getMDriverSwPackageSupportedPlatform_SupportedDevices();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedDeviceImpl <em>MDriverSwPackageSupportedDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageSupportedDeviceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMDriverSwPackageSupportedDevice()
		 * @generated
		 */
		EClass MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE = eINSTANCE.getMDriverSwPackageSupportedDevice();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED = eINSTANCE.getMDriverSwPackageSupportedDevice_Required();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * @generated
		 */
		EReference MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE = eINSTANCE.getMDriverSwPackageSupportedDevice_Device();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MResourceDemandImpl <em>MResourceDemand</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MResourceDemandImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMResourceDemand()
		 * @generated
		 */
		EClass MRESOURCE_DEMAND = eINSTANCE.getMResourceDemand();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MInstantiableResourceDemandImpl <em>MInstantiableResourceDemand</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MInstantiableResourceDemandImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMInstantiableResourceDemand()
		 * @generated
		 */
		EClass MINSTANTIABLE_RESOURCE_DEMAND = eINSTANCE.getMInstantiableResourceDemand();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * @generated
		 */
		EReference MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE = eINSTANCE.getMInstantiableResourceDemand_Resource();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMInstantiableResourceDemand_ParameterValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MQuantifiableResourceDemandImpl <em>MQuantifiableResourceDemand</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MQuantifiableResourceDemandImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMQuantifiableResourceDemand()
		 * @generated
		 */
		EClass MQUANTIFIABLE_RESOURCE_DEMAND = eINSTANCE.getMQuantifiableResourceDemand();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * @generated
		 */
		EReference MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE = eINSTANCE.getMQuantifiableResourceDemand_Resource();

		/**
		 * The meta object literal for the '<em><b>ResourceValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE = eINSTANCE.getMQuantifiableResourceDemand_ResourceValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageFileImpl <em>MMESPSWPPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMMESPSWPPackageFile()
		 * @generated
		 */
		EClass MMESPSWP_PACKAGE_FILE = eINSTANCE.getMMESPSWPPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageElementImpl <em>MMESPSWPPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MMESPSWPPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMMESPSWPPackageElement()
		 * @generated
		 */
		EClass MMESPSWP_PACKAGE_ELEMENT = eINSTANCE.getMMESPSWPPackageElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchImpl <em>MParameterSWPSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMParameterSWPSPSwitch()
		 * @generated
		 */
		EClass MPARAMETER_SWPSP_SWITCH = eINSTANCE.getMParameterSWPSPSwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPARAMETER_SWPSP_SWITCH__CASES = eINSTANCE.getMParameterSWPSPSwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchCaseImpl <em>MParameterSWPSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MParameterSWPSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMParameterSWPSPSwitchCase()
		 * @generated
		 */
		EClass MPARAMETER_SWPSP_SWITCH_CASE = eINSTANCE.getMParameterSWPSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM = eINSTANCE.getMParameterSWPSPSwitchCase_Platform();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE = eINSTANCE.getMParameterSWPSPSwitchCase_DefaultValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchImpl <em>MBooleanParamSWPSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMBooleanParamSWPSPSwitch()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_SWPSP_SWITCH = eINSTANCE.getMBooleanParamSWPSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchCaseImpl <em>MBooleanParamSWPSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MBooleanParamSWPSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMBooleanParamSWPSPSwitchCase()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_SWPSP_SWITCH_CASE = eINSTANCE.getMBooleanParamSWPSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchImpl <em>MStringParamSWPSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMStringParamSWPSPSwitch()
		 * @generated
		 */
		EClass MSTRING_PARAM_SWPSP_SWITCH = eINSTANCE.getMStringParamSWPSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchCaseImpl <em>MStringParamSWPSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MStringParamSWPSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMStringParamSWPSPSwitchCase()
		 * @generated
		 */
		EClass MSTRING_PARAM_SWPSP_SWITCH_CASE = eINSTANCE.getMStringParamSWPSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchImpl <em>MIntegerParamSWPSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMIntegerParamSWPSPSwitch()
		 * @generated
		 */
		EClass MINTEGER_PARAM_SWPSP_SWITCH = eINSTANCE.getMIntegerParamSWPSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchCaseImpl <em>MIntegerParamSWPSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MIntegerParamSWPSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMIntegerParamSWPSPSwitchCase()
		 * @generated
		 */
		EClass MINTEGER_PARAM_SWPSP_SWITCH_CASE = eINSTANCE.getMIntegerParamSWPSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MINTEGER_PARAM_SWPSP_SWITCH_CASE__RANGE = eINSTANCE.getMIntegerParamSWPSPSwitchCase_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchImpl <em>MEnumParamSWPSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMEnumParamSWPSPSwitch()
		 * @generated
		 */
		EClass MENUM_PARAM_SWPSP_SWITCH = eINSTANCE.getMEnumParamSWPSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchCaseImpl <em>MEnumParamSWPSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MEnumParamSWPSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMEnumParamSWPSPSwitchCase()
		 * @generated
		 */
		EClass MENUM_PARAM_SWPSP_SWITCH_CASE = eINSTANCE.getMEnumParamSWPSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchImpl <em>MRealParamSWPSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMRealParamSWPSPSwitch()
		 * @generated
		 */
		EClass MREAL_PARAM_SWPSP_SWITCH = eINSTANCE.getMRealParamSWPSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchCaseImpl <em>MRealParamSWPSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.MRealParamSWPSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpPackageImpl#getMRealParamSWPSPSwitchCase()
		 * @generated
		 */
		EClass MREAL_PARAM_SWPSP_SWITCH_CASE = eINSTANCE.getMRealParamSWPSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MREAL_PARAM_SWPSP_SWITCH_CASE__RANGE = eINSTANCE.getMRealParamSWPSPSwitchCase_Range();

	}

}