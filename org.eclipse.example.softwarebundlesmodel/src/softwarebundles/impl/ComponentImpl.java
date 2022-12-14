/**
 */
package softwarebundles.impl;

import jar.Local;
import jar.Remote;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import softwarebundles.Component;
import softwarebundles.SoftwarebundlesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link softwarebundles.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link softwarebundles.impl.ComponentImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link softwarebundles.impl.ComponentImpl#getJarLocal <em>Jar Local</em>}</li>
 *   <li>{@link softwarebundles.impl.ComponentImpl#getJarRemote <em>Jar Remote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> dependencies;

	/**
	 * The cached value of the '{@link #getJarLocal() <em>Jar Local</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJarLocal()
	 * @generated
	 * @ordered
	 */
	protected EList<Local> jarLocal;

	/**
	 * The cached value of the '{@link #getJarRemote() <em>Jar Remote</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJarRemote()
	 * @generated
	 * @ordered
	 */
	protected EList<Remote> jarRemote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarebundlesPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarebundlesPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Component>(Component.class, this, SoftwarebundlesPackage.COMPONENT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Local> getJarLocal() {
		if (jarLocal == null) {
			jarLocal = new EObjectResolvingEList<Local>(Local.class, this, SoftwarebundlesPackage.COMPONENT__JAR_LOCAL);
		}
		return jarLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Remote> getJarRemote() {
		if (jarRemote == null) {
			jarRemote = new EObjectResolvingEList<Remote>(Remote.class, this, SoftwarebundlesPackage.COMPONENT__JAR_REMOTE);
		}
		return jarRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarebundlesPackage.COMPONENT__NAME:
				return getName();
			case SoftwarebundlesPackage.COMPONENT__DEPENDENCIES:
				return getDependencies();
			case SoftwarebundlesPackage.COMPONENT__JAR_LOCAL:
				return getJarLocal();
			case SoftwarebundlesPackage.COMPONENT__JAR_REMOTE:
				return getJarRemote();
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
			case SoftwarebundlesPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case SoftwarebundlesPackage.COMPONENT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Component>)newValue);
				return;
			case SoftwarebundlesPackage.COMPONENT__JAR_LOCAL:
				getJarLocal().clear();
				getJarLocal().addAll((Collection<? extends Local>)newValue);
				return;
			case SoftwarebundlesPackage.COMPONENT__JAR_REMOTE:
				getJarRemote().clear();
				getJarRemote().addAll((Collection<? extends Remote>)newValue);
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
			case SoftwarebundlesPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwarebundlesPackage.COMPONENT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SoftwarebundlesPackage.COMPONENT__JAR_LOCAL:
				getJarLocal().clear();
				return;
			case SoftwarebundlesPackage.COMPONENT__JAR_REMOTE:
				getJarRemote().clear();
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
			case SoftwarebundlesPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwarebundlesPackage.COMPONENT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SoftwarebundlesPackage.COMPONENT__JAR_LOCAL:
				return jarLocal != null && !jarLocal.isEmpty();
			case SoftwarebundlesPackage.COMPONENT__JAR_REMOTE:
				return jarRemote != null && !jarRemote.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
