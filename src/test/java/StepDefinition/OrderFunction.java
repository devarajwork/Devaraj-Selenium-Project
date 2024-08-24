package StepDefinition;

import Base.Base;
import Locators.Order;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrderFunction extends Base{
	
	Order b= new Order();
	
	@Given("Select add the item to cart")
	public void select_add_the_item_to_cart() {
	    b.addcart();
	    
	}

	@Given("Checkout the item")
	public void checkout_the_item() {
	    b.checkouticon();
		b.checkoutbutton();
	    
	    
	}

	@Given("Enter the information")
	public void enter_the_information() throws InterruptedException {
	    b.firstname("Deva");
	    b.lastname("Raj");
	    b.postalcode("1233");
	    b.continuebutton();
	}

	@Then("Finish the order")
	public void finish_the_order() throws InterruptedException {
	    b.finish();
	    
	}

	@Then("Get Thank You Screen")
	public void get_thank_you_screen() {
	    b.thanks(null);
	    
	}

}
