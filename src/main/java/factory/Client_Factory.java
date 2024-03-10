package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_Factory {
	
	private WebDriver driver;
	
	
@FindBy(xpath = "//span[text()='Clients']") WebElement clientMenu;
@FindBy(xpath = "//a[text()=' Add client']") WebElement btnAddClient;
@FindBy(id = "type_person") WebElement radioPerson;
@FindBy(id = "company_name") WebElement txtCompany;
@FindBy(id = "disable_online_payment") WebElement checkboxonlinePayment;
@FindBy(xpath = "//button[text()=' Save']") WebElement btnSave;
@FindBy(xpath = "//a[text()='Clients']") WebElement clientTab;
@FindBy(xpath = "//div[@id='client-table_filter']//input[@placeholder='Search']") WebElement txtSearch;

public Client_Factory (WebDriver commonDriver) 
{
this.driver = commonDriver;
PageFactory.initElements(driver, this);

}


public void AddClient (String company) throws InterruptedException 
{
clientMenu.click();
btnAddClient.click();
Thread.sleep(3000);
radioPerson.click();
txtCompany.sendKeys(company);
if (checkboxonlinePayment.isDisplayed()== true && checkboxonlinePayment.isSelected() == false)
	{
	checkboxonlinePayment.click();
	}
Thread.sleep(3000);
btnSave.click();
Thread.sleep(3000);
clientTab.click();
Thread.sleep(3000);
txtSearch.sendKeys(company);

}


}



