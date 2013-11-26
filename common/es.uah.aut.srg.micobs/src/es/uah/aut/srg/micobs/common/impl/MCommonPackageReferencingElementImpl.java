/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MCommonPackageReferencingElement</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageReferencingElementImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MCommonPackageReferencingElementImpl extends MCommonPackageElementImpl implements MCommonPackageReferencingElement {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>ReferencedElement</em>}' reference.
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement referencedElement;

	/**
	 * @generated
	 */
	protected MCommonPackageReferencingElementImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MCOMMON_PACKAGE_REFERENCING_ELEMENT;
	}

	/**
	 * @generated
	 */
	public MCommonPackageElement getReferencedElement() {
		if (referencedElement != null && referencedElement.eIsProxy()) {
			InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
			referencedElement = (MCommonPackageElement)eResolveProxy(oldReferencedElement);
			if (referencedElement != oldReferencedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
			}
		}
		return referencedElement;
	}

	/**
	 * @generated
	 */
	public MCommonPackageElement basicGetReferencedElement() {
		return referencedElement;
	}

	/**
	 * @generated
	 */
	public void setReferencedElement(MCommonPackageElement newReferencedElement) {
		MCommonPackageElement oldReferencedElement = referencedElement;
		referencedElement = newReferencedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)newValue);
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
			case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)null);
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
			case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				return referencedElement != null;
		}
		return super.eIsSet(featureID);
	}

}