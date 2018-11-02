package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
	
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement UsernameFieldElement;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement PasswordFieldElement;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButtonElement;
	
	public void SetEmail()	{
		UsernameFieldElement.sendKeys("admin");
	}
		    
    public void SetPassword() {
        PasswordFieldElement.sendKeys("123admin@");
    }
    
    public void ClickLoginButton() {
        LoginButtonElement.click();
    }
	
    WebDriver dvr;
	public LoginPageElement(WebDriver paramdvr) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(paramdvr, this);
        this.dvr = paramdvr;
	}
	
}
