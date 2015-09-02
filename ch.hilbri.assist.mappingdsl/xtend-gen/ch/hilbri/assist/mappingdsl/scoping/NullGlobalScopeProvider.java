package ch.hilbri.assist.mappingdsl.scoping;

import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;

/**
 * Diese Klasse erstellt einen NullScopeProvider,
 * damit wir bei Referenzen in der DSL uns nur auf
 * das aktuelle File beziehen
 * (und nicht ein anderes File im selben Projekt
 * mit der gleichen Endung laden)
 * 
 * @author Robert Hilbrich
 * 
 * Siehe http://xtextcasts.org/episodes/17-restricting-scope?view=comments
 */
@SuppressWarnings("all")
public class NullGlobalScopeProvider implements IGlobalScopeProvider {
  @Override
  public IScope getScope(final Resource context, final EReference reference, final Predicate<IEObjectDescription> filter) {
    return IScope.NULLSCOPE;
  }
}
