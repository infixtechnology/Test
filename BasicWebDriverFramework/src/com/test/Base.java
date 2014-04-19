package com.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	WebDriver driver = new FirefoxDriver();
	
	@Before
	public void openBrowser(){
		driver.get("http://www.facebook.com");
	}

}
