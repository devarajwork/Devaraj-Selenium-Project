package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Order extends Base{
	public Order() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[contains(@class,'btn btn_primary')])[1]")
	public static WebElement Addtocart;
	
	@FindBy(className = "shopping_cart_badge")
	public static WebElement Batch;
	
	@FindBy(id = "checkout")
	public static WebElement Checkout;
	
	@FindBy(xpath = "(//input[@class='input_error form_input'])[1]")
	public static WebElement FirstName;
	
	@FindBy(id ="last-name")
	public static WebElement LastName;
	
	@FindBy(id ="postal-code")
	public static WebElement PinCode;
	
	@FindBy(id ="continue")
	public static WebElement Continue;
	
	@FindBy(name  ="finish")
	public static WebElement Finish;
	
	@FindBy(tagName =    "h2")
	public static WebElement Thanks ;
	
	
	public void addcart() {
		implicitlyWait(20);
		click(Addtocart);
	}
	public void checkouticon() {
		implicitlyWait(20);
		click(Batch);
	}
	
	public void checkoutbutton() {
		implicitlyWait(20);
		click(Checkout);
	}
	public void firstname(String first) throws InterruptedException {
		implicitlyWait(20);
		click(FirstName);
		waittime(1000);
		sendkeys(FirstName, first);
	}
	public void lastname(String last) {
		implicitlyWait(20);
		click(LastName);
		sendkeys(LastName, last);
}
	
	public void postalcode(String string) {
		implicitlyWait(20);
		click(PinCode);
		sendkeys(PinCode, string);
	}
	
	
		
	public void continuebutton() throws InterruptedException {
		waittime(1000);
		click(Continue);
	}
	public void finish() throws InterruptedException {
		waittime(1000);
		click(Finish);
	}
	public void thanks(String actual) {
		implicitlyWait(20);
	gettext(Thanks);
				
	}
	
}
