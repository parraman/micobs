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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MDriverSwPackage</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getCtools <em>Ctools</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MDriverSwPackageImpl#getSupportedPlatforms <em>Supported Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDriverSwPackageImpl extends MMESPSWPPackageElementImpl implements MDriverSwPackage {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MAbstractSwPackage> inherits;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackageProvidedInterface> provides;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackage> extends_;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * The cached value of the '{@link #getCtools() <em>Ctools</em>}' reference list.
	 * @see #getCtools()
	 * @generated
	 * @ordered
	 */
	protected EList<MConstructionTool> ctools;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackageRequiredInterface> requires;

	/**
	 * The cached value of the '{@link #getSupportedPlatforms() <em>Supported Platforms</em>}' containment reference list.
	 * @see #getSupportedPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackageSupportedPlatform> supportedPlatforms;

	/**
	 * @generated
	 */
	protected MDriverSwPackageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MDRIVER_SW_PACKAGE;
	}

	/**
	 * @generated
	 */
	public EList<MAbstractSwPackage> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAbstractSwPackage>(MAbstractSwPackage.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MSwPackageProvidedInterface> getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentEList<MSwPackageProvidedInterface>(MSwPackageProvidedInterface.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES);
		}
		return provides;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	public EList<MSwPackage> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MSwPackage>(MSwPackage.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	public EList<MConstructionTool> getCtools() {
		if (ctools == null) {
			ctools = new EObjectResolvingEList<MConstructionTool>(MConstructionTool.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__CTOOLS);
		}
		return ctools;
	}

	/**
	 * @generated
	 */
	public EList<MSwPackageRequiredInterface> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<MSwPackageRequiredInterface>(MSwPackageRequiredInterface.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MSwPackageSupportedPlatform> getSupportedPlatforms() {
		if (supportedPlatforms == null) {
			supportedPlatforms = new EObjectContainmentEList<MSwPackageSupportedPlatform>(MSwPackageSupportedPlatform.class, this, mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS);
		}
		return supportedPlatforms;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
			case mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS:
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
			case mespswpPackage.MDRIVER_SW_PACKAGE__INHERITS:
				return getInherits();
			case mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES:
				return getProvides();
			case mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS:
				return getParameters();
			case mespswpPackage.MDRIVER_SW_PACKAGE__EXTENDS:
				return getExtends();
			case mespswpPackage.MDRIVER_SW_PACKAGE__LANGUAGES:
				return getLanguages();
			case mespswpPackage.MDRIVER_SW_PACKAGE__CTOOLS:
				return getCtools();
			case mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES:
				return getRequires();
			case mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS:
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
			case mespswpPackage.MDRIVER_SW_PACKAGE__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAbstractSwPackage>)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends MSwPackageProvidedInterface>)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MSwPackage>)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__CTOOLS:
				getCtools().clear();
				getCtools().addAll((Collection<? extends MConstructionTool>)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSwPackageRequiredInterface>)newValue);
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS:
				getSupportedPlatforms().clear();
				getSupportedPlatforms().addAll((Collection<? extends MSwPackageSupportedPlatform>)newValue);
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
			case mespswpPackage.MDRIVER_SW_PACKAGE__INHERITS:
				getInherits().clear();
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES:
				getProvides().clear();
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS:
				getParameters().clear();
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__EXTENDS:
				getExtends().clear();
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__LANGUAGES:
				getLanguages().clear();
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__CTOOLS:
				getCtools().clear();
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES:
				getRequires().clear();
				return;
			case mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS:
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
			case mespswpPackage.MDRIVER_SW_PACKAGE__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES:
				return provides != null && !provides.isEmpty();
			case mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case mespswpPackage.MDRIVER_SW_PACKAGE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mespswpPackage.MDRIVER_SW_PACKAGE__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case mespswpPackage.MDRIVER_SW_PACKAGE__CTOOLS:
				return ctools != null && !ctools.isEmpty();
			case mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS:
				return supportedPlatforms != null && !supportedPlatforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MAbstractSwPackage.class) {
			switch (derivedFeatureID) {
				case mespswpPackage.MDRIVER_SW_PACKAGE__INHERITS: return mespswpPackage.MABSTRACT_SW_PACKAGE__INHERITS;
				case mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES: return mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES;
				case mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS: return mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == MSwPackage.class) {
			switch (derivedFeatureID) {
				case mespswpPackage.MDRIVER_SW_PACKAGE__EXTENDS: return mespswpPackage.MSW_PACKAGE__EXTENDS;
				case mespswpPackage.MDRIVER_SW_PACKAGE__LANGUAGES: return mespswpPackage.MSW_PACKAGE__LANGUAGES;
				case mespswpPackage.MDRIVER_SW_PACKAGE__CTOOLS: return mespswpPackage.MSW_PACKAGE__CTOOLS;
				case mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES: return mespswpPackage.MSW_PACKAGE__REQUIRES;
				case mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS: return mespswpPackage.MSW_PACKAGE__SUPPORTED_PLATFORMS;
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
		if (baseClass == MAbstractSwPackage.class) {
			switch (baseFeatureID) {
				case mespswpPackage.MABSTRACT_SW_PACKAGE__INHERITS: return mespswpPackage.MDRIVER_SW_PACKAGE__INHERITS;
				case mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES: return mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES;
				case mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS: return mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == MSwPackage.class) {
			switch (baseFeatureID) {
				case mespswpPackage.MSW_PACKAGE__EXTENDS: return mespswpPackage.MDRIVER_SW_PACKAGE__EXTENDS;
				case mespswpPackage.MSW_PACKAGE__LANGUAGES: return mespswpPackage.MDRIVER_SW_PACKAGE__LANGUAGES;
				case mespswpPackage.MSW_PACKAGE__CTOOLS: return mespswpPackage.MDRIVER_SW_PACKAGE__CTOOLS;
				case mespswpPackage.MSW_PACKAGE__REQUIRES: return mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES;
				case mespswpPackage.MSW_PACKAGE__SUPPORTED_PLATFORMS: return mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}