package librun;

import org.testng.annotations.Test;

import exceldata.Page1;
import exceldata.Page2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTestEXCEL {
	WebDriver driver = new EdgeDriver();
	Page1 s1= new Page1();
	Page2 s2= new Page2();
  @Test
  public void f() {
	  s1.page1_init(driver);
	  s1.launch_app();
	  s1.click_appoint();
	  
  }
  @Test
  public void f1() throws IOException {
	  s2.page2_init(driver);
	  s2.login_fun();
	  
  }
}
