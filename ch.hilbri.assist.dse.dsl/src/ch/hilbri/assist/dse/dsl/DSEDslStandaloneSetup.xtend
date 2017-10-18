package ch.hilbri.assist.dse.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DSEDslStandaloneSetup extends DSEDslStandaloneSetupGenerated {

	def static void doSetup() {
		new DSEDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
