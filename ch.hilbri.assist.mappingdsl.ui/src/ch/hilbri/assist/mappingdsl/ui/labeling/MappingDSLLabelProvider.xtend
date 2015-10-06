/*
* generated by Xtext
*/
package ch.hilbri.assist.mappingdsl.ui.labeling

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ColocalityRelation
import ch.hilbri.assist.datamodel.model.Compartment
import ch.hilbri.assist.datamodel.model.Connector
import ch.hilbri.assist.datamodel.model.DislocalityRelation
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.InvalidDeployment
import ch.hilbri.assist.datamodel.model.Pin
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.datamodel.model.ValidDeployment
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class MappingDSLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(AssistModel model) {
		model.systemName
	}

	def image(AssistModel model) {
		'outlineview_system_16x16.png'
	}

	def text(Compartment comp) {
		comp.name
	}

	def image(Compartment comp) {
		'outlineview_compartment_16x16.png'
	}

	def text(RDC b) {
		b.name
	}

	def image(RDC b) {
		'outlineview_rdc_16x16.png'
	}

	def text(Connector c) {
		c.name
	}

	def image(Connector c) {
		'outlineview_connector_16x16.png'
	}

	def text(EqInterface a) {
		a.name
	}

	def image(EqInterface a) {
		'outlineview_interface_16x16.png'
	}

	def String text(DislocalityRelation r) {
		'''«r.allEqInterfaceOrGroupNames»''' 
	}

	def image(DislocalityRelation r) {
		'outlineview_specification_16x16.png'
	}
	
	def String text(ValidDeployment s) {
		'''«s.allEqInterfaceOrGroupNames»'''
	}
	
	def image(ValidDeployment s) {
		'outlineview_specification_16x16.png'
	}
	
	def String text(InvalidDeployment s) {
		'''«s.allEqInterfaceOrGroupNames»'''
	}
	
	def image(InvalidDeployment s) {
		'outlineview_specification_16x16.png'
	}
	
	def String text(ColocalityRelation r) {
		'''«r.allEqInterfaceOrGroupNames»'''
	}
	
	def image(ColocalityRelation r) {
		'outlineview_specification_16x16.png'
	}
	
	def String text(Pin p) {
		'''«p.name»: "«p.eqInterfaceType»"'''
	}
	
	def image(Pin p) {
		'outlineview_pin_16x16.png'
	}
	
	def String text(EqInterfaceGroup g) {
		'''Group "«g.name»"'''
	}
	
	def image(EqInterfaceGroup g) {
		'outlineview_interface_group_16x16.png'
	}
}
