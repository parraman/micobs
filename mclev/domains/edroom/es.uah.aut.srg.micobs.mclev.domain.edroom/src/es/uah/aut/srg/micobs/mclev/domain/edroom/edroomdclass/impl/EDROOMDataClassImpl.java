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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model object '<em><b>EDROOMDataClass</b></em>'.
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataClassImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataClassImpl#getInherits <em>Inherits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMDataClassImpl extends EDROOMDCLASSPackageElementImpl implements EDROOMDataClass {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMDataField> fields;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMDataDefinition> definitions;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMDataClass> inherits;

	/**
	 * @generated
	 */
	protected EDROOMDataClassImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomdclassPackage.Literals.EDROOM_DATA_CLASS;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMDataField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<EDROOMDataField>(EDROOMDataField.class, this, edroomdclassPackage.EDROOM_DATA_CLASS__FIELDS);
		}
		return fields;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMDataDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<EDROOMDataDefinition>(EDROOMDataDefinition.class, this, edroomdclassPackage.EDROOM_DATA_CLASS__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMDataClass> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<EDROOMDataClass>(EDROOMDataClass.class, this, edroomdclassPackage.EDROOM_DATA_CLASS__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_CLASS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case edroomdclassPackage.EDROOM_DATA_CLASS__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomdclassPackage.EDROOM_DATA_CLASS__FIELDS:
				return getFields();
			case edroomdclassPackage.EDROOM_DATA_CLASS__DEFINITIONS:
				return getDefinitions();
			case edroomdclassPackage.EDROOM_DATA_CLASS__INHERITS:
				return getInherits();
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
			case edroomdclassPackage.EDROOM_DATA_CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends EDROOMDataField>)newValue);
				return;
			case edroomdclassPackage.EDROOM_DATA_CLASS__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends EDROOMDataDefinition>)newValue);
				return;
			case edroomdclassPackage.EDROOM_DATA_CLASS__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends EDROOMDataClass>)newValue);
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
			case edroomdclassPackage.EDROOM_DATA_CLASS__FIELDS:
				getFields().clear();
				return;
			case edroomdclassPackage.EDROOM_DATA_CLASS__DEFINITIONS:
				getDefinitions().clear();
				return;
			case edroomdclassPackage.EDROOM_DATA_CLASS__INHERITS:
				getInherits().clear();
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
			case edroomdclassPackage.EDROOM_DATA_CLASS__FIELDS:
				return fields != null && !fields.isEmpty();
			case edroomdclassPackage.EDROOM_DATA_CLASS__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case edroomdclassPackage.EDROOM_DATA_CLASS__INHERITS:
				return inherits != null && !inherits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
