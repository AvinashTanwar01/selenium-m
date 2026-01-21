package pagesDocument;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public WebDriver driver;    

   public BaseClass() {

  	driver= new EdgeDriver();
  }
}
