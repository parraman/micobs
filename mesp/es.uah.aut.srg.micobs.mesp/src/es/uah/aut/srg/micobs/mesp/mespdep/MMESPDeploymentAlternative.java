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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a MESP deployment alternative.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeploymentPlatforms <em>Deployment Platforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeployedSwPackages <em>DeployedSwPackages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeploymentAlternatives <em>Deployment Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeploymentAlternative()
 * @model
 * @generated
 */
public interface MMESPDeploymentAlternative extends MCommonReferenceableObj {
	/**
	 * Returns the list of deployment platforms attached to the alternative.
	 * @return the list of deployment platforms attached to the alternative.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeploymentAlternative_DeploymentPlatforms()
	 * @model required="true"
	 * @generated
	 */
	EList<MMESPDeploymentPlatform> getDeploymentPlatforms();

	/**
	 * Returns the list of languages in which the main code is implemented
	 * for this particular deployment alternative.
	 * @return the list of languages in which the main code is implemented
	 * for this particular deployment alternative.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeploymentAlternative_Languages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the software interfaces required by the main code of the application
	 * for this particular alternative.
	 * @return the software interfaces required by the main code of the application
	 * for this particular alternative.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeploymentAlternative_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSwPackageRequiredInterface> getRequires();

	/**
	 * Returns the list of software packages deployed for this particular alternative.
	 * @return the list of software packages deployed for this particular alternative.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeploymentAlternative_DeployedSwPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMESPSwPackageDeployment> getDeployedSwPackages();

	/**
	 * Returns the list of sub-alternatives of the alternative.
	 * @return the list of sub-alternatives of the alternative.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeploymentAlternative_DeploymentAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMESPDeploymentAlternative> getDeploymentAlternatives();

}
