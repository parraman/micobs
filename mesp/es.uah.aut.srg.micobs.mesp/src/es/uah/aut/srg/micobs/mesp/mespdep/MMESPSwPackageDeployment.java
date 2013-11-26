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
package es.uah.aut.srg.micobs.mesp.mespdep;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;

/**
 * A representation of a software package deployed as part of a deployment
 * alternative or of the root of a deployment model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment#getSwPackage <em>Sw Package</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPSwPackageDeployment()
 * @model
 * @generated
 */
public interface MMESPSwPackageDeployment extends EObject {
	/**
	 * Returns the software package that is being deployed.
	 * @return the software package that is being deployed.
	 * @see #setSwPackage(MSwPackage)
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPSwPackageDeployment_SwPackage()
	 * @model required="true"
	 * @generated
	 */
	MSwPackage getSwPackage();

	/**
	 * Sets the software package that is being deployed.
	 * @param value the new software package.
	 * @see #getSwPackage()
	 * @generated
	 */
	void setSwPackage(MSwPackage value);

	/**
	 * Returns the list of value assignments of the configuration parameters
	 * of the software package.
	 * @return the list of value assignments of the configuration parameters
	 * of the software package.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPSwPackageDeployment_ParameterValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getParameterValueAssignments();

}
