package ch.hilbri.assist.application.processors;

import java.util.List;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.commands.MBindingTable;
import org.eclipse.e4.ui.model.application.commands.MKeyBinding;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * Removes keybindings that are part of an eclipse plugin, but are replaced by custom keybindings
 *
 */
public class KeybindingProcessor {

	@Execute
	public void run(MApplication app) {

		// Deletes F11 Keybinding Debug -> TODO filtert nur erste Übereinstimmung weg
		for (MBindingTable table : app.getBindingTables()) {
			List<MKeyBinding> bindings = table.getBindings();

			// Delete Key
			for (MKeyBinding binding : bindings) {
				if (binding.getKeySequence().equalsIgnoreCase("DEL")) {
					if (binding.getElementId() == null || !binding.getElementId().equals(PathProvider.APP_KEYBINDING_DELETE)) {
						bindings.remove(binding);
						break;
					}
				}

			}

			// Copy Key
			for (MKeyBinding binding : bindings) {
				if (binding.getKeySequence().equalsIgnoreCase("CTRL+C")) {
					if (binding.getElementId() == null || !binding.getElementId().equals(PathProvider.APP_KEYBINDING_COPY)) {
						bindings.remove(binding);
						break;
					}
				}
			}

			// Paste Key
			for (MKeyBinding binding : bindings) {
				if (binding.getKeySequence().equalsIgnoreCase("CTRL+V")) {
					if (binding.getElementId() == null || !binding.getElementId().equals(PathProvider.APP_KEYBINDING_PASTE)) {
						bindings.remove(binding);
						break;
					}
				}
			}
		}
	}
}
