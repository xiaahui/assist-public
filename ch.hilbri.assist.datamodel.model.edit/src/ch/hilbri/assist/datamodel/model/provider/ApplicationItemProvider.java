/**
 */
package ch.hilbri.assist.datamodel.model.provider;


import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ModelFactory;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ch.hilbri.assist.datamodel.model.Application} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider extends ApplicationOrApplicationGroupItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addCoreUtilizationPropertyDescriptor(object);
			addRamUtilizationPropertyDescriptor(object);
			addRomUtilizationPropertyDescriptor(object);
			addCriticalityLevelPropertyDescriptor(object);
			addIoAdapterProtectionLevelPropertyDescriptor(object);
			addParallelThreadsPropertyDescriptor(object);
			addDevelopedByPropertyDescriptor(object);
			addRestrictMappingToHardwareElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Core Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoreUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_coreUtilization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_coreUtilization_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__CORE_UTILIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ram Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRamUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_ramUtilization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_ramUtilization_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__RAM_UTILIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rom Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRomUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_romUtilization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_romUtilization_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__ROM_UTILIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Criticality Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriticalityLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_criticalityLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_criticalityLevel_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__CRITICALITY_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Io Adapter Protection Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIoAdapterProtectionLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_ioAdapterProtectionLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_ioAdapterProtectionLevel_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__IO_ADAPTER_PROTECTION_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parallel Threads feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallelThreadsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_parallelThreads_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_parallelThreads_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__PARALLEL_THREADS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Developed By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevelopedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_developedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_developedBy_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__DEVELOPED_BY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restrict Mapping To Hardware Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestrictMappingToHardwareElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_restrictMappingToHardwareElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_restrictMappingToHardwareElements_feature", "_UI_Application_type"),
				 ModelPackage.Literals.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS,
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
			childrenFeatures.add(ModelPackage.Literals.APPLICATION__IO_ADAPTER_REQUIREMENTS);
			childrenFeatures.add(ModelPackage.Literals.APPLICATION__THREADS);
			childrenFeatures.add(ModelPackage.Literals.APPLICATION__METRIC_PARAMETERS);
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
	 * This returns Application.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Application"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Application_type") :
			getString("_UI_Application_type") + " " + label;
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

		switch (notification.getFeatureID(Application.class)) {
			case ModelPackage.APPLICATION__CORE_UTILIZATION:
			case ModelPackage.APPLICATION__RAM_UTILIZATION:
			case ModelPackage.APPLICATION__ROM_UTILIZATION:
			case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
			case ModelPackage.APPLICATION__IO_ADAPTER_PROTECTION_LEVEL:
			case ModelPackage.APPLICATION__PARALLEL_THREADS:
			case ModelPackage.APPLICATION__DEVELOPED_BY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.APPLICATION__IO_ADAPTER_REQUIREMENTS:
			case ModelPackage.APPLICATION__THREADS:
			case ModelPackage.APPLICATION__METRIC_PARAMETERS:
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
				(ModelPackage.Literals.APPLICATION__IO_ADAPTER_REQUIREMENTS,
				 ModelFactory.eINSTANCE.createIOAdapterRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.APPLICATION__THREADS,
				 ModelFactory.eINSTANCE.createThread()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.APPLICATION__METRIC_PARAMETERS,
				 ModelFactory.eINSTANCE.createMetricParameter()));
	}

}
