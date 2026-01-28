package Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2 {

    @Given("The user is in Login Form")
    public void step1() {
        System.out.println("The user is in Login Form");
    }

    @When("The user enters {string} in username field")
    public void step2(String name) {
        System.out.println("The user enters "+name+" in username field");
    }
    
    @And("The user enters {string} in password field")
    public void step3(String pass) {
        System.out.println("The user enters "+pass+" in password field");
    }
    
    @And("The user clicks on Login button")
    public void step4() {
        System.out.println("The user clicks on Login button");
    }
    
    @Then("The user get the status message as {string} in alert")
    public void step5(String status) {
        System.out.println("The user enters "+status+" in password field");
    }
    
    
    
    
    
	
}