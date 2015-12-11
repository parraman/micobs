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

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model object '<em><b>EDROOMDataDefinitionUnionElementUnion</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMDataDefinitionUnionElementUnionImpl extends EDROOMDataDefinitionUnionElementImpl implements EDROOMDataDefinitionUnionElementUnion {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDROOMDataDefinitionUnion type;

	/**
	 * @generated
	 */
	protected EDROOMDataDefinitionUnionElementUnionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomdclassPackage.Literals.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnion getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EDROOMDataDefinitionUnion)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * @generated
	 */
	public EDROOMDataDefinitionUnion basicGetType() {
		return type;
	}

	/**
	 * @generated
	 */
	public void setType(EDROOMDataDefinitionUnion newType) {
		EDROOMDataDefinitionUnion oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE:
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE:
				setType((EDROOMDataDefinitionUnion)newValue);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE:
				setType((EDROOMDataDefinitionUnion)null);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

}
