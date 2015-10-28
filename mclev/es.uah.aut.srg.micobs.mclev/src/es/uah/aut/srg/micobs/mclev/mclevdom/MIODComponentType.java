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
package es.uah.aut.srg.micobs.mclev.mclevdom;

import es.uah.aut.srg.micobs.system.MLanguage;


/**
 * A representation of a regular, i.e. non abstract, component type defined
 * within an implementation oriented domain.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODComponentType()
 * @model
 * @generated
 */
public interface MIODComponentType extends MIODAbstractComponentType {

	/**
	 * Returns the programming language in which the main API of the component
	 * is defined.
	 * @return the programming language of the component.
	 * @see #setLanguage(MLanguage)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODComponentType_Language()
	 * @model required="true"
	 * @generated
	 */
	MLanguage getLanguage();

	/**
	 * Sets the programming language of the component.
	 * @param value the new programming language of the component.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(MLanguage value);
}