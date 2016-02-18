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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.EDROOMLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;


public class DCLASSJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/domain/edroom/edroomdclass"));
		return result;
	}

	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return EDROOMLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(EDROOMLibraryManager.getLibraryManager());
		return importLibraries;
	}

	/**
	 * Checks that there are no type definitions with the same name in a
	 * data class nor that there are duplicated field names nor that there are
	 * definitions and fields with the same name.
	 * 
	 * @param dclass the data class to check.
	 */
	@Check
	public void checkEDROOMDataClass_duplicatedNames(EDROOMDataClass dclass)
	{
		Set<String> defNames = new HashSet<String>();

		int i = 0;
		for (EDROOMDataDefinition definition : dclass.getDefinitions())
		{
			if (defNames.add(definition.getName()) == false)
			{
				error("Duplicated definition name: " +
					  definition.getName(),
					  edroomdclassPackage.eINSTANCE.getEDROOMDataClass_Definitions(), i);
			}
			i++;
		}

		Set<String> fieldNames = new HashSet<String>();
		i = 0;

		for (EDROOMDataField field : dclass.getFields())
		{
			if (defNames.contains(field.getName()) == true)
			{
				error("There is a type definition with the same name: " +
					  field.getName(),
					  edroomdclassPackage.eINSTANCE.getEDROOMDataClass_Fields(), i);
			}
			if (fieldNames.add(field.getName()) == false)
			{
				error("Duplicated field name: " +
					  field.getName(),
					  edroomdclassPackage.eINSTANCE.getEDROOMDataClass_Fields(), i);
			}
			i++;
		}
	}

}
