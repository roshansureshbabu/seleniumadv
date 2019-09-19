package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class action {
	WebDriver driver;

  @Test
  public void f() {
	  driver.findElement(By.linkText("SignIn")).click();
	  WebElement uname= driver.findElement(By.name("userName"));
	  Actions action= new Actions(driver);
	  action.moveToElement(uname).click().keyDown(uname, Keys.SHIFT)
	  .sendKeys(uname, "pravin").keyUp(uname, Keys.SHIFT).doubleClick(uname)
	  .contextClick().build().perform();
	  
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.232.237.143:443/TestMeApp");
}
}
