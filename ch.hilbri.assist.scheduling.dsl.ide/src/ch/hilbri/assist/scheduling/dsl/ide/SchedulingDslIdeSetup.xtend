/*
 * generated by Xtext 2.12.0
 */
package ch.hilbri.assist.scheduling.dsl.ide

import ch.hilbri.assist.scheduling.dsl.SchedulingDslRuntimeModule
import ch.hilbri.assist.scheduling.dsl.SchedulingDslStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SchedulingDslIdeSetup extends SchedulingDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SchedulingDslRuntimeModule, new SchedulingDslIdeModule))
	}
	
}
