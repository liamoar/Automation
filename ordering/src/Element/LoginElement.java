package Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class LoginElement {
	WebDriver driver;

	public LoginElement(WebDriver paramdvr) {
		PageFactory.initElements(paramdvr, this);
		this.driver= paramdvr;
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement Loginuser;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Loginpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Loginbutton;
	
	public void Logincredential() throws InterruptedException {
		
		Loginuser.sendKeys("admin");
		Thread.sleep(2000);
		Loginpassword.sendKeys("123admin@");
		Loginbutton.click();
	}
	
}
