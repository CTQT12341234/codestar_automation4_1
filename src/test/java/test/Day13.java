package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


import Common.CommonBase;
import constants.CT_PageURLs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day13 extends CommonBase {

	WebDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void openChrome() throws InterruptedException 
		{
			driver = initChromeDriver (CT_PageURLs.checkboxSelenium);
	
		}
	
	@Test
	public void clickSingleCheckbox() 
		{
	  //Tim den element la the input co type = 'checkbox'
			WebElement checkbox1 = driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']/child::input"));
	 
			if (checkbox1.isSelected()==true)
			{
				System.out.println("Checkbox1 da dc checked");
			}
			else
			{
				checkbox1.click();
			}
		}
  
}
