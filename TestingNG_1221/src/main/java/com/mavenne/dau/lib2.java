package com.mavenne.dau;

import org.openqa.selenium.WebDriver;

public class lib2 {
	WebDriver driver;
	
	public void init1(WebDriver driver) {
		this.driver= driver;
	}
	
	public void maximize() {
		driver.manage().window().maximize();
		}

	public void delete() {
		driver.manage().deleteAllCookies();
		}
	
	public void navBack() {
//		driver.navigate().forward();
		driver.navigate().back();
		}
	
	public String datas() {
		String n = driver.getPageSource();
		return n;
	}

}
