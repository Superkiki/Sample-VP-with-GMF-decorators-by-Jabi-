/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jabi.gmf.mymodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MymodelFactoryImpl extends EFactoryImpl implements MymodelFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MymodelFactory init() {
    try {
      MymodelFactory theMymodelFactory = (MymodelFactory)EPackage.Registry.INSTANCE.getEFactory("mymodel"); 
      if (theMymodelFactory != null) {
        return theMymodelFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MymodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MymodelFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case MymodelPackage.MY_MODEL: return createMyModel();
      case MymodelPackage.MY_ELEMENT: return createMyElement();
      case MymodelPackage.MY_LINK: return createMyLink();
      case MymodelPackage.MY_POINTER: return createMyPointer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyModel createMyModel() {
    MyModelImpl myModel = new MyModelImpl();
    return myModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyElement createMyElement() {
    MyElementImpl myElement = new MyElementImpl();
    return myElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyLink createMyLink() {
    MyLinkImpl myLink = new MyLinkImpl();
    return myLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyPointer createMyPointer() {
    MyPointerImpl myPointer = new MyPointerImpl();
    return myPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MymodelPackage getMymodelPackage() {
    return (MymodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MymodelPackage getPackage() {
    return MymodelPackage.eINSTANCE;
  }

} //MymodelFactoryImpl
