package com.insta;

import org.flipkart.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Instagram extends BaseClass {
	@BeforeClass
	private void beforeclass() {
		getDriverFirefox();
		loadUrl("https://www.instagram.com/");
		timeOut();
		maximize();
		
		

	}
	
	@AfterClass
	private void afterClass() {
		//quitBrowser();

	}
	@Test
	private void instaGram() throws InterruptedException {

		LoginPage login = new LoginPage();
		login.loginPage();

	}
	

}
