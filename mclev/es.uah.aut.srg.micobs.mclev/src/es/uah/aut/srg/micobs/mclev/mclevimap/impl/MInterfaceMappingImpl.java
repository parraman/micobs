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
package es.uah.aut.srg.micobs.mclev.mclevimap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;

/**
 * An implementation of the model object '<em><b>MInterfaceMapping</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MInterfaceMappingImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MInterfaceMappingImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevimap.impl.MInterfaceMappingImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MInterfaceMappingImpl extends MMCLEVIMAPPackageElementImpl implements MInterfaceMapping {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected MIODomain domain;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MExchangeModel type;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MInterface> interfaces;

	/**
	 * @generated
	 */
	protected MInterfaceMappingImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevimapPackage.Literals.MINTERFACE_MAPPING;
	}

	/**
	 * @generated
	 */
	public MIODomain getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (MIODomain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevimapPackage.MINTERFACE_MAPPING__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * @generated
	 */
	public MIODomain basicGetDomain() {
		return domain;
	}

	/**
	 * @generated
	 */
	public void setDomain(MIODomain newDomain) {
		MIODomain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevimapPackage.MINTERFACE_MAPPING__DOMAIN, oldDomain, domain));
	}

	/**
	 * @generated
	 */
	public MExchangeModel getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MExchangeModel)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevimapPackage.MINTERFACE_MAPPING__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * @generated
	 */
	public MExchangeModel basicGetType() {
		return type;
	}

	/**
	 * @generated
	 */
	public void setType(MExchangeModel newType) {
		MExchangeModel oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevimapPackage.MINTERFACE_MAPPING__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	public EList<MInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<MInterface>(MInterface.class, this, mclevimapPackage.MINTERFACE_MAPPING__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevimapPackage.MINTERFACE_MAPPING__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case mclevimapPackage.MINTERFACE_MAPPING__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case mclevimapPackage.MINTERFACE_MAPPING__INTERFACES:
				return getInterfaces();
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
			case mclevimapPackage.MINTERFACE_MAPPING__DOMAIN:
				setDomain((MIODomain)newValue);
				return;
			case mclevimapPackage.MINTERFACE_MAPPING__TYPE:
				setType((MExchangeModel)newValue);
				return;
			case mclevimapPackage.MINTERFACE_MAPPING__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends MInterface>)newValue);
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
			case mclevimapPackage.MINTERFACE_MAPPING__DOMAIN:
				setDomain((MIODomain)null);
				return;
			case mclevimapPackage.MINTERFACE_MAPPING__TYPE:
				setType((MExchangeModel)null);
				return;
			case mclevimapPackage.MINTERFACE_MAPPING__INTERFACES:
				getInterfaces().clear();
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
			case mclevimapPackage.MINTERFACE_MAPPING__DOMAIN:
				return domain != null;
			case mclevimapPackage.MINTERFACE_MAPPING__TYPE:
				return type != null;
			case mclevimapPackage.MINTERFACE_MAPPING__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}