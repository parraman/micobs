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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;

/**
 * An implementation of the model object '<em><b>MFlatServiceLibraryInstance</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatServiceLibraryInstanceImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatServiceLibraryInstanceImpl#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MFlatServiceLibraryInstanceImpl extends EObjectImpl implements MFlatServiceLibraryInstance {
	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference.
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected MServiceLibrary library;

	/**
	 * The cached value of the '{@link #getAttributeValueAssignments() <em>AttributeValueAssignments</em>}' containment reference list.
	 * @see #getAttributeValueAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameterValueAssignment> attributeValueAssignments;

	/**
	 * @generated
	 */
	protected MFlatServiceLibraryInstanceImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mclevflatmcadPackage.Literals.MFLAT_SERVICE_LIBRARY_INSTANCE;
	}

	/**
	 * @generated
	 */
	public MServiceLibrary getLibrary() {
		if (library != null && library.eIsProxy()) {
			InternalEObject oldLibrary = (InternalEObject)library;
			library = (MServiceLibrary)eResolveProxy(oldLibrary);
			if (library != oldLibrary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY, oldLibrary, library));
			}
		}
		return library;
	}

	/**
	 * @generated
	 */
	public MServiceLibrary basicGetLibrary() {
		return library;
	}

	/**
	 * @generated
	 */
	public void setLibrary(MServiceLibrary newLibrary) {
		MServiceLibrary oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY, oldLibrary, library));
	}

	/**
	 * @generated
	 */
	public EList<MParameterValueAssignment> getAttributeValueAssignments() {
		if (attributeValueAssignments == null) {
			attributeValueAssignments = new EObjectContainmentEList<MParameterValueAssignment>(MParameterValueAssignment.class, this, mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS);
		}
		return attributeValueAssignments;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return ((InternalEList<?>)getAttributeValueAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY:
				if (resolve) return getLibrary();
				return basicGetLibrary();
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return getAttributeValueAssignments();
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
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY:
				setLibrary((MServiceLibrary)newValue);
				return;
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
				getAttributeValueAssignments().addAll((Collection<? extends MParameterValueAssignment>)newValue);
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
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY:
				setLibrary((MServiceLibrary)null);
				return;
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				getAttributeValueAssignments().clear();
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
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY:
				return library != null;
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS:
				return attributeValueAssignments != null && !attributeValueAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}