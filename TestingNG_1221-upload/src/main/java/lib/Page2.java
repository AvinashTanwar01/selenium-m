package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page2 {
	public WebDriver driver;
	public void page2_init(WebDriver driver) {
		this.driver=driver;
	}
	By btn = By.xpath("//*[@id=\"file1\"]");
	public void send() {
		driver.get("https://www.pdfgear.com/word-to-pdf/");
		driver.findElement(btn).sendKeys("C:\\Users\\avinash.tanwar\\eclipse-workspace\\TestingNG_1221-upload\\data\\cucumber-eclipse-plugin-downlod- For internally restricted netwok.doc");
		
		
	}

}
