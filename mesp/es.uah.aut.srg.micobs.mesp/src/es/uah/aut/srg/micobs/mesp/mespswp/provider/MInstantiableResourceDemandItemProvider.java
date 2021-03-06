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
package es.uah.aut.srg.micobs.mesp.mespswp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.uah.aut.srg.micobs.common.commonFactory;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.pdlFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand} object.
 * @generated
 */
public class MInstantiableResourceDemandItemProvider
	extends MResourceDemandItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * @generated
	 */
	public MInstantiableResourceDemandItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCommonReferenceableObj_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCommonReferenceableObj_name_feature", "_UI_MCommonReferenceableObj_type"),
				 commonPackage.Literals.MCOMMON_REFERENCEABLE_OBJ__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MCommonReferenceableObj_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MCommonReferenceableObj_description_feature", "_UI_MCommonReferenceableObj_type"),
				 commonPackage.Literals.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MInstantiableResourceDemand_resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MInstantiableResourceDemand_resource_feature", "_UI_MInstantiableResourceDemand_type"),
				 mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MInstantiableResourceDemand.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MInstantiableResourceDemand"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MInstantiableResourceDemand)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MInstantiableResourceDemand_type") :
			getString("_UI_MInstantiableResourceDemand_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MInstantiableResourceDemand.class)) {
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__NAME:
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS,
				 mespswpFactory.eINSTANCE.createMSwPackageProvidedInterfacePVASwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS,
				 mespswpFactory.eINSTANCE.createMSwPackageProvidedInterfacePVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS,
				 commonFactory.eINSTANCE.createMParameterValueAssignmentSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVASwitch()));
	}

}
