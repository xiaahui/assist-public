package ch.hilbri.assist.dse.dsl.ide

import ch.hilbri.assist.dse.dsl.DSEDslRuntimeModule
import ch.hilbri.assist.dse.dsl.DSEDslStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DSEDslIdeSetup extends DSEDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DSEDslRuntimeModule, new DSEDslIdeModule))
	}
	
}
