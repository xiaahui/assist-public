package ch.hilbri.assist.mapping.dsl.ide

import ch.hilbri.assist.mapping.dsl.MappingDSLRuntimeModule
import ch.hilbri.assist.mapping.dsl.MappingDSLStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MappingDSLIdeSetup extends MappingDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MappingDSLRuntimeModule, new MappingDSLIdeModule))
	}
	
}
