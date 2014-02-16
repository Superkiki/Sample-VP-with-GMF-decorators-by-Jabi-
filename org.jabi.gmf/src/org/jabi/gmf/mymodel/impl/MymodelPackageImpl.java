/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jabi.gmf.mymodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.jabi.gmf.mymodel.MyElement;
import org.jabi.gmf.mymodel.MyLink;
import org.jabi.gmf.mymodel.MyModel;
import org.jabi.gmf.mymodel.MyPointer;
import org.jabi.gmf.mymodel.MymodelFactory;
import org.jabi.gmf.mymodel.MymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MymodelPackageImpl extends EPackageImpl implements MymodelPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myPointerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.jabi.gmf.mymodel.MymodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MymodelPackageImpl() {
    super(eNS_URI, MymodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MymodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MymodelPackage init() {
    if (isInited) return (MymodelPackage)EPackage.Registry.INSTANCE.getEPackage(MymodelPackage.eNS_URI);

    // Obtain or create and register package
    MymodelPackageImpl theMymodelPackage = (MymodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MymodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MymodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMymodelPackage.createPackageContents();

    // Initialize created meta-data
    theMymodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMymodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MymodelPackage.eNS_URI, theMymodelPackage);
    return theMymodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyModel() {
    return myModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyModel_OwnedMyElements() {
    return (EReference)myModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyModel_OwnedMyLinks() {
    return (EReference)myModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyModel_OwnedMyPointers() {
    return (EReference)myModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyElement() {
    return myElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyElement_Name() {
    return (EAttribute)myElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyLink() {
    return myLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyLink_Name() {
    return (EAttribute)myLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyLink_MyLinkSource() {
    return (EReference)myLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyLink_MyLinkTarget() {
    return (EReference)myLinkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyPointer() {
    return myPointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyPointer_Name() {
    return (EAttribute)myPointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyPointer_PointsLink() {
    return (EReference)myPointerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyPointer_PointsElement() {
    return (EReference)myPointerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MymodelFactory getMymodelFactory() {
    return (MymodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    myModelEClass = createEClass(MY_MODEL);
    createEReference(myModelEClass, MY_MODEL__OWNED_MY_ELEMENTS);
    createEReference(myModelEClass, MY_MODEL__OWNED_MY_LINKS);
    createEReference(myModelEClass, MY_MODEL__OWNED_MY_POINTERS);

    myElementEClass = createEClass(MY_ELEMENT);
    createEAttribute(myElementEClass, MY_ELEMENT__NAME);

    myLinkEClass = createEClass(MY_LINK);
    createEAttribute(myLinkEClass, MY_LINK__NAME);
    createEReference(myLinkEClass, MY_LINK__MY_LINK_SOURCE);
    createEReference(myLinkEClass, MY_LINK__MY_LINK_TARGET);

    myPointerEClass = createEClass(MY_POINTER);
    createEAttribute(myPointerEClass, MY_POINTER__NAME);
    createEReference(myPointerEClass, MY_POINTER__POINTS_LINK);
    createEReference(myPointerEClass, MY_POINTER__POINTS_ELEMENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(myModelEClass, MyModel.class, "MyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMyModel_OwnedMyElements(), this.getMyElement(), null, "ownedMyElements", null, 0, -1, MyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyModel_OwnedMyLinks(), this.getMyLink(), null, "ownedMyLinks", null, 0, -1, MyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyModel_OwnedMyPointers(), this.getMyPointer(), null, "ownedMyPointers", null, 0, -1, MyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(myElementEClass, MyElement.class, "MyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMyElement_Name(), ecorePackage.getEString(), "name", "", 0, 1, MyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(myLinkEClass, MyLink.class, "MyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMyLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, MyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyLink_MyLinkSource(), this.getMyElement(), null, "myLinkSource", null, 0, 1, MyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyLink_MyLinkTarget(), this.getMyElement(), null, "myLinkTarget", null, 0, 1, MyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(myPointerEClass, MyPointer.class, "MyPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMyPointer_Name(), ecorePackage.getEString(), "name", "", 0, 1, MyPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyPointer_PointsLink(), this.getMyLink(), null, "pointsLink", null, 0, 1, MyPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyPointer_PointsElement(), this.getMyElement(), null, "pointsElement", null, 0, 1, MyPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MymodelPackageImpl
