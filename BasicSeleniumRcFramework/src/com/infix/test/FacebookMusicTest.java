package com.infix.test;

import org.junit.Test;

public class FacebookMusicTest extends BaseClass{
	@Test
	public void music(){
		selenium.click(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[9]/a");
	}

}
