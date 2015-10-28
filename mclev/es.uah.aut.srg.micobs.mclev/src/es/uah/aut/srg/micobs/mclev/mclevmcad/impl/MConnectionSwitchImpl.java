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
package es.uah.aut.srg.micobs.mclev.mclevmcad.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * An implementation of the model object '<em><b>MConnectionSwitch</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchImpl#getClientInstance <em>ClientInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchImpl#getClientPort <em>ClientPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MConnectionSwitchImpl extends MConnectionImpl implements MConnectionSwitch {
	/**
	 * The cached value of the '{@link #getClientInstance() <em>ClientInstance</em>}' reference.
	 * @see #getClientInstance()
	 * @generated
	 * @ordered
	 */
	protected MComponentInstance clientInstance;

	/**
	 * The cached value of the '{@link #getClientPort() <em>ClientPort</em>}' reference.
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected MClientPort clientPort;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<MConnectionSwitchCase> cases;

	/**
	 * @generated
	 */
	protected MConnectionSwitchImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevmcadPackage.Literals.MCONNECTION_SWITCH;
	}

	/**
	 * @generated
	 */
	public MComponentInstance getClientInstance() {
		return clientInstance;
	}

	/**
	 * @generated
	 */
	public void setClientInstance(MComponentInstance newClientInstance) {
		MComponentInstance oldClientInstance = clientInstance;
		clientInstance = newClientInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_INSTANCE, oldClientInstance, clientInstance));
	}

	/**
	 * @generated
	 */
	public MClientPort getClientPort() {
		if (clientPort != null && clientPort.eIsProxy()) {
			InternalEObject oldClientPort = (InternalEObject)clientPort;
			clientPort = (MClientPort)eResolveProxy(oldClientPort);
			if (clientPort != oldClientPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_PORT, oldClientPort, clientPort));
			}
		}
		return clientPort;
	}

	/**
	 * @generated
	 */
	public MClientPort basicGetClientPort() {
		return clientPort;
	}

	/**
	 * @generated
	 */
	public void setClientPort(MClientPort newClientPort) {
		MClientPort oldClientPort = clientPort;
		clientPort = newClientPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_PORT, oldClientPort, clientPort));
	}

	/**
	 * @generated
	 */
	public EList<MConnectionSwitchCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<MConnectionSwitchCase>(MConnectionSwitchCase.class, this, mclevmcadPackage.MCONNECTION_SWITCH__CASES);
		}
		return cases;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevmcadPackage.MCONNECTION_SWITCH__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_INSTANCE:
				return getClientInstance();
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_PORT:
				if (resolve) return getClientPort();
				return basicGetClientPort();
			case mclevmcadPackage.MCONNECTION_SWITCH__CASES:
				return getCases();
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
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_INSTANCE:
				setClientInstance((MComponentInstance)newValue);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_PORT:
				setClientPort((MClientPort)newValue);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends MConnectionSwitchCase>)newValue);
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
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_INSTANCE:
				setClientInstance((MComponentInstance)null);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_PORT:
				setClientPort((MClientPort)null);
				return;
			case mclevmcadPackage.MCONNECTION_SWITCH__CASES:
				getCases().clear();
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
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_INSTANCE:
				return clientInstance != null;
			case mclevmcadPackage.MCONNECTION_SWITCH__CLIENT_PORT:
				return clientPort != null;
			case mclevmcadPackage.MCONNECTION_SWITCH__CASES:
				return cases != null && !cases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}