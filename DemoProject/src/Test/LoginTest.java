package Test;



import org.testng.annotations.Test;

import Elements.LoginPageElement;

public class LoginTest  extends SetupAndTearDown{
	
	@Test
	public void login() throws InterruptedException {
		LoginPageElement loginpageobj = new LoginPageElement(driver);
		loginpageobj.setEmail();
		loginpageobj.setPassword();
		Thread.sleep(1000);
		loginpageobj.setLoginButton();
		
	}
	

	
	
	
	
	
}
