package btvn;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buoi9_3 {
		
	WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		 
		 driver = new ChromeDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 
		 try
		 {
			 Thread.sleep(2000);
			 
		 }
		  
		 catch (InterruptedException e) {
			 e.printStackTrace();
			 
		 }
		 driver.manage().window().maximize();
		 
		  }
	  
		
  @Test
  public void TestcaseTest() {
	  WebElement imgClose = driver.findElement(By.cssSelector(".sgpb-popup-close-button-6"));
	  imgClose.click();
	  
	  //se thay classname table with id=resultTable, sau do nhin keo xuong se thay tbody voi nhieu tr, chon tr voi position tuong ung
	  WebElement tr1 = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[4]"));
	  WebElement tr2 = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr[5]"));
	  WebElement tr3 = driver.findElement(By.xpath("//table(@id='resultTable']//tbody//tr[6]"));

  }

  
  
  
  @AfterTest
  public void afterTest() {
	  
	  
  }
  
}
