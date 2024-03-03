package btvn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Buoi9_4 {
	
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		
		
		try {
			Thread.sleep(2000);
		}
		
		catch (InterruptedException e){
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
	  }
	
	
  @Test
  public void f() {
	  WebElement img = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	  WebElement ggSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']"));
	  WebElement lucky = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='RNmpXc']"));
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
  }

}
