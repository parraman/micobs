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

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import es.uah.aut.srg.micobs.mclev.lang.services.DOMGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class DOMParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private DOMGrammarAccess grammarAccess;
	
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
			case 0: return new MMCLEVDOMPackageFile_Group(this, this, 0, inst);
			case 1: return new MMCLEVDOMPackageElement_MDomainParserRuleCall(this, this, 1, inst);
			case 2: return new MDomain_Alternatives(this, this, 2, inst);
			case 3: return new MIODomain_Group(this, this, 3, inst);
			case 4: return new MIODomainSupportedPlatform_Group(this, this, 4, inst);
			case 5: return new MAODomain_Group(this, this, 5, inst);
			case 6: return new MInterfaceType_Group(this, this, 6, inst);
			case 7: return new MAODComponentType_Group(this, this, 7, inst);
			case 8: return new MIODCType_Alternatives(this, this, 8, inst);
			case 9: return new MIODAbstractComponentType_Group(this, this, 9, inst);
			case 10: return new MIODComponentType_Group(this, this, 10, inst);
			case 11: return new MIODComponentTypeInstance_Group(this, this, 11, inst);
			case 12: return new MAODComponentTypeInstance_Group(this, this, 12, inst);
			case 13: return new MPortTypeInstance_Alternatives(this, this, 13, inst);
			case 14: return new MExternalPortTypeInstance_Alternatives(this, this, 14, inst);
			case 15: return new MExternalClientPortTypeInstance_Group(this, this, 15, inst);
			case 16: return new MExternalServerPortTypeInstance_Group(this, this, 16, inst);
			case 17: return new MInternalPortTypeInstance_Alternatives(this, this, 17, inst);
			case 18: return new MInternalClientPortTypeInstance_Group(this, this, 18, inst);
			case 19: return new MInternalServerPortTypeInstance_Group(this, this, 19, inst);
			case 20: return new MPortType_Group(this, this, 20, inst);
			case 21: return new MExchangeModel_Group(this, this, 21, inst);
			case 22: return new MConnector_Group(this, this, 22, inst);
			case 23: return new MParameter_Alternatives(this, this, 23, inst);
			case 24: return new MIntegerParameterSingleExpression_Group(this, this, 24, inst);
			case 25: return new MEnumParameterDefinition_Group(this, this, 25, inst);
			case 26: return new MEnumParameterSingleExpression_Group(this, this, 26, inst);
			case 27: return new MRealParameterSingleExpression_Group(this, this, 27, inst);
			case 28: return new MEnumParameterLiteralRule_Alternatives(this, this, 28, inst);
			case 29: return new MParameterValue_Alternatives(this, this, 29, inst);
			case 30: return new MParameterValueLiteral_Alternatives(this, this, 30, inst);
			case 31: return new MParameterValueBooleanLiteral_Group(this, this, 31, inst);
			case 32: return new MParameterValueStringLiteral_Group(this, this, 32, inst);
			case 33: return new MParameterValueIntegerLiteral_Group(this, this, 33, inst);
			case 34: return new MParameterValueRealLiteral_Group(this, this, 34, inst);
			case 35: return new MParameterValueRefObject_Group(this, this, 35, inst);
			case 36: return new MParameterValuePAR_Group(this, this, 36, inst);
			case 37: return new MParameterValueExpression_Group(this, this, 37, inst);
			case 38: return new MParameterValueTERM_Group(this, this, 38, inst);
			case 39: return new MParameterRange_Alternatives(this, this, 39, inst);
			case 40: return new MParameterOCR_Group(this, this, 40, inst);
			case 41: return new MParameterOOR_Group(this, this, 41, inst);
			case 42: return new MParameterCOR_Group(this, this, 42, inst);
			case 43: return new MParameterCCR_Group(this, this, 43, inst);
			case 44: return new MEnumParameterLiteral_Group(this, this, 44, inst);
			case 45: return new MEnumParamIntegerLiteral_Group(this, this, 45, inst);
			case 46: return new MEnumParamRealLiteral_Group(this, this, 46, inst);
			case 47: return new MEnumParamStringLiteral_Group(this, this, 47, inst);
			case 48: return new MBooleanParameterSingleExpression_Group(this, this, 48, inst);
			case 49: return new MStringParameterSingleExpression_Group(this, this, 49, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMCLEVDOMPackageFile ****************
 *
 * MMCLEVDOMPackageFile:
 * 	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
 * 	imports+=[common::MCommonPackage|QualifiedName] ';')*
 * 	element=MMCLEVDOMPackageElement;
 *
 **/

// 'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
// imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMCLEVDOMPackageElement
protected class MMCLEVDOMPackageFile_Group extends GroupToken {
	
	public MMCLEVDOMPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCLEVDOMPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'package'
protected class MMCLEVDOMPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMCLEVDOMPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVDOMPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMCLEVDOMPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMCLEVDOMPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMCLEVDOMPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('import' imports+=[common::MCommonPackage|QualifiedName] ';')*
protected class MMCLEVDOMPackageFile_Group_3 extends GroupToken {
	
	public MMCLEVDOMPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'import'
protected class MMCLEVDOMPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMCLEVDOMPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVDOMPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMCLEVDOMPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMCLEVDOMPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMCLEVDOMPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMCLEVDOMPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMCLEVDOMPackageElement
protected class MMCLEVDOMPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMCLEVDOMPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVDOMPackageElement_MDomainParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVDOMPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCLEVDOMPackageFileAccess().getElementMMCLEVDOMPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MMCLEVDOMPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCLEVDOMPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMCLEVDOMPackageFile ****************/


/************ begin Rule MMCLEVDOMPackageElement ****************
 *
 * MMCLEVDOMPackageElement:
 * 	MDomain;
 *
 **/

// MDomain
protected class MMCLEVDOMPackageElement_MDomainParserRuleCall extends RuleCallToken {
	
	public MMCLEVDOMPackageElement_MDomainParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVDOMPackageElementAccess().getMDomainParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDomain_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAODomainRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIODomainRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MDomain_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMCLEVDOMPackageElement ****************/


/************ begin Rule MDomain ****************
 *
 * MDomain:
 * 	MIODomain | MAODomain;
 *
 **/

// MIODomain | MAODomain
protected class MDomain_Alternatives extends AlternativesToken {

	public MDomain_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDomainAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDomain_MIODomainParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDomain_MAODomainParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAODomainRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIODomainRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MIODomain
protected class MDomain_MIODomainParserRuleCall_0 extends RuleCallToken {
	
	public MDomain_MIODomainParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMDomainAccess().getMIODomainParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODomainRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIODomain_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MAODomain
protected class MDomain_MAODomainParserRuleCall_1 extends RuleCallToken {
	
	public MDomain_MAODomainParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMDomainAccess().getMAODomainParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAODomainRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MAODomain_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MDomain ****************/






/************ begin Rule MIODomain ****************
 *
 * MIODomain:
 * 	'iodomain'
 * 	name=ID ('inherits' inherits+=[MIODomain|VersionedQualifiedName] ("," inherits+=[MIODomain|VersionedQualifiedName])*)?
 * 	'{' ('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
 * 	& ('singleton' 'instances' ':=' allowsSingleton=EBoolean ';')?
 * 	& ('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?
 * 	& ('interface' 'types'
 * 	'{'
 * 	interfaceTypes+=MInterfaceType+
 * 	'}' ';')?
 * 	& ('port' 'types'
 * 	'{'
 * 	portTypes+=MPortType+
 * 	'}' ';')?
 * 	& ('connectors'
 * 	'{'
 * 	connectors+=MConnector+
 * 	'}' ';')?
 * 	& ('exchange' 'models'
 * 	'{'
 * 	exchangeModels+=MExchangeModel+
 * 	'}' ';')?
 * 	& ('component' 'types'
 * 	'{'
 * 	componentTypes+=MIODCType+
 * 	'}' ';')?
 * 	& ('internal' 'instances'
 * 	'{'
 * 	componentTypeInstances+=MIODComponentTypeInstance+
 * 	'}' ';')?
 * 	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
 * 	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
 * 	& ('supported' 'platforms'
 * 	'{'
 * 	supportedPlatforms+=MIODomainSupportedPlatform+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'iodomain' name=ID ('inherits' inherits+=[MIODomain|VersionedQualifiedName] (","
// inherits+=[MIODomain|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & ('languages' ':='
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ';')? & ('singleton' 'instances' ':=' allowsSingleton=EBoolean ';')? & ('attributes' '{' attributes+=MParameter+ '}'
// ';')? & ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')? & ('port' 'types' '{' portTypes+=MPortType+
// '}' ';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? & ('exchange' 'models' '{'
// exchangeModels+=MExchangeModel+ '}' ';')? & ('component' 'types' '{' componentTypes+=MIODCType+ '}' ';')? & ('internal'
// 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')? & ('requires' ':='
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? &
// ('supported' 'platforms' '{' supportedPlatforms+=MIODomainSupportedPlatform+ '}' ';')?) '}' ';'
protected class MIODomain_Group extends GroupToken {
	
	public MIODomain_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODomainRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'iodomain'
protected class MIODomain_IodomainKeyword_0 extends KeywordToken  {
	
	public MIODomain_IodomainKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getIodomainKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MIODomain_NameAssignment_1 extends AssignmentToken  {
	
	public MIODomain_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_IodomainKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIODomainAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIODomainAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MIODomain|VersionedQualifiedName] ("," inherits+=[MIODomain|VersionedQualifiedName])*)?
protected class MIODomain_Group_2 extends GroupToken {
	
	public MIODomain_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MIODomain_InheritsKeyword_2_0 extends KeywordToken  {
	
	public MIODomain_InheritsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInheritsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MIODomain|VersionedQualifiedName]
protected class MIODomain_InheritsAssignment_2_1 extends AssignmentToken  {
	
	public MIODomain_InheritsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInheritsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_InheritsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MIODomain|VersionedQualifiedName])*
protected class MIODomain_Group_2_2 extends GroupToken {
	
	public MIODomain_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_InheritsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MIODomain_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MIODomain_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MIODomain|VersionedQualifiedName]
protected class MIODomain_InheritsAssignment_2_2_1 extends AssignmentToken  {
	
	public MIODomain_InheritsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInheritsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MIODomain_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ';')? & ('singleton' 'instances' ':=' allowsSingleton=EBoolean
// ';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('interface' 'types' '{' interfaceTypes+=MInterfaceType+
// '}' ';')? & ('port' 'types' '{' portTypes+=MPortType+ '}' ';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? &
// ('exchange' 'models' '{' exchangeModels+=MExchangeModel+ '}' ';')? & ('component' 'types' '{'
// componentTypes+=MIODCType+ '}' ';')? & ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+
// '}' ';')? & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? & ('supported' 'platforms' '{'
// supportedPlatforms+=MIODomainSupportedPlatform+ '}' ';')?)
protected class MIODomain_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MIODomain_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_11(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_10(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_9(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_8(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_7(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MIODomain_Group_4_6(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MIODomain_Group_4_5(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 8, inst);
			case 9: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 9, inst);
			case 10: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 10, inst);
			case 11: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 11, inst);
			default: return null;
		}	
	}

}

// 'version' ':=' version=Version ';'
protected class MIODomain_Group_4_0 extends GroupToken {
	
	public MIODomain_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version'
protected class MIODomain_VersionKeyword_4_0_0 extends KeywordToken  {
	
	public MIODomain_VersionKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getVersionKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomain_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MIODomain_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_VersionKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MIODomain_VersionAssignment_4_0_2 extends AssignmentToken  {
	
	public MIODomain_VersionAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getVersionAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIODomainAccess().getVersionVersionParserRuleCall_4_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMIODomainAccess().getVersionVersionParserRuleCall_4_0_2_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_VersionAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
protected class MIODomain_Group_4_1 extends GroupToken {
	
	public MIODomain_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'languages'
protected class MIODomain_LanguagesKeyword_4_1_0 extends KeywordToken  {
	
	public MIODomain_LanguagesKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLanguagesKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomain_ColonEqualsSignKeyword_4_1_1 extends KeywordToken  {
	
	public MIODomain_ColonEqualsSignKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_LanguagesKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MIODomain_LanguagesAssignment_4_1_2 extends AssignmentToken  {
	
	public MIODomain_LanguagesAssignment_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MIODomain_Group_4_1_3 extends GroupToken {
	
	public MIODomain_Group_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_LanguagesAssignment_4_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MIODomain_CommaKeyword_4_1_3_0 extends KeywordToken  {
	
	public MIODomain_CommaKeyword_4_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getCommaKeyword_4_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_LanguagesAssignment_4_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MIODomain_LanguagesAssignment_4_1_3_1 extends AssignmentToken  {
	
	public MIODomain_LanguagesAssignment_4_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_CommaKeyword_4_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomain_SemicolonKeyword_4_1_4 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_LanguagesAssignment_4_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('singleton' 'instances' ':=' allowsSingleton=EBoolean ';')?
protected class MIODomain_Group_4_2 extends GroupToken {
	
	public MIODomain_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'singleton'
protected class MIODomain_SingletonKeyword_4_2_0 extends KeywordToken  {
	
	public MIODomain_SingletonKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSingletonKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MIODomain_InstancesKeyword_4_2_1 extends KeywordToken  {
	
	public MIODomain_InstancesKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInstancesKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SingletonKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomain_ColonEqualsSignKeyword_4_2_2 extends KeywordToken  {
	
	public MIODomain_ColonEqualsSignKeyword_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_InstancesKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// allowsSingleton=EBoolean
protected class MIODomain_AllowsSingletonAssignment_4_2_3 extends AssignmentToken  {
	
	public MIODomain_AllowsSingletonAssignment_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getAllowsSingletonAssignment_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ColonEqualsSignKeyword_4_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("allowsSingleton",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("allowsSingleton");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIODomainAccess().getAllowsSingletonEBooleanParserRuleCall_4_2_3_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMIODomainAccess().getAllowsSingletonEBooleanParserRuleCall_4_2_3_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_2_4 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_AllowsSingletonAssignment_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MIODomain_Group_4_3 extends GroupToken {
	
	public MIODomain_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MIODomain_AttributesKeyword_4_3_0 extends KeywordToken  {
	
	public MIODomain_AttributesKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getAttributesKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_3_1 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_AttributesKeyword_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MIODomain_AttributesAssignment_4_3_2 extends AssignmentToken  {
	
	public MIODomain_AttributesAssignment_4_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getAttributesAssignment_4_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getAttributesMParameterParserRuleCall_4_3_2_0(); 
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
			case 0: return new MIODomain_AttributesAssignment_4_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_3_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_3_3 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_AttributesAssignment_4_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_3_4 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')?
protected class MIODomain_Group_4_4 extends GroupToken {
	
	public MIODomain_Group_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'interface'
protected class MIODomain_InterfaceKeyword_4_4_0 extends KeywordToken  {
	
	public MIODomain_InterfaceKeyword_4_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInterfaceKeyword_4_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MIODomain_TypesKeyword_4_4_1 extends KeywordToken  {
	
	public MIODomain_TypesKeyword_4_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getTypesKeyword_4_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_InterfaceKeyword_4_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_4_2 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_TypesKeyword_4_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// interfaceTypes+=MInterfaceType+
protected class MIODomain_InterfaceTypesAssignment_4_4_3 extends AssignmentToken  {
	
	public MIODomain_InterfaceTypesAssignment_4_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInterfaceTypesAssignment_4_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaceTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaceTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceTypeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_4_3_0(); 
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
			case 0: return new MIODomain_InterfaceTypesAssignment_4_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_4_4 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_InterfaceTypesAssignment_4_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_4_5 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('port' 'types' '{' portTypes+=MPortType+ '}' ';')?
protected class MIODomain_Group_4_5 extends GroupToken {
	
	public MIODomain_Group_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'port'
protected class MIODomain_PortKeyword_4_5_0 extends KeywordToken  {
	
	public MIODomain_PortKeyword_4_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getPortKeyword_4_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MIODomain_TypesKeyword_4_5_1 extends KeywordToken  {
	
	public MIODomain_TypesKeyword_4_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getTypesKeyword_4_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_PortKeyword_4_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_5_2 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_TypesKeyword_4_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portTypes+=MPortType+
protected class MIODomain_PortTypesAssignment_4_5_3 extends AssignmentToken  {
	
	public MIODomain_PortTypesAssignment_4_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getPortTypesAssignment_4_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getPortTypesMPortTypeParserRuleCall_4_5_3_0(); 
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
			case 0: return new MIODomain_PortTypesAssignment_4_5_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_5_4 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_PortTypesAssignment_4_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_5_5 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('connectors' '{' connectors+=MConnector+ '}' ';')?
protected class MIODomain_Group_4_6 extends GroupToken {
	
	public MIODomain_Group_4_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'connectors'
protected class MIODomain_ConnectorsKeyword_4_6_0 extends KeywordToken  {
	
	public MIODomain_ConnectorsKeyword_4_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getConnectorsKeyword_4_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_6_1 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ConnectorsKeyword_4_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connectors+=MConnector+
protected class MIODomain_ConnectorsAssignment_4_6_2 extends AssignmentToken  {
	
	public MIODomain_ConnectorsAssignment_4_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getConnectorsAssignment_4_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connectors",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connectors");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getConnectorsMConnectorParserRuleCall_4_6_2_0(); 
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
			case 0: return new MIODomain_ConnectorsAssignment_4_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_6_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_6_3 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ConnectorsAssignment_4_6_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_6_4 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('exchange' 'models' '{' exchangeModels+=MExchangeModel+ '}' ';')?
protected class MIODomain_Group_4_7 extends GroupToken {
	
	public MIODomain_Group_4_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'exchange'
protected class MIODomain_ExchangeKeyword_4_7_0 extends KeywordToken  {
	
	public MIODomain_ExchangeKeyword_4_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getExchangeKeyword_4_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_5(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 6, inst);
			default: return null;
		}	
	}

}

// 'models'
protected class MIODomain_ModelsKeyword_4_7_1 extends KeywordToken  {
	
	public MIODomain_ModelsKeyword_4_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getModelsKeyword_4_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ExchangeKeyword_4_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_7_2 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ModelsKeyword_4_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// exchangeModels+=MExchangeModel+
protected class MIODomain_ExchangeModelsAssignment_4_7_3 extends AssignmentToken  {
	
	public MIODomain_ExchangeModelsAssignment_4_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getExchangeModelsAssignment_4_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("exchangeModels",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("exchangeModels");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExchangeModelRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getExchangeModelsMExchangeModelParserRuleCall_4_7_3_0(); 
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
			case 0: return new MIODomain_ExchangeModelsAssignment_4_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_7_4 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ExchangeModelsAssignment_4_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_7_5 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('component' 'types' '{' componentTypes+=MIODCType+ '}' ';')?
protected class MIODomain_Group_4_8 extends GroupToken {
	
	public MIODomain_Group_4_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_8_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'component'
protected class MIODomain_ComponentKeyword_4_8_0 extends KeywordToken  {
	
	public MIODomain_ComponentKeyword_4_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getComponentKeyword_4_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_5(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 7, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MIODomain_TypesKeyword_4_8_1 extends KeywordToken  {
	
	public MIODomain_TypesKeyword_4_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getTypesKeyword_4_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ComponentKeyword_4_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_8_2 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_TypesKeyword_4_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// componentTypes+=MIODCType+
protected class MIODomain_ComponentTypesAssignment_4_8_3 extends AssignmentToken  {
	
	public MIODomain_ComponentTypesAssignment_4_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getComponentTypesAssignment_4_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODCType_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODCTypeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getComponentTypesMIODCTypeParserRuleCall_4_8_3_0(); 
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
			case 0: return new MIODomain_ComponentTypesAssignment_4_8_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_8_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_8_4 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ComponentTypesAssignment_4_8_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_8_5 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_8_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_8_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?
protected class MIODomain_Group_4_9 extends GroupToken {
	
	public MIODomain_Group_4_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_9_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'internal'
protected class MIODomain_InternalKeyword_4_9_0 extends KeywordToken  {
	
	public MIODomain_InternalKeyword_4_9_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInternalKeyword_4_9_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_5(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 8, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MIODomain_InstancesKeyword_4_9_1 extends KeywordToken  {
	
	public MIODomain_InstancesKeyword_4_9_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getInstancesKeyword_4_9_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_InternalKeyword_4_9_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_9_2 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_9_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_9_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_InstancesKeyword_4_9_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// componentTypeInstances+=MIODComponentTypeInstance+
protected class MIODomain_ComponentTypeInstancesAssignment_4_9_3 extends AssignmentToken  {
	
	public MIODomain_ComponentTypeInstancesAssignment_4_9_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getComponentTypeInstancesAssignment_4_9_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODComponentTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_4_9_3_0(); 
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
			case 0: return new MIODomain_ComponentTypeInstancesAssignment_4_9_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_9_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_9_4 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_9_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_9_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ComponentTypeInstancesAssignment_4_9_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_9_5 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_9_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_9_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_9_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
protected class MIODomain_Group_4_10 extends GroupToken {
	
	public MIODomain_Group_4_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_10_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'requires'
protected class MIODomain_RequiresKeyword_4_10_0 extends KeywordToken  {
	
	public MIODomain_RequiresKeyword_4_10_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRequiresKeyword_4_10_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_9(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_8(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_7(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_6(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_5(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 8, inst);
			case 9: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 9, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomain_ColonEqualsSignKeyword_4_10_1 extends KeywordToken  {
	
	public MIODomain_ColonEqualsSignKeyword_4_10_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_10_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RequiresKeyword_4_10_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MIODomain_RequiresAssignment_4_10_2 extends AssignmentToken  {
	
	public MIODomain_RequiresAssignment_4_10_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_ColonEqualsSignKeyword_4_10_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class MIODomain_Group_4_10_3 extends GroupToken {
	
	public MIODomain_Group_4_10_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_10_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RequiresAssignment_4_10_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MIODomain_CommaKeyword_4_10_3_0 extends KeywordToken  {
	
	public MIODomain_CommaKeyword_4_10_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getCommaKeyword_4_10_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_10_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_RequiresAssignment_4_10_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MIODomain_RequiresAssignment_4_10_3_1 extends AssignmentToken  {
	
	public MIODomain_RequiresAssignment_4_10_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_CommaKeyword_4_10_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomain_SemicolonKeyword_4_10_4 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_10_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_10_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_10_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_RequiresAssignment_4_10_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('supported' 'platforms' '{' supportedPlatforms+=MIODomainSupportedPlatform+ '}' ';')?
protected class MIODomain_Group_4_11 extends GroupToken {
	
	public MIODomain_Group_4_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getGroup_4_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SemicolonKeyword_4_11_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'supported'
protected class MIODomain_SupportedKeyword_4_11_0 extends KeywordToken  {
	
	public MIODomain_SupportedKeyword_4_11_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSupportedKeyword_4_11_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_Group_4_10(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomain_Group_4_9(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomain_Group_4_8(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomain_Group_4_7(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MIODomain_Group_4_6(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MIODomain_Group_4_5(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MIODomain_Group_4_4(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MIODomain_Group_4_3(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MIODomain_Group_4_2(lastRuleCallOrigin, this, 8, inst);
			case 9: return new MIODomain_Group_4_1(lastRuleCallOrigin, this, 9, inst);
			case 10: return new MIODomain_Group_4_0(lastRuleCallOrigin, this, 10, inst);
			default: return null;
		}	
	}

}

// 'platforms'
protected class MIODomain_PlatformsKeyword_4_11_1 extends KeywordToken  {
	
	public MIODomain_PlatformsKeyword_4_11_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getPlatformsKeyword_4_11_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SupportedKeyword_4_11_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomain_LeftCurlyBracketKeyword_4_11_2 extends KeywordToken  {
	
	public MIODomain_LeftCurlyBracketKeyword_4_11_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_11_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_PlatformsKeyword_4_11_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedPlatforms+=MIODomainSupportedPlatform+
protected class MIODomain_SupportedPlatformsAssignment_4_11_3 extends AssignmentToken  {
	
	public MIODomain_SupportedPlatformsAssignment_4_11_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSupportedPlatformsAssignment_4_11_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedPlatforms",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainAccess().getSupportedPlatformsMIODomainSupportedPlatformParserRuleCall_4_11_3_0(); 
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
			case 0: return new MIODomain_SupportedPlatformsAssignment_4_11_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomain_LeftCurlyBracketKeyword_4_11_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomain_RightCurlyBracketKeyword_4_11_4 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_4_11_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_11_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_SupportedPlatformsAssignment_4_11_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_4_11_5 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_4_11_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_11_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_4_11_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MIODomain_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MIODomain_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomain_SemicolonKeyword_6 extends KeywordToken  {
	
	public MIODomain_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomain_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIODomain ****************/


/************ begin Rule MIODomainSupportedPlatform ****************
 *
 * MIODomainSupportedPlatform:
 * 	'supported' 'platform'
 * 	name=ID
 * 	'{' ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
 * 	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
 * 	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
 * 	compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
 * 	& 'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':='
 * 	('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?
 * 	& ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
 * 	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
 * 	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?)
 * 	'}' ';';
 *
 **/

// 'supported' 'platform' name=ID '{' ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' &
// 'os' ':=' ('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
// compiler=[pdl::MCompiler|VersionedQualifiedName] ';')? & 'microprocessor' ':=' ('any' |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':=' ('any' |
// board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('languages'
// ':=' languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ';')? & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?) '}' ';'
protected class MIODomainSupportedPlatform_Group extends GroupToken {
	
