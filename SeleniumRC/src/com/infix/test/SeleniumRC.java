package com.infix.test;

import org.junit.Test;


public class SeleniumRC extends SeleniumBase {

	@Test
	public void login(){
		selenium.type("email", "qa.thelathe@gmail.com");
		selenium.type("pass", "Thelathe10011");
		selenium.click("loginbutton");
	}

}
