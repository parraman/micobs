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
package es.uah.aut.srg.micobs.pdl.provider;

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

import es.uah.aut.srg.micobs.pdl.util.pdlAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * @generated
 */
public class pdlItemProviderAdapterFactory extends pdlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public pdlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MBoard} instances.
	 * @generated
	 */
	protected MBoardItemProvider mBoardItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MBoard}.
	 * @generated
	 */
	@Override
	public Adapter createMBoardAdapter() {
		if (mBoardItemProvider == null) {
			mBoardItemProvider = new MBoardItemProvider(this);
		}

		return mBoardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice} instances.
	 * @generated
	 */
	protected MBoardSupportedDeviceItemProvider mBoardSupportedDeviceItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice}.
	 * @generated
	 */
	@Override
	public Adapter createMBoardSupportedDeviceAdapter() {
		if (mBoardSupportedDeviceItemProvider == null) {
			mBoardSupportedDeviceItemProvider = new MBoardSupportedDeviceItemProvider(this);
		}

		return mBoardSupportedDeviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MMicroprocessor} instances.
	 * @generated
	 */
	protected MMicroprocessorItemProvider mMicroprocessorItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MMicroprocessor}.
	 * @generated
	 */
	@Override
	public Adapter createMMicroprocessorAdapter() {
		if (mMicroprocessorItemProvider == null) {
			mMicroprocessorItemProvider = new MMicroprocessorItemProvider(this);
		}

		return mMicroprocessorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MOperatingSystem} instances.
	 * @generated
	 */
	protected MOperatingSystemItemProvider mOperatingSystemItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MOperatingSystem}.
	 * @generated
	 */
	@Override
	public Adapter createMOperatingSystemAdapter() {
		if (mOperatingSystemItemProvider == null) {
			mOperatingSystemItemProvider = new MOperatingSystemItemProvider(this);
		}

		return mOperatingSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform} instances.
	 * @generated
	 */
	protected MOSSupportedPlatformItemProvider mosSupportedPlatformItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform}.
	 * @generated
	 */
	@Override
	public Adapter createMOSSupportedPlatformAdapter() {
		if (mosSupportedPlatformItemProvider == null) {
			mosSupportedPlatformItemProvider = new MOSSupportedPlatformItemProvider(this);
		}

		return mosSupportedPlatformItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI} instances.
	 * @generated
	 */
	protected MOSSupportedOSAPIItemProvider mosSupportedOSAPIItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI}.
	 * @generated
	 */
	@Override
	public Adapter createMOSSupportedOSAPIAdapter() {
		if (mosSupportedOSAPIItemProvider == null) {
			mosSupportedOSAPIItemProvider = new MOSSupportedOSAPIItemProvider(this);
		}

		return mosSupportedOSAPIItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression} instances.
	 * @generated
	 */
	protected MOSSupportedOSAPIPVAExpressionItemProvider mosSupportedOSAPIPVAExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression}.
	 * @generated
	 */
	@Override
	public Adapter createMOSSupportedOSAPIPVAExpressionAdapter() {
		if (mosSupportedOSAPIPVAExpressionItemProvider == null) {
			mosSupportedOSAPIPVAExpressionItemProvider = new MOSSupportedOSAPIPVAExpressionItemProvider(this);
		}

		return mosSupportedOSAPIPVAExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch} instances.
	 * @generated
	 */
	protected MOSSupportedOSAPIPVASwitchItemProvider mosSupportedOSAPIPVASwitchItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch}.
	 * @generated
	 */
	@Override
	public Adapter createMOSSupportedOSAPIPVASwitchAdapter() {
		if (mosSupportedOSAPIPVASwitchItemProvider == null) {
			mosSupportedOSAPIPVASwitchItemProvider = new MOSSupportedOSAPIPVASwitchItemProvider(this);
		}

		return mosSupportedOSAPIPVASwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase} instances.
	 * @generated
	 */
	protected MOSSupportedOSAPIPVASwitchCaseItemProvider mosSupportedOSAPIPVASwitchCaseItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase}.
	 * @generated
	 */
	@Override
	public Adapter createMOSSupportedOSAPIPVASwitchCaseAdapter() {
		if (mosSupportedOSAPIPVASwitchCaseItemProvider == null) {
			mosSupportedOSAPIPVASwitchCaseItemProvider = new MOSSupportedOSAPIPVASwitchCaseItemProvider(this);
		}

		return mosSupportedOSAPIPVASwitchCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI} instances.
	 * @generated
	 */
	protected MOperatingSystemAPIItemProvider mOperatingSystemAPIItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI}.
	 * @generated
	 */
	@Override
	public Adapter createMOperatingSystemAPIAdapter() {
		if (mOperatingSystemAPIItemProvider == null) {
			mOperatingSystemAPIItemProvider = new MOperatingSystemAPIItemProvider(this);
		}

		return mOperatingSystemAPIItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MArchitecture} instances.
	 * @generated
	 */
	protected MArchitectureItemProvider mArchitectureItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MArchitecture}.
	 * @generated
	 */
	@Override
	public Adapter createMArchitectureAdapter() {
		if (mArchitectureItemProvider == null) {
			mArchitectureItemProvider = new MArchitectureItemProvider(this);
		}

		return mArchitectureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MPDLPackageFile} instances.
	 * @generated
	 */
	protected MPDLPackageFileItemProvider mpdlPackageFileItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MPDLPackageFile}.
	 * @generated
	 */
	@Override
	public Adapter createMPDLPackageFileAdapter() {
		if (mpdlPackageFileItemProvider == null) {
			mpdlPackageFileItemProvider = new MPDLPackageFileItemProvider(this);
		}

		return mpdlPackageFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MPlatform} instances.
	 * @generated
	 */
	protected MPlatformItemProvider mPlatformItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MPlatform}.
	 * @generated
	 */
	@Override
	public Adapter createMPlatformAdapter() {
		if (mPlatformItemProvider == null) {
			mPlatformItemProvider = new MPlatformItemProvider(this);
		}

		return mPlatformItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MCompiler} instances.
	 * @generated
	 */
	protected MCompilerItemProvider mCompilerItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MCompiler}.
	 * @generated
	 */
	@Override
	public Adapter createMCompilerAdapter() {
		if (mCompilerItemProvider == null) {
			mCompilerItemProvider = new MCompilerItemProvider(this);
		}

		return mCompilerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend} instances.
	 * @generated
	 */
	protected MCompilerFrontendItemProvider mCompilerFrontendItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend}.
	 * @generated
	 */
	@Override
	public Adapter createMCompilerFrontendAdapter() {
		if (mCompilerFrontendItemProvider == null) {
			mCompilerFrontendItemProvider = new MCompilerFrontendItemProvider(this);
		}

		return mCompilerFrontendItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MDevice} instances.
	 * @generated
	 */
	protected MDeviceItemProvider mDeviceItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MDevice}.
	 * @generated
	 */
	@Override
	public Adapter createMDeviceAdapter() {
		if (mDeviceItemProvider == null) {
			mDeviceItemProvider = new MDeviceItemProvider(this);
		}

		return mDeviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch} instances.
	 * @generated
	 */
	protected MBooleanParamOSSPSwitchItemProvider mBooleanParamOSSPSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch}.
	 * @generated
	 */
	@Override
	public Adapter createMBooleanParamOSSPSwitchAdapter() {
		if (mBooleanParamOSSPSwitchItemProvider == null) {
			mBooleanParamOSSPSwitchItemProvider = new MBooleanParamOSSPSwitchItemProvider(this);
		}

		return mBooleanParamOSSPSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase} instances.
	 * @generated
	 */
	protected MBooleanParamOSSPSwitchCaseItemProvider mBooleanParamOSSPSwitchCaseItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase}.
	 * @generated
	 */
	@Override
	public Adapter createMBooleanParamOSSPSwitchCaseAdapter() {
		if (mBooleanParamOSSPSwitchCaseItemProvider == null) {
			mBooleanParamOSSPSwitchCaseItemProvider = new MBooleanParamOSSPSwitchCaseItemProvider(this);
		}

		return mBooleanParamOSSPSwitchCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch} instances.
	 * @generated
	 */
	protected MStringParamOSSPSwitchItemProvider mStringParamOSSPSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch}.
	 * @generated
	 */
	@Override
	public Adapter createMStringParamOSSPSwitchAdapter() {
		if (mStringParamOSSPSwitchItemProvider == null) {
			mStringParamOSSPSwitchItemProvider = new MStringParamOSSPSwitchItemProvider(this);
		}

		return mStringParamOSSPSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase} instances.
	 * @generated
	 */
	protected MStringParamOSSPSwitchCaseItemProvider mStringParamOSSPSwitchCaseItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase}.
	 * @generated
	 */
	@Override
	public Adapter createMStringParamOSSPSwitchCaseAdapter() {
		if (mStringParamOSSPSwitchCaseItemProvider == null) {
			mStringParamOSSPSwitchCaseItemProvider = new MStringParamOSSPSwitchCaseItemProvider(this);
		}

		return mStringParamOSSPSwitchCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch} instances.
	 * @generated
	 */
	protected MIntegerParamOSSPSwitchItemProvider mIntegerParamOSSPSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch}.
	 * @generated
	 */
	@Override
	public Adapter createMIntegerParamOSSPSwitchAdapter() {
		if (mIntegerParamOSSPSwitchItemProvider == null) {
			mIntegerParamOSSPSwitchItemProvider = new MIntegerParamOSSPSwitchItemProvider(this);
		}

		return mIntegerParamOSSPSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase} instances.
	 * @generated
	 */
	protected MIntegerParamOSSPSwitchCaseItemProvider mIntegerParamOSSPSwitchCaseItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase}.
	 * @generated
	 */
	@Override
	public Adapter createMIntegerParamOSSPSwitchCaseAdapter() {
		if (mIntegerParamOSSPSwitchCaseItemProvider == null) {
			mIntegerParamOSSPSwitchCaseItemProvider = new MIntegerParamOSSPSwitchCaseItemProvider(this);
		}

		return mIntegerParamOSSPSwitchCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch} instances.
	 * @generated
	 */
	protected MEnumParamOSSPSwitchItemProvider mEnumParamOSSPSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch}.
	 * @generated
	 */
	@Override
	public Adapter createMEnumParamOSSPSwitchAdapter() {
		if (mEnumParamOSSPSwitchItemProvider == null) {
			mEnumParamOSSPSwitchItemProvider = new MEnumParamOSSPSwitchItemProvider(this);
		}

		return mEnumParamOSSPSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase} instances.
	 * @generated
	 */
	protected MEnumParamOSSPSwitchCaseItemProvider mEnumParamOSSPSwitchCaseItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase}.
	 * @generated
	 */
	@Override
	public Adapter createMEnumParamOSSPSwitchCaseAdapter() {
		if (mEnumParamOSSPSwitchCaseItemProvider == null) {
			mEnumParamOSSPSwitchCaseItemProvider = new MEnumParamOSSPSwitchCaseItemProvider(this);
		}

		return mEnumParamOSSPSwitchCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch} instances.
	 * @generated
	 */
	protected MRealParamOSSPSwitchItemProvider mRealParamOSSPSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch}.
	 * @generated
	 */
	@Override
	public Adapter createMRealParamOSSPSwitchAdapter() {
		if (mRealParamOSSPSwitchItemProvider == null) {
			mRealParamOSSPSwitchItemProvider = new MRealParamOSSPSwitchItemProvider(this);
		}

		return mRealParamOSSPSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase} instances.
	 * @generated
	 */
	protected MRealParamOSSPSwitchCaseItemProvider mRealParamOSSPSwitchCaseItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase}.
	 * @generated
	 */
	@Override
	public Adapter createMRealParamOSSPSwitchCaseAdapter() {
		if (mRealParamOSSPSwitchCaseItemProvider == null) {
			mRealParamOSSPSwitchCaseItemProvider = new MRealParamOSSPSwitchCaseItemProvider(this);
		}

		return mRealParamOSSPSwitchCaseItemProvider;
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
		if (mBoardItemProvider != null) mBoardItemProvider.dispose();
		if (mBoardSupportedDeviceItemProvider != null) mBoardSupportedDeviceItemProvider.dispose();
		if (mMicroprocessorItemProvider != null) mMicroprocessorItemProvider.dispose();
		if (mOperatingSystemItemProvider != null) mOperatingSystemItemProvider.dispose();
		if (mosSupportedPlatformItemProvider != null) mosSupportedPlatformItemProvider.dispose();
		if (mosSupportedOSAPIItemProvider != null) mosSupportedOSAPIItemProvider.dispose();
		if (mosSupportedOSAPIPVAExpressionItemProvider != null) mosSupportedOSAPIPVAExpressionItemProvider.dispose();
		if (mosSupportedOSAPIPVASwitchItemProvider != null) mosSupportedOSAPIPVASwitchItemProvider.dispose();
		if (mosSupportedOSAPIPVASwitchCaseItemProvider != null) mosSupportedOSAPIPVASwitchCaseItemProvider.dispose();
		if (mOperatingSystemAPIItemProvider != null) mOperatingSystemAPIItemProvider.dispose();
		if (mArchitectureItemProvider != null) mArchitectureItemProvider.dispose();
		if (mpdlPackageFileItemProvider != null) mpdlPackageFileItemProvider.dispose();
		if (mPlatformItemProvider != null) mPlatformItemProvider.dispose();
		if (mCompilerItemProvider != null) mCompilerItemProvider.dispose();
		if (mCompilerFrontendItemProvider != null) mCompilerFrontendItemProvider.dispose();
		if (mDeviceItemProvider != null) mDeviceItemProvider.dispose();
		if (mBooleanParamOSSPSwitchItemProvider != null) mBooleanParamOSSPSwitchItemProvider.dispose();
		if (mBooleanParamOSSPSwitchCaseItemProvider != null) mBooleanParamOSSPSwitchCaseItemProvider.dispose();
		if (mStringParamOSSPSwitchItemProvider != null) mStringParamOSSPSwitchItemProvider.dispose();
		if (mStringParamOSSPSwitchCaseItemProvider != null) mStringParamOSSPSwitchCaseItemProvider.dispose();
		if (mIntegerParamOSSPSwitchItemProvider != null) mIntegerParamOSSPSwitchItemProvider.dispose();
		if (mIntegerParamOSSPSwitchCaseItemProvider != null) mIntegerParamOSSPSwitchCaseItemProvider.dispose();
		if (mEnumParamOSSPSwitchItemProvider != null) mEnumParamOSSPSwitchItemProvider.dispose();
		if (mEnumParamOSSPSwitchCaseItemProvider != null) mEnumParamOSSPSwitchCaseItemProvider.dispose();
		if (mRealParamOSSPSwitchItemProvider != null) mRealParamOSSPSwitchItemProvider.dispose();
		if (mRealParamOSSPSwitchCaseItemProvider != null) mRealParamOSSPSwitchCaseItemProvider.dispose();
	}

}
