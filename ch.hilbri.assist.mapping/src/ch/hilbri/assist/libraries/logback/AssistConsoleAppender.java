package ch.hilbri.assist.libraries.logback;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;

public class AssistConsoleAppender<E> extends ConsoleAppender<E> {

	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();

		// searches for existing console
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	} 
	
	@Override
	protected void subAppend(E event) {
		if (!isStarted()) { return; }
		
		LayoutWrappingEncoder<E> layoutEncoder = (LayoutWrappingEncoder<E>) this.encoder;
		String message = layoutEncoder.getLayout().doLayout(event);
		
		MessageConsole myConsole = findConsole("Console");
		MessageConsoleStream out = myConsole.newMessageStream();
		
		out.print(message);
	}
}
