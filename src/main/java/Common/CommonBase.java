package Common;


import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class CommonBase {
	public WebDriver driver;

	public WebDriver initChromeDriver(String URL)throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		// Đợi trong vòng 30 giây cho tới khi trang web load thành công
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		return driver;
}
}

