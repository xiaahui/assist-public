/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getCoreUtilization <em>Core Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getDuration <em>Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getPeriod <em>Period</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getEarlyTolerance <em>Early Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getLateTolerance <em>Late Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getLatestStartTime <em>Latest Start Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getLatestEndTime <em>Latest End Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getInitTime <em>Init Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getMaxSlices <em>Max Slices</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getMinSliceDuration <em>Min Slice Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Thread#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread()
 * @model
 * @generated
 */
public interface Thread extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%ch.hilbri.assist.mapping.model.Application%> _application = this.getApplication();\n<%java.lang.String%> _name = _application.getName();\n<%java.lang.String%> _plus = (_name + \"_\");\n<%ch.hilbri.assist.mapping.model.Application%> _application_1 = this.getApplication();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Thread%>> _threads = _application_1.getThreads();\nint _indexOf = _threads.indexOf(this);\nint _plus_1 = (_indexOf + 1);\nreturn (_plus + <%java.lang.Integer%>.valueOf(_plus_1));'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Core Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Utilization</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_CoreUtilization()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%ch.hilbri.assist.mapping.model.Application%> _application = this.getApplication();\nreturn _application.getCoreUtilization();'"
	 * @generated
	 */
	int getCoreUtilization();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Application#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_Application()
	 * @see ch.hilbri.assist.mapping.model.Application#getThreads
	 * @model opposite="threads" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Scheduling BEGIN
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_Duration()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_Period()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Early Tolerance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Tolerance</em>' attribute.
	 * @see #setEarlyTolerance(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_EarlyTolerance()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getEarlyTolerance();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getEarlyTolerance <em>Early Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Tolerance</em>' attribute.
	 * @see #getEarlyTolerance()
	 * @generated
	 */
	void setEarlyTolerance(int value);

	/**
	 * Returns the value of the '<em><b>Late Tolerance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Late Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Tolerance</em>' attribute.
	 * @see #setLateTolerance(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_LateTolerance()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getLateTolerance();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getLateTolerance <em>Late Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Tolerance</em>' attribute.
	 * @see #getLateTolerance()
	 * @generated
	 */
	void setLateTolerance(int value);

	/**
	 * Returns the value of the '<em><b>Latest Start Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Start Time</em>' attribute.
	 * @see #setLatestStartTime(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_LatestStartTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getLatestStartTime();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getLatestStartTime <em>Latest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Start Time</em>' attribute.
	 * @see #getLatestStartTime()
	 * @generated
	 */
	void setLatestStartTime(int value);

	/**
	 * Returns the value of the '<em><b>Latest End Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest End Time</em>' attribute.
	 * @see #setLatestEndTime(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_LatestEndTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getLatestEndTime();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getLatestEndTime <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest End Time</em>' attribute.
	 * @see #getLatestEndTime()
	 * @generated
	 */
	void setLatestEndTime(int value);

	/**
	 * Returns the value of the '<em><b>Init Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Time</em>' attribute.
	 * @see #setInitTime(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_InitTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getInitTime();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getInitTime <em>Init Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Time</em>' attribute.
	 * @see #getInitTime()
	 * @generated
	 */
	void setInitTime(int value);

	/**
	 * Returns the value of the '<em><b>Max Slices</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Slices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Slices</em>' attribute.
	 * @see #setMaxSlices(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_MaxSlices()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMaxSlices();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getMaxSlices <em>Max Slices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Slices</em>' attribute.
	 * @see #getMaxSlices()
	 * @generated
	 */
	void setMaxSlices(int value);

	/**
	 * Returns the value of the '<em><b>Min Slice Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Slice Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Slice Duration</em>' attribute.
	 * @see #setMinSliceDuration(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_MinSliceDuration()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinSliceDuration();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getMinSliceDuration <em>Min Slice Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Slice Duration</em>' attribute.
	 * @see #getMinSliceDuration()
	 * @generated
	 */
	void setMinSliceDuration(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Core)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getThread_Location()
	 * @model
	 * @generated
	 */
	Core getLocation();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Thread#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Core value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Scheduling END
	 * <!-- end-model-doc -->
	 * @model unique="false" paramAdapterTypeUnique="false" paramMinProtectionLevelUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.mapping.model.Application%> _application = this.getApplication();\n<%ch.hilbri.assist.mapping.model.IOAdapterProtectionLevelType%> _ioAdapterProtectionLevel = _application.getIoAdapterProtectionLevel();\nint _ordinal = _ioAdapterProtectionLevel.ordinal();\nint _ordinal_1 = paramMinProtectionLevel.ordinal();\nboolean _lessThan = (_ordinal < _ordinal_1);\nif (_lessThan)\n{\n\treturn 0;\n}\n<%ch.hilbri.assist.mapping.model.Application%> _application_1 = this.getApplication();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>> _ioAdapterRequirements = _application_1.getIoAdapterRequirements();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.mapping.model.IOAdapterRequirement%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(it.isIsExclusiveOnly());\n\t}\n};\nfinal <%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>> exRequests = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>>filter(_ioAdapterRequirements, _function);\nboolean _equals = <%com.google.common.base.Objects%>.equal(exRequests, null);\nif (_equals)\n{\n\treturn 0;\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.mapping.model.IOAdapterRequirement%> it)\n\t{\n\t\t<%ch.hilbri.assist.mapping.model.IOAdapterType%> _adapterType = it.getAdapterType();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_adapterType, paramAdapterType));\n\t}\n};\nfinal <%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>> exRequestsWithCorrectType = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>>filter(exRequests, _function_1);\nboolean _equals_1 = <%com.google.common.base.Objects%>.equal(exRequestsWithCorrectType, null);\nif (_equals_1)\n{\n\treturn 0;\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>, <%java.lang.Integer%>> _function_2 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>, <%java.lang.Integer%>>()\n{\n\tpublic <%java.lang.Integer%> apply(final <%ch.hilbri.assist.mapping.model.IOAdapterRequirement%> it)\n\t{\n\t\treturn <%java.lang.Integer%>.valueOf(it.getRequiredAdapterCount());\n\t}\n};\nfinal int[] exRequestsWithCorrectTypeAdapterCount = ((int[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.mapping.model.IOAdapterRequirement%>, <%java.lang.Integer%>>map(exRequestsWithCorrectType, _function_2), int.class));\nint _size = ((<%java.util.List%><<%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)).size();\nboolean _greaterThan = (_size > 1);\nif (_greaterThan)\n{\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>> _function_3 = new <%org.eclipse.xtext.xbase.lib.Functions.Function2%><<%java.lang.Integer%>, <%java.lang.Integer%>, <%java.lang.Integer%>>()\n\t{\n\t\tpublic <%java.lang.Integer%> apply(final <%java.lang.Integer%> p1, final <%java.lang.Integer%> p2)\n\t\t{\n\t\t\treturn <%java.lang.Integer%>.valueOf(((p1).intValue() + (p2).intValue()));\n\t\t}\n\t};\n\treturn (int) <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%java.lang.Integer%>>reduce(((<%java.lang.Iterable%><? extends <%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)), _function_3);\n}\nelse\n{\n\tint _size_1 = ((<%java.util.List%><<%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)).size();\n\tboolean _equals_2 = (_size_1 == 1);\n\tif (_equals_2)\n\t{\n\t\treturn exRequestsWithCorrectTypeAdapterCount[0];\n\t}\n\telse\n\t{\n\t\tint _size_2 = ((<%java.util.List%><<%java.lang.Integer%>>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)).size();\n\t\tboolean _equals_3 = (_size_2 == 0);\n\t\tif (_equals_3)\n\t\t{\n\t\t\treturn 0;\n\t\t}\n\t\telse\n\t\t{\n\t\t\treturn (-1);\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	int getExclusiveAdapterRequestCount(IOAdapterType paramAdapterType, IOAdapterProtectionLevelType paramMinProtectionLevel);

} // Thread
