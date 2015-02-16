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
package es.uah.aut.srg.micobs.pdl.util.impl;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.util.IPDLStringHelper;
import es.uah.aut.srg.micobs.util.IMICOBSStringHelper;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * String helper functions to be used with the platform models.
 *
 */
public class PDLStringHelper implements IMICOBSStringHelper, IPDLStringHelper {

	private static PDLStringHelper INSTANCE;
	
	/**
	 * Returns the singleton instance of the helper.
	 * @return the singleton instance of the helper.
	 */
	public static PDLStringHelper getInstance() {
		if (INSTANCE == null)
		{
			INSTANCE = new PDLStringHelper();
		}
		return INSTANCE;
	}
	
	@Override
	public String getProperName(MOSSupportedPlatform ossp)
	{
		if (ossp.getArchitecture() == null ||
			ossp.getArchitecture().eIsProxy() == true ||
			ossp.getCompiler() == null ||
			ossp.getCompiler().eIsProxy() == true ||
			(ossp.getMicroprocessor() != null && ossp.getMicroprocessor().eIsProxy() == true) ||
			(ossp.getBoard() != null && ossp.getBoard().eIsProxy() == true))
		{
			return null;
		}
		return StringHelper.toDefString(
			   getElementName(ossp.getArchitecture()),
			   getElementName(ossp.getCompiler()),
			   (ossp.getMicroprocessor() == null) ? "any" : getElementName(ossp.getMicroprocessor()),
			   (ossp.getBoard() == null) ? "any" : getElementName(ossp.getBoard()));
	}
	
	@Override
	public String getProperName(MPlatform platform)
	{
		if (platform.getOsapi() == null || 
			platform.getOsapi().eIsProxy() == true ||
			platform.getOs() == null || 
			platform.getOs().eIsProxy() == true ||
			platform.getArchitecture() == null || 
			platform.getArchitecture().eIsProxy() == true ||
			platform.getCompiler() == null || 
			platform.getCompiler().eIsProxy() == true ||
			(platform.getMicroprocessor() != null && platform.getMicroprocessor().eIsProxy() == true) ||
			(platform.getBoard() != null && platform.getBoard().eIsProxy() == true))
		{
			return null;
		}
		return StringHelper.toDefString(
			   getElementName(platform.getOsapi()),
			   getElementName(platform.getOs()),
			   getElementName(platform.getArchitecture()),
			   getElementName(platform.getCompiler()),
			   (platform.getMicroprocessor() == null) ? "any" : getElementName(platform.getMicroprocessor()),
			   (platform.getBoard() == null) ? "any" : getElementName(platform.getBoard()));
	}

	@Override
	public String getFullElementName(MCommonPackageElement element) {
		return MICOBSStringHelper.getInstance().getFullElementName(element);
	}

	@Override
	public String getElementName(MCommonPackageElement element) {
		return MICOBSStringHelper.getInstance().getElementName(element);
	}

	@Override
	public String getPartialObjectNameToElement(MCommonReferenceableObj object,
			int index) {
		return getPartialObjectNameToElement(object, index);
	}

	@Override
	public String getFullObjectNameToElement(MCommonReferenceableObj object) {
		return getFullObjectNameToElement(object);
	}

	@Override
	public String getRelativeObjectName(MCommonReferenceableObj object) {
		return getRelativeObjectName(object);
	}

	@Override
	public String getPartialObjectNameToElementWithoutVersion(
			MCommonReferenceableObj object, int index) {
		return getPartialObjectNameToElementWithoutVersion(object, index);
	}

	@Override
	public String getFullObjectNameToElementWithoutVersion(
			MCommonReferenceableObj object) {
		return getFullObjectNameToElementWithoutVersion(object);
	}

	@Override
	public String toPlainString(Float val) {
		return toPlainString(val);
	}

	@Override
	public String toDefString(String... strings) {
		return MICOBSStringHelper.getInstance().toDefString(strings);
	}

	@Override
	public String toLowerDefString(String... strings) {
		return MICOBSStringHelper.getInstance().toLowerDefString(strings);
	}

	@Override
	public String toUpperDefString(String... strings) {
		return MICOBSStringHelper.getInstance().toUpperDefString(strings);
	}
	
}
