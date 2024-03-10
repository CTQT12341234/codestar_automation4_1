package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePageFactory  
	{
	private WebDriver driver;
	
    	@FindBy(xpath="//div[@class='avatar2']") WebElement avatar;
    	@FindBy(xpath ="//a[@href='https://alada.vn/thong-tin-ca-nhan']") WebElement changeInfor;
	    @FindBy(id="txtpassword") WebElement txtPassword;
	    @FindBy(id="txtnewpass") WebElement txtnewpass;
	    @FindBy(id="txtrenewpass") WebElement txtrenewpass;

	    @FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
	    WebElement btnSave;

	    @FindBy(xpath = "//a[@href='https://alada.vn/tai-khoan/dang-xuat.html']")
	    WebElement btnSignOut;

	    public ProfilePageFactory(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

	    public void moveChangeInfo() {
	    	avatar.click();
			changeInfor.click();
		}
	    
	    public void changePassword(String oldPass, String newPass, String newPass1)
	    {
	    	txtPassword.sendKeys(oldPass);
	    	txtnewpass.sendKeys(newPass);
	    	txtrenewpass.sendKeys(newPass1);
	    	btnSave.click();
	 
	    }

//	    public void signOut()
//	    {
//	    	avatar.click();
//	    	btnSignOut.click();
//	    }
	}
	

