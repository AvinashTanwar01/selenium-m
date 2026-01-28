package Stepdefinations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class Stepdefinition1{
	WebDriver driver;
	@Given("the user must be in chrome browser")
	public void TesSetup() {
	driver = new ChromeDriver();
	}

	 @Given("The user is in cucumber.io homepage")
	 public void The_user_is_in_cucumberio_homepage(){
		 String baseUrl= "https://cucumber.io/";
		 driver.get(baseUrl);
	 }
	 @When("The user clicks on Documentation link")
	 public void The_user_clicks_on_Documentation_link() {
		 WebElement docLink= driver.findElement(By.xpath("//*[@id=\"__docusaurus\"]/nav/div[1]/div[1]/a[2]"));
		 docLink.click();
	 }
	 @Then("The user can view the page content with What is Cucumber?")
	 public void The_user_can_view_the_page_content_with_What_is_Cucumber(){
		 WebElement extractedData = driver.findElement(By.xpath("//*[@id=\"what-is-cucumber\"]"));
		 String data1= extractedData.getText();
	 }
}
