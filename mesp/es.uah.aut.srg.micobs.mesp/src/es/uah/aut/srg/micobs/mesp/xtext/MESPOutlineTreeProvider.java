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
package es.uah.aut.srg.micobs.mesp.xtext;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.xtext.MICOBSOutlineTreeProvider;

/**
 * MESP common outline tree provider for Xtext file editors.
 *
 */
public class MESPOutlineTreeProvider extends MICOBSOutlineTreeProvider {

	
	protected void _createChildren(EObjectNode node, 
			MInstantiableResourceDemand demand) {

	}
	
	protected void _createChildren(EObjectNode node, 
			MQuantifiableResourceDemand demand) {

	}
	
	/**
	 * Groups a list of provided resources in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param pres a resource belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MProvidedResource pres)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, pres.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Provided Resources", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MProvidedResourcesList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, pres.eContainmentFeature(), group);
		}
		createEObjectNode(group, pres);
	}
	
	/**
	 * Groups a list of required software interfaces in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param pres a required software interfaces belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MSwPackageRequiredInterface rswi)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, rswi.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Required Interfaces", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MSwPackageRequiredInterfacesList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, rswi.eContainmentFeature(), group);
		}
		createEObjectNode(group, rswi);
	}
	
}
