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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary;


/**
 * A representation of an MCLEV Library versioned item corresponding to the
 * model of a regular component.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwPackageURI <em>Sw Package URI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwPackageVersion <em>Sw Package Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemComponent()
 * @model
 * @generated
 */
public interface MMCLEVVersionedItemComponent extends MMCLEVPackageVersionedItem {
	/**
	 * Returns the URI of the MESP software package that stores the
	 * implementation of the component or <code>null</code> if no software
	 * package is defined for the component.
	 * @return the URI of the attached MESP software package or
	 * <code>null</code> if no software package is defined for the component.
	 * @see #setSwPackageURI(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemComponent_SwPackageURI()
	 * @model
	 * @generated
	 */
	String getSwPackageURI();

	/**
	 * Sets the URI of the MESP software package that stores the
	 * implementation of the component.
	 * @param value the new URI of the attached MESP software package.
	 * @see #getSwPackageURI()
	 * @generated
	 */
	void setSwPackageURI(String value);

	/**
	 * Returns the version of the MESP software package that stores the
	 * implementation of the component or <code>null</code> if no software
	 * package is defined for the component.
	 * @return the version of the attached MESP software package or
	 * <code>null</code> if no software package is defined for the component.
	 * @see #setSwPackageVersion(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemComponent_SwPackageVersion()
	 * @model
	 * @generated
	 */
	String getSwPackageVersion();

	/**
	 * Sets the version of the MESP software package that stores the
	 * implementation of the component.
	 * @param value the new version of the attached MESP software package.
	 * @see #getSwPackageVersion()
	 * @generated
	 */
	void setSwPackageVersion(String value);

	/**
	 * Returns the value of the '<em><b>Sw Interface URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Interface URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Interface URI</em>' attribute.
	 * @see #setSwInterfaceURI(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemComponent_SwInterfaceURI()
	 * @model
	 * @generated
	 */
	String getSwInterfaceURI();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwInterfaceURI <em>Sw Interface URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Interface URI</em>' attribute.
	 * @see #getSwInterfaceURI()
	 * @generated
	 */
	void setSwInterfaceURI(String value);

	/**
	 * Returns the value of the '<em><b>Sw Interface Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Interface Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Interface Version</em>' attribute.
	 * @see #setSwInterfaceVersion(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemComponent_SwInterfaceVersion()
	 * @model
	 * @generated
	 */
	String getSwInterfaceVersion();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent#getSwInterfaceVersion <em>Sw Interface Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Interface Version</em>' attribute.
	 * @see #getSwInterfaceVersion()
	 * @generated
	 */
	void setSwInterfaceVersion(String value);

}