package ch.hilbri.assist.mappingdsl.scoping

import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EReference
import com.google.common.base.Predicate
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope

/**
 * Diese Klasse erstellt einen NullScopeProvider, 
 * damit wir bei Referenzen in der DSL uns nur auf 
 * das aktuelle File beziehen
 * (und nicht ein anderes File im selben Projekt
 * mit der gleichen Endung laden)
 * 
 * @author Robert Hilbrich
 * 
 * Siehe http://xtextcasts.org/episodes/17-restricting-scope?view=comments
 * 
 * */
class NullGlobalScopeProvider implements IGlobalScopeProvider {

	override getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter) {
		return IScope.NULLSCOPE;
	}
}
