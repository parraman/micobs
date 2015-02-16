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
package es.uah.aut.srg.micobs.mesp.lang.ui.outline;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;

import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.xtext.MESPOutlineTreeProvider;

/**
 * customization of the default outline structure
 * 
 */
public class SWPOutlineTreeProvider extends MESPOutlineTreeProvider {
	
	/**
	 * Groups a list of provided software interfaces in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param pres a provided software interface belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MSwPackageProvidedInterface pswi)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, pswi.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Provided Interfaces", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MSwPackageProvidedInterfacesList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, pswi.eContainmentFeature(), group);
		}
		createEObjectNode(group, pswi);
	}
	
	/**
	 * Groups a list of software package supported platforms
	 * in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param swpsp a supported platform belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MSwPackageSupportedPlatform swpsp)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, swpsp.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Supported Platforms", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MSwPackageSupportedPlatformsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, swpsp.eContainmentFeature(), group);
		}
		createEObjectNode(group, swpsp);
	}
	
	/**
	 * Groups a list of supported devices in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param swpsp a supported platform belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MDriverSwPackageSupportedDevice spdev)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, spdev.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Supported Devices", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MDriverSwPackageSupportedDevicesList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, spdev.eContainmentFeature(), group);
		}
		createEObjectNode(group, spdev);
	}
}
