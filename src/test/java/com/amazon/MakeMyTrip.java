package com.amazon;

import org.flipkart.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MakeMyTrip extends BaseClass {
	@BeforeClass
	public void beforeClass() {
		getDriverChrome();
		loadUrl("https://www.makemytrip.com/");
		timeOut();
		maximize();
		

	}
	@AfterClass
	public void afterClas() {
		//quitBrowser();
		

	}
	@Test
	public void TestClass() {
		WebElement btnPopcls = findElementByXpath("//span[@class='langCardClose']");
		click(btnPopcls);
		WebElement btnHome = findElementByXpath("//div['loginModal displayBlock modalLogin dynHeight personal']");
		click(btnHome);
		WebElement btnSearch = findElementByXpath("//a[text()='Search']");
		mouseOver(btnSearch);
		click(btnSearch);
		click(btnSearch);
		WebElement txtTime  = findElementByXpath("//div[@class='listingRhs']//child::span[text()='Vistara']//parent::div//parent::div//parent::div//child::span[text()='16:05']");
		getText(txtTime);

	}
}
