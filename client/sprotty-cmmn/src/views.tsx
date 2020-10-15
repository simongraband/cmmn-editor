/* eslint-disable*/
/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
import { injectable } from "inversify";
import * as snabbdom from "snabbdom-jsx";
import { VNode } from "snabbdom/vnode";
import {
  Point,
  PolylineEdgeView,
  RectangularNodeView,
  RenderingContext,
  SEdge,
  toDegrees,
} from "sprotty/lib";

import { LabeledNode, Icon, ActivityNode} from "./model";
import { getSubType, IView, SCompartment, setAttr } from "@eclipse-glsp/client";

/** @jsx svg */
const JSX = { createElement: snabbdom.svg };
@injectable()
export class TaskNodeView extends RectangularNodeView {
  render(node: LabeledNode, context: RenderingContext): VNode {

    return <g class-node={true}>
      <defs>
        <filter id="dropShadow">
          <feDropShadow dx="0.5" dy="0.5" stdDeviation="0.4" />
        </filter>
      </defs>
      <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
        x={0} y={0} rx={6} ry={6}
        width={node.bounds.width} height={node.bounds.height} />
      {context.renderChildren(node)}
    </g>;
  }
}

@injectable()
export class ProcessTaskNodeView extends RectangularNodeView {
  render(node: LabeledNode, context: RenderingContext): VNode {
    const image = require("../images/Process.svg");

    return <g class-node={true}>

      <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
        x={0} y={0} rx={6} ry={6}
        width={node.bounds.width} height={node.bounds.height} />
        <image class-sprotty-icon={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
       href={image} x={2} y={2} width={12} height={12}></image>
      {context.renderChildren(node)}
    </g>;
  }
}

@injectable()
export class HumanTaskNodeView extends RectangularNodeView {
  render(node: LabeledNode, context: RenderingContext): VNode {
    const image = require("../images/Human.svg");

    return <g class-node={true}>

      <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
        x={0} y={0} rx={6} ry={6}
        width={node.bounds.width} height={node.bounds.height} />
        <image class-sprotty-icon={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
       href={image} x={2} y={2} width={12} height={12}></image>
      {context.renderChildren(node)}
    </g>;
  }
}

@injectable()
export class StageNodeView extends RectangularNodeView {
  render(node: LabeledNode, context: RenderingContext): VNode {

    return <g class-node={true}>
      <defs>
        <filter id="dropShadow">
          <feDropShadow dx="0.5" dy="0.5" stdDeviation="0.4" />
        </filter>
      </defs>

      <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
        x={0} y={0} rx={0} ry={0}
        width={Math.max(node.bounds.width,700)} height={Math.max(node.bounds.height, 350)} />
      {context.renderChildren(node)}
    </g>;
  }
}

@injectable()
export class CaseNodeView extends RectangularNodeView {
  render(node: LabeledNode, context: RenderingContext): VNode {
    return <g class-node={true}>
      <defs>
        <filter id="dropShadow">
          <feDropShadow dx="0.5" dy="0.5" stdDeviation="0.4" />
        </filter>
      </defs>

      <path class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback} d="M -10,35 L 0,0 L 200,0 L 210,35"/>

      <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
        x={-20} y={35} rx={0} ry={0}
        width={Math.max(node.bounds.width,1600)} height={Math.max(node.bounds.height, 800)} />
      {context.renderChildren(node)}
    </g>;
  }
}
@injectable()
export class EventListenerNodeView extends RectangularNodeView {
  render(node: LabeledNode, context: RenderingContext): VNode {
    const image = require("../images/EventListener.svg");

    return <g class-node={true}>

      <image class-sprotty-icon={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
       href={image} x={(node.bounds.width/2)-32} y={-64} width={64} height={64}></image>
      <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
        x={0} y={0} rx={6} ry={6}
        width={node.bounds.width} height={node.bounds.height} />
      {context.renderChildren(node)}
    </g>;
  }
}

@injectable()
export class CaseFileNodeView extends RectangularNodeView {
  render(node: LabeledNode, context: RenderingContext): VNode {
    const image = require("../images/CaseFile.svg");

    return <g class-node={true}>

      <image class-sprotty-icon={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
       href={image} x={(node.bounds.width/2)-32} y={-64} width={64} height={64}></image>
      <rect class-sprotty-node={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
        x={0} y={0} rx={6} ry={6}
        width={node.bounds.width} height={node.bounds.height} />
      {context.renderChildren(node)}
    </g>;
  }
}

@injectable()
export class EntryEdgeView extends PolylineEdgeView {
  protected renderAdditionals(edge: SEdge, segments: Point[], context: RenderingContext): VNode[] {
    //const p1 = segments[segments.length - 2];
    const p2 = segments[segments.length - 1];
    return [
      <path class-sprotty-edge={true} class-entry={true} d="M 0,-14 L 8,0 L 0,14 L -8,0 Z"
        transform={`translate(${p2.x} ${p2.y})`} />,
    ];
  }
}

@injectable()
export class DecoratorNodeView extends RectangularNodeView {
    render(node: ActivityNode, context: RenderingContext): VNode {
      const image = require("../images/Mandatory.svg");
        const graph = <g>
            <rect class-sprotty-node={true}
                class-mouseover={node.hoverFeedback} class-selected={node.selected}
                width={16} height={16}></rect>
            <image class-sprotty-icon={true} class-selected={node.selected} class-mouseover={node.hoverFeedback}
       href={image} x={2} y={2} width={12} height={12}></image>
        </g>;
        return graph;
    }
}

@injectable()
export class IconView implements IView {
  render(element: Icon, context: RenderingContext): VNode {
    const image = require("../images/" + element.iconImageName);

    return <g>
      <image class-sprotty-icon={true} href={image} x={0} y={0} width={16} height={16}></image>
      {context.renderChildren(element)}
    </g>;
  }
}

@injectable()
export class ArrowEdgeView extends PolylineEdgeView {
    protected renderAdditionals(edge: SEdge, segments: Point[], context: RenderingContext): VNode[] {
        const p1 = segments[segments.length - 2];
        const p2 = segments[segments.length - 1];
        return [
            <path class-sprotty-edge={true} d="M 10,-4 L 0,0 L 10,4"
                transform={`rotate(${angle(p2, p1)} ${p2.x} ${p2.y}) translate(${p2.x} ${p2.y})`} />
        ];
    }
}

@injectable()
export class ExitEdgeView extends PolylineEdgeView {
  protected renderAdditionals(edge: SEdge, segments: Point[], context: RenderingContext): VNode[] {
    //const p1 = segments[segments.length - 2];
    const p2 = segments[segments.length - 1];
    return [
      <path class-sprotty-edge={true} class-exit={true} d="M 0,-14 L 8,0 L 0,14 L -8,0 Z"
        transform={`translate(${p2.x} ${p2.y})`} />,
    ];
  }
}

@injectable()
export class CustomCompartmentView implements IView {
    render(compartment: Readonly<SCompartment>, context: RenderingContext): VNode | undefined {
        const vnode = <g class-sprotty-comp="{true}">
            {context.renderChildren(compartment)}
        </g>;
        const subType = getSubType(compartment);
        if (subType)
            setAttr(vnode, "class", subType);
        return vnode;
    }
}

export function angle(x0: Point, x1: Point): number {
  return toDegrees(Math.atan2(x1.y - x0.y, x1.x - x0.x));
}
