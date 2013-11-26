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
package es.uah.aut.srg.micobs.mesp.mesppswp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;

/**
 * An implementation of the model object '<em><b>MPlatformSwPackage</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MPlatformSwPackageImpl#getReferencedElement <em>ReferencedElement</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MPlatformSwPackageImpl#getOsSwPackages <em>OsSwPackages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesppswp.impl.MPlatformSwPackageImpl#getCtools <em>Ctools</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MPlatformSwPackageImpl extends MMESPPSWPPackageElementImpl implements MPlatformSwPackage {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>ReferencedElement</em>}' reference.
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement referencedElement;

	/**
	 * The cached value of the '{@link #getOsSwPackages() <em>OsSwPackages</em>}' reference list.
	 * @see #getOsSwPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MOSSwPackage> osSwPackages;

	/**
	 * The cached value of the '{@link #getCtools() <em>Ctools</em>}' reference list.
	 * @see #getCtools()
	 * @generated
	 * @ordered
	 */
	protected EList<MConstructionTool> ctools;

	/**
	 * @generated
	 */
	protected MPlatformSwPackageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mesppswpPackage.Literals.MPLATFORM_SW_PACKAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * @generated
	 */
	public EList<MOSSwPackage> getOsSwPackages() {
		if (osSwPackages == null) {
			osSwPackages = new EObjectResolvingEList<MOSSwPackage>(MOSSwPackage.class, this, mesppswpPackage.MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES);
		}
		return osSwPackages;
	}

	/**
	 * @generated
	 */
	public EList<MConstructionTool> getCtools() {
		if (ctools == null) {
			ctools = new EObjectResolvingEList<MConstructionTool>(MConstructionTool.class, this, mesppswpPackage.MPLATFORM_SW_PACKAGE__CTOOLS);
		}
		return ctools;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES:
				return getOsSwPackages();
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__CTOOLS:
				return getCtools();
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
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)newValue);
				return;
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES:
				getOsSwPackages().clear();
				getOsSwPackages().addAll((Collection<? extends MOSSwPackage>)newValue);
				return;
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__CTOOLS:
				getCtools().clear();
				getCtools().addAll((Collection<? extends MConstructionTool>)newValue);
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
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)null);
				return;
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES:
				getOsSwPackages().clear();
				return;
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__CTOOLS:
				getCtools().clear();
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
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT:
				return referencedElement != null;
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES:
				return osSwPackages != null && !osSwPackages.isEmpty();
			case mesppswpPackage.MPLATFORM_SW_PACKAGE__CTOOLS:
				return ctools != null && !ctools.isEmpty();
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
				case mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT: return commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
				case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return mesppswpPackage.MPLATFORM_SW_PACKAGE__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}