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

import org.eclipse.emf.common.util.EList;

/**
 * A representation of an EDROOM protocol.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getInputMessages <em>InputMessages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getOutputMessages <em>OutputMessages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMProtocol()
 * @model
 * @generated
 */
public interface EDROOMProtocol extends EDROOMPROTPackageElement {
	/**
	 * Returns the list of input messages defined by the protocol.
	 * @return the list of input messages.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMProtocol_InputMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDROOMMessage> getInputMessages();

	/**
	 * Returns the list of output messages defined by the protocol.
	 * @return the list of output messages.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMProtocol_OutputMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDROOMMessage> getOutputMessages();

	/**
	 * Returns the list of protocols extended by this protocol.
	 * @return the list of extended protocols.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMProtocol_Extends()
	 * @model
	 * @generated
	 */
	EList<EDROOMProtocol> getExtends();

}
