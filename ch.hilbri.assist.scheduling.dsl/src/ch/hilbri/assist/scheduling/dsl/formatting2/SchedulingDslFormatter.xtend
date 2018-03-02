package ch.hilbri.assist.scheduling.dsl.formatting2

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Task
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SchedulingDslFormatter extends AbstractFormatter2 {

//	@Inject extension SchedulingDslGrammarAccess

	def dispatch void format(AssistModel assistModel, extension IFormattableDocument document) {
		assistModel => [
			regionFor.keywordPairs('{', '}').forEach[interior[indent]]
			regionFor.keywords('{').forEach[append[newLine]]
			regionFor.keywords('}').forEach[append[newLines = 2]]
			regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
			regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
			compartments.forEach[format]
			applications.forEach[format]
		]
	}

	def dispatch void format(HardwareElement hwElem, extension IFormattableDocument document) {
		hwElem.defaultFormat(document)
		hwElem.eContents.forEach[format]
	}

	def dispatch void format(Application app, extension IFormattableDocument document) {
		app.defaultFormat(document)
		app.tasks.forEach[format]
	}

	def dispatch void format(Task task, extension IFormattableDocument document) {
		task.defaultFormat(document)
		// no children
	}

	private def defaultFormat(EObject obj, extension IFormattableDocument document) {
		obj => [
			regionFor.keywordPairs('{', '}').forEach[interior[indent]]
			regionFor.keywords('{').forEach[append[newLine]]
			regionFor.keywords('}').forEach[append[newLine]]
			regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
			regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
			regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
		]
	}
}
