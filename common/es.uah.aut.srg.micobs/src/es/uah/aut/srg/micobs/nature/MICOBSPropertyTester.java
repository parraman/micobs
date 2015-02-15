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
package es.uah.aut.srg.micobs.nature;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

/**
 * Class used to check whether a project has the MICOBS nature or not.
 *
 */
public class MICOBSPropertyTester extends PropertyTester {

	private static final String PROPERTY_IS_MICOBS_PROJECT = "isMICOBSProject";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if (property.equals(PROPERTY_IS_MICOBS_PROJECT))
		{
			if (!(receiver instanceof IResource))
				return false;
			
			IResource resource = (IResource)receiver;
			IProject project = resource.getProject();
			
			return MICOBSProjectNature.hasNature(project);
		}
		return false;
	}

}
