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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MIODComponentType</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIODComponentTypeImpl extends MIODAbstractComponentTypeImpl implements MIODComponentType {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected MLanguage language;

	/**
	 * @generated
	 */
	protected MIODComponentTypeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MIOD_COMPONENT_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevdomPackage.MIOD_COMPONENT_TYPE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevdomPackage.MIOD_COMPONENT_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MIOD_COMPONENT_TYPE__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevdomPackage.MIOD_COMPONENT_TYPE__LANGUAGE:
				setLanguage((MLanguage)newValue);
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
			case mclevdomPackage.MIOD_COMPONENT_TYPE__LANGUAGE:
				setLanguage((MLanguage)null);
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
			case mclevdomPackage.MIOD_COMPONENT_TYPE__LANGUAGE:
				return language != null;
		}
		return super.eIsSet(featureID);
	}

}