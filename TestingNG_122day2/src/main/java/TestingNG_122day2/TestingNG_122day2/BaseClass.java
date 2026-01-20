package TestingNG_122day2.TestingNG_122day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    public WebDriver driver;

    
//    public BaseClass(WebDriver driver) {
////    	this.driver=driver;
//    	driver= new ChromeDriver();
//    }

    public BaseClass() {
//        this.driver = null;
    	driver= new EdgeDriver();
    }
}
