import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlipkart extends BaseClass
{
	public LoginFlipkart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(@class,'_2KpZ6l _2doB4z')]")
	private WebElement btnPopupClose;
	
	@FindBy(xpath = "//a[contains(@class,'_1_3w1N')]")
	private WebElement btnLogin1;
	
	@FindBy(xpath = "//input[contains(@class,'_2IX_2- VJZDxU')]")
	private WebElement txtUserName;
	
	@FindBy(xpath = "//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")
	private WebElement btnLogin2;

	public WebElement getBtnPopupClose() {
		return btnPopupClose;
	}

	public WebElement getBtnLogin1() {
		return btnLogin1;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin2() {
		return btnLogin2;
	}

	public void loginFlipkart(String userName, String password) {
		
		click(getBtnPopupClose());
		click(getBtnLogin1());
		type(getTxtUserName(), userName);
		type(getTxtPassword(), password);
		click(getBtnLogin2());

	}
	
}
