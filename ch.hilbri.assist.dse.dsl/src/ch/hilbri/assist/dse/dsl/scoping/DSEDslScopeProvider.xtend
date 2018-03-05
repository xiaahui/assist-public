package ch.hilbri.assist.dse.dsl.scoping

import ch.hilbri.assist.model.BoardAlternative
import ch.hilbri.assist.model.ModelPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import ch.hilbri.assist.model.ExplorationCandidate

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class DSEDslScopeProvider extends AbstractDSEDslScopeProvider {

	override getScope(EObject context, EReference reference) {
		if (context instanceof ExplorationCandidate) // && reference == ModelPackage.Literals.EXPLORATION_CANDIDATE__BOARD_ALTERNATIVES) 
		{
			val rootElement = EcoreUtil2.getRootContainer(context)
			val candidates = EcoreUtil2.getAllContentsOfType(rootElement, BoardAlternative)
			return Scopes.scopeFor(candidates)
		} else {
			return null
		}

	}
}
