package com.browser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends BaseClass1{
	@Parameters({"browser"})
	@Test
	private void login(String bro) {
		if (bro.equals("chrome")) {
			getDriverChrome();	
			loadUrl("https://www.google.co.in/");
			maximize();
		}
		if (bro.equals("firefox")) {
			getDriverFirefox();
			loadUrl("https://www.google.co.in/");
			maximize();
		}
		if (bro.equals("edge")) {
			getDriverEgde();
			loadUrl("https://www.google.co.in/");
			maximize();
		}

	}

}
