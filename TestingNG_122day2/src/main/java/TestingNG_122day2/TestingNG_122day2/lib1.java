package TestingNG_122day2.TestingNG_122day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait; import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class lib1 {
	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	
	public String launchCart() {
		driver.get("https://www.awesomeqa.com/ui/index.php?route=account/login");
		String logTitle= driver.getTitle();
		return logTitle;
	}
	public String launchCart1() {
		driver.get("https://www.google.com/?zx=1768797424751&no_sw_cr=1");
		String logTitle= driver.getTitle();
		return logTitle;
	}
//	/html/body/div[2]/div[4]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li
	public int count_links1() throws InterruptedException {
//		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[1]/div[1]/div[3]/textarea")).sendKeys("Avinash");
		Thread.sleep(1000);
		List <WebElement> links = driver.findElements(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li"));
		int linkCount= links.size();
		for(int i=0;i<linkCount;i++) {
			String names= links.get(i).getText();
			System.out.println("Searched "+i+" "+names);
		}
		Actions act = new Actions(driver);
		act.moveToElement(links.get(3)).click().build().perform();
		 
		return linkCount;
	}
		
	
	
	
	public String lOGassert(String email,String password) throws InterruptedException {
		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#input-password ")).sendKeys(password);
		driver.findElement(By.cssSelector("[type=submit]")).click();
		Thread.sleep(2000);
		return driver.getTitle();
		
//		String confirm_Mess= driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]")).getText();
		
		
//		Actions act1= new Actions(driver);
//		WebElement e3= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
//		act.moveToElement(e3).click().build().perform();
//		Thread.sleep(1000);	
	
//		String confirm_Mess1= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	}
	
	public void logOUT() throws InterruptedException {
		Actions act= new Actions(driver);
		WebElement e1= driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/i"));
		act.moveToElement(e1).click().build().perform();
		Thread.sleep(3000);
		WebElement e2= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		e2.click();
		Thread.sleep(2000);
		WebElement e4= driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]"));
		act.moveToElement(e4).click().build().perform();
//		driver.findElement(By.xpath("//a[@class='list-group-item'][13]")).click();
//		
//		driver.findElement(By.xpath("//a[@class='list-group-item'][1]")).click();
//		
	}
	public String Relogin(String email,String password) throws InterruptedException {
		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#input-password ")).sendKeys(password);
		driver.findElement(By.cssSelector("[type=submit]")).click();
		Thread.sleep(2000);
//		String confirm_Mess= driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1])")).getText();
		WebElement element = driver.findElement(By.xpath("//*[@id='account-login']/div[1]"));
		String text = element.getText();

		return text;
		
	}
	public void cont() throws InterruptedException {
		Actions act1= new Actions(driver);
		WebElement e3= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
		act1.moveToElement(e3).click().build().perform();
		Thread.sleep(1000);	
//		WebElement e4= driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]"));
//		act1.moveToElement(e4).click().build().perform();
		
	}
	
	public int count_links() {
		driver.get("https://www.amazon.in/ref=nav_logo");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		int linkCount= links.size();
		for(int i=0;i<linkCount;i++) {
			String names= links.get(i).getText();
			System.out.println("Link "+i+names);
		}
		return linkCount;
		
	}
	
	public List<String> contact_table() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> links = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr/td"));
		List<WebElement> links_headers = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));

		List<WebElement> row_size = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		List<WebElement> col_size = driver.findElements(By.xpath("//table[@id=\"customers\"]//th"));

		List<String> result = new ArrayList<>();
//		List <WebElement> links = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		System.out.println("ROWS"+row_size.size());
		System.out.println("Cols"+col_size.size());

		int linkCount= links.size();
		for(int i=0;i<linkCount;i++) {
			String names= links.get(i).getText();
			if(names.equals("Italy")) {
				System.out.println("Italy Found");
			}
			System.out.println("Contact: "+i+" "+names);
//			result.add(names);
		}
		
		int headcounts= links_headers.size();
		for (int i = 0; i < headcounts; i++) { 
			result.add(links_headers.get(i).getText()); 
		}
		return result ;
	}
	
	public List<WebElement> drop_amazon() throws InterruptedException {
		    driver.get("https://www.amazon.in/ref=nav_logo");
		    
		    WebElement sel_data = driver.findElement(By.cssSelector("#searchDropdownBox"));
		    Select drop_data = new Select(sel_data);
		    List<WebElement> options = drop_data.getOptions();
		    for (int i=0;i<options.size();i++) {
		    	String opt =options.get(i).getText(); 
		    	 
		        System.out.println(opt);
		    }

		    drop_data.selectByIndex(1);
		    System.out.println("Selected by index: " + options.get(1).getText()); 
		    Thread.sleep(1000); 
		    drop_data.selectByValue("search-alias=baby");
		    System.out.println("Selected by value: baby");
		    Thread.sleep(1000); 
		    drop_data.selectByVisibleText("Books"); 
		    Thread.sleep(1000);
		    drop_data.selectByVisibleText("Books");
		    return options;
		    

	}
	
	public String Alert() throws InterruptedException {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement user= driver.findElement(By.id("login1"));
		user.sendKeys("get@gmail.com");
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("g");
		    WebElement submit = driver.findElement(By.className("signin-btn"));
		    submit.click();		 
		    Alert act = driver.switchTo().alert();
		    String act_alert = act.getText();
		    return act_alert;
	}
	
//	public String logINVALID(String email, String password) throws InterruptedException { 
//		driver.findElement(By.cssSelector("#input-email")).sendKeys(email); 
//		driver.findElement(By.cssSelector("#input-password")).sendKeys(password); 
//		driver.findElement(By.cssSelector("[type=submit]")).click();
//		Thread.sleep(2000);
//		String confirm_Mess= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//		return confirm_Mess;
//		}

}
