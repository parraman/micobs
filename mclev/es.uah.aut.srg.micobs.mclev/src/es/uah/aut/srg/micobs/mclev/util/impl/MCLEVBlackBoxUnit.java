package es.uah.aut.srg.micobs.mclev.util.impl;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.util.StringValue;

public class MCLEVBlackBoxUnit {
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean parseBooleanExpression(final MParameterValueExpression self, 
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform)
	{
		return MCLEVUtil.getDefault().parseBooleanExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static StringValue parseStringExpression(final MParameterValueExpression self, 
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform)
	{
		return MCLEVUtil.getDefault().parseStringExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Long parseIntegerExpression(final MParameterValueExpression self, 
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform)
	{
		return MCLEVUtil.getDefault().parseIntegerExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Float parseRealExpression(final MParameterValueExpression self, 
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform)
	{
		return MCLEVUtil.getDefault().parseRealExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MEnumParameterLiteral parseEnumExpression(final MParameterValueExpression self, 
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform)
	{
		return MCLEVUtil.getDefault().parseEnumExpression(self, assignments);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MInternalComponentInstance> getInternalInstances(MComponent component, MPlatform platform) {
		return MCLEVUtil.getDefault().getInternalInstances(component, platform);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MConnection> getAllConnections(MDeploymentAlternative alternative) {
		return MCLEVUtil.getDefault().getAllConnections(alternative);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MComponentInstance> getAllComponentInstances(MDeploymentAlternative alternative) {
		return MCLEVUtil.getDefault().getAllComponentInstances(alternative);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MComponent> getAllInternalComponents(MComponent component, Collection<MPlatform> platforms) {
		return MCLEVUtil.getDefault().getAllInternalComponents(component, platforms);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MParameterValueAssignment copy(MParameterValueAssignment src)
	{
		return EcoreUtil.copy(src);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MParameterValueExpression getParameterValue(MParameterValueAssignment assignment)
	{
		return MCLEVUtil.getDefault().getParameterValue(assignment);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MLanguage getLanguage(String uri, String version)
	{
		return MCLEVUtil.getDefault().getLanguage(uri, version);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getElementName(MCommonPackageElement element)
	{
		return MCLEVStringHelper.getDefault().getElementName(element);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElement(MCommonReferenceableObj object)
	{
		return MCLEVStringHelper.getDefault().getFullObjectNameToElement(object);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getRelativeObjectName(MCommonReferenceableObj object)
	{
		return MCLEVStringHelper.getDefault().getRelativeObjectName(object);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toDefString(String string)
	{
		return MCLEVStringHelper.getDefault().toDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toLowerDefString(String string)
	{
		return MCLEVStringHelper.getDefault().toLowerDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toUpperDefString(String string)
	{
		return MCLEVStringHelper.getDefault().toUpperDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String toPlainString(Float val)
	{
		return MCLEVStringHelper.getDefault().toPlainString(val);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElementWithoutVersion(MCommonReferenceableObj object)
	{
		return MCLEVStringHelper.getDefault().getFullObjectNameToElementWithoutVersion(object);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static MComponentSupportedPlatform getMatchingPlatform(final MComponent self, MPlatform platform)
	{
		return MCLEVUtil.getDefault().getMatchingPlatform(self, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MServiceLibrarySupportedPlatform getMatchingPlatform(final MServiceLibrary self, MPlatform platform)
	{
		return MCLEVUtil.getDefault().getMatchingPlatform(self, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean matchesPlatform(final MComponentSupportedPlatform self, MPlatform platform)
	{
		return MCLEVUtil.getDefault().matchesPlatform(self, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean matchesPlatform(final MServiceLibrarySupportedPlatform self, MPlatform platform)
	{
		return MCLEVUtil.getDefault().matchesPlatform(self, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MDeploymentAlternative> getLeafDeploymentAlternatives(final MMCADeployment self)
	{
		return MCLEVUtil.getDefault().getLeafDeploymentAlternatives(self);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MServiceLibraryInstance> getAllServiceLibraryInstances(final MDeploymentAlternative self)
	{
		return MCLEVUtil.getDefault().getAllServiceLibraryInstances(self);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameterValueAssignment> getAllAttributeValueAssignments(final MServiceLibraryInstance self)
	{
		return MCLEVUtil.getDefault().getAllAttributeValueAssignments(self);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MDeviceDriverMapping> getAllDriverMappings(MDriverSLibInstance self)
	{
		return MCLEVUtil.getDefault().getAllDriverMappings(self);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MParameterValueExpression getParameterValue(MParameterValueAssignment self, MPlatform platform)
	{
		return MCLEVUtil.getDefault().getParameterValue(self, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MParameterValueExpression getDefaultValue(MParameter self, MPlatform platform)
	{
		return MCLEVUtil.getDefault().getDefaultValue(self, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MInterface getInterface(String uri, String version)
	{
		return MCLEVUtil.getDefault().getInterface(uri, version);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MSAI getSAI(String uri, String version)
	{
		return MCLEVUtil.getDefault().getSAI(uri, version);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MComponent getComponent(String uri, String version)
	{
		return MCLEVUtil.getDefault().getComponent(uri, version);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MMCLEVPackage getMCLEVPackage(String uri)
	{
		return MCLEVUtil.getDefault().getMCLEVPackage(uri);
	}

}
