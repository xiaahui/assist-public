package ch.hilbri.assist.mappingdsl.validation

import ch.hilbri.assist.datamodel.model.ApplicationGroup
import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import java.util.ArrayList
import org.eclipse.xtext.validation.Check
import ch.hilbri.assist.datamodel.model.Board
import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.datamodel.model.ProximityRelation
import java.util.LinkedHashSet
import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup
import ch.hilbri.assist.datamodel.model.DislocalityRelation
import ch.hilbri.assist.datamodel.model.DissimilarityRelation

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MappingDSLValidator extends AbstractMappingDSLValidator {
	
	// FIXME: TASK
	/*
	 * Create a check that an application in a dislocality relation is not ALSO
	 * part of an applicationGroup in the same relation!!!!
	 */
	
	
	@Check
	def checkApplicationGroupDoesNotContainItself(ApplicationGroup group) {
		for (member : group.applicationsOrGroups) {
			if (member.equals(group)) error('Group ' + group.name + ' contains itself as a member. This is not allowed.', group, ModelPackage.Literals::APPLICATION_GROUP__APPLICATIONS_OR_GROUPS)
		}
	}
	
	@Check
	def checkUniqueNamesInTopLevelHardwareProvider(AssistModel model) {
		val list = new ArrayList<String>
		
		for (hw : model.hardwareContainer) {
			if (list.contains(hw.name)) 
				error('A hardware component with the name ' + hw.name + ' is already present. Duplicate names are not allowed at the top level.', hw, ModelPackage.Literals::HARDWARE_ELEMENT__NAME) 
			else 
				list.add(hw.name)
		}
	}

	@Check
	def checkAtLeastOneApplicationPresent(AssistModel model) {
		if (model.applications.size < 1) 
			error('A valid specification requires at least one application.', model, ModelPackage.Literals::ASSIST_MODEL__APPLICATIONS)
	}

	@Check
	def checkIOAdapterEntriesAreValid(Board board) {
		for (adapter : board.ioAdapters) {
			for (other : board.ioAdapters) {
				if (adapter != other) {
					if ((adapter.adapterType == other.adapterType) && 
						(adapter.protectionLevel == other.protectionLevel )) {
							error('There are multiple definitions for the i/o adapter with type "' + adapter.adapterType + '"' + 
								  ' and protection level "' + adapter.protectionLevel + '"', 
								  board, ModelPackage.Literals::BOARD__IO_ADAPTERS)
						}
				}
			}
		}
	}
	
	@Check
	def checkIOAdapterRequirementsAreValid(Application app) {
		for (r : app.ioAdapterRequirements)
			for (other : app.ioAdapterRequirements)
				if (r != other) {
					if (r.adapterType == other.adapterType)
					     {
					    	error('There are multiple definitions (requests) for the same i/o adapter with type "' + r.adapterType + '"', 
					    		  app, ModelPackage.Literals::APPLICATION__IO_ADAPTER_REQUIREMENTS 
					    	)
					    }
				}
	}

	@Check
	def checkApplicationDuplicatesInRelation(ProximityRelation r) {
		val set = new LinkedHashSet<ApplicationOrApplicationGroup>(r.applicationsOrGroups)
		if (set.size < r.applicationsOrGroups.size)
			error('There are duplicate applications or application groups in this relation.', 
					r, ModelPackage.Literals::PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS)
	}
	
	@Check
	def checkApplicationDuplicatesInRelation(DislocalityRelation r) {
		val set = new LinkedHashSet<ApplicationOrApplicationGroup>(r.applicationsOrGroups)
		if (set.size < r.applicationsOrGroups.size)
			error('There are duplicate applications or application groups in this relation.', 
					r, ModelPackage.Literals::DISLOCALITY_RELATION__APPLICATIONS_OR_GROUPS)
	}
	
	@Check
	def checkApplicationDuplicatesInRelation(DissimilarityRelation r) {
		val set = new LinkedHashSet<ApplicationOrApplicationGroup>(r.applicationsOrGroups)
		if (set.size < r.applicationsOrGroups.size)
			error('There are duplicate applications or application groups in this relation.', 
					r, ModelPackage.Literals::DISSIMILARITY_RELATION__APPLICATIONS_OR_GROUPS)
	}
	

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

//	@Check
//	def checkProximityRelationLevelIsValid(Model model) {
//		for (ApplicationProximityRelation relation : model.relations.applicationProximityRelations) {
//			if ((relation.level == HardwareArchitectureLevelType.COMPARTMENT) && (model.hardware.compartments.empty)) {
//				error('Proximity relation is specified to compartments-level, but there are no compartments in the model.',	relation,
//						MappingDslPackage$Literals::APPLICATION_PROXIMITY_RELATION__LEVEL, -1);
//			}
//			
//			if ((relation.level == HardwareArchitectureLevelType.BOX) && (model.hardware.boxes.empty)) {
//				error('Proximity relation is specified to box-level, but there are no boxes in the model.', relation,
//						MappingDslPackage$Literals::APPLICATION_PROXIMITY_RELATION__LEVEL, -1);
//			}	
//		}
//	}
//	
//	@Check
//	def checkSafetyRelationLevelIsValid(Model model) {
//		for (ApplicationSafetyRelation relation : model.relations.applicationSafetyRelations) {
//			if ((relation.level == HardwareArchitectureLevelType.COMPARTMENT) && (model.hardware.compartments.empty)) {
//				error('Safety relation is specified to compartments-level, but there are no compartments in the model.',	relation,
//						MappingDslPackage$Literals::APPLICATION_SAFETY_RELATION__LEVEL, -1);
//			}
//			
//			if ((relation.level == HardwareArchitectureLevelType.BOX) && (model.hardware.boxes.empty)) {
//				error('Safety relation is specified to box-level, but there are no boxes in the model.', relation,
//						MappingDslPackage$Literals::APPLICATION_SAFETY_RELATION__LEVEL, -1);
//			}	
//		}
//	}

}
