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
package es.uah.aut.srg.micobs.mclev.mclevdom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MConnector</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl#getClientPortTypes <em>ClientPortTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl#getServerPortTypes <em>ServerPortTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl#getExchangeModel <em>ExchangeModel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MConnectorImpl extends MCommonReferenceableObjImpl implements MConnector {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MConnector> inherits;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

	/**
	 * The cached value of the '{@link #getClientPortTypes() <em>ClientPortTypes</em>}' reference list.
	 * @see #getClientPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MPortType> clientPortTypes;

	/**
	 * The cached value of the '{@link #getServerPortTypes() <em>ServerPortTypes</em>}' reference list.
	 * @see #getServerPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MPortType> serverPortTypes;

	/**
	 * The cached value of the '{@link #getExchangeModel() <em>ExchangeModel</em>}' reference.
	 * @see #getExchangeModel()
	 * @generated
	 * @ordered
	 */
	protected MExchangeModel exchangeModel;

	/**
	 * @generated
	 */
	protected MConnectorImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MCONNECTOR;
	}

	/**
	 * @generated
	 */
	public EList<MConnector> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MConnector>(MConnector.class, this, mclevdomPackage.MCONNECTOR__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevdomPackage.MCONNECTOR__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MPortType> getClientPortTypes() {
		if (clientPortTypes == null) {
			clientPortTypes = new EObjectResolvingEList<MPortType>(MPortType.class, this, mclevdomPackage.MCONNECTOR__CLIENT_PORT_TYPES);
		}
		return clientPortTypes;
	}

	/**
	 * @generated
	 */
	public EList<MPortType> getServerPortTypes() {
		if (serverPortTypes == null) {
			serverPortTypes = new EObjectResolvingEList<MPortType>(MPortType.class, this, mclevdomPackage.MCONNECTOR__SERVER_PORT_TYPES);
		}
		return serverPortTypes;
	}

	/**
	 * @generated
	 */
	public MExchangeModel getExchangeModel() {
		if (exchangeModel != null && exchangeModel.eIsProxy()) {
			InternalEObject oldExchangeModel = (InternalEObject)exchangeModel;
			exchangeModel = (MExchangeModel)eResolveProxy(oldExchangeModel);
			if (exchangeModel != oldExchangeModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevdomPackage.MCONNECTOR__EXCHANGE_MODEL, oldExchangeModel, exchangeModel));
			}
		}
		return exchangeModel;
	}

	/**
	 * @generated
	 */
	public MExchangeModel basicGetExchangeModel() {
		return exchangeModel;
	}

	/**
	 * @generated
	 */
	public void setExchangeModel(MExchangeModel newExchangeModel) {
		MExchangeModel oldExchangeModel = exchangeModel;
		exchangeModel = newExchangeModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevdomPackage.MCONNECTOR__EXCHANGE_MODEL, oldExchangeModel, exchangeModel));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MCONNECTOR__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MCONNECTOR__INHERITS:
				return getInherits();
			case mclevdomPackage.MCONNECTOR__ATTRIBUTES:
				return getAttributes();
			case mclevdomPackage.MCONNECTOR__CLIENT_PORT_TYPES:
				return getClientPortTypes();
			case mclevdomPackage.MCONNECTOR__SERVER_PORT_TYPES:
				return getServerPortTypes();
			case mclevdomPackage.MCONNECTOR__EXCHANGE_MODEL:
				if (resolve) return getExchangeModel();
				return basicGetExchangeModel();
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
			case mclevdomPackage.MCONNECTOR__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MConnector>)newValue);
				return;
			case mclevdomPackage.MCONNECTOR__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevdomPackage.MCONNECTOR__CLIENT_PORT_TYPES:
				getClientPortTypes().clear();
				getClientPortTypes().addAll((Collection<? extends MPortType>)newValue);
				return;
			case mclevdomPackage.MCONNECTOR__SERVER_PORT_TYPES:
				getServerPortTypes().clear();
				getServerPortTypes().addAll((Collection<? extends MPortType>)newValue);
				return;
			case mclevdomPackage.MCONNECTOR__EXCHANGE_MODEL:
				setExchangeModel((MExchangeModel)newValue);
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
			case mclevdomPackage.MCONNECTOR__INHERITS:
				getInherits().clear();
				return;
			case mclevdomPackage.MCONNECTOR__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevdomPackage.MCONNECTOR__CLIENT_PORT_TYPES:
				getClientPortTypes().clear();
				return;
			case mclevdomPackage.MCONNECTOR__SERVER_PORT_TYPES:
				getServerPortTypes().clear();
				return;
			case mclevdomPackage.MCONNECTOR__EXCHANGE_MODEL:
				setExchangeModel((MExchangeModel)null);
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
			case mclevdomPackage.MCONNECTOR__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevdomPackage.MCONNECTOR__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevdomPackage.MCONNECTOR__CLIENT_PORT_TYPES:
				return clientPortTypes != null && !clientPortTypes.isEmpty();
			case mclevdomPackage.MCONNECTOR__SERVER_PORT_TYPES:
				return serverPortTypes != null && !serverPortTypes.isEmpty();
			case mclevdomPackage.MCONNECTOR__EXCHANGE_MODEL:
				return exchangeModel != null;
		}
		return super.eIsSet(featureID);
	}

}