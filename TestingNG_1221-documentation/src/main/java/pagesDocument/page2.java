package pagesDocument;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page2 {
	FileReader fr;
	Properties p = new Properties();
	public WebDriver driver;
//	public void page2_init(WebDriver driver) {
//		this.driver= driver;
//	}
	
	By user=By.xpath("//*[@id=\"txt-username\"]");
	By pass=By.xpath("//*[@id=\"txt-password\"]");
	By button=By.xpath("//*[@id=\"btn-login\"]");
	
	public void login_fun(WebDriver driver) throws IOException {
		fr = new FileReader("C:\\Users\\avinash.tanwar\\eclipse-workspace\\TestingNG_1221-documentation\\TestData\\data1.properties");
		p.load(fr);
		System.out.println("p data"+p);
		driver.findElement(user).sendKeys(p.getProperty("username"));
		driver.findElement(pass).sendKeys(p.getProperty("pass"));
		driver.findElement(button).click();
	}
	

}
