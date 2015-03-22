/**
 */
package ch.hilbri.assist.datamodel.model.provider;


import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicitEqInterfaceMemberDefinitionAttributesAndValuesItemProvider 
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
	public ImplicitEqInterfaceMemberDefinitionAttributesAndValuesItemProvider(AdapterFactory adapterFactory) {
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

			addAttributePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_attribute_feature", "_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_type"),
				 ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_value_feature", "_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_type"),
				 ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ImplicitEqInterfaceMemberDefinitionAttributesAndValues.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplicitEqInterfaceMemberDefinitionAttributesAndValues"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ImplicitEqInterfaceMemberDefinitionAttribute labelValue = ((ImplicitEqInterfaceMemberDefinitionAttributesAndValues)object).getAttribute();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_type") :
			getString("_UI_ImplicitEqInterfaceMemberDefinitionAttributesAndValues_type") + " " + label;
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

		switch (notification.getFeatureID(ImplicitEqInterfaceMemberDefinitionAttributesAndValues.class)) {
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__ATTRIBUTE:
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__VALUE:
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
