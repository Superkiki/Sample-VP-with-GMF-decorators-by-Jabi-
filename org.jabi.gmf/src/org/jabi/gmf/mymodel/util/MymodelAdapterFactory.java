/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.jabi.gmf.mymodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jabi.gmf.mymodel.MymodelPackage
 * @generated
 */
public class MymodelAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MymodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MymodelAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = MymodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MymodelSwitch<Adapter> modelSwitch =
    new MymodelSwitch<Adapter>() {
      @Override
      public Adapter caseMyModel(MyModel object) {
        return createMyModelAdapter();
      }
      @Override
      public Adapter caseMyElement(MyElement object) {
        return createMyElementAdapter();
      }
      @Override
      public Adapter caseMyLink(MyLink object) {
        return createMyLinkAdapter();
      }
      @Override
      public Adapter caseMyPointer(MyPointer object) {
        return createMyPointerAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.jabi.gmf.mymodel.MyModel <em>My Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jabi.gmf.mymodel.MyModel
   * @generated
   */
  public Adapter createMyModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jabi.gmf.mymodel.MyElement <em>My Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jabi.gmf.mymodel.MyElement
   * @generated
   */
  public Adapter createMyElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jabi.gmf.mymodel.MyLink <em>My Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jabi.gmf.mymodel.MyLink
   * @generated
   */
  public Adapter createMyLinkAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jabi.gmf.mymodel.MyPointer <em>My Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jabi.gmf.mymodel.MyPointer
   * @generated
   */
  public Adapter createMyPointerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //MymodelAdapterFactory
