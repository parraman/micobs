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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;

/**
 * A representation of the a MCLEV flat deployment model target. For each
 * combination between the different deployment alternatives and platforms
 * of the attached MCLEV deployment model, the flat deployment model defines
 * a target. Each target thus defines the list of component and service library
 * instances, together with the corresponding connections, that result for the
 * given deployment alternative/platform combination.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getDeploymentPlatform <em>Deployment Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getLeafDeploymentAlternative <em>Leaf Deployment Alternative</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getComponents <em>Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCADTarget()
 * @model
 * @generated
 */
public interface MFlatMCADTarget extends EObject {
	/**
	 * Returns the deployment platform attached to the target.
	 * @return the deployment platform of the target.
	 * @see #setDeploymentPlatform(MDeploymentPlatform)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCADTarget_DeploymentPlatform()
	 * @model required="true"
	 * @generated
	 */
	MDeploymentPlatform getDeploymentPlatform();

	/**
	 * Sets the deployment platform of the target.
	 * @param value the new deployment platform of the target.
	 * @see #getDeploymentPlatform()
	 * @generated
	 */
	void setDeploymentPlatform(MDeploymentPlatform value);

	/**
	 * Returns the leaf deployment alternative attached to the target. If the
	 * deployment model does not contain any deployment alternative, there will
	 * be only one target in the flat model, and this method on that target
	 * will return <code>null</code>.
	 * @return the leaf deployment alternative of the target.
	 * @see #setLeafDeploymentAlternative(MDeploymentAlternative)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCADTarget_LeafDeploymentAlternative()
	 * @model
	 * @generated
	 */
	MDeploymentAlternative getLeafDeploymentAlternative();

	/**
	 * Sets the leaf deployment alternative that will be attached to the
	 * target.
	 * @param value the new deployment alternative of the target.
	 * @see #getLeafDeploymentAlternative()
	 * @generated
	 */
	void setLeafDeploymentAlternative(MDeploymentAlternative value);

	/**
	 * Returns the list of value assignments to the attributes of the 
	 * deployment model's domain for the given target.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCADTarget_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

	/**
	 * Returns the list of service library instances for the given target.
	 * @return the list of service library instances.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCADTarget_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<MFlatServiceLibraryInstance> getLibraries();

	/**
	 * Returns the list of component instances for the target.
	 * @return the list of component instances.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCADTarget_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<MFlatComponentInstance> getComponents();

	/**
	 * Returns the list of connections for the target.
	 * @return the list of connections.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCADTarget_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<MFlatConnection> getConnections();

}