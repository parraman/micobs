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
package es.uah.aut.srg.micobs.mclev.mclevdom.checkers;

import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapter;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;

/**
 * Interface that can be used to install a given set of restriction checkers
 * for the deployment models attached to a given domain.
 * 
 * When a domain is defined, it can define an adapter for this interface by
 * installing a proper {@link DomainAdapter}
 */
public interface IDeploymentChecker {

	/**
	 * Checks that the instance deployment is done in accordance with the
	 * domain's restrictions.
	 * @param deployment the deployment model to be check.
	 * @return a {@link CheckingDiagnostic} object with the result.
	 */
	public CheckingDiagnostic instanceChecking(MMCADeployment deployment);
	
	/**
	 * Checks that the definition of the connections of a given deployment
	 * model is done in accordance with the domain's restrictions.
	 * @param deployment the deployment model to be check.
	 * @return a {@link CheckingDiagnostic} object with the result.
	 */
	public CheckingDiagnostic connectionChecking(MMCADeployment deployment);
	
	/**
	 * Performs a global validation on a given deployment model.
	 * @param deployment the deployment model to be check.
	 * @return a {@link CheckingDiagnostic} object with the result.
	 */
	public CheckingDiagnostic validateDeployment(MMCADeployment deployment);
	
}
