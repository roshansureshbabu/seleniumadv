package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
WebDriver driver;

  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\'myInput\']")).click();
	  WebElement search= driver.findElement(By.xpath("//*[@id=\'myInput\']"));
	  search.sendKeys("b");
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  search.sendKeys("a");
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[@id=\'myInput\']")).click();
	  search.sendKeys("g");
	  driver.findElement(By.xpath("//*[@id=\'myInput\']")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Actions act1=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		String text=driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
		Assert.assertTrue(text.contains("Hand bag")); 
		System.out.println(text);
	  
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebDriverWait wait=new WebDriverWait(driver, 60);
	  WebElement ex;
	  ex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'slider-carousel\']/div/div[1]/div[1]/button")));
	 	  
  }
  @AfterClass
  public void afterclass()
  {
	  //driver.close();
  }

}
