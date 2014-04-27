package com.infix.tech;


import org.junit.Test;
import org.openqa.selenium.By;


public class WebDriverTest extends WebdriverBase {
	
	
	@Test
	public void registration(){
		driver.findElement(By.id("email")).sendKeys("qa.thelathe@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Thelathe10011");
		driver.findElement(By.id("loginbutton")).click();
	}

}
