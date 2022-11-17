package com.epam.log4jdemo;

import org.apache.log4j.Logger;

public class HtmlLayoutExample {

	static Logger log = Logger.getLogger(HtmlLayoutExample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Sample debug message");  
        log.info("Sample info message");  
        log.error("Sample error message");  
        log.fatal("Sample fatal message");  
	}

}
