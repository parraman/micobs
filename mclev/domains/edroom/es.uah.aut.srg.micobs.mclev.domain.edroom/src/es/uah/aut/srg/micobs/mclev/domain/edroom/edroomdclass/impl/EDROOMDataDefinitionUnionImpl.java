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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model object '<em><b>EDROOMDataDefinitionUnion</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMDataDefinitionUnionImpl extends EDROOMDataDefinitionImpl implements EDROOMDataDefinitionUnion {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMDataDefinitionUnionElement> elements;

	/**
	 * @generated
	 */
	protected EDROOMDataDefinitionUnionImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomdclassPackage.Literals.EDROOM_DATA_DEFINITION_UNION;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMDataDefinitionUnionElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<EDROOMDataDefinitionUnionElement>(EDROOMDataDefinitionUnionElement.class, this, edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION__ELEMENTS:
				return getElements();
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EDROOMDataDefinitionUnionElement>)newValue);
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION__ELEMENTS:
				getElements().clear();
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
			case edroomdclassPackage.EDROOM_DATA_DEFINITION_UNION__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
