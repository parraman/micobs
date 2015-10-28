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
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapter;

/**
 * Interface that can be used to install a given set of restriction checkers
 * for the components defined by a given domain.
 * 
 * When a domain is defined, it can define an adapter for this interface by
 * installing a proper {@link DomainAdapter}
 */
public interface IComponentChecker {

	/**
	 * Checks that the port instantiation defined by a given component is
	 * done in accordance with the domain's restrictions.
	 * @param component the component to be check.
	 * @return a {@link CheckingDiagnostic} object with the result.
	 */
	public CheckingDiagnostic portChecking(MAbstractComponent component);
	
	/**
	 * Checks that the internal instances defined as part of the internal
	 * architecture of a given component are done in accordance with the
	 * domain's restrictions.
	 * @param component the component to be check.
	 * @return a {@link CheckingDiagnostic} object with the result.
	 */
	public CheckingDiagnostic instanceChecking(MComponent component);

	/**
	 * Checks that the connections defined as part of the internal
	 * architecture of a given component are done in accordance with the
	 * domain's restrictions.
	 * @param component the component to be check.
	 * @return a {@link CheckingDiagnostic} object with the result.
	 */
	public CheckingDiagnostic connectionChecking(MComponent component);

	/**
	 * Performs a global validation on a given component.
	 * @param component the component to be check.
	 * @return a {@link CheckingDiagnostic} object with the result.
	 */
	public CheckingDiagnostic validateComponent(MAbstractComponent component);
	
}
