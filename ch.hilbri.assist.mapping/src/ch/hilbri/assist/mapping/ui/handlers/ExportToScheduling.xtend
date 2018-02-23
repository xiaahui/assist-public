package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.mapping.result.FactorySchedulingModelFromMappingSolution
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor
import ch.hilbri.assist.scheduling.dsl.SchedulingDslStandaloneSetup
import java.io.IOException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.e4.core.contexts.Active
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.ui.basic.MPart
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor
import org.eclipse.xtext.resource.SaveOptions

class ExportToScheduling {
	
	@CanExecute
	def boolean canExecute(@Active MPart part) {
		
		/* Check if we can use the part provided by the @Active annotation */
		if ((part === null) || (!(part.object instanceof CompatibilityEditor))) 					return false
		
		val compEditor = part.object as CompatibilityEditor
		if ((compEditor === null) || (!(compEditor.editor instanceof MultiPageEditor))) 			return false
		
		val multiPageEditor = compEditor.editor as MultiPageEditor
		if ((multiPageEditor.currentMappingResult === null) || (multiPageEditor.activePage != 1)) 	return false
		
		true
	}
	
	@Execute
	def Object execute(@Active MPart part, IProgressMonitor monitor) {
//		val compEditor = part.object as CompatibilityEditor
//		val multiPageEditor = compEditor.editor as MultiPageEditor
//		val result = multiPageEditor.currentMappingResult
//		
//		val schedulingModel = FactorySchedulingModelFromMappingSolution.createAssistModel(result)
//		val mappingModelURI = EcoreUtil.getURI(result.model)
//		val projectName = mappingModelURI.segment(1)
//		val fileName = mappingModelURI.trimFileExtension.lastSegment 
//		
//		val schedulingModelURI = URI.createPlatformResourceURI("/" + projectName + "/" + "Scheduling" + "/" + fileName + "-Solution.sdsl", true)
//		
//		val injector = (new SchedulingDslStandaloneSetup()).createInjectorAndDoEMFRegistration()
//		val rs = injector.getInstance(ResourceSet)
//		
//		val r = rs.createResource(schedulingModelURI)
//		
//		r.contents.add(schedulingModel)
//		
//		val options = SaveOptions.newBuilder
//		options.format
//	
//		try {
//			r.save(options.options.toOptionsMap())
//		}
//		catch (IOException e) {
//			e.printStackTrace
//		}
		
		null
	}
	
	
	
}