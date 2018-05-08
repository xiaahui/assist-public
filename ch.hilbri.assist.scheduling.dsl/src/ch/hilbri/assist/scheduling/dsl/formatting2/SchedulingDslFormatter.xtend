package ch.hilbri.assist.scheduling.dsl.formatting2

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Feature
import ch.hilbri.assist.model.FeatureRequirement
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Task
import ch.hilbri.assist.scheduling.dsl.services.SchedulingDslGrammarAccess
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SchedulingDslFormatter extends AbstractFormatter2 {

	@Inject extension SchedulingDslGrammarAccess

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
		hwElem.features.forEach[format]
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
            regionFor.keywordPairs(applicationAccess.leftCurlyBracketKeyword_2, applicationAccess.rightCurlyBracketKeyword_7).forEach[interior[indent]]
            regionFor.keywords(applicationAccess.leftCurlyBracketKeyword_2).forEach[append[newLine]]
            regionFor.keywords(applicationAccess.rightCurlyBracketKeyword_7).forEach[append[newLine]]
            
            regionFor.keyword(applicationAccess.leftCurlyBracketKeyword_6_1).surround[oneSpace]
            regionFor.keyword(applicationAccess.rightCurlyBracketKeyword_6_3).prepend[oneSpace]
            
            /* All assignments */
            regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
            regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
        ]
        app.tasks.forEach[format]
	}

	def dispatch void format(Task task, extension IFormattableDocument document) {
		  task => [
            /* General indention */
            regionFor.keywordPairs(taskAccess.leftCurlyBracketKeyword_2, taskAccess.rightCurlyBracketKeyword_28).forEach[interior[indent]]
            regionFor.keywords(taskAccess.leftCurlyBracketKeyword_2).forEach[append[newLine]]
            regionFor.keywords(taskAccess.rightCurlyBracketKeyword_28).forEach[append[newLine]]
            
            /* All assignments */
            regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
            regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
            
        ]
		
		task.featureRequirements.forEach[format]
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
