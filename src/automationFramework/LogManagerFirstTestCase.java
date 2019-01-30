package automationFramework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogManagerFirstTestCase {
	static Logger mainLogger=LogManager.getLogger(LogManager.class.getName());

	public static void main(String[] args) {
		//mainLogger is a logger object that we got from LogManager. All loggers are 
        //using this method only. We can consider LogManager as a factory to create
        //Logger objects
		BasicConfigurator.configure();
		
		//Create a console appender and attach it to our mainLogger
		ConsoleAppender appender=new ConsoleAppender();
		mainLogger.addAppender(appender);
		mainLogger.info("This is just a Logger");

	}

}
