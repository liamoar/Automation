package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SetupAndTeardown {
	
	public WebDriver driver;
	@BeforeMethod	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver2.40.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.ordering-ko.ekbana.info/system/login");
		
	}
	
	
	public SetupAndTeardown() {
		// TODO Auto-generated constructor stub
	}

}
