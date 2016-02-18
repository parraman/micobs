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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;

/**
 * An implementation of the model <b>Factory</b>.
 *
 * @generated
 */
public class edroomprotFactoryImpl extends EFactoryImpl implements edroomprotFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static edroomprotFactory init() {
		try {
			edroomprotFactory theedroomprotFactory = (edroomprotFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mclev/domain/edroom/edroomprot");
			if (theedroomprotFactory != null) {
				return theedroomprotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new edroomprotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public edroomprotFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case edroomprotPackage.EDROOM_PROTOCOL: return createEDROOMProtocol();
			case edroomprotPackage.EDROOM_SEND_MESSAGE: return createEDROOMSendMessage();
			case edroomprotPackage.EDROOM_INVOKE_MESSAGE: return createEDROOMInvokeMessage();
			case edroomprotPackage.EDROOM_REPLY_MESSAGE: return createEDROOMReplyMessage();
			case edroomprotPackage.EDROOMPROT_PACKAGE_FILE: return createEDROOMPROTPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public EDROOMProtocol createEDROOMProtocol() {
		EDROOMProtocolImpl edroomProtocol = new EDROOMProtocolImpl();
		return edroomProtocol;
	}

	/**
	 * @generated
	 */
	public EDROOMSendMessage createEDROOMSendMessage() {
		EDROOMSendMessageImpl edroomSendMessage = new EDROOMSendMessageImpl();
		return edroomSendMessage;
	}

	/**
	 * @generated
	 */
	public EDROOMInvokeMessage createEDROOMInvokeMessage() {
		EDROOMInvokeMessageImpl edroomInvokeMessage = new EDROOMInvokeMessageImpl();
		return edroomInvokeMessage;
	}

	/**
	 * @generated
	 */
	public EDROOMReplyMessage createEDROOMReplyMessage() {
		EDROOMReplyMessageImpl edroomReplyMessage = new EDROOMReplyMessageImpl();
		return edroomReplyMessage;
	}

	/**
	 * @generated
	 */
	public EDROOMPROTPackageFile createEDROOMPROTPackageFile() {
		EDROOMPROTPackageFileImpl edroomprotPackageFile = new EDROOMPROTPackageFileImpl();
		return edroomprotPackageFile;
	}

	/**
	 * @generated
	 */
	public edroomprotPackage getedroomprotPackage() {
		return (edroomprotPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static edroomprotPackage getPackage() {
		return edroomprotPackage.eINSTANCE;
	}

}
