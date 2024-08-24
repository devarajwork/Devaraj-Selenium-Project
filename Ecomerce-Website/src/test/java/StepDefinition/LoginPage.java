package StepDefinition;



import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Locators.*;
public class LoginPage extends  Base {

	     Login a= new Login();
	     
		@Given("Enter the User Name {string}")
		public void enter_the_user_name(String UserName) throws InterruptedException {
			 a.username(UserName);
		    
		}

		@When("Enter the Password {string}")
		public void enter_the_password(String Password) {
		    a.password(Password);
		    
		}

		@Then("Tap login button")
		public void tap_login_button() throws InterruptedException {
		    a.login(null);
		    
		}


	}

