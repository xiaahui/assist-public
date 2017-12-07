package ch.hilbri.assist.mapping.dsl.formatting2

//import ch.hilbri.assist.mapping.dsl.services.MappingDSLGrammarAccess

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Core
import ch.hilbri.assist.mapping.model.Task
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

//import ch.hilbri.assist.mapping.model.ModelPackage

class MappingDSLFormatter extends AbstractFormatter2 {
	
//	@Inject extension MappingDSLGrammarAccess

	def dispatch void format(AssistModel assistModel, extension IFormattableDocument document) {
		for (region : textRegionAccess.regionForRootEObject.allRegionsFor.keywords(";"))
			region.prepend[noSpace].append[newLine]
		
		for (region : textRegionAccess.regionForRootEObject.allRegionsFor.keywords(","))
			region.prepend[noSpace].append[oneSpace]
		
		for (region: textRegionAccess.regionForRootEObject.allRegionsFor.keywords('{'))
			region.append[newLine]
		
		for (region: textRegionAccess.regionForRootEObject.allRegionsFor.keywords('}'))
			region.prepend[newLine].append[newLine]
		
		for (i : 0 ..< textRegionAccess.regionForRootEObject.allRegionsFor.keywords('{').size) {
			interior(
				textRegionAccess.regionForRootEObject.allRegionsFor.keywords('{').get(i),
				textRegionAccess.regionForRootEObject.allRegionsFor.keywords('}').get(i)
			)[indent]	
		}	
		
		assistModel.compartments.forEach[format]
		assistModel.applications.forEach[format]
		assistModel.dislocalityRelations.forEach[format]
		assistModel.colocalityRelations.forEach[format]
		assistModel.dissimilarityRelations.forEach[format]
	}
	
	def dispatch void format(Core core, extension IFormattableDocument document) {
		core.regionFor.keyword('{').append[noSpace; newLines = 0; highPriority]
	}
	
	def dispatch void format(Task task, extension IFormattableDocument document) {
		task.regionFor.keyword('{').append[noSpace; newLines = 0; highPriority]
	}
}
