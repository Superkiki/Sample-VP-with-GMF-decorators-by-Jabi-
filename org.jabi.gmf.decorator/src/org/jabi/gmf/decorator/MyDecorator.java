/**
 * Copyright (c) THALES, 2011. All rights reserved.
 */
package org.jabi.gmf.decorator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.jabi.gmf.mymodel.MyElement;
import org.jabi.gmf.mymodel.MyLink;
import org.jabi.gmf.mymodel.MyModel;
import org.jabi.gmf.mymodel.MyPointer;

import fr.obeo.dsl.viewpoint.DDiagramElement;
import fr.obeo.dsl.viewpoint.DEdge;
import fr.obeo.dsl.viewpoint.EdgeTarget;

/**
 * @author S0037407
 */
public class MyDecorator implements IDecorator {

  IDecoratorTarget decoratorTarget = null;
  IDecoration imageDecoration = null;

  /**
   * @param decoratorTarget_p
   */
  public MyDecorator(IDecoratorTarget decoratorTarget_p) {
    this.decoratorTarget = decoratorTarget_p;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void activate() {
    //
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void deactivate() {
    removeDecoration();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void refresh() {
    IGraphicalEditPart editPart = (IGraphicalEditPart) decoratorTarget.getAdapter(IGraphicalEditPart.class);
    removeDecoration();
    Image image = ImageDescriptor.createFromFile(Activator.class, "/icons/decorator.png").createImage(); //$NON-NLS-1$
    List<EObject> semanticElements = getSemanticElements(editPart);
    if (!semanticElements.isEmpty()) {
      EObject semanticElement = semanticElements.get(0);
      if (((semanticElement instanceof MyElement) && isReferencedByPointer((MyElement) semanticElement))) {
        imageDecoration = decoratorTarget.addShapeDecoration(image, IDecoratorTarget.Direction.NORTH_EAST, -1, true);
      } else if (((semanticElement instanceof MyLink) && isReferencedByPointer((MyLink) semanticElement))) {
        imageDecoration = decoratorTarget.addConnectionDecoration(image, 50, true);
      }
    }
  }

  private void removeDecoration() {
    if (imageDecoration != null) {
      decoratorTarget.removeDecoration(imageDecoration);
      imageDecoration = null;
    }
  }

  private static boolean isReferencedByPointer(MyLink link) {
    MyModel model = (MyModel) link.eContainer();
    for (MyPointer pointer : model.getOwnedMyPointers()) {
      if ((pointer.getPointsLink() != null) && pointer.getPointsLink().equals(link)) {
        return true;
      }
    }
    return false;
  }

  private boolean isReferencedByPointer(MyElement element) {
    MyModel model = (MyModel) element.eContainer();
    for (MyPointer pointer : model.getOwnedMyPointers()) {
      if ((pointer.getPointsElement() != null) && pointer.getPointsElement().equals(element)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Get semantic elements of an editPart
   * @param editPart
   * @return
   */
  private static List<EObject> getSemanticElements(IGraphicalEditPart editPart) {
    List<EObject> semanticElements = new ArrayList<EObject>();
    if (editPart instanceof IPrimaryEditPart) {
      EObject eObject = editPart.resolveSemanticElement();
      if (eObject instanceof DDiagramElement) {
        // DOREMI diagram
        semanticElements.addAll(getSemanticElements((DDiagramElement) eObject));
      } else {
        // Not a DOREMI diagram
        semanticElements.add(eObject);
      }
    }
    return semanticElements;
  }

  /**
   * This methods retrieves the semantic elements of a given diagram element. It was needed for the special case of breakdown diagram edges that does not
   * contains semantic elements
   * @param diagram element
   * @return the semantic elements
   */
  private static List<EObject> getSemanticElements(DDiagramElement element) {
    List<EObject> semanticElements = new ArrayList<EObject>();
    // If it is not empty return the list
    if (!element.getSemanticElements().isEmpty()) {
      return element.getSemanticElements();
    }
    // Else check breakdown edges special case
    else if (element instanceof DEdge) {
      DEdge edge = (DEdge) element;
      EdgeTarget edgeTarget = edge.getSourceNode();
      if (edgeTarget instanceof DDiagramElement) {
        return getSemanticElements((DDiagramElement) edgeTarget);
      }
    }
    return semanticElements;
  }
}
