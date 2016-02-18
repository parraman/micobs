package es.uah.aut.srg.micobs.lang.cpp_98.util;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import es.uah.aut.srg.micobs.system.MLanguage;


public class LangCPP_98BlackBoxUnit {

	@Operation(contextual = false, kind = Kind.HELPER)
	public static MLanguage getLanguageCPP_98()
	{
		return LangCPP_98Util.getLanguageCPP_98();
	}

}
