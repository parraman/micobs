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
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MOperatingSystemAPI</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemAPIImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemAPIImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemAPIImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOperatingSystemAPIImpl extends MPDLPackageElementImpl implements MOperatingSystemAPI {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MOperatingSystemAPI> inherits;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected MLanguage language;

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
	protected MOperatingSystemAPIImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MOPERATING_SYSTEM_API;
	}

	/**
	 * @generated
	 */
	public EList<MOperatingSystemAPI> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MOperatingSystemAPI>(MOperatingSystemAPI.class, this, pdlPackage.MOPERATING_SYSTEM_API__INHERITS);
		}
		return inherits;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MOPERATING_SYSTEM_API__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MOPERATING_SYSTEM_API__LANGUAGE, oldLanguage, language));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MOPERATING_SYSTEM_API__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MOPERATING_SYSTEM_API__PARAMETERS:
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
			case pdlPackage.MOPERATING_SYSTEM_API__INHERITS:
				return getInherits();
			case pdlPackage.MOPERATING_SYSTEM_API__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case pdlPackage.MOPERATING_SYSTEM_API__PARAMETERS:
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
			case pdlPackage.MOPERATING_SYSTEM_API__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MOperatingSystemAPI>)newValue);
				return;
			case pdlPackage.MOPERATING_SYSTEM_API__LANGUAGE:
				setLanguage((MLanguage)newValue);
				return;
			case pdlPackage.MOPERATING_SYSTEM_API__PARAMETERS:
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
			case pdlPackage.MOPERATING_SYSTEM_API__INHERITS:
				getInherits().clear();
				return;
			case pdlPackage.MOPERATING_SYSTEM_API__LANGUAGE:
				setLanguage((MLanguage)null);
				return;
			case pdlPackage.MOPERATING_SYSTEM_API__PARAMETERS:
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
			case pdlPackage.MOPERATING_SYSTEM_API__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case pdlPackage.MOPERATING_SYSTEM_API__LANGUAGE:
				return language != null;
			case pdlPackage.MOPERATING_SYSTEM_API__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
