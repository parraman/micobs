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
package es.uah.aut.srg.micobs.pdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MOperatingSystem</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl#getSupportedPlatforms <em>Supported Platforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl#getSupportedOSAPIs <em>Supported OSAP Is</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOperatingSystemImpl extends MPDLPackageElementImpl implements MOperatingSystem {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MOperatingSystem> inherits;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * The cached value of the '{@link #getSupportedPlatforms() <em>SupportedPlatforms</em>}' containment reference list.
	 * @see #getSupportedPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MOSSupportedPlatform> supportedPlatforms;

	/**
	 * The cached value of the '{@link #getSupportedOSAPIs() <em>SupportedOSAPIs</em>}' containment reference list.
	 * @see #getSupportedOSAPIs()
	 * @generated
	 * @ordered
	 */
	protected EList<MOSSupportedOSAPI> supportedOSAPIs;

	/**
	 * @generated
	 */
	protected MOperatingSystemImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MOPERATING_SYSTEM;
	}

	/**
	 * @generated
	 */
	public EList<MOperatingSystem> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MOperatingSystem>(MOperatingSystem.class, this, pdlPackage.MOPERATING_SYSTEM__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, pdlPackage.MOPERATING_SYSTEM__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MOPERATING_SYSTEM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	public EList<MOSSupportedPlatform> getSupportedPlatforms() {
		if (supportedPlatforms == null) {
			supportedPlatforms = new EObjectContainmentEList<MOSSupportedPlatform>(MOSSupportedPlatform.class, this, pdlPackage.MOPERATING_SYSTEM__SUPPORTED_PLATFORMS);
		}
		return supportedPlatforms;
	}

	/**
	 * @generated
	 */
	public EList<MOSSupportedOSAPI> getSupportedOSAPIs() {
		if (supportedOSAPIs == null) {
			supportedOSAPIs = new EObjectContainmentEList<MOSSupportedOSAPI>(MOSSupportedOSAPI.class, this, pdlPackage.MOPERATING_SYSTEM__SUPPORTED_OSAP_IS);
		}
		return supportedOSAPIs;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MOPERATING_SYSTEM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_PLATFORMS:
				return ((InternalEList<?>)getSupportedPlatforms()).basicRemove(otherEnd, msgs);
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_OSAP_IS:
				return ((InternalEList<?>)getSupportedOSAPIs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pdlPackage.MOPERATING_SYSTEM__INHERITS:
				return getInherits();
			case pdlPackage.MOPERATING_SYSTEM__LANGUAGES:
				return getLanguages();
			case pdlPackage.MOPERATING_SYSTEM__PARAMETERS:
				return getParameters();
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_PLATFORMS:
				return getSupportedPlatforms();
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_OSAP_IS:
				return getSupportedOSAPIs();
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
			case pdlPackage.MOPERATING_SYSTEM__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MOperatingSystem>)newValue);
				return;
			case pdlPackage.MOPERATING_SYSTEM__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
			case pdlPackage.MOPERATING_SYSTEM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
				return;
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				getSupportedPlatforms().addAll((Collection<? extends MOSSupportedPlatform>)newValue);
				return;
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_OSAP_IS:
				getSupportedOSAPIs().clear();
				getSupportedOSAPIs().addAll((Collection<? extends MOSSupportedOSAPI>)newValue);
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
			case pdlPackage.MOPERATING_SYSTEM__INHERITS:
				getInherits().clear();
				return;
			case pdlPackage.MOPERATING_SYSTEM__LANGUAGES:
				getLanguages().clear();
				return;
			case pdlPackage.MOPERATING_SYSTEM__PARAMETERS:
				getParameters().clear();
				return;
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				return;
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_OSAP_IS:
				getSupportedOSAPIs().clear();
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
			case pdlPackage.MOPERATING_SYSTEM__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case pdlPackage.MOPERATING_SYSTEM__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case pdlPackage.MOPERATING_SYSTEM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_PLATFORMS:
				return supportedPlatforms != null && !supportedPlatforms.isEmpty();
			case pdlPackage.MOPERATING_SYSTEM__SUPPORTED_OSAP_IS:
				return supportedOSAPIs != null && !supportedOSAPIs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
