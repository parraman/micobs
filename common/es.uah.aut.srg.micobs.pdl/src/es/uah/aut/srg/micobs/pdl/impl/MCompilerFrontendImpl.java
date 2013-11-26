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
package es.uah.aut.srg.micobs.pdl.impl;

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
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MCompilerFrontend</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerFrontendImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerFrontendImpl#getArchitectures <em>Architectures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCompilerFrontendImpl extends MCommonReferenceableObjImpl implements MCompilerFrontend {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected MLanguage language;

	/**
	 * The cached value of the '{@link #getArchitectures() <em>Architectures</em>}' reference list.
	 * @see #getArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<MArchitecture> architectures;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * @generated
	 */
	protected MCompilerFrontendImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MCOMPILER_FRONTEND;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MCOMPILER_FRONTEND__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MCOMPILER_FRONTEND__LANGUAGE, oldLanguage, language));
	}

	/**
	 * @generated
	 */
	public EList<MArchitecture> getArchitectures() {
		if (architectures == null) {
			architectures = new EObjectResolvingEList<MArchitecture>(MArchitecture.class, this, pdlPackage.MCOMPILER_FRONTEND__ARCHITECTURES);
		}
		return architectures;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MCOMPILER_FRONTEND__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MCOMPILER_FRONTEND__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pdlPackage.MCOMPILER_FRONTEND__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case pdlPackage.MCOMPILER_FRONTEND__ARCHITECTURES:
				return getArchitectures();
			case pdlPackage.MCOMPILER_FRONTEND__PARAMETERS:
				return getParameters();
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
			case pdlPackage.MCOMPILER_FRONTEND__LANGUAGE:
				setLanguage((MLanguage)newValue);
				return;
			case pdlPackage.MCOMPILER_FRONTEND__ARCHITECTURES:
				getArchitectures().clear();
				getArchitectures().addAll((Collection<? extends MArchitecture>)newValue);
				return;
			case pdlPackage.MCOMPILER_FRONTEND__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
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
			case pdlPackage.MCOMPILER_FRONTEND__LANGUAGE:
				setLanguage((MLanguage)null);
				return;
			case pdlPackage.MCOMPILER_FRONTEND__ARCHITECTURES:
				getArchitectures().clear();
				return;
			case pdlPackage.MCOMPILER_FRONTEND__PARAMETERS:
				getParameters().clear();
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
			case pdlPackage.MCOMPILER_FRONTEND__LANGUAGE:
				return language != null;
			case pdlPackage.MCOMPILER_FRONTEND__ARCHITECTURES:
				return architectures != null && !architectures.isEmpty();
			case pdlPackage.MCOMPILER_FRONTEND__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
