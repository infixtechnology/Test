package com.infix.test;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;

public class BaseClass {
	
	 DefaultSelenium selenium = new DefaultSelenium("localhost", 7777, "*firefox", "http://www.facebook.com");
	
	 @Before
	public void browserOpen(){
		selenium.start();
		selenium.open("/");
		selenium.setSpeed("3000");
		selenium.windowMaximize();
	}
	@After
	public void testFinish(){
		//selenium.close();
		//selenium.stop();
	}
	
	

}
