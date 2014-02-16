package org.jabi.gmf.decorator;

import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;

public class MyDecoratorProvider extends AbstractProvider implements IDecoratorProvider {

  @Override
  public boolean provides(IOperation operation_p) {
    if (!(operation_p instanceof CreateDecoratorsOperation)) {
      return false;
    }
    return true;
  }

  @Override
  public void createDecorators(IDecoratorTarget decoratorTarget_p) {
    decoratorTarget_p.installDecorator("MyDecorator", new MyDecorator(decoratorTarget_p)); //$NON-NLS-1$
  }

}
