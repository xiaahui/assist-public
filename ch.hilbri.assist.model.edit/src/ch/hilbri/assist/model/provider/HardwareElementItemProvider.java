/**
 */
package ch.hilbri.assist.model.provider;


import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ch.hilbri.assist.model.HardwareElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareElementItemProvider 
	extends ItemProviderAdapter
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
	public HardwareElementItemProvider(AdapterFactory adapterFactory) {
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

            addNamePropertyDescriptor(object);
            addGetHardwareLevelPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HardwareElement_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_HardwareElement_name_feature", "_UI_HardwareElement_type"),
                 ModelPackage.Literals.HARDWARE_ELEMENT__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Get Hardware Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGetHardwareLevelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HardwareElement_getHardwareLevel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_HardwareElement_getHardwareLevel_feature", "_UI_HardwareElement_type"),
                 ModelPackage.Literals.HARDWARE_ELEMENT__GET_HARDWARE_LEVEL,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES);
            childrenFeatures.add(ModelPackage.Literals.HARDWARE_ELEMENT__FEATURES);
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
     * This returns HardwareElement.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/HardwareElement"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((HardwareElement)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_HardwareElement_type") :
            getString("_UI_HardwareElement_type") + " " + label;
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

        switch (notification.getFeatureID(HardwareElement.class)) {
            case ModelPackage.HARDWARE_ELEMENT__NAME:
            case ModelPackage.HARDWARE_ELEMENT__GET_HARDWARE_LEVEL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ModelPackage.HARDWARE_ELEMENT__PROPERTIES:
            case ModelPackage.HARDWARE_ELEMENT__FEATURES:
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
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createStringProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createIntProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createManufacturerProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createPowerSupplyProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createBoardTypeProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createProcessorTypeProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createRAMCapacityProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createRAMUtilizationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createROMCapacityProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createROMUtilizationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createCoreCapacityProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createCoreUtilizationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createCoreArchitectureProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createDesignAssuranceLevelProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createCriticalityLevelProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createDevelopedByProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createCustomProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createCustomIntProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__PROPERTIES,
                 ModelFactory.eINSTANCE.createCustomStringProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.HARDWARE_ELEMENT__FEATURES,
                 ModelFactory.eINSTANCE.createFeature()));
    }

	/**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResourceLocator getResourceLocator() {
        return ModelEditPlugin.INSTANCE;
    }

}
