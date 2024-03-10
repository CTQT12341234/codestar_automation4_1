package testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.CommonBase;
import constants.CT_PageURLs;
import factory.Client_Factory;
import factory.TechPageFactory;
import page.LoginPage;

public class TechdevBtvn_day15 extends CommonBase {
	
	@BeforeMethod
	public void openChrome() throws InterruptedException 
	{
		driver = initChromeDriver (CT_PageURLs.URL_TECH);

	}
	 
	@Test
	public void btvnday15() throws InterruptedException 
		{
		TechPageFactory pagetech = new TechPageFactory(driver);
		Thread.sleep(3000);
		pagetech.CheckRadioButton();
		pagetech.InputDestination("Melbourne", "Sydney");
		pagetech.HandleDatePicker();
		pagetech.SelectCoach();
		pagetech.Search();
		 
		}


	
}
	
