/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNFactory;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNDiagramItemProvider extends CMMNElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNDiagramItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS);
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
	 * This returns CMMNDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CMMNDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CMMNDiagram)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_CMMNDiagram_type") :
			getString("_UI_CMMNDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(CMMNDiagram.class)) {
			case CMMNPackage.CMMN_DIAGRAM__CMMN_ELEMENTS:
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
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createCMMNElement()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createCMMNDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createCaseFile()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createCase()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createPlanItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createStage()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createEventListener()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createSentry()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createTimerEventListener()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createUserEventListener()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createMandatoryDecorator()));

		newChildDescriptors.add
			(createChildParameter
				(CMMNPackage.Literals.CMMN_DIAGRAM__CMMN_ELEMENTS,
				 CMMNFactory.eINSTANCE.createHTTPHookDecorator()));
	}

}
