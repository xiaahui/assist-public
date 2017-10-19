/**
 */
package ch.hilbri.assist.dse.model.provider;

import ch.hilbri.assist.dse.model.util.ModelAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.dse.model.AssistModelDSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelDSEItemProvider assistModelDSEItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.dse.model.AssistModelDSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssistModelDSEAdapter() {
		if (assistModelDSEItemProvider == null) {
			assistModelDSEItemProvider = new AssistModelDSEItemProvider(this);
		}

		return assistModelDSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.dse.model.BoxDSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoxDSEItemProvider boxDSEItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.dse.model.BoxDSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoxDSEAdapter() {
		if (boxDSEItemProvider == null) {
			boxDSEItemProvider = new BoxDSEItemProvider(this);
		}

		return boxDSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.dse.model.BoardAlternatives} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardAlternativesItemProvider boardAlternativesItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.dse.model.BoardAlternatives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoardAlternativesAdapter() {
		if (boardAlternativesItemProvider == null) {
			boardAlternativesItemProvider = new BoardAlternativesItemProvider(this);
		}

		return boardAlternativesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.dse.model.BoardAlternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardAlternativeItemProvider boardAlternativeItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.dse.model.BoardAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoardAlternativeAdapter() {
		if (boardAlternativeItemProvider == null) {
			boardAlternativeItemProvider = new BoardAlternativeItemProvider(this);
		}

		return boardAlternativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.dse.model.ApplicationAlternatives} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationAlternativesItemProvider applicationAlternativesItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.dse.model.ApplicationAlternatives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAlternativesAdapter() {
		if (applicationAlternativesItemProvider == null) {
			applicationAlternativesItemProvider = new ApplicationAlternativesItemProvider(this);
		}

		return applicationAlternativesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.dse.model.ApplicationAlternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationAlternativeItemProvider applicationAlternativeItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.dse.model.ApplicationAlternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAlternativeAdapter() {
		if (applicationAlternativeItemProvider == null) {
			applicationAlternativeItemProvider = new ApplicationAlternativeItemProvider(this);
		}

		return applicationAlternativeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (assistModelDSEItemProvider != null) assistModelDSEItemProvider.dispose();
		if (boxDSEItemProvider != null) boxDSEItemProvider.dispose();
		if (boardAlternativesItemProvider != null) boardAlternativesItemProvider.dispose();
		if (boardAlternativeItemProvider != null) boardAlternativeItemProvider.dispose();
		if (applicationAlternativesItemProvider != null) applicationAlternativesItemProvider.dispose();
		if (applicationAlternativeItemProvider != null) applicationAlternativeItemProvider.dispose();
	}

}