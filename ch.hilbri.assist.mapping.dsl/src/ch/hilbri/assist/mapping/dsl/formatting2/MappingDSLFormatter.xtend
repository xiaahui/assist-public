package ch.hilbri.assist.mapping.dsl.formatting2

import ch.hilbri.assist.mapping.dsl.services.MappingDSLGrammarAccess
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Task
import javax.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MappingDSLFormatter extends AbstractFormatter2 {

	@Inject extension MappingDSLGrammarAccess

	def dispatch void format(AssistModel assistModel, extension IFormattableDocument document) {

		val openGlobal = assistModel.regionFor.keyword(assistModelAccess.leftCurlyBracketKeyword_1)
		val closeGlobal = assistModel.regionFor.keyword(assistModelAccess.rightCurlyBracketKeyword_6)

		openGlobal.append[newLine]
		interior(openGlobal, closeGlobal)[indent]
		closeGlobal.prepend[newLine].append[newLines = 2]
		
		val openHardware = assistModel.regionFor.keyword(assistModelAccess.leftCurlyBracketKeyword_8)
		val closeHardware = assistModel.regionFor.keyword(assistModelAccess.rightCurlyBracketKeyword_10)

		openHardware.append[newLine]
		interior(openHardware, closeHardware)[indent]
		closeHardware.prepend[newLine].append[newLines = 2]

		val openSoftware = assistModel.regionFor.keyword(assistModelAccess.leftCurlyBracketKeyword_12)
		val closeSoftware = assistModel.regionFor.keyword(assistModelAccess.rightCurlyBracketKeyword_14)

		openSoftware.append[newLine]
		interior(openSoftware, closeSoftware)[indent]
		closeSoftware.prepend[newLine].append[newLines = 2]

		val openRestrictions = assistModel.regionFor.keyword(assistModelAccess.leftCurlyBracketKeyword_15_1)
		val closeRestrictions = assistModel.regionFor.keyword(assistModelAccess.rightCurlyBracketKeyword_15_5)

		openRestrictions.append[newLine]
		interior(openRestrictions, closeRestrictions)[indent]
		closeRestrictions.prepend[newLine].append[newLines = 2]


		

//		for (region : textRegionAccess.regionForRootEObject.allRegionsFor.keywords(";"))
//			region.prepend[noSpace].append[newLine]
//		
//		for (region : textRegionAccess.regionForRootEObject.allRegionsFor.keywords(","))
//			region.prepend[noSpace].append[oneSpace]
//		
//		for (region: textRegionAccess.regionForRootEObject.allRegionsFor.keywords('{'))
//			region.append[newLine]
//		
//		for (region: textRegionAccess.regionForRootEObject.allRegionsFor.keywords('}'))
//			region.prepend[newLine].append[newLine]
//		
//		for (i : 0 ..< textRegionAccess.regionForRootEObject.allRegionsFor.keywords('{').size) {
//			interior(
//				textRegionAccess.regionForRootEObject.allRegionsFor.keywords('{').get(i),
//				textRegionAccess.regionForRootEObject.allRegionsFor.keywords('}').get(i)
//			)[indent]	
//		}	
//		
//		assistModel.compartments.forEach[format]
//		assistModel.applications.forEach[format]
//		assistModel.dislocalityRelations.forEach[format]
//		assistModel.colocalityRelations.forEach[format]
//		assistModel.dissimilarityRelations.forEach[format]
	}

	def dispatch void format(Core core, extension IFormattableDocument document) {
//		core.regionFor.keyword('{').append[noSpace; newLines = 0; highPriority]
	}

	def dispatch void format(Task task, extension IFormattableDocument document) {
//		task.regionFor.keyword('{').append[noSpace; newLines = 0; highPriority]
	}
}
