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
package es.uah.aut.srg.micobs.mclev.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class DOMJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevdom"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevcommon"));
		return result;
	}
	
	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MCLEVLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	public static final String IMPROPER_IODSUPPORTEDPLATFORM_NAME = "0";
	
	/**
	 * Checks that the name of a supported platform of an IOD conforms to the
	 * naming standard. It produces a warning otherwise.
	 * @param iodsp the IOD supported platform to check.
	 */
	@Check
	public void checkMIODomainSupportedPlatform_Naming(MIODomainSupportedPlatform iodsp) {
		
		if (iodsp.getName() != null &&
			MCLEVStringHelper.getDefault().getProperName(iodsp) != null &&
			iodsp.getName().matches(MCLEVStringHelper.getDefault().getProperName(iodsp)) == false)
		{
			warning("Supported Platform name does not match the recommended one",
				    commonPackage.eINSTANCE.getMCommonReferenceableObj_Name(),
				    IMPROPER_IODSUPPORTEDPLATFORM_NAME,
				    iodsp.getName(),
				    MCLEVStringHelper.getDefault().getProperName(iodsp));
		}
		
	}

	/**
	 * Checks that there are no duplicates in the list of SAIs required by
	 * an implementation oriented domain.
	 * @param iod the domain.
	 */
	@Check
	public void checkMIODomain_duplicatedRequiredSAI(MIODomain iod)
	{
		Set<MSAI> requires = new HashSet<MSAI>();
		int i = 0;
		
		for (MSAI sai : iod.getRequires())
		{
			if (sai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (requires.add(sai) == false)
			{
				error("Duplicated SAI: " + MCLEVStringHelper.getDefault().getElementName(sai),
					  mclevdomPackage.eINSTANCE.getMIODomain_Requires(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the list of SAIs required by
	 * an IOD supported platform.
	 * @param iodsp the supported platform.
	 */
	@Check
	public void checkMIODomainSupportedPlatform_duplicatedRequiredSAI(MIODomainSupportedPlatform iodsp)
	{
		Set<MSAI> requires = new HashSet<MSAI>();
		int i = 0;
		
		for (MSAI sai : iodsp.getRequires())
		{
			if (sai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (requires.add(sai) == false)
			{
				error("Duplicated SAI: " + MCLEVStringHelper.getDefault().getElementName(sai),
					  mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Requires(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that a language is defined by an IOD if and only if
	 * at least one supported platform is also defined.
	 * Implements Restriction TBD.
	 * @param iod the IOD to check.
	 */
	@Check
	public void checkMIODomain_languagesEMsAndPlatforms(MIODomain iod)
	{
		if (iod.getLanguages().isEmpty() == false &&
			iod.getSupportedPlatforms().isEmpty() == true)
		{
			error("At least one supported platform shall be defined if a language is selected",
				  mclevdomPackage.eINSTANCE.getMIODomain_SupportedPlatforms());
		}
		if (iod.getSupportedPlatforms().isEmpty() == false &&
			iod.getLanguages().isEmpty() == true)
		{
			error("At least one language has to be selected if a supported platform is defined",
					  mclevdomPackage.eINSTANCE.getMIODomain_Languages());			
		}
	}
	
	/**
	 * Checks that the language selected for a component type is included 
	 * in the list of languages supported by the IOD.
	 * Implements Restriction TBD.
	 * @param the IOD to check.
	 */
	@Check
	public void checkMIODomain_componentTypeLanguages(MIODomain domain)
	{
		int i = 0;
		for (MIODAbstractComponentType ctype : domain.getComponentTypes())
		{
			if (ctype instanceof MIODComponentType)
			{
				MIODComponentType iodctype = (MIODComponentType)ctype;
				if (iodctype.getLanguage() == null ||
					iodctype.getLanguage().eIsProxy() == true)
				{
					i++;
					continue;
				}
				if (domain.getLanguages().contains(iodctype.getLanguage()) == false)
				{
					error("The selected language must be included in the list of languages supported by the domain",
						  mclevdomPackage.eINSTANCE.getMIODomain_ComponentTypes(), i);
				}
			}
			i++;
		}
	}

	/**
	 * Checks that the component types inherited by an abstract component
	 * type are also abstract types. Implements Restriction TBD.
	 * @param ctype the abstract component type to check.
	 */
	@Check
	public void checkMIODAbstractComponentType_inherits(MIODAbstractComponentType ctype)
	{
		
		if (ctype.getInherits().isEmpty())
		{
			return;
		}

		int i = 0;
		for (MIODAbstractComponentType ict : ctype.getInherits())
		{
			if (ict.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ict instanceof MIODComponentType)
			{
				error("Abstract component types shall only inherit from abstract types",
						mclevdomPackage.eINSTANCE.getMIODAbstractComponentType_Inherits(), i);
			}
			i++;
		}

	}
	
	/**
	 * Checks that the component type instances defined by an abstract
	 * component type point only to abstract component types.
	 * Implements Restriction TBD.
	 * @param ctype the abstract component type to check.
	 */
	@Check
	public void checkMIODAbstractComponentType_componentTypeInstances(MIODAbstractComponentType ctype)
	{	
		if (ctype instanceof MIODComponentType)
		{
			return;
		}

		int i = 0;
		for (MIODComponentTypeInstance cti : ctype.getComponentTypeInstances())
		{
			if (cti.getComponentType() == null ||
				cti.getComponentType().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (cti.getComponentType() instanceof MIODComponentType)
			{
				error("Abstract component types shall only define relationships with abstract types",
						mclevdomPackage.eINSTANCE.getMIODAbstractComponentType_ComponentTypeInstances(), i);
			}
			i++;
		}

	}
	
	/**
	 * Checks that there are no duplicated names in the list of component
	 * types defined by an IOD. Implements Restriction 28.
	 * @param aod the IOD to check.
	 */
	@Check
	public void checkMIODComponentTypesList_duplicatedComponentTypeNames(MIODomain domain)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MIODAbstractComponentType ctype : domain.getComponentTypes())
		{
			if (names.add(StringHelper.toLowerDefString(ctype.getName())) == false)
			{
				error("Duplicated component type name: " +
					  ctype.getName(),
					  mclevdomPackage.eINSTANCE.getMIODomain_ComponentTypes(), i);
			}
			i++;
		}
	}
	
	
	/**
	 * Checks that there are no duplicated names in the list of component
	 * types defined by an AOD. Implements Restriction 29.
	 * @param domain the AOD to check.
	 */
	@Check
	public void checkMAODComponentTypesList_duplicatedComponentTypeNames(MAODomain domain)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MAODComponentType ctype : domain.getComponentTypes())
		{
			if (names.add(StringHelper.toLowerDefString(ctype.getName())) == false)
			{
				error("Duplicated component type name: " +
					  ctype.getName(),
					  mclevdomPackage.eINSTANCE.getMAODomain_ComponentTypes(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated names in the list of port
	 * types defined by a domain. Implements Restrictions 30 and 31.
	 * @param domain the domain to check.
	 */
	@Check
	public void checkMDomain_duplicatedPortTypeNames(MDomain ptypesList)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MPortType ptype : ptypesList.getPortTypes())
		{
			if (names.add(StringHelper.toLowerDefString(ptype.getName())) == false)
			{
				error("Duplicated port type name: " +
					  ptype.getName(),
					  mclevdomPackage.eINSTANCE.getMDomain_PortTypes(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated names in the list of interface
	 * types defined by a domain. Implements Restrictions 32 and 33.
	 * @param domain the domain to check.
	 */
	@Check
	public void checkMInterfaceTypesList_duplicatedInterfaceTypeNames(MDomain domain)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MInterfaceType itype : domain.getInterfaceTypes())
		{
			if (names.add(StringHelper.toLowerDefString(itype.getName())) == false)
			{
				error("Duplicated interface type name: " +
					  itype.getName(),
					  mclevdomPackage.eINSTANCE.getMDomain_InterfaceTypes(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated names in the list of connectors
	 * defined by a domain. Implements Restrictions 34 and 35.
	 * @param domain the domain to check.
	 */
	@Check
	public void checkMConnectorsList_duplicatedConnectorNames(MDomain domain)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MConnector conn : domain.getConnectors())
		{
			if (names.add(StringHelper.toLowerDefString(conn.getName())) == false)
			{
				error("Duplicated connector name: " +
					  conn.getName(),
					  mclevdomPackage.eINSTANCE.getMDomain_Connectors(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated names in the list of exchange
	 * models defined by an IOD. Implements Restrictions 36.
	 * @param iod the IOD to check.
	 */
	@Check
	public void checkMIODomain_duplicatedExchangeModelNames(MIODomain iod)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MExchangeModel em : iod.getExchangeModels())
		{
			if (names.add(StringHelper.toLowerDefString(em.getName())) == false)
			{
				error("Duplicated exchange model name: " +
					  em.getName(),
					  mclevdomPackage.eINSTANCE.getMIODomain_ExchangeModels(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that if an IOD does not allow singleton instances then all of
	 * the inherited domains must also not allow them. Implements Restriction
	 * 39.
	 * @param iod the IOD to check.
	 */
	@Check
	public void checkMIODomain_singletonInstances(MIODomain iod)
	{
		if (iod.getInherits().isEmpty() ||
			iod.isAllowsSingleton() == true)
		{
			return;
		}
		
		int i = 0;
		for (MIODomain piod : iod.getInherits())
		{
			if (piod.isAllowsSingleton() == true)
			{
				error("A domain must allow singleton instances if one of its parent domains does",
					  mclevdomPackage.eINSTANCE.getMIODomain_Inherits(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that if an AOD does not allow singleton instances then all of
	 * the inherited domains must also not allow them. Implements Restriction
	 * 40.
	 * @param aod the AOD to check.
	 */
	@Check
	public void checkMAODomain_singletonInstances(MAODomain aod)
	{
		if (aod.getInherits().isEmpty() ||
			aod.isAllowsSingleton() == true)
		{
			return;
		}
		
		int i = 0;
		for (MAODomain piod : aod.getInherits())
		{
			if (piod.isAllowsSingleton() == true)
			{
				error("A domain must allow singleton instances if one of its parent domains does",
					  mclevdomPackage.eINSTANCE.getMAODomain_Inherits(), i);
			}
			i++;
		}
	}

	/**
	 * Checks that there are no duplicated parameter names within the parameter
	 * list of an IOD supported platform.
	 * Implements Restriction 50 and 51 (modified).
	 * @param iodsp the IOD supported platform to check.
	 */
	@Check
	public void checkMIODomainSupportedPlatform_DuplicatedAttributeName(MIODomainSupportedPlatform iodsp)
	{		
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MParameter attr : iodsp.getAttributes())
		{
			if (names.add(StringHelper.toLowerDefString(attr.getName())) == false)
			{
				error("Duplicated parameter name: " + attr.getName(), 
					  mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Attributes(), i);	
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated attribute names within the attribute
	 * list of a port type.
	 * Implements Restriction 53.
	 * @param ptype the port type to check.
	 */
	@Check
	public void checkMPortType_DuplicatedAttributeName(MPortType ptype)
	{		
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MParameter attr : ptype.getAttributes())
		{
			if (names.add(StringHelper.toLowerDefString(attr.getName())) == false)
			{
				error("Duplicated parameter name: " + attr.getName(),
					  mclevdomPackage.eINSTANCE.getMPortType_Attributes(), i);	
			}
			i++;
		}

		i = 0;
		for (MParameter attr : ptype.getClientAttributes())
		{
			if (names.add(StringHelper.toLowerDefString(attr.getName())) == false)
			{
				error("Duplicated parameter name: " + attr.getName(), 
					 mclevdomPackage.eINSTANCE.getMPortType_ClientAttributes(), i);	
			}
			i++;
		}


		if (ptype.getServerAttributes() != null)
		{
			i = 0;
			for (MParameter attr : ptype.getServerAttributes())
			{
				if (names.add(StringHelper.toLowerDefString(attr.getName())) == false)
				{
					error("Duplicated parameter name: " + attr.getName(), 
							 mclevdomPackage.eINSTANCE.getMPortType_ServerAttributes(), i);	
				}
				i++;
			}
		}
	}
	
	/**
	 * Checks that there are no duplicated attribute names within the attribute
	 * list of a connector.
	 * Implements Restriction 54.
	 * @param conn the connector to check.
	 */
	@Check
	public void checkMConnector_DuplicatedAttributeName(MConnector conn)
	{		
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MParameter attr : conn.getAttributes())
		{
			if (names.add(StringHelper.toLowerDefString(attr.getName())) == false)
			{
				error("Duplicated parameter name: " + attr.getName(), 
					  mclevdomPackage.eINSTANCE.getMConnector_Attributes(), i);	
			}
			i++;
		}
	}
	
	
	/**
	 * Checks that there are no duplicates in the inheritance list of an IOD.
	 * @param iod the IOD to check.
	 */
	@Check
	void checkMIODomain_DuplicatedInheritance(MIODomain iod)
	{
		Set<MIODomain> domains = new HashSet<MIODomain>();
		
		int i = 0;
		for (MIODomain piod : iod.getInherits())
		{
			if (piod == null || 
				piod.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (domains.add(piod) == false)
			{
				error("Duplicated parent domain: " +
					  MCLEVStringHelper.getDefault().getElementName(piod),
					  iod, mclevdomPackage.eINSTANCE.getMIODomain_Inherits(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the inheritance list of an AOD.
	 * @param aod the AOD to check.
	 */
	@Check
	void checkMAODomain_DuplicatedInheritance(MAODomain aod)
	{
		Set<MAODomain> domains = new HashSet<MAODomain>();
		
		int i = 0;
		for (MAODomain paod : aod.getInherits())
		{
			if (paod == null || 
					paod.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (domains.add(paod) == false)
			{
				error("Duplicated parent domain: " +
					  MCLEVStringHelper.getDefault().getElementName(paod),
					  aod, mclevdomPackage.eINSTANCE.getMAODomain_Inherits(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the inheritance list of an IOD
	 * abstract component type.
	 * @param ctype the component type to check.
	 */
	@Check
	void checkMIODAbstractComponentType_DuplicatedInheritance(MIODAbstractComponentType ctype)
	{
		Set<MIODAbstractComponentType> ctypes = new HashSet<MIODAbstractComponentType>();
		
		int i = 0;
		for (MIODAbstractComponentType pctype : ctype.getInherits())
		{
			if (pctype == null || 
				pctype.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctypes.add(pctype) == false)
			{
				error("Duplicated parent component type: " +
					  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pctype),
					  ctype, mclevdomPackage.eINSTANCE.getMIODAbstractComponentType_Inherits(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the inheritance list of an AOD
	 * component type.
	 * @param ctype the component type to check.
	 */
	@Check
	void checkMAODComponentType_DuplicatedInheritance(MAODComponentType ctype)
	{
		Set<MAODComponentType> ctypes = new HashSet<MAODComponentType>();
		
		int i = 0;
		for (MAODComponentType pctype : ctype.getInherits())
		{
			if (pctype == null || 
				pctype.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctypes.add(pctype) == false)
			{
				error("Duplicated parent component type: " +
					  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pctype),
					  ctype, mclevdomPackage.eINSTANCE.getMAODComponentType_Inherits(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the inheritance list of a port
	 * type.
	 * @param ptype the port type to check.
	 */
	@Check
	void checkMPortType_DuplicatedInheritance(MPortType ptype)
	{
		Set<MPortType> ptypes = new HashSet<MPortType>();
		
		int i = 0;
		for (MPortType pptype : ptype.getInherits())
		{
			if (pptype == null || 
				pptype.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ptypes.add(pptype) == false)
			{
				error("Duplicated parent port type: " +
					  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pptype),
					  ptype, mclevdomPackage.eINSTANCE.getMPortType_Inherits(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the inheritance list of an
	 * interface type.
	 * @param itype the interface type to check.
	 */
	@Check
	void checkMInterfaceType_DuplicatedInheritance(MInterfaceType itype)
	{
		Set<MInterfaceType> itypes = new HashSet<MInterfaceType>();
		
		int i = 0;
		for (MInterfaceType pitypes : itype.getInherits())
		{
			if (pitypes == null || 
				pitypes.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (itypes.add(pitypes) == false)
			{
				error("Duplicated parent interface type: " +
					  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pitypes),
					  itype, mclevdomPackage.eINSTANCE.getMInterfaceType_Inherits(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicates in the inheritance list of a
	 * connector.
	 * @param conn the connector to check.
	 */
	@Check
	void checkMConnector_DuplicatedInheritance(MConnector conn)
	{
		Set<MConnector> conns = new HashSet<MConnector>();
		
		int i = 0;
		for (MConnector pconn : conn.getInherits())
		{
			if (pconn == null || 
				pconn.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (conns.add(pconn) == false)
			{
				error("Duplicated parent interface type: " +
					  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pconn),
					  conn, mclevdomPackage.eINSTANCE.getMInterfaceType_Inherits(), i);
			}
			i++;
		}
	}

	/**
	 * Checks that there are no duplicated supported platform names within an
	 * IOD.
	 * Implements Restriction TBD.
	 * @param iod the IOD to check.
	 */
	@Check
	public void checkMIODomain_DuplicatedSupportedPlatformNames(MIODomain iod)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MIODomainSupportedPlatform swpsp : iod.getSupportedPlatforms())
		{
			if (names.add(StringHelper.toLowerDefString(swpsp.getName())) == false)
			{
				error("Duplicated supported platform name: " + swpsp.getName(),
						mclevdomPackage.eINSTANCE.getMIODomain_SupportedPlatforms(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks the well-formedness of an IOD supported platform.
	 * Implements Restrictions TBD.
	 * @param iodsp the IOD supported platform to check.
	 */
	@Check
	public void checkMIODomainSupportedPlatform_wellformedness(MIODomainSupportedPlatform iodsp)
	{
		if (iodsp.getOsapi() == null &&
			((iodsp.getOs() != null && iodsp.getOs().eIsProxy() == false) ||
			 (iodsp.getArchitecture() != null && iodsp.getArchitecture().eIsProxy() == false) ||
			 (iodsp.getMicroprocessor() != null && iodsp.getMicroprocessor().eIsProxy() == false) ||
			 (iodsp.getBoard() != null && iodsp.getBoard().eIsProxy() == false)))
		{
			error("If the OSAPI is undefined, the rest of the fields must also be undefined",
					mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Osapi());
		}
		if (iodsp.getOs() == null &&
			((iodsp.getArchitecture() != null && iodsp.getArchitecture().eIsProxy() == false) ||
			 (iodsp.getMicroprocessor() != null && iodsp.getMicroprocessor().eIsProxy() == false) ||
			 (iodsp.getBoard() != null && iodsp.getBoard().eIsProxy() == false)))
		{
			error("If the OS is undefined, the rest of the fields must also be undefined",
					mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Os());
		}
		if (iodsp.getArchitecture() == null &&
			((iodsp.getCompiler() != null && iodsp.getCompiler().eIsProxy() == false) ||
			 (iodsp.getMicroprocessor() != null && iodsp.getMicroprocessor().eIsProxy() == false) ||
			 (iodsp.getBoard() != null && iodsp.getBoard().eIsProxy() == false)))
		{
			error("If the architecture is undefined, the compiler, the microprocessor and the board must also be undefined",
					mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Architecture());
		}
		if (iodsp.getMicroprocessor() == null &&
			(iodsp.getBoard() != null && iodsp.getBoard().eIsProxy() == false))
		{
			error("If the microprocessor is undefined, the board must also be undefined",
					mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Microprocessor());
		}
	}

	/**
	 * Checks that the operating system of an IOD supported platform
	 * supports the selected OSAPI.
	 * Implements Restriction TBD.
	 * @param iodsp the IOD supported platform to check.
	 */
	@Check
	public void checkMIODomainSupportedPlatform_OSSupportsOSAPI(MIODomainSupportedPlatform iodsp)
	{
		if (iodsp.getOsapi() != null &&
			iodsp.getOsapi().eIsProxy() == false &&
			iodsp.getOs() != null &&
			iodsp.getOs().eIsProxy() == false &&
			!MCLEVUtil.getDefault().getAllSupportedOSAPIs(iodsp.getOs()).contains(iodsp.getOsapi()))
		{
			error("The operating system " +
				  MCLEVStringHelper.getDefault().getElementName(iodsp.getOs())+
				  " does not support the OSAPI " +
				  MCLEVStringHelper.getDefault().getElementName(iodsp.getOsapi()),
				  mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Os());
		}
	}
	
	/**
	 * Checks that the compiler of the IOD supported platforms support the
	 * selected languages.
	 * Implements Restriction TBD.
	 * @param iod the IOD to check.
	 */
	@Check
	public void checkMIODomain_CompilerSupport(MIODomain iod)
	{
		if (iod.getLanguages().isEmpty())
		{
			return;
		}
		for (MIODomainSupportedPlatform iodsp : iod.getSupportedPlatforms())
		{
			if (iodsp.getArchitecture() != null &&
				iodsp.getArchitecture().eIsProxy() == false && 
				iodsp.getCompiler() != null &&
				iodsp.getCompiler().eIsProxy() == false)
			{
				for (MLanguage language : iod.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (MCLEVUtil.getDefault().supportsLanguageForArchitecture(iodsp.getCompiler(), 
							language, iodsp.getArchitecture()) == false)
					{
						error("The compiler " +
							  MCLEVStringHelper.getDefault().getElementName(iodsp.getCompiler())+
							  " does not support the language " +
							  MCLEVStringHelper.getDefault().getElementName(language) +
							  " for the architecture " +
							  MCLEVStringHelper.getDefault().getElementName(iodsp.getArchitecture()),
							  mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Compiler());
					}
				}
			}
		}

	}
	
	/**
	 * Checks that the operating system of an IOD supported platform
	 * supports the corresponding platform.
	 * Implements Restriction TBD.
	 * @param iodsp the IOD supported platform to check.
	 */
	@Check
	public void checkMIODomainSupportedPlatform_OSSupport(MIODomainSupportedPlatform iodsp)
	{
		if (iodsp.getOsapi() == null ||
			iodsp.getOsapi().eIsProxy() == true ||
			iodsp.getOs() == null ||
			iodsp.getOs().eIsProxy() == true ||
			iodsp.getArchitecture() == null ||
			iodsp.getArchitecture().eIsProxy() == true)
		{
			return;
		}
		
		MOperatingSystem os = iodsp.getOs();
		MPlatform platform = pdlFactory.eINSTANCE.createMPlatform();
		platform.setOsapi(iodsp.getOsapi());
		platform.setOs(iodsp.getOs());
		platform.setArchitecture(iodsp.getArchitecture());
		platform.setCompiler(iodsp.getCompiler());
		platform.setMicroprocessor(iodsp.getMicroprocessor());
		platform.setBoard(iodsp.getBoard());
		
		if (!MCLEVUtil.getDefault().supportsPlatform(os, platform))
		{
			error("The implementations of the operating system " +
				  MCLEVStringHelper.getDefault().getElementName(platform.getOs()) +
				  " are not supported by this platform",
				  mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Os());

		}
	}

	/**
	 * Checks that the microprocessor and the board of an IOD supported
	 * platform are correctly defined.
	 * Implements Restrictions TBD.
	 * @param iodsp the IOD supported platform to check.
	 */
	@Check
	public void checkMIODomainSupportedPlatform_MpAndBoard(MIODomainSupportedPlatform iodsp)
	{
		if (iodsp.getArchitecture() != null &&
			iodsp.getArchitecture().eIsProxy() == false &&
			iodsp.getMicroprocessor() != null &&
			iodsp.getMicroprocessor().eIsProxy() == false &&
			iodsp.getMicroprocessor().getArchitecture() != iodsp.getArchitecture())
		{
			error("Microprocessor " +
				  MCLEVStringHelper.getDefault().getElementName(iodsp.getMicroprocessor()) +
				  " does not support the architecture " +
				  MCLEVStringHelper.getDefault().getElementName(iodsp.getArchitecture()),
				  mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Microprocessor());
		}
		if (iodsp.getMicroprocessor() != null &&
			iodsp.getMicroprocessor().eIsProxy() == false &&
			iodsp.getBoard() != null &&
			iodsp.getBoard().eIsProxy() != false &&
			iodsp.getBoard().getMicroprocessor() != iodsp.getMicroprocessor())
		{
			error("Board " +
				  MCLEVStringHelper.getDefault().getElementName(iodsp.getBoard()) +
				  " does not support the microprocessor " +
				  MCLEVStringHelper.getDefault().getElementName(iodsp.getMicroprocessor()),
				  mclevdomPackage.eINSTANCE.getMIODomainSupportedPlatform_Board());
		}
	}
	
	/**
	 * Checks that the intersection between the supported platforms of an
	 * IOD is always zero.
	 * Implements restriction TBD.
	 * @param iod the IOD to check.
	 */
	@Check
	public void checkMIODomain_SupportedPlatformZeroIntersection(MIODomain iod) {
		
		if (iod.getSupportedPlatforms().size() >= 2)
		{
			int i = 0;
			for (MIODomainSupportedPlatform iodsp : iod.getSupportedPlatforms())
			{
				if ((iodsp.getOsapi() != null && iodsp.getOsapi().eIsProxy() == true) ||
					(iodsp.getOs() != null && iodsp.getOs().eIsProxy() == true) ||
					(iodsp.getArchitecture() != null && iodsp.getArchitecture().eIsProxy() == true) ||
					(iodsp.getCompiler() != null && iodsp.getCompiler().eIsProxy() == true) ||
					(iodsp.getMicroprocessor() != null && iodsp.getMicroprocessor().eIsProxy() == true) ||
					(iodsp.getBoard() != null && iodsp.getBoard().eIsProxy() == true))
				{
					continue;
				}
				for (Iterator<MIODomainSupportedPlatform> q = iod.getSupportedPlatforms().iterator(); q.hasNext(); )
				{
					MIODomainSupportedPlatform otherIODSP = q.next();
					if (iodsp == otherIODSP)
					{
						continue;
					}
					if ((otherIODSP.getOsapi() != null && otherIODSP.getOsapi().eIsProxy() == true) ||
						(otherIODSP.getOs() != null && otherIODSP.getOs().eIsProxy() == true) ||
						(otherIODSP.getArchitecture() != null && otherIODSP.getArchitecture().eIsProxy() == true) ||
						(otherIODSP.getCompiler() != null && otherIODSP.getCompiler().eIsProxy() == true) ||
						(otherIODSP.getMicroprocessor() != null && otherIODSP.getMicroprocessor().eIsProxy() == true) ||
						(otherIODSP.getBoard() != null && otherIODSP.getBoard().eIsProxy() == true))
					{
						continue;
					}
					if (MCLEVUtil.getDefault().platformIntersection(iodsp, otherIODSP))
					{
						error("Supported Platforms intersection is not zero",
							  mclevdomPackage.eINSTANCE.getMIODomain_SupportedPlatforms(), i);
					}
					i++;
				}
			}
		}
	}
	
	/**
	 * Checks that there are not two relationships between a component and
	 * a port type of the same kind.
	 * Implements Restriction 55.
	 * @param ctype the component type to check.
	 */
	@Check
	public void checkMComponentType_DuplicatedPortTypeInstances(MComponentType ctype)
	{
		if (ctype.getPortTypeInstances().isEmpty())
		{
			return;
		}
		
		int i = 0;
		
		Map<MPortType, MInternalClientPortTypeInstance> internalClientPTIs = new HashMap<MPortType, MInternalClientPortTypeInstance>();
		Map<MPortType, MExternalClientPortTypeInstance> externalClientPTIs = new HashMap<MPortType, MExternalClientPortTypeInstance>();
		Map<MPortType, MInternalServerPortTypeInstance> internalServerPTIs = new HashMap<MPortType, MInternalServerPortTypeInstance>();
		Map<MPortType, MExternalServerPortTypeInstance> externalServerPTIs = new HashMap<MPortType, MExternalServerPortTypeInstance>();
		
		for (MPortTypeInstance pti : ctype.getPortTypeInstances())
		{
			if (pti.getPortType() == null ||
				pti.getPortType().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (pti instanceof MInternalClientPortTypeInstance)
			{
				if (internalClientPTIs.get(pti.getPortType()) != null)
				{
					error("There cannot be two relationships of the same kind on the same port type",
						  ctype, mclevdomPackage.eINSTANCE.getMComponentType_PortTypeInstances(), i);
				}
				else
				{
					internalClientPTIs.put(pti.getPortType(), (MInternalClientPortTypeInstance) pti);
				}
			}
			else if (pti instanceof MExternalClientPortTypeInstance)
			{
				if (externalClientPTIs.get(pti.getPortType()) != null)
				{
					error("There cannot be two relationships of the same kind on the same port type",
						  ctype, mclevdomPackage.eINSTANCE.getMComponentType_PortTypeInstances(), i);
				}
				else
				{
					externalClientPTIs.put(pti.getPortType(), (MExternalClientPortTypeInstance) pti);
				}
			}
			else if (pti instanceof MInternalServerPortTypeInstance)
			{
				if (internalServerPTIs.get(pti.getPortType()) != null)
				{
					error("There cannot be two relationships of the same kind on the same port type",
						  ctype, mclevdomPackage.eINSTANCE.getMComponentType_PortTypeInstances(), i);
				}
				else
				{
					internalServerPTIs.put(pti.getPortType(), (MInternalServerPortTypeInstance) pti);
				}
			}
			else
			{
				if (externalServerPTIs.get(pti.getPortType()) != null)
				{
					error("There cannot be two relationships of the same kind on the same port type",
						  ctype, mclevdomPackage.eINSTANCE.getMComponentType_PortTypeInstances(), i);
				}
				else
				{
					externalServerPTIs.put(pti.getPortType(), (MExternalServerPortTypeInstance) pti);
				}
			}
			i++;
		}
	}

	/**
	 * Checks that the bounds of a port type instance are defined correctly.
	 * Implements Restriction 56, 57, 58 and 59.
	 * @param pti the port type instance to check
	 */
	@Check
	public void checkMPortTypeInstance_bounds(MPortTypeInstance pti)
	{
		Long lowerBound, upperBound;
		
		try {
			lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(pti.getLowerBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMPortTypeInstance_LowerBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMPortTypeInstance_LowerBound());
			return;
		}
		
		try {
			upperBound = MCLEVUtil.getDefault().parseIntegerExpression(pti.getUpperBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMPortTypeInstance_UpperBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMPortTypeInstance_UpperBound());
			return;
		}
		
		if (lowerBound < 0)
		{
			error("The lower bound must always be greater than or equal to zero",
				  mclevdomPackage.eINSTANCE.getMPortTypeInstance_LowerBound());
		}
		
		if (upperBound != -1 &&
			upperBound < lowerBound)
		{
			error("The upper bound must be greater than or equal to the lower bound",
				  mclevdomPackage.eINSTANCE.getMPortTypeInstance_UpperBound());
		}
	}
	
	/**
	 * Checks that there are not two relationships between a domain and
	 * the same component type.
	 * Implements Restriction 60.
	 * @param iod the IOD to check.
	 */
	@Check
	public void checkMIODomain_DuplicatedComponentTypeInstances(MIODomain iod)
	{
		if (iod.getComponentTypeInstances().isEmpty())
		{
			return;
		}
		
		int i = 0;
		
		Set<MComponentType> ctis = new HashSet<MComponentType>();
		
		for (MIODComponentTypeInstance cti : iod.getComponentTypeInstances())
		{
			if (cti.getComponentType() == null ||
				cti.getComponentType().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctis.add(cti.getComponentType()) == false)
			{
				error("There cannot be two relationships on the same component type",
					  mclevdomPackage.eINSTANCE.getMIODomain_ComponentTypeInstances(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two relationships between a domain and
	 * the same component type.
	 * Implements Restriction 61.
	 * @param aod the AOD to check.
	 */
	@Check
	public void checkMAODomain_DuplicatedComponentTypeInstances(MAODomain aod)
	{
		if (aod.getComponentTypeInstances().isEmpty())
		{
			return;
		}
		
		int i = 0;
		
		Set<MComponentType> ctis = new HashSet<MComponentType>();
		
		for (MAODComponentTypeInstance cti : aod.getComponentTypeInstances())
		{
			if (cti.getComponentType() == null ||
				cti.getComponentType().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctis.add(cti.getComponentType()) == false)
			{
				error("There cannot be two relationships on the same component type",
					  mclevdomPackage.eINSTANCE.getMAODomain_ComponentTypeInstances(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two relationships between a component type and
	 * the same component type.
	 * @param aodctype the component type to check.
	 */
	@Check
	public void checkMIODAbstractComponentType_DuplicatedComponentTypeInstances(MIODAbstractComponentType aodctype)
	{
		if (aodctype.getComponentTypeInstances().isEmpty())
		{
			return;
		}
		
		int i = 0;
		
		Set<MComponentType> ctis = new HashSet<MComponentType>();
		
		for (MIODComponentTypeInstance cti : aodctype.getComponentTypeInstances())
		{
			if (cti.getComponentType() == null ||
				cti.getComponentType().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctis.add(cti.getComponentType()) == false)
			{
				error("There cannot be two relationships on the same component type",
					  mclevdomPackage.eINSTANCE.getMIODAbstractComponentType_ComponentTypeInstances(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two relationships between a component type and
	 * the same component type.
	 * @param aodctype the component type to check.
	 */
	@Check
	public void checkMAODComponentType_DuplicatedComponentTypeInstances(MAODComponentType aodctype)
	{
		if (aodctype.getComponentTypeInstances().isEmpty())
		{
			return;
		}
		
		int i = 0;
		
		Set<MComponentType> ctis = new HashSet<MComponentType>();
		
		for (MAODComponentTypeInstance cti : aodctype.getComponentTypeInstances())
		{
			if (cti.getComponentType() == null ||
				cti.getComponentType().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (ctis.add(cti.getComponentType()) == false)
			{
				error("There cannot be two relationships on the same component type",
					  mclevdomPackage.eINSTANCE.getMAODComponentType_ComponentTypeInstances(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that the bounds of a component type instance are defined
	 * correctly. Implements Restriction 63.
	 * @param cti the component type instance to check
	 */
	@Check
	public void checkMComponentTypeInstance_bounds(MComponentTypeInstance cti)
	{
		Long lowerBound, upperBound;
		
		try {
			lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getLowerBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMComponentTypeInstance_LowerBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMComponentTypeInstance_LowerBound());
			return;
		}
		
		try {
			upperBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getUpperBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMComponentTypeInstance_UpperBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					mclevdomPackage.eINSTANCE.getMComponentTypeInstance_UpperBound());
			return;
		}
		
		if (lowerBound < 0)
		{
			error("The lower bound must always be greater than or equal to zero",
				  mclevdomPackage.eINSTANCE.getMPortTypeInstance_LowerBound());
		}
		
		if (upperBound != -1 &&
			upperBound < lowerBound)
		{
			error("The upper bound must be greater than or equal to the lower bound",
				  mclevdomPackage.eINSTANCE.getMComponentTypeInstance_UpperBound());
		}
	}
}
