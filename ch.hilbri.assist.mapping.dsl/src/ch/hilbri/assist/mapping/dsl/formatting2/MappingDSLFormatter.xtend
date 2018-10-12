package ch.hilbri.assist.mapping.dsl.formatting2

import ch.hilbri.assist.mapping.dsl.services.MappingDSLGrammarAccess
import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ColocalityRelation
import ch.hilbri.assist.model.DislocalityRelation
import ch.hilbri.assist.model.DissimilarityClause
import ch.hilbri.assist.model.DissimilarityRelation
import ch.hilbri.assist.model.Feature
import ch.hilbri.assist.model.FeatureRequirement
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Property
import ch.hilbri.assist.model.SoftwareElement
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
            properties.forEach[format]
			compartments.forEach[format]
			applications.forEach[format]
			dislocalityRelations.forEach[format]
			colocalityRelations.forEach[format]
			dissimilarityRelations.forEach[format]
		]
	}

    def dispatch void format(Property property, extension IFormattableDocument document) {
        property.defaultFormat(document)
    }

    def dispatch void format(HardwareElement hwElem, extension IFormattableDocument document) {
        hwElem.defaultFormat(document)
        hwElem.eContents.forEach[format]
    }
    
    def dispatch void format(Feature feature, extension IFormattableDocument document) {
        feature => [
            for (kw : #['Provides', 'shared', 'feature', 'with', 'synchronized', 'access', 'of', 'exclusive']) 
                regionFor.keywords(kw).forEach[prepend[oneSpace]]
           
           regionFor.assignment(featureSimpleAccess.nameAssignment_3).prepend[oneSpace]
           regionFor.assignment(featureSyncAccessAccess.nameAssignment_3).surround[oneSpace]
           regionFor.assignment(featureExclAccessAccess.nameAssignment_5).prepend[oneSpace]
           regionFor.assignment(featureExclAccessAccess.unitsAssignment_1).surround[oneSpace]
                      
           regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
        ]
    }

	def dispatch void format(Application app, extension IFormattableDocument document) {
		app => [
			/* General indention */
			regionFor.keywordPairs(applicationAccess.leftCurlyBracketKeyword_2, applicationAccess.rightCurlyBracketKeyword_4).forEach[interior[indent]]
			regionFor.keywords(applicationAccess.leftCurlyBracketKeyword_2).forEach[append[newLine]]
			regionFor.keywords(applicationAccess.rightCurlyBracketKeyword_4).forEach[append[newLine]]
			
			/* Restricting deployments in one line */
			regionFor.keyword(applicationAccess.leftCurlyBracketKeyword_3_5_1).surround[oneSpace]
			regionFor.keyword(applicationAccess.rightCurlyBracketKeyword_3_5_4).prepend[oneSpace]
			
			/* All assignments */
			regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
			regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
			regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
		]
		app.tasks.forEach[format]
		app.properties.forEach[format]
	}

	def dispatch void format(Task task, extension IFormattableDocument document) {
		task => [
			/* General indention */
			regionFor.keywordPairs(taskAccess.leftCurlyBracketKeyword_2, taskAccess.rightCurlyBracketKeyword_4).forEach[interior[indent]]
			regionFor.keywords(taskAccess.leftCurlyBracketKeyword_2).forEach[append[newLine]]
			regionFor.keywords(taskAccess.rightCurlyBracketKeyword_4).forEach[append[newLine]]
			
			/* Restricting deployments in one line */
			regionFor.keyword(taskAccess.leftCurlyBracketKeyword_3_6_1).surround[oneSpace]
			regionFor.keyword(taskAccess.rightCurlyBracketKeyword_3_6_4).prepend[oneSpace]
			
			/* All assignments */
			regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
			regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
			regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
			
		]
        task.featureRequirements.forEach[format]
        task.properties.forEach[format]
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
	
	def dispatch void format(FeatureRequirement featureRequirement, extension IFormattableDocument document) {
	   featureRequirement => [
            for (kw : #['Requires', 'shared', 'feature', 'of', 'exclusive']) 
                regionFor.keywords(kw).forEach[prepend[oneSpace]]
           
           regionFor.assignment(sharedFeatureRequirementAccess.hardwareLevelAssignment_2).surround[oneSpace]
           regionFor.assignment(sharedFeatureRequirementAccess.nameAssignment_4).prepend[oneSpace]
           
           regionFor.assignment(exclusiveFeatureRequirementAccess.unitsAssignment_1).surround[oneSpace]
           regionFor.assignment(exclusiveFeatureRequirementAccess.hardwareLevelAssignment_4).surround[oneSpace]
           regionFor.assignment(exclusiveFeatureRequirementAccess.nameAssignment_6).prepend[oneSpace]
           
           regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
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
