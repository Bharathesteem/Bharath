package com.insta;

import org.flipkart.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@name,'username')]")
	private WebElement txtUserName;
	
	@FindBy(xpath = "//input[contains(@name,'password')]")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//div[contains(text(),'Log In')]")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//button[contains(text(),'Not Now')]")
	private WebElement btnNotNow;
	
	@FindBy(xpath = "//button[contains(text(),'Not Now')]")
	private WebElement btnNotNow2;
	
	@FindBy(xpath = "//a[contains(@class,'xWeGp')]")
	private WebElement btnMessenger;
	
	@FindBy(xpath = "//div[contains(text(),'Nisha')]")
	private WebElement btnfrnd1;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,'Message...')]")
	private WebElement txtmessage;
	
	@FindBy(xpath = "//button[contains(text(),'Send')]")
	private WebElement btnSend;
	
	

	public WebElement getBtnSend() {
		return btnSend;
	}

	public WebElement getTxtmessage() {
		return txtmessage;
	}

	public WebElement getBtnfrnd1() {
		return btnfrnd1;
	}

	public WebElement getBtnMessenger() {
		return btnMessenger;
	}

	public WebElement getBtnNotNow2() {
		return btnNotNow2;
	}

	public WebElement getBtnNotNow() {
		return btnNotNow;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void loginPage() throws InterruptedException {
		
		type(getTxtUserName(), "bharath.esteem@gmail.com");
		type(getTxtPassword(), "lancer r8");
		click(getBtnLogin());
		click(getBtnNotNow());
		click(getBtnNotNow2());
		click(getBtnMessenger());
		click(getBtnfrnd1());
		type(getTxtmessage(), "Hii");
		click(getBtnSend());
		
		

	}
	
	
	
	
	

}
