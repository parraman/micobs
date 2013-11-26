/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mesp.mespdep.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MMESPDeploymentAlternative</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl#getDeploymentPlatforms <em>DeploymentPlatforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl#getDeployedSwPackages <em>DeployedSwPackages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl#getDeploymentAlternatives <em>DeploymentAlternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMESPDeploymentAlternativeImpl extends MCommonReferenceableObjImpl implements MMESPDeploymentAlternative {
	/**
	 * The cached value of the '{@link #getDeploymentPlatforms() <em>DeploymentPlatforms</em>}' reference list.
	 * @see #getDeploymentPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MMESPDeploymentPlatform> deploymentPlatforms;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackageRequiredInterface> requires;

	/**
	 * The cached value of the '{@link #getDeployedSwPackages() <em>DeployedSwPackages</em>}' containment reference list.
	 * @see #getDeployedSwPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MMESPSwPackageDeployment> deployedSwPackages;

	/**
	 * The cached value of the '{@link #getDeploymentAlternatives() <em>DeploymentAlternatives</em>}' containment reference list.
	 * @see #getDeploymentAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<MMESPDeploymentAlternative> deploymentAlternatives;

	/**
	 * @generated
	 */
	protected MMESPDeploymentAlternativeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespdepPackage.Literals.MMESP_DEPLOYMENT_ALTERNATIVE;
	}

	/**
	 * @generated
	 */
	public EList<MMESPDeploymentPlatform> getDeploymentPlatforms() {
		if (deploymentPlatforms == null) {
			deploymentPlatforms = new EObjectResolvingEList<MMESPDeploymentPlatform>(MMESPDeploymentPlatform.class, this, mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS);
		}
		return deploymentPlatforms;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	public EList<MSwPackageRequiredInterface> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<MSwPackageRequiredInterface>(MSwPackageRequiredInterface.class, this, mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MMESPSwPackageDeployment> getDeployedSwPackages() {
		if (deployedSwPackages == null) {
			deployedSwPackages = new EObjectContainmentEList<MMESPSwPackageDeployment>(MMESPSwPackageDeployment.class, this, mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES);
		}
		return deployedSwPackages;
	}

	/**
	 * @generated
	 */
	public EList<MMESPDeploymentAlternative> getDeploymentAlternatives() {
		if (deploymentAlternatives == null) {
			deploymentAlternatives = new EObjectContainmentEList<MMESPDeploymentAlternative>(MMESPDeploymentAlternative.class, this, mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES);
		}
		return deploymentAlternatives;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES:
				return ((InternalEList<?>)getDeployedSwPackages()).basicRemove(otherEnd, msgs);
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				return ((InternalEList<?>)getDeploymentAlternatives()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				return getDeploymentPlatforms();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES:
				return getLanguages();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES:
				return getRequires();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES:
				return getDeployedSwPackages();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				return getDeploymentAlternatives();
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
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				getDeploymentPlatforms().clear();
				getDeploymentPlatforms().addAll((Collection<? extends MMESPDeploymentPlatform>)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSwPackageRequiredInterface>)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES:
				getDeployedSwPackages().clear();
				getDeployedSwPackages().addAll((Collection<? extends MMESPSwPackageDeployment>)newValue);
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				getDeploymentAlternatives().clear();
				getDeploymentAlternatives().addAll((Collection<? extends MMESPDeploymentAlternative>)newValue);
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
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				getDeploymentPlatforms().clear();
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES:
				getLanguages().clear();
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES:
				getRequires().clear();
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES:
				getDeployedSwPackages().clear();
				return;
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				getDeploymentAlternatives().clear();
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
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS:
				return deploymentPlatforms != null && !deploymentPlatforms.isEmpty();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES:
				return deployedSwPackages != null && !deployedSwPackages.isEmpty();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES:
				return deploymentAlternatives != null && !deploymentAlternatives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}