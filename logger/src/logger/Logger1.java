package logger;

import java.io.IOException;
import java.util.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Logger1 {
	public static final Logger LOGGER=Logger.getLogger(MyLogger.class.getName());
	public static void main(String[] args)throws Exception,IOException {
		FileHandler fileHandler=new FileHandler("C:\\Users\\Dell\\Desktop\\New folder (5)");
		Formatter formatter = new Formatter();
		fileHandler.setFormatter(formatter));
		Logger.
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

}
