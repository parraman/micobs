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
 * A representation of an invoke message defined within an EDROOM protocol.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage#getReplies <em>Replies</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMInvokeMessage()
 * @model
 * @generated
 */
public interface EDROOMInvokeMessage extends EDROOMMessage {
	/**
	 * Returns the list of reply messages that can be received when invoking this message.
	 * @return the list of reply messages.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMInvokeMessage_Replies()
	 * @model required="true"
	 * @generated
	 */
	EList<EDROOMReplyMessage> getReplies();

}
