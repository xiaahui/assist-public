/**
 */
package ch.hilbri.assist.model.provider;


import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ch.hilbri.assist.model.AssistModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssistModelItemProvider 
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
	public AssistModelItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__PROPERTIES);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__COMPARTMENTS);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__APPLICATIONS);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__APPLICATION_ALTERNATIVES);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__DISLOCALITY_RELATIONS);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__COLOCALITY_RELATIONS);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__DISSIMILARITY_RELATIONS);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__RESTRICTION_ALTERNATIVES);
            childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__EXPLORATION_CANDIDATES);
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
     * This returns AssistModel.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AssistModel"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        return getString("_UI_AssistModel_type");
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

        switch (notification.getFeatureID(AssistModel.class)) {
            case ModelPackage.ASSIST_MODEL__PROPERTIES:
            case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
            case ModelPackage.ASSIST_MODEL__APPLICATIONS:
            case ModelPackage.ASSIST_MODEL__APPLICATION_ALTERNATIVES:
            case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
            case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
            case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
            case ModelPackage.ASSIST_MODEL__SCHEDULING_RESTRICTIONS:
            case ModelPackage.ASSIST_MODEL__RESTRICTION_ALTERNATIVES:
            case ModelPackage.ASSIST_MODEL__EXPLORATION_CANDIDATES:
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
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createStringProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createIntProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createSystemNameProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createMinHypPeriodLengthProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createTaskSwitchDelayProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createManufacturerProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createPowerSupplyProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createBoardTypeProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createProcessorTypeProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createRAMCapacityProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createRAMUtilizationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createROMCapacityProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createROMUtilizationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createCoreCapacityProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createCoreUtilizationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createCoreArchitectureProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createDevelopedByProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createDurationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createPeriodProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createEarlyToleranceProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createLateToleranceProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createMaxStartTimeProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createMaxEndTimeProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createAddInitTimeProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createSlicesProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createMinSliceDurationProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createDesignAssuranceLevelProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createCriticalityLevelProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createPeriodicityProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createColorProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createAssignedCoreProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createCustomProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createCustomIntProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__PROPERTIES,
                 ModelFactory.eINSTANCE.createCustomStringProperty()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__COMPARTMENTS,
                 ModelFactory.eINSTANCE.createCompartment()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__APPLICATIONS,
                 ModelFactory.eINSTANCE.createApplication()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__APPLICATION_ALTERNATIVES,
                 ModelFactory.eINSTANCE.createApplicationAlternative()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__DISLOCALITY_RELATIONS,
                 ModelFactory.eINSTANCE.createDislocalityRelation()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__COLOCALITY_RELATIONS,
                 ModelFactory.eINSTANCE.createColocalityRelation()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__DISSIMILARITY_RELATIONS,
                 ModelFactory.eINSTANCE.createDissimilarityRelation()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createSchedulingRestriction()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createSimpleRelation()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createComplexRelation()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createRestrictionStartAtTheSameTime()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createRestrictionFinishAtTheSameTime()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createRestrictionStartAfterOtherFinished()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createRestrictionStartAfterOtherStarted()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                 ModelFactory.eINSTANCE.createRestrictionDisjointExecution()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__RESTRICTION_ALTERNATIVES,
                 ModelFactory.eINSTANCE.createRestrictionAlternative()));

        newChildDescriptors.add
            (createChildParameter
                (ModelPackage.Literals.ASSIST_MODEL__EXPLORATION_CANDIDATES,
                 ModelFactory.eINSTANCE.createExplorationCandidate()));
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
