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
package es.uah.aut.srg.micobs.mclev.domain.edroom.tester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.domain.edroom.plugin.EDROOMPlugin;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;

/**
 * Tester that checks if a given deployment model file is defined for the
 * EDROOM domain. It checks both the flat and regular deployment models.
 *
 */
public class EDROOMDomainTester extends PropertyTester {

	private static final String PROPERTY_IS_EDROOM_V1 = "isEDROOM_v1";
	private static final String DOMAIN_EDROOM_URI = "es.uah.aut.srg.micobs.mclev.domains.EDROOM";
	private static final String DOMAIN_EDROOM_VERSION = "v1";

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (property.equals(PROPERTY_IS_EDROOM_V1))
		{
			if (!(receiver instanceof IFile))
				return false;

			MCommonPackageElement element;
			try {
				element = MCLEVLibraryManager.getLibraryManager().getElement(
						mclevdomPackage.eINSTANCE.getMIODomain(),
						DOMAIN_EDROOM_URI, DOMAIN_EDROOM_VERSION);
			} catch (LibraryManagerException e) {
				EDROOMPlugin.INSTANCE.log(e);
				return false;
			}
			if (element == null || !(element instanceof MIODomain))
			{
				return false;
			}

			MIODomain iod = (MIODomain)element;

			IFile file = (IFile)receiver;
			XtextResourceSet resourceSet = new XtextResourceSet();
			URI destFile = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			XtextResource destRes = (XtextResource) resourceSet.getResource(destFile, true);
			MCommonPackageFile newPack = (MCommonPackageFile)destRes.getContents().get(0);
			MCommonPackageElement newElement = newPack.getElement();

			if (newElement instanceof MMCADeployment &&
				((MMCADeployment)element).getDomain() != null &&
				((MMCADeployment)element).getDomain().eIsProxy() == false &&
				((MMCADeployment)element).getDomain() == iod)
			{
				return true;
			}

		}
		return false;
	}

}
