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
package es.uah.aut.srg.micobs.mclev.mclevslib.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.uah.aut.srg.micobs.common.provider.MRealParameterItemProvider;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibFactory;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch} object.
 * @generated
 */
public class MRealParamSLSPSwitchItemProvider
	extends MRealParameterItemProvider
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
	public MRealParamSLSPSwitchItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(mclevslibPackage.Literals.MPARAMETER_SLSP_SWITCH__CASES);
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
	 * This returns MRealParamSLSPSwitch.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MRealParamSLSPSwitch"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MRealParamSLSPSwitch)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MRealParamSLSPSwitch_type") :
			getString("_UI_MRealParamSLSPSwitch_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MRealParamSLSPSwitch.class)) {
			case mclevslibPackage.MREAL_PARAM_SLSP_SWITCH__CASES:
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
				(mclevslibPackage.Literals.MPARAMETER_SLSP_SWITCH__CASES,
				 mclevslibFactory.eINSTANCE.createMBooleanParamSLSPSwitchCase()));

		newChildDescriptors.add
			(createChildParameter
				(mclevslibPackage.Literals.MPARAMETER_SLSP_SWITCH__CASES,
				 mclevslibFactory.eINSTANCE.createMStringParamSLSPSwitchCase()));

		newChildDescriptors.add
			(createChildParameter
				(mclevslibPackage.Literals.MPARAMETER_SLSP_SWITCH__CASES,
				 mclevslibFactory.eINSTANCE.createMIntegerParamSLSPSwitchCase()));

		newChildDescriptors.add
			(createChildParameter
				(mclevslibPackage.Literals.MPARAMETER_SLSP_SWITCH__CASES,
				 mclevslibFactory.eINSTANCE.createMEnumParamSLSPSwitchCase()));

		newChildDescriptors.add
			(createChildParameter
				(mclevslibPackage.Literals.MPARAMETER_SLSP_SWITCH__CASES,
				 mclevslibFactory.eINSTANCE.createMRealParamSLSPSwitchCase()));
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