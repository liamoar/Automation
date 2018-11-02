package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
	WebDriver dvr;
	public LoginPageElement(WebDriver paramdvr)
	{
		PageFactory.initElements(paramdvr,this);
		this.dvr = paramdvr;
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement EmailFieldElement;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement PasswordFieldElement;
	 
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButtonElement;
	 
	public void setEmail() {
		EmailFieldElement.sendKeys("admin");
	}
	public void setPassword() {
		PasswordFieldElement.sendKeys("123admin@");
	}
	
	public void setLoginButton() {
		LoginButtonElement.click();
	}
	
	
}
