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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.EDROOMLibraryManager;
import es.uah.aut.srg.micobs.mclev.domain.edroom.util.EDROOMUtil;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 *
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it
 *
 */
public class PROTScopeProvider extends MICOBSElementAbstractScopeProvider {

	/**
	 * Provides the scope for the reply messages that can be attached to a
	 * given invoke message. The set of messages will depend on whether the
	 * invoke message is an input or an output message.
	 * 
	 * @param message the invoke message.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_EDROOMInvokeMessage_replies(EDROOMInvokeMessage message, EReference reference)
	{
		if (message.eContainmentFeature() == edroomprotPackage.eINSTANCE.getEDROOMProtocol_InputMessages())
		{
			// It is in an input message, thus the replies must be obtained
			// from the output messages list
			EDROOMProtocol protocol = (EDROOMProtocol)message.eContainer();
			Set<EDROOMReplyMessage> replies = new HashSet<EDROOMReplyMessage>();
			for (EDROOMProtocol eprot : protocol.getExtends())
			{
				if (eprot.eIsProxy() == true)
				{
					continue;
				}
				replies.addAll(EDROOMUtil.INSTANCE.getAllOutputReplyMessages(eprot));
			}
			IScope outerScope = getFullObjectScope(replies);
			return getRelativeObjectScope(EDROOMUtil.INSTANCE.getOutputReplyMessages(protocol), outerScope);

		}
		else
		{
			// It is in an output message, thus the replies must be obtained
			// from the input messages list
			EDROOMProtocol protocol = (EDROOMProtocol)message.eContainer();
			Set<EDROOMReplyMessage> replies = new HashSet<EDROOMReplyMessage>();
			for (EDROOMProtocol eprot : protocol.getExtends())
			{
				if (eprot.eIsProxy() == true)
				{
					continue;
				}
				replies.addAll(EDROOMUtil.INSTANCE.getAllInputReplyMessages(eprot));
			}
			IScope outerScope = getFullObjectScope(replies);
			return getRelativeObjectScope(EDROOMUtil.INSTANCE.getInputReplyMessages(protocol), outerScope);
		}
	}

	/**
	 * Provides the scope with the set of protocols that can be
	 * extended by a given protocol.
	 * 
	 * @param protocol the protocol.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_EDROOMProtocol(final EDROOMProtocol protocol, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)protocol.eContainer()).getImports();

		try {
			elements = EDROOMLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}

		return getFullElementScope(elements);
	}

	/**
	 * Provides the scope with the set of data classes that can be used in the
	 * definition of the messages of a protocol.
	 * 
	 * @param protocol the protocol.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_EDROOMDataClass(final EDROOMProtocol protocol, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)protocol.eContainer()).getImports();

		try {
			elements = EDROOMLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}

		return getFullElementScope(elements);
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


}
