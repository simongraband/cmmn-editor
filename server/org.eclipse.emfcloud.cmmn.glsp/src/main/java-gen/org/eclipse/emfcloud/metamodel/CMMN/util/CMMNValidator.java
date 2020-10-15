/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

import org.eclipse.emfcloud.metamodel.CMMN.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage
 * @generated
 */
public class CMMNValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CMMNValidator INSTANCE = new CMMNValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.emfcloud.metamodel.CMMN";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Duplicate Names' of 'Diagram'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CMMN_DIAGRAM__DUPLICATE_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Duplicate Stage Names' of 'Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CASE__DUPLICATE_STAGE_NAMES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Duplicate Task Names' of 'Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CASE__DUPLICATE_TASK_NAMES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Exit Sentry' of 'Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CASE__HAS_EXIT_SENTRY = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Duplicate Names' of 'Stage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STAGE__DUPLICATE_NAMES = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Used' of 'Plan Item Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_ITEM_DEFINITION__IS_USED = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is No Circle' of 'Plan Item Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_ITEM_DEFINITION__IS_NO_CIRCLE = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CMMNPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CMMNPackage.CMMN_DIAGRAM:
				return validateCMMNDiagram((CMMNDiagram)value, diagnostics, context);
			case CMMNPackage.CMMN_ELEMENT:
				return validateCMMNElement((CMMNElement)value, diagnostics, context);
			case CMMNPackage.CASE_FILE:
				return validateCaseFile((CaseFile)value, diagnostics, context);
			case CMMNPackage.CASE:
				return validateCase((Case)value, diagnostics, context);
			case CMMNPackage.STAGE:
				return validateStage((Stage)value, diagnostics, context);
			case CMMNPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case CMMNPackage.EVENT_LISTENER:
				return validateEventListener((EventListener)value, diagnostics, context);
			case CMMNPackage.SENTRY:
				return validateSentry((Sentry)value, diagnostics, context);
			case CMMNPackage.PLAN_ITEM_DEFINITION:
				return validatePlanItemDefinition((PlanItemDefinition)value, diagnostics, context);
			case CMMNPackage.TIMER_EVENT_LISTENER:
				return validateTimerEventListener((TimerEventListener)value, diagnostics, context);
			case CMMNPackage.USER_EVENT_LISTENER:
				return validateUserEventListener((UserEventListener)value, diagnostics, context);
			case CMMNPackage.TIMER_EXPRESSION:
				return validateTimerExpression((TimerExpression)value, diagnostics, context);
			case CMMNPackage.DECORATOR:
				return validateDecorator((Decorator)value, diagnostics, context);
			case CMMNPackage.MANDATORY_DECORATOR:
				return validateMandatoryDecorator((MandatoryDecorator)value, diagnostics, context);
			case CMMNPackage.HTTP_HOOK_DECORATOR:
				return validateHTTPHookDecorator((HTTPHookDecorator)value, diagnostics, context);
			case CMMNPackage.TASK_ROLE:
				return validateTaskRole((TaskRole)value, diagnostics, context);
			case CMMNPackage.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case CMMNPackage.SENTRY_TYPE:
				return validateSentryType((SentryType)value, diagnostics, context);
			case CMMNPackage.HTTP_REQUEST:
				return validateHTTPRequest((HTTPRequest)value, diagnostics, context);
			case CMMNPackage.STRING100_CHARS:
				return validateString100Chars((String)value, diagnostics, context);
			case CMMNPackage.STRING256CHARS:
				return validateString256chars((String)value, diagnostics, context);
			case CMMNPackage.URL_FORMAT:
				return validateURLFormat((String)value, diagnostics, context);
			case CMMNPackage.IF_CONDITION:
				return validateIfCondition((String)value, diagnostics, context);
			case CMMNPackage.STRING_HTTP_REQUEST:
				return validateStringHttpRequest((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMMNDiagram(CMMNDiagram cmmnDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cmmnDiagram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cmmnDiagram, diagnostics, context);
		if (result || diagnostics != null) result &= validateCMMNDiagram_duplicateNames(cmmnDiagram, diagnostics, context);
		return result;
	}

	/**
	 * Validates the duplicateNames constraint of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMMNDiagram_duplicateNames(CMMNDiagram cmmnDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cmmnDiagram.duplicateNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMMNElement(CMMNElement cmmnElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cmmnElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseFile(CaseFile caseFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caseFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCase(Case case_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(case_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validateCase_duplicateStageNames(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validateCase_duplicateTaskNames(case_, diagnostics, context);
		if (result || diagnostics != null) result &= validateCase_hasExitSentry(case_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the duplicateStageNames constraint of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCase_duplicateStageNames(Case case_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return case_.duplicateStageNames(diagnostics, context);
	}

	/**
	 * Validates the duplicateTaskNames constraint of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCase_duplicateTaskNames(Case case_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return case_.duplicateTaskNames(diagnostics, context);
	}

	/**
	 * Validates the hasExitSentry constraint of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCase_hasExitSentry(Case case_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return case_.hasExitSentry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStage(Stage stage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isUsed(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isNoCircle(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStage_duplicateNames(stage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the duplicateNames constraint of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStage_duplicateNames(Stage stage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stage.duplicateNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isUsed(task, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isNoCircle(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventListener(EventListener eventListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventListener, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isUsed(eventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isNoCircle(eventListener, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSentry(Sentry sentry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sentry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanItemDefinition(PlanItemDefinition planItemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planItemDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isUsed(planItemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isNoCircle(planItemDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the isUsed constraint of '<em>Plan Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanItemDefinition_isUsed(PlanItemDefinition planItemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planItemDefinition.isUsed(diagnostics, context);
	}

	/**
	 * Validates the isNoCircle constraint of '<em>Plan Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanItemDefinition_isNoCircle(PlanItemDefinition planItemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planItemDefinition.isNoCircle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerEventListener(TimerEventListener timerEventListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timerEventListener, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isUsed(timerEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isNoCircle(timerEventListener, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserEventListener(UserEventListener userEventListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userEventListener, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isUsed(userEventListener, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanItemDefinition_isNoCircle(userEventListener, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerExpression(TimerExpression timerExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecorator(Decorator decorator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decorator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDecorator(MandatoryDecorator mandatoryDecorator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mandatoryDecorator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPHookDecorator(HTTPHookDecorator httpHookDecorator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpHookDecorator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskRole(TaskRole taskRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSentryType(SentryType sentryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPRequest(HTTPRequest httpRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString100Chars(String string100Chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateString100Chars_Pattern(string100Chars, diagnostics, context);
		if (result || diagnostics != null) result &= validateString100Chars_MaxLength(string100Chars, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateString100Chars_Pattern
	 */
	public static final  PatternMatcher [][] STRING100_CHARS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9 /\\-]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>String100 Chars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString100Chars_Pattern(String string100Chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CMMNPackage.Literals.STRING100_CHARS, string100Chars, STRING100_CHARS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>String100 Chars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString100Chars_MaxLength(String string100Chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = string100Chars.length();
		boolean result = length <= 100;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(CMMNPackage.Literals.STRING100_CHARS, string100Chars, length, 100, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString256chars(String string256chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateString256chars_Pattern(string256chars, diagnostics, context);
		if (result || diagnostics != null) result &= validateString256chars_MaxLength(string256chars, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateString256chars_Pattern
	 */
	public static final  PatternMatcher [][] STRING256CHARS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9 /\\-]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>String256chars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString256chars_Pattern(String string256chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CMMNPackage.Literals.STRING256CHARS, string256chars, STRING256CHARS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>String256chars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString256chars_MaxLength(String string256chars, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = string256chars.length();
		boolean result = length <= 256;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(CMMNPackage.Literals.STRING256CHARS, string256chars, length, 256, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURLFormat(String urlFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURLFormat_Pattern(urlFormat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateURLFormat_Pattern
	 */
	public static final  PatternMatcher [][] URL_FORMAT__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[hH][tT]{2}[pP]://[wW]{3}.*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>URL Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURLFormat_Pattern(String urlFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CMMNPackage.Literals.URL_FORMAT, urlFormat, URL_FORMAT__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfCondition(String ifCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIfCondition_Pattern(ifCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIfCondition_Pattern
	 */
	public static final  PatternMatcher [][] IF_CONDITION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9 /]+[<>=][a-zA-Z0-9 /]+[\\+\\-*/]*[a-zA-Z0-9 /]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>If Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfCondition_Pattern(String ifCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CMMNPackage.Literals.IF_CONDITION, ifCondition, IF_CONDITION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringHttpRequest(String stringHttpRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringHttpRequest_Enumeration(stringHttpRequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStringHttpRequest_Enumeration
	 */
	public static final Collection<Object> STRING_HTTP_REQUEST__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 "GET",
				 "POST",
				 "HEAD",
				 "URL",
				 "OPTIONS",
				 "TRACE"
			 });

	/**
	 * Validates the Enumeration constraint of '<em>String Http Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringHttpRequest_Enumeration(String stringHttpRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = STRING_HTTP_REQUEST__ENUMERATION__VALUES.contains(stringHttpRequest);
		if (!result && diagnostics != null)
			reportEnumerationViolation(CMMNPackage.Literals.STRING_HTTP_REQUEST, stringHttpRequest, STRING_HTTP_REQUEST__ENUMERATION__VALUES, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CMMNValidator
