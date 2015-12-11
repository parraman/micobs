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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;

/**
 * An implementation of the model object '<em><b>EDROOMProtocol</b></em>'.
 *
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMProtocolImpl#getInputMessages <em>InputMessages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMProtocolImpl#getOutputMessages <em>OutputMessages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMProtocolImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMProtocolImpl extends EDROOMPROTPackageElementImpl implements EDROOMProtocol {
	/**
	 * The cached value of the '{@link #getInputMessages() <em>InputMessages</em>}' containment reference list.
	 * @see #getInputMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMMessage> inputMessages;

	/**
	 * The cached value of the '{@link #getOutputMessages() <em>OutputMessages</em>}' containment reference list.
	 * @see #getOutputMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMMessage> outputMessages;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMProtocol> extends_;

	/**
	 * @generated
	 */
	protected EDROOMProtocolImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomprotPackage.Literals.EDROOM_PROTOCOL;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMMessage> getInputMessages() {
		if (inputMessages == null) {
			inputMessages = new EObjectContainmentEList<EDROOMMessage>(EDROOMMessage.class, this, edroomprotPackage.EDROOM_PROTOCOL__INPUT_MESSAGES);
		}
		return inputMessages;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMMessage> getOutputMessages() {
		if (outputMessages == null) {
			outputMessages = new EObjectContainmentEList<EDROOMMessage>(EDROOMMessage.class, this, edroomprotPackage.EDROOM_PROTOCOL__OUTPUT_MESSAGES);
		}
		return outputMessages;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMProtocol> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<EDROOMProtocol>(EDROOMProtocol.class, this, edroomprotPackage.EDROOM_PROTOCOL__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case edroomprotPackage.EDROOM_PROTOCOL__INPUT_MESSAGES:
				return ((InternalEList<?>)getInputMessages()).basicRemove(otherEnd, msgs);
			case edroomprotPackage.EDROOM_PROTOCOL__OUTPUT_MESSAGES:
				return ((InternalEList<?>)getOutputMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomprotPackage.EDROOM_PROTOCOL__INPUT_MESSAGES:
				return getInputMessages();
			case edroomprotPackage.EDROOM_PROTOCOL__OUTPUT_MESSAGES:
				return getOutputMessages();
			case edroomprotPackage.EDROOM_PROTOCOL__EXTENDS:
				return getExtends();
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
			case edroomprotPackage.EDROOM_PROTOCOL__INPUT_MESSAGES:
				getInputMessages().clear();
				getInputMessages().addAll((Collection<? extends EDROOMMessage>)newValue);
				return;
			case edroomprotPackage.EDROOM_PROTOCOL__OUTPUT_MESSAGES:
				getOutputMessages().clear();
				getOutputMessages().addAll((Collection<? extends EDROOMMessage>)newValue);
				return;
			case edroomprotPackage.EDROOM_PROTOCOL__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends EDROOMProtocol>)newValue);
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
			case edroomprotPackage.EDROOM_PROTOCOL__INPUT_MESSAGES:
				getInputMessages().clear();
				return;
			case edroomprotPackage.EDROOM_PROTOCOL__OUTPUT_MESSAGES:
				getOutputMessages().clear();
				return;
			case edroomprotPackage.EDROOM_PROTOCOL__EXTENDS:
				getExtends().clear();
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
			case edroomprotPackage.EDROOM_PROTOCOL__INPUT_MESSAGES:
				return inputMessages != null && !inputMessages.isEmpty();
			case edroomprotPackage.EDROOM_PROTOCOL__OUTPUT_MESSAGES:
				return outputMessages != null && !outputMessages.isEmpty();
			case edroomprotPackage.EDROOM_PROTOCOL__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
