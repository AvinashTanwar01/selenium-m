package runfile;

import org.testng.annotations.Test;

import junit.framework.Assert;
import lib.ExcelPage1;
import lib.Page1;
import lib.Page2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTest1 {
	WebDriver driver = new EdgeDriver();
	Page1 s1= new Page1();
	Page2 s2= new Page2();
	ExcelPage1 s3= new ExcelPage1();
//	String out="You entered: BACK_SPACE";
//  @Test
//  public void f() {
//	  s1.page1_init(driver);
//	  String expec=s1.launch();
////	  Assert.assertEquals(expec, out);
//	  System.out.println(expec);
//	  
//	  
//  }
  @Test
//  public void f1() {
//	  s2.page2_init(driver);
//	  s2.send();
//	  
//	  
//  }
  public void f2() throws IOException {
	  s3.page3_init(driver);
	  s3.launch_app();
	  s3.click_appoint();
	  s3.appoint();
  }
}
