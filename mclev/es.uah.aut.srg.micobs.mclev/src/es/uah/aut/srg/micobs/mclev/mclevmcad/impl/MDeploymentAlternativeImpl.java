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
package es.uah.aut.srg.micobs.mclev.mclevmcad.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * An implementation of the model object '<em><b>MDeploymentAlternative</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl#getDeploymentPlatforms <em>DeploymentPlatforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl#getDeploymentAlternatives <em>DeploymentAlternatives</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDeploymentAlternativeImpl extends MCommonReferenceableObjImpl implements MDeploymentAlternative {
	/**
	 * The cached value of the '{@link #getDeploymentPlatforms() <em>DeploymentPlatforms</em>}' reference list.
	 * @see #getDeploymentPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MDeploymentPlatform> deploymentPlatforms;

	/**
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>AttributeValueAssignments</em>}' containment reference list.
	 * @see #getAttributeValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> attributeValueAssignments;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<MServiceLibraryInstance> libraries;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<MComponentInstance> components;

	/**
	 * The cached value of the '{@link #getDeploymentAlternatives() <em>DeploymentAlternatives</em>}' containment reference list.
	 * @see #getDeploymentAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<MDeploymentAlternative> deploymentAlternatives;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<MConnection> connections;

	/**
	 * @generated
	 */
	protected MDeploymentAlternativeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MDEPLOYMENT_ALTERNATIVE;
	}

	/**
	 * @generated
	 */
	public EList<MDeploymentPlatform> getDeploymentPlatforms() {
		if (deploymentPlatforms == null) {
			deploymentPlatforms = new EObjectResolvingEList<MDeploymentPlatform>(MDeploymentPlatform.class, this, mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS);
		}
		return deploymentPlatforms;
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	public EList<MServiceLibraryInstance> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<MServiceLibraryInstance>(MServiceLibraryInstance.class, this, mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * @generated
	 */
	public EList<MComponentInstance> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<MComponentInstance>(MComponentInstance.class, this, mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__COMPONENTS);
		}
		return components;
	}

	/**
	 * @generated
	 */
	public EList<MDeploymentAlternative> getDeploymentAlternatives() {
		if (deploymentAlternatives == null) {
			deploymentAlternatives = new EObjectContainmentEList<MDeploymentAlternative>(MDeploymentAlternative.class, this, mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES);
		}
		return deploymentAlternatives;
	}

	/**
	 * @generated
	 */
	public EList<MConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<MConnection>(MConnection.class, this, mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				return ((InternalEList<?>)getDeploymentAlternatives()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				return getDeploymentPlatforms();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__LIBRARIES:
				return getLibraries();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__COMPONENTS:
				return getComponents();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				return getDeploymentAlternatives();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__CONNECTIONS:
				return getConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				getDeploymentPlatforms().clear();
				getDeploymentPlatforms().addAll((Collection<? extends MDeploymentPlatform>)newValue);
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends MServiceLibraryInstance>)newValue);
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends MComponentInstance>)newValue);
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				getDeploymentAlternatives().clear();
				getDeploymentAlternatives().addAll((Collection<? extends MDeploymentAlternative>)newValue);
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends MConnection>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				getDeploymentPlatforms().clear();
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__LIBRARIES:
				getLibraries().clear();
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__COMPONENTS:
				getComponents().clear();
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				getDeploymentAlternatives().clear();
				return;
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__CONNECTIONS:
				getConnections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				return deploymentPlatforms != null && !deploymentPlatforms.isEmpty();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__COMPONENTS:
				return components != null && !components.isEmpty();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				return deploymentAlternatives != null && !deploymentAlternatives.isEmpty();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}