package Test;

import org.testng.annotations.Test;


import Elements.LoginPageElement;

public class LoginTest extends SetUpAndTearDown {
	 @Test
	 public void LoginPage() throws InterruptedException {
			LoginPageElement LoginObject= new LoginPageElement(driver);
			LoginObject.SetUsername();
			LoginObject.SetPassword();
			Thread.sleep(2000);
			LoginObject.ClickLoginButton();
			System.out.println("LogIn test");
		 }

	

	}