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
import es.uah.aut.srg.micobs.pdl.MPlatform;

/**
 * A representation of a deployment platform. It consists of a platform and a
 * set of value assignments for its possible configuration parameters.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getDeployedDevices <em>DeployedDevices</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentPlatform()
 * @model
 * @generated
 */
public interface MDeploymentPlatform extends MCommonReferenceableObj {
	/**
	 * Returns the platform of the deployment platform.
	 * @return the platform of the deployment platform.
	 * @see #setPlatform(MPlatform)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentPlatform_Platform()
	 * @model required="true"
	 * @generated
	 */
	MPlatform getPlatform();

	/**
	 * Sets the platform of the deployment platform.
	 * @param value the new platform of the deployment platform.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(MPlatform value);

	/**
	 * Returns the list of value assignments of the configuration parameters
	 * of the platform.
	 * @return the list of value assignments of the configuration parameters
	 * of the platform.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentPlatform_ParameterValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getParameterValueAssignments();

	/**
	 * Returns the list of devices deployed in the platform.
	 * @return the list of devices deployed in the platform.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeploymentPlatform_DeployedDevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDeployedDevice> getDeployedDevices();

}