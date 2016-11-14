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
package es.uah.aut.srg.micobs.mesp.lang.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import es.uah.aut.srg.micobs.mesp.lang.services.PSWPGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class PSWPParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private PSWPGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_Group(this, this, 0, inst);
			case 1: return new MMESPPSWPPackageElement_MPlatformSwPackageParserRuleCall(this, this, 1, inst);
			case 2: return new MPlatformSwPackage_Group(this, this, 2, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMESPPSWPPackageFile ****************
 *
 * MMESPPSWPPackageFile:
 * 	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
 * 	imports+=[common::MCommonPackage|QualifiedName] ';')*
 * 	element=MMESPPSWPPackageElement;
 *
 **/

// 'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
// imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMESPPSWPPackageElement
protected class MMESPPSWPPackageFile_Group extends GroupToken {
	
	public MMESPPSWPPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPPSWPPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'package'
protected class MMESPPSWPPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMESPPSWPPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mesplibrary::MMESPPackage|QualifiedName]
protected class MMESPPSWPPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMESPPSWPPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPPSWPPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMESPPSWPPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('import' imports+=[common::MCommonPackage|QualifiedName] ';')*
protected class MMESPPSWPPackageFile_Group_3 extends GroupToken {
	
	public MMESPPSWPPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'import'
protected class MMESPPSWPPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMESPPSWPPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPPSWPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMESPPSWPPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMESPPSWPPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPPSWPPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMESPPSWPPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMESPPSWPPackageElement
protected class MMESPPSWPPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMESPPSWPPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPPSWPPackageElement_MPlatformSwPackageParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPPSWPPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMESPPSWPPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPPSWPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMESPPSWPPackageFile ****************/


/************ begin Rule MMESPPSWPPackageElement ****************
 *
 * MMESPPSWPPackageElement:
 * 	MPlatformSwPackage;
 *
 **/

// MPlatformSwPackage
protected class MMESPPSWPPackageElement_MPlatformSwPackageParserRuleCall extends RuleCallToken {
	
	public MMESPPSWPPackageElement_MPlatformSwPackageParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMPlatformSwPackageRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MPlatformSwPackage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMESPPSWPPackageElement ****************/






/************ begin Rule MPlatformSwPackage ****************
 *
 * MPlatformSwPackage:
 * 	'pswpackage'
 * 	name=ID
 * 	'{' ('version' ':=' version=Version ';' & 'supported' 'platform' ':='
 * 	referencedElement=[pdl::MPlatform|VersionedQualifiedName] ';' & 'construction' 'tools' ':='
 * 	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
 * 	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & 'osswpackages' ':='
 * 	osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
 * 	osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ';')
 * 	'}' ';';
 *
 **/

// 'pswpackage' name=ID '{' ('version' ':=' version=Version ';' & 'supported' 'platform' ':='
// referencedElement=[pdl::MPlatform|VersionedQualifiedName] ';' & 'construction' 'tools' ':='
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & 'osswpackages' ':='
// osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
// osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ';') '}' ';'
protected class MPlatformSwPackage_Group extends GroupToken {
	
	public MPlatformSwPackage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMPlatformSwPackageRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'pswpackage'
protected class MPlatformSwPackage_PswpackageKeyword_0 extends KeywordToken  {
	
