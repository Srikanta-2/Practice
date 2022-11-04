package step_definations;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class multiplication{
	
	
	 @Given("^user navigates to Login page$")
	    public void user_navigates_to_login_page() throws Throwable {
	        System.out.println("landing login page");
	    }

	 @When("^I enter correct \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_enter_correct_something_and_something(String username, String password) throws Throwable {
		 System.out.println(username+""+password);
	    }

	    @Then("^login should be successful$")
	    public void login_should_be_successful() throws Throwable {
	    	 System.out.println("login successfully");
	    }

	    @Given("^given url is present$")
	    public void given_url_is_present() throws Throwable {
	    	 System.out.println("url exists");
	    }

	    @When("^running url in browser$")
	    public void running_url_in_browser() throws Throwable {
	    	 System.out.println("running url in browser");
	    }

	    @Then("^url open successfully$")
	    public void url_open_successfully() throws Throwable {
	    	 System.out.println("url open successfully");
	    }
	    
	
}