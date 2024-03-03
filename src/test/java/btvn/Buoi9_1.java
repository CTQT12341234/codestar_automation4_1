package btvn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Buoi9_1 {
	
	
	WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.get("https://selectorshub.com/xpath-practice-page/");
		  
		  try {
			  Thread.sleep(2000);
		  }
		  
		  catch (InterruptedException e) 
		  {
			  e.printStackTrace();
		  }
		  
		  driver.manage().window().maximize();
		  
		  
	  }
	  
	
  @Test
  public void Testcase1() {
	  
	  WebElement imgClose = driver.findElement(By.cssSelector(".sgpb-popup-close-button-6"));
	  imgClose.click();
	  
	  WebElement email = driver.findElement(By.xpath("//input[@title = 'Email']"));
	  email.sendKeys("test@gmail.com");
	  
	  WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	  pass.sendKeys("123456");
	  
	  
	  WebElement company = driver.findElement(By.xpath("//div[@class='element-companyId']//input[@name='company']"));
	  company.sendKeys("ABC");
	  
	  WebElement mobile = driver.findElement(By.xpath("//div[@class='element-companyId']//input[@type='number']"));
	  mobile.sendKeys("0412323231");
	  
	  WebElement btnSubmit = driver.findElement(By.xpath("//input[@value='Submit']"));
	  btnSubmit.click();
  }
  
  

  
  
  
  @AfterTest
  public void afterTest() {
	  //driver.close();
	  
  }

}
