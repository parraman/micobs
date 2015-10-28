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
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MDomain</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl#isAllowsSingleton <em>AllowsSingleton</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl#getPortTypes <em>PortTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl#getInterfaceTypes <em>InterfaceTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MDomainImpl extends MMCLEVDOMPackageElementImpl implements MDomain {
	/**
	 * The default value of the '{@link #isAllowsSingleton() <em>AllowsSingleton</em>}' attribute.
	 * @see #isAllowsSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOWS_SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowsSingleton() <em>Allows Singleton</em>}' attribute.
	 * @see #isAllowsSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean allowsSingleton = ALLOWS_SINGLETON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

	/**
	 * The cached value of the '{@link #getPortTypes() <em>PortTypes</em>}' containment reference list.
	 * @see #getPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MPortType> portTypes;

	/**
	 * The cached value of the '{@link #getInterfaceTypes() <em>InterfaceTypes</em>}' containment reference list.
	 * @see #getInterfaceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MInterfaceType> interfaceTypes;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<MConnector> connectors;

	/**
	 * @generated
	 */
	protected MDomainImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MDOMAIN;
	}

	/**
	 * @generated
	 */
	public boolean isAllowsSingleton() {
		return allowsSingleton;
	}

	/**
	 * @generated
	 */
	public void setAllowsSingleton(boolean newAllowsSingleton) {
		boolean oldAllowsSingleton = allowsSingleton;
		allowsSingleton = newAllowsSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevdomPackage.MDOMAIN__ALLOWS_SINGLETON, oldAllowsSingleton, allowsSingleton));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevdomPackage.MDOMAIN__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MPortType> getPortTypes() {
		if (portTypes == null) {
			portTypes = new EObjectContainmentEList<MPortType>(MPortType.class, this, mclevdomPackage.MDOMAIN__PORT_TYPES);
		}
		return portTypes;
	}

	/**
	 * @generated
	 */
	public EList<MInterfaceType> getInterfaceTypes() {
		if (interfaceTypes == null) {
			interfaceTypes = new EObjectContainmentEList<MInterfaceType>(MInterfaceType.class, this, mclevdomPackage.MDOMAIN__INTERFACE_TYPES);
		}
		return interfaceTypes;
	}

	/**
	 * @generated
	 */
	public EList<MConnector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<MConnector>(MConnector.class, this, mclevdomPackage.MDOMAIN__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MDOMAIN__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MDOMAIN__PORT_TYPES:
				return ((InternalEList<?>)getPortTypes()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MDOMAIN__INTERFACE_TYPES:
				return ((InternalEList<?>)getInterfaceTypes()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MDOMAIN__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MDOMAIN__ALLOWS_SINGLETON:
				return isAllowsSingleton();
			case mclevdomPackage.MDOMAIN__ATTRIBUTES:
				return getAttributes();
			case mclevdomPackage.MDOMAIN__PORT_TYPES:
				return getPortTypes();
			case mclevdomPackage.MDOMAIN__INTERFACE_TYPES:
				return getInterfaceTypes();
			case mclevdomPackage.MDOMAIN__CONNECTORS:
				return getConnectors();
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
			case mclevdomPackage.MDOMAIN__ALLOWS_SINGLETON:
				setAllowsSingleton((Boolean)newValue);
				return;
			case mclevdomPackage.MDOMAIN__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevdomPackage.MDOMAIN__PORT_TYPES:
				getPortTypes().clear();
				getPortTypes().addAll((Collection<? extends MPortType>)newValue);
				return;
			case mclevdomPackage.MDOMAIN__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				getInterfaceTypes().addAll((Collection<? extends MInterfaceType>)newValue);
				return;
			case mclevdomPackage.MDOMAIN__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends MConnector>)newValue);
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
			case mclevdomPackage.MDOMAIN__ALLOWS_SINGLETON:
				setAllowsSingleton(ALLOWS_SINGLETON_EDEFAULT);
				return;
			case mclevdomPackage.MDOMAIN__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevdomPackage.MDOMAIN__PORT_TYPES:
				getPortTypes().clear();
				return;
			case mclevdomPackage.MDOMAIN__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				return;
			case mclevdomPackage.MDOMAIN__CONNECTORS:
				getConnectors().clear();
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
			case mclevdomPackage.MDOMAIN__ALLOWS_SINGLETON:
				return allowsSingleton != ALLOWS_SINGLETON_EDEFAULT;
			case mclevdomPackage.MDOMAIN__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevdomPackage.MDOMAIN__PORT_TYPES:
				return portTypes != null && !portTypes.isEmpty();
			case mclevdomPackage.MDOMAIN__INTERFACE_TYPES:
				return interfaceTypes != null && !interfaceTypes.isEmpty();
			case mclevdomPackage.MDOMAIN__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (allowsSingleton: ");
		result.append(allowsSingleton);
		result.append(')');
		return result.toString();
	}

}