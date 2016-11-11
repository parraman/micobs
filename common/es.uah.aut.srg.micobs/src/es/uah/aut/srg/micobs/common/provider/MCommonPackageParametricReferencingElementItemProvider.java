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
package es.uah.aut.srg.micobs.common.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement} object.
 * @generated
 */
public class MCommonPackageParametricReferencingElementItemProvider
	extends MCommonPackageElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * @generated
	 */
	public MCommonPackageParametricReferencingElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReferencedElementPropertyDescriptor(object);
			addParameterElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Referenced Element feature.
	 * @generated
	 */
	protected void addReferencedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCommonPackageParametricReferencingElement_referencedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCommonPackageParametricReferencingElement_referencedElement_feature", "_UI_MCommonPackageParametricReferencingElement_type"),
				 commonPackage.Literals.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter Element feature.
	 * @generated
	 */
	protected void addParameterElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCommonPackageParametricReferencingElement_parameterElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCommonPackageParametricReferencingElement_parameterElement_feature", "_UI_MCommonPackageParametricReferencingElement_type"),
				 commonPackage.Literals.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns MCommonPackageParametricReferencingElement.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MCommonPackageParametricReferencingElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MCommonPackageParametricReferencingElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MCommonPackageParametricReferencingElement_type") :
			getString("_UI_MCommonPackageParametricReferencingElement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
