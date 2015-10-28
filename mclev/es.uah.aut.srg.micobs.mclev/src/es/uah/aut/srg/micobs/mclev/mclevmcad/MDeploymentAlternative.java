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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;

/**
 * A representation of an MCLEV deployment alternative.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getDeploymentPlatforms <em>DeploymentPlatforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getComponents <em>Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getDeploymentAlternatives <em>DeploymentAlternatives</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentAlternative()
 * @model
 * @generated
 */
public interface MDeploymentAlternative extends MCommonReferenceableObj {
	/**
	 * Returns the list of deployment platforms attached to the alternative.
	 * @return the list of deployment platforms attached to the alternative.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentAlternative_DeploymentPlatforms()
	 * @model
	 * @generated
	 */
	EList<MDeploymentPlatform> getDeploymentPlatforms();

	/**
	 * Returns the list of value assignments to the attributes defined by the
	 * domain for the given alternative. These value assignments might be
	 * overridden by assignments made to the same attributes on any
	 * sub-alternative of this alternative.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentAlternative_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

	/**
	 * Returns the list of libraries instantiated on this particular alternative.
	 * @return the list of libraries instantiated on this particular alternative.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentAlternative_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<MServiceLibraryInstance> getLibraries();

	/**
	 * Returns the list of components instantiated on this particular alternative.
	 * @return the list of components instantiated on this particular alternative.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentAlternative_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<MComponentInstance> getComponents();

	/**
	 * Returns the list of deployment sub-alternatives to this alternative.
	 * @return the list of deployment sub-alternatives.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentAlternative_DeploymentAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDeploymentAlternative> getDeploymentAlternatives();

	/**
	 * Returns the list of connections defined in the deployment alternative.
	 * @return the list of connections defined in the deployment alternative.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentAlternative_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<MConnection> getConnections();

}