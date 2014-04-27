package com.infix.test;

import org.junit.Test;

public class Registration extends SeleniumBase {
	@Test
	public void reg(){
		selenium.type("u_0_1", "Reaz");
		selenium.type("u_0_3", "Test");
	}

}
