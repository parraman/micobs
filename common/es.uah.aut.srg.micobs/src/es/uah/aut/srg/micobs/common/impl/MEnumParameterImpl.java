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
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MEnumParameter</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterImpl#getEnumDefinition <em>Enum Definition</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MEnumParameterImpl extends MParameterImpl implements MEnumParameter {
	/**
	 * The cached value of the '{@link #getEnumDefinition() <em>EnumDefinition</em>}' reference.
	 * @see #getEnumDefinition()
	 * @generated
	 * @ordered
	 */
	protected MEnumParameterDefinition enumDefinition;

	/**
	 * @generated
	 */
	protected MEnumParameterImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MENUM_PARAMETER;
	}

	/**
	 * @generated
	 */
	public MEnumParameterDefinition getEnumDefinition() {
		if (enumDefinition != null && enumDefinition.eIsProxy()) {
			InternalEObject oldEnumDefinition = (InternalEObject)enumDefinition;
			enumDefinition = (MEnumParameterDefinition)eResolveProxy(oldEnumDefinition);
			if (enumDefinition != oldEnumDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MENUM_PARAMETER__ENUM_DEFINITION, oldEnumDefinition, enumDefinition));
			}
		}
		return enumDefinition;
	}

	/**
	 * @generated
	 */
	public MEnumParameterDefinition basicGetEnumDefinition() {
		return enumDefinition;
	}

	/**
	 * @generated
	 */
	public void setEnumDefinition(MEnumParameterDefinition newEnumDefinition) {
		MEnumParameterDefinition oldEnumDefinition = enumDefinition;
		enumDefinition = newEnumDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MENUM_PARAMETER__ENUM_DEFINITION, oldEnumDefinition, enumDefinition));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MENUM_PARAMETER__ENUM_DEFINITION:
				if (resolve) return getEnumDefinition();
				return basicGetEnumDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MENUM_PARAMETER__ENUM_DEFINITION:
				setEnumDefinition((MEnumParameterDefinition)newValue);
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
			case commonPackage.MENUM_PARAMETER__ENUM_DEFINITION:
				setEnumDefinition((MEnumParameterDefinition)null);
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
			case commonPackage.MENUM_PARAMETER__ENUM_DEFINITION:
				return enumDefinition != null;
		}
		return super.eIsSet(featureID);
	}

}