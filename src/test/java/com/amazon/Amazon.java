package com.amazon;

import org.flipkart.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon extends BaseClass{
	@BeforeClass
	public void beforeClass() {
		getDriverChrome();
		loadUrl("https://www.amazon.in/");
		timeOut();
		maximize();
		

	}
	@AfterClass
	public void afterClas() {
		//quitBrowser();
		System.out.println("dev");
		

	}
	@Test
	public void TestClass() {
		WebElement txtSerachbox = findElementByXpath("//input[@id='twotabsearchtextbox']");
		type(txtSerachbox, "iphone13");
		WebElement btnSearch = findElementByXpath("//input[@id='nav-search-submit-button']");
		click(btnSearch);
		WebElement linkIphone13 = findElementByXpath("//span[text()='Apple iPhone 13 (256GB) - Pink']//parent::a//parent::h2//parent::div//parent::div//child::span[text()='89,900']");
		String text = getText(linkIphone13);
		System.out.println(text);

	}
	

}
