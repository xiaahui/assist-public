package ch.hilbri.assist.mapping.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MappingDSLStandaloneSetup extends MappingDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new MappingDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
