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
package es.uah.aut.srg.micobs.system.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model object '<em><b>MLanguage</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.system.impl.MLanguageImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MLanguageImpl extends MSYSTEMPackageElementImpl implements MLanguage {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> extends_;

	/**
	 * @generated
	 */
	protected MLanguageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return systemPackage.Literals.MLANGUAGE;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, systemPackage.MLANGUAGE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case systemPackage.MLANGUAGE__EXTENDS:
				return getExtends();
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
			case systemPackage.MLANGUAGE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MLanguage>)newValue);
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
			case systemPackage.MLANGUAGE__EXTENDS:
				getExtends().clear();
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
			case systemPackage.MLANGUAGE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
