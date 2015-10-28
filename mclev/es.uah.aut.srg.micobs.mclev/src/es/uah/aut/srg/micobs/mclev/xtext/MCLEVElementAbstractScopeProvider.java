package es.uah.aut.srg.micobs.mclev.xtext;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

public abstract class MCLEVElementAbstractScopeProvider extends
		MICOBSElementAbstractScopeProvider {

	public IScope getRelativeMFlatMCADTargetScope(final Collection<MFlatMCADTarget> elements) {
		return getRelativeMFlatMCADTargetScope(elements, IScope.NULLSCOPE);	
	}
	
	public IScope getRelativeMFlatMCADTargetScope(final Collection<MFlatMCADTarget> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(elements, new Function<MFlatMCADTarget, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(MFlatMCADTarget from) {
				if (MCLEVStringHelper.getDefault().getRelativeObjectName(from) == null)
				{
					return null;
				}
				return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(MCLEVStringHelper.getDefault().getRelativeObjectName(from)), from);
			}
		});

		return new SimpleScope(parentScope, Iterables.filter(fullQN, Predicates.notNull()));
	}
	
	/**
	 * Returns the complete set of parameters defined by the different platform
	 * elements attached to a given service library supported platform.
	 * 
	 * @param slibsp the service library supported platform.
	 * @return the set of parameters.
	 */
	protected Set<MParameter> getAllPlatformParameters(MServiceLibrarySupportedPlatform slibsp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		if (slibsp.getOsapi() != null &&
			slibsp.getOsapi().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllParameters(slibsp.getOsapi()));
		}
		if (slibsp.getOs() != null &&
			slibsp.getOs().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllParameters(slibsp.getOs()));
		}
		if (slibsp.getArchitecture() != null &&
			slibsp.getArchitecture().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllParameters(slibsp.getArchitecture()));
		}
		if (slibsp.getCompiler() != null &&
			slibsp.getCompiler().eIsProxy() == false)
		{
			if (slibsp.getArchitecture() != null &&
					slibsp.getArchitecture().eIsProxy() == false)
			{
				params.addAll(MCLEVUtil.getDefault().getAllParameters(slibsp.getCompiler()));
			}
			else
			{
				params.addAll(MCLEVUtil.getDefault().getAllParameters(slibsp.getCompiler(), slibsp.getArchitecture()));
			}
		}
		if (slibsp.getMicroprocessor() != null &&
			slibsp.getMicroprocessor().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getParameters(slibsp.getMicroprocessor()));
		}
		if (slibsp.getBoard() != null &&
			slibsp.getBoard().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getParameters(slibsp.getBoard()));
		}
		
		return params;
	}
	
	/**
	 * Returns the complete set of parameters defined by the different platform
	 * elements attached to a given component supported platform.
	 * 
	 * @param csp the service library supported platform.
	 * @return the set of parameters.
	 */
	protected Set<MParameter> getAllPlatformParameters(MComponentSupportedPlatform csp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		if (csp.getOsapi() != null &&
			csp.getOsapi().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllParameters(csp.getOsapi()));
		}
		if (csp.getOs() != null &&
			csp.getOs().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllParameters(csp.getOs()));
		}
		if (csp.getArchitecture() != null &&
			csp.getArchitecture().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllParameters(csp.getArchitecture()));
		}
		if (csp.getCompiler() != null &&
			csp.getCompiler().eIsProxy() == false)
		{
			if (csp.getArchitecture() != null &&
					csp.getArchitecture().eIsProxy() == false)
			{
				params.addAll(MCLEVUtil.getDefault().getAllParameters(csp.getCompiler()));
			}
			else
			{
				params.addAll(MCLEVUtil.getDefault().getAllParameters(csp.getCompiler(), csp.getArchitecture()));
			}
		}
		if (csp.getMicroprocessor() != null &&
			csp.getMicroprocessor().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getParameters(csp.getMicroprocessor()));
		}
		if (csp.getBoard() != null &&
			csp.getBoard().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getParameters(csp.getBoard()));
		}
		
		return params;
	}
	
}
