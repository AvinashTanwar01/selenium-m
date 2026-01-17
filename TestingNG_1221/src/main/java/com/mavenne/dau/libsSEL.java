package com.mavenne.dau;

import org.openqa.selenium.WebDriver;

public class libsSEL {
	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver= driver;
	}
	
	public void InvokeAwesomeQA() {
		driver.get("https://www.awesomeqa.com/ui");
	}
	
	public String Awesome_PageTitle() {
		String title= driver.getTitle();
		return title;
	}
}
