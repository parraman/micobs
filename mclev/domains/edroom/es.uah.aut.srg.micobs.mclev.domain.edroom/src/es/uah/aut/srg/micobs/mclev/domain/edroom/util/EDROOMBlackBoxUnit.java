package es.uah.aut.srg.micobs.mclev.domain.edroom.util;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;


public class EDROOMBlackBoxUnit {

	@Operation(contextual = false, kind = Kind.HELPER)
	public static MIODomain getEDROOMDomain()
	{
		return EDROOMUtil.INSTANCE.getEDROOMDomain();
	}
	
	@Operation(contextual = false, kind = Kind.HELPER)
	public static MIODComponentType getEDROOMCPPComponentType()
	{
		return EDROOMUtil.INSTANCE.getEDROOMCPPComponentType();
	}
	
	@Operation(contextual = false, kind = Kind.HELPER)
	public static MPortType getEDROOMPort()
	{
		return EDROOMUtil.INSTANCE.getEDROOMPort();
	}
	
	@Operation(contextual = false, kind = Kind.HELPER)
	public static MConnector getEDROOMConnector()
	{
		return EDROOMUtil.INSTANCE.getEDROOMConnector();
	}
	
	@Operation(contextual = false, kind = Kind.HELPER)
	public static MMCLEVPackage getEDROOMPackage()
	{
		return EDROOMUtil.INSTANCE.getEDROOMPackage();
	}
	
}
