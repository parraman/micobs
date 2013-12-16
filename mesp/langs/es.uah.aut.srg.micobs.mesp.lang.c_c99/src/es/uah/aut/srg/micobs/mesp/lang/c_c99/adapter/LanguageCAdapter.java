/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter;

import es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl.EmptyOSSwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl.EmptyOSSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl.EmptyPlatformSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl.EmptySwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.c_c99.adapter.impl.EmptySwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyPlatformSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwPackageProjectCreator;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapter;

/**
 * Default implementation of the adapter for the C(C99) language.
 *
 */
public class LanguageCAdapter extends LanguageAdapter {

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
		else if (type == IEmptyPlatformSwPackageProjectCreator.class)
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
		else if (type == IEmptyPlatformSwPackageProjectCreator.class)
		{
			if (emptyPlatformSwPackageProjectCreator == null)
			{
				emptyPlatformSwPackageProjectCreator = new EmptyPlatformSwPackageProjectCreator();
			}
			return emptyPlatformSwPackageProjectCreator;
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
		return super.adapt(type);
	}

	
	
}
