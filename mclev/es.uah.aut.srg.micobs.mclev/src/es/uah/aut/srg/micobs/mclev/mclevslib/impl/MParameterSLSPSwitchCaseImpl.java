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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * An implementation of the model object '<em><b>MParameterSLSPSwitchCase</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchCaseImpl#getDefaultValue <em>DefaultValue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchCaseImpl#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MParameterSLSPSwitchCaseImpl extends EObjectImpl implements MParameterSLSPSwitchCase {
	/**
	 * The cached value of the '{@link #getDefaultValue() <em>DefaultValue</em>}' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression defaultValue;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference.
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected MServiceLibrarySupportedPlatform platform;

	/**
	 * @generated
	 */
	protected MParameterSLSPSwitchCaseImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevslibPackage.Literals.MPARAMETER_SLSP_SWITCH_CASE;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getDefaultValue() {
		return defaultValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(MParameterValueExpression newDefaultValue, NotificationChain msgs) {
		MParameterValueExpression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setDefaultValue(MParameterValueExpression newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * @generated
	 */
	public MServiceLibrarySupportedPlatform getPlatform() {
		if (platform != null && platform.eIsProxy()) {
			InternalEObject oldPlatform = (InternalEObject)platform;
			platform = (MServiceLibrarySupportedPlatform)eResolveProxy(oldPlatform);
			if (platform != oldPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__PLATFORM, oldPlatform, platform));
			}
		}
		return platform;
	}

	/**
	 * @generated
	 */
	public MServiceLibrarySupportedPlatform basicGetPlatform() {
		return platform;
	}

	/**
	 * @generated
	 */
	public void setPlatform(MServiceLibrarySupportedPlatform newPlatform) {
		MServiceLibrarySupportedPlatform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__PLATFORM, oldPlatform, platform));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE:
				return getDefaultValue();
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__PLATFORM:
				if (resolve) return getPlatform();
				return basicGetPlatform();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE:
				setDefaultValue((MParameterValueExpression)newValue);
				return;
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__PLATFORM:
				setPlatform((MServiceLibrarySupportedPlatform)newValue);
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
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE:
				setDefaultValue((MParameterValueExpression)null);
				return;
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__PLATFORM:
				setPlatform((MServiceLibrarySupportedPlatform)null);
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
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE:
				return defaultValue != null;
			case mclevslibPackage.MPARAMETER_SLSP_SWITCH_CASE__PLATFORM:
				return platform != null;
		}
		return super.eIsSet(featureID);
	}

}