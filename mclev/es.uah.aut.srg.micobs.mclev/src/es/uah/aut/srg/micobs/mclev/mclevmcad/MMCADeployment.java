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
package es.uah.aut.srg.micobs.mclev.mclevmcad;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;

/**
 * A representation of an MCAD model. An MCAD model component architecture
 * and the service libraries that will be deployed, together with the list
 * of deployment platforms. The instantiated items can be organized in
 * different deployment alternatives.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getComponents <em>Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDeploymentAlternatives <em>DeploymentAlternatives</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getConnections <em>Connections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDeploymentPlatforms <em>DeploymentPlatforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment()
 * @model
 * @generated
 */
public interface MMCADeployment extends MMCLEVMCADPackageElement {
	/**
	 * Returns the domain to which the deployment is attached.
	 * @return the attached domain.
	 * @see #setDomain(MDomain)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment_Domain()
	 * @model required="true"
	 * @generated
	 */
	MDomain getDomain();

	/**
	 * Sets the domain that will be attached to the MCAD model.
	 * @param value the new attached domain.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(MDomain value);

	/**
	 * Returns the list of service library deployed independently of the
	 * deployment platform or alternative.
	 * @return the list of deployed service libraries.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<MServiceLibraryInstance> getLibraries();

	/**
	 * Returns the list of components instantiated at the root of the MCAD
	 * model, i.e. independently of any deployment platform or alternative.
	 * @return the list of component instances.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<MComponentInstance> getComponents();

	/**
	 * Returns the list of value assignments to the attributes defined by the
	 * attached domain. These assignments may be overridden in the subsequent
	 * deployment alternatives.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

	/**
	 * Returns the list of deployment alternatives of the root deployment
	 * model.
	 * @return the list of deployment alternatives of the root deployment
	 * model.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment_DeploymentAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDeploymentAlternative> getDeploymentAlternatives();

	/**
	 * Returns the list of connections between the different component
	 * instances. These connections may be regular connections between
	 * the components deployed at the root level, or connection switches
	 * between the root components and the ones belonging to the different
	 * deployment alternatives.
	 * @return the list of connections.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<MConnection> getConnections();

	/**
	 * Returns the list of deployment platforms.
	 * @return the list of deployment platforms.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMMCADeployment_DeploymentPlatforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDeploymentPlatform> getDeploymentPlatforms();

}