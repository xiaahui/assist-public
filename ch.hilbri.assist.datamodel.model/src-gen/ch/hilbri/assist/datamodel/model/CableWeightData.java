/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable Weight Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CableWeightData#getCableWeightEntries <em>Cable Weight Entries</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCableWeightData()
 * @model
 * @generated
 */
public interface CableWeightData extends EObject {
	/**
	 * Returns the value of the '<em><b>Cable Weight Entries</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.CableWeightEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cable Weight Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cable Weight Entries</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCableWeightData_CableWeightEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<CableWeightEntry> getCableWeightEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _cableWeightEntries = this.getCableWeightEntries();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.CableWeightEntry%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(it.isDefaultEntry());\n\t}\n};\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>>filter(_cableWeightEntries, _function);\nboolean _isEmpty = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.isEmpty(_filter);\nif (_isEmpty)\n{\n\treturn 0;\n}\nelse\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _cableWeightEntries_1 = this.getCableWeightEntries();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>>()\n\t{\n\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.CableWeightEntry%> it)\n\t\t{\n\t\t\treturn <%java.lang.Boolean%>.valueOf(it.isDefaultEntry());\n\t\t}\n\t};\n\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _filter_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>>filter(_cableWeightEntries_1, _function_1);\n\t<%ch.hilbri.assist.datamodel.model.CableWeightEntry%> _get = ((<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter_1, <%ch.hilbri.assist.datamodel.model.CableWeightEntry%>.class))[0];\n\treturn _get.getWeight();\n}'"
	 * @generated
	 */
	double getDefaultCableWeight();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ioTypeUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _cableWeightEntries = this.getCableWeightEntries();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.CableWeightEntry%> it)\n\t{\n\t\t<%java.lang.String%> _eqInterfaceIoType = it.getEqInterfaceIoType();\n\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceIoType.equals(ioType));\n\t}\n};\n<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>>filter(_cableWeightEntries, _function);\nboolean _isEmpty = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.isEmpty(_filter);\nif (_isEmpty)\n{\n\treturn this.getDefaultCableWeight();\n}\nelse\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _cableWeightEntries_1 = this.getCableWeightEntries();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>, <%java.lang.Boolean%>>()\n\t{\n\t\tpublic <%java.lang.Boolean%> apply(final <%ch.hilbri.assist.datamodel.model.CableWeightEntry%> it)\n\t\t{\n\t\t\t<%java.lang.String%> _eqInterfaceIoType = it.getEqInterfaceIoType();\n\t\t\treturn <%java.lang.Boolean%>.valueOf(_eqInterfaceIoType.equals(ioType));\n\t\t}\n\t};\n\t<%java.lang.Iterable%><<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>> _filter_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>>filter(_cableWeightEntries_1, _function_1);\n\t<%ch.hilbri.assist.datamodel.model.CableWeightEntry%> _get = ((<%ch.hilbri.assist.datamodel.model.CableWeightEntry%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter_1, <%ch.hilbri.assist.datamodel.model.CableWeightEntry%>.class))[0];\n\treturn _get.getWeight();\n}'"
	 * @generated
	 */
	double getCableWeight(String ioType);

} // CableWeightData
