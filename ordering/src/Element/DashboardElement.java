package Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardElement {
	WebDriver driver;

	public DashboardElement(WebDriver paramdvr) {
		PageFactory.initElements(paramdvr, this);
		this.driver= paramdvr;
	}
	//---sub menu product----//
	@FindBy(xpath="//a[@title='Product']")
	WebElement Product;
	
	@FindBy(xpath="//a[@class='sfActive']")
	//@FindBy(xpath="//a[@href='https://qa.ordering-ko.ekbana.info/system/productCategory']")
	WebElement Productcat;
	
	//------logout----//
	@FindBy(xpath="//i[@class='glyph-icon icon-angle-down']")
	WebElement TopRightDropdown;
	
	//@FindBy(xpath="//a[@class='btn display-block font-normal btn-danger']")
	//WebElement Logout;
	
	public void Dashboard() throws InterruptedException {
		System.out.println("Dashboard open success");
		Product.click();
		Thread.sleep(5000);
		
		Productcat.click();
		System.out.println("product catagory open success");
		Thread.sleep(2000);
		TopRightDropdown.click();
		//Logout.click();
		//System.out.println("Logout success");
	}
}
