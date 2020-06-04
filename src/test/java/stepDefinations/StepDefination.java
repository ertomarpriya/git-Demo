package stepDefinations;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;

public class StepDefination {
	

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	
    	System.out.println("page Land");
    }
    
    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("Validate");

    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Triggered");

    }


    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Started");

    }


    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
   System.out.println(strArg1);
   System.out.println(strArg2);

    }

  

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	System.out.println("Homepage");
    }

    @And("^Cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }
   
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	System.out.println("Signup");
    }
	
  
    @When("^User login into application into username (.+) and password (.+)$")
    public void user_login_into_application_into_username_and_password(String username, String password) throws Throwable {
  System.out.println(username);
  System.out.println(password);

    }
}
