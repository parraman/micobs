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

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.xtext.MESPOutlineTreeProvider;

/**
 * customization of the default outline structure
 * 
 */
public class DEPOutlineTreeProvider extends MESPOutlineTreeProvider {
	
	/**
	 * Groups a list of deployment platforms.
	 * @param parentNode the parent node of the group.
	 * @param dplt a deployment platform belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MMESPDeploymentPlatform dplt)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, dplt.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Deployment Platforms", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MMESPDeploymentPlatformsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, dplt.eContainmentFeature(), group);
		}
		createEObjectNode(group, dplt);
	}
	
	/**
	 * Groups a list of deployment alternatives.
	 * @param parentNode the parent node of the group.
	 * @param dalt a deployment alternative belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MMESPDeploymentAlternative dalt)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, dalt.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Deployment Alternatives", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MMESPDeploymentPlatformsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, dalt.eContainmentFeature(), group);
		}
		createEObjectNode(group, dalt);
	}
	
	/**
	 * Groups a list of deployed software packages.
	 * @param parentNode the parent node of the group.
	 * @param swpd a deployed software package belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MMESPSwPackageDeployment swpd)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, swpd.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Software Packages", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MMESPDeployedSwPackagesList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, swpd.eContainmentFeature(), group);
		}
		createEObjectNode(group, swpd);
	}
}
