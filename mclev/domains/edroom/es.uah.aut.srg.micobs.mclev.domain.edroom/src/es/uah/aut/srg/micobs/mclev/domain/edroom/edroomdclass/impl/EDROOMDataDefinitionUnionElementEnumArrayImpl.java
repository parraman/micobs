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
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model object '<em><b>EDROOMDataDefinitionUnionElementEnumArray</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumArrayImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMDataDefinitionUnionElementEnumArrayImpl extends EDROOMDataDefinitionUnionElementEnumImpl implements EDROOMDataDefinitionUnionElementEnumArray {
	/**
	 * The default value of the '{@link #getElements() <em>Elements</em>}' attribute.
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' attribute.
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected int elements = ELEMENTS_EDEFAULT;

	/**
	 * @generated
	 */
	protected EDROOMDataDefinitionUnionElementEnumArrayImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomdclassPackage.Literals.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY;
	}

	/**
	 * @generated
	 */
	public int getElements() {
		return elements;
	}

	/**
	 * @generated
	 */
	public void setElements(int newElements) {
		int oldElements = elements;
		elements = newElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS, oldElements, elements));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS:
				setElements((Integer)newValue);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS:
				setElements(ELEMENTS_EDEFAULT);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS:
				return elements != ELEMENTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (elements: ");
		result.append(elements);
		result.append(')');
		return result.toString();
	}

}
