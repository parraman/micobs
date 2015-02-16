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


import es.uah.aut.srg.micobs.common.commonFactory;

import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

import es.uah.aut.srg.micobs.pdl.pdlFactory;

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

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MDriverSwPackageItemProvider
	extends MMESPSWPPackageElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDriverSwPackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInheritsPropertyDescriptor(object);
			addExtendsPropertyDescriptor(object);
			addLanguagesPropertyDescriptor(object);
			addCtoolsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inherits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MAbstractSwPackage_inherits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MAbstractSwPackage_inherits_feature", "_UI_MAbstractSwPackage_type"),
				 mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__INHERITS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MSwPackage_extends_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MSwPackage_extends_feature", "_UI_MSwPackage_type"),
				 mespswpPackage.Literals.MSW_PACKAGE__EXTENDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Languages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MSwPackage_languages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MSwPackage_languages_feature", "_UI_MSwPackage_type"),
				 mespswpPackage.Literals.MSW_PACKAGE__LANGUAGES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ctools feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCtoolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MSwPackage_ctools_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MSwPackage_ctools_feature", "_UI_MSwPackage_type"),
				 mespswpPackage.Literals.MSW_PACKAGE__CTOOLS,
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PROVIDES);
			childrenFeatures.add(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS);
			childrenFeatures.add(mespswpPackage.Literals.MSW_PACKAGE__REQUIRES);
			childrenFeatures.add(mespswpPackage.Literals.MSW_PACKAGE__SUPPORTED_PLATFORMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MDriverSwPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MDriverSwPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MDriverSwPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MDriverSwPackage_type") :
			getString("_UI_MDriverSwPackage_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MDriverSwPackage.class)) {
			case mespswpPackage.MDRIVER_SW_PACKAGE__PROVIDES:
			case mespswpPackage.MDRIVER_SW_PACKAGE__PARAMETERS:
			case mespswpPackage.MDRIVER_SW_PACKAGE__REQUIRES:
			case mespswpPackage.MDRIVER_SW_PACKAGE__SUPPORTED_PLATFORMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PROVIDES,
				 mespswpFactory.eINSTANCE.createMSwPackageProvidedInterface()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 mespswpFactory.eINSTANCE.createMBooleanParamSWPSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 mespswpFactory.eINSTANCE.createMStringParamSWPSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 mespswpFactory.eINSTANCE.createMIntegerParamSWPSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 mespswpFactory.eINSTANCE.createMEnumParamSWPSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 mespswpFactory.eINSTANCE.createMRealParamSWPSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 commonFactory.eINSTANCE.createMEnumParameterDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 commonFactory.eINSTANCE.createMBooleanParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 commonFactory.eINSTANCE.createMStringParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 commonFactory.eINSTANCE.createMIntegerParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 commonFactory.eINSTANCE.createMEnumParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 commonFactory.eINSTANCE.createMRealParameterSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 pdlFactory.eINSTANCE.createMBooleanParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 pdlFactory.eINSTANCE.createMStringParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 pdlFactory.eINSTANCE.createMIntegerParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 pdlFactory.eINSTANCE.createMEnumParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MABSTRACT_SW_PACKAGE__PARAMETERS,
				 pdlFactory.eINSTANCE.createMRealParamOSSPSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MSW_PACKAGE__REQUIRES,
				 mespswpFactory.eINSTANCE.createMSwPackageRequiredInterface()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MSW_PACKAGE__SUPPORTED_PLATFORMS,
				 mespswpFactory.eINSTANCE.createMSwPackageSupportedPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(mespswpPackage.Literals.MSW_PACKAGE__SUPPORTED_PLATFORMS,
				 mespswpFactory.eINSTANCE.createMDriverSwPackageSupportedPlatform()));
	}

}
