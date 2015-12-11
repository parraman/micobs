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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotFactory
 * @model kind="package"
 * @generated
 */
public interface edroomprotPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "edroomprot";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/domain/edroom/edroomprot";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev.domain.edroom";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	edroomprotPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageElementImpl <em>EDROOMPROTPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMPROTPackageElement()
	 * @generated
	 */
	int EDROOMPROT_PACKAGE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>ReferencedElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_ELEMENT__REFERENCED_ELEMENT = commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>EDROOMPROTPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMProtocolImpl <em>EDROOMProtocol</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMProtocolImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMProtocol()
	 * @generated
	 */
	int EDROOM_PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL__VERSION = EDROOMPROT_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL__NAME = EDROOMPROT_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL__URI = EDROOMPROT_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>ReferencedElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL__REFERENCED_ELEMENT = EDROOMPROT_PACKAGE_ELEMENT__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>InputMessages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL__INPUT_MESSAGES = EDROOMPROT_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OutputMessages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL__OUTPUT_MESSAGES = EDROOMPROT_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL__EXTENDS = EDROOMPROT_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EDROOMProtocol</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_PROTOCOL_FEATURE_COUNT = EDROOMPROT_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMMessageImpl <em>EDROOMMessage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMMessageImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMMessage()
	 * @generated
	 */
	int EDROOM_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_MESSAGE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>DataClass</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_MESSAGE__DATA_CLASS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMMessage</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_MESSAGE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMSendMessageImpl <em>EDROOMSendMessage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMSendMessageImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMSendMessage()
	 * @generated
	 */
	int EDROOM_SEND_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_SEND_MESSAGE__NAME = EDROOM_MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>DataClass</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_SEND_MESSAGE__DATA_CLASS = EDROOM_MESSAGE__DATA_CLASS;

	/**
	 * The number of structural features of the '<em>EDROOMSendMessage</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_SEND_MESSAGE_FEATURE_COUNT = EDROOM_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMInvokeMessageImpl <em>EDROOMInvokeMessage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMInvokeMessageImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMInvokeMessage()
	 * @generated
	 */
	int EDROOM_INVOKE_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_INVOKE_MESSAGE__NAME = EDROOM_MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>DataClass</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_INVOKE_MESSAGE__DATA_CLASS = EDROOM_MESSAGE__DATA_CLASS;

	/**
	 * The feature id for the '<em><b>Replies</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_INVOKE_MESSAGE__REPLIES = EDROOM_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMInvokeMessage</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_INVOKE_MESSAGE_FEATURE_COUNT = EDROOM_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMReplyMessageImpl <em>EDROOMReplyMessage</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMReplyMessageImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMReplyMessage()
	 * @generated
	 */
	int EDROOM_REPLY_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_REPLY_MESSAGE__NAME = EDROOM_MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>DataClass</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_REPLY_MESSAGE__DATA_CLASS = EDROOM_MESSAGE__DATA_CLASS;

	/**
	 * The number of structural features of the '<em>EDROOMReplyMessage</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_REPLY_MESSAGE_FEATURE_COUNT = EDROOM_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageFileImpl <em>EDROOMPROTPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMPROTPackageFile()
	 * @generated
	 */
	int EDROOMPROT_PACKAGE_FILE = 5;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>EDROOMPROTPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOMPROT_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol <em>EDROOMProtocol</em>}'.
	 * @return the meta object for class '<em>EDROOMProtocol</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol
	 * @generated
	 */
	EClass getEDROOMProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getInputMessages <em>InputMessages</em>}'.
	 * @return the meta object for the containment reference list '<em>InputMessages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getInputMessages()
	 * @see #getEDROOMProtocol()
	 * @generated
	 */
	EReference getEDROOMProtocol_InputMessages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getOutputMessages <em>OutputMessages</em>}'.
	 * @return the meta object for the containment reference list '<em>OutputMessages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getOutputMessages()
	 * @see #getEDROOMProtocol()
	 * @generated
	 */
	EReference getEDROOMProtocol_OutputMessages();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getExtends()
	 * @see #getEDROOMProtocol()
	 * @generated
	 */
	EReference getEDROOMProtocol_Extends();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage <em>EDROOMMessage</em>}'.
	 * @return the meta object for class '<em>EDROOMMessage</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage
	 * @generated
	 */
	EClass getEDROOMMessage();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage#getDataClass <em>DataClass</em>}'.
	 * @return the meta object for the reference '<em>DataClass</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage#getDataClass()
	 * @see #getEDROOMMessage()
	 * @generated
	 */
	EReference getEDROOMMessage_DataClass();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage <em>EDROOMSendMessage</em>}'.
	 * @return the meta object for class '<em>EDROOMSendMessage</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage
	 * @generated
	 */
	EClass getEDROOMSendMessage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage <em>EDROOMInvokeMessage</em>}'.
	 * @return the meta object for class '<em>EDROOMInvokeMessage</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage
	 * @generated
	 */
	EClass getEDROOMInvokeMessage();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage#getReplies <em>Replies</em>}'.
	 * @return the meta object for the reference list '<em>Replies</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage#getReplies()
	 * @see #getEDROOMInvokeMessage()
	 * @generated
	 */
	EReference getEDROOMInvokeMessage_Replies();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage <em>EDROOMReplyMessage</em>}'.
	 * @return the meta object for class '<em>EDROOMReplyMessage</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage
	 * @generated
	 */
	EClass getEDROOMReplyMessage();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile <em>EDROOMPROTPackageFile</em>}'.
	 * @return the meta object for class '<em>EDROOMPROTPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile
	 * @generated
	 */
	EClass getEDROOMPROTPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageElement <em>EDROOMPROTPackageElement</em>}'.
	 * @return the meta object for class '<em>EDROOMPROTPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageElement
	 * @generated
	 */
	EClass getEDROOMPROTPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	edroomprotFactory getedroomprotFactory();

	/**
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMProtocolImpl <em>EDROOMProtocol</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMProtocolImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMProtocol()
		 * @generated
		 */
		EClass EDROOM_PROTOCOL = eINSTANCE.getEDROOMProtocol();

		/**
		 * The meta object literal for the '<em><b>InputMessages</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference EDROOM_PROTOCOL__INPUT_MESSAGES = eINSTANCE.getEDROOMProtocol_InputMessages();

		/**
		 * The meta object literal for the '<em><b>OutputMessages</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference EDROOM_PROTOCOL__OUTPUT_MESSAGES = eINSTANCE.getEDROOMProtocol_OutputMessages();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference EDROOM_PROTOCOL__EXTENDS = eINSTANCE.getEDROOMProtocol_Extends();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMMessageImpl <em>EDROOMMessage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMMessageImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMMessage()
		 * @generated
		 */
		EClass EDROOM_MESSAGE = eINSTANCE.getEDROOMMessage();

		/**
		 * The meta object literal for the '<em><b>DataClass</b></em>' reference feature.
		 * @generated
		 */
		EReference EDROOM_MESSAGE__DATA_CLASS = eINSTANCE.getEDROOMMessage_DataClass();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMSendMessageImpl <em>EDROOMSendMessage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMSendMessageImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMSendMessage()
		 * @generated
		 */
		EClass EDROOM_SEND_MESSAGE = eINSTANCE.getEDROOMSendMessage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMInvokeMessageImpl <em>EDROOMInvokeMessage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMInvokeMessageImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMInvokeMessage()
		 * @generated
		 */
		EClass EDROOM_INVOKE_MESSAGE = eINSTANCE.getEDROOMInvokeMessage();

		/**
		 * The meta object literal for the '<em><b>Replies</b></em>' reference list feature.
		 * @generated
		 */
		EReference EDROOM_INVOKE_MESSAGE__REPLIES = eINSTANCE.getEDROOMInvokeMessage_Replies();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMReplyMessageImpl <em>EDROOMReplyMessage</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMReplyMessageImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMReplyMessage()
		 * @generated
		 */
		EClass EDROOM_REPLY_MESSAGE = eINSTANCE.getEDROOMReplyMessage();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageFileImpl <em>EDROOMPROTPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMPROTPackageFile()
		 * @generated
		 */
		EClass EDROOMPROT_PACKAGE_FILE = eINSTANCE.getEDROOMPROTPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageElementImpl <em>EDROOMPROTPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMPROTPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotPackageImpl#getEDROOMPROTPackageElement()
		 * @generated
		 */
		EClass EDROOMPROT_PACKAGE_ELEMENT = eINSTANCE.getEDROOMPROTPackageElement();

	}

}
