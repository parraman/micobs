package es.uah.aut.srg.micobs.mclev.util.impl;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.util.IMCLEVStringHelper;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.util.IPDLStringHelper;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLStringHelper;
import es.uah.aut.srg.micobs.util.IMICOBSStringHelper;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

public class MCLEVStringHelper implements IMCLEVStringHelper, IPDLStringHelper, IMICOBSStringHelper {
	
	private static MCLEVStringHelper DEFAULT;
	
	public static MCLEVStringHelper getDefault() {
		if (DEFAULT == null)
		{
			DEFAULT = new MCLEVStringHelper();
		}
		return DEFAULT;
	}
	
	@Override
	public String getRelativeObjectName(MFlatMCADTarget target)
	{
		if (target.getDeploymentPlatform() == null)
		{
			return null;
		}
		if (target.getLeafDeploymentAlternative() == null)
		{
			return getRelativeObjectName(target.getDeploymentPlatform());
		}
		else
		{
			return getRelativeObjectName(target.getDeploymentPlatform()) +
				   OBJECT_DELIMITER +
				   getRelativeObjectName(target.getLeafDeploymentAlternative());
		}
	}
	
	@Override
	public String getFullObjectNameToElement(MFlatMCADTarget target)
	{
		if (target.getDeploymentPlatform() == null)
		{
			return null;
		}
		if (target.getLeafDeploymentAlternative() == null)
		{
			return getFullObjectNameToElement(target.getDeploymentPlatform());
		}
		else
		{
			return getFullObjectNameToElement(target.getDeploymentPlatform()) +
				   OBJECT_DELIMITER +
				   getRelativeObjectName(target.getLeafDeploymentAlternative());
		}
	}

	@Override
	public String getProperName(MIODomainSupportedPlatform iodsp)
	{
		if ((iodsp.getOsapi() != null && iodsp.getOsapi().eIsProxy() == true) ||
			(iodsp.getOs() != null && iodsp.getOs().eIsProxy() == true) ||
			(iodsp.getArchitecture() != null && iodsp.getArchitecture().eIsProxy() == true) ||
			(iodsp.getCompiler() != null && iodsp.getCompiler().eIsProxy() == true) ||
			(iodsp.getMicroprocessor() != null && iodsp.getMicroprocessor().eIsProxy() == true) ||
			(iodsp.getBoard() != null && iodsp.getBoard().eIsProxy() == true))
		{
			return null;
		}
		return StringHelper.toDefString(
			   (iodsp.getOsapi() == null) ? "any" : getElementName(iodsp.getOsapi()),
			   (iodsp.getOs() == null) ? "any" : getElementName(iodsp.getOs()),
			   (iodsp.getArchitecture() == null) ? "any" : getElementName(iodsp.getArchitecture()),
			   (iodsp.getCompiler() == null) ? "" : getElementName(iodsp.getCompiler()),
			   (iodsp.getMicroprocessor() == null) ? "any" : getElementName(iodsp.getMicroprocessor()),
			   (iodsp.getBoard() == null) ? "any" : getElementName(iodsp.getBoard()));
	}
	
	@Override
	public String getProperName(MServiceLibrarySupportedPlatform slsp)
	{
		if ((slsp.getOsapi() != null && slsp.getOsapi().eIsProxy() == true) ||
			(slsp.getOs() != null && slsp.getOs().eIsProxy() == true) ||
			(slsp.getArchitecture() != null && slsp.getArchitecture().eIsProxy() == true) ||
			(slsp.getCompiler() != null && slsp.getCompiler().eIsProxy() == true) ||
			(slsp.getMicroprocessor() != null && slsp.getMicroprocessor().eIsProxy() == true) ||
			(slsp.getBoard() != null && slsp.getBoard().eIsProxy() == true))
		{
			return null;
		}
		return StringHelper.toDefString(
			   (slsp.getOsapi() == null) ? "any" : getElementName(slsp.getOsapi()),
			   (slsp.getOs() == null) ? "any" : getElementName(slsp.getOs()),
			   (slsp.getArchitecture() == null) ? "any" : getElementName(slsp.getArchitecture()),
			   (slsp.getCompiler() == null) ? "" : getElementName(slsp.getCompiler()),
			   (slsp.getMicroprocessor() == null) ? "any" : getElementName(slsp.getMicroprocessor()),
			   (slsp.getBoard() == null) ? "any" : getElementName(slsp.getBoard()));
	}
	
	@Override
	public String getProperName(MComponentSupportedPlatform cmpsp)
	{
		if ((cmpsp.getOsapi() != null && cmpsp.getOsapi().eIsProxy() == true) ||
			(cmpsp.getOs() != null && cmpsp.getOs().eIsProxy() == true) ||
			(cmpsp.getArchitecture() != null && cmpsp.getArchitecture().eIsProxy() == true) ||
			(cmpsp.getCompiler() != null && cmpsp.getCompiler().eIsProxy() == true) ||
			(cmpsp.getMicroprocessor() != null && cmpsp.getMicroprocessor().eIsProxy() == true) ||
			(cmpsp.getBoard() != null && cmpsp.getBoard().eIsProxy() == true))
		{
			return null;
		}
		return StringHelper.toDefString(
			   (cmpsp.getOsapi() == null) ? "any" : getElementName(cmpsp.getOsapi()),
			   (cmpsp.getOs() == null) ? "any" : getElementName(cmpsp.getOs()),
			   (cmpsp.getArchitecture() == null) ? "any" : getElementName(cmpsp.getArchitecture()),
			   (cmpsp.getCompiler() == null) ? "" : getElementName(cmpsp.getCompiler()),
			   (cmpsp.getMicroprocessor() == null) ? "any" : getElementName(cmpsp.getMicroprocessor()),
			   (cmpsp.getBoard() == null) ? "any" : getElementName(cmpsp.getBoard()));
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

	@Override
	public String getProperName(MOSSupportedPlatform ossp) {
		return PDLStringHelper.getInstance().getProperName(ossp);
	}

	@Override
	public String getProperName(MPlatform platform) {
		return PDLStringHelper.getInstance().getProperName(platform);
	}
	
}
