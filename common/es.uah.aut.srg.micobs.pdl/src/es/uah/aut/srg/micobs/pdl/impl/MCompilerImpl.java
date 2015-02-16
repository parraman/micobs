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
package es.uah.aut.srg.micobs.pdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MCompiler</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerImpl#getFrontends <em>Frontends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCompilerImpl extends MPDLPackageElementImpl implements MCompiler {
	/**
	 * The cached value of the '{@link #getFrontends() <em>Frontends</em>}' containment reference list.
	 * @see #getFrontends()
	 * @generated
	 * @ordered
	 */
	protected EList<MCompilerFrontend> frontends;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<MCompiler> extends_;

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
	protected MCompilerImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MCOMPILER;
	}

	/**
	 * @generated
	 */
	public EList<MCompilerFrontend> getFrontends() {
		if (frontends == null) {
			frontends = new EObjectContainmentEList<MCompilerFrontend>(MCompilerFrontend.class, this, pdlPackage.MCOMPILER__FRONTENDS);
		}
		return frontends;
	}

	/**
	 * @generated
	 */
	public EList<MCompiler> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<MCompiler>(MCompiler.class, this, pdlPackage.MCOMPILER__EXTENDS);
		}
		return extends_;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MCOMPILER__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MCOMPILER__FRONTENDS:
				return ((InternalEList<?>)getFrontends()).basicRemove(otherEnd, msgs);
			case pdlPackage.MCOMPILER__PARAMETERS:
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
			case pdlPackage.MCOMPILER__FRONTENDS:
				return getFrontends();
			case pdlPackage.MCOMPILER__EXTENDS:
				return getExtends();
			case pdlPackage.MCOMPILER__PARAMETERS:
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
			case pdlPackage.MCOMPILER__FRONTENDS:
				getFrontends().clear();
				getFrontends().addAll((Collection<? extends MCompilerFrontend>)newValue);
				return;
			case pdlPackage.MCOMPILER__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends MCompiler>)newValue);
				return;
			case pdlPackage.MCOMPILER__PARAMETERS:
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
			case pdlPackage.MCOMPILER__FRONTENDS:
				getFrontends().clear();
				return;
			case pdlPackage.MCOMPILER__EXTENDS:
				getExtends().clear();
				return;
			case pdlPackage.MCOMPILER__PARAMETERS:
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
			case pdlPackage.MCOMPILER__FRONTENDS:
				return frontends != null && !frontends.isEmpty();
			case pdlPackage.MCOMPILER__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case pdlPackage.MCOMPILER__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
