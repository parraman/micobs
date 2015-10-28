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
package es.uah.aut.srg.micobs.mclev.mclevdom.provider;


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
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.pdl.pdlFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain} object.
 * @generated
 */
public class MDomainItemProvider
	extends MMCLEVDOMPackageElementItemProvider
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
	public MDomainItemProvider(AdapterFactory adapterFactory) {
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

			addAllowsSingletonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allows Singleton feature.
	 * @generated
	 */
	protected void addAllowsSingletonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDomain_allowsSingleton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDomain_allowsSingleton_feature", "_UI_MDomain_type"),
				 mclevdomPackage.Literals.MDOMAIN__ALLOWS_SINGLETON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES);
			childrenFeatures.add(mclevdomPackage.Literals.MDOMAIN__PORT_TYPES);
			childrenFeatures.add(mclevdomPackage.Literals.MDOMAIN__INTERFACE_TYPES);
			childrenFeatures.add(mclevdomPackage.Literals.MDOMAIN__CONNECTORS);
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
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MDomain)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MDomain_type") :
			getString("_UI_MDomain_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MDomain.class)) {
			case mclevdomPackage.MDOMAIN__ALLOWS_SINGLETON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case mclevdomPackage.MDOMAIN__ATTRIBUTES:
			case mclevdomPackage.MDOMAIN__PORT_TYPES:
			case mclevdomPackage.MDOMAIN__INTERFACE_TYPES:
			case mclevdomPackage.MDOMAIN__CONNECTORS:
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
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMBooleanParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMStringParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMIntegerParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMEnumParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMRealParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMEnumParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMBooleanParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMStringParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMIntegerParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMEnumParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMRealParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMBooleanParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMStringParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMIntegerParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMEnumParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMRealParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__PORT_TYPES,
				 mclevdomFactory.eINSTANCE.createMPortType()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__INTERFACE_TYPES,
				 mclevdomFactory.eINSTANCE.createMInterfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(mclevdomPackage.Literals.MDOMAIN__CONNECTORS,
				 mclevdomFactory.eINSTANCE.createMConnector()));
	}

}