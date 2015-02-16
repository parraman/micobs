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
package es.uah.aut.srg.micobs.mesp.mesposswi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;

/**
 * An implementation of the model object '<em><b>MOSSwInterface</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MOSSwInterfaceImpl#getReferencedElement <em>ReferencedElement</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MOSSwInterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswi.impl.MOSSwInterfaceImpl#getProvidedResources <em>ProvidedResources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOSSwInterfaceImpl extends MMESPOSSWIPackageElementImpl implements MOSSwInterface {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>ReferencedElement</em>}' reference.
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement referencedElement;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MOSSwInterface> extends_;

	/**
	 * The cached value of the '{@link #getProvidedResources() <em>ProvidedResources</em>}' containment reference list.
	 * @see #getProvidedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<MProvidedResource> providedResources;

	/**
	 * @generated
	 */
	protected MOSSwInterfaceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mesposswiPackage.Literals.MOS_SW_INTERFACE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * @generated
	 */
	public EList<MOSSwInterface> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MOSSwInterface>(MOSSwInterface.class, this, mesposswiPackage.MOS_SW_INTERFACE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public EList<MProvidedResource> getProvidedResources() {
		if (providedResources == null) {
			providedResources = new EObjectContainmentEList<MProvidedResource>(MProvidedResource.class, this, mesposswiPackage.MOS_SW_INTERFACE__PROVIDED_RESOURCES);
		}
		return providedResources;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mesposswiPackage.MOS_SW_INTERFACE__PROVIDED_RESOURCES:
				return ((InternalEList<?>)getProvidedResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case mesposswiPackage.MOS_SW_INTERFACE__EXTENDS:
				return getExtends();
			case mesposswiPackage.MOS_SW_INTERFACE__PROVIDED_RESOURCES:
				return getProvidedResources();
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
			case mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)newValue);
				return;
			case mesposswiPackage.MOS_SW_INTERFACE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MOSSwInterface>)newValue);
				return;
			case mesposswiPackage.MOS_SW_INTERFACE__PROVIDED_RESOURCES:
				getProvidedResources().clear();
				getProvidedResources().addAll((Collection<? extends MProvidedResource>)newValue);
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
			case mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)null);
				return;
			case mesposswiPackage.MOS_SW_INTERFACE__EXTENDS:
				getExtends().clear();
				return;
			case mesposswiPackage.MOS_SW_INTERFACE__PROVIDED_RESOURCES:
				getProvidedResources().clear();
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
			case mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT:
				return referencedElement != null;
			case mesposswiPackage.MOS_SW_INTERFACE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mesposswiPackage.MOS_SW_INTERFACE__PROVIDED_RESOURCES:
				return providedResources != null && !providedResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MCommonPackageReferencingElement.class) {
			switch (derivedFeatureID) {
				case mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT: return commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MCommonPackageReferencingElement.class) {
			switch (baseFeatureID) {
				case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return mesposswiPackage.MOS_SW_INTERFACE__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}
