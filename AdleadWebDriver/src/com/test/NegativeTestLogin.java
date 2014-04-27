package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class NegativeTestLogin extends Base {
	HomePageLocator loc = new HomePageLocator();
	HomePageValue value = new HomePageValue();
	@Test
	public void registration(){
		driver.findElement(By.id(loc.userNameId)).sendKeys(value.userName);
		driver.findElement(By.id(loc.passwordID)).sendKeys(value.password);
		driver.findElement(By.id(loc.loginButtonID)).click();
		String exeres = "Whoops! Please check your login info and try again.";
		String msg = driver.findElement(By.id(loc.ErrorMessageID)).getText();
		Assert.assertEquals(msg, exeres);
	}
	
	@Test
	public void blankNegTest(){
		driver.findElement(By.id(loc.userNameId)).sendKeys("");
		driver.findElement(By.id(loc.passwordID)).sendKeys("");
		driver.findElement(By.id(loc.loginButtonID)).click();
		String exeres = "Password is a required field.\nEmail address is a required field.";
		String msg = driver.findElement(By.id(loc.ErrorMessageID)).getText();
		Assert.assertEquals(msg, exeres);
	}
}