	public MPlatformSwPackage_PswpackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MPlatformSwPackage_NameAssignment_1 extends AssignmentToken  {
	
	public MPlatformSwPackage_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_PswpackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MPlatformSwPackage_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MPlatformSwPackage_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('version' ':=' version=Version ';' & 'supported' 'platform' ':='
// referencedElement=[pdl::MPlatform|VersionedQualifiedName] ';' & 'construction' 'tools' ':='
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & 'osswpackages' ':='
// osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
// osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ';')
protected class MPlatformSwPackage_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MPlatformSwPackage_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version' ':=' version=Version ';'
protected class MPlatformSwPackage_Group_3_0 extends GroupToken {
	
	public MPlatformSwPackage_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_SemicolonKeyword_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version'
protected class MPlatformSwPackage_VersionKeyword_3_0_0 extends KeywordToken  {
	
	public MPlatformSwPackage_VersionKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MPlatformSwPackage_ColonEqualsSignKeyword_3_0_1 extends KeywordToken  {
	
	public MPlatformSwPackage_ColonEqualsSignKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_VersionKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MPlatformSwPackage_VersionAssignment_3_0_2 extends AssignmentToken  {
	
	public MPlatformSwPackage_VersionAssignment_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getVersionAssignment_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_ColonEqualsSignKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MPlatformSwPackage_SemicolonKeyword_3_0_3 extends KeywordToken  {
	
	public MPlatformSwPackage_SemicolonKeyword_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_VersionAssignment_3_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'supported' 'platform' ':=' referencedElement=[pdl::MPlatform|VersionedQualifiedName] ';'
protected class MPlatformSwPackage_Group_3_1 extends GroupToken {
	
	public MPlatformSwPackage_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_SemicolonKeyword_3_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'supported'
protected class MPlatformSwPackage_SupportedKeyword_3_1_0 extends KeywordToken  {
	
	public MPlatformSwPackage_SupportedKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getSupportedKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'platform'
protected class MPlatformSwPackage_PlatformKeyword_3_1_1 extends KeywordToken  {
	
	public MPlatformSwPackage_PlatformKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getPlatformKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_SupportedKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MPlatformSwPackage_ColonEqualsSignKeyword_3_1_2 extends KeywordToken  {
	
	public MPlatformSwPackage_ColonEqualsSignKeyword_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_PlatformKeyword_3_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// referencedElement=[pdl::MPlatform|VersionedQualifiedName]
protected class MPlatformSwPackage_ReferencedElementAssignment_3_1_3 extends AssignmentToken  {
	
	public MPlatformSwPackage_ReferencedElementAssignment_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_ColonEqualsSignKeyword_3_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("referencedElement",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("referencedElement");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MPlatformSwPackage_SemicolonKeyword_3_1_4 extends KeywordToken  {
	
	public MPlatformSwPackage_SemicolonKeyword_3_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_ReferencedElementAssignment_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';'
protected class MPlatformSwPackage_Group_3_2 extends GroupToken {
	
	public MPlatformSwPackage_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_SemicolonKeyword_3_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'construction'
protected class MPlatformSwPackage_ConstructionKeyword_3_2_0 extends KeywordToken  {
	
	public MPlatformSwPackage_ConstructionKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getConstructionKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'tools'
protected class MPlatformSwPackage_ToolsKeyword_3_2_1 extends KeywordToken  {
	
	public MPlatformSwPackage_ToolsKeyword_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getToolsKeyword_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_ConstructionKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MPlatformSwPackage_ColonEqualsSignKeyword_3_2_2 extends KeywordToken  {
	
	public MPlatformSwPackage_ColonEqualsSignKeyword_3_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_ToolsKeyword_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MPlatformSwPackage_CtoolsAssignment_3_2_3 extends AssignmentToken  {
	
	public MPlatformSwPackage_CtoolsAssignment_3_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_ColonEqualsSignKeyword_3_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
protected class MPlatformSwPackage_Group_3_2_4 extends GroupToken {
	
	public MPlatformSwPackage_Group_3_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_CtoolsAssignment_3_2_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MPlatformSwPackage_CommaKeyword_3_2_4_0 extends KeywordToken  {
	
	public MPlatformSwPackage_CommaKeyword_3_2_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPlatformSwPackage_CtoolsAssignment_3_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MPlatformSwPackage_CtoolsAssignment_3_2_4_1 extends AssignmentToken  {
	
	public MPlatformSwPackage_CtoolsAssignment_3_2_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_CommaKeyword_3_2_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MPlatformSwPackage_SemicolonKeyword_3_2_5 extends KeywordToken  {
	
	public MPlatformSwPackage_SemicolonKeyword_3_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPlatformSwPackage_CtoolsAssignment_3_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// 'osswpackages' ':=' osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
// osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ';'
protected class MPlatformSwPackage_Group_3_3 extends GroupToken {
	
	public MPlatformSwPackage_Group_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_SemicolonKeyword_3_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'osswpackages'
protected class MPlatformSwPackage_OsswpackagesKeyword_3_3_0 extends KeywordToken  {
	
	public MPlatformSwPackage_OsswpackagesKeyword_3_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MPlatformSwPackage_ColonEqualsSignKeyword_3_3_1 extends KeywordToken  {
	
	public MPlatformSwPackage_ColonEqualsSignKeyword_3_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_OsswpackagesKeyword_3_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName]
protected class MPlatformSwPackage_OsSwPackagesAssignment_3_3_2 extends AssignmentToken  {
	
	public MPlatformSwPackage_OsSwPackagesAssignment_3_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_ColonEqualsSignKeyword_3_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osSwPackages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osSwPackages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])*
protected class MPlatformSwPackage_Group_3_3_3 extends GroupToken {
	
	public MPlatformSwPackage_Group_3_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_OsSwPackagesAssignment_3_3_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MPlatformSwPackage_CommaKeyword_3_3_3_0 extends KeywordToken  {
	
	public MPlatformSwPackage_CommaKeyword_3_3_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_3_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPlatformSwPackage_OsSwPackagesAssignment_3_3_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName]
protected class MPlatformSwPackage_OsSwPackagesAssignment_3_3_3_1 extends AssignmentToken  {
	
	public MPlatformSwPackage_OsSwPackagesAssignment_3_3_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_CommaKeyword_3_3_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osSwPackages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osSwPackages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MPlatformSwPackage_SemicolonKeyword_3_3_4 extends KeywordToken  {
	
	public MPlatformSwPackage_SemicolonKeyword_3_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_Group_3_3_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPlatformSwPackage_OsSwPackagesAssignment_3_3_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MPlatformSwPackage_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MPlatformSwPackage_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MPlatformSwPackage_SemicolonKeyword_5 extends KeywordToken  {
	
	public MPlatformSwPackage_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatformSwPackage_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MPlatformSwPackage ****************/

}
