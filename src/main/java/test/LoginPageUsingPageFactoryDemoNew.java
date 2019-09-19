package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LibraryFunction.BrowserFactory;
import Page.LoginPageUsingPageFactory;

    public class LoginPageUsingPageFactoryDemoNew {

	@Test
	public void test()
	{
		//calling the utillitypack for initializing the browser and passing the url
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://demoaut.com/");
		
		//this will create a page object of loginpageNew class and return the object.
		LoginPageUsingPageFactory log=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		
		
		//call the method
		log.login("tutorial", "tutorial");
	}
}

    
    
    
    
    