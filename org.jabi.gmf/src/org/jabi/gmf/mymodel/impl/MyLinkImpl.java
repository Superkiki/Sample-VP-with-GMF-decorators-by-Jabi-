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
import org.jabi.gmf.mymodel.MymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyLinkImpl#getMyLinkSource <em>My Link Source</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyLinkImpl#getMyLinkTarget <em>My Link Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyLinkImpl extends EObjectImpl implements MyLink {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

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
   * The cached value of the '{@link #getMyLinkSource() <em>My Link Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMyLinkSource()
   * @generated
   * @ordered
   */
  protected MyElement myLinkSource;

  /**
   * The cached value of the '{@link #getMyLinkTarget() <em>My Link Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMyLinkTarget()
   * @generated
   * @ordered
   */
  protected MyElement myLinkTarget;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyLinkImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MymodelPackage.Literals.MY_LINK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MymodelPackage.MY_LINK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyElement getMyLinkSource() {
    if (myLinkSource != null && myLinkSource.eIsProxy()) {
      InternalEObject oldMyLinkSource = (InternalEObject)myLinkSource;
      myLinkSource = (MyElement)eResolveProxy(oldMyLinkSource);
      if (myLinkSource != oldMyLinkSource) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MymodelPackage.MY_LINK__MY_LINK_SOURCE, oldMyLinkSource, myLinkSource));
      }
    }
    return myLinkSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyElement basicGetMyLinkSource() {
    return myLinkSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMyLinkSource(MyElement newMyLinkSource) {
    MyElement oldMyLinkSource = myLinkSource;
    myLinkSource = newMyLinkSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MymodelPackage.MY_LINK__MY_LINK_SOURCE, oldMyLinkSource, myLinkSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyElement getMyLinkTarget() {
    if (myLinkTarget != null && myLinkTarget.eIsProxy()) {
      InternalEObject oldMyLinkTarget = (InternalEObject)myLinkTarget;
      myLinkTarget = (MyElement)eResolveProxy(oldMyLinkTarget);
      if (myLinkTarget != oldMyLinkTarget) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MymodelPackage.MY_LINK__MY_LINK_TARGET, oldMyLinkTarget, myLinkTarget));
      }
    }
    return myLinkTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyElement basicGetMyLinkTarget() {
    return myLinkTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMyLinkTarget(MyElement newMyLinkTarget) {
    MyElement oldMyLinkTarget = myLinkTarget;
    myLinkTarget = newMyLinkTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MymodelPackage.MY_LINK__MY_LINK_TARGET, oldMyLinkTarget, myLinkTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case MymodelPackage.MY_LINK__NAME:
        return getName();
      case MymodelPackage.MY_LINK__MY_LINK_SOURCE:
        if (resolve) return getMyLinkSource();
        return basicGetMyLinkSource();
      case MymodelPackage.MY_LINK__MY_LINK_TARGET:
        if (resolve) return getMyLinkTarget();
        return basicGetMyLinkTarget();
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
      case MymodelPackage.MY_LINK__NAME:
        setName((String)newValue);
        return;
      case MymodelPackage.MY_LINK__MY_LINK_SOURCE:
        setMyLinkSource((MyElement)newValue);
        return;
      case MymodelPackage.MY_LINK__MY_LINK_TARGET:
        setMyLinkTarget((MyElement)newValue);
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
      case MymodelPackage.MY_LINK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MymodelPackage.MY_LINK__MY_LINK_SOURCE:
        setMyLinkSource((MyElement)null);
        return;
      case MymodelPackage.MY_LINK__MY_LINK_TARGET:
        setMyLinkTarget((MyElement)null);
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
      case MymodelPackage.MY_LINK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MymodelPackage.MY_LINK__MY_LINK_SOURCE:
        return myLinkSource != null;
      case MymodelPackage.MY_LINK__MY_LINK_TARGET:
        return myLinkTarget != null;
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

} //MyLinkImpl
