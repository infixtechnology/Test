package com.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class HomePageTest extends Base {
	
	@Test
	public void home(){
		driver.findElement(By.id("u_0_1")).sendKeys("Reaz");
		driver.findElement(By.id("u_0_3")).sendKeys("Patwary");
		driver.findElement(By.id("u_0_5")).sendKeys("Reaz@test.com");
		
	}

}
