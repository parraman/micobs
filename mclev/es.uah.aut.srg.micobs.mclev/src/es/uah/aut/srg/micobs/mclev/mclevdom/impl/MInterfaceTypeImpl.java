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
package es.uah.aut.srg.micobs.mclev.mclevdom.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model object '<em><b>MInterfaceType</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInterfaceTypeImpl#getInherits <em>Inherits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MInterfaceTypeImpl extends MCommonReferenceableObjImpl implements MInterfaceType {
	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference list.
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected EList<MInterfaceType> inherits;

	/**
	 * @generated
	 */
	protected MInterfaceTypeImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevdomPackage.Literals.MINTERFACE_TYPE;
	}

	/**
	 * @generated
	 */
	public EList<MInterfaceType> getInherits() {
		if (inherits == null) {
			inherits = new EObjectResolvingEList<MInterfaceType>(MInterfaceType.class, this, mclevdomPackage.MINTERFACE_TYPE__INHERITS);
		}
		return inherits;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevdomPackage.MINTERFACE_TYPE__INHERITS:
				return getInherits();
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
			case mclevdomPackage.MINTERFACE_TYPE__INHERITS:
				getInherits().clear();
				getInherits().addAll((Collection<? extends MInterfaceType>)newValue);
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
			case mclevdomPackage.MINTERFACE_TYPE__INHERITS:
				getInherits().clear();
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
			case mclevdomPackage.MINTERFACE_TYPE__INHERITS:
				return inherits != null && !inherits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}