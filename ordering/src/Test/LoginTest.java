package Test;

import org.testng.annotations.Test;

import Element.DashboardElement;
import Element.LoginElement;

public class LoginTest extends Setup{
	
	//-----login page----//
	@Test
	public void Loginfunction() throws InterruptedException{
		LoginElement object= new LoginElement(mdriver);
		object.Logincredential();
	    dashboard();
		
	}
	
	//-----Dashboard----//
	
	public void dashboard() throws InterruptedException {
		DashboardElement dashobj= new DashboardElement(mdriver);
		dashobj.Dashboard();
	}

	

}
