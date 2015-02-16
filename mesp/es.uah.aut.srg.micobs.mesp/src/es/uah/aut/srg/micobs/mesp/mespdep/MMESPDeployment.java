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
package es.uah.aut.srg.micobs.mesp.mespdep;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a MESP deployment model. A MESP deployment defines the
 * list of software packages that will be deployed and the list of deployment
 * platforms. The software packages deployment can be organized in different
 * deployment alternatives.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getCtool <em>Ctool</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeployedSwPackages <em>DeployedSwPackages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeploymentAlternatives <em>Deployment Alternatives</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeploymentPlatforms <em>Deployment Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployment()
 * @model
 * @generated
 */
public interface MMESPDeployment extends MMESPDEPPackageElement {
	/**
	 * Returns the construction tool used to obtain the final executable files.
	 * @return the construction tool used to obtain the final executable files.
	 * @see #setCtool(MConstructionTool)
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployment_Ctool()
	 * @model required="true"
	 * @generated
	 */
	MConstructionTool getCtool();

	/**
	 * Sets the construction tool used to obtain the final executable files.
	 * @param value the new construction tool used to obtain the final executable files.
	 * @see #getCtool()
	 * @generated
	 */
	void setCtool(MConstructionTool value);

	/**
	 * Returns the list of languages in which the main code of the application
	 * is implemented.
	 * @return the list of languages in which the main code of the application
	 * is implemented.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployment_Languages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the list of software interfaces required by the main code
	 * of the application independently of the deployment platform or
	 * alternative.
	 * @return the list of software interfaces required by the main code
	 * of the application independently of the deployment platform or
	 * alternative.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployment_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSwPackageRequiredInterface> getRequires();

	/**
	 * Returns the list of software packages deployed independently of the
	 * deployment platform or alternative.
	 * @return the value of the '<em>DeployedSwPackages</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployment_DeployedSwPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMESPSwPackageDeployment> getDeployedSwPackages();

	/**
	 * Returns the list of deployment alternatives of the root deployment
	 * model.
	 * @return the list of deployment alternatives of the root deployment
	 * model.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployment_DeploymentAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMESPDeploymentAlternative> getDeploymentAlternatives();

	/**
	 * Returns the list of deployment platforms.
	 * @return the list of deployment platforms.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployment_DeploymentPlatforms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MMESPDeploymentPlatform> getDeploymentPlatforms();

}
