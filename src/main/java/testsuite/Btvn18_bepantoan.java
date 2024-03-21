package testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Common.CommonBase;
import constants.CT_PageURLs;


public class Btvn18_bepantoan extends  CommonBase {
	@BeforeMethod
	@Parameters("browserParamName")
	
	
	public void openBrowser(@Optional("chrome")String browserValue ) throws InterruptedException 
		{
			setupDriver(browserValue);
			driver.get(CT_PageURLs.URL_BepAnToan);
	
		}

		@Test
		
		public void BepAnToanChatVsCtoi()
		{
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
			By chatButton = By.xpath("//span[text()='Chat với chúng tôi']");
			wait.until(ExpectedConditions.visibilityOfElementLocated(chatButton));
			driver.findElement(chatButton).click();
			
			
			String actualUrl = "https://zalo.me/0912331335";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			
		}
}




	
	


