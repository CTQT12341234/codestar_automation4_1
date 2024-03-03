package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Day12 {
	
//isSelect= No 
//isSelect = Yes
//visible: deu co the
//invisible
//disable: visible + ko tuong tac

	WebDriver driver;
	
  @Test
  @Ignore
  public void checkBox() {
	  WebElement chAged = driver.findElement(By.id("isAgeSelected"));
	  //isDisplay kiem tra xem phan tu do co xuat hien tren UI ko
	  //isEnable ktra co the tuong tac phan do ko
	  
	  if (chAged.isSelected() == false) {
		  chAged.click();
	  }
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  WebElement chSecond = driver.findElement(By.xpath("(//label[@class='checkbox-inline']//input)[2]"));
	  if (chSecond.isSelected() ==true) {
		  chSecond.click();
		  
	  }
	
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  //list checkbox
	  List < WebElement> lstMultiCheckBox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
	  for (WebElement webElement : lstMultiCheckBox) {
		  if (webElement.isSelected() ==false) {
			  webElement.click();
		  }
	  }
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
  }
  @Test
  @Ignore
  public void radioButton() {
	  driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	  WebElement raMale = driver.findElement(By.xpath("//input[@value='Male' and @name ='optradio']"));
	  //isDisplay kiem tra xem phan tu do co xuat hien tren UI ko
	  //isEnable ktra co the tuong tac phan do ko
	  
	  if (raMale.isSelected() == false) {
		  raMale.click();
	  }
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  WebElement raAge1 = driver.findElement(By.xpath("//input[@name='ageGroup'][1]"));
	  //isDisplay kiem tra xem phan tu do co xuat hien tren UI ko
	  //isEnable ktra co the tuong tac phan do ko
	  
	  if (raAge1.isSelected() == false) {
		  raAge1.click();
	  }
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  WebElement raAge2 = driver.findElement(By.xpath("//input[@name='ageGroup'])[2]"));
	  //isDisplay kiem tra xem phan tu do co xuat hien tren UI ko
	  //isEnable ktra co the tuong tac phan do ko
	  
	  if (raAge2.isSelected() == false) {
		  raAge2.click();
	  }
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  WebElement raAge3 = driver.findElement(By.xpath("//input[@name='ageGroup'])[3]"));
	  //isDisplay kiem tra xem phan tu do co xuat hien tren UI ko
	  //isEnable ktra co the tuong tac phan do ko
	  
	  if (raAge3.isSelected() == false) {
		  raAge3.click();
	  }
	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
  }
  @Test
  public void dropDownList() {
	  driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	  WebElement dropTues = driver.findElement(By.xpath("//select[@id='select-Male'] //option[@value='Tuesday']"));
	  dropTues.click();
	  
	  //isDisplay kiem tra xem phan tu do co xuat hien tren UI ko
	  //isEnable ktra co the tuong tac phan do ko
	  

	  
	  try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	  
	  
	  //select options
	  WebElement ddlWeek = driver.findElement(By.id("select-demo"));
	  Select selectWeek = new Select(ddlWeek);
	  
	 selectWeek.selectByValue("Sunday");
	 try{
		  Thread.sleep(2000);
	  } catch (InterruptedException e) {
		  e.printStackTrace();
		  
	  }
	 
	 selectWeek.selectByVisibleText("Wednesday");
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	
		  driver = new ChromeDriver();
		  //truyen url
		  driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		  
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
