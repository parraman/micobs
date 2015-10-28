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
 * A representation of an exchange model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel#getInterfaceTypes <em>InterfaceTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel#getInherits <em>Inherits</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMExchangeModel()
 * @model
 * @generated
 */
public interface MExchangeModel extends MCommonReferenceableObj {
	/**
	 * Returns the pair of interface types supported by the exchange model.
	 * @return the pair of supported interface types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMExchangeModel_InterfaceTypes()
	 * @model lower="2"
	 * @generated
	 */
	EList<MInterfaceType> getInterfaceTypes();

	/**
	 * Returns the list of exchange models from which this model inherits.
	 * @return the list of inherited exchange models.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMExchangeModel_Inherits()
	 * @model
	 * @generated
	 */
	EList<MExchangeModel> getInherits();

}