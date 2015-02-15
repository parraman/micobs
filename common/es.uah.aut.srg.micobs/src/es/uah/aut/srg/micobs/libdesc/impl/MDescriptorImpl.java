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
package es.uah.aut.srg.micobs.libdesc.impl;

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

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;

/**
 * An implementation of the model object '<em><b>MDescriptor</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl#getUri <em>URI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl#getItem <em>Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.impl.MDescriptorImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDescriptorImpl extends EObjectImpl implements MDescriptor {
	/**
	 * The default value of the '{@link #getUri() <em>URI</em>}' attribute.
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>URI</em>}' attribute.
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected String library = LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected String item = ITEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<MDescriptorField> fields;

	/**
	 * @generated
	 */
	protected MDescriptorImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return libdescPackage.Literals.MDESCRIPTOR;
	}

	/**
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, libdescPackage.MDESCRIPTOR__URI, oldUri, uri));
	}

	/**
	 * @generated
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * @generated
	 */
	public void setLibrary(String newLibrary) {
		String oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, libdescPackage.MDESCRIPTOR__LIBRARY, oldLibrary, library));
	}

	/**
	 * @generated
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @generated
	 */
	public void setItem(String newItem) {
		String oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, libdescPackage.MDESCRIPTOR__ITEM, oldItem, item));
	}

	/**
	 * @generated
	 */
	public EList<MDescriptorField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<MDescriptorField>(MDescriptorField.class, this, libdescPackage.MDESCRIPTOR__FIELDS);
		}
		return fields;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case libdescPackage.MDESCRIPTOR__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case libdescPackage.MDESCRIPTOR__URI:
				return getUri();
			case libdescPackage.MDESCRIPTOR__LIBRARY:
				return getLibrary();
			case libdescPackage.MDESCRIPTOR__ITEM:
				return getItem();
			case libdescPackage.MDESCRIPTOR__FIELDS:
				return getFields();
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
			case libdescPackage.MDESCRIPTOR__URI:
				setUri((String)newValue);
				return;
			case libdescPackage.MDESCRIPTOR__LIBRARY:
				setLibrary((String)newValue);
				return;
			case libdescPackage.MDESCRIPTOR__ITEM:
				setItem((String)newValue);
				return;
			case libdescPackage.MDESCRIPTOR__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends MDescriptorField>)newValue);
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
			case libdescPackage.MDESCRIPTOR__URI:
				setUri(URI_EDEFAULT);
				return;
			case libdescPackage.MDESCRIPTOR__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case libdescPackage.MDESCRIPTOR__ITEM:
				setItem(ITEM_EDEFAULT);
				return;
			case libdescPackage.MDESCRIPTOR__FIELDS:
				getFields().clear();
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
			case libdescPackage.MDESCRIPTOR__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case libdescPackage.MDESCRIPTOR__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case libdescPackage.MDESCRIPTOR__ITEM:
				return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
			case libdescPackage.MDESCRIPTOR__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(", library: ");
		result.append(library);
		result.append(", item: ");
		result.append(item);
		result.append(')');
		return result.toString();
	}

}
