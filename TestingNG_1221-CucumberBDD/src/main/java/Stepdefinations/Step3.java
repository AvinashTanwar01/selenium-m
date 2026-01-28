package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step3 {
	@Given("I want to write a step with {string}")
    public void step1(String name) {
        System.out.println("I want to write a step with "+name);
    }

    @When("I check for the  in step {int}")
    public void step2(int num) {
        System.out.println("I check for the  in step "+num);
    }
}
