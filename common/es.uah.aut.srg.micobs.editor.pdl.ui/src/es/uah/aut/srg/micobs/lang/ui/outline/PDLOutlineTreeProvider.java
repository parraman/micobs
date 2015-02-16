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
package es.uah.aut.srg.micobs.lang.ui.outline;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;

import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.xtext.MICOBSOutlineTreeProvider;

/**
 * customization of the default outline structure
 * 
 */
public class PDLOutlineTreeProvider extends MICOBSOutlineTreeProvider {

	protected void _createNode(IOutlineNode parentNode, MOSSupportedOSAPI osapi)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, osapi.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Supported OSAPIs", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MOSSupportedOSAPIsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, osapi.eContainmentFeature(), group);
		}
		createEObjectNode(group, osapi);
	}
	
	protected void _createNode(IOutlineNode parentNode, MOSSupportedPlatform ossp)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, ossp.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Supported Platforms", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MOSSupportedPlatformsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, ossp.eContainmentFeature(), group);
		}
		createEObjectNode(group, ossp);
	}
	
}
