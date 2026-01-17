package com.run.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.mavenne.dau.lib2;
import com.mavenne.dau.libsSEL;

import junit.framework.Assert;

public class NewTestlib {
	WebDriver driver = new ChromeDriver();
	libsSEL pg1 = new libsSEL();
	lib2 pg2= new lib2();
	String assertreq = "Your Store";
  @Test(priority=1)
  public void InvokeApp_Awesome() {
	  pg1.init(driver);
	  pg1.InvokeAwesomeQA();
//	  String home=pg1.Awesome_PageTitle();
  }
  @Test(priority=2)
//  @Test
  public void Fetch() {
	  String home=pg1.Awesome_PageTitle();
	  System.out.println(home);
	  
	  Assert.assertEquals(home, assertreq);
  }
//  @Test(priority=3)
  @Test
  public void Maximum() {
      pg2.init1(driver);
	  pg2.maximize();
//	  pg2.navBack();
  }
//  @Test(priority=4)
  @Test
  public void del() {
//	  pg2.init1(driver);
	  pg2.delete();
  }
  
}
