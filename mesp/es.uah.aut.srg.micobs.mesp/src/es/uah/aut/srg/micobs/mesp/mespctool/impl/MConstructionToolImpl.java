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
package es.uah.aut.srg.micobs.mesp.mespctool.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MConstructionTool</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MConstructionToolImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespctool.impl.MConstructionToolImpl#getSupportedLanguages <em>SupportedLanguages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MConstructionToolImpl extends MMESPCTOOLPackageElementImpl implements MConstructionTool {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MConstructionTool> extends_;

	/**
	 * The cached value of the '{@link #getSupportedLanguages() <em>SupportedLanguages</em>}' reference list.
	 * @see #getSupportedLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> supportedLanguages;

	/**
	 * @generated
	 */
	protected MConstructionToolImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespctoolPackage.Literals.MCONSTRUCTION_TOOL;
	}

	/**
	 * @generated
	 */
	public EList<MConstructionTool> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MConstructionTool>(MConstructionTool.class, this, mespctoolPackage.MCONSTRUCTION_TOOL__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getSupportedLanguages() {
		if (supportedLanguages == null) {
			supportedLanguages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, mespctoolPackage.MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES);
		}
		return supportedLanguages;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespctoolPackage.MCONSTRUCTION_TOOL__EXTENDS:
				return getExtends();
			case mespctoolPackage.MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES:
				return getSupportedLanguages();
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
			case mespctoolPackage.MCONSTRUCTION_TOOL__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MConstructionTool>)newValue);
				return;
			case mespctoolPackage.MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
				getSupportedLanguages().addAll((Collection<? extends MLanguage>)newValue);
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
			case mespctoolPackage.MCONSTRUCTION_TOOL__EXTENDS:
				getExtends().clear();
				return;
			case mespctoolPackage.MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES:
				getSupportedLanguages().clear();
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
			case mespctoolPackage.MCONSTRUCTION_TOOL__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mespctoolPackage.MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES:
				return supportedLanguages != null && !supportedLanguages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
