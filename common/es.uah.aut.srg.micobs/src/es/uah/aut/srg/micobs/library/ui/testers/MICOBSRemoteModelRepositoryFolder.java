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
package es.uah.aut.srg.micobs.library.ui.testers;

import org.eclipse.core.expressions.PropertyTester;

import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;

/**
 * This tester checks if a given versioned item has the repository folder
 * URI field defined.
 *
 */
public class MICOBSRemoteModelRepositoryFolder extends PropertyTester {

	private static final String PROPERTY_HAS_FOLDER = "hasFolder";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (property.equals(PROPERTY_HAS_FOLDER))
		{
			if (!(receiver instanceof MCommonPackageVersionedItem))
				return false;
			
			return (((MCommonPackageVersionedItem)receiver).getRepositoryFolderURI() != null);
		}
		return false;
	}

}
