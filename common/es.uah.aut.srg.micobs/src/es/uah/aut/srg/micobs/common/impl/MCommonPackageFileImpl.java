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
package es.uah.aut.srg.micobs.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MCommonPackageFile</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageFileImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageFileImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MCommonPackageFileImpl extends MinimalEObjectImpl.Container implements MCommonPackageFile {
	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackage package_;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<MCommonPackage> imports;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected MCommonPackageElement element;

	/**
	 * @generated
	 */
	protected MCommonPackageFileImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MCOMMON_PACKAGE_FILE;
	}

	/**
	 * @generated
	 */
	public MCommonPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (MCommonPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * @generated
	 */
	public MCommonPackage basicGetPackage() {
		return package_;
	}

	/**
	 * @generated
	 */
	public void setPackage(MCommonPackage newPackage) {
		MCommonPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE, oldPackage, package_));
	}

	/**
	 * @generated
	 */
	public EList<MCommonPackage> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<MCommonPackage>(MCommonPackage.class, this, commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS);
		}
		return imports;
	}

	/**
	 * @generated
	 */
	public MCommonPackageElement getElement() {
		return element;
	}

	/**
	 * @generated
	 */
	public NotificationChain basicSetElement(MCommonPackageElement newElement, NotificationChain msgs) {
		MCommonPackageElement oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated
	 */
	public void setElement(MCommonPackageElement newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT, newElement, newElement));
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT:
				return basicSetElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS:
				return getImports();
			case commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT:
				return getElement();
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
			case commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE:
				setPackage((MCommonPackage)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends MCommonPackage>)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT:
				setElement((MCommonPackageElement)newValue);
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
			case commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE:
				setPackage((MCommonPackage)null);
				return;
			case commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS:
				getImports().clear();
				return;
			case commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT:
				setElement((MCommonPackageElement)null);
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
			case commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE:
				return package_ != null;
			case commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}

}