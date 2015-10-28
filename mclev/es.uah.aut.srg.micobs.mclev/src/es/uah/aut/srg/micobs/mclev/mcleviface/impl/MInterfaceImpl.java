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
package es.uah.aut.srg.micobs.mclev.mcleviface.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;

/**
 * An implementation of the model object '<em><b>MInterface</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MInterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MInterfaceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mcleviface.impl.MInterfaceImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MInterfaceImpl extends MMCLEVIFACEPackageElementImpl implements MInterface {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MInterface> extends_;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected MDomain domain;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MInterfaceType type;

	/**
	 * @generated
	 */
	protected MInterfaceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevifacePackage.Literals.MINTERFACE;
	}

	/**
	 * @generated
	 */
	public EList<MInterface> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MInterface>(MInterface.class, this, mclevifacePackage.MINTERFACE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public MDomain getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (MDomain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevifacePackage.MINTERFACE__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * @generated
	 */
	public MDomain basicGetDomain() {
		return domain;
	}

	/**
	 * @generated
	 */
	public void setDomain(MDomain newDomain) {
		MDomain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevifacePackage.MINTERFACE__DOMAIN, oldDomain, domain));
	}

	/**
	 * @generated
	 */
	public MInterfaceType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MInterfaceType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevifacePackage.MINTERFACE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * @generated
	 */
	public MInterfaceType basicGetType() {
		return type;
	}

	/**
	 * @generated
	 */
	public void setType(MInterfaceType newType) {
		MInterfaceType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevifacePackage.MINTERFACE__TYPE, oldType, type));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevifacePackage.MINTERFACE__EXTENDS:
				return getExtends();
			case mclevifacePackage.MINTERFACE__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case mclevifacePackage.MINTERFACE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case mclevifacePackage.MINTERFACE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MInterface>)newValue);
				return;
			case mclevifacePackage.MINTERFACE__DOMAIN:
				setDomain((MDomain)newValue);
				return;
			case mclevifacePackage.MINTERFACE__TYPE:
				setType((MInterfaceType)newValue);
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
			case mclevifacePackage.MINTERFACE__EXTENDS:
				getExtends().clear();
				return;
			case mclevifacePackage.MINTERFACE__DOMAIN:
				setDomain((MDomain)null);
				return;
			case mclevifacePackage.MINTERFACE__TYPE:
				setType((MInterfaceType)null);
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
			case mclevifacePackage.MINTERFACE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mclevifacePackage.MINTERFACE__DOMAIN:
				return domain != null;
			case mclevifacePackage.MINTERFACE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

}