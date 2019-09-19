package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class javascr {
	WebDriver driver;

  @Test
  public void f() {
//how to get title
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  String sText=js.executeScript("return document.title").toString();
	  System.out.println(sText);
	  //how to click a button
 		WebElement contact_icon = driver.findElement(By.linkText("Forgotten account?"));
 		JavascriptExecutor executor = (JavascriptExecutor)driver;
 		executor.executeScript("arguments[0].click();", contact_icon );
 		//alert popup
   		JavascriptExecutor js1 = (JavascriptExecutor)driver;
   		js1.executeScript("alert('hello world');", driver.findElement(By.xpath("//*[@id=\'email\']")));
	  
	 }
 
  
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");

}
}
