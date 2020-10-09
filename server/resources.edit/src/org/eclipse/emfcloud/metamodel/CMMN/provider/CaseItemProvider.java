/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.Case;

/**
 * This is the item provider adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.Case} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CaseItemProvider extends CMMNElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Case_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Case_name_feature", "_UI_Case_type"),
				 CMMNPackage.Literals.CASE__NAME,
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
			childrenFeatures.add(CMMNPackage.Literals.CASE__CASEFILE);
			childrenFeatures.add(CMMNPackage.Literals.CASE__STAGES);
			childrenFeatures.add(CMMNPackage.Literals.CASE__TASKS);
			childrenFeatures.add(CMMNPackage.Literals.CASE__EVENT_LISTENERS);
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
	 * This returns Case.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Case"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Case)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Case_type") :
			getString("_UI_Case_type") + " " + label;
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

		switch (notification.getFeatureID(Case.class)) {
			case CMMNPackage.CASE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CMMNPackage.CASE__CASEFILE:
			case CMMNPackage.CASE__STAGES:
			case CMMNPackage.CASE__TASKS:
			case CMMNPackage.CASE__EVENT_LISTENERS:
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
				(CMMNPackage.Literals.CASE__CASEFILE,
				 CMMNFactory.eINSTANCE.createCaseFile()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CASE__STAGES,
				 CMMNFactory.eINSTANCE.createStage()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CASE__TASKS,
				 CMMNFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CASE__EVENT_LISTENERS,
				 CMMNFactory.eINSTANCE.createEventListener()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CASE__EVENT_LISTENERS,
				 CMMNFactory.eINSTANCE.createTimerEventListener()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CASE__EVENT_LISTENERS,
				 CMMNFactory.eINSTANCE.createUserEventListener()));
	}

}
