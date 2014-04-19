package com.infix.test;

import org.junit.Test;

public class ProfilePageTest extends BaseClass {
	@Test
	public void registration(){
		selenium.type("email", "test@gmail.com");
		selenium.type("pass", "tests");
		selenium.click("loginbutton");
		
	}
	
}
