package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
 WebDriver dvr;
 public LoginPageElement(  WebDriver paramdvr){
	 PageFactory.initElements(paramdvr, this);
     this.dvr = paramdvr;
 }
 @FindBy(xpath="//input[@placeholder='Enter Your Username']")
	WebElement 	UsernameFieldElement;
	
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	WebElement PasswordFieldElement;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButtonElement;

	public void SetUsername(){
		UsernameFieldElement.sendKeys("admin");
	}
	public void SetPassword(){
		PasswordFieldElement.sendKeys("123admin@");
	}
	public void ClickLoginButton() {
     LoginButtonElement.click();
 }
}


