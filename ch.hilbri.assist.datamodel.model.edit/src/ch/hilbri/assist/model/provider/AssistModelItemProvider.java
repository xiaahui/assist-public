/**
 * Copyright 2014 - Robert Hilbrich
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

			addSystemNamePropertyDescriptor(object);
			addTopHardwareLevelPropertyDescriptor(object);
			addBottomHardwareLevelPropertyDescriptor(object);
			addHardwareLevelCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the System Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssistModel_systemName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssistModel_systemName_feature", "_UI_AssistModel_type"),
				 ModelPackage.Literals.ASSIST_MODEL__SYSTEM_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Hardware Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopHardwareLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssistModel_topHardwareLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssistModel_topHardwareLevel_feature", "_UI_AssistModel_type"),
				 ModelPackage.Literals.ASSIST_MODEL__TOP_HARDWARE_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bottom Hardware Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBottomHardwareLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssistModel_bottomHardwareLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssistModel_bottomHardwareLevel_feature", "_UI_AssistModel_type"),
				 ModelPackage.Literals.ASSIST_MODEL__BOTTOM_HARDWARE_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hardware Level Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardwareLevelCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssistModel_hardwareLevelCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssistModel_hardwareLevelCount_feature", "_UI_AssistModel_type"),
				 ModelPackage.Literals.ASSIST_MODEL__HARDWARE_LEVEL_COUNT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__HARDWARE_CONTAINER);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__NETWORKS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__APPLICATIONS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__APPLICATION_GROUPS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__DISSIMILARITY_RELATIONS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__DISLOCALITY_RELATIONS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__PROXIMITY_RELATIONS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__COMMUNICATION_RELATIONS);
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
		String label = ((AssistModel)object).getSystemName();
		return label == null || label.length() == 0 ?
			getString("_UI_AssistModel_type") :
			getString("_UI_AssistModel_type") + " " + label;
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
			case ModelPackage.ASSIST_MODEL__SYSTEM_NAME:
			case ModelPackage.ASSIST_MODEL__TOP_HARDWARE_LEVEL:
			case ModelPackage.ASSIST_MODEL__BOTTOM_HARDWARE_LEVEL:
			case ModelPackage.ASSIST_MODEL__HARDWARE_LEVEL_COUNT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.ASSIST_MODEL__HARDWARE_CONTAINER:
			case ModelPackage.ASSIST_MODEL__NETWORKS:
			case ModelPackage.ASSIST_MODEL__APPLICATIONS:
			case ModelPackage.ASSIST_MODEL__APPLICATION_GROUPS:
			case ModelPackage.ASSIST_MODEL__DISSIMILARITY_RELATIONS:
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
			case ModelPackage.ASSIST_MODEL__PROXIMITY_RELATIONS:
			case ModelPackage.ASSIST_MODEL__COMMUNICATION_RELATIONS:
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
				(ModelPackage.Literals.ASSIST_MODEL__HARDWARE_CONTAINER,
				 ModelFactory.eINSTANCE.createHardwareElementContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__HARDWARE_CONTAINER,
				 ModelFactory.eINSTANCE.createCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__HARDWARE_CONTAINER,
				 ModelFactory.eINSTANCE.createBox()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__HARDWARE_CONTAINER,
				 ModelFactory.eINSTANCE.createBoard()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__NETWORKS,
				 ModelFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__APPLICATIONS,
				 ModelFactory.eINSTANCE.createApplication()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__APPLICATION_GROUPS,
				 ModelFactory.eINSTANCE.createApplicationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__DISSIMILARITY_RELATIONS,
				 ModelFactory.eINSTANCE.createDissimilarityRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__DISLOCALITY_RELATIONS,
				 ModelFactory.eINSTANCE.createDislocalityRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__PROXIMITY_RELATIONS,
				 ModelFactory.eINSTANCE.createProximityRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__COMMUNICATION_RELATIONS,
				 ModelFactory.eINSTANCE.createCommunicationRelation()));
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
