package com.new1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTestJava {
	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	        WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.selenium.dev");
	        driver1.quit();
	    }
}
