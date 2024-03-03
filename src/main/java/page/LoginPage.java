package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.CT_Account;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver commonDriver) 
	{
		this.driver = commonDriver;
		
	}
	
	public void LoginFunction(String email, String pass)
	
	{
		WebElement textEmail = driver.findElement(CT_Account.TEXTBOX_EMAIL);
		
		if (textEmail.isDisplayed())
		{
			textEmail.clear();
			textEmail.sendKeys(email);
			
		}
		
		WebElement textPass = driver.findElement(CT_Account.TEXTBOX_PASS);
		
		if (textPass.isDisplayed())
		{
			textPass.clear();
			textPass.sendKeys(pass);
			
		}
		
		WebElement btnSignin = driver.findElement(CT_Account.BUTTON_SIGNIN);
		
		if (btnSignin .isDisplayed())
		{
			btnSignin.click();
			
		}
		 
		
	}
}
