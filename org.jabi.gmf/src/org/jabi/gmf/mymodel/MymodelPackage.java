/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jabi.gmf.mymodel.MymodelFactory
 * @model kind="package"
 * @generated
 */
public interface MymodelPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mymodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "mymodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mymodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MymodelPackage eINSTANCE = org.jabi.gmf.mymodel.impl.MymodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.jabi.gmf.mymodel.impl.MyModelImpl <em>My Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jabi.gmf.mymodel.impl.MyModelImpl
   * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyModel()
   * @generated
   */
  int MY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Owned My Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_MODEL__OWNED_MY_ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Owned My Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_MODEL__OWNED_MY_LINKS = 1;

  /**
   * The feature id for the '<em><b>Owned My Pointers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_MODEL__OWNED_MY_POINTERS = 2;

  /**
   * The number of structural features of the '<em>My Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jabi.gmf.mymodel.impl.MyElementImpl <em>My Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jabi.gmf.mymodel.impl.MyElementImpl
   * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyElement()
   * @generated
   */
  int MY_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>My Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jabi.gmf.mymodel.impl.MyLinkImpl <em>My Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jabi.gmf.mymodel.impl.MyLinkImpl
   * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyLink()
   * @generated
   */
  int MY_LINK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_LINK__NAME = 0;

  /**
   * The feature id for the '<em><b>My Link Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_LINK__MY_LINK_SOURCE = 1;

  /**
   * The feature id for the '<em><b>My Link Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_LINK__MY_LINK_TARGET = 2;

  /**
   * The number of structural features of the '<em>My Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_LINK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jabi.gmf.mymodel.impl.MyPointerImpl <em>My Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jabi.gmf.mymodel.impl.MyPointerImpl
   * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyPointer()
   * @generated
   */
  int MY_POINTER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_POINTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Points Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_POINTER__POINTS_LINK = 1;

  /**
   * The feature id for the '<em><b>Points Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_POINTER__POINTS_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>My Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_POINTER_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.jabi.gmf.mymodel.MyModel <em>My Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Model</em>'.
   * @see org.jabi.gmf.mymodel.MyModel
   * @generated
   */
  EClass getMyModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.jabi.gmf.mymodel.MyModel#getOwnedMyElements <em>Owned My Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned My Elements</em>'.
   * @see org.jabi.gmf.mymodel.MyModel#getOwnedMyElements()
   * @see #getMyModel()
   * @generated
   */
  EReference getMyModel_OwnedMyElements();

  /**
   * Returns the meta object for the containment reference list '{@link org.jabi.gmf.mymodel.MyModel#getOwnedMyLinks <em>Owned My Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned My Links</em>'.
   * @see org.jabi.gmf.mymodel.MyModel#getOwnedMyLinks()
   * @see #getMyModel()
   * @generated
   */
  EReference getMyModel_OwnedMyLinks();

  /**
   * Returns the meta object for the containment reference list '{@link org.jabi.gmf.mymodel.MyModel#getOwnedMyPointers <em>Owned My Pointers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned My Pointers</em>'.
   * @see org.jabi.gmf.mymodel.MyModel#getOwnedMyPointers()
   * @see #getMyModel()
   * @generated
   */
  EReference getMyModel_OwnedMyPointers();

  /**
   * Returns the meta object for class '{@link org.jabi.gmf.mymodel.MyElement <em>My Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Element</em>'.
   * @see org.jabi.gmf.mymodel.MyElement
   * @generated
   */
  EClass getMyElement();

  /**
   * Returns the meta object for the attribute '{@link org.jabi.gmf.mymodel.MyElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jabi.gmf.mymodel.MyElement#getName()
   * @see #getMyElement()
   * @generated
   */
  EAttribute getMyElement_Name();

  /**
   * Returns the meta object for class '{@link org.jabi.gmf.mymodel.MyLink <em>My Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Link</em>'.
   * @see org.jabi.gmf.mymodel.MyLink
   * @generated
   */
  EClass getMyLink();

  /**
   * Returns the meta object for the attribute '{@link org.jabi.gmf.mymodel.MyLink#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jabi.gmf.mymodel.MyLink#getName()
   * @see #getMyLink()
   * @generated
   */
  EAttribute getMyLink_Name();

  /**
   * Returns the meta object for the reference '{@link org.jabi.gmf.mymodel.MyLink#getMyLinkSource <em>My Link Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>My Link Source</em>'.
   * @see org.jabi.gmf.mymodel.MyLink#getMyLinkSource()
   * @see #getMyLink()
   * @generated
   */
  EReference getMyLink_MyLinkSource();

  /**
   * Returns the meta object for the reference '{@link org.jabi.gmf.mymodel.MyLink#getMyLinkTarget <em>My Link Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>My Link Target</em>'.
   * @see org.jabi.gmf.mymodel.MyLink#getMyLinkTarget()
   * @see #getMyLink()
   * @generated
   */
  EReference getMyLink_MyLinkTarget();

  /**
   * Returns the meta object for class '{@link org.jabi.gmf.mymodel.MyPointer <em>My Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Pointer</em>'.
   * @see org.jabi.gmf.mymodel.MyPointer
   * @generated
   */
  EClass getMyPointer();

  /**
   * Returns the meta object for the attribute '{@link org.jabi.gmf.mymodel.MyPointer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jabi.gmf.mymodel.MyPointer#getName()
   * @see #getMyPointer()
   * @generated
   */
  EAttribute getMyPointer_Name();

  /**
   * Returns the meta object for the reference '{@link org.jabi.gmf.mymodel.MyPointer#getPointsLink <em>Points Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Points Link</em>'.
   * @see org.jabi.gmf.mymodel.MyPointer#getPointsLink()
   * @see #getMyPointer()
   * @generated
   */
  EReference getMyPointer_PointsLink();

  /**
   * Returns the meta object for the reference '{@link org.jabi.gmf.mymodel.MyPointer#getPointsElement <em>Points Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Points Element</em>'.
   * @see org.jabi.gmf.mymodel.MyPointer#getPointsElement()
   * @see #getMyPointer()
   * @generated
   */
  EReference getMyPointer_PointsElement();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MymodelFactory getMymodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.jabi.gmf.mymodel.impl.MyModelImpl <em>My Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jabi.gmf.mymodel.impl.MyModelImpl
     * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyModel()
     * @generated
     */
    EClass MY_MODEL = eINSTANCE.getMyModel();

    /**
     * The meta object literal for the '<em><b>Owned My Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_MODEL__OWNED_MY_ELEMENTS = eINSTANCE.getMyModel_OwnedMyElements();

    /**
     * The meta object literal for the '<em><b>Owned My Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_MODEL__OWNED_MY_LINKS = eINSTANCE.getMyModel_OwnedMyLinks();

    /**
     * The meta object literal for the '<em><b>Owned My Pointers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_MODEL__OWNED_MY_POINTERS = eINSTANCE.getMyModel_OwnedMyPointers();

    /**
     * The meta object literal for the '{@link org.jabi.gmf.mymodel.impl.MyElementImpl <em>My Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jabi.gmf.mymodel.impl.MyElementImpl
     * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyElement()
     * @generated
     */
    EClass MY_ELEMENT = eINSTANCE.getMyElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_ELEMENT__NAME = eINSTANCE.getMyElement_Name();

    /**
     * The meta object literal for the '{@link org.jabi.gmf.mymodel.impl.MyLinkImpl <em>My Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jabi.gmf.mymodel.impl.MyLinkImpl
     * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyLink()
     * @generated
     */
    EClass MY_LINK = eINSTANCE.getMyLink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_LINK__NAME = eINSTANCE.getMyLink_Name();

    /**
     * The meta object literal for the '<em><b>My Link Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_LINK__MY_LINK_SOURCE = eINSTANCE.getMyLink_MyLinkSource();

    /**
     * The meta object literal for the '<em><b>My Link Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_LINK__MY_LINK_TARGET = eINSTANCE.getMyLink_MyLinkTarget();

    /**
     * The meta object literal for the '{@link org.jabi.gmf.mymodel.impl.MyPointerImpl <em>My Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.jabi.gmf.mymodel.impl.MyPointerImpl
     * @see org.jabi.gmf.mymodel.impl.MymodelPackageImpl#getMyPointer()
     * @generated
     */
    EClass MY_POINTER = eINSTANCE.getMyPointer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_POINTER__NAME = eINSTANCE.getMyPointer_Name();

    /**
     * The meta object literal for the '<em><b>Points Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_POINTER__POINTS_LINK = eINSTANCE.getMyPointer_PointsLink();

    /**
     * The meta object literal for the '<em><b>Points Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_POINTER__POINTS_ELEMENT = eINSTANCE.getMyPointer_PointsElement();

  }

} //MymodelPackage
