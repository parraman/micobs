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

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;

/**
 * An implementation of the model object '<em><b>MInternalComponentInstance</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentInstanceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentInstanceImpl#isIsSingleton <em>IsSingleton</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentInstanceImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MInternalComponentInstanceImpl extends MCommonReferenceableObjImpl implements MInternalComponentInstance {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected MComponent component;

	/**
	 * The default value of the '{@link #isIsSingleton() <em>IsSingleton</em>}' attribute.
	 * @see #isIsSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleton() <em>IsSingleton</em>}' attribute.
	 * @see #isIsSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleton = IS_SINGLETON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>AttributeValueAssignments</em>}' containment reference list.
	 * @see #getAttributeValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> attributeValueAssignments;

	/**
	 * @generated
	 */
	protected MInternalComponentInstanceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevcmpPackage.Literals.MINTERNAL_COMPONENT_INSTANCE;
	}

	/**
	 * @generated
	 */
	public MComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (MComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * @generated
	 */
	public MComponent basicGetComponent() {
		return component;
	}

	/**
	 * @generated
	 */
	public void setComponent(MComponent newComponent) {
		MComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__COMPONENT, oldComponent, component));
	}

	/**
	 * @generated
	 */
	public boolean isIsSingleton() {
		return isSingleton;
	}

	/**
	 * @generated
	 */
	public void setIsSingleton(boolean newIsSingleton) {
		boolean oldIsSingleton = isSingleton;
		isSingleton = newIsSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON, oldIsSingleton, isSingleton));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON:
				return isIsSingleton();
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__COMPONENT:
				setComponent((MComponent)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON:
				setIsSingleton((Boolean)newValue);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__COMPONENT:
				setComponent((MComponent)null);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON:
				setIsSingleton(IS_SINGLETON_EDEFAULT);
				return;
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
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
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__COMPONENT:
				return component != null;
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON:
				return isSingleton != IS_SINGLETON_EDEFAULT;
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
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
		result.append(" (isSingleton: ");
		result.append(isSingleton);
		result.append(')');
		return result.toString();
	}

}