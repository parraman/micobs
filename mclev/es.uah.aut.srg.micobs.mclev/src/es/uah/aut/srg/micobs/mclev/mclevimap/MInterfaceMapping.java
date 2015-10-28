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
package es.uah.aut.srg.micobs.mclev.mclevimap;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;

/**
 * A representation of an interface mapping. These mappings are instances of
 * exchange models that are used to translate two different interfaces so that
 * components can properly communicate between each other even though the
 * interfaces attached to their ports are not the same.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage#getMInterfaceMapping()
 * @model
 * @generated
 */
public interface MInterfaceMapping extends MMCLEVIMAPPackageElement {
	/**
	 * Returns the domain attached to the exchange model and thus to the
	 * interface mapping.
	 * @return the attached domain.
	 * @see #setDomain(MIODomain)
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage#getMInterfaceMapping_Domain()
	 * @model required="true"
	 * @generated
	 */
	MIODomain getDomain();

	/**
	 * Sets the domain attached to the exchange model.
	 * @param value the new attached domain.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(MIODomain value);

	/**
	 * Returns the exchange model of the interface mapping. The mapping will
	 * be an instance of this exchange model. The exchange model will be
	 * defined by the attached domain or by one of the domains it inherits.
	 * @return the exchange model of the mapping.
	 * @see #setType(MExchangeModel)
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage#getMInterfaceMapping_Type()
	 * @model required="true"
	 * @generated
	 */
	MExchangeModel getType();

	/**
	 * Sets the exchange model of the mapping. The exchange model must be
	 * defined by the attached domain or by one of the domains it inherits.
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MExchangeModel value);

	/**
	 * Returns the pair of interfaces that are translated using this mapping.
	 * @return the pair of interfaces.
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage#getMInterfaceMapping_Interfaces()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<MInterface> getInterfaces();

}