	public MIODomainSupportedPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODomainSupportedPlatformRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'supported'
protected class MIODomainSupportedPlatform_SupportedKeyword_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SupportedKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSupportedKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'platform'
protected class MIODomainSupportedPlatform_PlatformKeyword_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_PlatformKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getPlatformKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SupportedKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MIODomainSupportedPlatform_NameAssignment_2 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_PlatformKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIODomainSupportedPlatformAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIODomainSupportedPlatformAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MIODomainSupportedPlatform_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
// compiler=[pdl::MCompiler|VersionedQualifiedName] ';')? & 'microprocessor' ':=' ('any' |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':=' ('any' |
// board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('languages'
// ':=' languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ';')? & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?)
protected class MIODomainSupportedPlatform_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MIODomainSupportedPlatform_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_Group_4_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomainSupportedPlatform_Group_4_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODomainSupportedPlatform_Group_4_5(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// 'osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';'
protected class MIODomainSupportedPlatform_Group_4_0 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'osapi'
protected class MIODomainSupportedPlatform_OsapiKeyword_4_0_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_OsapiKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_OsapiKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName])
protected class MIODomainSupportedPlatform_Alternatives_4_0_2 extends AlternativesToken {

	public MIODomainSupportedPlatform_Alternatives_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_AnyKeyword_4_0_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_OsapiAssignment_4_0_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'any'
protected class MIODomainSupportedPlatform_AnyKeyword_4_0_2_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_AnyKeyword_4_0_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_OsapiAssignment_4_0_2_1 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_OsapiAssignment_4_0_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiAssignment_4_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_4_0_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_4_0_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Alternatives_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'os' ':=' ('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';'
protected class MIODomainSupportedPlatform_Group_4_1 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'os'
protected class MIODomainSupportedPlatform_OsKeyword_4_1_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_OsKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getOsKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_1_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_OsKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName])
protected class MIODomainSupportedPlatform_Alternatives_4_1_2 extends AlternativesToken {

