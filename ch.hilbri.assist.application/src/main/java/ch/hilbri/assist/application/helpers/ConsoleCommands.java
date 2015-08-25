package ch.hilbri.assist.application.helpers;

import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * This class is used for a standard console output.
 * 
 * 
 */
public class ConsoleCommands {

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

	/**
	 * Reads text on console
	 * 
	 * @return
	 */
	public static String readConsole() {
		MessageConsole myConsole = findConsole("Console");
		IDocument doc = myConsole.getDocument();
		return doc.get();
	}

	/**
	 * Writes output to the console without a newline
	 * 
	 * @param output
	 * @return
	 */
	public static void writeToConsole(final String output) {
		MessageConsole myConsole = findConsole("Console");
		final MessageConsoleStream out = myConsole.newMessageStream();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				out.print(output);
			}
		});

	}

	/**
	 * Writes output to the console with a newline
	 * 
	 * @param output
	 * @return
	 */
	public static void writeLineToConsole(final String output) {
		MessageConsole myConsole = findConsole("Console");
		final MessageConsoleStream out = myConsole.newMessageStream();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				out.println(output);
			}
		});
	}

	/**
	 * Writes an error to the console without a newline
	 * 
	 * @param error
	 *            Errormessage to print
	 */
	public static void writeErrorToConsole(final String error) {
		MessageConsole myConsole = findConsole("Console");
		final MessageConsoleStream out = myConsole.newMessageStream();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				out.setColor(new Color(Display.getCurrent(), 255, 0, 0));
				out.println("[ERROR]" + error);
			}
		});

	}

	/**
	 * Writes an error to the console with a newline
	 * 
	 * @param error
	 *            Errormessage to print
	 */
	public static void writeErrorLineToConsole(final String error) {
		MessageConsole myConsole = findConsole("Console");
		final MessageConsoleStream out = myConsole.newMessageStream();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				out.setColor(new Color(Display.getCurrent(), 255, 0, 0));
				out.println("[ERROR]" + error);
			}
		});
	}

	/**
	 * @FIXME This method was meant to print an exception after the custom error message. 
	 * It's not really working yet. Well it is, but the format is crap.
	 * @param error
	 * @param e
	 */
	public static void writeErrorLineToConsole(final String error, final Exception e) {
		MessageConsole myConsole = findConsole("Console");
		final MessageConsoleStream out = myConsole.newMessageStream();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				out.setColor(new Color(Display.getCurrent(), 255, 0, 0));
				out.println("[ERROR]" + error);
				for (StackTraceElement tmp : e.getStackTrace()) {
					out.println(tmp.toString());
				}
			}
		});
	}

}