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
package es.uah.aut.srg.micobs.mclev.mclevslib.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MService Library</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl#getSupportedPlatforms <em>SupportedPlatforms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MServiceLibraryImpl extends MMCLEVSLIBPackageElementImpl implements MServiceLibrary {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MAbstractServiceLibrary> inherits;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<MServiceLibraryProvidedSAI> provides;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<MSAI> requires;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MServiceLibrary> extends_;

	/**
	 * The cached value of the '{@link #getSupportedPlatforms() <em>SupportedPlatforms</em>}' containment reference list.
	 * @see #getSupportedPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MServiceLibrarySupportedPlatform> supportedPlatforms;

	/**
	 * @generated
	 */
	protected MServiceLibraryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevslibPackage.Literals.MSERVICE_LIBRARY;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MAbstractServiceLibrary> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAbstractServiceLibrary>(MAbstractServiceLibrary.class, this, mclevslibPackage.MSERVICE_LIBRARY__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MServiceLibraryProvidedSAI> getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentEList<MServiceLibraryProvidedSAI>(MServiceLibraryProvidedSAI.class, this, mclevslibPackage.MSERVICE_LIBRARY__PROVIDES);
		}
		return provides;
	}

	/**
	 * @generated
	 */
	public EList<MSAI> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<MSAI>(MSAI.class, this, mclevslibPackage.MSERVICE_LIBRARY__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, mclevslibPackage.MSERVICE_LIBRARY__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	public EList<MServiceLibrary> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MServiceLibrary>(MServiceLibrary.class, this, mclevslibPackage.MSERVICE_LIBRARY__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public EList<MServiceLibrarySupportedPlatform> getSupportedPlatforms() {
		if (supportedPlatforms == null) {
			supportedPlatforms = new EObjectContainmentEList<MServiceLibrarySupportedPlatform>(MServiceLibrarySupportedPlatform.class, this, mclevslibPackage.MSERVICE_LIBRARY__SUPPORTED_PLATFORMS);
		}
		return supportedPlatforms;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case mclevslibPackage.MSERVICE_LIBRARY__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
			case mclevslibPackage.MSERVICE_LIBRARY__SUPPORTED_PLATFORMS:
				return ((InternalEList<?>)getSupportedPlatforms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES:
				return getAttributes();
			case mclevslibPackage.MSERVICE_LIBRARY__INHERITS:
				return getInherits();
			case mclevslibPackage.MSERVICE_LIBRARY__PROVIDES:
				return getProvides();
			case mclevslibPackage.MSERVICE_LIBRARY__REQUIRES:
				return getRequires();
			case mclevslibPackage.MSERVICE_LIBRARY__LANGUAGES:
				return getLanguages();
			case mclevslibPackage.MSERVICE_LIBRARY__EXTENDS:
				return getExtends();
			case mclevslibPackage.MSERVICE_LIBRARY__SUPPORTED_PLATFORMS:
				return getSupportedPlatforms();
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
			case mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAbstractServiceLibrary>)newValue);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends MServiceLibraryProvidedSAI>)newValue);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSAI>)newValue);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MServiceLibrary>)newValue);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				getSupportedPlatforms().addAll((Collection<? extends MServiceLibrarySupportedPlatform>)newValue);
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
			case mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__INHERITS:
				getInherits().clear();
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__PROVIDES:
				getProvides().clear();
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__REQUIRES:
				getRequires().clear();
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__LANGUAGES:
				getLanguages().clear();
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__EXTENDS:
				getExtends().clear();
				return;
			case mclevslibPackage.MSERVICE_LIBRARY__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
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
			case mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevslibPackage.MSERVICE_LIBRARY__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevslibPackage.MSERVICE_LIBRARY__PROVIDES:
				return provides != null && !provides.isEmpty();
			case mclevslibPackage.MSERVICE_LIBRARY__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mclevslibPackage.MSERVICE_LIBRARY__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case mclevslibPackage.MSERVICE_LIBRARY__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mclevslibPackage.MSERVICE_LIBRARY__SUPPORTED_PLATFORMS:
				return supportedPlatforms != null && !supportedPlatforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MAbstractServiceLibrary.class) {
			switch (derivedFeatureID) {
				case mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES: return mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES;
				case mclevslibPackage.MSERVICE_LIBRARY__INHERITS: return mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__INHERITS;
				case mclevslibPackage.MSERVICE_LIBRARY__PROVIDES: return mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MAbstractServiceLibrary.class) {
			switch (baseFeatureID) {
				case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES: return mclevslibPackage.MSERVICE_LIBRARY__ATTRIBUTES;
				case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__INHERITS: return mclevslibPackage.MSERVICE_LIBRARY__INHERITS;
				case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES: return mclevslibPackage.MSERVICE_LIBRARY__PROVIDES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}