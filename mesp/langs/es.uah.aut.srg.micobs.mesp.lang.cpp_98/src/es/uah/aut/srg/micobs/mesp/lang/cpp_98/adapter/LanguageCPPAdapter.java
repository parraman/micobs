package es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter;

import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyPlatformSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwPackageProjectCreator;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapter;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl.EmptyOSSwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl.EmptyOSSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl.EmptyPlatformSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl.EmptySwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.adapter.impl.EmptySwPackageProjectCreator;

public class LanguageCPPAdapter extends LanguageAdapter {

	EmptySwPackageProjectCreator emptySwPackageProjectCreator;
	EmptyOSSwPackageProjectCreator emptyOSSwPackageProjectCreator;
	EmptyOSSwInterfaceRepositoryCreator emtpyOSSwInterfaceRepositoryCreator;
	EmptySwInterfaceRepositoryCreator emptySwInterfaceRepositoryCreator;
	EmptyPlatformSwPackageProjectCreator emptyPlatformSwPackageProjectCreator;
	
	@Override
	public boolean isAdapterForType(Object type) {
		if (type == IEmptySwPackageProjectCreator.class)
		{
			return true;
		}
		else if (type == IEmptySwInterfaceRepositoryCreator.class)
		{
			return true;
		}
		else if (type == IEmptyOSSwPackageProjectCreator.class)
		{
			return true;
		}
		else if (type == IEmptyOSSwInterfaceRepositoryCreator.class)
		{
			return true;
		}
		else if (type == IEmptyPlatformSwPackageProjectCreator.class)
		{
			return true;
		}
		return super.isAdapterForType(type);
	}

	@Override
	public Object adapt(Object type) {
		if (type == IEmptySwPackageProjectCreator.class)
		{
			if (emptySwPackageProjectCreator == null)
			{
				emptySwPackageProjectCreator = new EmptySwPackageProjectCreator();
			}
			return emptySwPackageProjectCreator;
		}
		else if (type == IEmptySwInterfaceRepositoryCreator.class)
		{
			if (emptySwInterfaceRepositoryCreator == null)
			{
				emptySwInterfaceRepositoryCreator = new EmptySwInterfaceRepositoryCreator();
			}
			return emptySwInterfaceRepositoryCreator;
		}
		else if (type == IEmptyOSSwPackageProjectCreator.class)
		{
			if (emptyOSSwPackageProjectCreator == null)
			{
				emptyOSSwPackageProjectCreator = new EmptyOSSwPackageProjectCreator();
			}
			return emptyOSSwPackageProjectCreator;
		}
		else if (type == IEmptyOSSwInterfaceRepositoryCreator.class)
		{
			if (emtpyOSSwInterfaceRepositoryCreator == null)
			{
				emtpyOSSwInterfaceRepositoryCreator = new EmptyOSSwInterfaceRepositoryCreator();
			}
			return emtpyOSSwInterfaceRepositoryCreator;
		}
		else if (type == IEmptyPlatformSwPackageProjectCreator.class)
		{
			if (emptyPlatformSwPackageProjectCreator == null)
			{
				emptyPlatformSwPackageProjectCreator = new EmptyPlatformSwPackageProjectCreator();
			}
			return emptyPlatformSwPackageProjectCreator;
		}
		return super.adapt(type);
	}

	
	
}
