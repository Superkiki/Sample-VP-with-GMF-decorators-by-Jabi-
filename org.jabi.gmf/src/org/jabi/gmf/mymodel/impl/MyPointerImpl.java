/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.jabi.gmf.mymodel.MyElement;
import org.jabi.gmf.mymodel.MyLink;
import org.jabi.gmf.mymodel.MyPointer;
import org.jabi.gmf.mymodel.MymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyPointerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyPointerImpl#getPointsLink <em>Points Link</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyPointerImpl#getPointsElement <em>Points Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyPointerImpl extends EObjectImpl implements MyPointer {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "";
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;
  /**
   * The cached value of the '{@link #getPointsLink() <em>Points Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointsLink()
   * @generated
   * @ordered
   */
  protected MyLink pointsLink;
  /**
   * The cached value of the '{@link #getPointsElement() <em>Points Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointsElement()
   * @generated
   * @ordered
   */
  protected MyElement pointsElement;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyPointerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MymodelPackage.Literals.MY_POINTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MymodelPackage.MY_POINTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyLink getPointsLink() {
    if (pointsLink != null && pointsLink.eIsProxy()) {
      InternalEObject oldPointsLink = (InternalEObject)pointsLink;
      pointsLink = (MyLink)eResolveProxy(oldPointsLink);
      if (pointsLink != oldPointsLink) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MymodelPackage.MY_POINTER__POINTS_LINK, oldPointsLink, pointsLink));
      }
    }
    return pointsLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyLink basicGetPointsLink() {
    return pointsLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointsLink(MyLink newPointsLink) {
    MyLink oldPointsLink = pointsLink;
    pointsLink = newPointsLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MymodelPackage.MY_POINTER__POINTS_LINK, oldPointsLink, pointsLink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyElement getPointsElement() {
    if (pointsElement != null && pointsElement.eIsProxy()) {
      InternalEObject oldPointsElement = (InternalEObject)pointsElement;
      pointsElement = (MyElement)eResolveProxy(oldPointsElement);
      if (pointsElement != oldPointsElement) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MymodelPackage.MY_POINTER__POINTS_ELEMENT, oldPointsElement, pointsElement));
      }
    }
    return pointsElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyElement basicGetPointsElement() {
    return pointsElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointsElement(MyElement newPointsElement) {
    MyElement oldPointsElement = pointsElement;
    pointsElement = newPointsElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MymodelPackage.MY_POINTER__POINTS_ELEMENT, oldPointsElement, pointsElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case MymodelPackage.MY_POINTER__NAME:
        return getName();
      case MymodelPackage.MY_POINTER__POINTS_LINK:
        if (resolve) return getPointsLink();
        return basicGetPointsLink();
      case MymodelPackage.MY_POINTER__POINTS_ELEMENT:
        if (resolve) return getPointsElement();
        return basicGetPointsElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case MymodelPackage.MY_POINTER__NAME:
        setName((String)newValue);
        return;
      case MymodelPackage.MY_POINTER__POINTS_LINK:
        setPointsLink((MyLink)newValue);
        return;
      case MymodelPackage.MY_POINTER__POINTS_ELEMENT:
        setPointsElement((MyElement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case MymodelPackage.MY_POINTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MymodelPackage.MY_POINTER__POINTS_LINK:
        setPointsLink((MyLink)null);
        return;
      case MymodelPackage.MY_POINTER__POINTS_ELEMENT:
        setPointsElement((MyElement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case MymodelPackage.MY_POINTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MymodelPackage.MY_POINTER__POINTS_LINK:
        return pointsLink != null;
      case MymodelPackage.MY_POINTER__POINTS_ELEMENT:
        return pointsElement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MyPointerImpl
