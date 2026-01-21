package exceldata;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page2 {
//	public void getData
 

//	Properties p = new Properties();
	public WebDriver driver;
	excelread obj = new excelread();
	public void page2_init(WebDriver driver) {
		this.driver= driver;
	}
	
	By user=By.xpath("//*[@id=\"txt-username\"]");
	By pass=By.xpath("//*[@id=\"txt-password\"]");
	By button=By.xpath("//*[@id=\"btn-login\"]");
	
	public void login_fun() throws IOException {
//		FileInputStream fi= new FileInputStream("./TestData/data1.xlsx");
		
//		fr = new FileReader("C:\\Users\\avinash.tanwar\\eclipse-workspace\\TestingNG_1221-documentation\\TestData\\data1.properties");
//		p.load(fr);
//		System.out.println("p data"+p);
		String UserData= obj.excelRCD(0, 0);
		String PassData= obj.excelRCD(0, 1);
		System.out.println(UserData+" "+ PassData);

		driver.findElement(user).sendKeys(UserData);
		driver.findElement(pass).sendKeys(PassData);
		driver.findElement(button).click();
	}
}
