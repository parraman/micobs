package es.uah.aut.srg.micobs.mclev.xtext;

import org.eclipse.xtext.naming.QualifiedName;

import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.xtext.MICOBSQualifiedNameProvider;

public class MCLEVQualifiedNameProvider extends 
	MICOBSQualifiedNameProvider {
	
	public QualifiedName qualifiedName(MFlatMCADTarget target)
	{	
		if (MCLEVStringHelper.getDefault().getFullObjectNameToElement(target) == null)
		{
			return null;
		}
		return getConverter().toQualifiedName(MCLEVStringHelper.getDefault().getFullObjectNameToElement(target));
	}
	
}
