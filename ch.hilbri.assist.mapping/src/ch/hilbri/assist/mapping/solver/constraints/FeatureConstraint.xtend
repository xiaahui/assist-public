package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.HardwareArchitectureLevelType
import org.chocosolver.solver.Model

class FeatureConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("feature", model, chocoModel, solverVariables)
	}

	override generate() {        
        val workedShared = generateSharedFeatureConstraints()
        propagate()
        
        val workedExclusive = generateExclusiveFeatureConstraints()
        propagate()
     
        // Did we actually do anything?   
		return workedShared || workedExclusive
	}

    /** 
     * Generate the constraints that are necessary to model exclusive features of hardware ressources
     * 
     * @returns boolean to indicate whether some constraints were actually posted 
     */
    private def boolean generateExclusiveFeatureConstraints() {
        var worked = false
        
        /* Step 1: We need to restrict every task to a set of hardware ressources
         *         that are actually offering the requested feature              */
         
        for (task : model.allTasks) {
            for (featureReq : task.featureRequirements.filter[isExclusive]) {
                // Retrieve all hardware components from the requested level (e.g. all boards)
                val hwElements = model.getAllHardwareElements(featureReq.hardwareLevel.value)
                
                // Of those hardware elements, we want to find those, that are providing 
                //   - at least one feature that is "exclusive" 
                //   - has a matching name
                //   - offers a unit count > 0
                val allowedHwElements = hwElements.filter[
                    !features.filter[it.isExclusive                && 
                                     it.name == featureReq.name    &&
                                     it.units > 0
                    ].isEmpty
                ]

                // If there is no suitable hardware component, then we found an unsolvable problem
                // TODO: Improve constraint message (better feedback to the user)
                if (allowedHwElements.nullOrEmpty) throw new BasicConstraintsException(this)
                
                // Now, we need to find the index values for each hardware element
                val possibleHwElementsIdx = allowedHwElements.map[hwElements.indexOf(it)]
                    
                // After we got these index values, we just need to restrict the location variable
                val locVar = solverVariables.getLocationVariableForTaskAndLevel(task, featureReq.hardwareLevel)
                chocoModel.member(locVar, possibleHwElementsIdx).post
                worked = true    
            }
        }
        
        /* Step 2: We need to add the necessary constraints to model the capacity of an exclusive feature
         *         For this purpose, we need to take the perspective of a resource and make sure 
         *         that the sum of the demand of all tasks, that are mapped to this ressource does not exceed 
         *         its capacity                                                                                 */

        // Go through each hardware level
        for (int hardwareLevel : HardwareArchitectureLevelType.VALUES.map[value]) {
            // Find out, which exclusive features are offered at this level (save the names)
            val featureNames = model.getAllHardwareElements(hardwareLevel).map[features.filter[isExclusive].map[it.name]].flatten.toSet

            // Go through each component on this level and add the constraints for each available feature
            for (hwElem : model.getAllHardwareElements(hardwareLevel)) {
                
                // locate the indicator variable (which of the tasks will be mapped to this hardware element?)
                val indVars = solverVariables.getIndVars(hwElem)
                
                // Go through each feature on this hardware level - even it is not offered by this hardware element
                for (String featureName : featureNames) {
                    // Find out, how many units of this feature is required by each task
                    // Please note, that the grammar prevents double feature requirements with the same name in the spec
                    val taskRequests = model.allTasks.map[
                        // Does this task require this exclusive feature? If
                        // If there is no matching feature requirement, then 0
                        if (featureRequirements.filter[isExclusive && it.name == featureName].isNullOrEmpty) 0
                        // Otherwise return the number of units required
                        else featureRequirements.filter[isExclusive && it.name == featureName].head.units
                    ]
                    
                    // Find out, how many units of this feature is provided by this hardware element
                    var hwElemCapacity = 0
                    if (!hwElem.features.filter[isExclusive && it.name == featureName].isNullOrEmpty)
                        hwElemCapacity = hwElem.features.filter[isExclusive && it.name == featureName].head.units
                    
                    // We need to add the capacity constraint for each of this feature
                    chocoModel.scalar(indVars, taskRequests, "<=", hwElemCapacity).post()
                    worked = true
                }
            }
        } 
        
        return worked
    }

    /** 
     * Generate the constraints that are necessary to model shared features of hardware ressources
     * 
     * @returns boolean to indicate whether some constraints were actually posted 
     */
    private def boolean generateSharedFeatureConstraints() {
         var worked = false
         for (task : model.allTasks) {
            
            /* Step 1: Simple shared requirements */
            for (featureReq : task.featureRequirements.filter[isShared]) {
                
                // Retrieve all hardware components from the requested level (e.g. all boards)
                val hwElements = model.getAllHardwareElements(featureReq.hardwareLevel.value)
                
                // Of those hardware elements, we want find those, that are providing at least one feature that is 
                // "shared" and has a matching name
                val allowedHwElements = hwElements.filter[
                    !features.filter[isShared && it.name == featureReq.name].isEmpty
                ]

                // If there is no suitable hardware component, then we found an unsolvable problem
                // TODO: Improve constraint message (better feedback to the user)
                if (allowedHwElements.nullOrEmpty) throw new BasicConstraintsException(this)
                
                // Now, we need to find the index values for each hardware element
                val possibleHwElementsIdx = allowedHwElements.map[hwElements.indexOf(it)]
                    
                // After we got these index values, we just need to restrict the location variable
                val locVar = solverVariables.getLocationVariableForTaskAndLevel(task, featureReq.hardwareLevel)
                chocoModel.member(locVar, possibleHwElementsIdx).post
                worked = true    
            }
        }
        return worked
    }
}
