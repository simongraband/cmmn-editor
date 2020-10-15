package org.eclipse.emfcloud.cmmn.glsp.palette;

import java.util.List;
import java.util.Map;

import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.glsp.server.actions.TriggerEdgeCreationAction;
import org.eclipse.glsp.server.actions.TriggerNodeCreationAction;
import org.eclipse.glsp.server.features.toolpalette.PaletteItem;
import org.eclipse.glsp.server.features.toolpalette.ToolPaletteItemProvider;
import org.eclipse.glsp.server.model.GModelState;

import com.google.common.collect.Lists;

public class CMMNToolPaletteItemProvider implements ToolPaletteItemProvider {

	@Override
	public List<PaletteItem> getItems(Map<String, String> args, GModelState modelState) {
		System.err.println("Create palette");
		return Lists.newArrayList(nodes(), edges(), other());
	}

	private PaletteItem nodes() {
		PaletteItem createCase = node(Types.CASE, "Case");
		PaletteItem createCaseFile = node(Types.CASEFILE, "CaseFile");
		PaletteItem createStage = node(Types.STAGE, "Stage");
		PaletteItem createHumanTask = node(Types.TASK_HUMAN, "Human Task");
		PaletteItem createProcessTask = node(Types.TASK_PROCESS, "Process Task");
		PaletteItem createEventListener = node(Types.EVENTLISTENER, "EventListener");

		List<PaletteItem> nodes = Lists.newArrayList(createCase, createCaseFile, createStage, createHumanTask, createProcessTask, createEventListener);
		return PaletteItem.createPaletteGroup("cmmn.classifier", "Nodes", nodes);
	}

	private PaletteItem edges() {
		PaletteItem createEntrySentry = edge(Types.SENTRY_ENTRY, "Sentry with Entry Criterion");
		PaletteItem createExitSentry = edge(Types.SENTRY_EXIT, "Sentry with Exit Criterion");

		List<PaletteItem> edges = Lists.newArrayList(createEntrySentry, createExitSentry);
		return PaletteItem.createPaletteGroup("cmmn.edges", "Edges", edges);
	}

	private PaletteItem other() {
		PaletteItem createHTTPHook = node(Types.HTTPDECORATOR, "HTTPHookDecorator");
		PaletteItem createMandatory = node(Types.MANDATORYDECORATOR, "MandatoryDecorator");

		List<PaletteItem> other = Lists.newArrayList(createHTTPHook, createMandatory);
		
		return PaletteItem.createPaletteGroup("cmmn.other", "Decorators", other);
	}

	private PaletteItem node(String elementTypeId, String label) {
		return new PaletteItem(elementTypeId, label, new TriggerNodeCreationAction(elementTypeId));
	}

	private PaletteItem edge(String elementTypeId, String label) {
		return new PaletteItem(elementTypeId, label, new TriggerEdgeCreationAction(elementTypeId));
	}
}
