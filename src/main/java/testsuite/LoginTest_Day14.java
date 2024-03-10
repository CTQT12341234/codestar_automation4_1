package testsuite;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Common.CommonBase;
import constants.CT_Account;
import constants.CT_PageURLs;
import factory.LoginPageFactory;

public class LoginTest_Day14 extends CommonBase {
	
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver (CT_PageURLs.URL_RISE);
	}
	

	@Test
	public void LoginSucessfully()
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.TEXT_DASHBOARD).isDisplayed());
		
	}
	
	@Test
	public void loginFail_EmailIncorrectValue()
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("admin123@demo.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.AUTHEN_ERROR).isDisplayed());
		
	}

	@Test
	public void loginFail_EmailIncorrectPass()
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo123");
		assertTrue(driver.findElement(CT_Account.AUTHEN_ERROR).isDisplayed());
		
	}
	
	@Test
	public void loginFail_EmailIncorrectFormat()
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("admin@demo_123.com", "riseDemo");
		assertTrue(driver.findElement(CT_Account.EMAIL_FORMAT_ERROR).isDisplayed());
		
	}
	

}
