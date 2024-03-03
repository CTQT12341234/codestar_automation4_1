package btvn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Buoi9_2 {
	
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://chercher.tech/practice/dynamic-table");
	  
	  try
	  
	  {
		  Thread.sleep(2000);
	  }
	  catch (InterruptedException e)
	  {
		  e.printStackTrace();
	  }
	  
	  driver.manage().window().maximize();
	  
	  
	  }
	
	
	

  @Test
  public void Testcase() {
	  
	  WebElement btnBlue = driver.findElement(By.xpath("//button[@id='blue']"));
	  btnBlue.click();
	  
	  
	  WebElement btnOrange = driver.findElement(By.xpath("//button[normalize-space()='Orange']"));
	  btnOrange.click();
	  
	  WebElement btnJuice = driver.findElement(By.xpath("//button[normalize-space()='Juice']"));
	  btnJuice.click();
	  
	  WebElement btnBanana = driver.findElement(By.xpath("//button[normalize-space()='banana']"));
	  btnBanana.click();
	  
	  WebElement btnBananaJuice = driver.findElement(By.xpath("//button[normalize-space()='Banana \"Juice']"));
	  btnBananaJuice.click();
	  
	  //chi vo button co classnam = div o position [2], va sau do ta co the thay co classname = input va position [1]
	  WebElement btnJack = driver.findElement(By.xpath("//div[@id='unique'][2]/input[1]"));
	  btnJack.click();
	  
	  //WebElement output = driver.findElement(By.xpath("//h1[@id='output']"));
	  
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
