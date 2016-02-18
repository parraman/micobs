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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.EDROOMLibraryManager;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;


public class PROTJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/domain/edroom/edroomprot"));
		return result;
	}

	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return EDROOMLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(EDROOMLibraryManager.getLibraryManager());
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		return importLibraries;
	}

	/**
	 * Checks that there are no messages with the same name, independently of
	 * their type.
	 * 
	 * @param protocol the protocol to check.
	 */
	@Check
	public void checkEDROOMProtocol_duplicatedMessageName(EDROOMProtocol protocol)
	{
		Set<String> names = new HashSet<String>();

		int i = 0;

		for (EDROOMMessage message : protocol.getInputMessages())
		{
			if (names.add(message.getName()) == false)
			{
				error("Duplicated message name: " +
					  message.getName(), edroomprotPackage.eINSTANCE.getEDROOMProtocol_InputMessages(), i);
			}
			i++;
		}
		i = 0;
		for (EDROOMMessage message : protocol.getOutputMessages())
		{
			if (names.add(message.getName()) == false)
			{
				error("Duplicated message name: " +
					  message.getName(), edroomprotPackage.eINSTANCE.getEDROOMProtocol_OutputMessages(), i);
			}
			i++;
		}
	}

	/**
	 * Checks that there are no duplicated extended protocols. It also checks
	 * that the interfaces extended by the MCLEV interface are also extended
	 * as protocols.
	 * 
	 * @param protocol the EDROOM Protocol to check.
	 */
	@Check
	public void checkEDROOMProtocol_extendedProtocols(EDROOMProtocol protocol)
	{
		if (protocol.getReferencedElement() == null ||
			protocol.getReferencedElement().eIsProxy() == true ||
			!(protocol.getReferencedElement() instanceof MInterface))
		{
			return;
		}
		MInterface iface = (MInterface)protocol.getReferencedElement();

		Set<EDROOMProtocol> extendedProtocols = new HashSet<EDROOMProtocol>();
		Set<MInterface> extendedInterfaces = new HashSet<MInterface>();

		int i = 0;
		for (EDROOMProtocol eprot : protocol.getExtends())
		{
			if (eprot.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (iface.getExtends().contains(eprot.getReferencedElement()) == false)
			{
				error("Interface " + MCLEVStringHelper.getDefault().getElementName(eprot.getReferencedElement()) +
					  " is not originally extended by interface " +
					  MCLEVStringHelper.getDefault().getElementName(protocol.getReferencedElement()),
					  edroomprotPackage.eINSTANCE.getEDROOMProtocol_Extends(), i);
			}
			if (extendedProtocols.add(eprot) == false)
			{
				error("Duplicated extended protocol: " + MCLEVStringHelper.getDefault().getElementName(eprot),
					  edroomprotPackage.eINSTANCE.getEDROOMProtocol_Extends(), i);
			}
			if (extendedInterfaces.add((MInterface) eprot.getReferencedElement()) == false)
			{
				error("Duplicated referenced interface: " +
					  MCLEVStringHelper.getDefault().getElementName(eprot.getReferencedElement()),
					  edroomprotPackage.eINSTANCE.getEDROOMProtocol_Extends(), i);
			}
			i++;
		}
		for (MInterface eiface : iface.getExtends())
		{
			if (extendedInterfaces.contains(eiface) == false)
			{
				error("Extended interface " +
					  MCLEVStringHelper.getDefault().getElementName(eiface) +
					  " is not being referenced by any of the extended protocols",
					  edroomprotPackage.eINSTANCE.getEDROOMProtocol_Extends());
			}
		}
	}

	/**
	 * Checks that there are no duplicated reply messages in the definition of
	 * an invoke message.
	 * 
	 * @param invoke the invoke message to check.
	 */
	@Check
	public void checkEDROOMInvokeMessage_duplicatedReplies(EDROOMInvokeMessage invoke)
	{
		Set<EDROOMReplyMessage> replies = new HashSet<EDROOMReplyMessage>();

		int i = 0;
		for (EDROOMReplyMessage message : invoke.getReplies())
		{
			if (message.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (replies.add(message) == false)
			{
				error("Duplicated reply message: " +
					  MCLEVStringHelper.getDefault().getFullObjectNameToElement(message),
					  edroomprotPackage.eINSTANCE.getEDROOMInvokeMessage_Replies(), i);
			}
			i++;
		}
	}
}
