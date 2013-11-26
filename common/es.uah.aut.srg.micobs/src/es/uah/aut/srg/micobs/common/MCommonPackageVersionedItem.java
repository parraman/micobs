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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.ecore.EObject;

/**
 * MICOBS common package versioned item class. This class represents a model
 * element that is stored in a library. These objects are located under an
 * {@link MCommonPackageItem} object and each one corresponds to a different
 * version of the same element. The attributes of versioned items include
 * the version of the corresponding model element, the URI of the local file
 * that stores the element, the URI of the remote folder that store the file
 * and the remote URI of the file itself.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getLocalModelURI <em>LocalModelURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getRemoteModelURI <em>RemoteModelURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getRepositoryFolderURI <em>RepositoryFolderURI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageVersionedItem()
 * @model abstract="true"
 * @generated
 */
public interface MCommonPackageVersionedItem extends EObject {
	/**
	 * Returns the URI of the local file that stores the element.
	 * @return the URI of the local file that stores the element.
	 * @see #setLocalModelURI(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageVersionedItem_LocalModelURI()
	 * @model required="true"
	 * @generated
	 */
	String getLocalModelURI();

	/**
	 * Sets the URI of the local file that stores the element.
	 * @param value the new URI of the local file that stores the element.
	 * @see #getLocalModelURI()
	 * @generated
	 */
	void setLocalModelURI(String value);

	/**
	 * Returns the remote URI of the file that stores the element.
	 * @return the remote URI of the file that stores the element.
	 * @see #setRemoteModelURI(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageVersionedItem_RemoteModelURI()
	 * @model
	 * @generated
	 */
	String getRemoteModelURI();

	/**
	 * Sets the remote URI of the file that stores the element.
	 * @param value the new remote URI of the file that stores the element.
	 * @see #getRemoteModelURI()
	 * @generated
	 */
	void setRemoteModelURI(String value);

	/**
	 * Returns the URI of the remote folder that stores the element.
	 * @return the URI of the remote folder that stores the element.
	 * @see #setRepositoryFolderURI(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageVersionedItem_RepositoryFolderURI()
	 * @model
	 * @generated
	 */
	String getRepositoryFolderURI();

	/**
	 * Sets the URI of the remote folder that stores the element.
	 * @param value the new URI of the remote folder that stores the element.
	 * @see #getRepositoryFolderURI()
	 * @generated
	 */
	void setRepositoryFolderURI(String value);

	/**
	 * Returns the version of the item.
	 * @return the version of the item.
	 * @see #setVersion(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageVersionedItem_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the version of the item.
	 * @param value the new version of the item.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

}
