package testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.CommonBase;
import constants.CT_PageURLs;
import factory.Client_Factory;
import page.LoginPage;

public class AddClientTest extends CommonBase {

	@BeforeMethod
	public void openChrome() throws InterruptedException 
	{
		driver = initChromeDriver (CT_PageURLs.URL_RISE);

	}
	
	@Test
	public void addClientSucessfully() throws InterruptedException
		{
		 LoginPage login = new LoginPage(driver);
		 login.LoginFunction("admin@demo.com", "riseDemo"); 
		 Client_Factory client = new Client_Factory(driver);
		 client.AddClient("Chau test");
		 Thread.sleep(3000);
		 assertTrue(driver.findElement(By.xpath("//td/child::a[text()='Chau test']")).isDisplayed());
		 
		 
		}
	
	
}
