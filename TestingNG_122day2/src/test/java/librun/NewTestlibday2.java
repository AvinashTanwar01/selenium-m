package librun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestingNG_122day2.TestingNG_122day2.BaseClass;
import TestingNG_122day2.TestingNG_122day2.LibDay2_2;

public class NewTestlibday2 extends BaseClass{
//	private static WebDriver driver;
//	public WebDriver driver;

	public NewTestlibday2( ) {
		super();
	}

    @Test
    public void f() {
  
    	System.out.println(driver);
        LibDay2_2 libr= new LibDay2_2();
//        LibDay2_2 libr= new LibDay2_2(driver); if called  as constructor in libday2


        String title = libr.LaunchLogin(driver);
        System.out.println("Page Title: " + title);

//        driver.quit();
    }
}
