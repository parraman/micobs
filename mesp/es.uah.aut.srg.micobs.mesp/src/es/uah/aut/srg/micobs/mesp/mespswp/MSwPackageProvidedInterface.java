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
package es.uah.aut.srg.micobs.mesp.mespswp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;

/**
 * A representation of a provision by a software package of an interface.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface#getSwinterface <em>Swinterface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterface()
 * @model
 * @generated
 */
public interface MSwPackageProvidedInterface extends EObject {
	/**
	 * Returns the interface that is being provided.
	 * @return the interface that is being provided.
	 * @see #setSwinterface(MSwInterface)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterface_Swinterface()
	 * @model required="true"
	 * @generated
	 */
	MSwInterface getSwinterface();

	/**
	 * Sets the interface that is being provided.
	 * @param value the new interface that is being provided.
	 * @see #getSwinterface()
	 * @generated
	 */
	void setSwinterface(MSwInterface value);

	/**
	 * Returns the list of value assignments to the parameters defined by the
	 * interface that is being provided.
	 * @return the list of value assignments to the parameters defined by the
	 * interface that is being provided.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterface_ParameterValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSwPackageProvidedInterfacePVA> getParameterValueAssignments();

}