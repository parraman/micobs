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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.adapter;

import es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.adapter.impl.EmptyMESPDeploymentProjectCreator;
import es.uah.aut.srg.micobs.mesp.mespctool.adapter.ConstructionToolAdapter;
import es.uah.aut.srg.micobs.mesp.mespctool.generator.IEmptyMESPDeploymentProjectCreator;

/**
 * Adapter class for the GNU Make Construction Tool. 
 *
 */
public class CToolGNUMakeAdapter extends ConstructionToolAdapter {
	
	EmptyMESPDeploymentProjectCreator emptyMESPDeploymentProjectCreator;
	
	@Override
	public boolean isAdapterForType(Object type) {
		if (type == IEmptyMESPDeploymentProjectCreator.class)
		{
			return true;
		}
		return super.isAdapterForType(type);
	}
	
	@Override
	public Object adapt(Object type) {
		if (type == IEmptyMESPDeploymentProjectCreator.class)
		{
			if (emptyMESPDeploymentProjectCreator == null)
			{
				emptyMESPDeploymentProjectCreator = new EmptyMESPDeploymentProjectCreator();
			}
			return emptyMESPDeploymentProjectCreator;
		}
		return super.adapt(type);
	}

}
