/*
 * generated by Xtext
 */
package ch.hilbri.assist.mappingdsl.scoping

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Compartment
import ch.hilbri.assist.datamodel.model.Connector
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
		for (comp : ctx.compartments) {
			val compartment = comp as Compartment
			list.add(compartment)
			
			for (r : compartment.rdcs) {
				val rdc = r as RDC
				list.add(rdc)
				
				for (c : rdc.connectors) {
					val connector = c as Connector
					list.add(connector)
				} 
			}
		}
	
		return Scopes::scopeFor(list,nameprovider,IScope.NULLSCOPE)
	}
	
	def scope_AvailableEqInterface(RDC ctx, EReference ref) {
		val list = ctx.connectors.map[availableEqInterfaces.filter[!name.isNullOrEmpty]].flatten.toList
		Scopes::scopeFor(list, nameprovider, IScope.NULLSCOPE)
	} 
}
