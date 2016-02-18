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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;

/**
 * An implementation of the model object '<em><b>EDROOMInvokeMessage</b></em>'.
 *
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl.EDROOMInvokeMessageImpl#getReplies <em>Replies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDROOMInvokeMessageImpl extends EDROOMMessageImpl implements EDROOMInvokeMessage {
	/**
	 * The cached value of the '{@link #getReplies() <em>Replies</em>}' reference list.
	 * @see #getReplies()
	 * @generated
	 * @ordered
	 */
	protected EList<EDROOMReplyMessage> replies;

	/**
	 * @generated
	 */
	protected EDROOMInvokeMessageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edroomprotPackage.Literals.EDROOM_INVOKE_MESSAGE;
	}

	/**
	 * @generated
	 */
	public EList<EDROOMReplyMessage> getReplies() {
		if (replies == null) {
			replies = new EObjectResolvingEList<EDROOMReplyMessage>(EDROOMReplyMessage.class, this, edroomprotPackage.EDROOM_INVOKE_MESSAGE__REPLIES);
		}
		return replies;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edroomprotPackage.EDROOM_INVOKE_MESSAGE__REPLIES:
				return getReplies();
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
			case edroomprotPackage.EDROOM_INVOKE_MESSAGE__REPLIES:
				getReplies().clear();
				getReplies().addAll((Collection<? extends EDROOMReplyMessage>)newValue);
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
			case edroomprotPackage.EDROOM_INVOKE_MESSAGE__REPLIES:
				getReplies().clear();
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
			case edroomprotPackage.EDROOM_INVOKE_MESSAGE__REPLIES:
				return replies != null && !replies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
