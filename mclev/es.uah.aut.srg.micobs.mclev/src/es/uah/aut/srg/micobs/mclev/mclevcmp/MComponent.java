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
package es.uah.aut.srg.micobs.mclev.mclevcmp;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a regular component.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getInternalPorts <em>Internal Ports</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getSupportedPlatforms <em>Supported Platforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponent()
 * @model
 * @generated
 */
public interface MComponent extends MMCLEVCMPPackageElement, MAbstractComponent {
	/**
	 * Returns the list of SAIs required by the component
	 * independently of the platform on which it is deployed.
	 * @return the list of required SAIs.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponent_Requires()
	 * @model
	 * @generated
	 */
	EList<MSAI> getRequires();

	/**
	 * Returns the list of languages in which the component is implemented
	 * independently of the platform on which it is deployed.
	 * @return the list of languages in which the component is implemented.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponent_Languages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the list of internal ports defined by the component.
	 * @return the list of internal ports of the component.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponent_InternalPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPort> getInternalPorts();

	/**
	 * Returns the list of supported platforms defined by the component.
	 * @return the list of supported platforms.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponent_SupportedPlatforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<MComponentSupportedPlatform> getSupportedPlatforms();

	/**
	 * Returns the list of internal component instances defined by the
	 * component independently of the platform on which it is deployed.
	 * @return the list of internal component instances.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponent_InternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<MInternalComponentInstance> getInternalComponents();

	/**
	 * Returns the list of connections defined among the internal component
	 * instances defined by the component.
	 * @return the list of connections.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponent_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<MInternalConnection> getConnections();

}