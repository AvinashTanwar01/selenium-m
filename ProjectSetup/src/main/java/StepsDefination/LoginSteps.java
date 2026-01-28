package StepsDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mainpack.ExcelRead;



public class LoginSteps {
		WebDriver driver;
		ExcelRead obj = new ExcelRead();
		@Given("The user must be in chrome Broswer")
		public void preSetup() {
			driver = new ChromeDriver();
		}
		
		@Given("the user is in signup page")
		public  void the_user_is_in_signup_page() {
			String baseURL= "https://www.bookswagon.com/login?=signup#";
			driver.get(baseURL);
			driver.manage().window().maximize();
		}
		
		@And("User has entered the resgriration feilds")
		public void user_has_entered_the_resgriration_feilds() throws IOException {
			String userName =obj.excelRCD(0, 0);
			WebElement nameF= driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtName\"]"));
			nameF.sendKeys(userName);
			String actual = nameF.getAttribute("value");
			String PassData= obj.excelRCD(0, 1);
			WebElement phoneF = driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtEmail\"]"));
			phoneF.sendKeys(PassData);
			String actual2 = phoneF.getAttribute("value");

//			Assert.assertTrue(actual.length()<45);
			String status= null;
			if(actual.length()<45 && actual2.length()<10 ) {
				status="Pass";
				obj.insertData1(0, 2, status);
			}else {
				status="fail";
				obj.insertData1(0, 2, status);
			}
		}
		
		@And("user checks captcha")
		public void user_checks_captcha() throws InterruptedException {
			WebElement captchaF = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
			captchaF.click();
			Thread.sleep(600000);
		}
		
		@And("user clicks on continue")
		public void user_clicks_on_continue() {
			//*[@id="ctl00_phBody_SignUp_btnContinue"]
			WebElement clickF = driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_btnContinue\"]"));
			clickF.click();
		}
		@Then("user sees otp mobile")
		public void user_sees_otp_mobile() {
			
		}
		
		
}
