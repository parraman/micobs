/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 * 
 * Based on an original implementation of Geppeto by cloudsmith.
 * http://cloudsmith.github.io/geppetto/
 * 
 ******************************************************************************/
package es.uah.aut.srg.micobs.xtext;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

public class MICOBSDescriptionAssociator {

	@Inject
	protected TerminalsGrammarAccess ga;
	
	protected TerminalRule ML_COMMENTRule; 
	protected TerminalRule SL_COMMENTRule; 
	protected TerminalRule WS_Rule;
	
	private boolean hasNonWSBeforeStart(String text, INode node) {
		int offset = node.getOffset();
		for(int pos = offset - 1; pos >= 0; pos--) {
			char c = text.charAt(pos);
			if(c == '\r' || c == '\n')
				return false;
			if(c > ' ')
				return true;
		}
		// reached start of parsed text
		return false;
	}
	
	public void linkDocumentation(EObject model) {
		
		final TerminalRule mlRule = ga.getML_COMMENTRule();
		final TerminalRule slRule = ga.getSL_COMMENTRule();
		final TerminalRule wsRule = ga.getWSRule();
		
		ICompositeNode node = NodeModelUtils.getNode(model);
		ICompositeNode root = node.getRootNode();
		
		List<INode> commentSequence = Lists.newArrayList();
		BidiTreeIterator<INode> itor = root.getAsTreeIterable().iterator();
		
		while(itor.hasNext()) {
			INode x = itor.next();
			EObject grammarElement = x.getGrammarElement();
			// process comments
			if(grammarElement == slRule || grammarElement == mlRule) {
				
				// skip all whitespace unless it contains a break which also breaks collection
				INode sibling = x.getNextSibling();
				while(sibling != null && sibling.getGrammarElement() == wsRule) {
					sibling = sibling.getNextSibling();
				}
				if(sibling == null) {
					commentSequence.clear();
					continue;
				}

				// if adding a ML comment, use only the last, if adding a SL drop a preceding ML rule
				if(commentSequence.size() > 0) {
					if(grammarElement == mlRule)
						commentSequence.clear();
					else if(grammarElement == slRule &&
							commentSequence.get(commentSequence.size() - 1).getGrammarElement() == mlRule)
						commentSequence.clear();
				}
				commentSequence.add(x);

				// if comment has anything but whitespace before its start (on same line), it is not a documentation comment
				if(hasNonWSBeforeStart(root.getText(), x)) {
					commentSequence.clear();
					continue;
				}
				// if next is not a comment, it may be an element that the documentation should be associated with,
				// but keep collecting if next is a comment
				EObject siblingElement = sibling.getGrammarElement();
				if(siblingElement == ga.getSL_COMMENTRule() || siblingElement == ga.getML_COMMENTRule())
					continue; // keep on collecting

				EObject semantic = NodeModelUtils.findActualSemanticObjectFor(sibling);

				// check that a comment inside a structure (i.e. starts after the start of the structure)
				// is not mistaken as following
				EObject commentSemantic = NodeModelUtils.findActualSemanticObjectFor(x);
				if(commentSemantic == semantic &&
						x.getOffset() > NodeModelUtils.findActualNodeFor(semantic).getOffset())
					continue;
				
				if(semantic instanceof MCommonReferenceableObj) {
					MCommonReferenceableObj object = (MCommonReferenceableObj) semantic;
					// found sequence is documentation for semantic
					associateDescription(object, commentSequence);
					// need a new sequence, or the one just given away may be cleared
					commentSequence = Lists.newArrayList();
				}
				// next was not the right kind of element
				commentSequence.clear();
			}
		}
	}
	
	private void associateDescription(MCommonReferenceableObj object, List<INode> commentSequence) {
		
		StringBuffer buf = new StringBuffer();
		for(INode n : commentSequence)
		{
			String s[] = n.getText().split("[\\r\\n]+");
			if (s.length > 0)
			{
				int i = 0;
				for (i = 0; i < s.length; i++)
				{
					String line = s[i].replaceFirst("[' '\\t\\/\\*\\n]+", "").replaceAll("[' '\\t\\/\\*]+$", "").trim();
					if (line.length() != 0)
					{
						buf.append(line);
						break;
					}
				}
				i++;
				for (; i < s.length; i++)
				{
					String line = s[i].replaceFirst("[' '\\t\\/\\*\\n]+", "").replaceAll("[' '\\t\\/\\*]+$", "").trim();
					if (line.length() != 0)
					{
						buf.append('\n' + line);
					}			
				}
			}

		}

		object.setDescription(buf.toString());

	}
	
}
