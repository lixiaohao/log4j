package com.lixiaohao.log4j;

import org.apache.log4j.Logger;


public class Log4jTest {
	private static Logger logger = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.debug("hello world!");
		logger.error("this is a error!");

	}

}
