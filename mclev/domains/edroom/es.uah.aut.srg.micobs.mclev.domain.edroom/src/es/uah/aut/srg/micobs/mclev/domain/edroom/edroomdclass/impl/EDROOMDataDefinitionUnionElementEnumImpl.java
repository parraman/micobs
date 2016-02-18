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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model object '<em><b>EDROOMDataDefinitionUnionElementEnum</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMDataDefinitionUnionElementEnumImpl extends EDROOMDataDefinitionUnionElementImpl implements EDROOMDataDefinitionUnionElementEnum {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDROOMDataDefinitionEnum type;

	/**
	 * @generated
	 */
	protected EDROOMDataDefinitionUnionElementEnumImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomdclassPackage.Literals.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionEnum getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EDROOMDataDefinitionEnum)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionEnum basicGetType() {
		return type;
	}

	/**
	 * @generated
	 */
	public void setType(EDROOMDataDefinitionEnum newType) {
		EDROOMDataDefinitionEnum oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE:
				setType((EDROOMDataDefinitionEnum)newValue);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE:
				setType((EDROOMDataDefinitionEnum)null);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

}
