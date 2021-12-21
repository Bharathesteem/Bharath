package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver driver;
	public static void getDriverChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	public static void getDriverFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	public static void getDriverEgde() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
	public static void loadUrl(String url) {
		driver.get(url);

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}

}
