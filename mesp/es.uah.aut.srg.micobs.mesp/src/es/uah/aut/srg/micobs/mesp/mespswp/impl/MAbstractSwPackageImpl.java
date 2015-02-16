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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MAbstractSwPackage</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MAbstractSwPackageImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MAbstractSwPackageImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MAbstractSwPackageImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAbstractSwPackageImpl extends MMESPSWPPackageElementImpl implements MAbstractSwPackage {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MAbstractSwPackage> inherits;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackageProvidedInterface> provides;

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
	protected MAbstractSwPackageImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MABSTRACT_SW_PACKAGE;
	}

	/**
	 * @generated
	 */
	public EList<MAbstractSwPackage> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAbstractSwPackage>(MAbstractSwPackage.class, this, mespswpPackage.MABSTRACT_SW_PACKAGE__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MSwPackageProvidedInterface> getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentEList<MSwPackageProvidedInterface>(MSwPackageProvidedInterface.class, this, mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES);
		}
		return provides;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS:
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
			case mespswpPackage.MABSTRACT_SW_PACKAGE__INHERITS:
				return getInherits();
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES:
				return getProvides();
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS:
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
			case mespswpPackage.MABSTRACT_SW_PACKAGE__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAbstractSwPackage>)newValue);
				return;
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends MSwPackageProvidedInterface>)newValue);
				return;
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS:
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
			case mespswpPackage.MABSTRACT_SW_PACKAGE__INHERITS:
				getInherits().clear();
				return;
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES:
				getProvides().clear();
				return;
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS:
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
			case mespswpPackage.MABSTRACT_SW_PACKAGE__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PROVIDES:
				return provides != null && !provides.isEmpty();
			case mespswpPackage.MABSTRACT_SW_PACKAGE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}