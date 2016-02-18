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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;

/**
 * A representation of a generic message defined within an EDROOM protocol.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage#getDataClass <em>DataClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMMessage()
 * @model abstract="true"
 * @generated
 */
public interface EDROOMMessage extends MCommonReferenceableObj {
	/**
	 * Returns the class of the data attached to the message.
	 * @return the class of the message data.
	 * @see #setDataClass(EDROOMDataClass)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#getEDROOMMessage_DataClass()
	 * @model
	 * @generated
	 */
	EDROOMDataClass getDataClass();

	/**
	 * Sets the class of the data that will be attached to the message.
	 * @param value the new class of the message data.
	 * @see #getDataClass()
	 * @generated
	 */
	void setDataClass(EDROOMDataClass value);

}
