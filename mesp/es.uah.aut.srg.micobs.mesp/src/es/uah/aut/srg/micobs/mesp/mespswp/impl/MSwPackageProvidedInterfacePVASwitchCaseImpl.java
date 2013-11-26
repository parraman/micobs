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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MSwPackageProvidedInterfacePVASwitchCase</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchCaseImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVASwitchCaseImpl#getParameterValue <em>ParameterValue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSwPackageProvidedInterfacePVASwitchCaseImpl extends EObjectImpl implements MSwPackageProvidedInterfacePVASwitchCase {
	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference.
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected MSwPackageSupportedPlatform platform;

	/**
	 * The cached value of the '{@link #getParameterValue() <em>ParameterValue</em>}' containment reference.
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression parameterValue;

	/**
	 * @generated
	 */
	protected MSwPackageProvidedInterfacePVASwitchCaseImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE;
	}

	/**
	 * @generated
	 */
	public MSwPackageSupportedPlatform getPlatform() {
		if (platform != null && platform.eIsProxy()) {
			InternalEObject oldPlatform = (InternalEObject)platform;
			platform = (MSwPackageSupportedPlatform)eResolveProxy(oldPlatform);
			if (platform != oldPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM, oldPlatform, platform));
			}
		}
		return platform;
	}

	/**
	 * @generated
	 */
	public MSwPackageSupportedPlatform basicGetPlatform() {
		return platform;
	}

	/**
	 * @generated
	 */
	public void setPlatform(MSwPackageSupportedPlatform newPlatform) {
		MSwPackageSupportedPlatform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM, oldPlatform, platform));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getParameterValue() {
		return parameterValue;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetParameterValue(MParameterValueExpression newParameterValue, NotificationChain msgs) {
		MParameterValueExpression oldParameterValue = parameterValue;
		parameterValue = newParameterValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE, oldParameterValue, newParameterValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setParameterValue(MParameterValueExpression newParameterValue) {
		if (newParameterValue != parameterValue) {
			NotificationChain msgs = null;
			if (parameterValue != null)
				msgs = ((InternalEObject)parameterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE, null, msgs);
			if (newParameterValue != null)
				msgs = ((InternalEObject)newParameterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE, null, msgs);
			msgs = basicSetParameterValue(newParameterValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE, newParameterValue, newParameterValue));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE:
				return basicSetParameterValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM:
				if (resolve) return getPlatform();
				return basicGetPlatform();
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE:
				return getParameterValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM:
				setPlatform((MSwPackageSupportedPlatform)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE:
				setParameterValue((MParameterValueExpression)newValue);
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
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM:
				setPlatform((MSwPackageSupportedPlatform)null);
				return;
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE:
				setParameterValue((MParameterValueExpression)null);
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
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM:
				return platform != null;
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE:
				return parameterValue != null;
		}
		return super.eIsSet(featureID);
	}

}