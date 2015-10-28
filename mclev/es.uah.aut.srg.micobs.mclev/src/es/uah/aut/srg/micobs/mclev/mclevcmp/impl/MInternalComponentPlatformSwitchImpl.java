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
package es.uah.aut.srg.micobs.mclev.mclevcmp.impl;

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
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;

/**
 * An implementation of the model object '<em><b>MInternalComponentPlatformSwitch</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchImpl#getClientInstance <em>ClientInstance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchImpl#getClientPort <em>ClientPort</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MInternalComponentPlatformSwitchImpl extends MInternalConnectionImpl implements MInternalComponentPlatformSwitch {
	/**
	 * The cached value of the '{@link #getClientInstance() <em>ClientInstance</em>}' reference.
	 * @see #getClientInstance()
	 * @generated
	 * @ordered
	 */
	protected MInternalComponentInstance clientInstance;

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
	protected EList<MInternalComponentPlatformSwitchCase> cases;

	/**
	 * @generated
	 */
	protected MInternalComponentPlatformSwitchImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MINTERNAL_COMPONENT_PLATFORM_SWITCH;
	}

	/**
	 * @generated
	 */
	public MInternalComponentInstance getClientInstance() {
		return clientInstance;
	}

	/**
	 * @generated
	 */
	public void setClientInstance(MInternalComponentInstance newClientInstance) {
		MInternalComponentInstance oldClientInstance = clientInstance;
		clientInstance = newClientInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE, oldClientInstance, clientInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT, oldClientPort, clientPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT, oldClientPort, clientPort));
	}

	/**
	 * @generated
	 */
	public EList<MInternalComponentPlatformSwitchCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<MInternalComponentPlatformSwitchCase>(MInternalComponentPlatformSwitchCase.class, this, mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES);
		}
		return cases;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES:
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE:
				return getClientInstance();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT:
				if (resolve) return getClientPort();
				return basicGetClientPort();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES:
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE:
				setClientInstance((MInternalComponentInstance)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT:
				setClientPort((MClientPort)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends MInternalComponentPlatformSwitchCase>)newValue);
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE:
				setClientInstance((MInternalComponentInstance)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT:
				setClientPort((MClientPort)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES:
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE:
				return clientInstance != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT:
				return clientPort != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES:
				return cases != null && !cases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}