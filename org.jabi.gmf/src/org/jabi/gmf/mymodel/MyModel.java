/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jabi.gmf.mymodel.MyModel#getOwnedMyElements <em>Owned My Elements</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.MyModel#getOwnedMyLinks <em>Owned My Links</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.MyModel#getOwnedMyPointers <em>Owned My Pointers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jabi.gmf.mymodel.MymodelPackage#getMyModel()
 * @model
 * @generated
 */
public interface MyModel extends EObject {
  /**
   * Returns the value of the '<em><b>Owned My Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.jabi.gmf.mymodel.MyElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned My Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned My Elements</em>' containment reference list.
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyModel_OwnedMyElements()
   * @model containment="true"
   * @generated
   */
  EList<MyElement> getOwnedMyElements();

  /**
   * Returns the value of the '<em><b>Owned My Links</b></em>' containment reference list.
   * The list contents are of type {@link org.jabi.gmf.mymodel.MyLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned My Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned My Links</em>' containment reference list.
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyModel_OwnedMyLinks()
   * @model containment="true"
   * @generated
   */
  EList<MyLink> getOwnedMyLinks();

  /**
   * Returns the value of the '<em><b>Owned My Pointers</b></em>' containment reference list.
   * The list contents are of type {@link org.jabi.gmf.mymodel.MyPointer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned My Pointers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned My Pointers</em>' containment reference list.
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyModel_OwnedMyPointers()
   * @model containment="true"
   * @generated
   */
  EList<MyPointer> getOwnedMyPointers();

} // MyModel
