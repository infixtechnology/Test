package com.infix.tech;

import org.junit.Test;
import org.testng.Assert;

public class NewTest extends WebdriverBase {
	@Test
	public void titleTest(){
		String title = "Welcome blaa to Facebook - Log In, Sign Up or Learn More";
		
		String fbTItle;
		
		fbTItle = driver.getTitle();
	
		Assert.assertEquals(fbTItle, title);
	}

}
