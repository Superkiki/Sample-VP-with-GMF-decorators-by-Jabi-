/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jabi.gmf.mymodel.MyPointer#getName <em>Name</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.MyPointer#getPointsLink <em>Points Link</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.MyPointer#getPointsElement <em>Points Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jabi.gmf.mymodel.MymodelPackage#getMyPointer()
 * @model
 * @generated
 */
public interface MyPointer extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyPointer_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jabi.gmf.mymodel.MyPointer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Points Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points Link</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points Link</em>' reference.
   * @see #setPointsLink(MyLink)
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyPointer_PointsLink()
   * @model
   * @generated
   */
  MyLink getPointsLink();

  /**
   * Sets the value of the '{@link org.jabi.gmf.mymodel.MyPointer#getPointsLink <em>Points Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Points Link</em>' reference.
   * @see #getPointsLink()
   * @generated
   */
  void setPointsLink(MyLink value);

  /**
   * Returns the value of the '<em><b>Points Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Points Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Points Element</em>' reference.
   * @see #setPointsElement(MyElement)
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyPointer_PointsElement()
   * @model
   * @generated
   */
  MyElement getPointsElement();

  /**
   * Sets the value of the '{@link org.jabi.gmf.mymodel.MyPointer#getPointsElement <em>Points Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Points Element</em>' reference.
   * @see #getPointsElement()
   * @generated
   */
  void setPointsElement(MyElement value);

} // MyPointer
