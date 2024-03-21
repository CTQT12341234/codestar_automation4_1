package testsuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Common.CommonBase;
import constants.CT_PageURLs;

public class Btvn18_Dienmay extends  CommonBase  {
	
	@BeforeMethod
	@Parameters("browserParamName")

	public void openBrowser1(@Optional("chrome")String browserValue ) throws InterruptedException 
	{
		setupDriver(browserValue);
		driver.get(CT_PageURLs.URL_DienMay);

	}
	@Test
	public void DienMayZalo() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000));
		By zaloButton = By.id("zalo-vr");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(zaloButton));
		driver.findElement(zaloButton).click();
		
		
		String actualUrl = "https://zalo.me/0988169282";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		
	}
}

