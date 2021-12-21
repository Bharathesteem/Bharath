package org.flipkart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobiles extends BaseClass {
	public Mobiles() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Mobiles')]")
	private WebElement lnkMoblie;
	
	@FindBy(xpath = "(//div[contains(@class,'_3FdLqY')])[2]")
	private WebElement btnDragerEnd;
	
	@FindBy(xpath = "(//div[contains(@class,'_1ftpgI')])[5]")
	private WebElement pointer10k;
	
	@FindBy(xpath = "//div[contains(text(),'POCO C31 (Shadow Gray, 64 GB)')]")
	private WebElement linkPocoC31;
	
	@FindBy(xpath = "//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")
	private WebElement btnAddToCart;


	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getLnkMoblie() {
		return lnkMoblie;
	}

	public WebElement getBtnDragerEnd() {
		return btnDragerEnd;
	}

	public WebElement getPointer10k() {
		return pointer10k;
	}

	public WebElement getLinkPocoC31() {
		return linkPocoC31;
	}
	
	public void mobiles() throws InterruptedException {
	
		sleep(5000);
		click(getLnkMoblie());
		sleep(5000);
		dragAndDrop(getBtnDragerEnd(), getPointer10k());
		sleep(5000);
		click(getLinkPocoC31());
		windowHandels();
		click(getBtnAddToCart());
		
		

	}
	
	
	

}
