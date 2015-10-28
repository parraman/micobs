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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;

/**
 * An implementation of the model object '<em><b>MFlatMCADTarget</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl#getDeploymentPlatform <em>DeploymentPlatform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl#getLeafDeploymentAlternative <em>LeafDeploymentAlternative</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MFlatMCADTargetImpl extends EObjectImpl implements MFlatMCADTarget {
	/**
	 * The cached value of the '{@link #getDeploymentPlatform() <em>DeploymentPlatform</em>}' reference.
	 * @see #getDeploymentPlatform()
	 * @generated
	 * @ordered
	 */
	protected MDeploymentPlatform deploymentPlatform;

	/**
	 * The cached value of the '{@link #getLeafDeploymentAlternative() <em>LeafDeploymentAlternative</em>}' reference.
	 * @see #getLeafDeploymentAlternative()
	 * @generated
	 * @ordered
	 */
	protected MDeploymentAlternative leafDeploymentAlternative;

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
	protected EList<MFlatServiceLibraryInstance> libraries;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlatComponentInstance> components;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlatConnection> connections;

	/**
	 * @generated
	 */
	protected MFlatMCADTargetImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET;
	}

	/**
	 * @generated
	 */
	public MDeploymentPlatform getDeploymentPlatform() {
		if (deploymentPlatform != null && deploymentPlatform.eIsProxy()) {
			InternalEObject oldDeploymentPlatform = (InternalEObject)deploymentPlatform;
			deploymentPlatform = (MDeploymentPlatform)eResolveProxy(oldDeploymentPlatform);
			if (deploymentPlatform != oldDeploymentPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM, oldDeploymentPlatform, deploymentPlatform));
			}
		}
		return deploymentPlatform;
	}

	/**
	 * @generated
	 */
	public MDeploymentPlatform basicGetDeploymentPlatform() {
		return deploymentPlatform;
	}

	/**
	 * @generated
	 */
	public void setDeploymentPlatform(MDeploymentPlatform newDeploymentPlatform) {
		MDeploymentPlatform oldDeploymentPlatform = deploymentPlatform;
		deploymentPlatform = newDeploymentPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM, oldDeploymentPlatform, deploymentPlatform));
	}

	/**
	 * @generated
	 */
	public MDeploymentAlternative getLeafDeploymentAlternative() {
		if (leafDeploymentAlternative != null && leafDeploymentAlternative.eIsProxy()) {
			InternalEObject oldLeafDeploymentAlternative = (InternalEObject)leafDeploymentAlternative;
			leafDeploymentAlternative = (MDeploymentAlternative)eResolveProxy(oldLeafDeploymentAlternative);
			if (leafDeploymentAlternative != oldLeafDeploymentAlternative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE, oldLeafDeploymentAlternative, leafDeploymentAlternative));
			}
		}
		return leafDeploymentAlternative;
	}

	/**
	 * @generated
	 */
	public MDeploymentAlternative basicGetLeafDeploymentAlternative() {
		return leafDeploymentAlternative;
	}

	/**
	 * @generated
	 */
	public void setLeafDeploymentAlternative(MDeploymentAlternative newLeafDeploymentAlternative) {
		MDeploymentAlternative oldLeafDeploymentAlternative = leafDeploymentAlternative;
		leafDeploymentAlternative = newLeafDeploymentAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE, oldLeafDeploymentAlternative, leafDeploymentAlternative));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevflatmcadPackage.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	public EList<MFlatServiceLibraryInstance> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<MFlatServiceLibraryInstance>(MFlatServiceLibraryInstance.class, this, mclevflatmcadPackage.MFLAT_MCAD_TARGET__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * @generated
	 */
	public EList<MFlatComponentInstance> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<MFlatComponentInstance>(MFlatComponentInstance.class, this, mclevflatmcadPackage.MFLAT_MCAD_TARGET__COMPONENTS);
		}
		return components;
	}

	/**
	 * @generated
	 */
	public EList<MFlatConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<MFlatConnection>(MFlatConnection.class, this, mclevflatmcadPackage.MFLAT_MCAD_TARGET__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__CONNECTIONS:
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
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM:
				if (resolve) return getDeploymentPlatform();
				return basicGetDeploymentPlatform();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE:
				if (resolve) return getLeafDeploymentAlternative();
				return basicGetLeafDeploymentAlternative();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LIBRARIES:
				return getLibraries();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__COMPONENTS:
				return getComponents();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__CONNECTIONS:
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
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM:
				setDeploymentPlatform((MDeploymentPlatform)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE:
				setLeafDeploymentAlternative((MDeploymentAlternative)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends MFlatServiceLibraryInstance>)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends MFlatComponentInstance>)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends MFlatConnection>)newValue);
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
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM:
				setDeploymentPlatform((MDeploymentPlatform)null);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE:
				setLeafDeploymentAlternative((MDeploymentAlternative)null);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LIBRARIES:
				getLibraries().clear();
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__COMPONENTS:
				getComponents().clear();
				return;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__CONNECTIONS:
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
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM:
				return deploymentPlatform != null;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE:
				return leafDeploymentAlternative != null;
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__COMPONENTS:
				return components != null && !components.isEmpty();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}