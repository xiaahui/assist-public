/**
 */
package ch.hilbri.assist.model.provider;


import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.MappingResult;

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
 * This is the item provider adapter for a {@link ch.hilbri.assist.model.MappingResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingResultItemProvider 
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
	public MappingResultItemProvider(AdapterFactory adapterFactory) {
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
            addIndexPropertyDescriptor(object);
            addModelPropertyDescriptor(object);
            addTask2CoreMapPropertyDescriptor(object);
            addPartialSolutionPropertyDescriptor(object);
            addAbsoluteTotalScorePropertyDescriptor(object);
            addScaledTotalScorePropertyDescriptor(object);
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
                 getString("_UI_MappingResult_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MappingResult_name_feature", "_UI_MappingResult_type"),
                 ModelPackage.Literals.MAPPING_RESULT__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Index feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addIndexPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MappingResult_index_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MappingResult_index_feature", "_UI_MappingResult_type"),
                 ModelPackage.Literals.MAPPING_RESULT__INDEX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Model feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addModelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MappingResult_model_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MappingResult_model_feature", "_UI_MappingResult_type"),
                 ModelPackage.Literals.MAPPING_RESULT__MODEL,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Task2 Core Map feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addTask2CoreMapPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MappingResult_task2CoreMap_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MappingResult_task2CoreMap_feature", "_UI_MappingResult_type"),
                 ModelPackage.Literals.MAPPING_RESULT__TASK2_CORE_MAP,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Partial Solution feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addPartialSolutionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MappingResult_partialSolution_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MappingResult_partialSolution_feature", "_UI_MappingResult_type"),
                 ModelPackage.Literals.MAPPING_RESULT__PARTIAL_SOLUTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Absolute Total Score feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAbsoluteTotalScorePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MappingResult_absoluteTotalScore_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MappingResult_absoluteTotalScore_feature", "_UI_MappingResult_type"),
                 ModelPackage.Literals.MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Scaled Total Score feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addScaledTotalScorePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MappingResult_scaledTotalScore_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MappingResult_scaledTotalScore_feature", "_UI_MappingResult_type"),
                 ModelPackage.Literals.MAPPING_RESULT__SCALED_TOTAL_SCORE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
            childrenFeatures.add(ModelPackage.Literals.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP);
            childrenFeatures.add(ModelPackage.Literals.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP);
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
     * This returns MappingResult.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingResult"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((MappingResult)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_MappingResult_type") :
            getString("_UI_MappingResult_type") + " " + label;
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

        switch (notification.getFeatureID(MappingResult.class)) {
            case ModelPackage.MAPPING_RESULT__NAME:
            case ModelPackage.MAPPING_RESULT__INDEX:
            case ModelPackage.MAPPING_RESULT__TASK2_CORE_MAP:
            case ModelPackage.MAPPING_RESULT__PARTIAL_SOLUTION:
            case ModelPackage.MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE:
            case ModelPackage.MAPPING_RESULT__SCALED_TOTAL_SCORE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ModelPackage.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP:
            case ModelPackage.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP:
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
                (ModelPackage.Literals.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP,
                 ModelFactory.eINSTANCE.create(ModelPackage.Literals.METRIC_SCORE_PAIR)));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP,
                 ModelFactory.eINSTANCE.create(ModelPackage.Literals.METRIC_SCORE_PAIR)));
    }

	/**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == ModelPackage.Literals.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP ||
            childFeature == ModelPackage.Literals.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
