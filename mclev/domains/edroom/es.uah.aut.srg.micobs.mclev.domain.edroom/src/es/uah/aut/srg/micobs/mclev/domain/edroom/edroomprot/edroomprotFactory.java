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

import org.eclipse.emf.ecore.EFactory;

/**
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage
 * @generated
 */
public interface edroomprotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	edroomprotFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.edroomprotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EDROOMProtocol</em>'.
	 * @return a new object of class '<em>EDROOMProtocol</em>'.
	 * @generated
	 */
	EDROOMProtocol createEDROOMProtocol();

	/**
	 * Returns a new object of class '<em>EDROOMSendMessage</em>'.
	 * @return a new object of class '<em>EDROOMSendMessage</em>'.
	 * @generated
	 */
	EDROOMSendMessage createEDROOMSendMessage();

	/**
	 * Returns a new object of class '<em>EDROOMInvokeMessage</em>'.
	 * @return a new object of class '<em>EDROOMInvokeMessage</em>'.
	 * @generated
	 */
	EDROOMInvokeMessage createEDROOMInvokeMessage();

	/**
	 * Returns a new object of class '<em>EDROOMReplyMessage</em>'.
	 * @return a new object of class '<em>EDROOMReplyMessage</em>'.
	 * @generated
	 */
	EDROOMReplyMessage createEDROOMReplyMessage();

	/**
	 * Returns a new object of class '<em>EDROOMPROTPackageFile</em>'.
	 * @return a new object of class '<em>EDROOMPROTPackageFile</em>'.
	 * @generated
	 */
	EDROOMPROTPackageFile createEDROOMPROTPackageFile();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	edroomprotPackage getedroomprotPackage();

}
