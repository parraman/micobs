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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MPortTypeInstance</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeInstanceImpl#getPortType <em>PortType</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeInstanceImpl#getLowerBound <em>LowerBound</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeInstanceImpl#getUpperBound <em>UpperBound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MPortTypeInstanceImpl extends EObjectImpl implements MPortTypeInstance {
	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected MPortType portType;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>LowerBound</em>}' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression lowerBound;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>UpperBound</em>}' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected MParameterValueExpression upperBound;

	/**
	 * @generated
	 */
	protected MPortTypeInstanceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MPORT_TYPE_INSTANCE;
	}

	/**
	 * @generated
	 */
	public MPortType getPortType() {
		if (portType != null && portType.eIsProxy()) {
			InternalEObject oldPortType = (InternalEObject)portType;
			portType = (MPortType)eResolveProxy(oldPortType);
			if (portType != oldPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevdomPackage.MPORT_TYPE_INSTANCE__PORT_TYPE, oldPortType, portType));
			}
		}
		return portType;
	}

	/**
	 * @generated
	 */
	public MPortType basicGetPortType() {
		return portType;
	}

	/**
	 * @generated
	 */
	public void setPortType(MPortType newPortType) {
		MPortType oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevdomPackage.MPORT_TYPE_INSTANCE__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getLowerBound() {
		return lowerBound;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(MParameterValueExpression newLowerBound, NotificationChain msgs) {
		MParameterValueExpression oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setLowerBound(MParameterValueExpression newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND, newLowerBound, newLowerBound));
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression getUpperBound() {
		return upperBound;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(MParameterValueExpression newUpperBound, NotificationChain msgs) {
		MParameterValueExpression oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setUpperBound(MParameterValueExpression newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
			case mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MPORT_TYPE_INSTANCE__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
			case mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND:
				return getLowerBound();
			case mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND:
				return getUpperBound();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mclevdomPackage.MPORT_TYPE_INSTANCE__PORT_TYPE:
				setPortType((MPortType)newValue);
				return;
			case mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND:
				setLowerBound((MParameterValueExpression)newValue);
				return;
			case mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND:
				setUpperBound((MParameterValueExpression)newValue);
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
			case mclevdomPackage.MPORT_TYPE_INSTANCE__PORT_TYPE:
				setPortType((MPortType)null);
				return;
			case mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND:
				setLowerBound((MParameterValueExpression)null);
				return;
			case mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND:
				setUpperBound((MParameterValueExpression)null);
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
			case mclevdomPackage.MPORT_TYPE_INSTANCE__PORT_TYPE:
				return portType != null;
			case mclevdomPackage.MPORT_TYPE_INSTANCE__LOWER_BOUND:
				return lowerBound != null;
			case mclevdomPackage.MPORT_TYPE_INSTANCE__UPPER_BOUND:
				return upperBound != null;
		}
		return super.eIsSet(featureID);
	}

}