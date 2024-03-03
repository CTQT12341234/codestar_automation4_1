package testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Common.CommonBase;
import constants.CT_PageURLs;
import page.LoginPage;

public class LoginTest extends CommonBase {

	
	@BeforeMethod
	public void openChrome() throws InterruptedException 
		{
			driver = initChromeDriver (CT_PageURLs.URL_RISE);
	
		}
	
	
	@Test
	public void loginSucessfully() 
		{
		 LoginPage login = new LoginPage(driver);
		 login.LoginFunction("admin@demo.com", "riseDemo");
		 assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
		 
		 
		}
	
	
	@Test
	public void loginFailIncorrectEmail() 
		{
		 LoginPage login = new LoginPage(driver);
		 login.LoginFunction("admin123@demo.com", "riseDemo");
		 assertTrue(driver.findElement(By.xpath("//div[(normalize-space() = 'Authentication failed!')]")).isDisplayed());
		 
		}
	
	
	@Test
	public void loginFailIncorrectPass() 
		{
		 LoginPage login = new LoginPage(driver);
		 login.LoginFunction("admin@demo.com", "riseDemo123");
		 assertTrue(driver.findElement(By.xpath("//div[(normalize-space() = 'Authentication failed!')]")).isDisplayed());
		 
		}
	
	
	@Test
	public void loginFailIncorrectBoth() 
		{
		 LoginPage login = new LoginPage(driver);
		 login.LoginFunction("admin123@demo.com", "riseDemo123");
		 assertTrue(driver.findElement(By.xpath("//div[(normalize-space() = 'Authentication failed!')]")).isDisplayed());
		 
		 
		}
	
	
	@Test
	public void logout() 
		{
		 LoginPage login = new LoginPage(driver);
		 login.LoginFunction("admin@demo.com", "riseDemo");
		 assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
		 
		 WebElement avatar = driver.findElement(By.xpath("//a[@id=\"user-dropdown\"]"));
		 avatar.click();
		 WebElement signOut = driver.findElement(By.xpath("//a[normalize-space()='Sign Out']"));
		 signOut.click();
	
		 
		}
	
	
}
