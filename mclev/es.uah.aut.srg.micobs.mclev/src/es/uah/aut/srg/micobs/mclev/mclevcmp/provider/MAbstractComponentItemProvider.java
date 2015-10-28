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
package es.uah.aut.srg.micobs.mclev.mclevcmp.provider;


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

import es.uah.aut.srg.micobs.common.commonFactory;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpFactory;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomFactory;
import es.uah.aut.srg.micobs.pdl.pdlFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent} object.
 * @generated
 */
public class MAbstractComponentItemProvider
	extends MMCLEVCMPPackageElementItemProvider
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
	public MAbstractComponentItemProvider(AdapterFactory adapterFactory) {
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

			addDomainPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addInheritsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAbstractComponent_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAbstractComponent_domain_feature", "_UI_MAbstractComponent_type"),
				 mclevcmpPackage.Literals.MABSTRACT_COMPONENT__DOMAIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAbstractComponent_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAbstractComponent_type_feature", "_UI_MAbstractComponent_type"),
				 mclevcmpPackage.Literals.MABSTRACT_COMPONENT__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_MAbstractComponent_inherits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAbstractComponent_inherits_feature", "_UI_MAbstractComponent_type"),
				 mclevcmpPackage.Literals.MABSTRACT_COMPONENT__INHERITS,
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
			childrenFeatures.add(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS);
			childrenFeatures.add(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES);
			childrenFeatures.add(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__EXTERNAL_PORTS);
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
	 * This returns MAbstractComponent.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MAbstractComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MAbstractComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MAbstractComponent_type") :
			getString("_UI_MAbstractComponent_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MAbstractComponent.class)) {
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
			case mclevcmpPackage.MABSTRACT_COMPONENT__ATTRIBUTES:
			case mclevcmpPackage.MABSTRACT_COMPONENT__EXTERNAL_PORTS:
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
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 commonFactory.eINSTANCE.createMParameterValueAssignmentSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVASwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMBooleanParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMStringParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMIntegerParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMEnumParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMRealParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMEnumParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMBooleanParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMStringParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMIntegerParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMEnumParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMRealParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMBooleanParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMStringParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMIntegerParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMEnumParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMRealParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMBooleanParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMStringParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMIntegerParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMEnumParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMRealParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__EXTERNAL_PORTS,
				 mclevcmpFactory.eINSTANCE.createMServerPort()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MABSTRACT_COMPONENT__EXTERNAL_PORTS,
				 mclevcmpFactory.eINSTANCE.createMClientPort()));
	}

}
