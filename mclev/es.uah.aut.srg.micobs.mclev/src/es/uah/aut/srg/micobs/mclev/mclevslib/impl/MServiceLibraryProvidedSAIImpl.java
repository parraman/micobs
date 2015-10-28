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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVA;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * An implementation of the model object '<em><b>MServiceLibraryProvidedSAI</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryProvidedSAIImpl#getSai <em>SAI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryProvidedSAIImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MServiceLibraryProvidedSAIImpl extends EObjectImpl implements MServiceLibraryProvidedSAI {
	/**
	 * The cached value of the '{@link #getSai() <em>SAI</em>}' reference.
	 * @see #getSai()
	 * @generated
	 * @ordered
	 */
	protected MSAI sai;

	/**
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>AttributeValueAssignments</em>}' containment reference list.
	 * @see #getAttributeValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MSLibProvidedSAIAVA> attributeValueAssignments;

	/**
	 * @generated
	 */
	protected MServiceLibraryProvidedSAIImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevslibPackage.Literals.MSERVICE_LIBRARY_PROVIDED_SAI;
	}

	/**
	 * @generated
	 */
	public MSAI getSai() {
		if (sai != null && sai.eIsProxy()) {
			InternalEObject oldSai = (InternalEObject)sai;
			sai = (MSAI)eResolveProxy(oldSai);
			if (sai != oldSai) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__SAI, oldSai, sai));
			}
		}
		return sai;
	}

	/**
	 * @generated
	 */
	public MSAI basicGetSai() {
		return sai;
	}

	/**
	 * @generated
	 */
	public void setSai(MSAI newSai) {
		MSAI oldSai = sai;
		sai = newSai;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__SAI, oldSai, sai));
	}

	/**
	 * @generated
	 */
	public EList<MSLibProvidedSAIAVA> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MSLibProvidedSAIAVA>(MSLibProvidedSAIAVA.class, this, mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__SAI:
				if (resolve) return getSai();
				return basicGetSai();
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
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
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__SAI:
				setSai((MSAI)newValue);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MSLibProvidedSAIAVA>)newValue);
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
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__SAI:
				setSai((MSAI)null);
				return;
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
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
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__SAI:
				return sai != null;
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}