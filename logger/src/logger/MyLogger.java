package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
public static final Logger LOGGER=Logger.getLogger(MyLogger.class.getName());
public static void main(String[] args) {
	ConsoleHandler consoleHandler = new ConsoleHandler();
	consoleHandler.setLevel(Level.SEVERE);
	LOGGER.setLevel(Level.FINE);
	LOGGER.finest("I am from the Finest");
	LOGGER.finer("I am from the Finer");
	LOGGER.fine("I am from the Fine");
	LOGGER.config("I am from the config");
	LOGGER.info("I am from the info");
	LOGGER.warning("I am from the warning");
	LOGGER.severe("I am from the severe");
}

}
