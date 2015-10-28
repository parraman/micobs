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
package es.uah.aut.srg.micobs.mclev.mclevslib.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * An implementation of the model object '<em><b>MAbstractServiceLibrary</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MAbstractServiceLibraryImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MAbstractServiceLibraryImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MAbstractServiceLibraryImpl#getProvides <em>Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MAbstractServiceLibraryImpl extends MMCLEVSLIBPackageElementImpl implements MAbstractServiceLibrary {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> attributes;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MAbstractServiceLibrary> inherits;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<MServiceLibraryProvidedSAI> provides;

	/**
	 * @generated
	 */
	protected MAbstractServiceLibraryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevslibPackage.Literals.MABSTRACT_SERVICE_LIBRARY;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MParameter>(MParameter.class, this, mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated
	 */
	public EList<MAbstractServiceLibrary> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MAbstractServiceLibrary>(MAbstractServiceLibrary.class, this, mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	public EList<MServiceLibraryProvidedSAI> getProvides() {
		if (provides == null) {
			provides = new EObjectContainmentEList<MServiceLibraryProvidedSAI>(MServiceLibraryProvidedSAI.class, this, mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES);
		}
		return provides;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES:
				return getAttributes();
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__INHERITS:
				return getInherits();
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES:
				return getProvides();
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
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MParameter>)newValue);
				return;
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MAbstractServiceLibrary>)newValue);
				return;
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends MServiceLibraryProvidedSAI>)newValue);
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
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__INHERITS:
				getInherits().clear();
				return;
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES:
				getProvides().clear();
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
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__INHERITS:
				return inherits != null && !inherits.isEmpty();
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY__PROVIDES:
				return provides != null && !provides.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}