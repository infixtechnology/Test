package com.infix.test;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumBase {
	DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.facebook.com");
	
	
	@Before
	public void browserOpen(){
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.setSpeed("4000");
	}
	@After
	public void browserClose(){
		selenium.close();
		selenium.stop();
	}
}
