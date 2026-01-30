package pagesDocument;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static WebDriver driver;
    private final Properties prop = new Properties();

    public BaseClass() {
 
        try {
            FileReader fr = new FileReader(
                "C:\\Users\\avinash.tanwar\\eclipse-workspace\\SeleniumTrainningProject\\data\\data1.properties"
            );
            prop.load(fr);

            String browser = prop.getProperty("Browser", "Chrome");

            switch (browser) {
                case "Chrome":
                    driver = new ChromeDriver();
                    break;
                case "FireFox":
                case "Firefox":
                    driver = new FirefoxDriver();
                    break;
                case "Edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    driver = new ChromeDriver();
                    break;
            }

            driver.manage().window().maximize();
        } catch (Exception e) {
            // If anything fails, fall back to Chrome
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }
}