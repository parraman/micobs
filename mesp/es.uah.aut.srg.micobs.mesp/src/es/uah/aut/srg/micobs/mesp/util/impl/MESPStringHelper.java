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
package es.uah.aut.srg.micobs.mesp.util.impl;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.util.IMESPStringHelper;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.util.IPDLStringHelper;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLStringHelper;
import es.uah.aut.srg.micobs.util.IMICOBSStringHelper;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * String helper functions to be used with the MESP models.
 *
 */
public class MESPStringHelper implements IMICOBSStringHelper, IPDLStringHelper, IMESPStringHelper {
	
	private static MESPStringHelper INSTANCE;
	
	/**
	 * Returns the default singleton instance of the helper.
	 * 
	 * @return the default singleton instance of the helper.
	 */
	public static MESPStringHelper getDefault() {
		if (INSTANCE == null)
		{
			INSTANCE = new MESPStringHelper();
		}
		return INSTANCE;
	}
	
	@Override
	public String getProperName(MSwPackageSupportedPlatform swpsp)
	{
		if ((swpsp.getOsapi() != null && swpsp.getOsapi().eIsProxy() == true) ||
			(swpsp.getOs() != null && swpsp.getOs().eIsProxy() == true) ||
			(swpsp.getArchitecture() != null && swpsp.getArchitecture().eIsProxy() == true) ||
			(swpsp.getCompiler() != null && swpsp.getCompiler().eIsProxy() == true) ||
			(swpsp.getMicroprocessor() != null && swpsp.getMicroprocessor().eIsProxy() == true) ||
			(swpsp.getBoard() != null && swpsp.getBoard().eIsProxy() == true))
		{
			return null;
		}
		return StringHelper.toDefString(
			   (swpsp.getOsapi() == null) ? "any" : getElementName(swpsp.getOsapi()),
			   (swpsp.getOs() == null) ? "any" : getElementName(swpsp.getOs()),
			   (swpsp.getArchitecture() == null) ? "any" : getElementName(swpsp.getArchitecture()),
			   (swpsp.getCompiler() == null) ? "" : getElementName(swpsp.getCompiler()),
			   (swpsp.getMicroprocessor() == null) ? "any" : getElementName(swpsp.getMicroprocessor()),
			   (swpsp.getBoard() == null) ? "any" : getElementName(swpsp.getBoard()));
	}

	@Override
	public String getProperName(MOSSupportedPlatform ossp) {
		return PDLStringHelper.getInstance().getProperName(ossp);
	}

	@Override
	public String getProperName(MPlatform platform) {
		return PDLStringHelper.getInstance().getProperName(platform);
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
		return MICOBSStringHelper.getInstance().getPartialObjectNameToElement(object, index);
	}

	@Override
	public String getFullObjectNameToElement(MCommonReferenceableObj object) {
		return MICOBSStringHelper.getInstance().getFullObjectNameToElement(object);
	}

	@Override
	public String getRelativeObjectName(MCommonReferenceableObj object) {
		return MICOBSStringHelper.getInstance().getRelativeObjectName(object);
	}

	@Override
	public String getPartialObjectNameToElementWithoutVersion(
			MCommonReferenceableObj object, int index) {
		return MICOBSStringHelper.getInstance().getPartialObjectNameToElementWithoutVersion(object, index);
	}

	@Override
	public String getFullObjectNameToElementWithoutVersion(
			MCommonReferenceableObj object) {
		return MICOBSStringHelper.getInstance().getFullObjectNameToElementWithoutVersion(object);
	}

	@Override
	public String toPlainString(Float val) {
		return MICOBSStringHelper.getInstance().toPlainString(val);
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
