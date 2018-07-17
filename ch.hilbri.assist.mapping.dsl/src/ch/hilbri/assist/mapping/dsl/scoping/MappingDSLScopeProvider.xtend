package ch.hilbri.assist.mapping.dsl.scoping

import ch.hilbri.assist.model.MappingRelation
import ch.hilbri.assist.model.ModelPackage
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.Scopes
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.SoftwareElement

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MappingDSLScopeProvider extends AbstractMappingDSLScopeProvider {
}
