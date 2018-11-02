package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Setup {
	public WebDriver mdriver;
    
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		mdriver = new ChromeDriver();
		mdriver.manage().window().maximize();
		Thread.sleep(2000);
		mdriver.get("https://qa.ordering-ko.ekbana.info/system/login");
		Thread.sleep(5000);
		System.out.println("successfull");
		
	}
	
	@AfterMethod
	public void BrowserQuit() throws InterruptedException {
		Thread.sleep(3000);
		mdriver.quit();
	}

}
