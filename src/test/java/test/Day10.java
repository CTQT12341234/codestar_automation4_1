package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day10 {

	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("Before test");
		  //khoi tao, bat firefox
		  driver = new ChromeDriver();
		  //truyen url
		  driver.get("https://bepantoan.vn/");
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  //mo full man hinh
		  driver.manage().window().maximize();
		  
	  }

	@Test
	@Ignore
	public void checkWithText() {
		  

		 
		  WebElement lnkHutMui = driver.findElement(By.xpath("//a[text()=' Máy Hút Mùi ']"));
		  lnkHutMui.click();
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
		  //Get current url
		  String currentUrl = driver.getCurrentUrl();
		  
		  String expectation = "https://bepantoan.vn/danh-muc/may-hut-mui";
		  
		  if(currentUrl.equals(expectation))
		  {
			  System.out.println("Successful");
			  
		  }
	}
	
	@Test
	@Ignore
	public void checkWithContains0rStartWith() {
		  
		  
		
		  //WebElement lnkHutMui = driver.findElement(By.xpath("(//a[contains(normalize-space(),'Máy Hút Mùi')])[2]"));
		  WebElement lnkHutMui = driver.findElement(By.xpath("(//a[starts-with(normalize-space(),'Máy Hút Mùi')])[2]"));
		  lnkHutMui.click();
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
		  //Get current url
		  String currentUrl = driver.getCurrentUrl();
		  
		  String expectation = "https://bepantoan.vn/danh-muc/may-hut-mui";
		  
		  if(currentUrl.equals(expectation))
		  {
			  System.out.println("Successful");
			  
		  }
		  
		  WebElement topTitle = driver.findElement(By.xpath("//h1[contains(@class,'title-gradient')]"));
		  System.out.println(topTitle.getText());
	}
	
	@Test
	public void checkWithAndOR() {
		  
		
		  WebElement lnkHutMui = driver.findElement(By.xpath("(//a[contains(normalize-space(),'Máy Hút Mùi')])[2]"));
		  //WebElement lnkHutMui = driver.findElement(By.xpath("//a[text()=' Máy Hút Mùi ' or text()=' Máy Rửa Chén Bát ']"));
		  lnkHutMui.click();
		  
		  //List<WebElement> lstElement = driver.findElement(By.xpath("//a[text()=' Máy Hút Mùi ' or text()=' Máy Rửa Chén Bát ']"));
		 // for 
		 // (WebElement webElement : lstElement)
		 // {
		//	  webElement.click();
			  try{
				  Thread.sleep(2000);
			  } catch (InterruptedException e) {
				  e.printStackTrace();
				  
			  }
			  
		 
			
				  
		  
		  
		  
		  //Get current url
		  String currentUrl = driver.getCurrentUrl();
		  
		  String expectation = "https://bepantoan.vn/danh-muc/may-hut-mui";
		  
		  if(currentUrl.equals(expectation))
		  {
			  System.out.println("Successful");
			  
		  }
		  
		  WebElement topTitle = driver.findElement(By.xpath("//h1[contains(@class,'title-gradient')]"));
		  System.out.println(topTitle.getText());
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://bepantoan.vn/");
		driver.manage().window().maximize();
		
		try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		//driver.close();
	
		
	}
	
	
	
	  @AfterTest
	  public void afterTest() {
		  
		  //driver.quit();
	  }

	

}
