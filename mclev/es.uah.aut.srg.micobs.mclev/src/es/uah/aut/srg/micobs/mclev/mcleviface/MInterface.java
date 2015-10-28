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
package es.uah.aut.srg.micobs.mclev.mcleviface;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;

/**
 * A representation of an interface. These objects represent an interface used
 * by the component to exchange information through their ports.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mcleviface.MInterface#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage#getMInterface()
 * @model
 * @generated
 */
public interface MInterface extends MMCLEVIFACEPackageElement {
	/**
	 * Returns the list of interfaces extended by this interface.
	 * @return the list of extended interfaces.
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage#getMInterface_Extends()
	 * @model
	 * @generated
	 */
	EList<MInterface> getExtends();

	/**
	 * Returns domain to which the interface belongs.
	 * @return the attached domain.
	 * @see #setDomain(MDomain)
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage#getMInterface_Domain()
	 * @model required="true"
	 * @generated
	 */
	MDomain getDomain();

	/**
	 * Sets the domain to which the interface belongs.
	 * @param value the new attached domain.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(MDomain value);

	/**
	 * Returns the type of the interface. This type will be one of the types
	 * defined by the attached domain or by one of its inherited domains.
	 * @return the type of the interface.
	 * @see #setType(MInterfaceType)
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage#getMInterface_Type()
	 * @model required="true"
	 * @generated
	 */
	MInterfaceType getType();

	/**
	 * Sets the type of the interface. This type must be one of the types
	 * defined by the attached domain or by one of its inherited domains.
	 * @param value the new interface type.
	 * @see #getType()
	 * @generated
	 */
	void setType(MInterfaceType value);

}