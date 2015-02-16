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
package es.uah.aut.srg.micobs.mesp.util.ui;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;

/**
 * Implementation of a basic label provider for a MESP deployment
 * platform.
 */
public class MMESPDeploymentPlatformLabelProvider extends BaseLabelProvider implements ILabelProvider
{
	public MMESPDeploymentPlatformLabelProvider() {
		super();
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}

	@Override
	public String getText(Object element) {
		
		if(element == null ||
		   !(element instanceof MMESPDeploymentPlatform) ||
		   ((MMESPDeploymentPlatform)element).getName() == null ||
		   ((MMESPDeploymentPlatform)element).getName().length() == 0)
		{
			return "";
		}
		return ((MMESPDeploymentPlatform)element).getName();
	}
}
