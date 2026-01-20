package TestingNG_122day2.TestingNG_122day2;

import org.openqa.selenium.WebDriver;

public class LibDay2_2{
	public  WebDriver driver;


//call here if u want to assign to all methods inside this file
//    public LibDay2_2(WebDriver driver) {
//    	this.driver=driver;
//    	
//    }


    public String LaunchLogin(WebDriver driver) {
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        return driver.getTitle();
    }
}
