package pagesDocument;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page1 {
	public WebDriver driver;
	
//	public void page1_init(WebDriver driver) {
//		this.driver = driver;		
//	}
	By heading = By.xpath("//*[@id=\"top\"]/div/h1");
	By appoint = By.xpath("//*[@id=\"btn-make-appointment\"]");
	
	public void launch_app(WebDriver driver){
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(heading);
		if(driver.findElement(heading).isDisplayed()) {
			System.out.println("Head Found");
		}else {
			System.out.println("Head Not Found");
		}		
		
	}
	public void click_appoint(WebDriver driver) {
		if(driver.findElement(appoint).isDisplayed()) {
			System.out.println("Button Found");
			driver.findElement(appoint).click();
		}else {
			System.out.println("Button Not Found");
		}	
	}
}
