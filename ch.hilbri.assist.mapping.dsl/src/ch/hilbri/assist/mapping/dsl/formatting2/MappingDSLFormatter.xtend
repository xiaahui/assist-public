package ch.hilbri.assist.mapping.dsl.formatting2

import ch.hilbri.assist.mapping.dsl.services.MappingDSLGrammarAccess
import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ColocalityRelation
import ch.hilbri.assist.model.DislocalityRelation
import ch.hilbri.assist.model.DissimilarityClause
import ch.hilbri.assist.model.DissimilarityDisjunction
import ch.hilbri.assist.model.DissimilarityRelation
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Task
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MappingDSLFormatter extends AbstractFormatter2 {

	@Inject extension MappingDSLGrammarAccess
	
	def dispatch void format(AssistModel assistModel, extension IFormattableDocument document) {

		assistModel => [
			regionFor.keywordPairs('{', '}').forEach[interior[indent]]
			regionFor.keywords('{').forEach[append[newLine]]
			regionFor.keywords('}').forEach[append[newLines = 2]]
			regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
			regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
			compartments.forEach[format]
			applications.forEach[format]
			dislocalityRelations.forEach[format]
			colocalityRelations.forEach[format]
			dissimilarityRelations.forEach[format]
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
	
	def dispatch void format(DislocalityRelation relation, extension IFormattableDocument document) {
		relation => [
			regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
			regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
			regionFor.keyword(dislocalityRelationAccess.dislocalKeyword_2).surround[oneSpace]
			regionFor.keyword(dislocalityRelationAccess.upKeyword_3).surround[oneSpace]
			regionFor.keyword(dislocalityRelationAccess.toKeyword_4).surround[oneSpace]
			regionFor.assignment(dislocalityRelationAccess.hardwareLevelAssignment_5).prepend[oneSpace]
		]
	}
	
	def dispatch void format(ColocalityRelation relation, extension IFormattableDocument document) {
		relation => [
			regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
			regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
			regionFor.keyword(colocalityRelationAccess.onKeyword_2).surround[oneSpace]
			regionFor.keyword(colocalityRelationAccess.sameKeyword_3).surround[oneSpace]
			regionFor.assignment(colocalityRelationAccess.hardwareLevelAssignment_4).prepend[oneSpace]
		]
	}
	
	def dispatch void format(DissimilarityRelation relation, extension IFormattableDocument document) {
		relation => [
			regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
			regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
			regionFor.keyword(dissimilarityRelationAccess.dissimilarKeyword_2).surround[oneSpace]
			regionFor.keyword(dissimilarityRelationAccess.basedKeyword_3).surround[oneSpace]
			regionFor.keyword(dissimilarityRelationAccess.onKeyword_4).surround[oneSpace]
			dissimilarityClause.format
		]
	}
	
	def dispatch void format(DissimilarityClause clause, extension IFormattableDocument document) {
		clause => [
			regionFor.keywords('(').forEach[append[noSpace]]
			regionFor.keywords(')').forEach[prepend[noSpace]]
			regionFor.keywords('AND').forEach[surround[oneSpace]]
			regionFor.keywords('OR').forEach[surround[oneSpace]]
		]		
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
