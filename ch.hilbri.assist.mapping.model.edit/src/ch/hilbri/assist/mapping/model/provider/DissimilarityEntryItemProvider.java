/**
 */
package ch.hilbri.assist.mapping.model.provider;


import ch.hilbri.assist.mapping.model.CompartmentAttributes;
import ch.hilbri.assist.mapping.model.DissimilarityEntry;
import ch.hilbri.assist.mapping.model.ModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ch.hilbri.assist.mapping.model.DissimilarityEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DissimilarityEntryItemProvider extends DissimilarityClauseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DissimilarityEntryItemProvider(AdapterFactory adapterFactory) {
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

			addCompartmentAttributePropertyDescriptor(object);
			addBoxAttributePropertyDescriptor(object);
			addBoardAttributePropertyDescriptor(object);
			addProcessorAttributePropertyDescriptor(object);
			addCoreAttributePropertyDescriptor(object);
			addHardwareLevelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hardware Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardwareLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DissimilarityEntry_hardwareLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DissimilarityEntry_hardwareLevel_feature", "_UI_DissimilarityEntry_type"),
				 ModelPackage.Literals.DISSIMILARITY_ENTRY__HARDWARE_LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compartment Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompartmentAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DissimilarityEntry_compartmentAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DissimilarityEntry_compartmentAttribute_feature", "_UI_DissimilarityEntry_type"),
				 ModelPackage.Literals.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Box Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoxAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DissimilarityEntry_boxAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DissimilarityEntry_boxAttribute_feature", "_UI_DissimilarityEntry_type"),
				 ModelPackage.Literals.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Board Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoardAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DissimilarityEntry_boardAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DissimilarityEntry_boardAttribute_feature", "_UI_DissimilarityEntry_type"),
				 ModelPackage.Literals.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processor Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessorAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DissimilarityEntry_processorAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DissimilarityEntry_processorAttribute_feature", "_UI_DissimilarityEntry_type"),
				 ModelPackage.Literals.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Core Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoreAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DissimilarityEntry_coreAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DissimilarityEntry_coreAttribute_feature", "_UI_DissimilarityEntry_type"),
				 ModelPackage.Literals.DISSIMILARITY_ENTRY__CORE_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DissimilarityEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DissimilarityEntry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CompartmentAttributes labelValue = ((DissimilarityEntry)object).getCompartmentAttribute();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DissimilarityEntry_type") :
			getString("_UI_DissimilarityEntry_type") + " " + label;
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

		switch (notification.getFeatureID(DissimilarityEntry.class)) {
			case ModelPackage.DISSIMILARITY_ENTRY__COMPARTMENT_ATTRIBUTE:
			case ModelPackage.DISSIMILARITY_ENTRY__BOX_ATTRIBUTE:
			case ModelPackage.DISSIMILARITY_ENTRY__BOARD_ATTRIBUTE:
			case ModelPackage.DISSIMILARITY_ENTRY__PROCESSOR_ATTRIBUTE:
			case ModelPackage.DISSIMILARITY_ENTRY__CORE_ATTRIBUTE:
			case ModelPackage.DISSIMILARITY_ENTRY__HARDWARE_LEVEL:
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
