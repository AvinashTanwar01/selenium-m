package libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait; import org.openqa.selenium.support.ui.ExpectedConditions; import java.time.Duration;
import java.util.List;

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
	
	public String lOGassert(String email,String password) throws InterruptedException {
		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#input-password ")).sendKeys(password);
		driver.findElement(By.cssSelector("[type=submit]")).click();
		Thread.sleep(2000);
		String confirm_Mess= driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]")).getText();
		
		
//		Actions act1= new Actions(driver);
//		WebElement e3= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
//		act.moveToElement(e3).click().build().perform();
//		Thread.sleep(1000);	
	
//		String confirm_Mess1= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		return confirm_Mess;
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
	
//	public String logINVALID(String email, String password) throws InterruptedException { 
//		driver.findElement(By.cssSelector("#input-email")).sendKeys(email); 
//		driver.findElement(By.cssSelector("#input-password")).sendKeys(password); 
//		driver.findElement(By.cssSelector("[type=submit]")).click();
//		Thread.sleep(2000);
//		String confirm_Mess= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
//		return confirm_Mess;
//		}

}
