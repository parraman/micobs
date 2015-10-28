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
package es.uah.aut.srg.micobs.mclev.mclevsai.impl;

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
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MSAI</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.impl.MSAIImpl#getRequiredOSAPI <em>RequiredOSAPI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSAIImpl extends MMCLEVSAIPackageElementImpl implements MSAI {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MSAI> extends_;

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
	protected EList<MSAI> requires;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

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
	protected MSAIImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevsaiPackage.Literals.MSAI;
	}

	/**
	 * @generated
	 */
	public EList<MSAI> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MSAI>(MSAI.class, this, mclevsaiPackage.MSAI__EXTENDS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevsaiPackage.MSAI__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevsaiPackage.MSAI__LANGUAGE, oldLanguage, language));
	}

	/**
	 * @generated
	 */
	public EList<MSAI> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<MSAI>(MSAI.class, this, mclevsaiPackage.MSAI__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevsaiPackage.MSAI__ATTRIBUTES);
		}
		return attributes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevsaiPackage.MSAI__REQUIRED_OSAPI, oldRequiredOSAPI, requiredOSAPI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevsaiPackage.MSAI__REQUIRED_OSAPI, oldRequiredOSAPI, requiredOSAPI));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevsaiPackage.MSAI__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevsaiPackage.MSAI__EXTENDS:
				return getExtends();
			case mclevsaiPackage.MSAI__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case mclevsaiPackage.MSAI__REQUIRES:
				return getRequires();
			case mclevsaiPackage.MSAI__ATTRIBUTES:
				return getAttributes();
			case mclevsaiPackage.MSAI__REQUIRED_OSAPI:
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
			case mclevsaiPackage.MSAI__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MSAI>)newValue);
				return;
			case mclevsaiPackage.MSAI__LANGUAGE:
				setLanguage((MLanguage)newValue);
				return;
			case mclevsaiPackage.MSAI__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSAI>)newValue);
				return;
			case mclevsaiPackage.MSAI__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevsaiPackage.MSAI__REQUIRED_OSAPI:
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
			case mclevsaiPackage.MSAI__EXTENDS:
				getExtends().clear();
				return;
			case mclevsaiPackage.MSAI__LANGUAGE:
				setLanguage((MLanguage)null);
				return;
			case mclevsaiPackage.MSAI__REQUIRES:
				getRequires().clear();
				return;
			case mclevsaiPackage.MSAI__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevsaiPackage.MSAI__REQUIRED_OSAPI:
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
			case mclevsaiPackage.MSAI__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mclevsaiPackage.MSAI__LANGUAGE:
				return language != null;
			case mclevsaiPackage.MSAI__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mclevsaiPackage.MSAI__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevsaiPackage.MSAI__REQUIRED_OSAPI:
				return requiredOSAPI != null;
		}
		return super.eIsSet(featureID);
	}

}