package btvn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Buoi10_1 {
	
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://alada.vn/tai-khoan/dang-ky.html");
	  
	  try {
		  Thread.sleep(2000);
	  }
	  
	  catch (InterruptedException e) {
		  e.printStackTrace();
		
	  driver.manage().window().maximize();
	  
	  }
	  
	  }

  @Test
  public void f() {
	  WebElement hoten = driver.findElement(By.xpath("//input[@id='txtFirstname']"));
	  hoten.sendKeys("A Tran");
	  WebElement email = driver.findElement(By.xpath("//input[@id='txtEmail']"));
	  email.sendKeys("A@gmail.com");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
