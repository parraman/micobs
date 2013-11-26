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
package es.uah.aut.srg.micobs.mesp.mesposswp.impl;

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
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;

/**
 * An implementation of the model object '<em><b>MOSSwPackage</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl#getReferencedElement <em>ReferencedElement</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl#getCtools <em>Ctools</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswp.impl.MOSSwPackageImpl#getProvidedOSSWIs <em>ProvidedOSSWIs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOSSwPackageImpl extends MMESPOSSWPPackageElementImpl implements MOSSwPackage {
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
	protected EList<MOSSwPackage> extends_;

	/**
	 * The cached value of the '{@link #getCtools() <em>Ctools</em>}' reference list.
	 * @see #getCtools()
	 * @generated
	 * @ordered
	 */
	protected EList<MConstructionTool> ctools;

	/**
	 * The cached value of the '{@link #getProvidedOSSWIs() <em>ProvidedOSSWIs</em>}' reference list.
	 * @see #getProvidedOSSWIs()
	 * @generated
	 * @ordered
	 */
	protected EList<MOSSwInterface> providedOSSWIs;

	/**
	 * @generated
	 */
	protected MOSSwPackageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mesposswpPackage.Literals.MOS_SW_PACKAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}

	/**
	 * @generated
	 */
	public EList<MOSSwPackage> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MOSSwPackage>(MOSSwPackage.class, this, mesposswpPackage.MOS_SW_PACKAGE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public EList<MConstructionTool> getCtools() {
		if (ctools == null) {
			ctools = new EObjectResolvingEList<MConstructionTool>(MConstructionTool.class, this, mesposswpPackage.MOS_SW_PACKAGE__CTOOLS);
		}
		return ctools;
	}

	/**
	 * @generated
	 */
	public EList<MOSSwInterface> getProvidedOSSWIs() {
		if (providedOSSWIs == null) {
			providedOSSWIs = new EObjectResolvingEList<MOSSwInterface>(MOSSwInterface.class, this, mesposswpPackage.MOS_SW_PACKAGE__PROVIDED_OSSW_IS);
		}
		return providedOSSWIs;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
			case mesposswpPackage.MOS_SW_PACKAGE__EXTENDS:
				return getExtends();
			case mesposswpPackage.MOS_SW_PACKAGE__CTOOLS:
				return getCtools();
			case mesposswpPackage.MOS_SW_PACKAGE__PROVIDED_OSSW_IS:
				return getProvidedOSSWIs();
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
			case mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)newValue);
				return;
			case mesposswpPackage.MOS_SW_PACKAGE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MOSSwPackage>)newValue);
				return;
			case mesposswpPackage.MOS_SW_PACKAGE__CTOOLS:
				getCtools().clear();
				getCtools().addAll((Collection<? extends MConstructionTool>)newValue);
				return;
			case mesposswpPackage.MOS_SW_PACKAGE__PROVIDED_OSSW_IS:
				getProvidedOSSWIs().clear();
				getProvidedOSSWIs().addAll((Collection<? extends MOSSwInterface>)newValue);
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
			case mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT:
				setReferencedElement((MCommonPackageElement)null);
				return;
			case mesposswpPackage.MOS_SW_PACKAGE__EXTENDS:
				getExtends().clear();
				return;
			case mesposswpPackage.MOS_SW_PACKAGE__CTOOLS:
				getCtools().clear();
				return;
			case mesposswpPackage.MOS_SW_PACKAGE__PROVIDED_OSSW_IS:
				getProvidedOSSWIs().clear();
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
			case mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT:
				return referencedElement != null;
			case mesposswpPackage.MOS_SW_PACKAGE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case mesposswpPackage.MOS_SW_PACKAGE__CTOOLS:
				return ctools != null && !ctools.isEmpty();
			case mesposswpPackage.MOS_SW_PACKAGE__PROVIDED_OSSW_IS:
				return providedOSSWIs != null && !providedOSSWIs.isEmpty();
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
				case mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT: return commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
				case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return mesposswpPackage.MOS_SW_PACKAGE__REFERENCED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

}
