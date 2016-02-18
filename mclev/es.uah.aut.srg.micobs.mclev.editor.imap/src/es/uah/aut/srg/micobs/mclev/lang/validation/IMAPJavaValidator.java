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
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
 

public class IMAPJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevimap"));
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
		return importLibraries;
	}
	
	/**
	 * Checks that the types of the selected interfaces match with the ones
	 * defined by the exchange model or by a model it inherits.
	 * Implements Restriction TBD.
	 * 
	 * @param imap the interface mapping to check.
	 */
	@Check
	public void checkMInterfaceMapping_SupportedInterfaces(MInterfaceMapping imap)
	{
		if (imap.getDomain() == null ||
			imap.getDomain().eIsProxy() == true ||
			imap.getType() == null ||
			imap.getType().eIsProxy() == true)
		{
			return;
		}
		
		int i = 0;
		for (MInterface iface : imap.getInterfaces())
		{
			if (iface.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (MCLEVUtil.getDefault().getAllInterfaceTypes(imap.getType()).contains(iface.getType()) == false)
			{
				error("Interface type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(iface.getType()) +
					  " is not supported by the selected exchange model",
					  mclevimapPackage.eINSTANCE.getMInterfaceMapping_Interfaces(), i);
			}
			i++;
		}
		
	}
	
	/**
	 * Checks that the selected interfaces are not duplicated.
	 * 
	 * @param imap the interface mapping to check.
	 */
	@Check
	public void checkMInterfaceMapping_DuplicatedInterfaces(MInterfaceMapping imap)
	{
		if (imap.getInterfaces().size() != 2 ||
			imap.getInterfaces().get(0).eIsProxy() == true ||
			imap.getInterfaces().get(1).eIsProxy() == true)
		{
			return;
		}
		if (imap.getInterfaces().get(0) == imap.getInterfaces().get(1))
		{
			error("Duplicated interfaces. The selected interfaces are the same",
				  mclevimapPackage.eINSTANCE.getMInterfaceMapping_Interfaces());
		}
		
	}

}
