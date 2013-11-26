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
package es.uah.aut.srg.micobs.pdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MMicroprocessor</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MMicroprocessorImpl#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMicroprocessorImpl extends MPDLPackageElementImpl implements MMicroprocessor {
	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' reference.
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected MArchitecture architecture;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * @generated
	 */
	protected MMicroprocessorImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MMICROPROCESSOR;
	}

	/**
	 * @generated
	 */
	public MArchitecture getArchitecture() {
		if (architecture != null && architecture.eIsProxy()) {
			InternalEObject oldArchitecture = (InternalEObject)architecture;
			architecture = (MArchitecture)eResolveProxy(oldArchitecture);
			if (architecture != oldArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MMICROPROCESSOR__ARCHITECTURE, oldArchitecture, architecture));
			}
		}
		return architecture;
	}

	/**
	 * @generated
	 */
	public MArchitecture basicGetArchitecture() {
		return architecture;
	}

	/**
	 * @generated
	 */
	public void setArchitecture(MArchitecture newArchitecture) {
		MArchitecture oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MMICROPROCESSOR__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MMICROPROCESSOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MMICROPROCESSOR__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pdlPackage.MMICROPROCESSOR__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case pdlPackage.MMICROPROCESSOR__PARAMETERS:
				return getParameters();
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
			case pdlPackage.MMICROPROCESSOR__ARCHITECTURE:
				setArchitecture((MArchitecture)newValue);
				return;
			case pdlPackage.MMICROPROCESSOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
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
			case pdlPackage.MMICROPROCESSOR__ARCHITECTURE:
				setArchitecture((MArchitecture)null);
				return;
			case pdlPackage.MMICROPROCESSOR__PARAMETERS:
				getParameters().clear();
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
			case pdlPackage.MMICROPROCESSOR__ARCHITECTURE:
				return architecture != null;
			case pdlPackage.MMICROPROCESSOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
