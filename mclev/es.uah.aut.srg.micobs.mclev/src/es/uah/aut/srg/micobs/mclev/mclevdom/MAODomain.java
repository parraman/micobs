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

/**
 * A representation of an application-oriented domain.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getOutputIODomains <em>Output IO Domains</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getComponentTypeInstances <em>Component Type Instances</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getComponentTypes <em>Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODomain()
 * @model
 * @generated
 */
public interface MAODomain extends MDomain {
	/**
	 * Returns the list of implementation-oriented domains to which this domain
	 * has defined a proper transformation.
	 * @return the list of implementation-oriented domains that can be used as
	 * outputs for this application-oriented domain.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODomain_OutputIODomains()
	 * @model
	 * @generated
	 */
	EList<MIODomain> getOutputIODomains();

	/**
	 * Returns the list of application-oriented domains from which this domain
	 * inherits.
	 * @return the list of inherited application-oriented domains.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODomain_Inherits()
	 * @model
	 * @generated
	 */
	EList<MAODomain> getInherits();

	/**
	 * Returns the list of component type instance definitions. These objects
	 * can be used to define the minimum and maximum number of components of
	 * a given type that can be deployed on projects attached to this domain.
	 * @return the list of component type instance definitions.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODomain_ComponentTypeInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<MAODComponentTypeInstance> getComponentTypeInstances();

	/**
	 * Returns the list of component types defined for this domain.
	 * @return the list of component types included in this domain.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMAODomain_ComponentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MAODComponentType> getComponentTypes();

}