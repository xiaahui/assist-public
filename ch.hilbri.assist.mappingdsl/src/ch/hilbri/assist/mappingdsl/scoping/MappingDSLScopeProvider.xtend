package ch.hilbri.assist.mappingdsl.scoping

import ch.hilbri.assist.datamodel.model.RDC
import javax.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 */
class MappingDSLScopeProvider extends AbstractDeclarativeScopeProvider {
	@Inject IQualifiedNameProvider nameprovider

	def scope_Pin(RDC ctx, EReference ref) {
		val list = ctx.connectors.map[pins].flatten
		Scopes::scopeFor(list, nameprovider, IScope.NULLSCOPE)
	}

}
