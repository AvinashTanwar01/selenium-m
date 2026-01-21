package lib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelPage1 {
	public WebDriver driver;
	public void page3_init(WebDriver driver) {
		this.driver = driver;		
	}
	ExcelRead obj = new ExcelRead();
	By heading = By.xpath("//*[@id=\"top\"]/div/h1");
	By appoint = By.xpath("//*[@id=\"btn-make-appointment\"]");
	By user=By.xpath("//*[@id=\"txt-username\"]");
	By pass=By.xpath("//*[@id=\"txt-password\"]");
	By button=By.xpath("//*[@id=\"btn-login\"]");
	
	public void launch_app(){
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(heading);
		if(driver.findElement(heading).isDisplayed()) {
			System.out.println("Head Found");
		}else {
			System.out.println("Head Not Found");
		}		
		
	}
	public void click_appoint() {
		if(driver.findElement(appoint).isDisplayed()) {
			System.out.println("Button Found");
			driver.findElement(appoint).click();
		}else {
			System.out.println("Button Not Found");
		}	
	}
	public void appoint() throws IOException {
	String UserData= obj.excelRCD(0, 0);
	String PassData= obj.excelRCD(0, 1);
	System.out.println(UserData+" "+ PassData);

	driver.findElement(user).sendKeys(UserData);
	driver.findElement(pass).sendKeys(PassData);
	driver.findElement(button).click();
	}
}
