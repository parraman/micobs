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
import org.eclipse.emf.common.util.ResourceLocator;
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
import es.uah.aut.srg.micobs.common.provider.MCommonReferenceableObjItemProvider;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpFactory;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomFactory;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.pdl.pdlFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform} object.
 * @generated
 */
public class MComponentSupportedPlatformItemProvider
	extends MCommonReferenceableObjItemProvider
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
	public MComponentSupportedPlatformItemProvider(AdapterFactory adapterFactory) {
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

			addOsapiPropertyDescriptor(object);
			addOsPropertyDescriptor(object);
			addArchitecturePropertyDescriptor(object);
			addCompilerPropertyDescriptor(object);
			addMicroprocessorPropertyDescriptor(object);
			addBoardPropertyDescriptor(object);
			addRequiresPropertyDescriptor(object);
			addLanguagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Osapi feature.
	 * @generated
	 */
	protected void addOsapiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_osapi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_osapi_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__OSAPI,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Os feature.
	 * @generated
	 */
	protected void addOsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_os_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_os_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__OS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Architecture feature.
	 * @generated
	 */
	protected void addArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_architecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_architecture_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ARCHITECTURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compiler feature.
	 * @generated
	 */
	protected void addCompilerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_compiler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_compiler_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__COMPILER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Microprocessor feature.
	 * @generated
	 */
	protected void addMicroprocessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_microprocessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_microprocessor_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__MICROPROCESSOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Board feature.
	 * @generated
	 */
	protected void addBoardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_board_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_board_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__BOARD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requires feature.
	 * @generated
	 */
	protected void addRequiresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_requires_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_requires_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__REQUIRES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Languages feature.
	 * @generated
	 */
	protected void addLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MComponentSupportedPlatform_languages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MComponentSupportedPlatform_languages_feature", "_UI_MComponentSupportedPlatform_type"),
				 mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__LANGUAGES,
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
			childrenFeatures.add(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS);
			childrenFeatures.add(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__INTERNAL_COMPONENTS);
			childrenFeatures.add(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__CONNECTIONS);
			childrenFeatures.add(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES);
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
	 * This returns MComponentSupportedPlatform.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MComponentSupportedPlatform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MComponentSupportedPlatform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MComponentSupportedPlatform_type") :
			getString("_UI_MComponentSupportedPlatform_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MComponentSupportedPlatform.class)) {
			case mclevcmpPackage.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS:
			case mclevcmpPackage.MCOMPONENT_SUPPORTED_PLATFORM__INTERNAL_COMPONENTS:
			case mclevcmpPackage.MCOMPONENT_SUPPORTED_PLATFORM__CONNECTIONS:
			case mclevcmpPackage.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES:
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
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 commonFactory.eINSTANCE.createMParameterValueAssignmentSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVASwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__INTERNAL_COMPONENTS,
				 mclevcmpFactory.eINSTANCE.createMInternalComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__CONNECTIONS,
				 mclevcmpFactory.eINSTANCE.createMInternalComponentConnection()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMBooleanParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMStringParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMIntegerParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMEnumParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevcmpFactory.eINSTANCE.createMRealParamCSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMEnumParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMBooleanParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMStringParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMIntegerParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMEnumParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 commonFactory.eINSTANCE.createMRealParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMBooleanParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMStringParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMIntegerParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMEnumParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 mclevdomFactory.eINSTANCE.createMRealParamIODSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMBooleanParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMStringParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMIntegerParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMEnumParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevcmpPackage.Literals.MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES,
				 pdlFactory.eINSTANCE.createMRealParamOSSPSwitch()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MCLEVPlugin.INSTANCE;
	}

}
