/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AssignedCoreProperty;
import ch.hilbri.assist.model.ColorProperty;
import ch.hilbri.assist.model.CriticalityLevelProperty;
import ch.hilbri.assist.model.CustomIntProperty;
import ch.hilbri.assist.model.CustomStringProperty;
import ch.hilbri.assist.model.DesignAssuranceLevelProperty;
import ch.hilbri.assist.model.IntProperty;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.PeriodicityProperty;
import ch.hilbri.assist.model.Property;
import ch.hilbri.assist.model.StringProperty;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStringValue() {
        if ((this instanceof StringProperty)) {
            return ((StringProperty) this).getValue();
        }
        else {
            if ((this instanceof IntProperty)) {
                return Integer.valueOf(((IntProperty) this).getValue()).toString();
            }
            else {
                if ((this instanceof DesignAssuranceLevelProperty)) {
                    return ((DesignAssuranceLevelProperty) this).getValue().toString();
                }
                else {
                    if ((this instanceof CriticalityLevelProperty)) {
                        return ((CriticalityLevelProperty) this).getValue().toString();
                    }
                    else {
                        if ((this instanceof PeriodicityProperty)) {
                            return ((PeriodicityProperty) this).getValue().toString();
                        }
                        else {
                            if ((this instanceof ColorProperty)) {
                                return ((ColorProperty) this).getValue().toString();
                            }
                            else {
                                if ((this instanceof AssignedCoreProperty)) {
                                    return ((AssignedCoreProperty) this).getValue().getName();
                                }
                                else {
                                    if ((this instanceof CustomIntProperty)) {
                                        return Integer.valueOf(((CustomIntProperty) this).getValue()).toString();
                                    }
                                    else {
                                        if ((this instanceof CustomStringProperty)) {
                                            return ((CustomStringProperty) this).getValue();
                                        }
                                        else {
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ModelPackage.PROPERTY___GET_STRING_VALUE:
                return getStringValue();
        }
        return super.eInvoke(operationID, arguments);
    }

} //PropertyImpl
