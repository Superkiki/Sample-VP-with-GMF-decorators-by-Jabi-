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
 * A representation of the model object '<em><b>My Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jabi.gmf.mymodel.MyLink#getName <em>Name</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.MyLink#getMyLinkSource <em>My Link Source</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.MyLink#getMyLinkTarget <em>My Link Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jabi.gmf.mymodel.MymodelPackage#getMyLink()
 * @model
 * @generated
 */
public interface MyLink extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyLink_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jabi.gmf.mymodel.MyLink#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>My Link Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>My Link Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>My Link Source</em>' reference.
   * @see #setMyLinkSource(MyElement)
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyLink_MyLinkSource()
   * @model
   * @generated
   */
  MyElement getMyLinkSource();

  /**
   * Sets the value of the '{@link org.jabi.gmf.mymodel.MyLink#getMyLinkSource <em>My Link Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>My Link Source</em>' reference.
   * @see #getMyLinkSource()
   * @generated
   */
  void setMyLinkSource(MyElement value);

  /**
   * Returns the value of the '<em><b>My Link Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>My Link Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>My Link Target</em>' reference.
   * @see #setMyLinkTarget(MyElement)
   * @see org.jabi.gmf.mymodel.MymodelPackage#getMyLink_MyLinkTarget()
   * @model
   * @generated
   */
  MyElement getMyLinkTarget();

  /**
   * Sets the value of the '{@link org.jabi.gmf.mymodel.MyLink#getMyLinkTarget <em>My Link Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>My Link Target</em>' reference.
   * @see #getMyLinkTarget()
   * @generated
   */
  void setMyLinkTarget(MyElement value);

} // MyLink
