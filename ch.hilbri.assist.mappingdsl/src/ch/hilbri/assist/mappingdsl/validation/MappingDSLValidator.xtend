package ch.hilbri.assist.mappingdsl.validation

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.DeploymentSpecification
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition
import ch.hilbri.assist.datamodel.model.ModelPackage
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MappingDSLValidator extends AbstractMappingDSLValidator {
	
	@Check
	def checkGroupsAreNotEmpty(AssistModel model) {
		
		// Check the groups that have no explicitly added eq interfaces
		for (g : model.eqInterfaceGroups.filter[!(it instanceof EqInterfaceGroupWithCombinedDefinition)]
										.filter[eqInterfaces.length == 0]) 
		{
			if (g.implicitlyDefinedEqInterfaces.length == 0)
				warning("The group " + g.name + " contains no interfaces. It is empty. This may be unintended.", g, ModelPackage.Literals::EQ_INTERFACE_OR_GROUP__NAME)		
								
		} // for loop over all group
	}
	
	@Check
	def checkImplicitMemberDefinitionsAreNotEmpty(EqInterfaceGroup group) {
		for (definition : group.implicitMemberDefinitions) {
			if (definition.implicitlyDefinedEqInterfaces.isNullOrEmpty) {
				warning(
					"This part of the definition matches no interfaces. This may be unintended.",
					group,
					ModelPackage.Literals::EQ_INTERFACE_GROUP__IMPLICIT_MEMBER_DEFINITIONS,
					group.implicitMemberDefinitions.indexOf(definition)
				)
			}	
		}
	}
	
	@Check
	def checkImplicitlyDefinedValidDeploymentsAreNotEmpty(AssistModel model) {
		for (s : model.validDeployments.filter[it.implicitHardwareElements.length > 0]
									   .filter[it.hardwareElements.length == 0]) 
		{
			if (s.implicitlyDefinedConnectors.isNullOrEmpty)
				warning("The list of hardware elements for this specification is currently empty.", s, ModelPackage.Literals::DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS)		
		}
	}
	
	@Check
	def checkImplicitDeploymentDefinitionsAreNotEmpty(DeploymentSpecification specification) {
		for (definition : specification.implicitHardwareElements) {
			if (definition.implicitlyDefinedConnectors.isNullOrEmpty) {
				warning(
					"This part of the specification matches no connectors. This may be unintended.",
					specification,
					ModelPackage.Literals::DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS,
					specification.implicitHardwareElements.indexOf(definition)
				)
			}
		}
	}
	
	
	@Check
	def checkImplicitlyDefinedInvalidDeploymentsAreNotEmpty(AssistModel model) {
		for (s : model.invalidDeployments.filter[it.implicitHardwareElements.length > 0]
										 .filter[it.hardwareElements.length == 0])
		{
			if (s.implicitlyDefinedConnectors.isNullOrEmpty)
				warning("The list of hardware elements for this specification is currently empty.", s, ModelPackage.Literals::DEPLOYMENT_SPECIFICATION__IMPLICIT_HARDWARE_ELEMENTS)
		}
	}
	
	@Check
	def checkCombinedGroupsDoNotContainCombinedGroups(AssistModel model) {
		for (g : model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition]) {
			for (combinedGroup : (g as EqInterfaceGroupWithCombinedDefinition).combinedGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition]) {
				error("The group '" + g.name + "' contains the group '" + combinedGroup.name + "' which was also defined by using a 'combines' specification. This is not allowed.",
					combinedGroup, ModelPackage.Literals::EQ_INTERFACE_OR_GROUP__NAME)	
			}		
		}
	}
	
	@Check 
	def checkCombinedGroupIsNotEmpty(AssistModel model) {
		for (g : model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition]) {
			
			var boolean foundAtLeastOneInterface = false
			
			for (subGroup : (g as EqInterfaceGroupWithCombinedDefinition).combinedGroups) {
				if (subGroup.eqInterfaces.length > 0) 
					foundAtLeastOneInterface = true
				
				else if (subGroup.implicitlyDefinedEqInterfaces.length > 0)
					foundAtLeastOneInterface = true 
			}
			
			if (!foundAtLeastOneInterface)
				warning("This group is currently empty.", g, ModelPackage.Literals::EQ_INTERFACE_OR_GROUP__NAME)
		}
	
	}
	
	
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
