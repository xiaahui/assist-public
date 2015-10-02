package ch.hilbri.assist.mappingdsl.scoping

import ch.hilbri.assist.datamodel.model.AssistModel
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

	/* 
	 * Referenzen auf ein HardwareElement 
	 * 
	 * Der QualifiedNameProvider ist wichtig, denn damit koennen auch gleichnamige
	 * Boxen in unterschiedlichen Compartments referenziert werden.
	 */
 	def scope_HardwareElement(AssistModel ctx, EReference ref) {
		val list = newArrayList()
		if (ctx.compartmentsBlock != null) {
			for (c : ctx.compartmentsBlock.compartments) {
				list.add(c)
				for (r : c.rdcs) {
					list.add(r)
					for (con : r.connectors) {
						list.add(con)
						for (p : con.pins) {
							list.add(p)
						}
					} 
				}
			}
		}
	
		return Scopes::scopeFor(list, nameprovider, IScope.NULLSCOPE)
	}

	def scope_Pin(RDC ctx, EReference ref) {
		val list = ctx.connectors.map[pins].flatten
		Scopes::scopeFor(list, nameprovider, IScope.NULLSCOPE)
	}

}
