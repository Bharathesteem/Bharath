import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {
	
	@BeforeClass
	private void beforClass() {
		
		getDriverChrome();
		loadUrl("https://www.flipkart.com/");
		maximize();
	}
	@AfterClass
	private void afterClass() {
		//quitBrowser();

	}
	
	@Test
	private void testClass() throws InterruptedException {
		LoginFlipkart login = new LoginFlipkart();
		login.loginFlipkart("9488879830", "lancer r8");
		Mobiles mob = new Mobiles();
		mob.mobiles();

	}
	

}
