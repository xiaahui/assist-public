/**
 */
package ch.hilbri.assist.datamodel.model.provider;

import ch.hilbri.assist.datamodel.model.util.ModelAdapterFactory;

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
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.AssistModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelItemProvider assistModelItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.AssistModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssistModelAdapter() {
		if (assistModelItemProvider == null) {
			assistModelItemProvider = new AssistModelItemProvider(this);
		}

		return assistModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.HardwareElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareElementItemProvider hardwareElementItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.HardwareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardwareElementAdapter() {
		if (hardwareElementItemProvider == null) {
			hardwareElementItemProvider = new HardwareElementItemProvider(this);
		}

		return hardwareElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.Compartment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentItemProvider compartmentItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.Compartment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompartmentAdapter() {
		if (compartmentItemProvider == null) {
			compartmentItemProvider = new CompartmentItemProvider(this);
		}

		return compartmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.RDC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDCItemProvider rdcItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.RDC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRDCAdapter() {
		if (rdcItemProvider == null) {
			rdcItemProvider = new RDCItemProvider(this);
		}

		return rdcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.Connector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorItemProvider connectorItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorAdapter() {
		if (connectorItemProvider == null) {
			connectorItemProvider = new ConnectorItemProvider(this);
		}

		return connectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.AvailableEqInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableEqInterfaceItemProvider availableEqInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.AvailableEqInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAvailableEqInterfaceAdapter() {
		if (availableEqInterfaceItemProvider == null) {
			availableEqInterfaceItemProvider = new AvailableEqInterfaceItemProvider(this);
		}

		return availableEqInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqInterfaceOrGroupItemProvider eqInterfaceOrGroupItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.EqInterfaceOrGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqInterfaceOrGroupAdapter() {
		if (eqInterfaceOrGroupItemProvider == null) {
			eqInterfaceOrGroupItemProvider = new EqInterfaceOrGroupItemProvider(this);
		}

		return eqInterfaceOrGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.EqInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqInterfaceItemProvider eqInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.EqInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqInterfaceAdapter() {
		if (eqInterfaceItemProvider == null) {
			eqInterfaceItemProvider = new EqInterfaceItemProvider(this);
		}

		return eqInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqInterfaceGroupItemProvider eqInterfaceGroupItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.EqInterfaceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqInterfaceGroupAdapter() {
		if (eqInterfaceGroupItemProvider == null) {
			eqInterfaceGroupItemProvider = new EqInterfaceGroupItemProvider(this);
		}

		return eqInterfaceGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.MetricParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricParameterItemProvider metricParameterItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetricParameterAdapter() {
		if (metricParameterItemProvider == null) {
			metricParameterItemProvider = new MetricParameterItemProvider(this);
		}

		return metricParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.DislocalityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DislocalityRelationItemProvider dislocalityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.DislocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDislocalityRelationAdapter() {
		if (dislocalityRelationItemProvider == null) {
			dislocalityRelationItemProvider = new DislocalityRelationItemProvider(this);
		}

		return dislocalityRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.ColocalityRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColocalityRelationItemProvider colocalityRelationItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.ColocalityRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColocalityRelationAdapter() {
		if (colocalityRelationItemProvider == null) {
			colocalityRelationItemProvider = new ColocalityRelationItemProvider(this);
		}

		return colocalityRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.ValidDeployment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidDeploymentItemProvider validDeploymentItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.ValidDeployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValidDeploymentAdapter() {
		if (validDeploymentItemProvider == null) {
			validDeploymentItemProvider = new ValidDeploymentItemProvider(this);
		}

		return validDeploymentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ch.hilbri.assist.datamodel.model.InvalidDeployment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvalidDeploymentItemProvider invalidDeploymentItemProvider;

	/**
	 * This creates an adapter for a {@link ch.hilbri.assist.datamodel.model.InvalidDeployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInvalidDeploymentAdapter() {
		if (invalidDeploymentItemProvider == null) {
			invalidDeploymentItemProvider = new InvalidDeploymentItemProvider(this);
		}

		return invalidDeploymentItemProvider;
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
		if (assistModelItemProvider != null) assistModelItemProvider.dispose();
		if (hardwareElementItemProvider != null) hardwareElementItemProvider.dispose();
		if (compartmentItemProvider != null) compartmentItemProvider.dispose();
		if (rdcItemProvider != null) rdcItemProvider.dispose();
		if (connectorItemProvider != null) connectorItemProvider.dispose();
		if (availableEqInterfaceItemProvider != null) availableEqInterfaceItemProvider.dispose();
		if (eqInterfaceOrGroupItemProvider != null) eqInterfaceOrGroupItemProvider.dispose();
		if (eqInterfaceItemProvider != null) eqInterfaceItemProvider.dispose();
		if (eqInterfaceGroupItemProvider != null) eqInterfaceGroupItemProvider.dispose();
		if (metricParameterItemProvider != null) metricParameterItemProvider.dispose();
		if (dislocalityRelationItemProvider != null) dislocalityRelationItemProvider.dispose();
		if (colocalityRelationItemProvider != null) colocalityRelationItemProvider.dispose();
		if (validDeploymentItemProvider != null) validDeploymentItemProvider.dispose();
		if (invalidDeploymentItemProvider != null) invalidDeploymentItemProvider.dispose();
	}

}
