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
package es.uah.aut.srg.micobs.mclev.domain.nulldomain.tester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.nulldomain.util.NULLDomainUtil;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;

/**
 * Tester that checks if a given deployment model file is defined for the
 * NULL domain. It checks both the flat and regular deployment models.
 *
 */
public class NULLDomainTester extends PropertyTester {

	private static final String PROPERTY_IS_NULLDOMAIN_V1 = "isNULLDomain_v1";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (property.equals(PROPERTY_IS_NULLDOMAIN_V1))
		{
			if (!(receiver instanceof IFile))
				return false;
			
			MIODomain nulldomain = NULLDomainUtil.getNULLDomain();
			
			if (nulldomain == null)
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
			
			if (newElement instanceof MMCADeployment)
			{
				if (((MMCADeployment)newElement).getDomain() == nulldomain)
				{
					return true;
				}
				return false;
			}
			if (newElement instanceof MFlatMCAD)
			{
				MMCADeployment mcad = (MMCADeployment) ((MFlatMCAD)newElement).getReferencedElement();
				if (mcad != null && mcad.getDomain() == nulldomain)
				{
					return true;
				}
				return false;
			}
		}
		return false;
	}

}
