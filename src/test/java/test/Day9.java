package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day9 {

	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("Before test");
		  //khoi tao, bat firefoc
		  driver = new FirefoxDriver();
		  //truyen url
		  driver.get("https://selectorshub.com/xpath-practice-page/");
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  //mo full man hinh
		  driver.manage().window().maximize();
		  
	  }

	@Test
	public void clickLastItem() {
		  
		  WebElement imgClose = driver.findElement(By.cssSelector(".sgpb-popup-close-button-6"));
		  imgClose.click();
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }

		 
		  WebElement lnkLastItem = driver.findElement(By.xpath("(//tr[@class='plan rit'])[last()]//a"));
		  lnkLastItem.click();
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
	}
	
	@Test
	
	public void fillData() {
		  
		  driver.get("https://automationfc.github.io/basic-form/index.html");
		  //fill data for Name field
		  WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
		  txtName.clear();
		  txtName.sendKeys("Test");
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
		  WebElement txtAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		  txtAddress.clear();
		  txtAddress.sendKeys("Hanoi");
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
		  WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		  txtEmail.clear();
		  txtEmail.sendKeys("test@gmail.com");
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
		  
		  WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		  txtPassword.clear();
		  txtPassword.sendKeys("123456");
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
		  WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		  btnSubmit.click();
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
	}
	
	@Test
	@Ignore
	public void printElement() {
		  
		  driver.get("https://automationfc.github.io/basic-form/index.html");
		  //fill data for Name field
		  WebElement btnBlueberry = driver.findElement(By.xpath("//button[@id='blue']"));
		  System.out.println(btnBlueberry.getText());
		  btnBlueberry.click();
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  }
		  
		  
		  
		  WebElement labelOut = driver.findElement(By.xpath("//h1[@id='output']"));
		 System.out.println("Output " + labelOut.getText());
		 
		  
		  try{
			  Thread.sleep(2000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
			  
		  } 
		
		  
	}
	
	  @AfterTest
	  public void afterTest() {
		  System.out.println("Before class");
		  driver.quit();
	  }

	

}
