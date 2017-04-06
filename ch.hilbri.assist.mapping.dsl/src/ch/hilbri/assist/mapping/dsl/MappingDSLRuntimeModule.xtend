package ch.hilbri.assist.mapping.dsl

import org.eclipse.xtext.scoping.IGlobalScopeProvider
import ch.hilbri.assist.mapping.dsl.scoping.NullGlobalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class MappingDSLRuntimeModule extends AbstractMappingDSLRuntimeModule {

	/*
	 * Dies fuegt den NullGlobalScopeProvider ein; dies ist notwendig,
	 * damit wir bei Referenzen uns nur auf das aktuelle File beziehen und keine
	 * anderen Files mit gleicher Endung im gleichen Projekt miteinbeziehen
	 */
	override Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
	    return NullGlobalScopeProvider;
	}
}
