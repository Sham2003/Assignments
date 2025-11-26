package com.training.day4;

import java.text.SimpleDateFormat;
import java.util.Date;

class Logger {
	private static Logger instance;
	private SimpleDateFormat sdt = new SimpleDateFormat("HH:mm:ssss");
	private Logger() {
		System.out.printf("[AppLogger at %s] Initialized\n",sdt.format(new Date()));
	}
	
	public static Logger getLogger() {
		if(instance == null)
			instance = new Logger();
		return instance;
	}
	
	public void log(String msg) {
		System.out.printf("[AppLogger at %s] %s\n",sdt.format(new Date()),msg);
	}
}

public class LoggerDemo {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger();
		
		logger.log("Started Program");
		for(int i=0;i<100000;i++) {  
			
			Math.pow(100, 100);
			Math.sqrt(i);
		}
			
		logger.log("Stopped Program");
	}
}
