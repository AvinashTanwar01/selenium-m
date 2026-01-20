package pagesDocument;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page3 {
	public WebDriver driver;
//	public void page3_init(WebDriver driver) {
//		this.driver= driver;
//	}
	
	By bod= By.xpath("//*[@id=\"txt_visit_date\"]");
	By check= By.xpath("//*[@id=\"appointment\"]/div/div/form/div[2]/div/label");
	By textarea = By.xpath("//*[@id=\"txt_comment\"]");
	By btn = By.xpath("//*[@id=\"btn-book-appointment\"]");
	By assertCheck = By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2");
	public String bod(WebDriver driver) {
		driver.findElement(check).click();
		driver.findElement(bod).sendKeys("20/01/2026");
		
		driver.findElement(textarea).sendKeys("It was good app");
		driver.findElement(btn).click();
		String asse=driver.findElement(assertCheck).getText();
		return asse;
		
		
	}

}
