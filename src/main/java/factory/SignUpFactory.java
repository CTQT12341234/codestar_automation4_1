package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class SignUpFactory {


	private WebDriver driver;
	
	@FindBy (id = "txtFirstname") WebElement txtFirstname;
	
	@FindBy (id = "txtEmail") WebElement txtEmail;
	
	@FindBy (id = "txtCEmail") WebElement txtCEmail;
	
	@FindBy (id = "txtPassword") WebElement txtPassword;
	
	@FindBy (id = "txtCPassword") WebElement txtCPassword;
	
	@FindBy (id = "txtPhone") WebElement txtPhone;
	
	@FindBy (xpath = "//button[@type='submit']") WebElement btnRegister;
	
	//@FindBy(xpath = "//a[@href='https://alada.vn/tai-khoan/dang-nhap.html']")
    //WebElement btnLogin;
	
   // @FindBy(id="txtLoginUsername") WebElement txtLoginUsername;
   // @FindBy(id="txtLoginPassword") WebElement txtLoginPassword;
	
	public SignUpFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inputInfor (String name, String email, String email1, String pass, String pass1, String phone)
	{
		txtFirstname.clear();
		txtFirstname.sendKeys(name);
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtCEmail.clear();
        txtCEmail.sendKeys(email1);
        txtPassword.clear();
        txtPassword.sendKeys(pass);
        txtCPassword.clear();
        txtCPassword.sendKeys(pass1);
        txtPhone.clear();
        txtPhone.sendKeys(phone);

        btnRegister.click();
		
	}
	
	 //public void signInWithNewPass(String username, String newPass) {
	      //  btnLogin.click();

	      //  txtLoginUsername.sendKeys(username);
	       // txtLoginPassword.sendKeys(newPass);

	      //  btnSignin.click();
	  //  }
	}
	

 