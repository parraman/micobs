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
package es.uah.aut.srg.micobs.mesp.mespswi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MSwInterface</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.impl.MSwInterfaceImpl#getProvidedResources <em>ProvidedResources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSwInterfaceImpl extends MMESPSWIPackageElementImpl implements MSwInterface {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwInterface> extends_;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected MLanguage language;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwInterface> requires;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * The cached value of the '{@link #getProvidedResources() <em>ProvidedResources</em>}' containment reference list.
	 * @see #getProvidedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<MProvidedResource> providedResources;

	/**
	 * The cached value of the '{@link #getRequiredOSAPI() <em>RequiredOSAPI</em>}' reference.
	 * @see #getRequiredOSAPI()
	 * @generated
	 * @ordered
	 */
	protected MOperatingSystemAPI requiredOSAPI;

	/**
	 * @generated
	 */
	protected MSwInterfaceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswiPackage.Literals.MSW_INTERFACE;
	}

	/**
	 * @generated
	 */
	public EList<MSwInterface> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MSwInterface>(MSwInterface.class, this, mespswiPackage.MSW_INTERFACE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public MLanguage getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (MLanguage)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswiPackage.MSW_INTERFACE__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * @generated
	 */
	public MLanguage basicGetLanguage() {
		return language;
	}

	/**
	 * @generated
	 */
	public void setLanguage(MLanguage newLanguage) {
		MLanguage oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswiPackage.MSW_INTERFACE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * @generated
	 */
	public EList<MSwInterface> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<MSwInterface>(MSwInterface.class, this, mespswiPackage.MSW_INTERFACE__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, mespswiPackage.MSW_INTERFACE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	public EList<MProvidedResource> getProvidedResources() {
		if (providedResources == null) {
			providedResources = new EObjectContainmentEList<MProvidedResource>(MProvidedResource.class, this, mespswiPackage.MSW_INTERFACE__PROVIDED_RESOURCES);
		}
		return providedResources;
	}

	/**
	 * @generated
	 */
	public MOperatingSystemAPI getRequiredOSAPI() {
		if (requiredOSAPI != null && requiredOSAPI.eIsProxy()) {
			InternalEObject oldRequiredOSAPI = (InternalEObject)requiredOSAPI;
			requiredOSAPI = (MOperatingSystemAPI)eResolveProxy(oldRequiredOSAPI);
			if (requiredOSAPI != oldRequiredOSAPI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswiPackage.MSW_INTERFACE__REQUIRED_OSAPI, oldRequiredOSAPI, requiredOSAPI));
			}
		}
		return requiredOSAPI;
	}

	/**
	 * @generated
	 */
	public MOperatingSystemAPI basicGetRequiredOSAPI() {
		return requiredOSAPI;
	}

	/**
	 * @generated
	 */
	public void setRequiredOSAPI(MOperatingSystemAPI newRequiredOSAPI) {
		MOperatingSystemAPI oldRequiredOSAPI = requiredOSAPI;
		requiredOSAPI = newRequiredOSAPI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswiPackage.MSW_INTERFACE__REQUIRED_OSAPI, oldRequiredOSAPI, requiredOSAPI));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswiPackage.MSW_INTERFACE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case mespswiPackage.MSW_INTERFACE__PROVIDED_RESOURCES:
				return ((InternalEList<?>)getProvidedResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespswiPackage.MSW_INTERFACE__EXTENDS:
				return getExtends();
			case mespswiPackage.MSW_INTERFACE__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case mespswiPackage.MSW_INTERFACE__REQUIRES:
				return getRequires();
			case mespswiPackage.MSW_INTERFACE__PARAMETERS:
				return getParameters();
			case mespswiPackage.MSW_INTERFACE__PROVIDED_RESOURCES:
				return getProvidedResources();
			case mespswiPackage.MSW_INTERFACE__REQUIRED_OSAPI:
				if (resolve) return getRequiredOSAPI();
				return basicGetRequiredOSAPI();
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
			case mespswiPackage.MSW_INTERFACE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MSwInterface>)newValue);
				return;
			case mespswiPackage.MSW_INTERFACE__LANGUAGE:
				setLanguage((MLanguage)newValue);
				return;
			case mespswiPackage.MSW_INTERFACE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSwInterface>)newValue);
				return;
			case mespswiPackage.MSW_INTERFACE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mespswiPackage.MSW_INTERFACE__PROVIDED_RESOURCES:
				getProvidedResources().clear();
				getProvidedResources().addAll((Collection<? extends MProvidedResource>)newValue);
				return;
			case mespswiPackage.MSW_INTERFACE__REQUIRED_OSAPI:
				setRequiredOSAPI((MOperatingSystemAPI)newValue);
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
			case mespswiPackage.MSW_INTERFACE__EXTENDS:
				getExtends().clear();
				return;
			case mespswiPackage.MSW_INTERFACE__LANGUAGE:
				setLanguage((MLanguage)null);
				return;
			case mespswiPackage.MSW_INTERFACE__REQUIRES:
				getRequires().clear();
				return;
			case mespswiPackage.MSW_INTERFACE__PARAMETERS:
				getParameters().clear();
				return;
			case mespswiPackage.MSW_INTERFACE__PROVIDED_RESOURCES:
				getProvidedResources().clear();
				return;
			case mespswiPackage.MSW_INTERFACE__REQUIRED_OSAPI:
				setRequiredOSAPI((MOperatingSystemAPI)null);
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
			case mespswiPackage.MSW_INTERFACE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mespswiPackage.MSW_INTERFACE__LANGUAGE:
				return language != null;
			case mespswiPackage.MSW_INTERFACE__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mespswiPackage.MSW_INTERFACE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case mespswiPackage.MSW_INTERFACE__PROVIDED_RESOURCES:
				return providedResources != null && !providedResources.isEmpty();
			case mespswiPackage.MSW_INTERFACE__REQUIRED_OSAPI:
				return requiredOSAPI != null;
		}
		return super.eIsSet(featureID);
	}

}