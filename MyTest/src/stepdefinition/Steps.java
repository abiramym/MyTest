package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^Open the firefox and launch application$")
	public void Open_the_firefox_and_launch_application(){
		System.out.println("This step Open the firefox and launch application");
	}
	
	@When("^Enter the usernam and password$")
	public void Enter_the_usernam_and_password(){
		System.out.println("This step Enter the usernam and password");
	}
	
	@Then("^Reset the credential$")
	public void Reset_the_credential(){
		System.out.println("This step Reset the credential");
	}

}
