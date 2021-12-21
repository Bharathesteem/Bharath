package com.amazon;

import java.util.List;

import org.flipkart.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google extends BaseClass{
	@BeforeClass
	public void beforeClass() {
		getDriverChrome();
		loadUrl("https://www.google.com/?gws_rd=ssl");
		timeOut();
		maximize();
		

	}
	@AfterClass
	public void afterClas() {
		//quitBrowser();
		

	}
	@Test
	public void TestClass() throws InterruptedException {
		WebElement txtSearch = findElementByXpath("//input[@class='gLFyf gsfi']");
		type(txtSearch, "covid");
		sleep(5000);
		List<WebElement> findElements = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
