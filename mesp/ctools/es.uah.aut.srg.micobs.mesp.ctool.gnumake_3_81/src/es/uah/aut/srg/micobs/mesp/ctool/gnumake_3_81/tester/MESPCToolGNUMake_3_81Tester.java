/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.tester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake_3_81.plugin.MESPCToolGNUMake_3_81Plugin;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;

/**
 * Tester that checks if a given deployment model file has attached
 * the GNU Makefile Construction Tool.
 *
 */
public class MESPCToolGNUMake_3_81Tester extends PropertyTester {

	private static final String PROPERTY_IS_GNUMAKE_3_81 = "isGNUMake_3_81";
	private static final String CTOOL_GNUMAKE_URI = "es.uah.aut.srg.micobs.mesp.ctools.GNUMake";
	private static final String CTOOL_GNUMAKE_VERSION = "3.81";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (property.equals(PROPERTY_IS_GNUMAKE_3_81))
		{
			if (!(receiver instanceof IFile))
				return false;
			
			MCommonPackageElement element;
			try {
				element = MESPLibraryManager.getLibraryManager().getElement(CTOOL_GNUMAKE_URI, CTOOL_GNUMAKE_VERSION);
			} catch (LibraryManagerException e) {
				MESPCToolGNUMake_3_81Plugin.INSTANCE.log(e);
				return false;
			}
			if (element == null || !(element instanceof MConstructionTool))
			{
				return false;
			}
			
			MConstructionTool ctool = (MConstructionTool)element;
			
			IFile file = (IFile)receiver;
			XtextResourceSet resourceSet = new XtextResourceSet();
			URI destFile = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			XtextResource destRes = (XtextResource) resourceSet.getResource(destFile, true);
			MCommonPackageFile newPack = (MCommonPackageFile)destRes.getContents().get(0);
			MCommonPackageElement newElement = newPack.getElement();
			
			if (newElement instanceof MSwPackage)
			{
				if (((MSwPackage)newElement).getCtools().contains(ctool))
				{
					return true;
				}
				return false;
			}
			if (newElement instanceof MOSSwPackage)
			{
				if (((MOSSwPackage)newElement).getCtools().contains(ctool))
				{
					return true;
				}
				return false;
			}
			if (newElement instanceof MPlatformSwPackage)
			{
				if (((MPlatformSwPackage)newElement).getCtools().contains(ctool))
				{
					return true;
				}
				return false;
			}
			if (newElement instanceof MMESPDeployment)
			{
				if (((MMESPDeployment)newElement).getCtool() == ctool)
				{
					return true;
				}
				return false;
			}
					
		}
		return false;
	}

}
