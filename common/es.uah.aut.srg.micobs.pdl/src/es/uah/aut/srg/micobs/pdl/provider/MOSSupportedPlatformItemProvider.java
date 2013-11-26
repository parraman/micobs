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
package es.uah.aut.srg.micobs.pdl.provider;


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
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform} object.
 * @generated
 */
public class MOSSupportedPlatformItemProvider
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
	public MOSSupportedPlatformItemProvider(AdapterFactory adapterFactory) {
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

			addArchitecturePropertyDescriptor(object);
			addCompilerPropertyDescriptor(object);
			addMicroprocessorPropertyDescriptor(object);
			addBoardPropertyDescriptor(object);
			addLanguagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MOSSupportedPlatform_architecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MOSSupportedPlatform_architecture_feature", "_UI_MOSSupportedPlatform_type"),
				 pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__ARCHITECTURE,
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
				 getString("_UI_MOSSupportedPlatform_compiler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MOSSupportedPlatform_compiler_feature", "_UI_MOSSupportedPlatform_type"),
				 pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__COMPILER,
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
				 getString("_UI_MOSSupportedPlatform_microprocessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MOSSupportedPlatform_microprocessor_feature", "_UI_MOSSupportedPlatform_type"),
				 pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__MICROPROCESSOR,
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
				 getString("_UI_MOSSupportedPlatform_board_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MOSSupportedPlatform_board_feature", "_UI_MOSSupportedPlatform_type"),
				 pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__BOARD,
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
				 getString("_UI_MOSSupportedPlatform_languages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MOSSupportedPlatform_languages_feature", "_UI_MOSSupportedPlatform_type"),
				 pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__LANGUAGES,
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
			childrenFeatures.add(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS);
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
	 * This returns MOSSupportedPlatform.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MOSSupportedPlatform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MOSSupportedPlatform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MOSSupportedPlatform_type") :
			getString("_UI_MOSSupportedPlatform_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MOSSupportedPlatform.class)) {
			case pdlPackage.MOS_SUPPORTED_PLATFORM__PARAMETERS:
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
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 pdlFactory.eINSTANCE.createMBooleanParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 pdlFactory.eINSTANCE.createMStringParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 pdlFactory.eINSTANCE.createMIntegerParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 pdlFactory.eINSTANCE.createMEnumParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 pdlFactory.eINSTANCE.createMRealParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 commonFactory.eINSTANCE.createMEnumParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 commonFactory.eINSTANCE.createMBooleanParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 commonFactory.eINSTANCE.createMStringParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 commonFactory.eINSTANCE.createMIntegerParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 commonFactory.eINSTANCE.createMEnumParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(pdlPackage.Literals.MOS_SUPPORTED_PLATFORM__PARAMETERS,
				 commonFactory.eINSTANCE.createMRealParameterSingleExpression()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PDLPlugin.INSTANCE;
	}

}
