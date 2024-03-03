package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;



@Test
public class Day8_Locator {
	
	WebDriver driver;
@Test
@Ignore
public void Testcase1() {
	  WebElement divPopup = driver.findElement(By.id("sg-popup-content-wrapper-14746"));
	  divPopup.click();
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  WebElement txtEmail = driver.findElement(By.name("username"));
	 
	  txtEmail.clear();
	  txtEmail.sendKeys("Admina");
	  WebElement txtPassword = driver.findElement(By.id("pass"));
	  txtPassword.clear();
	  txtPassword.sendKeys("Admin123");
	  WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='Submit']"));
	  btnSubmit.click();
	  
	  //locator by text from the link 
	  //WebElement link = driver.findElement(By.linkText("")).click();
	  
	  //locator by partial link
	  //WebElement link = driver.findElement(By.partialLinkText("Eng")).click();
	  
	  //locator by css
	  //WebElement link = driver.findElement(By.cssSelector(".ghjk")).clear();
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
  }
  
@Test
@Ignore

public void Testcase2() {
	  
	  WebElement txtUser = driver.findElement(By.name("username"));
		 

	  txtUser.sendKeys("Admin");
	  WebElement txtPassword = driver.findElement(By.name("password"));
	  txtPassword.clear();
	  txtPassword.sendKeys("admin123");
	  WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
	  btnSubmit.click();
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
}

@Test
public void Testcase3() {
	  
	  WebElement txtUser = driver.findElement(By.name("username"));
		 

	  txtUser.sendKeys("Admin");
	  WebElement txtPassword = driver.findElement(By.name("password"));
	  txtPassword.clear();
	  txtPassword.sendKeys("admin123");
	  WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
	  btnSubmit.click();
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
}

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
	  //khoi tao, bat firefoc
	  driver = new FirefoxDriver();
	  //truyen url
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  //mo full man hinh
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Before class");
	  driver.quit();
  }

}
