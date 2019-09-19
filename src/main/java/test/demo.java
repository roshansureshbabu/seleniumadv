package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import LibraryFunction.BrowserFactory;
import Page.login;

public class demo {

	WebDriver driver;
	 @Test
	public void test()
	{
		WebDriver driver= BrowserFactory.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp");
		login log=new login(driver);
		log.loginusr("tutorial","tutorial");
		
	}
	
}
