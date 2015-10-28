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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MPortType</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl#getInterfaceTypes <em>InterfaceTypes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl#getClientAttributes <em>ClientAttributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl#getServerAttributes <em>ServerAttributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MPortTypeImpl extends MCommonReferenceableObjImpl implements MPortType {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MPortType> inherits;

	/**
	 * The cached value of the '{@link #getInterfaceTypes() <em>InterfaceTypes</em>}' reference list.
	 * @see #getInterfaceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MInterfaceType> interfaceTypes;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

	/**
	 * The cached value of the '{@link #getClientAttributes() <em>ClientAttributes</em>}' containment reference list.
	 * @see #getClientAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> clientAttributes;

	/**
	 * The cached value of the '{@link #getServerAttributes() <em>ServerAttributes</em>}' containment reference list.
	 * @see #getServerAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> serverAttributes;

	/**
	 * @generated
	 */
	protected MPortTypeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MPORT_TYPE;
	}

	/**
	 * @generated
	 */
	public EList<MPortType> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MPortType>(MPortType.class, this, mclevdomPackage.MPORT_TYPE__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MInterfaceType> getInterfaceTypes() {
		if (interfaceTypes == null) {
			interfaceTypes = new EObjectResolvingEList<MInterfaceType>(MInterfaceType.class, this, mclevdomPackage.MPORT_TYPE__INTERFACE_TYPES);
		}
		return interfaceTypes;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevdomPackage.MPORT_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getClientAttributes() {
		if (clientAttributes == null) {
			clientAttributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevdomPackage.MPORT_TYPE__CLIENT_ATTRIBUTES);
		}
		return clientAttributes;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getServerAttributes() {
		if (serverAttributes == null) {
			serverAttributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevdomPackage.MPORT_TYPE__SERVER_ATTRIBUTES);
		}
		return serverAttributes;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MPORT_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MPORT_TYPE__CLIENT_ATTRIBUTES:
				return ((InternalEList<?>)getClientAttributes()).basicRemove(otherEnd, msgs);
			case mclevdomPackage.MPORT_TYPE__SERVER_ATTRIBUTES:
				return ((InternalEList<?>)getServerAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MPORT_TYPE__INHERITS:
				return getInherits();
			case mclevdomPackage.MPORT_TYPE__INTERFACE_TYPES:
				return getInterfaceTypes();
			case mclevdomPackage.MPORT_TYPE__ATTRIBUTES:
				return getAttributes();
			case mclevdomPackage.MPORT_TYPE__CLIENT_ATTRIBUTES:
				return getClientAttributes();
			case mclevdomPackage.MPORT_TYPE__SERVER_ATTRIBUTES:
				return getServerAttributes();
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
			case mclevdomPackage.MPORT_TYPE__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MPortType>)newValue);
				return;
			case mclevdomPackage.MPORT_TYPE__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				getInterfaceTypes().addAll((Collection<? extends MInterfaceType>)newValue);
				return;
			case mclevdomPackage.MPORT_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevdomPackage.MPORT_TYPE__CLIENT_ATTRIBUTES:
				getClientAttributes().clear();
				getClientAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevdomPackage.MPORT_TYPE__SERVER_ATTRIBUTES:
				getServerAttributes().clear();
				getServerAttributes().addAll((Collection<? extends MParameter>)newValue);
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
			case mclevdomPackage.MPORT_TYPE__INHERITS:
				getInherits().clear();
				return;
			case mclevdomPackage.MPORT_TYPE__INTERFACE_TYPES:
				getInterfaceTypes().clear();
				return;
			case mclevdomPackage.MPORT_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevdomPackage.MPORT_TYPE__CLIENT_ATTRIBUTES:
				getClientAttributes().clear();
				return;
			case mclevdomPackage.MPORT_TYPE__SERVER_ATTRIBUTES:
				getServerAttributes().clear();
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
			case mclevdomPackage.MPORT_TYPE__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevdomPackage.MPORT_TYPE__INTERFACE_TYPES:
				return interfaceTypes != null && !interfaceTypes.isEmpty();
			case mclevdomPackage.MPORT_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevdomPackage.MPORT_TYPE__CLIENT_ATTRIBUTES:
				return clientAttributes != null && !clientAttributes.isEmpty();
			case mclevdomPackage.MPORT_TYPE__SERVER_ATTRIBUTES:
				return serverAttributes != null && !serverAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}