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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import es.uah.aut.srg.micobs.mclev.mclevflatmcad.util.mclevflatmcadAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * @generated
 */
public class mclevflatmcadItemProviderAdapterFactory extends mclevflatmcadAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * @generated
	 */
	public mclevflatmcadItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD} instances.
	 * @generated
	 */
	protected MFlatMCADItemProvider mFlatMCADItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD}.
	 * @generated
	 */
	@Override
	public Adapter createMFlatMCADAdapter() {
		if (mFlatMCADItemProvider == null) {
			mFlatMCADItemProvider = new MFlatMCADItemProvider(this);
		}

		return mFlatMCADItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget} instances.
	 * @generated
	 */
	protected MFlatMCADTargetItemProvider mFlatMCADTargetItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget}.
	 * @generated
	 */
	@Override
	public Adapter createMFlatMCADTargetAdapter() {
		if (mFlatMCADTargetItemProvider == null) {
			mFlatMCADTargetItemProvider = new MFlatMCADTargetItemProvider(this);
		}

		return mFlatMCADTargetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance} instances.
	 * @generated
	 */
	protected MFlatServiceLibraryInstanceItemProvider mFlatServiceLibraryInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance}.
	 * @generated
	 */
	@Override
	public Adapter createMFlatServiceLibraryInstanceAdapter() {
		if (mFlatServiceLibraryInstanceItemProvider == null) {
			mFlatServiceLibraryInstanceItemProvider = new MFlatServiceLibraryInstanceItemProvider(this);
		}

		return mFlatServiceLibraryInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance} instances.
	 * @generated
	 */
	protected MFlatDriverSLibInstanceItemProvider mFlatDriverSLibInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance}.
	 * @generated
	 */
	@Override
	public Adapter createMFlatDriverSLibInstanceAdapter() {
		if (mFlatDriverSLibInstanceItemProvider == null) {
			mFlatDriverSLibInstanceItemProvider = new MFlatDriverSLibInstanceItemProvider(this);
		}

		return mFlatDriverSLibInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance} instances.
	 * @generated
	 */
	protected MFlatComponentInstanceItemProvider mFlatComponentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance}.
	 * @generated
	 */
	@Override
	public Adapter createMFlatComponentInstanceAdapter() {
		if (mFlatComponentInstanceItemProvider == null) {
			mFlatComponentInstanceItemProvider = new MFlatComponentInstanceItemProvider(this);
		}

		return mFlatComponentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection} instances.
	 * @generated
	 */
	protected MFlatConnectionItemProvider mFlatConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection}.
	 * @generated
	 */
	@Override
	public Adapter createMFlatConnectionAdapter() {
		if (mFlatConnectionItemProvider == null) {
			mFlatConnectionItemProvider = new MFlatConnectionItemProvider(this);
		}

		return mFlatConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile} instances.
	 * @generated
	 */
	protected MMCLEVFLATMCADPackageFileItemProvider mmclevflatmcadPackageFileItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile}.
	 * @generated
	 */
	@Override
	public Adapter createMMCLEVFLATMCADPackageFileAdapter() {
		if (mmclevflatmcadPackageFileItemProvider == null) {
			mmclevflatmcadPackageFileItemProvider = new MMCLEVFLATMCADPackageFileItemProvider(this);
		}

		return mmclevflatmcadPackageFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping} instances.
	 * @generated
	 */
	protected MFlatDeviceDriverMappingItemProvider mFlatDeviceDriverMappingItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping}.
	 * @generated
	 */
	@Override
	public Adapter createMFlatDeviceDriverMappingAdapter() {
		if (mFlatDeviceDriverMappingItemProvider == null) {
			mFlatDeviceDriverMappingItemProvider = new MFlatDeviceDriverMappingItemProvider(this);
		}

		return mFlatDeviceDriverMappingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * @generated
	 */
	public void dispose() {
		if (mFlatMCADItemProvider != null) mFlatMCADItemProvider.dispose();
		if (mFlatMCADTargetItemProvider != null) mFlatMCADTargetItemProvider.dispose();
		if (mFlatServiceLibraryInstanceItemProvider != null) mFlatServiceLibraryInstanceItemProvider.dispose();
		if (mFlatDriverSLibInstanceItemProvider != null) mFlatDriverSLibInstanceItemProvider.dispose();
		if (mFlatComponentInstanceItemProvider != null) mFlatComponentInstanceItemProvider.dispose();
		if (mFlatConnectionItemProvider != null) mFlatConnectionItemProvider.dispose();
		if (mmclevflatmcadPackageFileItemProvider != null) mmclevflatmcadPackageFileItemProvider.dispose();
		if (mFlatDeviceDriverMappingItemProvider != null) mFlatDeviceDriverMappingItemProvider.dispose();
	}

}