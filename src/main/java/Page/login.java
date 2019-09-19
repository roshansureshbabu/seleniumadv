package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

	WebDriver driver;
	By username=By.name("userName");
	By password=By.id("password");
	By signin=By.name("Login");
	By si=By.linkText("SignIn");
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginusr(String un,String pass)
	{
		driver.findElement(si).click();
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signin).click();
		driver.navigate().back();
		
	}
}
