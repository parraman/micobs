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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.tester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.util.GNUMakeUtil;
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
public class GNUMakeTester extends PropertyTester {

	private static final String PROPERTY_IS_GNUMAKE_3_81 = "isGNUMake_3_81";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (property.equals(PROPERTY_IS_GNUMAKE_3_81))
		{
			if (!(receiver instanceof IFile))
				return false;
			
			MConstructionTool ctool = GNUMakeUtil.getDefault().getConstructionToolGNUMake();
			
			if (ctool == null)
			{
				// An error has occurred.. we have to return false
				return false;
			}
			
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
