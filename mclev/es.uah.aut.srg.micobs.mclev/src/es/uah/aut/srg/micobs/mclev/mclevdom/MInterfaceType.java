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

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

/**
 * A representation of an interface type as defined by a domain.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType#getInherits <em>Inherits</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMInterfaceType()
 * @model
 * @generated
 */
public interface MInterfaceType extends MCommonReferenceableObj {
	/**
	 * Returns the list of interface types from which this one inherits.
	 * @return the list of inherited interface types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMInterfaceType_Inherits()
	 * @model
	 * @generated
	 */
	EList<MInterfaceType> getInherits();

}