package ch.hilbri.assist.mapping.dsl.validation


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MappingDSLValidator extends AbstractMappingDSLValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MappingDSLPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	
	
	// FIXME: TASK
	/*
	 * Create a check that an application in a dislocality relation is not ALSO
	 * part of an applicationGroup in the same relation!!!!
	 */
	
	
//	@Check
//	def checkApplicationGroupDoesNotContainItself(ApplicationGroup group) {
//		for (member : group.applicationsOrGroups) {
//			if (member.equals(group)) error('Group ' + group.name + ' contains itself as a member. This is not allowed.', group, ModelPackage.Literals::APPLICATION_GROUP__APPLICATIONS_OR_GROUPS)
//		}
//	}
	
//	@Check
//	def checkUniqueNamesInTopLevelHardwareProvider(AssistModel model) {
//		val list = new ArrayList<String>
//		
//		for (hw : model.hardwareContainer) {
//			if (list.contains(hw.name)) 
//				error('A hardware component with the name ' + hw.name + ' is already present. Duplicate names are not allowed at the top level.', hw, ModelPackage.Literals::HARDWARE_ELEMENT__NAME) 
//			else 
//				list.add(hw.name)
//		}
//	}

//	@Check
//	def checkAtLeastOneApplicationPresent(AssistModel model) {
//		if (model.applications.size < 1) 
//			error('A valid specification requires at least one application.', model, ModelPackage.Literals::ASSIST_MODEL__APPLICATIONS)
//	}
//
//	@Check
//	def checkIOAdapterEntriesAreValid(Board board) {
//		for (adapter : board.ioAdapters) {
//			for (other : board.ioAdapters) {
//				if (adapter != other) {
//					if ((adapter.adapterType == other.adapterType) && 
//						(adapter.protectionLevel == other.protectionLevel )) {
//							error('There are multiple definitions for the i/o adapter with type "' + adapter.adapterType + '"' + 
//								  ' and protection level "' + adapter.protectionLevel + '"', 
//								  board, ModelPackage.Literals::BOARD__IO_ADAPTERS)
//						}
//				}
//			}
//		}
//	}
//	
//	@Check
//	def checkIOAdapterRequirementsAreValid(Application app) {
//		for (r : app.ioAdapterRequirements)
//			for (other : app.ioAdapterRequirements)
//				if (r != other) {
//					if (r.adapterType == other.adapterType)
//					     {
//					    	error('There are multiple definitions (requests) for the same i/o adapter with type "' + r.adapterType + '"', 
//					    		  app, ModelPackage.Literals::APPLICATION__IO_ADAPTER_REQUIREMENTS 
//					    	)
//					    }
//				}
//	}
//
//	@Check
//	def checkApplicationDuplicatesInRelation(ProximityRelation r) {
//		val set = new LinkedHashSet<ApplicationOrApplicationGroup>(r.applicationsOrGroups)
//		if (set.size < r.applicationsOrGroups.size)
//			error('There are duplicate applications or application groups in this relation.', 
//					r, ModelPackage.Literals::PROXIMITY_RELATION__APPLICATIONS_OR_GROUPS)
//	}
//	
//	@Check
//	def checkApplicationDuplicatesInRelation(DislocalityRelation r) {
//		val set = new LinkedHashSet<ApplicationOrApplicationGroup>(r.applicationsOrGroups)
//		if (set.size < r.applicationsOrGroups.size)
//			error('There are duplicate applications or application groups in this relation.', 
//					r, ModelPackage.Literals::DISLOCALITY_RELATION__APPLICATIONS_OR_GROUPS)
//	}
//	
//	@Check
//	def checkApplicationDuplicatesInRelation(DissimilarityRelation r) {
//		val set = new LinkedHashSet<ApplicationOrApplicationGroup>(r.applicationsOrGroups)
//		if (set.size < r.applicationsOrGroups.size)
//			error('There are duplicate applications or application groups in this relation.', 
//					r, ModelPackage.Literals::DISSIMILARITY_RELATION__APPLICATIONS_OR_GROUPS)
//	}
}