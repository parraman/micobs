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
package es.uah.aut.srg.micobs.mclev.domain.nulldomain.adapter;

import es.uah.aut.srg.micobs.mclev.domain.nulldomain.adapter.impl.EmptyMCLEVDeploymentProjectCreator;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapter;
import es.uah.aut.srg.micobs.mclev.mclevdom.generator.IEmptyMCLEVDeploymentProjectCreator;

public class NULLDomainDomainAdapter extends DomainAdapter {
	
	EmptyMCLEVDeploymentProjectCreator emptyMCLEVDeploymentProjectCreator;
	
	@Override
	public boolean isAdapterForType(Object type) {
		if (type == IEmptyMCLEVDeploymentProjectCreator.class)
		{
			return true;
		}
		return super.isAdapterForType(type);
	}
	
	@Override
	public Object adapt(Object type) {
		if (type == IEmptyMCLEVDeploymentProjectCreator.class)
		{
			if (emptyMCLEVDeploymentProjectCreator == null)
			{
				emptyMCLEVDeploymentProjectCreator = new EmptyMCLEVDeploymentProjectCreator();
			}
			return emptyMCLEVDeploymentProjectCreator;
		}
		return super.adapt(type);
	}

}
