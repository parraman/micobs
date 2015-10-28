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

import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of an implementation-oriented domain.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getExchangeModels <em>ExchangeModels</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getSupportedPlatforms <em>SupportedPlatforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getComponentTypes <em>ComponentTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getComponentTypeInstances <em>ComponentTypeInstances</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain()
 * @model
 * @generated
 */
public interface MIODomain extends MDomain {
	/**
	 * Returns the list of implementation-oriented domains from which this one
	 * inherits.
	 * @return the list of inherits implementation-oriented domains.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain_Inherits()
	 * @model
	 * @generated
	 */
	EList<MIODomain> getInherits();

	/**
	 * Returns the list of languages supported by the domain. The different
	 * components defined within the domain can be implemented in one of this
	 * programming languages.
	 * @return the list of supported languages.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain_Languages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the list of Software Application Interfaces (SAIs) that are
	 * required by the domain. These SAIs shall be provided on every
	 * deployment model attached to this domain.
	 * @return the list of required SAIs.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain_Requires()
	 * @model
	 * @generated
	 */
	EList<MSAI> getRequires();

	/**
	 * Returns the list of exchange models defined by the domain.
	 * @return the list of exchange models.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain_ExchangeModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<MExchangeModel> getExchangeModels();

	/**
	 * Returns the list of platforms supported by the domain.
	 * @return the list of supported platforms.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain_SupportedPlatforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIODomainSupportedPlatform> getSupportedPlatforms();

	/**
	 * Returns the list of component types defined by the domain.
	 * @return the list of component types.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain_ComponentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIODAbstractComponentType> getComponentTypes();

	/**
	 * Returns the list of component type instance definitions. These objects
	 * can be used to define the minimum and maximum number of components of
	 * a given type that can be deployed on projects attached to this domain.
	 * @return the list of component type instance definitions.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomain_ComponentTypeInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIODComponentTypeInstance> getComponentTypeInstances();

}