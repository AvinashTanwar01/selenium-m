package com.run.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.mavenne.dau.lib2;
import com.mavenne.dau.libsSEL;

public class backnav {
	WebDriver driver = new ChromeDriver();
	  libsSEL s1= new libsSEL();
	  lib2 s2= new lib2();
  @Test(priority=1)    
  public void NavbackTest(){
		  s1.init(driver);
		  s1.InvokeAwesomeQA();
		  s2.init1(driver);
//		  s2.navBack();
//	  s2.init1(driver);
	  String page= s2.datas();
	  System.out.println(page);
	  
	  
		  
  }
}
