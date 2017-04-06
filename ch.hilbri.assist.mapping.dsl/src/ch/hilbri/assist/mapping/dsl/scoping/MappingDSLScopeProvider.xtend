package ch.hilbri.assist.mapping.dsl.scoping

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Board
import ch.hilbri.assist.mapping.model.Box
import ch.hilbri.assist.mapping.model.Compartment
import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MappingDSLScopeProvider extends AbstractMappingDSLScopeProvider {
@Inject IQualifiedNameProvider nameprovider

	/* 
	 * Referenzen auf ein HardwareElement (FixedDeployment) soll es nur 
	 * fuer Compartments, Boxen, Boards, Prozessoren und Cores geben;
	 * daher bauen wir uns hier einen eigenen Scope zusammen.
	 * 
	 * Der QualifiedNameProvider ist wichtig, denn damit koennen auch gleichnamige
	 * Boxen in unterschiedlichen Compartments referenziert werden.
	 */
	def scope_HardwareElement(AssistModel ctx, EReference ref) {

		if (ctx.hardwareContainer.get(0) instanceof Compartment) {
			val list = newArrayList()
			for (cont : ctx.hardwareContainer) {
				val compartment = cont as Compartment;
				list.add(compartment)
				for (box : compartment.boxes) {
					list.add(box)
					for (board : box.boards) {
						list.add(board)
						for (processor : board.processors) {
							list.add(processor)
							for (core : processor.cores) {
								list.add(core)
							}
						}
					}
				}
			}
			return Scopes::scopeFor(list,nameprovider,IScope.NULLSCOPE)
		} 
		
		else if (ctx.hardwareContainer.get(0) instanceof Box) {
			val list = newArrayList()
			for (cont : ctx.hardwareContainer) {
				val box = cont as Box;
				list.add(box)
				for (board : box.boards) {
					list.add(board)
					for (processor : board.processors) {
						list.add(processor)
						for (core : processor.cores) {
								list.add(core)
							}
					}
				}
			}
			return Scopes::scopeFor(list,nameprovider,IScope.NULLSCOPE)
		} 
		
		else if (ctx.hardwareContainer.get(0) instanceof Board) {
			val list = newArrayList()
			for (cont : ctx.hardwareContainer) {
				val board = cont as Board;
				list.add(board)
				for (processor : board.processors) {
					list.add(processor)
					for (core : processor.cores) {
								list.add(core)
							}
				}
			}
			return Scopes::scopeFor(list,nameprovider,IScope.NULLSCOPE)
		}
		
		else return IScope.NULLSCOPE
	}
}
