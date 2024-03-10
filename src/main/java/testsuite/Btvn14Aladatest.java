package testsuite;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.CommonBase;
import constants.CT_PageURLs;
import factory.ProfilePageFactory;
import factory.SignUpFactory;

public class Btvn14Aladatest extends CommonBase {
	 

	    @BeforeMethod
		public void openChrome() throws InterruptedException 
			{
				driver = initChromeDriver (CT_PageURLs.URL_Alada);
		
			}
	    
	    
	    @Test
	    public void SignUp() throws InterruptedException 
	    {
	    	
	    SignUpFactory signup = new SignUpFactory(driver);
	    signup.inputInfor("chau","qwe12@gmail.com","qwe12@gmail.com","123456","123456","0912345678");
	    assertTrue(driver.findElement(By.xpath("//span[@href='danh-sach-khoa-hoc.html']")).isDisplayed());
	    Thread.sleep(3000);
	    ProfilePageFactory profile = new ProfilePageFactory(driver);
	    profile.moveChangeInfo();
	    profile.changePassword("123456", "asdfgh", "asdfgh");
	       
	    }
	    
	  
	    
	    
}

	    
	       
	       


	

