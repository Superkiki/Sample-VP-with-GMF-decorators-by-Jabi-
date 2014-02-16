/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.jabi.gmf.mymodel.MyElement;
import org.jabi.gmf.mymodel.MyLink;
import org.jabi.gmf.mymodel.MyModel;
import org.jabi.gmf.mymodel.MyPointer;
import org.jabi.gmf.mymodel.MymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyModelImpl#getOwnedMyElements <em>Owned My Elements</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyModelImpl#getOwnedMyLinks <em>Owned My Links</em>}</li>
 *   <li>{@link org.jabi.gmf.mymodel.impl.MyModelImpl#getOwnedMyPointers <em>Owned My Pointers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyModelImpl extends EObjectImpl implements MyModel {
  /**
   * The cached value of the '{@link #getOwnedMyElements() <em>Owned My Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedMyElements()
   * @generated
   * @ordered
   */
  protected EList<MyElement> ownedMyElements;

  /**
   * The cached value of the '{@link #getOwnedMyLinks() <em>Owned My Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedMyLinks()
   * @generated
   * @ordered
   */
  protected EList<MyLink> ownedMyLinks;

  /**
   * The cached value of the '{@link #getOwnedMyPointers() <em>Owned My Pointers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedMyPointers()
   * @generated
   * @ordered
   */
  protected EList<MyPointer> ownedMyPointers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return MymodelPackage.Literals.MY_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MyElement> getOwnedMyElements() {
    if (ownedMyElements == null) {
      ownedMyElements = new EObjectContainmentEList<MyElement>(MyElement.class, this, MymodelPackage.MY_MODEL__OWNED_MY_ELEMENTS);
    }
    return ownedMyElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MyLink> getOwnedMyLinks() {
    if (ownedMyLinks == null) {
      ownedMyLinks = new EObjectContainmentEList<MyLink>(MyLink.class, this, MymodelPackage.MY_MODEL__OWNED_MY_LINKS);
    }
    return ownedMyLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MyPointer> getOwnedMyPointers() {
    if (ownedMyPointers == null) {
      ownedMyPointers = new EObjectContainmentEList<MyPointer>(MyPointer.class, this, MymodelPackage.MY_MODEL__OWNED_MY_POINTERS);
    }
    return ownedMyPointers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case MymodelPackage.MY_MODEL__OWNED_MY_ELEMENTS:
        return ((InternalEList<?>)getOwnedMyElements()).basicRemove(otherEnd, msgs);
      case MymodelPackage.MY_MODEL__OWNED_MY_LINKS:
        return ((InternalEList<?>)getOwnedMyLinks()).basicRemove(otherEnd, msgs);
      case MymodelPackage.MY_MODEL__OWNED_MY_POINTERS:
        return ((InternalEList<?>)getOwnedMyPointers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case MymodelPackage.MY_MODEL__OWNED_MY_ELEMENTS:
        return getOwnedMyElements();
      case MymodelPackage.MY_MODEL__OWNED_MY_LINKS:
        return getOwnedMyLinks();
      case MymodelPackage.MY_MODEL__OWNED_MY_POINTERS:
        return getOwnedMyPointers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case MymodelPackage.MY_MODEL__OWNED_MY_ELEMENTS:
        getOwnedMyElements().clear();
        getOwnedMyElements().addAll((Collection<? extends MyElement>)newValue);
        return;
      case MymodelPackage.MY_MODEL__OWNED_MY_LINKS:
        getOwnedMyLinks().clear();
        getOwnedMyLinks().addAll((Collection<? extends MyLink>)newValue);
        return;
      case MymodelPackage.MY_MODEL__OWNED_MY_POINTERS:
        getOwnedMyPointers().clear();
        getOwnedMyPointers().addAll((Collection<? extends MyPointer>)newValue);
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
      case MymodelPackage.MY_MODEL__OWNED_MY_ELEMENTS:
        getOwnedMyElements().clear();
        return;
      case MymodelPackage.MY_MODEL__OWNED_MY_LINKS:
        getOwnedMyLinks().clear();
        return;
      case MymodelPackage.MY_MODEL__OWNED_MY_POINTERS:
        getOwnedMyPointers().clear();
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
      case MymodelPackage.MY_MODEL__OWNED_MY_ELEMENTS:
        return ownedMyElements != null && !ownedMyElements.isEmpty();
      case MymodelPackage.MY_MODEL__OWNED_MY_LINKS:
        return ownedMyLinks != null && !ownedMyLinks.isEmpty();
      case MymodelPackage.MY_MODEL__OWNED_MY_POINTERS:
        return ownedMyPointers != null && !ownedMyPointers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MyModelImpl
