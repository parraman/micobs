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
import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MCommonPackageParametricReferencingElement</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageParametricReferencingElementImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageParametricReferencingElementImpl#getParameterElement <em>Parameter Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCommonPackageParametricReferencingElementImpl extends MCommonPackageElementImpl implements MCommonPackageParametricReferencingElement {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>ReferencedElement</em>}' reference.
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement referencedElement;

	/**
	 * The cached value of the '{@link #getParameterElement() <em>ParameterElement</em>}' reference.
	 * @see #getParameterElement()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement parameterElement;

	/**
	 * @generated
	 */
	protected MCommonPackageParametricReferencingElementImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * @generated
	 */
	public MCommonPackageElement getParameterElement() {
		if (parameterElement != null && parameterElement.eIsProxy()) {
			InternalEObject oldParameterElement = (InternalEObject)parameterElement;
			parameterElement = (MCommonPackageElement)eResolveProxy(oldParameterElement);
			if (parameterElement != oldParameterElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT, oldParameterElement, parameterElement));
			}
		}
		return parameterElement;
	}

	/**
	 * @generated
	 */
	public MCommonPackageElement basicGetParameterElement() {
		return parameterElement;
	}

	/**
	 * @generated
	 */
	public void setParameterElement(MCommonPackageElement newParameterElement) {
		MCommonPackageElement oldParameterElement = parameterElement;
		parameterElement = newParameterElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT, oldParameterElement, parameterElement));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT:
				if (resolve) return getParameterElement();
				return basicGetParameterElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT:
				setParameterElement((MCommonPackageElement)newValue);
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
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)null);
				return;
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT:
				setParameterElement((MCommonPackageElement)null);
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
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
				return referencedElement != null;
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT:
				return parameterElement != null;
		}
		return super.eIsSet(featureID);
	}

}