	public MIODomainSupportedPlatform_Alternatives_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_AnyKeyword_4_1_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_OsAssignment_4_1_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'any'
protected class MIODomainSupportedPlatform_AnyKeyword_4_1_2_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_AnyKeyword_4_1_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_1_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_OsAssignment_4_1_2_1 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_OsAssignment_4_1_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getOsAssignment_4_1_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("os",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("os");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getOsMOperatingSystemCrossReference_4_1_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getOsMOperatingSystemCrossReference_4_1_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_1_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Alternatives_4_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'architecture' ':=' ('any' | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';'
protected class MIODomainSupportedPlatform_Group_4_2 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'architecture'
protected class MIODomainSupportedPlatform_ArchitectureKeyword_4_2_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ArchitectureKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_2_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ArchitectureKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('any' | architecture=[pdl::MArchitecture|VersionedQualifiedName])
protected class MIODomainSupportedPlatform_Alternatives_4_2_2 extends AlternativesToken {

	public MIODomainSupportedPlatform_Alternatives_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_AnyKeyword_4_2_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_ArchitectureAssignment_4_2_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'any'
protected class MIODomainSupportedPlatform_AnyKeyword_4_2_2_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_AnyKeyword_4_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_ArchitectureAssignment_4_2_2_1 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_ArchitectureAssignment_4_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureAssignment_4_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_4_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_4_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_2_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Alternatives_4_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('compiler' ':=' compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
protected class MIODomainSupportedPlatform_Group_4_3 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'compiler'
protected class MIODomainSupportedPlatform_CompilerKeyword_4_3_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_CompilerKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_3_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_CompilerKeyword_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[pdl::MCompiler|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_CompilerAssignment_4_3_2 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_CompilerAssignment_4_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerAssignment_4_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerMCompilerCrossReference_4_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerMCompilerCrossReference_4_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_3_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_CompilerAssignment_4_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';'
protected class MIODomainSupportedPlatform_Group_4_4 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'microprocessor'
protected class MIODomainSupportedPlatform_MicroprocessorKeyword_4_4_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_MicroprocessorKeyword_4_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorKeyword_4_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_Group_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_4_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_MicroprocessorKeyword_4_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName])
protected class MIODomainSupportedPlatform_Alternatives_4_4_2 extends AlternativesToken {

	public MIODomainSupportedPlatform_Alternatives_4_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_AnyKeyword_4_4_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_MicroprocessorAssignment_4_4_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'any'
protected class MIODomainSupportedPlatform_AnyKeyword_4_4_2_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_AnyKeyword_4_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_MicroprocessorAssignment_4_4_2_1 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_MicroprocessorAssignment_4_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorAssignment_4_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_4_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Alternatives_4_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'board' ':=' ('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';'
protected class MIODomainSupportedPlatform_Group_4_5 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'board'
protected class MIODomainSupportedPlatform_BoardKeyword_4_5_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_BoardKeyword_4_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getBoardKeyword_4_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_5_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_BoardKeyword_4_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('any' | board=[pdl::MBoard|VersionedQualifiedName])
protected class MIODomainSupportedPlatform_Alternatives_4_5_2 extends AlternativesToken {

	public MIODomainSupportedPlatform_Alternatives_4_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_AnyKeyword_4_5_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_BoardAssignment_4_5_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'any'
protected class MIODomainSupportedPlatform_AnyKeyword_4_5_2_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_AnyKeyword_4_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[pdl::MBoard|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_BoardAssignment_4_5_2_1 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_BoardAssignment_4_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getBoardAssignment_4_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardMBoardCrossReference_4_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getBoardMBoardCrossReference_4_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_5_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Alternatives_4_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MIODomainSupportedPlatform_Group_4_6 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MIODomainSupportedPlatform_AttributesKeyword_4_6_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_AttributesKeyword_4_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesKeyword_4_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODomainSupportedPlatform_LeftCurlyBracketKeyword_4_6_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_LeftCurlyBracketKeyword_4_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_4_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_AttributesKeyword_4_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MIODomainSupportedPlatform_AttributesAssignment_4_6_2 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_AttributesAssignment_4_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesAssignment_4_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesMParameterParserRuleCall_4_6_2_0(); 
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
			case 0: return new MIODomainSupportedPlatform_AttributesAssignment_4_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODomainSupportedPlatform_LeftCurlyBracketKeyword_4_6_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODomainSupportedPlatform_RightCurlyBracketKeyword_4_6_3 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_RightCurlyBracketKeyword_4_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_4_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_AttributesAssignment_4_6_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_6_4 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_RightCurlyBracketKeyword_4_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
protected class MIODomainSupportedPlatform_Group_4_7 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'languages'
protected class MIODomainSupportedPlatform_LanguagesKeyword_4_7_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_LanguagesKeyword_4_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesKeyword_4_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_Group_4_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_7_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_LanguagesKeyword_4_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_LanguagesAssignment_4_7_2 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_LanguagesAssignment_4_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MIODomainSupportedPlatform_Group_4_7_3 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_LanguagesAssignment_4_7_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MIODomainSupportedPlatform_CommaKeyword_4_7_3_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_CommaKeyword_4_7_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_7_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_7_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_LanguagesAssignment_4_7_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_LanguagesAssignment_4_7_3_1 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_LanguagesAssignment_4_7_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_CommaKeyword_4_7_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_7_4 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_7_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_LanguagesAssignment_4_7_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
protected class MIODomainSupportedPlatform_Group_4_8 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_SemicolonKeyword_4_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'requires'
protected class MIODomainSupportedPlatform_RequiresKeyword_4_8_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_RequiresKeyword_4_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresKeyword_4_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_Group_4_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODomainSupportedPlatform_Group_4_5(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_8_1 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_RequiresKeyword_4_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_RequiresAssignment_4_8_2 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_RequiresAssignment_4_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_ColonEqualsSignKeyword_4_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class MIODomainSupportedPlatform_Group_4_8_3 extends GroupToken {
	
	public MIODomainSupportedPlatform_Group_4_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_RequiresAssignment_4_8_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MIODomainSupportedPlatform_CommaKeyword_4_8_3_0 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_CommaKeyword_4_8_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_8_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_RequiresAssignment_4_8_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MIODomainSupportedPlatform_RequiresAssignment_4_8_3_1 extends AssignmentToken  {
	
	public MIODomainSupportedPlatform_RequiresAssignment_4_8_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_CommaKeyword_4_8_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_4_8_4 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_4_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_Group_4_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODomainSupportedPlatform_RequiresAssignment_4_8_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MIODomainSupportedPlatform_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODomainSupportedPlatform_SemicolonKeyword_6 extends KeywordToken  {
	
	public MIODomainSupportedPlatform_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODomainSupportedPlatform_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIODomainSupportedPlatform ****************/


/************ begin Rule MAODomain ****************
 *
 * MAODomain:
 * 	'aodomain'
 * 	name=ID ('inherits' inherits+=[MAODomain|VersionedQualifiedName] ("," inherits+=[MAODomain|VersionedQualifiedName])*)?
 * 	'{' ('version' ':=' version=Version ';' & ('output' 'iodomains' ':='
 * 	outputIODomains+=[MIODomain|VersionedQualifiedName] ("," outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')?
 * 	& ('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?
 * 	& ('interface' 'types'
 * 	'{'
 * 	interfaceTypes+=MInterfaceType+
 * 	'}' ';')?
 * 	& ('port' 'types'
 * 	'{'
 * 	portTypes+=MPortType+
 * 	'}' ';')?
 * 	& ('connectors'
 * 	'{'
 * 	connectors+=MConnector+
 * 	'}' ';')?
 * 	& ('component' 'types'
 * 	'{'
 * 	componentTypes+=MAODComponentType+
 * 	'}' ';')?
 * 	& ('internal' 'instances'
 * 	'{'
 * 	componentTypeInstances+=MAODComponentTypeInstance+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'aodomain' name=ID ('inherits' inherits+=[MAODomain|VersionedQualifiedName] (","
// inherits+=[MAODomain|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & ('output' 'iodomains' ':='
// outputIODomains+=[MIODomain|VersionedQualifiedName] ("," outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')? &
// ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}'
// ';')? & ('port' 'types' '{' portTypes+=MPortType+ '}' ';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? &
// ('component' 'types' '{' componentTypes+=MAODComponentType+ '}' ';')? & ('internal' 'instances' '{'
// componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?) '}' ';'
protected class MAODomain_Group extends GroupToken {
	
	public MAODomain_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAODomainRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'aodomain'
protected class MAODomain_AodomainKeyword_0 extends KeywordToken  {
	
	public MAODomain_AodomainKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getAodomainKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MAODomain_NameAssignment_1 extends AssignmentToken  {
	
	public MAODomain_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_AodomainKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAODomainAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMAODomainAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MAODomain|VersionedQualifiedName] ("," inherits+=[MAODomain|VersionedQualifiedName])*)?
protected class MAODomain_Group_2 extends GroupToken {
	
	public MAODomain_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MAODomain_InheritsKeyword_2_0 extends KeywordToken  {
	
	public MAODomain_InheritsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getInheritsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAODomain|VersionedQualifiedName]
protected class MAODomain_InheritsAssignment_2_1 extends AssignmentToken  {
	
	public MAODomain_InheritsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getInheritsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_InheritsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAODomain|VersionedQualifiedName])*
protected class MAODomain_Group_2_2 extends GroupToken {
	
	public MAODomain_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_InheritsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MAODomain_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MAODomain_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAODomain|VersionedQualifiedName]
protected class MAODomain_InheritsAssignment_2_2_1 extends AssignmentToken  {
	
	public MAODomain_InheritsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getInheritsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MAODomain_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MAODomain_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ('version' ':=' version=Version ';' & ('output' 'iodomains' ':=' outputIODomains+=[MIODomain|VersionedQualifiedName]
// ("," outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')?
// & ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')? & ('port' 'types' '{' portTypes+=MPortType+ '}'
// ';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? & ('component' 'types' '{'
// componentTypes+=MAODComponentType+ '}' ';')? & ('internal' 'instances' '{'
// componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?)
protected class MAODomain_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MAODomain_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_Group_4_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODomain_Group_4_5(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MAODomain_Group_4_4(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MAODomain_Group_4_3(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MAODomain_Group_4_2(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MAODomain_Group_4_1(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 7, inst);
			default: return null;
		}	
	}

}

// 'version' ':=' version=Version ';'
protected class MAODomain_Group_4_0 extends GroupToken {
	
	public MAODomain_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version'
protected class MAODomain_VersionKeyword_4_0_0 extends KeywordToken  {
	
	public MAODomain_VersionKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getVersionKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MAODomain_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MAODomain_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_VersionKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MAODomain_VersionAssignment_4_0_2 extends AssignmentToken  {
	
	public MAODomain_VersionAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getVersionAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAODomainAccess().getVersionVersionParserRuleCall_4_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMAODomainAccess().getVersionVersionParserRuleCall_4_0_2_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_VersionAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('output' 'iodomains' ':=' outputIODomains+=[MIODomain|VersionedQualifiedName] (","
// outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')?
protected class MAODomain_Group_4_1 extends GroupToken {
	
	public MAODomain_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'output'
protected class MAODomain_OutputKeyword_4_1_0 extends KeywordToken  {
	
	public MAODomain_OutputKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getOutputKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'iodomains'
protected class MAODomain_IodomainsKeyword_4_1_1 extends KeywordToken  {
	
	public MAODomain_IodomainsKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getIodomainsKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_OutputKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MAODomain_ColonEqualsSignKeyword_4_1_2 extends KeywordToken  {
	
	public MAODomain_ColonEqualsSignKeyword_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_IodomainsKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// outputIODomains+=[MIODomain|VersionedQualifiedName]
protected class MAODomain_OutputIODomainsAssignment_4_1_3 extends AssignmentToken  {
	
	public MAODomain_OutputIODomainsAssignment_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_ColonEqualsSignKeyword_4_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("outputIODomains",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("outputIODomains");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," outputIODomains+=[MIODomain|VersionedQualifiedName])*
protected class MAODomain_Group_4_1_4 extends GroupToken {
	
	public MAODomain_Group_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_OutputIODomainsAssignment_4_1_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MAODomain_CommaKeyword_4_1_4_0 extends KeywordToken  {
	
	public MAODomain_CommaKeyword_4_1_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getCommaKeyword_4_1_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_1_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_OutputIODomainsAssignment_4_1_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// outputIODomains+=[MIODomain|VersionedQualifiedName]
protected class MAODomain_OutputIODomainsAssignment_4_1_4_1 extends AssignmentToken  {
	
	public MAODomain_OutputIODomainsAssignment_4_1_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_CommaKeyword_4_1_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("outputIODomains",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("outputIODomains");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MAODomain_SemicolonKeyword_4_1_5 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_1_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_OutputIODomainsAssignment_4_1_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MAODomain_Group_4_2 extends GroupToken {
	
	public MAODomain_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MAODomain_AttributesKeyword_4_2_0 extends KeywordToken  {
	
	public MAODomain_AttributesKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getAttributesKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODomain_LeftCurlyBracketKeyword_4_2_1 extends KeywordToken  {
	
	public MAODomain_LeftCurlyBracketKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_AttributesKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MAODomain_AttributesAssignment_4_2_2 extends AssignmentToken  {
	
	public MAODomain_AttributesAssignment_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getAttributesAssignment_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODomainAccess().getAttributesMParameterParserRuleCall_4_2_2_0(); 
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
			case 0: return new MAODomain_AttributesAssignment_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODomain_LeftCurlyBracketKeyword_4_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODomain_RightCurlyBracketKeyword_4_2_3 extends KeywordToken  {
	
	public MAODomain_RightCurlyBracketKeyword_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_AttributesAssignment_4_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_4_2_4 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_RightCurlyBracketKeyword_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')?
protected class MAODomain_Group_4_3 extends GroupToken {
	
	public MAODomain_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'interface'
protected class MAODomain_InterfaceKeyword_4_3_0 extends KeywordToken  {
	
	public MAODomain_InterfaceKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getInterfaceKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MAODomain_TypesKeyword_4_3_1 extends KeywordToken  {
	
	public MAODomain_TypesKeyword_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getTypesKeyword_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_InterfaceKeyword_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODomain_LeftCurlyBracketKeyword_4_3_2 extends KeywordToken  {
	
	public MAODomain_LeftCurlyBracketKeyword_4_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_TypesKeyword_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// interfaceTypes+=MInterfaceType+
protected class MAODomain_InterfaceTypesAssignment_4_3_3 extends AssignmentToken  {
	
	public MAODomain_InterfaceTypesAssignment_4_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getInterfaceTypesAssignment_4_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaceTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaceTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceTypeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_3_3_0(); 
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
			case 0: return new MAODomain_InterfaceTypesAssignment_4_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODomain_LeftCurlyBracketKeyword_4_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODomain_RightCurlyBracketKeyword_4_3_4 extends KeywordToken  {
	
	public MAODomain_RightCurlyBracketKeyword_4_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_InterfaceTypesAssignment_4_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_4_3_5 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_RightCurlyBracketKeyword_4_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('port' 'types' '{' portTypes+=MPortType+ '}' ';')?
protected class MAODomain_Group_4_4 extends GroupToken {
	
	public MAODomain_Group_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'port'
protected class MAODomain_PortKeyword_4_4_0 extends KeywordToken  {
	
	public MAODomain_PortKeyword_4_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getPortKeyword_4_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_Group_4_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODomain_Group_4_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MAODomain_TypesKeyword_4_4_1 extends KeywordToken  {
	
	public MAODomain_TypesKeyword_4_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getTypesKeyword_4_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_PortKeyword_4_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODomain_LeftCurlyBracketKeyword_4_4_2 extends KeywordToken  {
	
	public MAODomain_LeftCurlyBracketKeyword_4_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_TypesKeyword_4_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portTypes+=MPortType+
protected class MAODomain_PortTypesAssignment_4_4_3 extends AssignmentToken  {
	
	public MAODomain_PortTypesAssignment_4_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getPortTypesAssignment_4_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODomainAccess().getPortTypesMPortTypeParserRuleCall_4_4_3_0(); 
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
			case 0: return new MAODomain_PortTypesAssignment_4_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODomain_LeftCurlyBracketKeyword_4_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODomain_RightCurlyBracketKeyword_4_4_4 extends KeywordToken  {
	
	public MAODomain_RightCurlyBracketKeyword_4_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_PortTypesAssignment_4_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_4_4_5 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_RightCurlyBracketKeyword_4_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('connectors' '{' connectors+=MConnector+ '}' ';')?
protected class MAODomain_Group_4_5 extends GroupToken {
	
	public MAODomain_Group_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'connectors'
protected class MAODomain_ConnectorsKeyword_4_5_0 extends KeywordToken  {
	
	public MAODomain_ConnectorsKeyword_4_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getConnectorsKeyword_4_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_Group_4_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODomain_Group_4_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MAODomain_Group_4_1(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODomain_LeftCurlyBracketKeyword_4_5_1 extends KeywordToken  {
	
	public MAODomain_LeftCurlyBracketKeyword_4_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_ConnectorsKeyword_4_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connectors+=MConnector+
protected class MAODomain_ConnectorsAssignment_4_5_2 extends AssignmentToken  {
	
	public MAODomain_ConnectorsAssignment_4_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getConnectorsAssignment_4_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connectors",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connectors");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODomainAccess().getConnectorsMConnectorParserRuleCall_4_5_2_0(); 
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
			case 0: return new MAODomain_ConnectorsAssignment_4_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODomain_LeftCurlyBracketKeyword_4_5_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODomain_RightCurlyBracketKeyword_4_5_3 extends KeywordToken  {
	
	public MAODomain_RightCurlyBracketKeyword_4_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_ConnectorsAssignment_4_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_4_5_4 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_RightCurlyBracketKeyword_4_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('component' 'types' '{' componentTypes+=MAODComponentType+ '}' ';')?
protected class MAODomain_Group_4_6 extends GroupToken {
	
	public MAODomain_Group_4_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_6_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'component'
protected class MAODomain_ComponentKeyword_4_6_0 extends KeywordToken  {
	
	public MAODomain_ComponentKeyword_4_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getComponentKeyword_4_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_Group_4_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODomain_Group_4_3(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MAODomain_Group_4_2(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MAODomain_Group_4_1(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MAODomain_TypesKeyword_4_6_1 extends KeywordToken  {
	
	public MAODomain_TypesKeyword_4_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getTypesKeyword_4_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_ComponentKeyword_4_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODomain_LeftCurlyBracketKeyword_4_6_2 extends KeywordToken  {
	
	public MAODomain_LeftCurlyBracketKeyword_4_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_TypesKeyword_4_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// componentTypes+=MAODComponentType+
protected class MAODomain_ComponentTypesAssignment_4_6_3 extends AssignmentToken  {
	
	public MAODomain_ComponentTypesAssignment_4_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getComponentTypesAssignment_4_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODComponentTypeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODomainAccess().getComponentTypesMAODComponentTypeParserRuleCall_4_6_3_0(); 
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
			case 0: return new MAODomain_ComponentTypesAssignment_4_6_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODomain_LeftCurlyBracketKeyword_4_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODomain_RightCurlyBracketKeyword_4_6_4 extends KeywordToken  {
	
	public MAODomain_RightCurlyBracketKeyword_4_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_ComponentTypesAssignment_4_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_4_6_5 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_6_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_6_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_RightCurlyBracketKeyword_4_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('internal' 'instances' '{' componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?
protected class MAODomain_Group_4_7 extends GroupToken {
	
	public MAODomain_Group_4_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getGroup_4_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_SemicolonKeyword_4_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'internal'
protected class MAODomain_InternalKeyword_4_7_0 extends KeywordToken  {
	
	public MAODomain_InternalKeyword_4_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getInternalKeyword_4_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_Group_4_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODomain_Group_4_5(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODomain_Group_4_4(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MAODomain_Group_4_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MAODomain_Group_4_2(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MAODomain_Group_4_1(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MAODomain_Group_4_0(lastRuleCallOrigin, this, 6, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MAODomain_InstancesKeyword_4_7_1 extends KeywordToken  {
	
	public MAODomain_InstancesKeyword_4_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getInstancesKeyword_4_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_InternalKeyword_4_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODomain_LeftCurlyBracketKeyword_4_7_2 extends KeywordToken  {
	
	public MAODomain_LeftCurlyBracketKeyword_4_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_InstancesKeyword_4_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// componentTypeInstances+=MAODComponentTypeInstance+
protected class MAODomain_ComponentTypeInstancesAssignment_4_7_3 extends AssignmentToken  {
	
	public MAODomain_ComponentTypeInstancesAssignment_4_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getComponentTypeInstancesAssignment_4_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODComponentTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODomainAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_4_7_3_0(); 
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
			case 0: return new MAODomain_ComponentTypeInstancesAssignment_4_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODomain_LeftCurlyBracketKeyword_4_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODomain_RightCurlyBracketKeyword_4_7_4 extends KeywordToken  {
	
	public MAODomain_RightCurlyBracketKeyword_4_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_ComponentTypeInstancesAssignment_4_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_4_7_5 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_4_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_RightCurlyBracketKeyword_4_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MAODomain_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MAODomain_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODomain_SemicolonKeyword_6 extends KeywordToken  {
	
	public MAODomain_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODomainAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODomain_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MAODomain ****************/


/************ begin Rule MInterfaceType ****************
 *
 * MInterfaceType:
 * 	'interface' 'type'
 * 	name=ID ('inherits' inherits+=[MInterfaceType|VersionedQualifiedReferenceName] (","
 * 	inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*)?
 * 	'{'
 * 	'}' ';';
 *
 **/

// 'interface' 'type' name=ID ('inherits' inherits+=[MInterfaceType|VersionedQualifiedReferenceName] (","
// inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*)? '{' '}' ';'
protected class MInterfaceType_Group extends GroupToken {
	
	public MInterfaceType_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInterfaceTypeRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'interface'
protected class MInterfaceType_InterfaceKeyword_0 extends KeywordToken  {
	
	public MInterfaceType_InterfaceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getInterfaceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'type'
protected class MInterfaceType_TypeKeyword_1 extends KeywordToken  {
	
	public MInterfaceType_TypeKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getTypeKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_InterfaceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MInterfaceType_NameAssignment_2 extends AssignmentToken  {
	
	public MInterfaceType_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_TypeKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMInterfaceTypeAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMInterfaceTypeAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MInterfaceType|VersionedQualifiedReferenceName] (","
// inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*)?
protected class MInterfaceType_Group_3 extends GroupToken {
	
	public MInterfaceType_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInterfaceType_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MInterfaceType_InheritsKeyword_3_0 extends KeywordToken  {
	
	public MInterfaceType_InheritsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getInheritsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MInterfaceType|VersionedQualifiedReferenceName]
protected class MInterfaceType_InheritsAssignment_3_1 extends AssignmentToken  {
	
	public MInterfaceType_InheritsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_InheritsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*
protected class MInterfaceType_Group_3_2 extends GroupToken {
	
	public MInterfaceType_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_InheritsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MInterfaceType_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MInterfaceType_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInterfaceType_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MInterfaceType|VersionedQualifiedReferenceName]
protected class MInterfaceType_InheritsAssignment_3_2_1 extends AssignmentToken  {
	
	public MInterfaceType_InheritsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MInterfaceType_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MInterfaceType_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInterfaceType_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// '}'
protected class MInterfaceType_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MInterfaceType_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MInterfaceType_SemicolonKeyword_6 extends KeywordToken  {
	
	public MInterfaceType_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceTypeAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceType_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInterfaceType ****************/


/************ begin Rule MAODComponentType ****************
 *
 * MAODComponentType:
 * 	'component' 'type'
 * 	name=ID ('inherits' inherits+=[MAODComponentType|VersionedQualifiedReferenceName] (","
 * 	inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*)?
 * 	'{' (('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?
 * 	& ('port' 'instances'
 * 	'{'
 * 	portTypeInstances+=MPortTypeInstance+
 * 	'}' ';')?
 * 	& ('internal' 'instances'
 * 	'{'
 * 	componentTypeInstances+=MAODComponentTypeInstance+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'component' 'type' name=ID ('inherits' inherits+=[MAODComponentType|VersionedQualifiedReferenceName] (","
// inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*)? '{' (('attributes' '{' attributes+=MParameter+ '}'
// ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? & ('internal' 'instances' '{'
// componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?) '}' ';'
protected class MAODComponentType_Group extends GroupToken {
	
	public MAODComponentType_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAODComponentTypeRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'component'
protected class MAODComponentType_ComponentKeyword_0 extends KeywordToken  {
	
	public MAODComponentType_ComponentKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getComponentKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'type'
protected class MAODComponentType_TypeKeyword_1 extends KeywordToken  {
	
	public MAODComponentType_TypeKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getTypeKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_ComponentKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MAODComponentType_NameAssignment_2 extends AssignmentToken  {
	
	public MAODComponentType_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_TypeKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAODComponentTypeAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMAODComponentTypeAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MAODComponentType|VersionedQualifiedReferenceName] (","
// inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*)?
protected class MAODComponentType_Group_3 extends GroupToken {
	
	public MAODComponentType_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODComponentType_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MAODComponentType_InheritsKeyword_3_0 extends KeywordToken  {
	
	public MAODComponentType_InheritsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getInheritsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAODComponentType|VersionedQualifiedReferenceName]
protected class MAODComponentType_InheritsAssignment_3_1 extends AssignmentToken  {
	
	public MAODComponentType_InheritsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_InheritsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*
protected class MAODComponentType_Group_3_2 extends GroupToken {
	
	public MAODComponentType_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_InheritsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MAODComponentType_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MAODComponentType_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODComponentType_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAODComponentType|VersionedQualifiedReferenceName]
protected class MAODComponentType_InheritsAssignment_3_2_1 extends AssignmentToken  {
	
	public MAODComponentType_InheritsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MAODComponentType_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MAODComponentType_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODComponentType_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// (('attributes' '{' attributes+=MParameter+ '}' ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}'
// ';')? & ('internal' 'instances' '{' componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?)
protected class MAODComponentType_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MAODComponentType_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODComponentType_Group_5_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODComponentType_Group_5_0(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MAODComponentType_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MAODComponentType_Group_5_0 extends GroupToken {
	
	public MAODComponentType_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_SemicolonKeyword_5_0_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MAODComponentType_AttributesKeyword_5_0_0 extends KeywordToken  {
	
	public MAODComponentType_AttributesKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getAttributesKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODComponentType_LeftCurlyBracketKeyword_5_0_1 extends KeywordToken  {
	
	public MAODComponentType_LeftCurlyBracketKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_AttributesKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MAODComponentType_AttributesAssignment_5_0_2 extends AssignmentToken  {
	
	public MAODComponentType_AttributesAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getAttributesAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_0_2_0(); 
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
			case 0: return new MAODComponentType_AttributesAssignment_5_0_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODComponentType_LeftCurlyBracketKeyword_5_0_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODComponentType_RightCurlyBracketKeyword_5_0_3 extends KeywordToken  {
	
	public MAODComponentType_RightCurlyBracketKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_AttributesAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODComponentType_SemicolonKeyword_5_0_4 extends KeywordToken  {
	
	public MAODComponentType_SemicolonKeyword_5_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_RightCurlyBracketKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')?
protected class MAODComponentType_Group_5_1 extends GroupToken {
	
	public MAODComponentType_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_SemicolonKeyword_5_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'port'
protected class MAODComponentType_PortKeyword_5_1_0 extends KeywordToken  {
	
	public MAODComponentType_PortKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getPortKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODComponentType_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MAODComponentType_InstancesKeyword_5_1_1 extends KeywordToken  {
	
	public MAODComponentType_InstancesKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_PortKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODComponentType_LeftCurlyBracketKeyword_5_1_2 extends KeywordToken  {
	
	public MAODComponentType_LeftCurlyBracketKeyword_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_InstancesKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portTypeInstances+=MPortTypeInstance+
protected class MAODComponentType_PortTypeInstancesAssignment_5_1_3 extends AssignmentToken  {
	
	public MAODComponentType_PortTypeInstancesAssignment_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesAssignment_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortTypeInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_1_3_0(); 
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
			case 0: return new MAODComponentType_PortTypeInstancesAssignment_5_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODComponentType_LeftCurlyBracketKeyword_5_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODComponentType_RightCurlyBracketKeyword_5_1_4 extends KeywordToken  {
	
	public MAODComponentType_RightCurlyBracketKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_PortTypeInstancesAssignment_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODComponentType_SemicolonKeyword_5_1_5 extends KeywordToken  {
	
	public MAODComponentType_SemicolonKeyword_5_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_RightCurlyBracketKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('internal' 'instances' '{' componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?
protected class MAODComponentType_Group_5_2 extends GroupToken {
	
	public MAODComponentType_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'internal'
protected class MAODComponentType_InternalKeyword_5_2_0 extends KeywordToken  {
	
	public MAODComponentType_InternalKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getInternalKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAODComponentType_Group_5_0(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAODComponentType_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MAODComponentType_InstancesKeyword_5_2_1 extends KeywordToken  {
	
	public MAODComponentType_InstancesKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_InternalKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MAODComponentType_LeftCurlyBracketKeyword_5_2_2 extends KeywordToken  {
	
	public MAODComponentType_LeftCurlyBracketKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_InstancesKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// componentTypeInstances+=MAODComponentTypeInstance+
protected class MAODComponentType_ComponentTypeInstancesAssignment_5_2_3 extends AssignmentToken  {
	
	public MAODComponentType_ComponentTypeInstancesAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODComponentTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_5_2_3_0(); 
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
			case 0: return new MAODComponentType_ComponentTypeInstancesAssignment_5_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAODComponentType_LeftCurlyBracketKeyword_5_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MAODComponentType_RightCurlyBracketKeyword_5_2_4 extends KeywordToken  {
	
	public MAODComponentType_RightCurlyBracketKeyword_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_ComponentTypeInstancesAssignment_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODComponentType_SemicolonKeyword_5_2_5 extends KeywordToken  {
	
	public MAODComponentType_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_RightCurlyBracketKeyword_5_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MAODComponentType_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MAODComponentType_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MAODComponentType_SemicolonKeyword_7 extends KeywordToken  {
	
	public MAODComponentType_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentType_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MAODComponentType ****************/


/************ begin Rule MIODCType ****************
 *
 * MIODCType MIODAbstractComponentType:
 * 	MIODAbstractComponentType | MIODComponentType
 *
 **/

// MIODAbstractComponentType | MIODComponentType
protected class MIODCType_Alternatives extends AlternativesToken {

	public MIODCType_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMIODCTypeAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODCType_MIODAbstractComponentTypeParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODCType_MIODComponentTypeParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODAbstractComponentTypeRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIODComponentTypeRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MIODAbstractComponentType
protected class MIODCType_MIODAbstractComponentTypeParserRuleCall_0 extends RuleCallToken {
	
	public MIODCType_MIODAbstractComponentTypeParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMIODCTypeAccess().getMIODAbstractComponentTypeParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODAbstractComponentTypeRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIODAbstractComponentType_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MIODComponentType
protected class MIODCType_MIODComponentTypeParserRuleCall_1 extends RuleCallToken {
	
	public MIODCType_MIODComponentTypeParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMIODCTypeAccess().getMIODComponentTypeParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODComponentTypeRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIODComponentType_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MIODCType ****************/


/************ begin Rule MIODAbstractComponentType ****************
 *
 * MIODAbstractComponentType:
 * 	'abstract' 'component' 'type'
 * 	name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
 * 	inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
 * 	'{' (('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?
 * 	& ('port' 'instances'
 * 	'{'
 * 	portTypeInstances+=MPortTypeInstance+
 * 	'}' ';')?
 * 	& ('internal' 'instances'
 * 	'{'
 * 	componentTypeInstances+=MIODComponentTypeInstance+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'abstract' 'component' 'type' name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
// ("," inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)? '{' (('attributes' '{'
// attributes+=MParameter+ '}' ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? &
// ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?) '}' ';'
protected class MIODAbstractComponentType_Group extends GroupToken {
	
	public MIODAbstractComponentType_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODAbstractComponentTypeRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'abstract'
protected class MIODAbstractComponentType_AbstractKeyword_0 extends KeywordToken  {
	
	public MIODAbstractComponentType_AbstractKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getAbstractKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'component'
protected class MIODAbstractComponentType_ComponentKeyword_1 extends KeywordToken  {
	
	public MIODAbstractComponentType_ComponentKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getComponentKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_AbstractKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'type'
protected class MIODAbstractComponentType_TypeKeyword_2 extends KeywordToken  {
	
	public MIODAbstractComponentType_TypeKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getTypeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_ComponentKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MIODAbstractComponentType_NameAssignment_3 extends AssignmentToken  {
	
	public MIODAbstractComponentType_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_TypeKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIODAbstractComponentTypeAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIODAbstractComponentTypeAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
// inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
protected class MIODAbstractComponentType_Group_4 extends GroupToken {
	
	public MIODAbstractComponentType_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODAbstractComponentType_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MIODAbstractComponentType_InheritsKeyword_4_0 extends KeywordToken  {
	
	public MIODAbstractComponentType_InheritsKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
protected class MIODAbstractComponentType_InheritsAssignment_4_1 extends AssignmentToken  {
	
	public MIODAbstractComponentType_InheritsAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_InheritsKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*
protected class MIODAbstractComponentType_Group_4_2 extends GroupToken {
	
	public MIODAbstractComponentType_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_InheritsAssignment_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MIODAbstractComponentType_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public MIODAbstractComponentType_CommaKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODAbstractComponentType_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
protected class MIODAbstractComponentType_InheritsAssignment_4_2_1 extends AssignmentToken  {
	
	public MIODAbstractComponentType_InheritsAssignment_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_CommaKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MIODAbstractComponentType_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MIODAbstractComponentType_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODAbstractComponentType_NameAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// (('attributes' '{' attributes+=MParameter+ '}' ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}'
// ';')? & ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?)
protected class MIODAbstractComponentType_UnorderedGroup_6 extends UnorderedGroupToken {
	
	public MIODAbstractComponentType_UnorderedGroup_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODAbstractComponentType_Group_6_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODAbstractComponentType_Group_6_0(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODAbstractComponentType_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MIODAbstractComponentType_Group_6_0 extends GroupToken {
	
	public MIODAbstractComponentType_Group_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_SemicolonKeyword_6_0_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MIODAbstractComponentType_AttributesKeyword_6_0_0 extends KeywordToken  {
	
	public MIODAbstractComponentType_AttributesKeyword_6_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesKeyword_6_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODAbstractComponentType_LeftCurlyBracketKeyword_6_0_1 extends KeywordToken  {
	
	public MIODAbstractComponentType_LeftCurlyBracketKeyword_6_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_AttributesKeyword_6_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MIODAbstractComponentType_AttributesAssignment_6_0_2 extends AssignmentToken  {
	
	public MIODAbstractComponentType_AttributesAssignment_6_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesAssignment_6_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesMParameterParserRuleCall_6_0_2_0(); 
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
			case 0: return new MIODAbstractComponentType_AttributesAssignment_6_0_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODAbstractComponentType_LeftCurlyBracketKeyword_6_0_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODAbstractComponentType_RightCurlyBracketKeyword_6_0_3 extends KeywordToken  {
	
	public MIODAbstractComponentType_RightCurlyBracketKeyword_6_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_AttributesAssignment_6_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODAbstractComponentType_SemicolonKeyword_6_0_4 extends KeywordToken  {
	
	public MIODAbstractComponentType_SemicolonKeyword_6_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_RightCurlyBracketKeyword_6_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')?
protected class MIODAbstractComponentType_Group_6_1 extends GroupToken {
	
	public MIODAbstractComponentType_Group_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_SemicolonKeyword_6_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'port'
protected class MIODAbstractComponentType_PortKeyword_6_1_0 extends KeywordToken  {
	
	public MIODAbstractComponentType_PortKeyword_6_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getPortKeyword_6_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_Group_6_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODAbstractComponentType_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MIODAbstractComponentType_InstancesKeyword_6_1_1 extends KeywordToken  {
	
	public MIODAbstractComponentType_InstancesKeyword_6_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_PortKeyword_6_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODAbstractComponentType_LeftCurlyBracketKeyword_6_1_2 extends KeywordToken  {
	
	public MIODAbstractComponentType_LeftCurlyBracketKeyword_6_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_InstancesKeyword_6_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portTypeInstances+=MPortTypeInstance+
protected class MIODAbstractComponentType_PortTypeInstancesAssignment_6_1_3 extends AssignmentToken  {
	
	public MIODAbstractComponentType_PortTypeInstancesAssignment_6_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesAssignment_6_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortTypeInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_6_1_3_0(); 
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
			case 0: return new MIODAbstractComponentType_PortTypeInstancesAssignment_6_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODAbstractComponentType_LeftCurlyBracketKeyword_6_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODAbstractComponentType_RightCurlyBracketKeyword_6_1_4 extends KeywordToken  {
	
	public MIODAbstractComponentType_RightCurlyBracketKeyword_6_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_PortTypeInstancesAssignment_6_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODAbstractComponentType_SemicolonKeyword_6_1_5 extends KeywordToken  {
	
	public MIODAbstractComponentType_SemicolonKeyword_6_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_RightCurlyBracketKeyword_6_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?
protected class MIODAbstractComponentType_Group_6_2 extends GroupToken {
	
	public MIODAbstractComponentType_Group_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_SemicolonKeyword_6_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'internal'
protected class MIODAbstractComponentType_InternalKeyword_6_2_0 extends KeywordToken  {
	
	public MIODAbstractComponentType_InternalKeyword_6_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getInternalKeyword_6_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_Group_6_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODAbstractComponentType_Group_6_0(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODAbstractComponentType_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MIODAbstractComponentType_InstancesKeyword_6_2_1 extends KeywordToken  {
	
	public MIODAbstractComponentType_InstancesKeyword_6_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_InternalKeyword_6_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODAbstractComponentType_LeftCurlyBracketKeyword_6_2_2 extends KeywordToken  {
	
	public MIODAbstractComponentType_LeftCurlyBracketKeyword_6_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_InstancesKeyword_6_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// componentTypeInstances+=MIODComponentTypeInstance+
protected class MIODAbstractComponentType_ComponentTypeInstancesAssignment_6_2_3 extends AssignmentToken  {
	
	public MIODAbstractComponentType_ComponentTypeInstancesAssignment_6_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesAssignment_6_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODComponentTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_6_2_3_0(); 
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
			case 0: return new MIODAbstractComponentType_ComponentTypeInstancesAssignment_6_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODAbstractComponentType_LeftCurlyBracketKeyword_6_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODAbstractComponentType_RightCurlyBracketKeyword_6_2_4 extends KeywordToken  {
	
	public MIODAbstractComponentType_RightCurlyBracketKeyword_6_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_ComponentTypeInstancesAssignment_6_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODAbstractComponentType_SemicolonKeyword_6_2_5 extends KeywordToken  {
	
	public MIODAbstractComponentType_SemicolonKeyword_6_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_RightCurlyBracketKeyword_6_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MIODAbstractComponentType_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MIODAbstractComponentType_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_UnorderedGroup_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODAbstractComponentType_SemicolonKeyword_8 extends KeywordToken  {
	
	public MIODAbstractComponentType_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODAbstractComponentType_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIODAbstractComponentType ****************/


/************ begin Rule MIODComponentType ****************
 *
 * MIODComponentType:
 * 	'component' 'type'
 * 	name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
 * 	inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
 * 	'{' ('language' ':=' language=[system::MLanguage|VersionedQualifiedName] ';' & ('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?
 * 	& ('port' 'instances'
 * 	'{'
 * 	portTypeInstances+=MPortTypeInstance+
 * 	'}' ';')?
 * 	& ('internal' 'instances'
 * 	'{'
 * 	componentTypeInstances+=MIODComponentTypeInstance+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'component' 'type' name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
// inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)? '{' ('language' ':='
// language=[system::MLanguage|VersionedQualifiedName] ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('port'
// 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? & ('internal' 'instances' '{'
// componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?) '}' ';'
protected class MIODComponentType_Group extends GroupToken {
	
	public MIODComponentType_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODComponentTypeRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'component'
protected class MIODComponentType_ComponentKeyword_0 extends KeywordToken  {
	
	public MIODComponentType_ComponentKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getComponentKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'type'
protected class MIODComponentType_TypeKeyword_1 extends KeywordToken  {
	
	public MIODComponentType_TypeKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getTypeKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_ComponentKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MIODComponentType_NameAssignment_2 extends AssignmentToken  {
	
	public MIODComponentType_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_TypeKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIODComponentTypeAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIODComponentTypeAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
// inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
protected class MIODComponentType_Group_3 extends GroupToken {
	
	public MIODComponentType_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODComponentType_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MIODComponentType_InheritsKeyword_3_0 extends KeywordToken  {
	
	public MIODComponentType_InheritsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getInheritsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
protected class MIODComponentType_InheritsAssignment_3_1 extends AssignmentToken  {
	
	public MIODComponentType_InheritsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_InheritsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*
protected class MIODComponentType_Group_3_2 extends GroupToken {
	
	public MIODComponentType_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_InheritsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MIODComponentType_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MIODComponentType_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODComponentType_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
protected class MIODComponentType_InheritsAssignment_3_2_1 extends AssignmentToken  {
	
	public MIODComponentType_InheritsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MIODComponentType_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MIODComponentType_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODComponentType_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ('language' ':=' language=[system::MLanguage|VersionedQualifiedName] ';' & ('attributes' '{' attributes+=MParameter+ '}'
// ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? & ('internal' 'instances' '{'
// componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?)
protected class MIODComponentType_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MIODComponentType_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODComponentType_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODComponentType_Group_5_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MIODComponentType_Group_5_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// 'language' ':=' language=[system::MLanguage|VersionedQualifiedName] ';'
protected class MIODComponentType_Group_5_0 extends GroupToken {
	
	public MIODComponentType_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'language'
protected class MIODComponentType_LanguageKeyword_5_0_0 extends KeywordToken  {
	
	public MIODComponentType_LanguageKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getLanguageKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MIODComponentType_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MIODComponentType_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_LanguageKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// language=[system::MLanguage|VersionedQualifiedName]
protected class MIODComponentType_LanguageAssignment_5_0_2 extends AssignmentToken  {
	
	public MIODComponentType_LanguageAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getLanguageAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("language",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("language");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODComponentTypeAccess().getLanguageMLanguageCrossReference_5_0_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODComponentTypeAccess().getLanguageMLanguageCrossReference_5_0_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MIODComponentType_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MIODComponentType_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_LanguageAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MIODComponentType_Group_5_1 extends GroupToken {
	
	public MIODComponentType_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_SemicolonKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MIODComponentType_AttributesKeyword_5_1_0 extends KeywordToken  {
	
	public MIODComponentType_AttributesKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getAttributesKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODComponentType_LeftCurlyBracketKeyword_5_1_1 extends KeywordToken  {
	
	public MIODComponentType_LeftCurlyBracketKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_AttributesKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MIODComponentType_AttributesAssignment_5_1_2 extends AssignmentToken  {
	
	public MIODComponentType_AttributesAssignment_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getAttributesAssignment_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_1_2_0(); 
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
			case 0: return new MIODComponentType_AttributesAssignment_5_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODComponentType_LeftCurlyBracketKeyword_5_1_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODComponentType_RightCurlyBracketKeyword_5_1_3 extends KeywordToken  {
	
	public MIODComponentType_RightCurlyBracketKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_AttributesAssignment_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODComponentType_SemicolonKeyword_5_1_4 extends KeywordToken  {
	
	public MIODComponentType_SemicolonKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_RightCurlyBracketKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')?
protected class MIODComponentType_Group_5_2 extends GroupToken {
	
	public MIODComponentType_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'port'
protected class MIODComponentType_PortKeyword_5_2_0 extends KeywordToken  {
	
	public MIODComponentType_PortKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getPortKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODComponentType_Group_5_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MIODComponentType_InstancesKeyword_5_2_1 extends KeywordToken  {
	
	public MIODComponentType_InstancesKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_PortKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODComponentType_LeftCurlyBracketKeyword_5_2_2 extends KeywordToken  {
	
	public MIODComponentType_LeftCurlyBracketKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_InstancesKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portTypeInstances+=MPortTypeInstance+
protected class MIODComponentType_PortTypeInstancesAssignment_5_2_3 extends AssignmentToken  {
	
	public MIODComponentType_PortTypeInstancesAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortTypeInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_2_3_0(); 
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
			case 0: return new MIODComponentType_PortTypeInstancesAssignment_5_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODComponentType_LeftCurlyBracketKeyword_5_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODComponentType_RightCurlyBracketKeyword_5_2_4 extends KeywordToken  {
	
	public MIODComponentType_RightCurlyBracketKeyword_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_PortTypeInstancesAssignment_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODComponentType_SemicolonKeyword_5_2_5 extends KeywordToken  {
	
	public MIODComponentType_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_RightCurlyBracketKeyword_5_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?
protected class MIODComponentType_Group_5_3 extends GroupToken {
	
	public MIODComponentType_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_SemicolonKeyword_5_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'internal'
protected class MIODComponentType_InternalKeyword_5_3_0 extends KeywordToken  {
	
	public MIODComponentType_InternalKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getInternalKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIODComponentType_Group_5_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MIODComponentType_Group_5_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'instances'
protected class MIODComponentType_InstancesKeyword_5_3_1 extends KeywordToken  {
	
	public MIODComponentType_InstancesKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_InternalKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MIODComponentType_LeftCurlyBracketKeyword_5_3_2 extends KeywordToken  {
	
	public MIODComponentType_LeftCurlyBracketKeyword_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_InstancesKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// componentTypeInstances+=MIODComponentTypeInstance+
protected class MIODComponentType_ComponentTypeInstancesAssignment_5_3_3 extends AssignmentToken  {
	
	public MIODComponentType_ComponentTypeInstancesAssignment_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesAssignment_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentTypeInstances",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentTypeInstances");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODComponentTypeInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_5_3_3_0(); 
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
			case 0: return new MIODComponentType_ComponentTypeInstancesAssignment_5_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIODComponentType_LeftCurlyBracketKeyword_5_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MIODComponentType_RightCurlyBracketKeyword_5_3_4 extends KeywordToken  {
	
	public MIODComponentType_RightCurlyBracketKeyword_5_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_ComponentTypeInstancesAssignment_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODComponentType_SemicolonKeyword_5_3_5 extends KeywordToken  {
	
	public MIODComponentType_SemicolonKeyword_5_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_RightCurlyBracketKeyword_5_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MIODComponentType_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MIODComponentType_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MIODComponentType_SemicolonKeyword_7 extends KeywordToken  {
	
	public MIODComponentType_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentType_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIODComponentType ****************/


/************ begin Rule MIODComponentTypeInstance ****************
 *
 * MIODComponentTypeInstance:
 * 	'type'
 * 	componentType=[MIODAbstractComponentType]
 * 	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
 * 	';';
 *
 **/

// 'type' componentType=[MIODAbstractComponentType] 'range' lowerBound=MParameterValueExpression 'to'
// upperBound=MParameterValueExpression ';'
protected class MIODComponentTypeInstance_Group extends GroupToken {
	
	public MIODComponentTypeInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIODComponentTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'type'
protected class MIODComponentTypeInstance_TypeKeyword_0 extends KeywordToken  {
	
	public MIODComponentTypeInstance_TypeKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getTypeKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// componentType=[MIODAbstractComponentType]
protected class MIODComponentTypeInstance_ComponentTypeAssignment_1 extends AssignmentToken  {
	
	public MIODComponentTypeInstance_ComponentTypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_TypeKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentType",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentType");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeMIODAbstractComponentTypeCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeMIODAbstractComponentTypeCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'range'
protected class MIODComponentTypeInstance_RangeKeyword_2 extends KeywordToken  {
	
	public MIODComponentTypeInstance_RangeKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getRangeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_ComponentTypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerBound=MParameterValueExpression
protected class MIODComponentTypeInstance_LowerBoundAssignment_3 extends AssignmentToken  {
	
	public MIODComponentTypeInstance_LowerBoundAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MIODComponentTypeInstance_RangeKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// 'to'
protected class MIODComponentTypeInstance_ToKeyword_4 extends KeywordToken  {
	
	public MIODComponentTypeInstance_ToKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getToKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_LowerBoundAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperBound=MParameterValueExpression
protected class MIODComponentTypeInstance_UpperBoundAssignment_5 extends AssignmentToken  {
	
	public MIODComponentTypeInstance_UpperBoundAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0(); 
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
			case 0: return new MIODComponentTypeInstance_ToKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MIODComponentTypeInstance_SemicolonKeyword_6 extends KeywordToken  {
	
	public MIODComponentTypeInstance_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIODComponentTypeInstanceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIODComponentTypeInstance_UpperBoundAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIODComponentTypeInstance ****************/


/************ begin Rule MAODComponentTypeInstance ****************
 *
 * MAODComponentTypeInstance:
 * 	'type'
 * 	componentType=[MAODComponentType]
 * 	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
 * 	';';
 *
 **/

// 'type' componentType=[MAODComponentType] 'range' lowerBound=MParameterValueExpression 'to'
// upperBound=MParameterValueExpression ';'
protected class MAODComponentTypeInstance_Group extends GroupToken {
	
	public MAODComponentTypeInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentTypeInstance_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAODComponentTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'type'
protected class MAODComponentTypeInstance_TypeKeyword_0 extends KeywordToken  {
	
	public MAODComponentTypeInstance_TypeKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getTypeKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// componentType=[MAODComponentType]
protected class MAODComponentTypeInstance_ComponentTypeAssignment_1 extends AssignmentToken  {
	
	public MAODComponentTypeInstance_ComponentTypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentTypeInstance_TypeKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("componentType",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("componentType");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeMAODComponentTypeCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeMAODComponentTypeCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'range'
protected class MAODComponentTypeInstance_RangeKeyword_2 extends KeywordToken  {
	
	public MAODComponentTypeInstance_RangeKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getRangeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentTypeInstance_ComponentTypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerBound=MParameterValueExpression
protected class MAODComponentTypeInstance_LowerBoundAssignment_3 extends AssignmentToken  {
	
	public MAODComponentTypeInstance_LowerBoundAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MAODComponentTypeInstance_RangeKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// 'to'
protected class MAODComponentTypeInstance_ToKeyword_4 extends KeywordToken  {
	
	public MAODComponentTypeInstance_ToKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getToKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentTypeInstance_LowerBoundAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperBound=MParameterValueExpression
protected class MAODComponentTypeInstance_UpperBoundAssignment_5 extends AssignmentToken  {
	
	public MAODComponentTypeInstance_UpperBoundAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0(); 
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
			case 0: return new MAODComponentTypeInstance_ToKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MAODComponentTypeInstance_SemicolonKeyword_6 extends KeywordToken  {
	
	public MAODComponentTypeInstance_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAODComponentTypeInstanceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAODComponentTypeInstance_UpperBoundAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MAODComponentTypeInstance ****************/


/************ begin Rule MPortTypeInstance ****************
 *
 * MPortTypeInstance:
 * 	MExternalPortTypeInstance | MInternalPortTypeInstance;
 *
 **/

// MExternalPortTypeInstance | MInternalPortTypeInstance
protected class MPortTypeInstance_Alternatives extends AlternativesToken {

	public MPortTypeInstance_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMPortTypeInstanceAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortTypeInstance_MExternalPortTypeInstanceParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortTypeInstance_MInternalPortTypeInstanceParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExternalClientPortTypeInstanceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMExternalServerPortTypeInstanceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMInternalClientPortTypeInstanceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMInternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MExternalPortTypeInstance
protected class MPortTypeInstance_MExternalPortTypeInstanceParserRuleCall_0 extends RuleCallToken {
	
	public MPortTypeInstance_MExternalPortTypeInstanceParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPortTypeInstanceAccess().getMExternalPortTypeInstanceParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalPortTypeInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExternalClientPortTypeInstanceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMExternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MExternalPortTypeInstance_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MInternalPortTypeInstance
protected class MPortTypeInstance_MInternalPortTypeInstanceParserRuleCall_1 extends RuleCallToken {
	
	public MPortTypeInstance_MInternalPortTypeInstanceParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPortTypeInstanceAccess().getMInternalPortTypeInstanceParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalPortTypeInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalClientPortTypeInstanceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMInternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MInternalPortTypeInstance_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MPortTypeInstance ****************/


/************ begin Rule MExternalPortTypeInstance ****************
 *
 * MExternalPortTypeInstance:
 * 	MExternalClientPortTypeInstance | MExternalServerPortTypeInstance;
 *
 **/

// MExternalClientPortTypeInstance | MExternalServerPortTypeInstance
protected class MExternalPortTypeInstance_Alternatives extends AlternativesToken {

	public MExternalPortTypeInstance_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMExternalPortTypeInstanceAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalPortTypeInstance_MExternalClientPortTypeInstanceParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MExternalPortTypeInstance_MExternalServerPortTypeInstanceParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExternalClientPortTypeInstanceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMExternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MExternalClientPortTypeInstance
protected class MExternalPortTypeInstance_MExternalClientPortTypeInstanceParserRuleCall_0 extends RuleCallToken {
	
	public MExternalPortTypeInstance_MExternalClientPortTypeInstanceParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalClientPortTypeInstanceParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalClientPortTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExternalClientPortTypeInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MExternalClientPortTypeInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MExternalServerPortTypeInstance
protected class MExternalPortTypeInstance_MExternalServerPortTypeInstanceParserRuleCall_1 extends RuleCallToken {
	
	public MExternalPortTypeInstance_MExternalServerPortTypeInstanceParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalServerPortTypeInstanceParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalServerPortTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MExternalServerPortTypeInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MExternalPortTypeInstance ****************/


/************ begin Rule MExternalClientPortTypeInstance ****************
 *
 * MExternalClientPortTypeInstance:
 * 	'external' 'client'
 * 	portType=[MPortType]
 * 	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
 * 	';';
 *
 **/

// 'external' 'client' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
// upperBound=MParameterValueExpression ';'
protected class MExternalClientPortTypeInstance_Group extends GroupToken {
	
	public MExternalClientPortTypeInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalClientPortTypeInstance_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExternalClientPortTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'external'
protected class MExternalClientPortTypeInstance_ExternalKeyword_0 extends KeywordToken  {
	
	public MExternalClientPortTypeInstance_ExternalKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getExternalKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'client'
protected class MExternalClientPortTypeInstance_ClientKeyword_1 extends KeywordToken  {
	
	public MExternalClientPortTypeInstance_ClientKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getClientKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalClientPortTypeInstance_ExternalKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portType=[MPortType]
protected class MExternalClientPortTypeInstance_PortTypeAssignment_2 extends AssignmentToken  {
	
	public MExternalClientPortTypeInstance_PortTypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalClientPortTypeInstance_ClientKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portType",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portType");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'range'
protected class MExternalClientPortTypeInstance_RangeKeyword_3 extends KeywordToken  {
	
	public MExternalClientPortTypeInstance_RangeKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getRangeKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalClientPortTypeInstance_PortTypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerBound=MParameterValueExpression
protected class MExternalClientPortTypeInstance_LowerBoundAssignment_4 extends AssignmentToken  {
	
	public MExternalClientPortTypeInstance_LowerBoundAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MExternalClientPortTypeInstance_RangeKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// 'to'
protected class MExternalClientPortTypeInstance_ToKeyword_5 extends KeywordToken  {
	
	public MExternalClientPortTypeInstance_ToKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getToKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalClientPortTypeInstance_LowerBoundAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperBound=MParameterValueExpression
protected class MExternalClientPortTypeInstance_UpperBoundAssignment_6 extends AssignmentToken  {
	
	public MExternalClientPortTypeInstance_UpperBoundAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0(); 
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
			case 0: return new MExternalClientPortTypeInstance_ToKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MExternalClientPortTypeInstance_SemicolonKeyword_7 extends KeywordToken  {
	
	public MExternalClientPortTypeInstance_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalClientPortTypeInstanceAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalClientPortTypeInstance_UpperBoundAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MExternalClientPortTypeInstance ****************/


/************ begin Rule MExternalServerPortTypeInstance ****************
 *
 * MExternalServerPortTypeInstance:
 * 	'external' 'server'
 * 	portType=[MPortType]
 * 	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
 * 	';';
 *
 **/

// 'external' 'server' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
// upperBound=MParameterValueExpression ';'
protected class MExternalServerPortTypeInstance_Group extends GroupToken {
	
	public MExternalServerPortTypeInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalServerPortTypeInstance_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'external'
protected class MExternalServerPortTypeInstance_ExternalKeyword_0 extends KeywordToken  {
	
	public MExternalServerPortTypeInstance_ExternalKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getExternalKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'server'
protected class MExternalServerPortTypeInstance_ServerKeyword_1 extends KeywordToken  {
	
	public MExternalServerPortTypeInstance_ServerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getServerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalServerPortTypeInstance_ExternalKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portType=[MPortType]
protected class MExternalServerPortTypeInstance_PortTypeAssignment_2 extends AssignmentToken  {
	
	public MExternalServerPortTypeInstance_PortTypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalServerPortTypeInstance_ServerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portType",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portType");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'range'
protected class MExternalServerPortTypeInstance_RangeKeyword_3 extends KeywordToken  {
	
	public MExternalServerPortTypeInstance_RangeKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getRangeKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalServerPortTypeInstance_PortTypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerBound=MParameterValueExpression
protected class MExternalServerPortTypeInstance_LowerBoundAssignment_4 extends AssignmentToken  {
	
	public MExternalServerPortTypeInstance_LowerBoundAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MExternalServerPortTypeInstance_RangeKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// 'to'
protected class MExternalServerPortTypeInstance_ToKeyword_5 extends KeywordToken  {
	
	public MExternalServerPortTypeInstance_ToKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getToKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalServerPortTypeInstance_LowerBoundAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperBound=MParameterValueExpression
protected class MExternalServerPortTypeInstance_UpperBoundAssignment_6 extends AssignmentToken  {
	
	public MExternalServerPortTypeInstance_UpperBoundAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0(); 
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
			case 0: return new MExternalServerPortTypeInstance_ToKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MExternalServerPortTypeInstance_SemicolonKeyword_7 extends KeywordToken  {
	
	public MExternalServerPortTypeInstance_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExternalServerPortTypeInstanceAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExternalServerPortTypeInstance_UpperBoundAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MExternalServerPortTypeInstance ****************/


/************ begin Rule MInternalPortTypeInstance ****************
 *
 * MInternalPortTypeInstance:
 * 	MInternalClientPortTypeInstance | MInternalServerPortTypeInstance;
 *
 **/

// MInternalClientPortTypeInstance | MInternalServerPortTypeInstance
protected class MInternalPortTypeInstance_Alternatives extends AlternativesToken {

	public MInternalPortTypeInstance_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMInternalPortTypeInstanceAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalPortTypeInstance_MInternalClientPortTypeInstanceParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalPortTypeInstance_MInternalServerPortTypeInstanceParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalClientPortTypeInstanceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMInternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MInternalClientPortTypeInstance
protected class MInternalPortTypeInstance_MInternalClientPortTypeInstanceParserRuleCall_0 extends RuleCallToken {
	
	public MInternalPortTypeInstance_MInternalClientPortTypeInstanceParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalClientPortTypeInstanceParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalClientPortTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalClientPortTypeInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MInternalClientPortTypeInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MInternalServerPortTypeInstance
protected class MInternalPortTypeInstance_MInternalServerPortTypeInstanceParserRuleCall_1 extends RuleCallToken {
	
	public MInternalPortTypeInstance_MInternalServerPortTypeInstanceParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalServerPortTypeInstanceParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalServerPortTypeInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MInternalServerPortTypeInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MInternalPortTypeInstance ****************/


/************ begin Rule MInternalClientPortTypeInstance ****************
 *
 * MInternalClientPortTypeInstance:
 * 	'internal' 'client'
 * 	portType=[MPortType]
 * 	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
 * 	';';
 *
 **/

// 'internal' 'client' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
// upperBound=MParameterValueExpression ';'
protected class MInternalClientPortTypeInstance_Group extends GroupToken {
	
	public MInternalClientPortTypeInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalClientPortTypeInstance_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalClientPortTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'internal'
protected class MInternalClientPortTypeInstance_InternalKeyword_0 extends KeywordToken  {
	
	public MInternalClientPortTypeInstance_InternalKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getInternalKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'client'
protected class MInternalClientPortTypeInstance_ClientKeyword_1 extends KeywordToken  {
	
	public MInternalClientPortTypeInstance_ClientKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getClientKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalClientPortTypeInstance_InternalKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portType=[MPortType]
protected class MInternalClientPortTypeInstance_PortTypeAssignment_2 extends AssignmentToken  {
	
	public MInternalClientPortTypeInstance_PortTypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalClientPortTypeInstance_ClientKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portType",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portType");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'range'
protected class MInternalClientPortTypeInstance_RangeKeyword_3 extends KeywordToken  {
	
	public MInternalClientPortTypeInstance_RangeKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getRangeKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalClientPortTypeInstance_PortTypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerBound=MParameterValueExpression
protected class MInternalClientPortTypeInstance_LowerBoundAssignment_4 extends AssignmentToken  {
	
	public MInternalClientPortTypeInstance_LowerBoundAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MInternalClientPortTypeInstance_RangeKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// 'to'
protected class MInternalClientPortTypeInstance_ToKeyword_5 extends KeywordToken  {
	
	public MInternalClientPortTypeInstance_ToKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getToKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalClientPortTypeInstance_LowerBoundAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperBound=MParameterValueExpression
protected class MInternalClientPortTypeInstance_UpperBoundAssignment_6 extends AssignmentToken  {
	
	public MInternalClientPortTypeInstance_UpperBoundAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0(); 
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
			case 0: return new MInternalClientPortTypeInstance_ToKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MInternalClientPortTypeInstance_SemicolonKeyword_7 extends KeywordToken  {
	
	public MInternalClientPortTypeInstance_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalClientPortTypeInstanceAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalClientPortTypeInstance_UpperBoundAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInternalClientPortTypeInstance ****************/


/************ begin Rule MInternalServerPortTypeInstance ****************
 *
 * MInternalServerPortTypeInstance:
 * 	'internal' 'server'
 * 	portType=[MPortType]
 * 	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
 * 	';';
 *
 **/

// 'internal' 'server' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
// upperBound=MParameterValueExpression ';'
protected class MInternalServerPortTypeInstance_Group extends GroupToken {
	
	public MInternalServerPortTypeInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalServerPortTypeInstance_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalServerPortTypeInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'internal'
protected class MInternalServerPortTypeInstance_InternalKeyword_0 extends KeywordToken  {
	
	public MInternalServerPortTypeInstance_InternalKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getInternalKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'server'
protected class MInternalServerPortTypeInstance_ServerKeyword_1 extends KeywordToken  {
	
	public MInternalServerPortTypeInstance_ServerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getServerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalServerPortTypeInstance_InternalKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// portType=[MPortType]
protected class MInternalServerPortTypeInstance_PortTypeAssignment_2 extends AssignmentToken  {
	
	public MInternalServerPortTypeInstance_PortTypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalServerPortTypeInstance_ServerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("portType",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("portType");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'range'
protected class MInternalServerPortTypeInstance_RangeKeyword_3 extends KeywordToken  {
	
	public MInternalServerPortTypeInstance_RangeKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getRangeKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalServerPortTypeInstance_PortTypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerBound=MParameterValueExpression
protected class MInternalServerPortTypeInstance_LowerBoundAssignment_4 extends AssignmentToken  {
	
	public MInternalServerPortTypeInstance_LowerBoundAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MInternalServerPortTypeInstance_RangeKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// 'to'
protected class MInternalServerPortTypeInstance_ToKeyword_5 extends KeywordToken  {
	
	public MInternalServerPortTypeInstance_ToKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getToKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalServerPortTypeInstance_LowerBoundAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperBound=MParameterValueExpression
protected class MInternalServerPortTypeInstance_UpperBoundAssignment_6 extends AssignmentToken  {
	
	public MInternalServerPortTypeInstance_UpperBoundAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0(); 
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
			case 0: return new MInternalServerPortTypeInstance_ToKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MInternalServerPortTypeInstance_SemicolonKeyword_7 extends KeywordToken  {
	
	public MInternalServerPortTypeInstance_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalServerPortTypeInstanceAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalServerPortTypeInstance_UpperBoundAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInternalServerPortTypeInstance ****************/


/************ begin Rule MPortType ****************
 *
 * MPortType:
 * 	{MPortType}
 * 	'port' 'type'
 * 	name=ID ('inherits' inherits+=[MPortType|VersionedQualifiedReferenceName] (","
 * 	inherits+=[MPortType|VersionedQualifiedReferenceName])*)?
 * 	'{' ('interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
 * 	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' & ('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?
 * 	& ('client' 'attributes'
 * 	'{'
 * 	clientAttributes+=MParameter+
 * 	'}' ';')?
 * 	& ('server' 'attributes'
 * 	'{'
 * 	serverAttributes+=MParameter+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// {MPortType} 'port' 'type' name=ID ('inherits' inherits+=[MPortType|VersionedQualifiedReferenceName] (","
// inherits+=[MPortType|VersionedQualifiedReferenceName])*)? '{' ('interface' 'types' ':='
// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
// ';')? & ('client' 'attributes' '{' clientAttributes+=MParameter+ '}' ';')? & ('server' 'attributes' '{'
// serverAttributes+=MParameter+ '}' ';')?) '}' ';'
protected class MPortType_Group extends GroupToken {
	
	public MPortType_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMPortTypeAccess().getMPortTypeAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MPortType}
protected class MPortType_MPortTypeAction_0 extends ActionToken  {

	public MPortType_MPortTypeAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getMPortTypeAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'port'
protected class MPortType_PortKeyword_1 extends KeywordToken  {
	
	public MPortType_PortKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getPortKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_MPortTypeAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'type'
protected class MPortType_TypeKeyword_2 extends KeywordToken  {
	
	public MPortType_TypeKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getTypeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_PortKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MPortType_NameAssignment_3 extends AssignmentToken  {
	
	public MPortType_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_TypeKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMPortTypeAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMPortTypeAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MPortType|VersionedQualifiedReferenceName] (","
// inherits+=[MPortType|VersionedQualifiedReferenceName])*)?
protected class MPortType_Group_4 extends GroupToken {
	
	public MPortType_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MPortType_InheritsKeyword_4_0 extends KeywordToken  {
	
	public MPortType_InheritsKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getInheritsKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MPortType|VersionedQualifiedReferenceName]
protected class MPortType_InheritsAssignment_4_1 extends AssignmentToken  {
	
	public MPortType_InheritsAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_InheritsKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MPortType|VersionedQualifiedReferenceName])*
protected class MPortType_Group_4_2 extends GroupToken {
	
	public MPortType_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_InheritsAssignment_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MPortType_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public MPortType_CommaKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MPortType|VersionedQualifiedReferenceName]
protected class MPortType_InheritsAssignment_4_2_1 extends AssignmentToken  {
	
	public MPortType_InheritsAssignment_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_CommaKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MPortType_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MPortType_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_NameAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ('interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
// ';')? & ('client' 'attributes' '{' clientAttributes+=MParameter+ '}' ';')? & ('server' 'attributes' '{'
// serverAttributes+=MParameter+ '}' ';')?)
protected class MPortType_UnorderedGroup_6 extends UnorderedGroupToken {
	
	public MPortType_UnorderedGroup_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getUnorderedGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_Group_6_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MPortType_Group_6_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MPortType_Group_6_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// 'interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';'
protected class MPortType_Group_6_0 extends GroupToken {
	
	public MPortType_Group_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_SemicolonKeyword_6_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'interface'
protected class MPortType_InterfaceKeyword_6_0_0 extends KeywordToken  {
	
	public MPortType_InterfaceKeyword_6_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getInterfaceKeyword_6_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MPortType_TypesKeyword_6_0_1 extends KeywordToken  {
	
	public MPortType_TypesKeyword_6_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getTypesKeyword_6_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_InterfaceKeyword_6_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MPortType_ColonEqualsSignKeyword_6_0_2 extends KeywordToken  {
	
	public MPortType_ColonEqualsSignKeyword_6_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getColonEqualsSignKeyword_6_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_TypesKeyword_6_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
protected class MPortType_InterfaceTypesAssignment_6_0_3 extends AssignmentToken  {
	
	public MPortType_InterfaceTypesAssignment_6_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_ColonEqualsSignKeyword_6_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaceTypes",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaceTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])*
protected class MPortType_Group_6_0_4 extends GroupToken {
	
	public MPortType_Group_6_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup_6_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_InterfaceTypesAssignment_6_0_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MPortType_CommaKeyword_6_0_4_0 extends KeywordToken  {
	
	public MPortType_CommaKeyword_6_0_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getCommaKeyword_6_0_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_6_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_InterfaceTypesAssignment_6_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
protected class MPortType_InterfaceTypesAssignment_6_0_4_1 extends AssignmentToken  {
	
	public MPortType_InterfaceTypesAssignment_6_0_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_CommaKeyword_6_0_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaceTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaceTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MPortType_SemicolonKeyword_6_0_5 extends KeywordToken  {
	
	public MPortType_SemicolonKeyword_6_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_6_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_InterfaceTypesAssignment_6_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MPortType_Group_6_1 extends GroupToken {
	
	public MPortType_Group_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_SemicolonKeyword_6_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MPortType_AttributesKeyword_6_1_0 extends KeywordToken  {
	
	public MPortType_AttributesKeyword_6_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MPortType_LeftCurlyBracketKeyword_6_1_1 extends KeywordToken  {
	
	public MPortType_LeftCurlyBracketKeyword_6_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_AttributesKeyword_6_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MPortType_AttributesAssignment_6_1_2 extends AssignmentToken  {
	
	public MPortType_AttributesAssignment_6_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getAttributesAssignment_6_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMPortTypeAccess().getAttributesMParameterParserRuleCall_6_1_2_0(); 
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
			case 0: return new MPortType_AttributesAssignment_6_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MPortType_LeftCurlyBracketKeyword_6_1_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MPortType_RightCurlyBracketKeyword_6_1_3 extends KeywordToken  {
	
	public MPortType_RightCurlyBracketKeyword_6_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_AttributesAssignment_6_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MPortType_SemicolonKeyword_6_1_4 extends KeywordToken  {
	
	public MPortType_SemicolonKeyword_6_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_RightCurlyBracketKeyword_6_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('client' 'attributes' '{' clientAttributes+=MParameter+ '}' ';')?
protected class MPortType_Group_6_2 extends GroupToken {
	
	public MPortType_Group_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_SemicolonKeyword_6_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'client'
protected class MPortType_ClientKeyword_6_2_0 extends KeywordToken  {
	
	public MPortType_ClientKeyword_6_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getClientKeyword_6_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_6_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_Group_6_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MPortType_AttributesKeyword_6_2_1 extends KeywordToken  {
	
	public MPortType_AttributesKeyword_6_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_ClientKeyword_6_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MPortType_LeftCurlyBracketKeyword_6_2_2 extends KeywordToken  {
	
	public MPortType_LeftCurlyBracketKeyword_6_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_AttributesKeyword_6_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientAttributes+=MParameter+
protected class MPortType_ClientAttributesAssignment_6_2_3 extends AssignmentToken  {
	
	public MPortType_ClientAttributesAssignment_6_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getClientAttributesAssignment_6_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientAttributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientAttributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMPortTypeAccess().getClientAttributesMParameterParserRuleCall_6_2_3_0(); 
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
			case 0: return new MPortType_ClientAttributesAssignment_6_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MPortType_LeftCurlyBracketKeyword_6_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MPortType_RightCurlyBracketKeyword_6_2_4 extends KeywordToken  {
	
	public MPortType_RightCurlyBracketKeyword_6_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_ClientAttributesAssignment_6_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MPortType_SemicolonKeyword_6_2_5 extends KeywordToken  {
	
	public MPortType_SemicolonKeyword_6_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_RightCurlyBracketKeyword_6_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('server' 'attributes' '{' serverAttributes+=MParameter+ '}' ';')?
protected class MPortType_Group_6_3 extends GroupToken {
	
	public MPortType_Group_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getGroup_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_SemicolonKeyword_6_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'server'
protected class MPortType_ServerKeyword_6_3_0 extends KeywordToken  {
	
	public MPortType_ServerKeyword_6_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getServerKeyword_6_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPortType_Group_6_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MPortType_Group_6_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MPortType_AttributesKeyword_6_3_1 extends KeywordToken  {
	
	public MPortType_AttributesKeyword_6_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_ServerKeyword_6_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MPortType_LeftCurlyBracketKeyword_6_3_2 extends KeywordToken  {
	
	public MPortType_LeftCurlyBracketKeyword_6_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_AttributesKeyword_6_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverAttributes+=MParameter+
protected class MPortType_ServerAttributesAssignment_6_3_3 extends AssignmentToken  {
	
	public MPortType_ServerAttributesAssignment_6_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getServerAttributesAssignment_6_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverAttributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverAttributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMPortTypeAccess().getServerAttributesMParameterParserRuleCall_6_3_3_0(); 
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
			case 0: return new MPortType_ServerAttributesAssignment_6_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MPortType_LeftCurlyBracketKeyword_6_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MPortType_RightCurlyBracketKeyword_6_3_4 extends KeywordToken  {
	
	public MPortType_RightCurlyBracketKeyword_6_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_ServerAttributesAssignment_6_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MPortType_SemicolonKeyword_6_3_5 extends KeywordToken  {
	
	public MPortType_SemicolonKeyword_6_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_RightCurlyBracketKeyword_6_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MPortType_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MPortType_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_UnorderedGroup_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MPortType_SemicolonKeyword_8 extends KeywordToken  {
	
	public MPortType_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPortTypeAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPortType_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MPortType ****************/


/************ begin Rule MExchangeModel ****************
 *
 * MExchangeModel:
 * 	{MExchangeModel}
 * 	'exchange' 'model'
 * 	name=ID ('inherits' inherits+=[MExchangeModel|VersionedQualifiedReferenceName] (","
 * 	inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*)?
 * 	'{'
 * 	'interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] ","
 * 	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
 * 	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';'
 * 	'}' ';';
 *
 **/

// {MExchangeModel} 'exchange' 'model' name=ID ('inherits' inherits+=[MExchangeModel|VersionedQualifiedReferenceName] (","
// inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*)? '{' 'interface' 'types' ':='
// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] ","
// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' '}' ';'
protected class MExchangeModel_Group extends GroupToken {
	
	public MExchangeModel_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_SemicolonKeyword_15(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMExchangeModelAccess().getMExchangeModelAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MExchangeModel}
protected class MExchangeModel_MExchangeModelAction_0 extends ActionToken  {

	public MExchangeModel_MExchangeModelAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getMExchangeModelAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'exchange'
protected class MExchangeModel_ExchangeKeyword_1 extends KeywordToken  {
	
	public MExchangeModel_ExchangeKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getExchangeKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_MExchangeModelAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'model'
protected class MExchangeModel_ModelKeyword_2 extends KeywordToken  {
	
	public MExchangeModel_ModelKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getModelKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_ExchangeKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MExchangeModel_NameAssignment_3 extends AssignmentToken  {
	
	public MExchangeModel_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_ModelKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMExchangeModelAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMExchangeModelAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MExchangeModel|VersionedQualifiedReferenceName] (","
// inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*)?
protected class MExchangeModel_Group_4 extends GroupToken {
	
	public MExchangeModel_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MExchangeModel_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MExchangeModel_InheritsKeyword_4_0 extends KeywordToken  {
	
	public MExchangeModel_InheritsKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getInheritsKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MExchangeModel|VersionedQualifiedReferenceName]
protected class MExchangeModel_InheritsAssignment_4_1 extends AssignmentToken  {
	
	public MExchangeModel_InheritsAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_InheritsKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*
protected class MExchangeModel_Group_4_2 extends GroupToken {
	
	public MExchangeModel_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_InheritsAssignment_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MExchangeModel_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public MExchangeModel_CommaKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MExchangeModel_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MExchangeModel|VersionedQualifiedReferenceName]
protected class MExchangeModel_InheritsAssignment_4_2_1 extends AssignmentToken  {
	
	public MExchangeModel_InheritsAssignment_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_CommaKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MExchangeModel_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MExchangeModel_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MExchangeModel_NameAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'interface'
protected class MExchangeModel_InterfaceKeyword_6 extends KeywordToken  {
	
	public MExchangeModel_InterfaceKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getInterfaceKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MExchangeModel_TypesKeyword_7 extends KeywordToken  {
	
	public MExchangeModel_TypesKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getTypesKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_InterfaceKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MExchangeModel_ColonEqualsSignKeyword_8 extends KeywordToken  {
	
	public MExchangeModel_ColonEqualsSignKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getColonEqualsSignKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_TypesKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
protected class MExchangeModel_InterfaceTypesAssignment_9 extends AssignmentToken  {
	
	public MExchangeModel_InterfaceTypesAssignment_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_ColonEqualsSignKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaceTypes",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaceTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_9_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_9_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ","
protected class MExchangeModel_CommaKeyword_10 extends KeywordToken  {
	
	public MExchangeModel_CommaKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getCommaKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_InterfaceTypesAssignment_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
protected class MExchangeModel_InterfaceTypesAssignment_11 extends AssignmentToken  {
	
	public MExchangeModel_InterfaceTypesAssignment_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_CommaKeyword_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaceTypes",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaceTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_11_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_11_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])*
protected class MExchangeModel_Group_12 extends GroupToken {
	
	public MExchangeModel_Group_12(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getGroup_12();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_InterfaceTypesAssignment_12_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MExchangeModel_CommaKeyword_12_0 extends KeywordToken  {
	
	public MExchangeModel_CommaKeyword_12_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getCommaKeyword_12_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_Group_12(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MExchangeModel_InterfaceTypesAssignment_11(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
protected class MExchangeModel_InterfaceTypesAssignment_12_1 extends AssignmentToken  {
	
	public MExchangeModel_InterfaceTypesAssignment_12_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_12_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_CommaKeyword_12_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaceTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaceTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_12_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_12_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MExchangeModel_SemicolonKeyword_13 extends KeywordToken  {
	
	public MExchangeModel_SemicolonKeyword_13(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_13();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_Group_12(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MExchangeModel_InterfaceTypesAssignment_11(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// '}'
protected class MExchangeModel_RightCurlyBracketKeyword_14 extends KeywordToken  {
	
	public MExchangeModel_RightCurlyBracketKeyword_14(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getRightCurlyBracketKeyword_14();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_SemicolonKeyword_13(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MExchangeModel_SemicolonKeyword_15 extends KeywordToken  {
	
	public MExchangeModel_SemicolonKeyword_15(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_15();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MExchangeModel_RightCurlyBracketKeyword_14(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MExchangeModel ****************/


/************ begin Rule MConnector ****************
 *
 * MConnector:
 * 	'connector'
 * 	name=ID ('inherits' inherits+=[MConnector|VersionedQualifiedReferenceName] (","
 * 	inherits+=[MConnector|VersionedQualifiedReferenceName])*)?
 * 	'{' ('client' 'types' ':=' clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
 * 	clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & 'server' 'types' ':='
 * 	serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
 * 	serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & ('attributes'
 * 	'{'
 * 	attributes+=MParameter+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'connector' name=ID ('inherits' inherits+=[MConnector|VersionedQualifiedReferenceName] (","
// inherits+=[MConnector|VersionedQualifiedReferenceName])*)? '{' ('client' 'types' ':='
// clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
// clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & 'server' 'types' ':='
// serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
// serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
// ';')?) '}' ';'
protected class MConnector_Group extends GroupToken {
	
	public MConnector_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMConnectorRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'connector'
protected class MConnector_ConnectorKeyword_0 extends KeywordToken  {
	
	public MConnector_ConnectorKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getConnectorKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MConnector_NameAssignment_1 extends AssignmentToken  {
	
	public MConnector_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_ConnectorKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMConnectorAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMConnectorAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ('inherits' inherits+=[MConnector|VersionedQualifiedReferenceName] (","
// inherits+=[MConnector|VersionedQualifiedReferenceName])*)?
protected class MConnector_Group_2 extends GroupToken {
	
	public MConnector_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'inherits'
protected class MConnector_InheritsKeyword_2_0 extends KeywordToken  {
	
	public MConnector_InheritsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getInheritsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MConnector|VersionedQualifiedReferenceName]
protected class MConnector_InheritsAssignment_2_1 extends AssignmentToken  {
	
	public MConnector_InheritsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getInheritsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_InheritsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MConnector|VersionedQualifiedReferenceName])*
protected class MConnector_Group_2_2 extends GroupToken {
	
	public MConnector_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_InheritsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MConnector_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MConnector_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MConnector|VersionedQualifiedReferenceName]
protected class MConnector_InheritsAssignment_2_2_1 extends AssignmentToken  {
	
	public MConnector_InheritsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getInheritsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MConnector_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MConnector_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ('client' 'types' ':=' clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
// clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & 'server' 'types' ':='
// serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
// serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
// ';')?)
protected class MConnector_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MConnector_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'client' 'types' ':=' clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
// clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';'
protected class MConnector_Group_4_0 extends GroupToken {
	
	public MConnector_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_SemicolonKeyword_4_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'client'
protected class MConnector_ClientKeyword_4_0_0 extends KeywordToken  {
	
	public MConnector_ClientKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getClientKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MConnector_TypesKeyword_4_0_1 extends KeywordToken  {
	
	public MConnector_TypesKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getTypesKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_ClientKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MConnector_ColonEqualsSignKeyword_4_0_2 extends KeywordToken  {
	
	public MConnector_ColonEqualsSignKeyword_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_TypesKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientPortTypes+=[MPortType|VersionedQualifiedReferenceName]
protected class MConnector_ClientPortTypesAssignment_4_0_3 extends AssignmentToken  {
	
	public MConnector_ClientPortTypesAssignment_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_ColonEqualsSignKeyword_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientPortTypes",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientPortTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])*
protected class MConnector_Group_4_0_4 extends GroupToken {
	
	public MConnector_Group_4_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup_4_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_ClientPortTypesAssignment_4_0_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MConnector_CommaKeyword_4_0_4_0 extends KeywordToken  {
	
	public MConnector_CommaKeyword_4_0_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getCommaKeyword_4_0_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_4_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_ClientPortTypesAssignment_4_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// clientPortTypes+=[MPortType|VersionedQualifiedReferenceName]
protected class MConnector_ClientPortTypesAssignment_4_0_4_1 extends AssignmentToken  {
	
	public MConnector_ClientPortTypesAssignment_4_0_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_CommaKeyword_4_0_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientPortTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientPortTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MConnector_SemicolonKeyword_4_0_5 extends KeywordToken  {
	
	public MConnector_SemicolonKeyword_4_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_4_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_ClientPortTypesAssignment_4_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// 'server' 'types' ':=' serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
// serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';'
protected class MConnector_Group_4_1 extends GroupToken {
	
	public MConnector_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_SemicolonKeyword_4_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'server'
protected class MConnector_ServerKeyword_4_1_0 extends KeywordToken  {
	
	public MConnector_ServerKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getServerKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'types'
protected class MConnector_TypesKeyword_4_1_1 extends KeywordToken  {
	
	public MConnector_TypesKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getTypesKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_ServerKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MConnector_ColonEqualsSignKeyword_4_1_2 extends KeywordToken  {
	
	public MConnector_ColonEqualsSignKeyword_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_TypesKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverPortTypes+=[MPortType|VersionedQualifiedReferenceName]
protected class MConnector_ServerPortTypesAssignment_4_1_3 extends AssignmentToken  {
	
	public MConnector_ServerPortTypesAssignment_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_ColonEqualsSignKeyword_4_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverPortTypes",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverPortTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])*
protected class MConnector_Group_4_1_4 extends GroupToken {
	
	public MConnector_Group_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_ServerPortTypesAssignment_4_1_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MConnector_CommaKeyword_4_1_4_0 extends KeywordToken  {
	
	public MConnector_CommaKeyword_4_1_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getCommaKeyword_4_1_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_4_1_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_ServerPortTypesAssignment_4_1_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// serverPortTypes+=[MPortType|VersionedQualifiedReferenceName]
protected class MConnector_ServerPortTypesAssignment_4_1_4_1 extends AssignmentToken  {
	
	public MConnector_ServerPortTypesAssignment_4_1_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_CommaKeyword_4_1_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverPortTypes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverPortTypes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MConnector_SemicolonKeyword_4_1_5 extends KeywordToken  {
	
	public MConnector_SemicolonKeyword_4_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_4_1_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnector_ServerPortTypesAssignment_4_1_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('attributes' '{' attributes+=MParameter+ '}' ';')?
protected class MConnector_Group_4_2 extends GroupToken {
	
	public MConnector_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_SemicolonKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attributes'
protected class MConnector_AttributesKeyword_4_2_0 extends KeywordToken  {
	
	public MConnector_AttributesKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getAttributesKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MConnector_LeftCurlyBracketKeyword_4_2_1 extends KeywordToken  {
	
	public MConnector_LeftCurlyBracketKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_AttributesKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MConnector_AttributesAssignment_4_2_2 extends AssignmentToken  {
	
	public MConnector_AttributesAssignment_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getAttributesAssignment_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMConnectorAccess().getAttributesMParameterParserRuleCall_4_2_2_0(); 
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
			case 0: return new MConnector_AttributesAssignment_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MConnector_LeftCurlyBracketKeyword_4_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MConnector_RightCurlyBracketKeyword_4_2_3 extends KeywordToken  {
	
	public MConnector_RightCurlyBracketKeyword_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_AttributesAssignment_4_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MConnector_SemicolonKeyword_4_2_4 extends KeywordToken  {
	
	public MConnector_SemicolonKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_RightCurlyBracketKeyword_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MConnector_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MConnector_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MConnector_SemicolonKeyword_6 extends KeywordToken  {
	
	public MConnector_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectorAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnector_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MConnector ****************/


/************ begin Rule MParameter ****************
 *
 * MParameter common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
protected class MParameter_Alternatives extends AlternativesToken {

	public MParameter_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_MIntegerParameterSingleExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameter_MEnumParameterSingleExpressionParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameter_MBooleanParameterSingleExpressionParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameter_MRealParameterSingleExpressionParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MParameter_MStringParameterSingleExpressionParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MParameter_MEnumParameterDefinitionParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMStringParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MIntegerParameterSingleExpression
protected class MParameter_MIntegerParameterSingleExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MParameter_MIntegerParameterSingleExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIntegerParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParameterSingleExpression
protected class MParameter_MEnumParameterSingleExpressionParserRuleCall_1 extends RuleCallToken {
	
	public MParameter_MEnumParameterSingleExpressionParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MBooleanParameterSingleExpression
protected class MParameter_MBooleanParameterSingleExpressionParserRuleCall_2 extends RuleCallToken {
	
	public MParameter_MBooleanParameterSingleExpressionParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MBooleanParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MRealParameterSingleExpression
protected class MParameter_MRealParameterSingleExpressionParserRuleCall_3 extends RuleCallToken {
	
	public MParameter_MRealParameterSingleExpressionParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MRealParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MStringParameterSingleExpression
protected class MParameter_MStringParameterSingleExpressionParserRuleCall_4 extends RuleCallToken {
	
	public MParameter_MStringParameterSingleExpressionParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MStringParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParameterDefinition
protected class MParameter_MEnumParameterDefinitionParserRuleCall_5 extends RuleCallToken {
	
	public MParameter_MEnumParameterDefinitionParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParameterDefinition_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameter ****************/


/************ begin Rule MIntegerParameterSingleExpression ****************
 *
 * MIntegerParameterSingleExpression common::MIntegerParameterSingleExpression:
 * 	constant?='const'?
 * 	'integer'
 * 	name=ID
 * 	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
 * 	';'
 *
 **/

// constant?='const'? 'integer' name=ID ':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)? ';'
protected class MIntegerParameterSingleExpression_Group extends GroupToken {
	
	public MIntegerParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?='const'?
protected class MIntegerParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// 'integer'
protected class MIntegerParameterSingleExpression_IntegerKeyword_1 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_IntegerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MIntegerParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_IntegerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ':='
protected class MIntegerParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MIntegerParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MIntegerParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ('range' range=MParameterRange)?
protected class MIntegerParameterSingleExpression_Group_5 extends GroupToken {
	
	public MIntegerParameterSingleExpression_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_RangeAssignment_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'range'
protected class MIntegerParameterSingleExpression_RangeKeyword_5_0 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_RangeKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MIntegerParameterSingleExpression_RangeAssignment_5_1 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_RangeAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterRange_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("range",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("range");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRangeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0(); 
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
			case 0: return new MIntegerParameterSingleExpression_RangeKeyword_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ';'
protected class MIntegerParameterSingleExpression_SemicolonKeyword_6 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIntegerParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParameterSingleExpression ****************/


/************ begin Rule MEnumParameterDefinition ****************
 *
 * MEnumParameterDefinition common::MEnumParameterDefinition:
 * 	{common::MEnumParameterDefinition}
 * 	'enum'
 * 	name=ID
 * 	'{'
 * 	literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)*
 * 	'}'
 * 	';'
 *
 **/

// {common::MEnumParameterDefinition} 'enum' name=ID '{' literals+=MEnumParameterLiteralRule (","
// literals+=MEnumParameterLiteralRule)* '}' ';'
protected class MEnumParameterDefinition_Group extends GroupToken {
	
	public MEnumParameterDefinition_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParameterDefinition}
protected class MEnumParameterDefinition_MEnumParameterDefinitionAction_0 extends ActionToken  {

	public MEnumParameterDefinition_MEnumParameterDefinitionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'enum'
protected class MEnumParameterDefinition_EnumKeyword_1 extends KeywordToken  {
	
	public MEnumParameterDefinition_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_MEnumParameterDefinitionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MEnumParameterDefinition_NameAssignment_2 extends AssignmentToken  {
	
	public MEnumParameterDefinition_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MEnumParameterDefinition_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MEnumParameterDefinition_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// literals+=MEnumParameterLiteralRule
protected class MEnumParameterDefinition_LiteralsAssignment_4 extends AssignmentToken  {
	
	public MEnumParameterDefinition_LiteralsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteralRule_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("literals",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("literals");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParameterLiteralRuleRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0(); 
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
			case 0: return new MEnumParameterDefinition_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," literals+=MEnumParameterLiteralRule)*
protected class MEnumParameterDefinition_Group_5 extends GroupToken {
	
	public MEnumParameterDefinition_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_LiteralsAssignment_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MEnumParameterDefinition_CommaKeyword_5_0 extends KeywordToken  {
	
	public MEnumParameterDefinition_CommaKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterDefinition_LiteralsAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// literals+=MEnumParameterLiteralRule
protected class MEnumParameterDefinition_LiteralsAssignment_5_1 extends AssignmentToken  {
	
	public MEnumParameterDefinition_LiteralsAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteralRule_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("literals",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("literals");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParameterLiteralRuleRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0(); 
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
			case 0: return new MEnumParameterDefinition_CommaKeyword_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// '}'
protected class MEnumParameterDefinition_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MEnumParameterDefinition_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterDefinition_LiteralsAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MEnumParameterDefinition_SemicolonKeyword_7 extends KeywordToken  {
	
	public MEnumParameterDefinition_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParameterDefinition ****************/


/************ begin Rule MEnumParameterSingleExpression ****************
 *
 * MEnumParameterSingleExpression common::MEnumParameterSingleExpression:
 * 	constant?='const'?
 * 	'enum'
 * 	enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
 * 	':=' defaultValue=MParameterValueExpression
 * 	';'
 *
 **/

// constant?='const'? 'enum' enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ':='
// defaultValue=MParameterValueExpression ';'
protected class MEnumParameterSingleExpression_Group extends GroupToken {
	
	public MEnumParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?='const'?
protected class MEnumParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// 'enum'
protected class MEnumParameterSingleExpression_EnumKeyword_1 extends KeywordToken  {
	
	public MEnumParameterSingleExpression_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
protected class MEnumParameterSingleExpression_EnumDefinitionAssignment_2 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_EnumDefinitionAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("enumDefinition",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("enumDefinition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MEnumParameterSingleExpression_NameAssignment_3 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_EnumDefinitionAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ':='
protected class MEnumParameterSingleExpression_ColonEqualsSignKeyword_4 extends KeywordToken  {
	
	public MEnumParameterSingleExpression_ColonEqualsSignKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MEnumParameterSingleExpression_DefaultValueAssignment_5 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_DefaultValueAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0(); 
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
			case 0: return new MEnumParameterSingleExpression_ColonEqualsSignKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MEnumParameterSingleExpression_SemicolonKeyword_6 extends KeywordToken  {
	
	public MEnumParameterSingleExpression_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_DefaultValueAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParameterSingleExpression ****************/


/************ begin Rule MRealParameterSingleExpression ****************
 *
 * MRealParameterSingleExpression common::MRealParameterSingleExpression:
 * 	constant?='const'?
 * 	'real'
 * 	name=ID
 * 	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
 * 	';'
 *
 **/

// constant?='const'? 'real' name=ID ':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)? ';'
protected class MRealParameterSingleExpression_Group extends GroupToken {
	
	public MRealParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?='const'?
protected class MRealParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// 'real'
protected class MRealParameterSingleExpression_RealKeyword_1 extends KeywordToken  {
	
	public MRealParameterSingleExpression_RealKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MRealParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_RealKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ':='
protected class MRealParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MRealParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MRealParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MRealParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ('range' range=MParameterRange)?
protected class MRealParameterSingleExpression_Group_5 extends GroupToken {
	
	public MRealParameterSingleExpression_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_RangeAssignment_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'range'
protected class MRealParameterSingleExpression_RangeKeyword_5_0 extends KeywordToken  {
	
	public MRealParameterSingleExpression_RangeKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MRealParameterSingleExpression_RangeAssignment_5_1 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_RangeAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterRange_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("range",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("range");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRangeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0(); 
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
			case 0: return new MRealParameterSingleExpression_RangeKeyword_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ';'
protected class MRealParameterSingleExpression_SemicolonKeyword_6 extends KeywordToken  {
	
	public MRealParameterSingleExpression_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MRealParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParameterSingleExpression ****************/


/************ begin Rule MEnumParameterLiteralRule ****************
 *
 * MEnumParameterLiteralRule common::MEnumParameterLiteral:
 * 	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral
 *
 **/

// MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral
protected class MEnumParameterLiteralRule_Alternatives extends AlternativesToken {

	public MEnumParameterLiteralRule_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteralRule_MEnumParameterLiteralParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterLiteralRule_MEnumParamIntegerLiteralParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MEnumParameterLiteralRule_MEnumParamRealLiteralParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MEnumParameterLiteralRule_MEnumParamStringLiteralParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MEnumParameterLiteral
protected class MEnumParameterLiteralRule_MEnumParameterLiteralParserRuleCall_0 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParameterLiteralParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParameterLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamIntegerLiteral
protected class MEnumParameterLiteralRule_MEnumParamIntegerLiteralParserRuleCall_1 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParamIntegerLiteralParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamIntegerLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamRealLiteral
protected class MEnumParameterLiteralRule_MEnumParamRealLiteralParserRuleCall_2 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParamRealLiteralParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamRealLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamStringLiteral
protected class MEnumParameterLiteralRule_MEnumParamStringLiteralParserRuleCall_3 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParamStringLiteralParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamStringLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MEnumParameterLiteralRule ****************/


/************ begin Rule MParameterValue ****************
 *
 * MParameterValue common::MParameterValue:
 * 	MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR
 *
 **/

// MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR
protected class MParameterValue_Alternatives extends AlternativesToken {

	public MParameterValue_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValue_MParameterValueLiteralParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValue_MParameterValueRefObjectParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterValue_MParameterValuePARParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValuePARRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MParameterValueLiteral
protected class MParameterValue_MParameterValueLiteralParserRuleCall_0 extends RuleCallToken {
	
	public MParameterValue_MParameterValueLiteralParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueLiteral_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueLiteral_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueRefObject
protected class MParameterValue_MParameterValueRefObjectParserRuleCall_1 extends RuleCallToken {
	
	public MParameterValue_MParameterValueRefObjectParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRefObject_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueRefObject_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValuePAR
protected class MParameterValue_MParameterValuePARParserRuleCall_2 extends RuleCallToken {
	
	public MParameterValue_MParameterValuePARParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValuePAR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValuePARRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValuePAR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameterValue ****************/


/************ begin Rule MParameterValueLiteral ****************
 *
 * MParameterValueLiteral common::MParameterValueLiteral:
 * 	MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
 * 	MParameterValueRealLiteral
 *
 **/

// MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
// MParameterValueRealLiteral
protected class MParameterValueLiteral_Alternatives extends AlternativesToken {

	public MParameterValueLiteral_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueLiteral_MParameterValueBooleanLiteralParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueLiteral_MParameterValueStringLiteralParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterValueLiteral_MParameterValueIntegerLiteralParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameterValueLiteral_MParameterValueRealLiteralParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MParameterValueBooleanLiteral
protected class MParameterValueLiteral_MParameterValueBooleanLiteralParserRuleCall_0 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueBooleanLiteralParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueBooleanLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueBooleanLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueStringLiteral
protected class MParameterValueLiteral_MParameterValueStringLiteralParserRuleCall_1 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueStringLiteralParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueStringLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueIntegerLiteral
protected class MParameterValueLiteral_MParameterValueIntegerLiteralParserRuleCall_2 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueIntegerLiteralParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueIntegerLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueIntegerLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueRealLiteral
protected class MParameterValueLiteral_MParameterValueRealLiteralParserRuleCall_3 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueRealLiteralParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRealLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueRealLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameterValueLiteral ****************/





/************ begin Rule MParameterValueBooleanLiteral ****************
 *
 * MParameterValueBooleanLiteral common::MParameterValueBooleanLiteral:
 * 	{common::MParameterValueBooleanLiteral} value=EBoolean
 *
 **/

// {common::MParameterValueBooleanLiteral} value=EBoolean
protected class MParameterValueBooleanLiteral_Group extends GroupToken {
	
	public MParameterValueBooleanLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueBooleanLiteral_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueBooleanLiteral}
protected class MParameterValueBooleanLiteral_MParameterValueBooleanLiteralAction_0 extends ActionToken  {

	public MParameterValueBooleanLiteral_MParameterValueBooleanLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// value=EBoolean
protected class MParameterValueBooleanLiteral_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValueBooleanLiteral_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueBooleanLiteral_MParameterValueBooleanLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueBooleanLiteral ****************/


/************ begin Rule MParameterValueStringLiteral ****************
 *
 * MParameterValueStringLiteral common::MParameterValueStringLiteral:
 * 	{common::MParameterValueStringLiteral} isRaw?='raw'?
 * 	value=STRING
 *
 **/

// {common::MParameterValueStringLiteral} isRaw?='raw'? value=STRING
protected class MParameterValueStringLiteral_Group extends GroupToken {
	
	public MParameterValueStringLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_ValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueStringLiteral}
protected class MParameterValueStringLiteral_MParameterValueStringLiteralAction_0 extends ActionToken  {

	public MParameterValueStringLiteral_MParameterValueStringLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// isRaw?='raw'?
protected class MParameterValueStringLiteral_IsRawAssignment_1 extends AssignmentToken  {
	
	public MParameterValueStringLiteral_IsRawAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_MParameterValueStringLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("isRaw",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("isRaw");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0();
			return obj;
		}
		return null;
	}

}

// value=STRING
protected class MParameterValueStringLiteral_ValueAssignment_2 extends AssignmentToken  {
	
	public MParameterValueStringLiteral_ValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_IsRawAssignment_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueStringLiteral_MParameterValueStringLiteralAction_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueStringLiteral ****************/


/************ begin Rule MParameterValueIntegerLiteral ****************
 *
 * MParameterValueIntegerLiteral common::MParameterValueIntegerLiteral:
 * 	{common::MParameterValueIntegerLiteral} value=INTEGER
 *
 **/

// {common::MParameterValueIntegerLiteral} value=INTEGER
protected class MParameterValueIntegerLiteral_Group extends GroupToken {
	
	public MParameterValueIntegerLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueIntegerLiteral_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueIntegerLiteral}
protected class MParameterValueIntegerLiteral_MParameterValueIntegerLiteralAction_0 extends ActionToken  {

	public MParameterValueIntegerLiteral_MParameterValueIntegerLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// value=INTEGER
protected class MParameterValueIntegerLiteral_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValueIntegerLiteral_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueIntegerLiteral_MParameterValueIntegerLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueIntegerLiteral ****************/


/************ begin Rule MParameterValueRealLiteral ****************
 *
 * MParameterValueRealLiteral common::MParameterValueRealLiteral:
 * 	{common::MParameterValueRealLiteral} value=REAL
 *
 **/

// {common::MParameterValueRealLiteral} value=REAL
protected class MParameterValueRealLiteral_Group extends GroupToken {
	
	public MParameterValueRealLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueRealLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRealLiteral_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueRealLiteral}
protected class MParameterValueRealLiteral_MParameterValueRealLiteralAction_0 extends ActionToken  {

	public MParameterValueRealLiteral_MParameterValueRealLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// value=REAL
protected class MParameterValueRealLiteral_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValueRealLiteral_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRealLiteral_MParameterValueRealLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueRealLiteral ****************/


/************ begin Rule MParameterValueRefObject ****************
 *
 * MParameterValueRefObject common::MParameterValueRefObject:
 * 	{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
 *
 **/

// {common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
protected class MParameterValueRefObject_Group extends GroupToken {
	
	public MParameterValueRefObject_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueRefObjectAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRefObject_ObjectAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueRefObject}
protected class MParameterValueRefObject_MParameterValueRefObjectAction_0 extends ActionToken  {

	public MParameterValueRefObject_MParameterValueRefObjectAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
protected class MParameterValueRefObject_ObjectAssignment_1 extends AssignmentToken  {
	
	public MParameterValueRefObject_ObjectAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRefObject_MParameterValueRefObjectAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("object",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("object");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule MParameterValueRefObject ****************/


/************ begin Rule MParameterValuePAR ****************
 *
 * MParameterValuePAR common::MParameterValuePAR:
 * 	'(' value=MParameterValueExpression ')'
 *
 **/

// '(' value=MParameterValueExpression ')'
protected class MParameterValuePAR_Group extends GroupToken {
	
	public MParameterValuePAR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValuePAR_RightParenthesisKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValuePARRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// '('
protected class MParameterValuePAR_LeftParenthesisKeyword_0 extends KeywordToken  {
	
	public MParameterValuePAR_LeftParenthesisKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// value=MParameterValueExpression
protected class MParameterValuePAR_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValuePAR_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0(); 
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
			case 0: return new MParameterValuePAR_LeftParenthesisKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ')'
protected class MParameterValuePAR_RightParenthesisKeyword_2 extends KeywordToken  {
	
	public MParameterValuePAR_RightParenthesisKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValuePAR_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterValuePAR ****************/


/************ begin Rule MParameterValueExpression ****************
 *
 * MParameterValueExpression common::MParameterValueExpression:
 * 	{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
 * 	right=MParameterValueExpression)?
 *
 **/

// {common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
// right=MParameterValueExpression)?
protected class MParameterValueExpression_Group extends GroupToken {
	
	public MParameterValueExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueExpression_LeftAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueExpression}
protected class MParameterValueExpression_MParameterValueExpressionAction_0 extends ActionToken  {

	public MParameterValueExpression_MParameterValueExpressionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// left=MParameterValueTERM
protected class MParameterValueExpression_LeftAssignment_1 extends AssignmentToken  {
	
	public MParameterValueExpression_LeftAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("left",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("left");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueTERMRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0(); 
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
			case 0: return new MParameterValueExpression_MParameterValueExpressionAction_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// (operation=MParameterValueExpressionOperators right=MParameterValueExpression)?
protected class MParameterValueExpression_Group_2 extends GroupToken {
	
	public MParameterValueExpression_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_RightAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// operation=MParameterValueExpressionOperators
protected class MParameterValueExpression_OperationAssignment_2_0 extends AssignmentToken  {
	
	public MParameterValueExpression_OperationAssignment_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_LeftAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("operation",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("operation");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0(), value, null)) { 
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0();
			return obj;
		}
		return null;
	}

}

// right=MParameterValueExpression
protected class MParameterValueExpression_RightAssignment_2_1 extends AssignmentToken  {
	
	public MParameterValueExpression_RightAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("right",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0(); 
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
			case 0: return new MParameterValueExpression_OperationAssignment_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule MParameterValueExpression ****************/


/************ begin Rule MParameterValueTERM ****************
 *
 * MParameterValueTERM common::MParameterValueTERM:
 * 	{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
 *
 **/

// {common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
protected class MParameterValueTERM_Group extends GroupToken {
	
	public MParameterValueTERM_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueTERM_LeftAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueTERM}
protected class MParameterValueTERM_MParameterValueTERMAction_0 extends ActionToken  {

	public MParameterValueTERM_MParameterValueTERMAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// left=MParameterValue
protected class MParameterValueTERM_LeftAssignment_1 extends AssignmentToken  {
	
	public MParameterValueTERM_LeftAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValue_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("left",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("left");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0(); 
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
			case 0: return new MParameterValueTERM_MParameterValueTERMAction_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
protected class MParameterValueTERM_Group_2 extends GroupToken {
	
	public MParameterValueTERM_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_RightAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// operation=MParameterValueTERMOperators
protected class MParameterValueTERM_OperationAssignment_2_0 extends AssignmentToken  {
	
	public MParameterValueTERM_OperationAssignment_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_LeftAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("operation",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("operation");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0(), value, null)) { 
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0();
			return obj;
		}
		return null;
	}

}

// right=MParameterValueTERM
protected class MParameterValueTERM_RightAssignment_2_1 extends AssignmentToken  {
	
	public MParameterValueTERM_RightAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("right",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueTERMRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0(); 
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
			case 0: return new MParameterValueTERM_OperationAssignment_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule MParameterValueTERM ****************/


/************ begin Rule MParameterRange ****************
 *
 * MParameterRange common::MParameterRange:
 * 	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR
 *
 **/

// MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR
protected class MParameterRange_Alternatives extends AlternativesToken {

	public MParameterRange_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterRange_MParameterOCRParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterRange_MParameterOORParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterRange_MParameterCORParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameterRange_MParameterCCRParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterCORAccess().getMParameterCORAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterOORAccess().getMParameterOORAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MParameterOCR
protected class MParameterRange_MParameterOCRParserRuleCall_0 extends RuleCallToken {
	
	public MParameterRange_MParameterOCRParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterOCR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterOOR
protected class MParameterRange_MParameterOORParserRuleCall_1 extends RuleCallToken {
	
	public MParameterRange_MParameterOORParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOORAccess().getMParameterOORAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterOOR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterCOR
protected class MParameterRange_MParameterCORParserRuleCall_2 extends RuleCallToken {
	
	public MParameterRange_MParameterCORParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCORAccess().getMParameterCORAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterCOR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterCCR
protected class MParameterRange_MParameterCCRParserRuleCall_3 extends RuleCallToken {
	
	public MParameterRange_MParameterCCRParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterCCR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameterRange ****************/


/************ begin Rule MParameterOCR ****************
 *
 * MParameterOCR common::MParameterOCR:
 * 	{common::MParameterOCR}
 * 	'('
 * 	lowerValue=MParameterValueExpression ','
 * 	upperValue=MParameterValueExpression
 * 	']'
 *
 **/

// {common::MParameterOCR} '(' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ']'
protected class MParameterOCR_Group extends GroupToken {
	
	public MParameterOCR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterOCR}
protected class MParameterOCR_MParameterOCRAction_0 extends ActionToken  {

	public MParameterOCR_MParameterOCRAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// '('
protected class MParameterOCR_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public MParameterOCR_LeftParenthesisKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_MParameterOCRAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterOCR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterOCR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterOCR_LeftParenthesisKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ','
protected class MParameterOCR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterOCR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterOCR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterOCR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterOCR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ']'
protected class MParameterOCR_RightSquareBracketKeyword_5 extends KeywordToken  {
	
	public MParameterOCR_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterOCR ****************/


/************ begin Rule MParameterOOR ****************
 *
 * MParameterOOR common::MParameterOOR:
 * 	{common::MParameterOOR}
 * 	'('
 * 	lowerValue=MParameterValueExpression ','
 * 	upperValue=MParameterValueExpression
 * 	')'
 *
 **/

// {common::MParameterOOR} '(' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ')'
protected class MParameterOOR_Group extends GroupToken {
	
	public MParameterOOR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_RightParenthesisKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOORAccess().getMParameterOORAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterOOR}
protected class MParameterOOR_MParameterOORAction_0 extends ActionToken  {

	public MParameterOOR_MParameterOORAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getMParameterOORAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// '('
protected class MParameterOOR_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public MParameterOOR_LeftParenthesisKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_MParameterOORAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterOOR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterOOR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterOOR_LeftParenthesisKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ','
protected class MParameterOOR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterOOR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterOOR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterOOR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterOOR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ')'
protected class MParameterOOR_RightParenthesisKeyword_5 extends KeywordToken  {
	
	public MParameterOOR_RightParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterOOR ****************/


/************ begin Rule MParameterCOR ****************
 *
 * MParameterCOR common::MParameterCOR:
 * 	{common::MParameterCOR}
 * 	'['
 * 	lowerValue=MParameterValueExpression ','
 * 	upperValue=MParameterValueExpression
 * 	')'
 *
 **/

// {common::MParameterCOR} '[' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ')'
protected class MParameterCOR_Group extends GroupToken {
	
	public MParameterCOR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_RightParenthesisKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCORAccess().getMParameterCORAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterCOR}
protected class MParameterCOR_MParameterCORAction_0 extends ActionToken  {

	public MParameterCOR_MParameterCORAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getMParameterCORAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// '['
protected class MParameterCOR_LeftSquareBracketKeyword_1 extends KeywordToken  {
	
	public MParameterCOR_LeftSquareBracketKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_MParameterCORAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterCOR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterCOR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterCOR_LeftSquareBracketKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ','
protected class MParameterCOR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterCOR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterCOR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterCOR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterCOR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ')'
protected class MParameterCOR_RightParenthesisKeyword_5 extends KeywordToken  {
	
	public MParameterCOR_RightParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterCOR ****************/


/************ begin Rule MParameterCCR ****************
 *
 * MParameterCCR common::MParameterCCR:
 * 	{common::MParameterCCR}
 * 	'['
 * 	lowerValue=MParameterValueExpression ','
 * 	upperValue=MParameterValueExpression
 * 	']'
 *
 **/

// {common::MParameterCCR} '[' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ']'
protected class MParameterCCR_Group extends GroupToken {
	
	public MParameterCCR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterCCR}
protected class MParameterCCR_MParameterCCRAction_0 extends ActionToken  {

	public MParameterCCR_MParameterCCRAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// '['
protected class MParameterCCR_LeftSquareBracketKeyword_1 extends KeywordToken  {
	
	public MParameterCCR_LeftSquareBracketKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_MParameterCCRAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterCCR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterCCR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterCCR_LeftSquareBracketKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ','
protected class MParameterCCR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterCCR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterCCR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterCCR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterCCR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ']'
protected class MParameterCCR_RightSquareBracketKeyword_5 extends KeywordToken  {
	
	public MParameterCCR_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterCCR ****************/


/************ begin Rule MEnumParameterLiteral ****************
 *
 * MEnumParameterLiteral common::MEnumParameterLiteral:
 * 	{common::MEnumParameterLiteral} name=ID
 *
 **/

// {common::MEnumParameterLiteral} name=ID
protected class MEnumParameterLiteral_Group extends GroupToken {
	
	public MEnumParameterLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParameterLiteral}
protected class MEnumParameterLiteral_MEnumParameterLiteralAction_0 extends ActionToken  {

	public MEnumParameterLiteral_MEnumParameterLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// name=ID
protected class MEnumParameterLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParameterLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteral_MEnumParameterLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParameterLiteral ****************/


/************ begin Rule MEnumParamIntegerLiteral ****************
 *
 * MEnumParamIntegerLiteral common::MEnumParamIntegerLiteral:
 * 	{common::MEnumParamIntegerLiteral} name=ID
 * 	'='
 * 	value=INTEGER
 *
 **/

// {common::MEnumParamIntegerLiteral} name=ID '=' value=INTEGER
protected class MEnumParamIntegerLiteral_Group extends GroupToken {
	
	public MEnumParamIntegerLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_ValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParamIntegerLiteral}
protected class MEnumParamIntegerLiteral_MEnumParamIntegerLiteralAction_0 extends ActionToken  {

	public MEnumParamIntegerLiteral_MEnumParamIntegerLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// name=ID
protected class MEnumParamIntegerLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParamIntegerLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_MEnumParamIntegerLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// '='
protected class MEnumParamIntegerLiteral_EqualsSignKeyword_2 extends KeywordToken  {
	
	public MEnumParamIntegerLiteral_EqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// value=INTEGER
protected class MEnumParamIntegerLiteral_ValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamIntegerLiteral_ValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_EqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParamIntegerLiteral ****************/


/************ begin Rule MEnumParamRealLiteral ****************
 *
 * MEnumParamRealLiteral common::MEnumParamRealLiteral:
 * 	{common::MEnumParamRealLiteral} name=ID
 * 	'='
 * 	value=REAL
 *
 **/

// {common::MEnumParamRealLiteral} name=ID '=' value=REAL
protected class MEnumParamRealLiteral_Group extends GroupToken {
	
	public MEnumParamRealLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_ValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParamRealLiteral}
protected class MEnumParamRealLiteral_MEnumParamRealLiteralAction_0 extends ActionToken  {

	public MEnumParamRealLiteral_MEnumParamRealLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// name=ID
protected class MEnumParamRealLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParamRealLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_MEnumParamRealLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// '='
protected class MEnumParamRealLiteral_EqualsSignKeyword_2 extends KeywordToken  {
	
	public MEnumParamRealLiteral_EqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// value=REAL
protected class MEnumParamRealLiteral_ValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamRealLiteral_ValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_EqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParamRealLiteral ****************/


/************ begin Rule MEnumParamStringLiteral ****************
 *
 * MEnumParamStringLiteral common::MEnumParamStringLiteral:
 * 	{common::MEnumParamStringLiteral} name=ID
 * 	'='
 * 	isRaw?='raw'?
 * 	value=STRING
 *
 **/

// {common::MEnumParamStringLiteral} name=ID '=' isRaw?='raw'? value=STRING
protected class MEnumParamStringLiteral_Group extends GroupToken {
	
	public MEnumParamStringLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_ValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParamStringLiteral}
protected class MEnumParamStringLiteral_MEnumParamStringLiteralAction_0 extends ActionToken  {

	public MEnumParamStringLiteral_MEnumParamStringLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// name=ID
protected class MEnumParamStringLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParamStringLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_MEnumParamStringLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// '='
protected class MEnumParamStringLiteral_EqualsSignKeyword_2 extends KeywordToken  {
	
	public MEnumParamStringLiteral_EqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// isRaw?='raw'?
protected class MEnumParamStringLiteral_IsRawAssignment_3 extends AssignmentToken  {
	
	public MEnumParamStringLiteral_IsRawAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getIsRawAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_EqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("isRaw",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("isRaw");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0();
			return obj;
		}
		return null;
	}

}

// value=STRING
protected class MEnumParamStringLiteral_ValueAssignment_4 extends AssignmentToken  {
	
	public MEnumParamStringLiteral_ValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_IsRawAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParamStringLiteral_EqualsSignKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParamStringLiteral ****************/


/************ begin Rule MBooleanParameterSingleExpression ****************
 *
 * MBooleanParameterSingleExpression common::MBooleanParameterSingleExpression:
 * 	constant?='const'?
 * 	'boolean'
 * 	name=ID
 * 	':=' defaultValue=MParameterValueExpression
 * 	';'
 *
 **/

// constant?='const'? 'boolean' name=ID ':=' defaultValue=MParameterValueExpression ';'
protected class MBooleanParameterSingleExpression_Group extends GroupToken {
	
	public MBooleanParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?='const'?
protected class MBooleanParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MBooleanParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// 'boolean'
protected class MBooleanParameterSingleExpression_BooleanKeyword_1 extends KeywordToken  {
	
	public MBooleanParameterSingleExpression_BooleanKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MBooleanParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MBooleanParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_BooleanKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ':='
protected class MBooleanParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MBooleanParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MBooleanParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MBooleanParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MBooleanParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MBooleanParameterSingleExpression_SemicolonKeyword_5 extends KeywordToken  {
	
	public MBooleanParameterSingleExpression_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParameterSingleExpression ****************/


/************ begin Rule MStringParameterSingleExpression ****************
 *
 * MStringParameterSingleExpression common::MStringParameterSingleExpression:
 * 	constant?='const'?
 * 	'string'
 * 	name=ID
 * 	':=' defaultValue=MParameterValueExpression
 * 	';'
 *
 **/

// constant?='const'? 'string' name=ID ':=' defaultValue=MParameterValueExpression ';'
protected class MStringParameterSingleExpression_Group extends GroupToken {
	
	public MStringParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?='const'?
protected class MStringParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MStringParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// 'string'
protected class MStringParameterSingleExpression_StringKeyword_1 extends KeywordToken  {
	
	public MStringParameterSingleExpression_StringKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MStringParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MStringParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_StringKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ':='
protected class MStringParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MStringParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MStringParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MStringParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MStringParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MStringParameterSingleExpression_SemicolonKeyword_5 extends KeywordToken  {
	
	public MStringParameterSingleExpression_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParameterSingleExpression ****************/

}
