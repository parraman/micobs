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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;

/**
 * Abstract scope provider that defines common methods for generating the
 * scopes from a list of elements or referenceable objects.
 *
 */
public abstract class MICOBSAbstractScopeProvider extends
	AbstractDeclarativeScopeProvider {
	
	@Inject
	protected IQualifiedNameProvider qualifiedNameProvider;
	
	@Inject
	protected IQualifiedNameConverter qualifiedNameConverter;
	
	public IScope getFullElementScope(final MCommonPackageElement element) {
		return getFullElementScope(element, IScope.NULLSCOPE);
	}
	
	/**
	 * Provides a scope with a single element. The description used for the
	 * scope is the fully qualified name of the element.
	 * 
	 * @param element the element to be included in the scope.
	 * @param parentScope the parent scope of the scope that is being created.
	 * @return the new scope with the single element.
	 */
	public IScope getFullElementScope(MCommonPackageElement element, IScope parentScope) {
		
		if (element == null)
		{
			return parentScope;
		}
		
		Set<IEObjectDescription> descriptions = new HashSet<IEObjectDescription>();
		descriptions.add(EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(element), element));
		
		return new SimpleScope(parentScope, descriptions);
			
	}

	/**
	 * Returns a scope from a collection of model elements without including
	 * a parent scope.
	 * 
	 * @see #getFullElementScope(Collection, IScope)
	 * 
	 * @param elements the collection of model elements.
	 * @return the scope from the collection of model elements.
	 */
	public IScope getFullElementScope(final Collection<? extends MCommonPackageElement> elements) {
		return getFullElementScope(elements, IScope.NULLSCOPE);
	}
	
	/**
	 * Returns a scope from a collection of model elements and including a
	 * parent scope.
	 * 
	 * The description of the elements is their fully qualified name.
	 * 
	 * @param elements the collection of elements to be included in the scope.
	 * @param parentScope the parent scope.
	 * @return the scope from the collection of elements.
	 */
	public IScope getFullElementScope(final Collection<? extends MCommonPackageElement> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQNs = Iterables.transform(elements, new Function<MCommonPackageElement, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(MCommonPackageElement from) {
				return EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(from), from);
			}
		});
		
		return new SimpleScope(parentScope, fullQNs);
			
	}
		
	/**
	 * Returns a scope from a collection of model referenceable objects.
	 * 
	 * @see #getFullObjectScope(Collection, IScope)
	 * 
	 * @param elements the collection of referenceable objects to be included
	 * in the scope.
	 * @return the scope from the collection of elements.
	 */
	public IScope getFullObjectScope(final Collection<? extends MCommonReferenceableObj> elements) {
		return getFullObjectScope(elements, IScope.NULLSCOPE);
	}
	
	/**
	 * Returns a scope from a collection of model referenceable objects and including
	 * a parent scope.
	 * 
	 * The description of the objects is their fully qualified name.
	 * 
	 * @param elements the collection of referenceable objects to be included
	 * in the scope.
	 * @param parentScope the parent scope.
	 * @return the scope from the collection of elements.
	 */
	public IScope getFullObjectScope(final Collection<? extends MCommonReferenceableObj> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(elements, new Function<MCommonReferenceableObj, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(MCommonReferenceableObj from) {
				return EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(from), from);
			}
		});
		
		return new SimpleScope(parentScope, fullQN);		
	}
	
	/**
	 * Returns a scope from a collection of model referenceable objects.
	 * 
	 * @see #getRelativeObjectScope(Collection, IScope)
	 * 
	 * @param elements the collection of referenceable objects to be included
	 * in the scope.
	 * @return the scope from the collection of elements.
	 */
	public IScope getRelativeObjectScope(final Collection<? extends MCommonReferenceableObj> elements) {
		return getRelativeObjectScope(elements, IScope.NULLSCOPE);
	}
	
	/**
	 * Returns a scope from a collection of model referenceable objects and including
	 * a parent scope.
	 * 
	 * The description of the objects is their name, prefixed by all the list of
	 * containing objects up to the container element's name but without including it.
	 * 
	 * @param elements the collection of referenceable objects to be included
	 * in the scope.
	 * @param parentScope the parent scope.
	 * @return the scope from the collection of elements.
	 */
	public IScope getRelativeObjectScope(final Collection<? extends MCommonReferenceableObj> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(elements, new Function<MCommonReferenceableObj, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(MCommonReferenceableObj from) {
				String name = MICOBSStringHelper.getInstance().getPartialObjectNameToElement(from, 0);
				if (name == null)
				{
					return null;
				}
				return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(name), from);
			}
		});

		
		return new SimpleScope(parentScope, Iterables.filter(fullQN, Predicates.notNull()));		
	}

	/**
	 * Returns a scope from a collection of model referenceable objects.
	 * 
	 * @see #getSimpleObjectScope(Collection, IScope)
	 * 
	 * @param elements the collection of referenceable objects to be included
	 * in the scope.
	 * @return the scope from the collection of elements.
	 */
	public IScope getSimpleObjectScope(final Collection<? extends MCommonReferenceableObj> elements) {
		return getSimpleObjectScope(elements, IScope.NULLSCOPE);
		
	}
	
	/**
	 * Returns a scope from a collection of model referenceable objects and including
	 * a parent scope.
	 * 
	 * The description of the objects is only their name.
	 * 
	 * @param elements the collection of referenceable objects to be included
	 * in the scope.
	 * @param parentScope the parent scope.
	 * @return the scope from the collection of elements.
	 */
	public IScope getSimpleObjectScope(final Collection<? extends MCommonReferenceableObj> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(elements, new Function<MCommonReferenceableObj, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(MCommonReferenceableObj from) {
				if (from.getName() == null)
				{
					return null;
				}
				return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(from.getName()), from);
			}
		});
	
		return new SimpleScope(parentScope, Iterables.filter(fullQN, Predicates.notNull()));		
	}

}
