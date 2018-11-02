package Tests;

import org.testng.annotations.Test;
import Elements.LoginPageElement;

public class LoginTest extends SetupAndTeardown{

	@Test
	public void LoginPage() throws InterruptedException {
		LoginPageElement loginObject = new LoginPageElement(driver);
		loginObject.SetEmail();
		loginObject.SetPassword();
		Thread.sleep(2000);
		loginObject.ClickLoginButton();
		
		System.out.print("Login test successful");
	}
	
	public LoginTest()  {
		// TODO Auto-generated constructor stub
	}

}
