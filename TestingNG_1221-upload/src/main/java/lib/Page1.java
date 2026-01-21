package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page1 {
	public WebDriver driver;
	public void page1_init(WebDriver driver) {
		this.driver=driver;
	}
	
	By btn = By.xpath("//*[@id=\"content\"]/div/div/div/input");
//	By out= By.xpath("//*[@id=\"result\"]");
		public String launch() {
		driver.get("https://the-internet.herokuapp.com/inputs");
		String num=String.valueOf(1234);
		driver.findElement(btn).sendKeys(num);
//		String res= driver.findElement(out).getText();
		return num;
		
		
	}

}
