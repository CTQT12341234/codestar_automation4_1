package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Day11_xpath_axes {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
	  btnSubmit.click();
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  //click paging dropdown list to select All
	  WebElement ddPaging = driver.findElement(By.xpath("//div[contains(@class,'select2-container custom-select custom-select-sm')]"));
	  ddPaging.click();
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  WebElement optAll = driver.findElement(By.xpath("//div[text()='All']"));
	  optAll.click();
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  //find element has text "Virtual..."
	  WebElement lnkVirtual = driver.findElement(By.xpath("//a[text()='Virtual Reality Experience Design']"));
	  System.out.println(lnkVirtual.getAttribute("href"));
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  WebElement trAncestor = driver.findElement(By.xpath("//a[text()='Virtual Reality Experience Design']/ancestor::tr"));
	  System.out.println(trAncestor.getAttribute("class"));
	  
	  
	  List<WebElement> lsttrPreceding = driver.findElements(By.xpath("//a[text()='Virtual Reality Experience Design']/ancestor::tr/preceding::tr"));
	  System.out.println("List of tr preceding text");
	  System.out.println("number of preceding: " + lsttrPreceding.size());
	  
	  
	  
	  //WebElement lnkVirtual = driver.findElement(By.xpath("//a[text()='Virtual Reality Experience Design']"));
	  //lnkVirtual.click();
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  //truyen url
	  driver.get("https://rise.fairsketch.com/projects/all_projects");
	  
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
  }

}
