package factory;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import page.LoginPage;

public class TechPageFactory {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//a[@id='one-way-tab']") WebElement radiobutton1;
	@FindBy (xpath = "//a[@id='round-trip-tab']") WebElement radiobutton2;
	@FindBy (xpath = "//a[@id='multi-city-tab']") WebElement radiobutton3;
	
	
	@FindBy (xpath = "(//label[text()='Flying from']/following-sibling::div//input[@placeholder='City or airport'])[1]") 
	WebElement txtFlyFrom;
	@FindBy (xpath = "(//label[text()='Flying to']/following-sibling::div//input[@placeholder='City or airport'])[1]") 
	WebElement txtFlyto;
	@FindBy (xpath = "(//label[text()='Departing']/following-sibling::div//input[@name='daterange-single'])[1]")
	WebElement datePicker;
//	@FindBy (xpath = "(//a[@class='dropdown-toggle dropdown-btn'])[1]")
//	WebElement passenger; 
	
	//@FindBy (xpath = "(//div[@class='form-group select-contain w-auto'])[1]") WebElement selectCoach;
	
	
   
    //WebElement coachDropdown = driver.findElement(By.xpath("//div[@class='form-group select-contain w-auto'])[1]")); 



    
//	@FindBy (xpath = "(//label[text()='Passengers']/following-sibling::div//div[@class = 'qtyInc'])[1]")
//	WebElement numberofPassengers;
	@FindBy (xpath = "(//div[text()='Business'])[1]") WebElement selectCoach;
	@FindBy (xpath = "(//a[text()='Search Now'])[1]") WebElement btnSearch;
	
	public TechPageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CheckRadioButton()
	{
		radiobutton1.click();
		
		//assertTrue((radiobutton1).isSelected());
		
	}
	
	public void InputDestination(String name, String name1)
	{
		txtFlyFrom.clear();
		txtFlyFrom.sendKeys(name);
		txtFlyto.clear();
		txtFlyto.sendKeys(name1);
	}
	
	public void HandleDatePicker() 
	{
	//WebElement datePicker = driver.findElement(By.xpath("(//label[text()='Departing']/following-sibling::div//input[@name='daterange-single'])[1]"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].removeAttribute('readonly','readonly')",  datePicker);
			datePicker.clear();
			datePicker.sendKeys("30032024");
			datePicker.sendKeys(Keys.TAB); 
	 
	}
	
	public void Search() 
	{
	 
	 btnSearch.click();

	 
	}
//	public void NumberofPassenger() 
//	{
//			
//			passenger.clear();
//			datePicker.sendKeys("30032024");
//			datePicker.sendKeys(Keys.TAB); 
//	 
//	}
//	

	public void SelectCoach()
	{
		selectCoach.click();
//		//WebElement dropdown = driver.findElement(By.xpath("//div[@class='form-group select-contain w-auto']//select[@class='select-contain-select']"));
//		WebElement dropdown = driver.findElement(By.name("//dropdown bootstrap-select select-contain-select show"));
//        // Use the Select class to interact with the dropdown
//        Select select = new Select(dropdown);
//        List<WebElement> lst = select.getOptions();
//
//        // Select the "Business" option by visible text
//        select.selectByValue("2");
		
		
	}
}
