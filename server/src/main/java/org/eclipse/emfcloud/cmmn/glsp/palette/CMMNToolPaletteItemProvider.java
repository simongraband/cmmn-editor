package org.eclipse.emfcloud.cmmn.glsp.palette;

import java.util.List;
import java.util.Map;

import org.eclipse.emfcloud.cmmn.glsp.util.CMMNConfig.Types;
import org.eclipse.glsp.api.action.kind.TriggerEdgeCreationAction;
import org.eclipse.glsp.api.action.kind.TriggerNodeCreationAction;
import org.eclipse.glsp.api.model.GraphicalModelState;
import org.eclipse.glsp.api.provider.ToolPaletteItemProvider;
import org.eclipse.glsp.api.types.PaletteItem;

import com.google.common.collect.Lists;

public class CMMNToolPaletteItemProvider implements ToolPaletteItemProvider {

	@Override
	public List<PaletteItem> getItems(Map<String, String> args, GraphicalModelState modelState) {
		System.err.println("Create palette");
		return Lists.newArrayList(nodes(), edges(), other());
	}

	private PaletteItem nodes() {
		PaletteItem createCase = node(Types.CASE, "Case");
		PaletteItem createStage = node(Types.STAGE, "Stage");
		PaletteItem createHumanTask = node(Types.TASK, "Human Task");
		PaletteItem createProcessTask = node(Types.TASK, "Process Task");
		PaletteItem createEventListener = node(Types.EVENTLISTENER, "EventListener");

		List<PaletteItem> nodes = Lists.newArrayList(createCase, createStage, createHumanTask, createProcessTask, createEventListener);
		return PaletteItem.createPaletteGroup("cmmn.classifier", "Nodes", nodes);
	}

	private PaletteItem edges() {
		PaletteItem createEntrySentry = edge(Types.SENTRY_ENTRY, "Sentry with Entry Criterion");
		PaletteItem createExitSentry = edge(Types.SENTRY_EXIT, "Sentry with Exit Criterion");

		List<PaletteItem> edges = Lists.newArrayList(createEntrySentry, createExitSentry);
		return PaletteItem.createPaletteGroup("cmmn.edges", "Edges", edges);
	}

	private PaletteItem other() {
		PaletteItem createDecorator = node(Types.DECORATOR, "Decorator");

		List<PaletteItem> other = Lists.newArrayList(createDecorator);
		
		return PaletteItem.createPaletteGroup("cmmn.other", "Decorators", other);
	}

	private PaletteItem node(String elementTypeId, String label) {
		return new PaletteItem(elementTypeId, label, new TriggerNodeCreationAction(elementTypeId));
	}

	private PaletteItem edge(String elementTypeId, String label) {
		return new PaletteItem(elementTypeId, label, new TriggerEdgeCreationAction(elementTypeId));
	}
}
