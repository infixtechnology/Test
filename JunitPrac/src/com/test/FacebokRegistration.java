package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FacebokRegistration {
	@Test
	public void registration(){
		System.out.println("Test-regi");
	}
	@Test
	public void bla(){
		System.out.println("bla");
	}
	@Test
	public void inbox(){
		System.out.println("Test-inbox");
	}
	@Before
	public void testStart(){
		System.out.println("Before");
	}

	@After
	public void testFinish(){
		System.out.println("After");
	}
	@AfterClass
	public static void browserClase(){
		System.out.println("AfterClass");
	}
	@BeforeClass
	public static void openBrowser(){
		System.out.println("Beforeclass");
	}
}
