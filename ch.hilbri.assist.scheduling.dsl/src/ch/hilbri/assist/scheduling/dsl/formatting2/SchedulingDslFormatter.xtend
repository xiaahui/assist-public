package ch.hilbri.assist.scheduling.dsl.formatting2

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Feature
import ch.hilbri.assist.model.FeatureRequirement
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Property
import ch.hilbri.assist.model.RestrictionDisjointExecution
import ch.hilbri.assist.model.RestrictionFinishAtTheSameTime
import ch.hilbri.assist.model.RestrictionStartAfterOtherFinished
import ch.hilbri.assist.model.RestrictionStartAfterOtherStarted
import ch.hilbri.assist.model.RestrictionStartAtTheSameTime
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
            properties.forEach[format]
			compartments.forEach[format]
			applications.forEach[format]
			schedulingRestrictions.forEach[format]
		]
	}
	
	def dispatch void format(Property property, extension IFormattableDocument document) {
        property.defaultFormat(document)
    }
	
	def dispatch void format(HardwareElement hwElem, extension IFormattableDocument document) {
		hwElem.defaultFormat(document)
		hwElem.eContents.forEach[format]
		hwElem.features.forEach[format]
		hwElem.properties.forEach[format]
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
            
            /* All assignments */
            regionFor.keywords(';').forEach[prepend[noSpace].append[newLine]]
            regionFor.keywords('=').forEach[prepend[oneSpace].append[oneSpace]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
        ]
		
		task.featureRequirements.forEach[format]
		task.properties.forEach[format]
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
	
	def dispatch void format(RestrictionFinishAtTheSameTime relation, extension IFormattableDocument document) {
        relation => [
            regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
            regionFor.keyword(restrictionFinishAtTheSameTimeAccess.finishKeyword_2).surround[oneSpace]
            regionFor.keyword(restrictionFinishAtTheSameTimeAccess.atKeyword_3).surround[oneSpace]
            regionFor.keyword(restrictionFinishAtTheSameTimeAccess.theKeyword_4).surround[oneSpace]
            regionFor.keyword(restrictionFinishAtTheSameTimeAccess.sameKeyword_5).surround[oneSpace]
            regionFor.keyword(restrictionFinishAtTheSameTimeAccess.timeKeyword_6).prepend[oneSpace]
        ]
    }
    
    def dispatch void format(RestrictionStartAtTheSameTime relation, extension IFormattableDocument document) {
        relation => [
            regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
            regionFor.keyword(restrictionStartAtTheSameTimeAccess.startKeyword_2).surround[oneSpace]
            regionFor.keyword(restrictionStartAtTheSameTimeAccess.atKeyword_3).surround[oneSpace]
            regionFor.keyword(restrictionStartAtTheSameTimeAccess.theKeyword_4).surround[oneSpace]
            regionFor.keyword(restrictionStartAtTheSameTimeAccess.sameKeyword_5).surround[oneSpace]
            regionFor.keyword(restrictionStartAtTheSameTimeAccess.timeKeyword_6).prepend[oneSpace]
        ]
    }

    def dispatch void format(RestrictionStartAfterOtherFinished relation, extension IFormattableDocument document) {
        relation => [
            regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.startsKeyword_0_0_1).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.startKeyword_0_1_2).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.afterKeyword_0_0_2).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.afterKeyword_0_1_3).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.hasKeyword_0_0_4).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.hasKeyword_0_1_5).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.finishedKeyword_0_0_5).prepend[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.finishedKeyword_0_1_6).prepend[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.withKeyword_1_0).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.delayKeyword_1_1).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.ofKeyword_1_2).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.atKeyword_1_3).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherFinishedAccess.leastKeyword_1_4).surround[oneSpace]
        ]
    }

    def dispatch void format(RestrictionStartAfterOtherStarted relation, extension IFormattableDocument document) {
        relation => [
            regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.startsKeyword_0_0_1).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.startKeyword_0_1_2).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.afterKeyword_0_0_2).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.afterKeyword_0_1_3).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.hasKeyword_0_0_4).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.hasKeyword_0_1_5).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.startedKeyword_0_0_5).prepend[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.startedKeyword_0_1_6).prepend[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.withKeyword_1_0).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.delayKeyword_1_1).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.ofKeyword_1_2).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.atKeyword_1_3).surround[oneSpace]
            regionFor.keyword(restrictionStartAfterOtherStartedAccess.leastKeyword_1_4).surround[oneSpace]
        ]
    }

    def dispatch void format(RestrictionDisjointExecution relation, extension IFormattableDocument document) {
        relation => [
            regionFor.keywords(';').forEach[prepend[noSpace].append[setNewLines(1, 1, 2)]]
            regionFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]
            regionFor.keyword(restrictionDisjointExecutionAccess.requireKeyword_2).surround[oneSpace]
            regionFor.keyword(restrictionDisjointExecutionAccess.disjointKeyword_3).surround[oneSpace]
            regionFor.keyword(restrictionDisjointExecutionAccess.executionKeyword_4).prepend[oneSpace]
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
