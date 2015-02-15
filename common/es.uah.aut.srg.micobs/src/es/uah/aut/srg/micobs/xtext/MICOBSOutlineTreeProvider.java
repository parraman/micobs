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
package es.uah.aut.srg.micobs.xtext;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueRange;

/**
 * MICOBS common outline tree provider for Xtext file editors.
 *
 */
public class MICOBSOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject
	protected ResourceLocator resourceLocator;
	
	protected void _createChildren(EObjectNode node, 
			MParameter parameter) {

	}
	
	protected void _createChildren(EObjectNode node, 
			MParameterValueAssignment parameter) {

	}
	
	/**
	 * Groups a list of parameters in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param param a parameter belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MParameter param)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, param.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Parameters", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MParametersList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, param.eContainmentFeature(), group);
		}
		createEObjectNode(group, param);
	}
	
	
	/**
	 * Groups a list of parameter value assignments in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param pva a value assignment belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MParameterValueAssignment pva)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, pva.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Parameter Value Assignments", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MParameterValueAssignmentsList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, pva.eContainmentFeature(), group);
		}
		createEObjectNode(group, pva);
	}
	
	/**
	 * Groups a list of parameter value ranges in an outline node.
	 * @param parentNode the parent node of the group.
	 * @param pvr a parameter value range belonging to the group.
	 */
	protected void _createNode(IOutlineNode parentNode, MParameterValueRange pvr)
	{
		OutlineNodeGroup group = findExistingNode(parentNode, pvr.eContainmentFeature());
		if (group == null)
		{
			StyledString name = new StyledString("Parameter Value Ranges", StyledString.QUALIFIER_STYLER);
			Image img = ExtendedImageRegistry.getInstance().getImage(resourceLocator.getImage("full/obj16/MParameterValueRangesList"));
			group = new OutlineNodeGroup(parentNode, img, name, false);
			putNode(parentNode, pvr.eContainmentFeature(), group);
		}
		createEObjectNode(group, pvr);
	}
	
	Map<IOutlineNode, Map<EReference, OutlineNodeGroup>> nodeGroupCache = 
			new HashMap<IOutlineNode, Map<EReference, OutlineNodeGroup>>();
	
	/**
	 * Method that looks up for a previously defined node group in the cache
	 * of nodes corresponding to a given list of elements.
	 * 
	 * If there was not an outline node created for the given list, the method
	 * will return <code>null</code>. 
	 * 
	 * @param parent the parent node of the group.
	 * @param reference the reference corresponding to the list of elements to
	 * be grouped.
	 * @return the outline node corresponding to the group or <code>null</code> if
	 * there was no group previously inserted in the cache.
	 */
	protected OutlineNodeGroup findExistingNode(IOutlineNode parent, EReference reference)
	{
		Map<EReference, OutlineNodeGroup> nodes = nodeGroupCache.get(parent);
		if (nodes == null)
		{
			return null;
		}
		return nodes.get(reference);
		
	}
	
	/**
	 * Method that puts a group node in the cache of nodes. This cache is used
	 * store the temporarily created nodes to maintain the coherence between the
	 * model and the outline tree.
	 * 
	 * @param parent the parent node of the group.
	 * @param reference the reference corresponding to the list of elements to be grouped.
	 * @param group the outline node corresponding to the list of elements that has
	 * to be inserted in the cache. 
	 */
	protected void putNode(IOutlineNode parent, EReference reference, OutlineNodeGroup group)
	{
		Map<EReference, OutlineNodeGroup> nodes = nodeGroupCache.get(parent);
		if (nodes == null)
		{
			nodes = new HashMap<EReference, OutlineNodeGroup>();
			nodeGroupCache.put(parent, nodes);
		}
		nodes.put(reference, group);
	}
	
	/**
	 * Class that represents a group node.
	 *
	 */
	protected class OutlineNodeGroup extends AbstractOutlineNode {

		public OutlineNodeGroup(IOutlineNode parent, Image image,
				Object text, boolean isLeaf) {
			super(parent, image, text, isLeaf);
		}

	}
	
}