package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.mapping.model.result.Result
import ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl
import ch.hilbri.assist.model.Application

class MinOrganizationsPerBoard extends AbstractMetricImpl {
	new() {
		setName("MinOrganizationsPerBoard")
		setBuiltIn(true)
		setHigherScoreIsBetter(false)
	}

	override double computeAbsoluteScore(Result result) {
		var maxOrgCount = 0

		for (board : result.model.allBoards) {
			
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
