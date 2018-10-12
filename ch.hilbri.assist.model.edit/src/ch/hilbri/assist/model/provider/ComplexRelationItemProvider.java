/**
 */
package ch.hilbri.assist.model.provider;


import ch.hilbri.assist.model.ComplexRelation;
import ch.hilbri.assist.model.ModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ch.hilbri.assist.model.ComplexRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexRelationItemProvider extends SchedulingRestrictionItemProvider {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComplexRelationItemProvider(AdapterFactory adapterFactory) {
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

            addTasksPropertyDescriptor(object);
            addOtherTaskPropertyDescriptor(object);
            addDelayPropertyDescriptor(object);
            addTaskNamesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Tasks feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addTasksPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ComplexRelation_tasks_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ComplexRelation_tasks_feature", "_UI_ComplexRelation_type"),
                 ModelPackage.Literals.COMPLEX_RELATION__TASKS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Other Task feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addOtherTaskPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ComplexRelation_otherTask_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ComplexRelation_otherTask_feature", "_UI_ComplexRelation_type"),
                 ModelPackage.Literals.COMPLEX_RELATION__OTHER_TASK,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Delay feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ComplexRelation_delay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ComplexRelation_delay_feature", "_UI_ComplexRelation_type"),
                 ModelPackage.Literals.COMPLEX_RELATION__DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Task Names feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaskNamesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ComplexRelation_taskNames_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ComplexRelation_taskNames_feature", "_UI_ComplexRelation_type"),
                 ModelPackage.Literals.COMPLEX_RELATION__TASK_NAMES,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ComplexRelation.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexRelation"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((ComplexRelation)object).getTaskNames();
        return label == null || label.length() == 0 ?
            getString("_UI_ComplexRelation_type") :
            getString("_UI_ComplexRelation_type") + " " + label;
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

        switch (notification.getFeatureID(ComplexRelation.class)) {
            case ModelPackage.COMPLEX_RELATION__DELAY:
            case ModelPackage.COMPLEX_RELATION__TASK_NAMES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

}
