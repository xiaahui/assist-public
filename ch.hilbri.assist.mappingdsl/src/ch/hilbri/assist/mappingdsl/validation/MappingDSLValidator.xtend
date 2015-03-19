package ch.hilbri.assist.mappingdsl.validation

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition
import ch.hilbri.assist.datamodel.model.InvalidDeploymentImplicit
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.datamodel.model.ValidDeploymentImplicit
import java.util.ArrayList
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MappingDSLValidator extends AbstractMappingDSLValidator {
	
	@Check
	def checkImplicitlyDefinedInterfaceGroupsAreNotEmpty(AssistModel model) {
		
		// Check the groups that have no explicitly added eq interfaces
		for (g : model.eqInterfaceGroups.filter[!(it instanceof EqInterfaceGroupWithCombinedDefinition)].filter[eqInterfaces.length == 0]) {
	
				val listOfImplicitlyDefinedInterface = new ArrayList<EqInterface>
	
				// We have to explode all implicit group definitions
				for (implicitDefinitionElement : g.implicitGroupDefinitions) {
					var Iterable<EqInterface> interfaceList = model.eqInterfaces	
				
					// Go through all entries (they are concatenated by AND)
					for (entry : implicitDefinitionElement.entries) {
						switch (entry.attribute) {
						case NAME:			{ interfaceList = interfaceList.filter[it.name.equals(entry.value)			]}
						case SYSTEM: 		{ interfaceList = interfaceList.filter[it.system.equals(entry.value)		]}
						case SUBATA: 		{ interfaceList = interfaceList.filter[it.subAta.equals(entry.value)		]}
						case RESOURCE: 		{ interfaceList = interfaceList.filter[it.resource.equals(entry.value)		]}
						case LINENAME: 		{ interfaceList = interfaceList.filter[it.lineName.equals(entry.value)		]}
						case WIRINGLANE:	{ interfaceList = interfaceList.filter[it.wiringLane.equals(entry.value)	]}
						case GRPINFO: 		{ interfaceList = interfaceList.filter[it.grpInfo.equals(entry.value)		]}
						case ROUTE: 		{ interfaceList = interfaceList.filter[it.route.equals(entry.value)			]}
						case PWSUP1: 		{ interfaceList = interfaceList.filter[it.pwSup1.equals(entry.value)		]}
						case EMHZONE1: 		{ interfaceList = interfaceList.filter[it.emhZone1.equals(entry.value)		]}
						case IOTYPE: 		{ interfaceList = interfaceList.filter[it.ioType.equals(entry.value)		]}
					}
				}
				
				listOfImplicitlyDefinedInterface.addAll(interfaceList)
			}
			if ((g.eqInterfaces.length == 0) && (listOfImplicitlyDefinedInterface.length == 0))
				warning("The group " + g.name + " contains no interfaces. It is empty. This may be unintended.", g, ModelPackage.Literals::EQ_INTERFACE_OR_GROUP__NAME)		
								
		} // for loop over all group
	}
	
	@Check
	def checkImplicitlyDefinedValidDeploymentsAreNotEmpty(AssistModel model) {
		for (s : model.validDeployments.filter[it instanceof ValidDeploymentImplicit]) {
			var Iterable<RDC> rdcList = model.allRDCs
			for (definition : (s as ValidDeploymentImplicit).definitions) {
				switch (definition.attribute) {
					case RDC_NAME: 			{ rdcList = rdcList.filter[name.equals(definition.value)] 			}
					case RDC_MANUFACTURER: 	{ rdcList = rdcList.filter[manufacturer.equals(definition.value)] 	}
					case RDC_POWERSUPPLY: 	{ rdcList = rdcList.filter[powerSupply.equals(definition.value)] 	}
					case RDC_SIDE: 			{ rdcList = rdcList.filter[side.equals(definition.value)] 			}
					case RDC_TYPE: 			{ rdcList = rdcList.filter[rdcType.equals(definition.value)] 		}
					case RDC_ESS: 			{ rdcList = rdcList.filter[ess.equals(definition.value)] 			}
				}
			}
			if (rdcList.isNullOrEmpty)
				warning("The list of RDCs for this specification is currently empty.", s, ModelPackage.Literals::VALID_DEPLOYMENT_IMPLICIT__DEFINITIONS)		
		}
	}
	
	@Check
	def checkImplicitlyDefinedInvalidDeploymentsAreNotEmpty(AssistModel model) {
		for (s : model.invalidDeployments.filter[it instanceof InvalidDeploymentImplicit]) {
			var Iterable<RDC> rdcList = model.allRDCs
			for (definition : (s as InvalidDeploymentImplicit).definitions) {
				switch (definition.attribute) {
					case RDC_NAME: 			{ rdcList = rdcList.filter[manufacturer.equals(definition.value)] 	}					
					case RDC_MANUFACTURER: 	{ rdcList = rdcList.filter[manufacturer.equals(definition.value)] 	}
					case RDC_POWERSUPPLY: 	{ rdcList = rdcList.filter[powerSupply.equals(definition.value)] 	}
					case RDC_SIDE: 			{ rdcList = rdcList.filter[side.equals(definition.value)] 			}
					case RDC_TYPE: 			{ rdcList = rdcList.filter[rdcType.equals(definition.value)] 		}
					case RDC_ESS: 			{ rdcList = rdcList.filter[ess.equals(definition.value)] 			}
				}
			}
			if (rdcList.isNullOrEmpty)
				warning("The list of RDCs for this specification is currently empty.", s, ModelPackage.Literals::INVALID_DEPLOYMENT_IMPLICIT__DEFINITIONS)		
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
	
//	@Check 
//	def checkCombinedGroupIsNotEmpty(AssistModel model) {
//		for (g : model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition]) {
//			var boolean foundAtLeastOneInterface = false
//			
//			for (combinedGroup : (g as EqInterfaceGroupWithCombinedDefinition).combinedGroups) {
//				if (combinedGroup.eqInterfaces.length > 0) 
//					foundAtLeastOneInterface = true
//					
//				else 
//					if (combinedGroup instanceof EqInterfaceGroupWithImplicitDefinition) {
//						var Iterable<EqInterface> interfaceList = model.eqInterfaces	
//						for (definition : (combinedGroup as EqInterfaceGroupWithImplicitDefinition).definitions) {
//							switch (definition.attribute) {
//								case NAME:			{ interfaceList = interfaceList.filter[it.name.equals(definition.value)] }
//								case SYSTEM: 		{ interfaceList = interfaceList.filter[it.system.equals(definition.value)] }
//								case SUBATA: 		{ interfaceList = interfaceList.filter[it.subAta.equals(definition.value)] }
//								case RESOURCE: 		{ interfaceList = interfaceList.filter[it.resource.equals(definition.value)]}
//								case LINENAME: 		{ interfaceList = interfaceList.filter[it.lineName.equals(definition.value)]}
//								case WIRINGLANE:	{ interfaceList = interfaceList.filter[it.wiringLane.equals(definition.value)]}
//								case GRPINFO: 		{ interfaceList = interfaceList.filter[it.grpInfo.equals(definition.value)]}
//								case ROUTE: 		{ interfaceList = interfaceList.filter[it.route.equals(definition.value)]}
//								case PWSUP1: 		{ interfaceList = interfaceList.filter[it.pwSup1.equals(definition.value)]}
//								case EMHZONE1: 		{ interfaceList = interfaceList.filter[it.emhZone1.equals(definition.value)]}
//								case IOTYPE: 		{ interfaceList = interfaceList.filter[it.ioType.equals(definition.value)]}
//							}
//						}
//						if (interfaceList.length > 0)
//							foundAtLeastOneInterface = true
//					}
//			}
//			
//			if (!foundAtLeastOneInterface)
//				warning("This group is currently empty.", g, ModelPackage.Literals::EQ_INTERFACE_OR_GROUP__NAME)
//		}
//	
//	}
//	
	
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
