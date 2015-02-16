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
package es.uah.aut.srg.micobs.mesp.mespswp;

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of a software package provided interface parameter
 * value assignment that depends on a given supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase#getPlatform <em>Platform</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterfacePVASwitchCase()
 * @model
 * @generated
 */
public interface MSwPackageProvidedInterfacePVASwitchCase extends EObject {
	/**
	 * Returns the attached supported platform for which the
	 * value of the parameter will be assigned.
	 * @return the attached supported platform.
	 * @see #setPlatform(MSwPackageSupportedPlatform)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterfacePVASwitchCase_Platform()
	 * @model required="true"
	 * @generated
	 */
	MSwPackageSupportedPlatform getPlatform();

	/**
	 * Sets the attached supported platform for which the
	 * value of the parameter will be assigned.
	 * @param value the new attached supported platform.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(MSwPackageSupportedPlatform value);

	/**
	 * Returns the expression that represents the value that is being
	 * assigned to the parameter.
	 * @return the expression of the value of the parameter.
	 * @see #setParameterValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageProvidedInterfacePVASwitchCase_ParameterValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getParameterValue();

	/**
	 * Sets the expression that represents the value that is being
	 * assigned to the parameter.
	 * @param value the new expression of the value of the parameter.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(MParameterValueExpression value);

}
