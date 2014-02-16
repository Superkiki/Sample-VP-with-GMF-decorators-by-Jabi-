/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jabi.gmf.mymodel.MymodelPackage
 * @generated
 */
public interface MymodelFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MymodelFactory eINSTANCE = org.jabi.gmf.mymodel.impl.MymodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>My Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Model</em>'.
   * @generated
   */
  MyModel createMyModel();

  /**
   * Returns a new object of class '<em>My Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Element</em>'.
   * @generated
   */
  MyElement createMyElement();

  /**
   * Returns a new object of class '<em>My Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Link</em>'.
   * @generated
   */
  MyLink createMyLink();

  /**
   * Returns a new object of class '<em>My Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Pointer</em>'.
   * @generated
   */
  MyPointer createMyPointer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MymodelPackage getMymodelPackage();

} //MymodelFactory
