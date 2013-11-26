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
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MCommonPackageVersionedItem</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl#getLocalModelURI <em>LocalModelURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl#getRemoteModelURI <em>RemoteModelURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl#getRepositoryFolderURI <em>RepositoryFolderURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MCommonPackageVersionedItemImpl extends MinimalEObjectImpl.Container implements MCommonPackageVersionedItem {
	/**
	 * The default value of the '{@link #getLocalModelURI() <em>LocalModelURI</em>}' attribute.
	 * @see #getLocalModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalModelURI() <em>LocalModelURI</em>}' attribute.
	 * @see #getLocalModelURI()
	 * @generated
	 * @ordered
	 */
	protected String localModelURI = LOCAL_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteModelURI() <em>RemoteModelURI</em>}' attribute.
	 * @see #getRemoteModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteModelURI() <em>RemoteModelURI</em>}' attribute.
	 * @see #getRemoteModelURI()
	 * @generated
	 * @ordered
	 */
	protected String remoteModelURI = REMOTE_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepositoryFolderURI() <em>RepositoryFolderURI</em>}' attribute.
	 * @see #getRepositoryFolderURI()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_FOLDER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryFolderURI() <em>RepositoryFolderURI</em>}' attribute.
	 * @see #getRepositoryFolderURI()
	 * @generated
	 * @ordered
	 */
	protected String repositoryFolderURI = REPOSITORY_FOLDER_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * @generated
	 */
	protected MCommonPackageVersionedItemImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MCOMMON_PACKAGE_VERSIONED_ITEM;
	}

	/**
	 * @generated
	 */
	public String getLocalModelURI() {
		return localModelURI;
	}

	/**
	 * @generated
	 */
	public void setLocalModelURI(String newLocalModelURI) {
		String oldLocalModelURI = localModelURI;
		localModelURI = newLocalModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI, oldLocalModelURI, localModelURI));
	}

	/**
	 * @generated
	 */
	public String getRemoteModelURI() {
		return remoteModelURI;
	}

	/**
	 * @generated
	 */
	public void setRemoteModelURI(String newRemoteModelURI) {
		String oldRemoteModelURI = remoteModelURI;
		remoteModelURI = newRemoteModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI, oldRemoteModelURI, remoteModelURI));
	}

	/**
	 * @generated
	 */
	public String getRepositoryFolderURI() {
		return repositoryFolderURI;
	}

	/**
	 * @generated
	 */
	public void setRepositoryFolderURI(String newRepositoryFolderURI) {
		String oldRepositoryFolderURI = repositoryFolderURI;
		repositoryFolderURI = newRepositoryFolderURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI, oldRepositoryFolderURI, repositoryFolderURI));
	}

	/**
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION, oldVersion, version));
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI:
				return getLocalModelURI();
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI:
				return getRemoteModelURI();
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI:
				return getRepositoryFolderURI();
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI:
				setLocalModelURI((String)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI:
				setRemoteModelURI((String)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI:
				setRepositoryFolderURI((String)newValue);
				return;
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION:
				setVersion((String)newValue);
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
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI:
				setLocalModelURI(LOCAL_MODEL_URI_EDEFAULT);
				return;
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI:
				setRemoteModelURI(REMOTE_MODEL_URI_EDEFAULT);
				return;
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI:
				setRepositoryFolderURI(REPOSITORY_FOLDER_URI_EDEFAULT);
				return;
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI:
				return LOCAL_MODEL_URI_EDEFAULT == null ? localModelURI != null : !LOCAL_MODEL_URI_EDEFAULT.equals(localModelURI);
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI:
				return REMOTE_MODEL_URI_EDEFAULT == null ? remoteModelURI != null : !REMOTE_MODEL_URI_EDEFAULT.equals(remoteModelURI);
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI:
				return REPOSITORY_FOLDER_URI_EDEFAULT == null ? repositoryFolderURI != null : !REPOSITORY_FOLDER_URI_EDEFAULT.equals(repositoryFolderURI);
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (localModelURI: ");
		result.append(localModelURI);
		result.append(", remoteModelURI: ");
		result.append(remoteModelURI);
		result.append(", repositoryFolderURI: ");
		result.append(repositoryFolderURI);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

}