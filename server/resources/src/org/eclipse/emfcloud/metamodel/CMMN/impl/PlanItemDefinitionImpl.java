/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.Decorator;
import org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition;
import org.eclipse.emfcloud.metamodel.CMMN.Sentry;

import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl#getOutgoingSentrys <em>Outgoing Sentrys</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl#getDecorators <em>Decorators</em>}</li>
 *   <li>{@link org.eclipse.emfcloud.metamodel.CMMN.impl.PlanItemDefinitionImpl#getIncomingSentrys <em>Incoming Sentrys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanItemDefinitionImpl extends CMMNElementImpl implements PlanItemDefinition {
	/**
	 * The cached value of the '{@link #getOutgoingSentrys() <em>Outgoing Sentrys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingSentrys()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentry> outgoingSentrys;

	/**
	 * The cached value of the '{@link #getDecorators() <em>Decorators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorators()
	 * @generated
	 * @ordered
	 */
	protected EList<Decorator> decorators;

	/**
	 * The cached value of the '{@link #getIncomingSentrys() <em>Incoming Sentrys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingSentrys()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentry> incomingSentrys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CMMNPackage.Literals.PLAN_ITEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentry> getOutgoingSentrys() {
		if (outgoingSentrys == null) {
			outgoingSentrys = new EObjectContainmentEList<Sentry>(Sentry.class, this, CMMNPackage.PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS);
		}
		return outgoingSentrys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decorator> getDecorators() {
		if (decorators == null) {
			decorators = new EObjectContainmentEList<Decorator>(Decorator.class, this, CMMNPackage.PLAN_ITEM_DEFINITION__DECORATORS);
		}
		return decorators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentry> getIncomingSentrys() {
		if (incomingSentrys == null) {
			incomingSentrys = new EObjectResolvingEList<Sentry>(Sentry.class, this, CMMNPackage.PLAN_ITEM_DEFINITION__INCOMING_SENTRYS);
		}
		return incomingSentrys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isUsed(DiagnosticChain chain, Map<?, ?> context) {
		if (getIncomingSentrys().size()==0 && getOutgoingSentrys().size()==0) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CMMNValidator.DIAGNOSTIC_SOURCE,
						 CMMNValidator.PLAN_ITEM_DEFINITION__IS_USED,
						 "Object is unused",
						 new Object [] { this , CMMNPackage.eINSTANCE.getPlanItemDefinition_IncomingSentrys(), CMMNPackage.eINSTANCE.getPlanItemDefinition_OutgoingSentrys()}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isNoCircle(DiagnosticChain chain, Map<?, ?> context) {
		boolean circle = false;
		//Traverse Element if it has incoming and outgoing sentrys
		if(getIncomingSentrys().size()!=0 && getOutgoingSentrys().size()!=0) {
			circle = hasCircle(this, this, new ArrayList<PlanItemDefinition>());
		}
		if (circle) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CMMNValidator.DIAGNOSTIC_SOURCE,
						 CMMNValidator.PLAN_ITEM_DEFINITION__IS_NO_CIRCLE,
						 "Circle detected",
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasCircle(final PlanItemDefinition goal, final PlanItemDefinition current,
		final List<PlanItemDefinition> visited) {
		for (Sentry s : current.getOutgoingSentrys()) {
			// Only take outgoing edges now
			if (s.getAnchor() == goal) {
				return true;
		    }
		    // If Anchor is not the goal add current to visited nodes and repeat for s.getAnchor()
		    if (!visited.contains(s.getAnchor())) {
		    	visited.add(current);
		    	if(s.getAnchor() instanceof PlanItemDefinition) return hasCircle(goal, (PlanItemDefinition) s.getAnchor(), visited);
		    }
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CMMNPackage.PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS:
				return ((InternalEList<?>)getOutgoingSentrys()).basicRemove(otherEnd, msgs);
			case CMMNPackage.PLAN_ITEM_DEFINITION__DECORATORS:
				return ((InternalEList<?>)getDecorators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CMMNPackage.PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS:
				return getOutgoingSentrys();
			case CMMNPackage.PLAN_ITEM_DEFINITION__DECORATORS:
				return getDecorators();
			case CMMNPackage.PLAN_ITEM_DEFINITION__INCOMING_SENTRYS:
				return getIncomingSentrys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CMMNPackage.PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS:
				getOutgoingSentrys().clear();
				getOutgoingSentrys().addAll((Collection<? extends Sentry>)newValue);
				return;
			case CMMNPackage.PLAN_ITEM_DEFINITION__DECORATORS:
				getDecorators().clear();
				getDecorators().addAll((Collection<? extends Decorator>)newValue);
				return;
			case CMMNPackage.PLAN_ITEM_DEFINITION__INCOMING_SENTRYS:
				getIncomingSentrys().clear();
				getIncomingSentrys().addAll((Collection<? extends Sentry>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CMMNPackage.PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS:
				getOutgoingSentrys().clear();
				return;
			case CMMNPackage.PLAN_ITEM_DEFINITION__DECORATORS:
				getDecorators().clear();
				return;
			case CMMNPackage.PLAN_ITEM_DEFINITION__INCOMING_SENTRYS:
				getIncomingSentrys().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CMMNPackage.PLAN_ITEM_DEFINITION__OUTGOING_SENTRYS:
				return outgoingSentrys != null && !outgoingSentrys.isEmpty();
			case CMMNPackage.PLAN_ITEM_DEFINITION__DECORATORS:
				return decorators != null && !decorators.isEmpty();
			case CMMNPackage.PLAN_ITEM_DEFINITION__INCOMING_SENTRYS:
				return incomingSentrys != null && !incomingSentrys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CMMNPackage.PLAN_ITEM_DEFINITION___IS_USED__DIAGNOSTICCHAIN_MAP:
				return isUsed((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
			case CMMNPackage.PLAN_ITEM_DEFINITION___IS_NO_CIRCLE__DIAGNOSTICCHAIN_MAP:
				return isNoCircle((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PlanItemDefinitionImpl
