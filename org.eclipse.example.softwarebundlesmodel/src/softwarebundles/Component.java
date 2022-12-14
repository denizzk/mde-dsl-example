/**
 */
package softwarebundles;

import jar.Local;
import jar.Remote;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarebundles.Component#getName <em>Name</em>}</li>
 *   <li>{@link softwarebundles.Component#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link softwarebundles.Component#getJarLocal <em>Jar Local</em>}</li>
 *   <li>{@link softwarebundles.Component#getJarRemote <em>Jar Remote</em>}</li>
 * </ul>
 *
 * @see softwarebundles.SoftwarebundlesPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see softwarebundles.SoftwarebundlesPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link softwarebundles.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link softwarebundles.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see softwarebundles.SoftwarebundlesPackage#getComponent_Dependencies()
	 * @model keys="name"
	 * @generated
	 */
	EList<Component> getDependencies();

	/**
	 * Returns the value of the '<em><b>Jar Local</b></em>' reference list.
	 * The list contents are of type {@link jar.Local}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar Local</em>' reference list.
	 * @see softwarebundles.SoftwarebundlesPackage#getComponent_JarLocal()
	 * @model
	 * @generated
	 */
	EList<Local> getJarLocal();

	/**
	 * Returns the value of the '<em><b>Jar Remote</b></em>' reference list.
	 * The list contents are of type {@link jar.Remote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar Remote</em>' reference list.
	 * @see softwarebundles.SoftwarebundlesPackage#getComponent_JarRemote()
	 * @model
	 * @generated
	 */
	EList<Remote> getJarRemote();

} // Component
