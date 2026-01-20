package LibRun;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pagesDocument.BaseClass;
import pagesDocument.page1;
import pagesDocument.page2;
import pagesDocument.page3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class runDoucment extends BaseClass {
	
	public runDoucment() {
		super();
	}
//	WebDriver driver = new EdgeDriver();
	page1 s1 = new page1();
	page2 s2 = new page2();
	page3 s3= new page3();
	String expec="Appointment Confirmation";
  @Test
  public void f1() {
//	  s1.page1_init(driver);
	  s1.launch_app(driver);
	  s1.click_appoint(driver);
  }
  @Test
  public void f2() throws IOException {
//	  s2.page2_init(driver);
	  s2.login_fun(driver);
  }
  @Test
  public void f3() {
//	  s3.page3_init(driver);
	  String a=s3.bod(driver);
	  Assert.assertEquals(a, expec);
	  
  }

  
  
}
