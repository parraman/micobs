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
package es.uah.aut.srg.micobs.mclev.mclevdom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MIO Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl#getExchangeModels <em>ExchangeModels</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl#getSupportedPlatforms <em>SupportedPlatforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl#getComponentTypes <em>ComponentTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl#getComponentTypeInstances <em>ComponentTypeInstances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIODomainImpl extends MDomainImpl implements MIODomain {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MIODomain> inherits;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<MSAI> requires;

	/**
	 * The cached value of the '{@link #getExchangeModels() <em>ExchangeModels</em>}' containment reference list.
	 * @see #getExchangeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<MExchangeModel> exchangeModels;

	/**
	 * The cached value of the '{@link #getSupportedPlatforms() <em>SupportedPlatforms</em>}' containment reference list.
	 * @see #getSupportedPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MIODomainSupportedPlatform> supportedPlatforms;

	/**
	 * The cached value of the '{@link #getComponentTypes() <em>ComponentTypes</em>}' containment reference list.
	 * @see #getComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MIODAbstractComponentType> componentTypes;

	/**
	 * The cached value of the '{@link #getComponentTypeInstances() <em>ComponentTypeInstances</em>}' containment reference list.
	 * @see #getComponentTypeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<MIODComponentTypeInstance> componentTypeInstances;

	/**
	 * @generated
	 */
	protected MIODomainImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MIO_DOMAIN;
	}

	/**
	 * @generated
	 */
	public EList<MIODomain> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MIODomain>(MIODomain.class, this, mclevdomPackage.MIO_DOMAIN__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, mclevdomPackage.MIO_DOMAIN__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	public EList<MSAI> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<MSAI>(MSAI.class, this, mclevdomPackage.MIO_DOMAIN__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MExchangeModel> getExchangeModels() {
		if (exchangeModels == null) {
			exchangeModels = new EObjectContainmentEList<MExchangeModel>(MExchangeModel.class, this, mclevdomPackage.MIO_DOMAIN__EXCHANGE_MODELS);
		}
		return exchangeModels;
	}

	/**
	 * @generated
	 */
	public EList<MIODomainSupportedPlatform> getSupportedPlatforms() {
		if (supportedPlatforms == null) {
			supportedPlatforms = new EObjectContainmentEList<MIODomainSupportedPlatform>(MIODomainSupportedPlatform.class, this, mclevdomPackage.MIO_DOMAIN__SUPPORTED_PLATFORMS);
		}
		return supportedPlatforms;
	}

	/**
	 * @generated
	 */
	public EList<MIODAbstractComponentType> getComponentTypes() {
		if (componentTypes == null) {
			componentTypes = new EObjectContainmentEList<MIODAbstractComponentType>(MIODAbstractComponentType.class, this, mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPES);
		}
		return componentTypes;
	}

	/**
	 * @generated
	 */
	public EList<MIODComponentTypeInstance> getComponentTypeInstances() {
		if (componentTypeInstances == null) {
			componentTypeInstances = new EObjectContainmentEList<MIODComponentTypeInstance>(MIODComponentTypeInstance.class, this, mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPE_INSTANCES);
		}
		return componentTypeInstances;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MIO_DOMAIN__EXCHANGE_MODELS:
				return ((InternalEList<?>)getExchangeModels()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MIO_DOMAIN__SUPPORTED_PLATFORMS:
				return ((InternalEList<?>)getSupportedPlatforms()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPES:
				return ((InternalEList<?>)getComponentTypes()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				return ((InternalEList<?>)getComponentTypeInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MIO_DOMAIN__INHERITS:
				return getInherits();
			case mclevdomPackage.MIO_DOMAIN__LANGUAGES:
				return getLanguages();
			case mclevdomPackage.MIO_DOMAIN__REQUIRES:
				return getRequires();
			case mclevdomPackage.MIO_DOMAIN__EXCHANGE_MODELS:
				return getExchangeModels();
			case mclevdomPackage.MIO_DOMAIN__SUPPORTED_PLATFORMS:
				return getSupportedPlatforms();
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPES:
				return getComponentTypes();
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				return getComponentTypeInstances();
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
			case mclevdomPackage.MIO_DOMAIN__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MIODomain>)newValue);
				return;
			case mclevdomPackage.MIO_DOMAIN__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
			case mclevdomPackage.MIO_DOMAIN__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSAI>)newValue);
				return;
			case mclevdomPackage.MIO_DOMAIN__EXCHANGE_MODELS:
				getExchangeModels().clear();
				getExchangeModels().addAll((Collection<? extends MExchangeModel>)newValue);
				return;
			case mclevdomPackage.MIO_DOMAIN__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				getSupportedPlatforms().addAll((Collection<? extends MIODomainSupportedPlatform>)newValue);
				return;
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPES:
				getComponentTypes().clear();
				getComponentTypes().addAll((Collection<? extends MIODAbstractComponentType>)newValue);
				return;
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				getComponentTypeInstances().clear();
				getComponentTypeInstances().addAll((Collection<? extends MIODComponentTypeInstance>)newValue);
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
			case mclevdomPackage.MIO_DOMAIN__INHERITS:
				getInherits().clear();
				return;
			case mclevdomPackage.MIO_DOMAIN__LANGUAGES:
				getLanguages().clear();
				return;
			case mclevdomPackage.MIO_DOMAIN__REQUIRES:
				getRequires().clear();
				return;
			case mclevdomPackage.MIO_DOMAIN__EXCHANGE_MODELS:
				getExchangeModels().clear();
				return;
			case mclevdomPackage.MIO_DOMAIN__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				return;
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPES:
				getComponentTypes().clear();
				return;
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				getComponentTypeInstances().clear();
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
			case mclevdomPackage.MIO_DOMAIN__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevdomPackage.MIO_DOMAIN__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case mclevdomPackage.MIO_DOMAIN__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mclevdomPackage.MIO_DOMAIN__EXCHANGE_MODELS:
				return exchangeModels != null && !exchangeModels.isEmpty();
			case mclevdomPackage.MIO_DOMAIN__SUPPORTED_PLATFORMS:
				return supportedPlatforms != null && !supportedPlatforms.isEmpty();
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPES:
				return componentTypes != null && !componentTypes.isEmpty();
			case mclevdomPackage.MIO_DOMAIN__COMPONENT_TYPE_INSTANCES:
				return componentTypeInstances != null && !componentTypeInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}