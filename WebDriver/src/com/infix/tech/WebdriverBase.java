package com.infix.tech;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBase {
WebDriver driver = new FirefoxDriver();
	
	@Before
	public void browserStar(){
		driver.get("http://www.facebook.com");
	}
	
	public void bowserClose(){
		driver.close();
	}
}
