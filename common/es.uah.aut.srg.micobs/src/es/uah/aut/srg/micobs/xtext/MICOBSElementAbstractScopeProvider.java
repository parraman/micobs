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
package es.uah.aut.srg.micobs.xtext;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * Class that provides scoping methods for common model elements, such as
 * languages, and for resolving the importing packages references.
 *
 */
public abstract class MICOBSElementAbstractScopeProvider extends
	MICOBSAbstractScopeProvider {

	public MICOBSElementAbstractScopeProvider() {
		super();
	}

	public abstract ILibraryManager getFileLibraryManager()
			throws LibraryManagerException;

	public abstract Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException;

	public IScope scope_MLanguage(final MCommonPackageFile file, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = file.getImports();
		final MCommonPackage elementPackage = file.getPackage();
		
		try {
			elements = SystemLibraryManager.getLibraryManager().
						getElementsOfClass(imports, systemPackage.eINSTANCE.getMLanguage());
			elements.addAll(SystemLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, systemPackage.eINSTANCE.getMLanguage()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	public IScope scope_MCommonPackageFile_package(final MCommonPackageFile file, EReference pack) {
		Collection<MCommonPackage> packageList = null;
		try {
			packageList = getFileLibraryManager().getAllPackages();
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
			return IScope.NULLSCOPE;
		}
	
		Iterable<IEObjectDescription> descriptions = Iterables.transform(packageList, new Function<MCommonPackage, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(MCommonPackage from) {
				return EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(from), from);
			}
		});
		
		return new SimpleScope(IScope.NULLSCOPE, Iterables.filter(descriptions, Predicates.notNull()));
	}

	public IScope scope_MCommonPackageFile_imports(final MCommonPackageFile packageFile, EReference imports) {
		Iterable<IEObjectDescription> descriptions = null;
		
		try {
			
			descriptions = Iterables.concat(
					Iterables.transform(getImportLibraryManagers(), new Function<ILibraryManager, Iterable<IEObjectDescription>>(){
						@Override
						public Iterable<IEObjectDescription> apply(ILibraryManager from) {
							
							return 	Iterables.transform(from.getAllPackages(), 
									new Function<MCommonPackage, IEObjectDescription>(){
								
								@Override
								public IEObjectDescription apply(MCommonPackage from) {
									return EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(from), from);
								}
							});
						
						}					
					}));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		return new SimpleScope(IScope.NULLSCOPE, Iterables.filter(descriptions, Predicates.notNull()));
	}

	
}