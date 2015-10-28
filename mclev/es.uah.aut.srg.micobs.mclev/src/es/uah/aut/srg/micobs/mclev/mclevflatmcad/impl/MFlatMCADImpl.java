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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;

/**
 * An implementation of the model object '<em><b>MFlatMCAD</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADImpl#getReferencedElement <em>ReferencedElement</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MFlatMCADImpl extends MMCLEVFLATMCADPackageElementImpl implements MFlatMCAD {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>ReferencedElement</em>}' reference.
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement referencedElement;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<MFlatMCADTarget> targets;

	/**
	 * @generated
	 */
	protected MFlatMCADImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevflatmcadPackage.Literals.MFLAT_MCAD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * @generated
	 */
	public EList<MFlatMCADTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<MFlatMCADTarget>(MFlatMCADTarget.class, this, mclevflatmcadPackage.MFLAT_MCAD__TARGETS);
		}
		return targets;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevflatmcadPackage.MFLAT_MCAD__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case mclevflatmcadPackage.MFLAT_MCAD__TARGETS:
				return getTargets();
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
			case mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends MFlatMCADTarget>)newValue);
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
			case mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)null);
				return;
			case mclevflatmcadPackage.MFLAT_MCAD__TARGETS:
				getTargets().clear();
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
			case mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT:
				return referencedElement != null;
			case mclevflatmcadPackage.MFLAT_MCAD__TARGETS:
				return targets != null && !targets.isEmpty();
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
				case mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT: return commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
				case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return mclevflatmcadPackage.MFLAT_MCAD__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}