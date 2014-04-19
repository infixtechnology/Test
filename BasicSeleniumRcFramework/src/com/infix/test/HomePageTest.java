package com.infix.test;

import org.junit.Test;

public class HomePageTest extends BaseClass {
	@Test
	public void regis(){
		selenium.type("u_0_1", "Test");
		selenium.type("u_0_3", "Last Name");
		selenium.type("u_0_5", "test@test.com");
	}

}
