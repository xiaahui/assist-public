package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.impl.AbstractMappingMetricImpl

class MinOrganizationsPerBoard extends AbstractMappingMetricImpl {
	new() {
		setName("MinOrganizationsPerBoard")
		setBuiltIn(true)
		setHigherScoreIsBetter(false)
	}

	override double computeAbsoluteScore(MappingResult result) {
		var maxOrgCount = 0

		for (board : result.getModel.allBoards) {
			
			val organizations = newArrayList()
			
			for (core : board.allCores) {

				val tasks = result.getMappedTasksForCore(core)

				if (!tasks.isNullOrEmpty) 
					for (task : tasks) {
						val app = task.eContainer as Application
						if (!app.developedBy.isNullOrEmpty)
							organizations.add(app.developedBy)
					}
			}
			
			// Make them unique
			val orgCountPerBoard = organizations.toSet.toList.size 
			
			if (orgCountPerBoard > maxOrgCount)
				maxOrgCount = orgCountPerBoard
		}

		return maxOrgCount
	}
}
