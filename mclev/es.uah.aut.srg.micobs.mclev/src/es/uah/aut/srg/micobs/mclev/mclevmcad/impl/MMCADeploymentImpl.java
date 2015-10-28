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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * An implementation of the model object '<em><b>MMCADeployment</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl#getDeploymentAlternatives <em>DeploymentAlternatives</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl#getDeploymentPlatforms <em>DeploymentPlatforms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMCADeploymentImpl extends MMCLEVMCADPackageElementImpl implements MMCADeployment {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected MDomain domain;

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
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>AttributeValueAssignments</em>}' containment reference list.
	 * @see #getAttributeValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> attributeValueAssignments;

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
	 * The cached value of the '{@link #getDeploymentPlatforms() <em>DeploymentPlatforms</em>}' containment reference list.
	 * @see #getDeploymentPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MDeploymentPlatform> deploymentPlatforms;

	/**
	 * @generated
	 */
	protected MMCADeploymentImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MMCA_DEPLOYMENT;
	}

	/**
	 * @generated
	 */
	public MDomain getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (MDomain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MMCA_DEPLOYMENT__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * @generated
	 */
	public MDomain basicGetDomain() {
		return domain;
	}

	/**
	 * @generated
	 */
	public void setDomain(MDomain newDomain) {
		MDomain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MMCA_DEPLOYMENT__DOMAIN, oldDomain, domain));
	}

	/**
	 * @generated
	 */
	public EList<MServiceLibraryInstance> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<MServiceLibraryInstance>(MServiceLibraryInstance.class, this, mclevmcadPackage.MMCA_DEPLOYMENT__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * @generated
	 */
	public EList<MComponentInstance> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<MComponentInstance>(MComponentInstance.class, this, mclevmcadPackage.MMCA_DEPLOYMENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevmcadPackage.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	public EList<MDeploymentAlternative> getDeploymentAlternatives() {
		if (deploymentAlternatives == null) {
			deploymentAlternatives = new EObjectContainmentEList<MDeploymentAlternative>(MDeploymentAlternative.class, this, mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES);
		}
		return deploymentAlternatives;
	}

	/**
	 * @generated
	 */
	public EList<MConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<MConnection>(MConnection.class, this, mclevmcadPackage.MMCA_DEPLOYMENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * @generated
	 */
	public EList<MDeploymentPlatform> getDeploymentPlatforms() {
		if (deploymentPlatforms == null) {
			deploymentPlatforms = new EObjectContainmentEList<MDeploymentPlatform>(MDeploymentPlatform.class, this, mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS);
		}
		return deploymentPlatforms;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevmcadPackage.MMCA_DEPLOYMENT__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MMCA_DEPLOYMENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES:
				return ((InternalEList<?>)getDeploymentAlternatives()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MMCA_DEPLOYMENT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS:
				return ((InternalEList<?>)getDeploymentPlatforms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevmcadPackage.MMCA_DEPLOYMENT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case mclevmcadPackage.MMCA_DEPLOYMENT__LIBRARIES:
				return getLibraries();
			case mclevmcadPackage.MMCA_DEPLOYMENT__COMPONENTS:
				return getComponents();
			case mclevmcadPackage.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES:
				return getDeploymentAlternatives();
			case mclevmcadPackage.MMCA_DEPLOYMENT__CONNECTIONS:
				return getConnections();
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS:
				return getDeploymentPlatforms();
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
			case mclevmcadPackage.MMCA_DEPLOYMENT__DOMAIN:
				setDomain((MDomain)newValue);
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends MServiceLibraryInstance>)newValue);
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends MComponentInstance>)newValue);
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES:
				getDeploymentAlternatives().clear();
				getDeploymentAlternatives().addAll((Collection<? extends MDeploymentAlternative>)newValue);
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends MConnection>)newValue);
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS:
				getDeploymentPlatforms().clear();
				getDeploymentPlatforms().addAll((Collection<? extends MDeploymentPlatform>)newValue);
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
			case mclevmcadPackage.MMCA_DEPLOYMENT__DOMAIN:
				setDomain((MDomain)null);
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__LIBRARIES:
				getLibraries().clear();
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__COMPONENTS:
				getComponents().clear();
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES:
				getDeploymentAlternatives().clear();
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__CONNECTIONS:
				getConnections().clear();
				return;
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS:
				getDeploymentPlatforms().clear();
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
			case mclevmcadPackage.MMCA_DEPLOYMENT__DOMAIN:
				return domain != null;
			case mclevmcadPackage.MMCA_DEPLOYMENT__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case mclevmcadPackage.MMCA_DEPLOYMENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case mclevmcadPackage.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES:
				return deploymentAlternatives != null && !deploymentAlternatives.isEmpty();
			case mclevmcadPackage.MMCA_DEPLOYMENT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS:
				return deploymentPlatforms != null && !deploymentPlatforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}