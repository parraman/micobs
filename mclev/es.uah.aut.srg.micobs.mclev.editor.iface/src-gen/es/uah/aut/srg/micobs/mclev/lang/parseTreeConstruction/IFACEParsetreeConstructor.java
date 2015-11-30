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
package es.uah.aut.srg.micobs.mclev.lang.parseTreeConstruction;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.lang.services.IFACEGrammarAccess;

@SuppressWarnings("all")
public class IFACEParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private IFACEGrammarAccess grammarAccess;
	
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
			case 0: return new MMCLEVIFACEPackageFile_Group(this, this, 0, inst);
			case 1: return new MMCLEVIFACEPackageElement_MInterfaceParserRuleCall(this, this, 1, inst);
			case 2: return new MInterface_Group(this, this, 2, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMCLEVIFACEPackageFile ****************
 *
 * MMCLEVIFACEPackageFile:
 * 	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
 * 	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVIFACEPackageElement;
 *
 **/

// "package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
// imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVIFACEPackageElement
protected class MMCLEVIFACEPackageFile_Group extends GroupToken {
	
	public MMCLEVIFACEPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCLEVIFACEPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MMCLEVIFACEPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMCLEVIFACEPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVIFACEPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMCLEVIFACEPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVIFACEPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMCLEVIFACEPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[common::MCommonPackage|QualifiedName] ";")*
protected class MMCLEVIFACEPackageFile_Group_3 extends GroupToken {
	
	public MMCLEVIFACEPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MMCLEVIFACEPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMCLEVIFACEPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVIFACEPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMCLEVIFACEPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMCLEVIFACEPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVIFACEPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMCLEVIFACEPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMCLEVIFACEPackageElement
protected class MMCLEVIFACEPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMCLEVIFACEPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIFACEPackageElement_MInterfaceParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVIFACEPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementMMCLEVIFACEPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MMCLEVIFACEPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCLEVIFACEPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMCLEVIFACEPackageFile ****************/


/************ begin Rule MMCLEVIFACEPackageElement ****************
 *
 * MMCLEVIFACEPackageElement:
 * 	MInterface;
 *
 **/

// MInterface
protected class MMCLEVIFACEPackageElement_MInterfaceParserRuleCall extends RuleCallToken {
	
	public MMCLEVIFACEPackageElement_MInterfaceParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVIFACEPackageElementAccess().getMInterfaceParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInterfaceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MInterface_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMCLEVIFACEPackageElement ****************/






/************ begin Rule MInterface ****************
 *
 * MInterface:
 * 	"interface" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
 * 	type=[mclevdom::MInterfaceType|VersionedQualifiedReferenceName] name=ID ("extends"
 * 	extends+=[MInterface|VersionedQualifiedName] ("," extends+=[MInterface|VersionedQualifiedName])*)? "{" "version" ":="
 * 	version=Version ";" "}" ";";
 *
 **/

// "interface" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
// type=[mclevdom::MInterfaceType|VersionedQualifiedReferenceName] name=ID ("extends"
// extends+=[MInterface|VersionedQualifiedName] ("," extends+=[MInterface|VersionedQualifiedName])*)? "{" "version" ":="
// version=Version ";" "}" ";"
protected class MInterface_Group extends GroupToken {
	
	public MInterface_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_SemicolonKeyword_12(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInterfaceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "interface"
protected class MInterface_InterfaceKeyword_0 extends KeywordToken  {
	
	public MInterface_InterfaceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getInterfaceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// domain=[mclevdom::MDomain|VersionedQualifiedName]
protected class MInterface_DomainAssignment_1 extends AssignmentToken  {
	
	public MInterface_DomainAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getDomainAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_InterfaceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("domain",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("domain");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceAccess().getDomainMDomainCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceAccess().getDomainMDomainCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "::"
protected class MInterface_ColonColonKeyword_2 extends KeywordToken  {
	
	public MInterface_ColonColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getColonColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_DomainAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=[mclevdom::MInterfaceType|VersionedQualifiedReferenceName]
protected class MInterface_TypeAssignment_3 extends AssignmentToken  {
	
	public MInterface_TypeAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getTypeAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_ColonColonKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceAccess().getTypeMInterfaceTypeCrossReference_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceAccess().getTypeMInterfaceTypeCrossReference_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MInterface_NameAssignment_4 extends AssignmentToken  {
	
	public MInterface_NameAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getNameAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_TypeAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMInterfaceAccess().getNameIDTerminalRuleCall_4_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMInterfaceAccess().getNameIDTerminalRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// ("extends" extends+=[MInterface|VersionedQualifiedName] ("," extends+=[MInterface|VersionedQualifiedName])*)?
protected class MInterface_Group_5 extends GroupToken {
	
	public MInterface_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInterface_ExtendsAssignment_5_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MInterface_ExtendsKeyword_5_0 extends KeywordToken  {
	
	public MInterface_ExtendsKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getExtendsKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_NameAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// extends+=[MInterface|VersionedQualifiedName]
protected class MInterface_ExtendsAssignment_5_1 extends AssignmentToken  {
	
	public MInterface_ExtendsAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_ExtendsKeyword_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MInterface|VersionedQualifiedName])*
protected class MInterface_Group_5_2 extends GroupToken {
	
	public MInterface_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_ExtendsAssignment_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MInterface_CommaKeyword_5_2_0 extends KeywordToken  {
	
	public MInterface_CommaKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getCommaKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInterface_ExtendsAssignment_5_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MInterface|VersionedQualifiedName]
protected class MInterface_ExtendsAssignment_5_2_1 extends AssignmentToken  {
	
	public MInterface_ExtendsAssignment_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_CommaKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceAccess().getExtendsMInterfaceCrossReference_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MInterface_LeftCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MInterface_LeftCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getLeftCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInterface_NameAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MInterface_VersionKeyword_7 extends KeywordToken  {
	
	public MInterface_VersionKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getVersionKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_LeftCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MInterface_ColonEqualsSignKeyword_8 extends KeywordToken  {
	
	public MInterface_ColonEqualsSignKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getColonEqualsSignKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_VersionKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MInterface_VersionAssignment_9 extends AssignmentToken  {
	
	public MInterface_VersionAssignment_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getVersionAssignment_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_ColonEqualsSignKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMInterfaceAccess().getVersionVersionParserRuleCall_9_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMInterfaceAccess().getVersionVersionParserRuleCall_9_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MInterface_SemicolonKeyword_10 extends KeywordToken  {
	
	public MInterface_SemicolonKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getSemicolonKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_VersionAssignment_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "}"
protected class MInterface_RightCurlyBracketKeyword_11 extends KeywordToken  {
	
	public MInterface_RightCurlyBracketKeyword_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getRightCurlyBracketKeyword_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_SemicolonKeyword_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MInterface_SemicolonKeyword_12 extends KeywordToken  {
	
	public MInterface_SemicolonKeyword_12(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceAccess().getSemicolonKeyword_12();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterface_RightCurlyBracketKeyword_11(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInterface ****************/

}
