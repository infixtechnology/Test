package com.test;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumRC {

	public static void main(String [] args){
		
		DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*firefox","https://www.facebook.com/");
		selenium.start();
		selenium.open("/");
		selenium.setSpeed("3000");
		selenium.windowMaximize();
		selenium.type("email", "test@gmail.com");
		selenium.type("pass", "tests");
		selenium.click("loginbutton");
		selenium.close();
		selenium.stop();
		
	}
}
