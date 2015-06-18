/**
 */
package ch.hilbri.assist.datamodel.model.provider;


import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelFactory;
import ch.hilbri.assist.datamodel.model.ModelPackage;

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
 * This is the item provider adapter for a {@link ch.hilbri.assist.datamodel.model.AssistModel} object.
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
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__CABLE_WEIGHT_DATA);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__COMPATIBLE_IO_TYPES);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__COMPARTMENTS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__EQ_INTERFACES);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__EQ_INTERFACE_GROUPS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__DISLOCALITY_RELATIONS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__COLOCALITY_RELATIONS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__VALID_DEPLOYMENTS);
			childrenFeatures.add(ModelPackage.Literals.ASSIST_MODEL__INVALID_DEPLOYMENTS);
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
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.ASSIST_MODEL__CABLE_WEIGHT_DATA:
			case ModelPackage.ASSIST_MODEL__COMPATIBLE_IO_TYPES:
			case ModelPackage.ASSIST_MODEL__COMPARTMENTS:
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACES:
			case ModelPackage.ASSIST_MODEL__EQ_INTERFACE_GROUPS:
			case ModelPackage.ASSIST_MODEL__DISLOCALITY_RELATIONS:
			case ModelPackage.ASSIST_MODEL__COLOCALITY_RELATIONS:
			case ModelPackage.ASSIST_MODEL__VALID_DEPLOYMENTS:
			case ModelPackage.ASSIST_MODEL__INVALID_DEPLOYMENTS:
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
				(ModelPackage.Literals.ASSIST_MODEL__CABLE_WEIGHT_DATA,
				 ModelFactory.eINSTANCE.createCableWeightData()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__COMPATIBLE_IO_TYPES,
				 ModelFactory.eINSTANCE.createCompatibleIoTypeEntry()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__COMPARTMENTS,
				 ModelFactory.eINSTANCE.createCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__EQ_INTERFACES,
				 ModelFactory.eINSTANCE.createEqInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__EQ_INTERFACE_GROUPS,
				 ModelFactory.eINSTANCE.createEqInterfaceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__EQ_INTERFACE_GROUPS,
				 ModelFactory.eINSTANCE.createEqInterfaceGroupWithCombinedDefinition()));

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
				(ModelPackage.Literals.ASSIST_MODEL__VALID_DEPLOYMENTS,
				 ModelFactory.eINSTANCE.createValidDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.ASSIST_MODEL__INVALID_DEPLOYMENTS,
				 ModelFactory.eINSTANCE.createInvalidDeployment()));
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
