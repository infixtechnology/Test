package com.infix.tech;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePagePositiveTest extends WebdriverBase {
	@Test
	public void login(){
		driver.findElement(By.id("email")).sendKeys("qa.thelathe");
		driver.findElement(By.id("pass")).sendKeys("Thelathe10011");
		driver.findElement(By.id("loginbutton")).click();
		String error = "Incorrect Email";
		String realMsg = driver.findElement(By.tagName("fsl fwb fcb")).getText();
		Assert.assertEquals(realMsg, error);
	}

}
