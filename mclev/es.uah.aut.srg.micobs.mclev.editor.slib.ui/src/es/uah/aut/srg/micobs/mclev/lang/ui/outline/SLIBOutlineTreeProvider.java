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
package es.uah.aut.srg.micobs.mclev.lang.ui.outline;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;

import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.xtext.MICOBSOutlineTreeProvider;

/**
 * customization of the default outline structure
 * 
 */
public class SLIBOutlineTreeProvider extends MICOBSOutlineTreeProvider {

	protected void _createNode(IOutlineNode parentNode, MServiceLibrarySupportedPlatform pres)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, pres.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Supported Platforms", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MServiceLibrarySupportedPlatformsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, pres.eContainmentFeature(), group);
		}
		createEObjectNode(group, pres);
	}
	
	protected void _createNode(IOutlineNode parentNode, MServiceLibraryProvidedSAI pres)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, pres.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Provided SAIs", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MServiceLibraryProvidedSAIsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, pres.eContainmentFeature(), group);
		}
		createEObjectNode(group, pres);
	}
	
}
