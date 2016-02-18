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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass} object.
 * @generated
 */
public class EDROOMDataClassItemProvider
	extends EDROOMDCLASSPackageElementItemProvider
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
	public EDROOMDataClassItemProvider(AdapterFactory adapterFactory) {
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

			addInheritsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inherits feature.
	 * @generated
	 */
	protected void addInheritsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EDROOMDataClass_inherits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EDROOMDataClass_inherits_feature", "_UI_EDROOMDataClass_type"),
				 edroomdclassPackage.Literals.EDROOM_DATA_CLASS__INHERITS,
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
			childrenFeatures.add(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS);
			childrenFeatures.add(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__DEFINITIONS);
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
	 * This returns EDROOMDataClass.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EDROOMDataClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EDROOMDataClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EDROOMDataClass_type") :
			getString("_UI_EDROOMDataClass_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EDROOMDataClass.class)) {
			case edroomdclassPackage.EDROOM_DATA_CLASS__FIELDS:
			case edroomdclassPackage.EDROOM_DATA_CLASS__DEFINITIONS:
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
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldBasic()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldBasicArray()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldClass()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldClassArray()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldUnion()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldUnionArray()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldEnum()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__FIELDS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataFieldEnumArray()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__DEFINITIONS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataDefinitionUnion()));

		newChildDescriptors.add
			(createChildParameter
				(edroomdclassPackage.Literals.EDROOM_DATA_CLASS__DEFINITIONS,
				 edroomdclassFactory.eINSTANCE.createEDROOMDataDefinitionEnum()));
	}

}
